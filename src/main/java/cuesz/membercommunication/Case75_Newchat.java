package cuesz.membercommunication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.pages.BasePage;

public class Case75_Newchat extends BasePage {
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1000)); 	
	private By membercomunicate = (By.id("Dashboard-MemberCommunication"));
	private By newcht			= (By.id("MemberCommunication-NewChat"));
	private By serchInput		= (By.xpath("//div[@class='chat_modal_search']//input[@id='MemberCommunication-SearchMembers']"));
	private By membclck			= (By.xpath("//div[@class='chat_modal']//span[@title='Kumar Devinder'][normalize-space()='Kumar Devinder']"));
	private By serhbox = (By.id("message"));
	private By stafElment = (By.id("MemberCommunication-StaffList"));
	private By senbttn = (By.id("MemberCommunication-SendMessage"));
	
	
	
	
	public Case75_Newchat(WebDriver driver) {
		super(driver);
	}
	
	 @Test
	    public void Membercommunicate() throws InterruptedException {
	       
		 WebElement Chatclick = driver.findElement(membercomunicate);
	     Chatclick.click();
	        
	     Thread.sleep(2500);
	     
	     WebElement newchat = driver.findElement(newcht);
	     newchat.click();
	     
	     Thread.sleep(2500);
	        // Locate the search input field by its locator
	        // WebElement searchInput = driver.findElement(serchInput);
	       
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
	            
	            WebElement memberclick = driver.findElement(membclck);
	            memberclick.click();
	            
	            Thread.sleep(2000);
	            
	            WebElement staffElement = driver.findElement(stafElment);
		         // Create an instance of the Actions class
		            Actions actions = new Actions(driver);
		           // Move to the staff element to open the dropdown
		            actions.moveToElement(staffElement).click().perform();
		            Thread.sleep(2500);	   
		         // Press Enter to confirm the new time
		            actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();       
	            
	            WebElement sendbutton = driver.findElement(senbttn);
	            sendbutton.click();
	            Thread.sleep(2500);	
	            WebElement searchbox1 = driver.findElement(serhbox);
	            searchbox1.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. ");
	            Thread.sleep(2500);
	            WebElement sendbutton1 = driver.findElement(senbttn);
	            sendbutton1.click();
	            Thread.sleep(2500);
                 
	            
	    }
	
	       
	 }
	 }
