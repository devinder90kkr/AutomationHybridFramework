
	package cuesz.membersummary.basic;
	import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;
	
	public class Case18_MS_DotAbiltyPM extends BasePage {
	
		SeleniumUtils utils = new SeleniumUtils(driver);
			
			private By usricn	= (By.xpath("//div[@class='user_action']"));
		    private By Dot1 = (By.xpath("//span[@data-label='3']"));
		    private By Dot2 = (By.xpath("//span[@data-label='2']"));
		    private By Dot3 = (By.xpath("//span[@data-label='1']"));
		    private By Addbutton = (By.xpath("//div[@class='ReactModalPortal']//div[2]//div[2]//button[1]"));
		    private By Title =	(By.xpath("//div[@class='d-flex align-items-center mb-3']//input[@type='text']"));
		    private By Notes	= (By.xpath("//textarea[@class='form-control']"));
		    private By dotfield2 = (By.cssSelector("div[class='col-md-4'] span[data-label='3']"));
		    private By submit	= (By.xpath("//button[@class='btn btn-md btn-primary']"));
		    //private By deleteButton	= (By.cssSelector("div[class='edit_remove_group'] img[alt='delete']"));
	//	    private By deleteButton = (By.xpath("(//button)[16]"));
	private By deleteButton = (By.xpath("(//img[@alt='delete'])[2]"));
		    
		    private By confirm 	= (By.xpath("//button[@id='DecisionPopupRejection']"));
	
		    public Case18_MS_DotAbiltyPM(WebDriver driver) {
			super(driver);
		}
	
		@Test
		public void Dotstatus_Abilityperform() throws InterruptedException {
	  	Thread.sleep(2000);
	
	      utils.clickMembersummary();
	      utils.waitForMilliseconds(2000);
	      utils.enterSearchText();
	      utils.clickMembername();
	      
	      // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "Case18_MS_DotAbiltyPM1");
	      
	      
	      // Click on user icon to open ability to perform popup
	      WebElement userIcon = driver.findElement(usricn);
	      userIcon.click();
	      
	      Thread.sleep(3500);
	      // click on dots
	      WebElement dot1 = driver.findElement(Dot1);
	      dot1.click();
	      WebElement dot2 = driver.findElement(Dot2);
	      dot2.click();
	      WebElement dot3 = driver.findElement(Dot3);
	      dot3.click();
	   
	      Thread.sleep(3500);
	
	      // Click on add button
		    WebElement addButton = driver.findElement(Addbutton);
		    addButton.click();      
	
	    	// Click on dots for first values
	    	WebElement dots2 = driver.findElement(dotfield2);
	    	dots2.click();
	    	Thread.sleep(1500);
	    	
	        // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "Case18_MS_DotAbiltyPM2");
	
	    	// Click and enter value for title and notes 
	    	WebElement titleinput = driver.findElement(Title);
	    	titleinput.sendKeys("this is just for testing purpose");
	
	    	WebElement notes = driver.findElement(Notes);
	    	notes.sendKeys("Hello, we have set ability to perform values one in input text field");
	    	Thread.sleep(2500);
	    	
	    	 // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "Case18_MS_DotAbiltyPM3.1");
	
	    	// Click on submit button
	    	WebElement submitbutton = driver.findElement(submit);
	    	submitbutton.click();
	    	Thread.sleep(3500);
	    	
	        // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "Case18_MS_DotAbiltyPM3");
	
	    	// Perform any other actions you need to after submission
	    	userIcon.click();
	    	Thread.sleep(3500);
	    	// Locate delete button using explicit wait
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	        WebElement deleteBtn = wait.until(ExpectedConditions.elementToBeClickable(deleteButton));
	        deleteBtn.click(); // Click the delete button if present
	        
	        // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "Case18_MS_DotAbiltyPM4");

	        // Add logic here if needed after clicking delete
	        WebElement confirmButton = driver.findElement(confirm);
	        confirmButton.click();

	        Thread.sleep(4500);
	     // Click on submit button
	    	WebElement submitbutton2 = driver.findElement(submit);
	    	submitbutton2.click(); 	
		}}

	
