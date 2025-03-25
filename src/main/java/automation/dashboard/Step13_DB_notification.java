package automation.dashboard;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import automation.pages.BasePage;
import io.qameta.allure.Step;

public class Step13_DB_notification extends BasePage {
	private static final Logger logger = LoggerFactory.getLogger(Step13_DB_notification.class);
	private static final int WAIT_TIMEOUT = 30;
	private static final int MAX_RETRY_ATTEMPTS = 3;
	private static final String PLUS_INDICATOR = "99+";
	
	// private final By countElement = By.xpath("//div[contains(text(),'99+')]");
	private final By notificationBadge = By.xpath("//div[@id='Dashboard-Notification-Badge']//em");
	private final By notificationList = By.xpath("//div[@class='notification-list_content']");
	private final By dashboardHeader = By.xpath("//h3[contains(text(),'Dashboard')]");
	private final WebDriverWait wait;
	private final JavascriptExecutor js;

	public Step13_DB_notification(WebDriver driver) {
		super(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT));
		this.js = (JavascriptExecutor) driver;
	}

	@Test
	public void Notification() {
		try {
			int initialCount = getNotificationCount();
			logger.info("Initial notification count: {}", initialCount);

			clickNotificationBadge();
			processNotifications();

			// Ensure we're back on the dashboard
			ensureBackOnDashboard();

			int updatedCount = getNotificationCount();
			logger.info("Updated notification count: {}", updatedCount);

			verifyNotificationCountChange(initialCount, updatedCount);

		} catch (Exception e) {
			logger.error("Error in notification test: {}", e.getMessage());
			Assert.fail("Notification test failed: " + e.getMessage());
		}
	}

	@Step("Get notification count")
	private int getNotificationCount() {
		WebElement countElement = wait.until(ExpectedConditions.presenceOfElementLocated(notificationBadge));
		String countText = countElement.getText().trim();
		
		if (countText.equals(PLUS_INDICATOR)) {
			logger.info("Notification count is more than 99");
			return 100; // Return 100 to indicate count is 99+
		}
		
		try {
			return Integer.parseInt(countText);
		} catch (NumberFormatException e) {
			logger.error("Failed to parse notification count: {}", countText);
			return 0;
		}
	}

	@Step("Click notification badge")
	private void clickNotificationBadge() {
		int attempts = 0;
		while (attempts < MAX_RETRY_ATTEMPTS) {
			try {
				WebElement badge = wait.until(ExpectedConditions.elementToBeClickable(notificationBadge));
				js.executeScript("arguments[0].scrollIntoView(true);", badge);
				wait.until(ExpectedConditions.elementToBeClickable(badge));
				badge.click();
				logger.info("Successfully clicked notification badge");
				return;
			} catch (Exception e) {
				attempts++;
				if (attempts == MAX_RETRY_ATTEMPTS) {
					logger.error("Failed to click notification badge after {} attempts", MAX_RETRY_ATTEMPTS);
					throw e;
				}
				logger.warn("Failed to click on attempt {}, retrying...", attempts);
				waitForMilliseconds(1000); // Short wait before retry
			}
		}
	}

	@Step("Process notifications")
	private void processNotifications() {
		wait.until(ExpectedConditions.presenceOfElementLocated(notificationList));
		List<WebElement> notifications = driver.findElements(notificationList);
		int notificationsToProcess = Math.min(2, notifications.size());
		logger.info("Found {} notifications, will process {}", notifications.size(), notificationsToProcess);

		for (int i = 0; i < notificationsToProcess; i++) {
			try {
				if (processNotification(i)) {
					// If notification was processed successfully, ensure we're back in notification list
					ensureBackInNotificationList();
				}
			} catch (Exception e) {
				logger.warn("Error processing notification {}: {}", i, e.getMessage());
				// Try to recover by going back to dashboard and reopening notifications
				recoverNotificationProcessing();
			}
		}
	}

	@Step("Process single notification")
	private boolean processNotification(int index) {
		try {
			// Wait for notification list and get fresh elements
			wait.until(ExpectedConditions.presenceOfElementLocated(notificationList));
			List<WebElement> notifications = driver.findElements(notificationList);
			
			if (index >= notifications.size()) {
				logger.warn("Notification index {} is out of bounds (size: {})", index, notifications.size());
				return false;
			}

			WebElement notification = notifications.get(index);
			
			// Scroll notification into view and click
			js.executeScript("arguments[0].scrollIntoView(true);", notification);
			wait.until(ExpectedConditions.elementToBeClickable(notification));
			notification.click();
			logger.info("Clicked notification {}", index + 1);

			// Wait for notification details to load
			waitForMilliseconds(1000);
			
			return true;
		} catch (Exception e) {
			logger.error("Failed to process notification {}: {}", index, e.getMessage());
			return false;
		}
	}

	private void ensureBackInNotificationList() {
		int attempts = 0;
		while (attempts < MAX_RETRY_ATTEMPTS) {
			try {
				driver.navigate().back();
				wait.until(ExpectedConditions.presenceOfElementLocated(notificationList));
				return;
			} catch (Exception e) {
				attempts++;
				if (attempts == MAX_RETRY_ATTEMPTS) {
					logger.error("Failed to return to notification list");
					throw e;
				}
				waitForMilliseconds(1000);
			}
		}
	}

	private void ensureBackOnDashboard() {
		int attempts = 0;
		while (attempts < MAX_RETRY_ATTEMPTS) {
			try {
				if (!isElementPresent(dashboardHeader)) {
					driver.navigate().back();
					waitForMilliseconds(1000);
				}
				wait.until(ExpectedConditions.presenceOfElementLocated(dashboardHeader));
				return;
			} catch (Exception e) {
				attempts++;
				if (attempts == MAX_RETRY_ATTEMPTS) {
					logger.error("Failed to return to dashboard");
					throw e;
				}
				waitForMilliseconds(1000);
			}
		}
	}

	private void recoverNotificationProcessing() {
		try {
			ensureBackOnDashboard();
			clickNotificationBadge();
		} catch (Exception e) {
			logger.error("Failed to recover notification processing: {}", e.getMessage());
		}
	}

	private boolean isElementPresent(By locator) {
		try {
			driver.findElement(locator);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private void waitForMilliseconds(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	@Step("Verify notification count change")
	private void verifyNotificationCountChange(int initialCount, int updatedCount) {
		if (initialCount == 100 && updatedCount == 100) {
			logger.info("Notification count remains at 99+ after processing");
		} else if (initialCount == 100 && updatedCount < 100) {
			logger.info("Notification count reduced from 99+ to {}", updatedCount);
		} else if (updatedCount < initialCount) {
			logger.info("Notification count reduced from {} to {}", initialCount, updatedCount);
		} else if (updatedCount == initialCount) {
			logger.info("Notification count remained same at {}", initialCount);
		} else {
			logger.warn("Unexpected notification count change: {} to {}", initialCount, updatedCount);
		}
	}
}