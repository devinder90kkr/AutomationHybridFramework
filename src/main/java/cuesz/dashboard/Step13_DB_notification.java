package cuesz.dashboard;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;

public class Step13_DB_notification extends BasePage {
	
	private By countelmnt = (By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]"));
	private By notiflement = (By.xpath("//*[@id='root']/div/div[1]/div/div/div/div[1]/div[2]/div[2]/div"));
	private By notifationlements = (By.xpath("//div[@class='notification-list_content']"));

	

	public Step13_DB_notification(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Test
	public void Notification() throws InterruptedException {
		// Find the notification count element
		WebElement countElement = driver.findElement(countelmnt);

		// Get the initial count value
		int initialCount = Integer.parseInt(countElement.getText());

		// Verify the initial count value
		System.out.println("Initial count: " + initialCount);

		Thread.sleep(2000);

		// Find the notification element and click on it
		
		WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(notiflement));
		WebElement notificationElement = driver.findElement(notiflement);
		notificationElement.click();

		// Find the notification elements
		List<WebElement> notificationElements = driver
				.findElements(By.xpath("//div[@class='notification-list_content']"));

		// Read only the first 5 notifications
		int notificationCount = Math.min(2, notificationElements.size());

		// Iterate over the notification elements and click on each
		for (int i = 0; i < notificationCount; i++) {
			try {
				// Re-locate the notification elements within the loop
				notificationElements = driver.findElements(notifationlements);
				WebElement notificationElement1 = notificationElements.get(i);

				// Click on the current notification element
				notificationElement1.click();
				Thread.sleep(2000);


				Thread.sleep(2000);
				// Go back to the previous page
				driver.navigate().back();
				Thread.sleep(2000);
			} catch (StaleElementReferenceException e) {
				// Handle the StaleElementReferenceException and continue with the loop
				System.out.println("StaleElementReferenceException occurred. Skipping current notification.");
			}
		}
		driver.navigate().back();
		// Find the updated count element
		WebElement updatedCountElement = driver
				.findElement(notiflement);

		
		Thread.sleep(5000);
		// Get the updated count value
		int updatedCount = Integer.parseInt(updatedCountElement.getText());

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

		Thread.sleep(2000);

	}
}