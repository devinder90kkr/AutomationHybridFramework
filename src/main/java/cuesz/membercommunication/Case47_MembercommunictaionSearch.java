	package cuesz.membercommunication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;

public class Case47_MembercommunictaionSearch extends BasePage {
	
	private By membercomunicate = (By.id("Dashboard-MemberCommunication"));
	private By srchInput = (By.id("MemberCommunication-SearchMembers"));
	
	public Case47_MembercommunictaionSearch(WebDriver driver) {
		super(driver);
	}
	
	 @Test
	    public void Membercommunicate() throws InterruptedException {
	       
		 WebElement Chatclick = driver.findElement(membercomunicate);
	     Chatclick.click();
	     Thread.sleep(2500);
	 
	     // Define an array of names to search for
	        String[] namesToSearch = {"Shelja", "jagdeep", "kamal", "Kumar Devinder"};

	        // Locate the search input field by its ID
	        WebElement searchInput = driver.findElement(srchInput);

	        // Set up a WebDriverWait with a timeout of 10 seconds
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));

	        for (String name : namesToSearch) {
	            // Clear any existing text in the input field
	            searchInput.clear();

	            // Enter the current name into the input field
	            searchInput.sendKeys(name);
	            

	            // Perform the search by submitting the form (you may need to adapt this)
	            // For example, if the search is triggered by hitting Enter key:
	            // searchInput.sendKeys(Keys.ENTER);

	            // Wait for the search results to load (you may need to adjust the locator)
	            wait.until(ExpectedConditions.visibilityOfElementLocated(srchInput));

	            // You can add code here to handle the search results if needed

	            // Print a message indicating the search is complete
	            System.out.println("Searched for: " + name);
	        }
	       
	        
	        
	 }
}

