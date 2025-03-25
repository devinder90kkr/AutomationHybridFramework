package automation.dashboard;

import java.time.Duration;
// import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import automation.pages.BasePage;

public class Step14_DB_MessgNotification extends BasePage {
	
	private By cuontlement = By.xpath("//div[@class='noti_badge']");
	private By notifnElement = By.xpath("//div[@id='Dashboard-Notification-Chat']//em");
	private By updatCountlement = By.xpath("//div[@class='noti_badge']");
	

	public Step14_DB_MessgNotification(WebDriver driver) {
		super(driver);
	}

	@Test
	public void MessageNotification() throws InterruptedException {
		try {
			// Find the notification count element
			WebElement countElement = driver.findElement(cuontlement);
			int initialCount = Integer.parseInt(countElement.getText());
			System.out.println("Initial count: " + initialCount);

			// Click on notification icon to open panel
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			System.out.println("Waiting for notification icon to be clickable...");
			wait.until(ExpectedConditions.elementToBeClickable(notifnElement));
			WebElement notificationElement = driver.findElement(notifnElement);
			notificationElement.click();
			System.out.println("Clicked notification icon");

			// Process at least 2 notifications
			int notificationsToProcess = Math.min(2, initialCount);
			System.out.println("Will process " + notificationsToProcess + " notifications");

			// Process first notification
			try {
				// Click first notification
				String firstNotificationXPath = "//div[@id='Dashboard-Notification-1']";
				By firstNotification = By.xpath(firstNotificationXPath);
				System.out.println("Waiting for first notification to be clickable...");
				WebElement notification = wait.until(ExpectedConditions.elementToBeClickable(firstNotification));
				notification.click();
				System.out.println("Clicked notification 1");
				Thread.sleep(2000);

				// Go back
				System.out.println("Navigating back...");
				driver.navigate().back();
				Thread.sleep(2000);

				// Reopen notification panel for second notification
				System.out.println("Waiting to reopen notification panel...");
				wait.until(ExpectedConditions.elementToBeClickable(notifnElement));
				driver.findElement(notifnElement).click();
				System.out.println("Reopened notification panel");
				Thread.sleep(2000);

				// Click second notification
				String secondNotificationXPath = "//div[@id='Dashboard-Notification-2']";
				By secondNotification = By.xpath(secondNotificationXPath);
				System.out.println("Waiting for second notification to be clickable...");
				wait.until(ExpectedConditions.visibilityOfElementLocated(secondNotification));
				notification = wait.until(ExpectedConditions.elementToBeClickable(secondNotification));
				notification.click();
				System.out.println("Clicked notification 2");
				Thread.sleep(2000);

				// Go back
				System.out.println("Navigating back after second notification...");
				driver.navigate().back();
				Thread.sleep(2000);

			} catch (StaleElementReferenceException e) {
				System.out.println("StaleElementReferenceException occurred. Retrying...");
				
				// Re-open notification panel
				wait.until(ExpectedConditions.elementToBeClickable(notifnElement));
				driver.findElement(notifnElement).click();
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println("Error processing notifications: " + e.getMessage());
				e.printStackTrace(); // This will print the full stack trace
			}

			// Find the updated count element
			System.out.println("Checking updated count...");
			WebElement updatedCountElement = wait.until(ExpectedConditions.presenceOfElementLocated(updatCountlement));
			
			// Get the updated count value
			String updatedCountText = updatedCountElement.getText();
			int updatedCount = 0;
			if (!updatedCountText.isEmpty()) {
				updatedCount = Integer.parseInt(updatedCountText);
			}
			
			// Verify the updated count value
			System.out.println("Updated count: " + updatedCount);

			// Compare the initial and updated counts
			if (updatedCount < initialCount) {
				System.out.println("Notification count reduced.");
			} else if (updatedCount == initialCount) {
				System.out.println("Notification count remained the same.");
			} else {
				System.out.println("Notification count increased. Unexpected behavior.");
			}

		} catch (Exception e) {
			System.out.println("Error in main test method: " + e.getMessage());
			e.printStackTrace(); // This will print the full stack trace
		}
	}
}
