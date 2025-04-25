package feature.case13_membercommunication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import allureframework.reporting.AllureUtils;
import base.BasePage;

public class Case47_Membersearch extends BasePage {
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1000)); 	
	private By membercomunicate = (By.id("Dashboard-MemberCommunication"));
	
	private By serchInput =	(By.id("MemberCommunication-SearchMembers"));
	
	public Case47_Membersearch(WebDriver driver) {
		super(driver);
	}
	
	 @Test
	    public void Membercommunicate() throws InterruptedException {
	       
		 WebElement Chatclick = driver.findElement(membercomunicate);
	        Chatclick.click();
	        
	        Thread.sleep(3500);
	        // Locate the search input field by its locator
	        WebElement searchInput = driver.findElement(serchInput);
	        Thread.sleep(3500);
	        String[] membersToSearch = {"Sanjit QA", "Sheljaaa", "Jagdeep Singh", "Kumar Devinder"};

	        for (String member : membersToSearch) {
	        	
	        	// Print the member's name to the console
	            System.out.println("Searching for member: " + member);
	            
	            WebElement searchInput1 = driver.findElement(serchInput);
	            searchInput1.click(); // Click on the search input field
	            searchInput1.sendKeys(member);

	            // Capture a screenshot and attach it to Allure
	            AllureUtils.captureScreenshot(driver, "membersearch_screenshot"); 
	            
	            // Perform the search action, for example, click a search button (if applicable)
	            Thread.sleep(2500);
	            // Wait for search results to load (you may need to adjust the wait time)
	            try {
	                Thread.sleep(2000); // Wait for 2 seconds; adjust as needed
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            Thread.sleep(2500);
	            
	            Actions builder = new Actions(driver);
	            builder.keyDown(Keys.COMMAND)
	                   .sendKeys("a")
	                   .keyUp(Keys.COMMAND)
	                   .build()
	                   .perform();

	            // Simulate pressing Delete
	            searchInput.sendKeys(Keys.DELETE);
	         // Capture a screenshot and attach it to Allure
	            AllureUtils.captureScreenshot(driver, "membersearch_screenshot"); 
	            searchInput.clear();

	            Thread.sleep(2500);
	    }
	
	       
	 }

}
