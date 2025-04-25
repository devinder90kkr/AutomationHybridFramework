package feature.case13_membercommunication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BasePage;

public class Case46_Membercommunictaion extends BasePage {
	
	private By membercomunicate = (By.id("Dashboard-MemberCommunication"));
	private By communicationheading =  (By.xpath("//h2[contains(text(), 'Member Communication')]"));

	
	public Case46_Membercommunictaion(WebDriver driver) {
		super(driver);
	}
	
	 @Test
	    public void Membercommunicate() throws InterruptedException {
	        WebElement Chatclick = driver.findElement(membercomunicate);
	        Chatclick.click();

	        // Locate the "Member Communication" heading element
	        WebElement headingElement = driver.findElement(communicationheading);

	        // Click on the heading element
	        headingElement.click();

	        // Wait for the heading to become visible after the click
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	        wait.until(ExpectedConditions.visibilityOfElementLocated(communicationheading));

	        // Locate the heading element again to get the updated text
	        headingElement = driver.findElement(communicationheading);

	        // Get the text of the heading
	        String headingText = headingElement.getText();

	        // Define the expected heading text
	        String expectedHeading = "Member Communication";

	        // Verify if the actual heading text matches the expected heading
	        if (headingText.equals(expectedHeading)) {
	            System.out.println("Heading verification passed.");
	        } else {
	            System.out.println("Heading verification failed.");
	        }
	        
	        
	 }
}

