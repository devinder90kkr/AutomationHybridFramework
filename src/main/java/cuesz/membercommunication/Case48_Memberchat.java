package cuesz.membercommunication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.AllureUtils;

public class Case48_Memberchat extends BasePage {
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1000)); 	
	private By membercomunicate = (By.id("Dashboard-MemberCommunication"));
	private By serchInput =	(By.id("MemberCommunication-SearchMembers"));
	
	
	public Case48_Memberchat(WebDriver driver) {
		super(driver);
	}
	
	 @Test
	    public void Membercommunicate() throws InterruptedException {
	       
		 WebElement Chatclick = driver.findElement(membercomunicate);
	        Chatclick.click();
	        
	        Thread.sleep(2500);
	        // Locate the search input field by its locator
	        WebElement searchInput = driver.findElement(serchInput);
	        Thread.sleep(2500);
	        String[] membersToSearch = {"Kumar Devinder"};

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
	            
	            WebElement memberclick = driver.findElement(By.id("MemberCommunication-KumarDevinder"));
	            memberclick.click();
	            Thread.sleep(2500);
	            WebElement searchbox = driver.findElement(By.id("message"));
	            searchbox.sendKeys("Hello this is just for testing purpse");
	            Thread.sleep(2500);
	            
	            // Capture a screenshot and attach it to Allure
	            AllureUtils.captureScreenshot(driver, "text1"); 
	            
	            WebElement staffElement = driver.findElement(By.id("MemberCommunication-StaffList"));
		         // Create an instance of the Actions class
		            Actions actions = new Actions(driver);
		           // Move to the staff element to open the dropdown
		            actions.moveToElement(staffElement).click().perform();
		            Thread.sleep(2500);	   
		         // Press Enter to confirm the new time
		            actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();       
	            
	            WebElement sendbutton = driver.findElement(By.id("MemberCommunication-SendMessage"));
	            sendbutton.click();
	            Thread.sleep(2500);	
	            WebElement searchbox1 = driver.findElement(By.id("message"));
	            searchbox1.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. ");
	            Thread.sleep(2500);
	            WebElement sendbutton1 = driver.findElement(By.id("MemberCommunication-SendMessage"));
	            sendbutton1.click();
	            Thread.sleep(2500);
	            
	         // Capture a screenshot and attach it to Allure
	            AllureUtils.captureScreenshot(driver, "text2"); 
	                      
	            // Locate the staff element by its ID
	            WebElement staffElement1 = driver.findElement(By.id("MemberCommunication-StaffList"));
	         // Create an instance of the Actions class
	            Actions actions1 = new Actions(driver);
	           // Move to the staff element to open the dropdown
	            actions1.moveToElement(staffElement1).click().perform();
	            Thread.sleep(2500);	   
	         // Press Enter to confirm the new time
	            actions1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	            
	                
	            WebElement searchbox2 = driver.findElement(By.id("message"));
	            searchbox2.sendKeys("You may need to adjust the XPath locator or use explicit waits to ensure the chat list is fully loaded before attempting to click on the chat element.");
	            Thread.sleep(2500);
	            WebElement sendbutton2 = driver.findElement(By.id("MemberCommunication-SendMessage"));
	            sendbutton2.click();
	            Thread.sleep(2500);
	            
	            
	            
	           // https://chat.openai.com/share/2469cd62-b110-48d3-8d12-a457818fcd1d
	            
	            
	            
	            
	    }
	
	       
	 }

}
