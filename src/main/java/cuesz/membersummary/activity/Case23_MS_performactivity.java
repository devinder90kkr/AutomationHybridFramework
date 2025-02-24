	 /*https://chat.openai.com/share/fb99a8d3-9b88-4b49-8555-3f5eab0b24e5 */
	package cuesz.membersummary.activity;
	
	import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;
	
	public class Case23_MS_performactivity extends BasePage {
	
		SeleniumUtils utils = new SeleniumUtils(driver);
		private By prfrmHeadng = (By.xpath("//h2[contains(text(), 'Perform Activity Feedback')]"));
		//private By drpdwnThWek = (By.xpath("//div[contains(text(), 'This Week')]"));
		private By drpdwnThWek = (By.id("MemberSummary-Perform-Activity"));
		private By optnthWek	= (By.xpath("//div[contains(text(), 'This Week')]/parent::div"));
		private By slectOptnThsWek = (By.xpath("//div[contains(text(), 'This Week')]"));
		// private By drpdon1 = (By.xpath("//div[contains(text(), 'This Week')]/parent::div"));
		private By selctOptnLatWek = (By.xpath("//div[contains(text(), 'Last Week')]"));
		// private By drpdwn2 = (By.xpath("//div[contains(text(), 'Last Week')]/parent::div"));
		private By elment2	= (By.xpath("//div[@class='DayPicker']"));
		// private By currtDate 	= (By.xpath("//div[contains(@class, 'DayPicker-Day--today')]"));
		// private By drpdwn3	= (By.xpath("//div[contains(text(),'7 - 13 Aug, 2023')]"));
		private By lftarrwbttn	= (By.xpath("//button[@class='btn btn-grey pre']//span"));
		private By rgtarrwbttn= 	(By.xpath("//button[@class='btn btn-grey next']"));
	
		
	    public Case23_MS_performactivity(WebDriver driver) {
			super(driver);
		}
	
	    @Test
	    public void performactivity() throws InterruptedException {
	        Thread.sleep(2000);
	
	        utils.clickMembersummary();
	        utils.waitForMilliseconds(2000);
	        utils.enterSearchText();
	        utils.clickMembername();
	
	        // Scroll to the "Team Leader Coach Notes" heading
	       
	        Thread.sleep(5000);
	        String headingText = "Perform Activity Feedback";
	        String xpathExpression = "//h2[contains(text(), '" + headingText + "')]";
	        By headingLocator = By.xpath(xpathExpression);
	        // Scroll to the heading using JavaScriptExecutor
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(headingLocator));        
	        
	        Thread.sleep(2500);
	     // Find the element for the perform heading
	        WebElement performHeading = driver.findElement(prfrmHeadng);
	
	        // Validate the heading for perform
	        if (performHeading.isDisplayed()) {
	            System.out.println("Heading for Perform Activity Feedback is verified.");
	        } else {
	            System.out.println("Heading for Perform Activity Feedback is not found.");
	        }
	        
	     // Find the dropdown element for "This Week"
	        WebElement dropdownThisWeek = driver.findElement(drpdwnThWek);
	        dropdownThisWeek.click();
	
	        // Select "This Week" from the dropdown
	        WebElement optionThisWeek = driver.findElement(optnthWek);
	        optionThisWeek.click();
	
	        // Validate the selected option for "This Week" dropdown
	        WebElement selectedOptionThisWeek = driver.findElement(slectOptnThsWek);
	        if (selectedOptionThisWeek.getText().trim().equals("This Week")) {
	            System.out.println("Selected option 'This Week' is validated.");
	        } else {
	            System.out.println("Selected option 'This Week' is incorrect.");
	            
	        }
	        
	     // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
	   
	        Thread.sleep(4000);
	        // Find the dropdown element for "Last Week" 
	        Thread.sleep(3000);
		     // Find the dropdown element
	//	        WebElement dropdown1 = driver.findElement(drpdon1);
		        WebElement dropdown1 = driver.findElement(drpdwnThWek);
			    Actions builder1 = new Actions(driver);
			    builder1.moveToElement(dropdown1).click().sendKeys("Last Week").perform();
			    Thread.sleep(2000);
			    builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	        
	        // Validate the selected option for "Last Week" dropdown
	        WebElement selectedOptionLastWeek = driver.findElement(selctOptnLatWek);
	        if (selectedOptionLastWeek.getText().trim().equals("Last Week")) {
	            System.out.println("Selected option 'Last Week' is validated.");
	        } else {
	            System.out.println("Selected option 'Last Week' is incorrect.");
	        }
	        
	     // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
	 
	           Thread.sleep(3000);
	  	     // Find the dropdown element
	  	       // WebElement dropdown2 = driver.findElement(drpdwn2);
	           WebElement dropdown2 = driver.findElement(drpdwnThWek); 
	           Actions builder2 = new Actions(driver);
	  		    builder2.moveToElement(dropdown2).click().sendKeys("Select week").perform();
	  		  Thread.sleep(2000);
			    builder2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	  		    
	  		Thread.sleep(3000);
	  		// Wait for the date picker to appear (you can use explicit wait here)
	  		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  		wait.until(ExpectedConditions.visibilityOfElementLocated(elment2));
	
	//  		// Get the current date
	//  		String currentDate = driver.findElement(currtDate).getAttribute("aria-label");
	//  		// Now, locate and click on the previous week's start date
	//  		String previousWeekStartDate = "Mon Aug 07 2023";
	//  		WebElement previousWeekDateElement = driver.findElement(By.xpath("//div[@aria-label='" + previousWeekStartDate + "']"));
	//  		previousWeekDateElement.click();
	  		
	  		/******working function**********/
//	  		// Define the target date you want to select
//	  		String targetDate = "Sun Sep 03 2023"; // Change this to your desired date
//	
//	  		// Loop until the target date is visible in the calendar
//	  		while (true) {
//	  		    // Check if the target date is visible in the current month
//	  		    WebElement targetDateElement = driver.findElement(By.xpath("//div[@aria-label='" + targetDate + "']"));
//	  		    if (targetDateElement.isDisplayed()) {
//	  		        // If the target date is visible, click on it
//	  		        targetDateElement.click();
//	  		        break; // Exit the loop
//	  		    } else {
//	  		        // If the target date is not visible, click on the previous month button
//	  		        WebElement previousMonthButton = driver.findElement(By.xpath("(//span[@aria-label='Previous Month'])[1]"));
//	  		        previousMonthButton.click();
//	  		        Thread.sleep(1000); // Wait for the calendar to update
//	  		    }
//	  		}
	  		

	  		
	  		/**********************/
//	  		// Calculate the date for the start of the previous week
//	  	    LocalDate currentDate = LocalDate.now();
//	  	    int daysToSubtract = currentDate.getDayOfWeek().getValue() + 7; // Ensure we go back to the start of the previous week
//	  	    LocalDate previousWeekStartDate = currentDate.minusDays(daysToSubtract);
//
//	  	    // Format the date to match the format used in the calendar
//	  	    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("E MMM dd yyyy", Locale.ENGLISH);
//	  	    String formattedDate = previousWeekStartDate.format(dateFormatter);
//
//	  	    // Locate and click on the previous week's start date
//	  	    WebElement previousWeekDateElement = driver.findElement(By.xpath("//div[@aria-label='" + formattedDate + "']"));
//	  	    previousWeekDateElement.click();
	  		
	  		/************/
	  		LocalDate currentDate = LocalDate.now();
	  		int daysToSubtract = currentDate.getDayOfWeek().getValue() + 7; // Ensure we go back to the start of the previous week
	  		LocalDate previousWeekStartDate = currentDate.minusDays(daysToSubtract);

	  		// Check if previous week's start date is in the previous month
	  		if (previousWeekStartDate.getMonthValue() < currentDate.getMonthValue()) {
	  		    // Click on the 'Previous Month' button
	  		    WebElement previousMonthButton = driver.findElement(By.xpath("//span[@aria-label='Previous Month']"));
	  		    previousMonthButton.click();
	  		}

	  		// Format the date to match the format used in the calendar
	  		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("E MMM dd yyyy", Locale.ENGLISH);
	  		String formattedDate = previousWeekStartDate.format(dateFormatter);

	  		// Locate and click on the previous week's start date
	  		WebElement previousWeekDateElement = driver.findElement(By.xpath("//div[@aria-label='" + formattedDate + "']"));
	  		previousWeekDateElement.click();

	  		
	  	    
	  	    
	  	    
	  	// Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
	      	    
			Thread.sleep(3000);
		     // Find the dropdown element
		        //WebElement dropdown3 = driver.findElement(drpdwn3);
			WebElement dropdown3 = driver.findElement(drpdwnThWek);
			    Actions builder3 = new Actions(driver);
			    builder3.moveToElement(dropdown3).click().sendKeys("Monthly View").perform();
			    Thread.sleep(2000);
			    builder3.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();   
			    
			    Thread.sleep(3500);
			    
			 // Capture a screenshot and attach it to Allure
		        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
	
				 // Find the left arrow button element
				 WebElement leftArrowButton = driver.findElement(lftarrwbttn);
				 // Create an Actions object
				 Actions builder = new Actions(driver);
				 // First click on the left arrow button
				 builder.moveToElement(leftArrowButton).click().perform();
				 // Wait for a short time (you may adjust this sleep time if needed)
				 Thread.sleep(1500);
				 // Second click on the left arrow button
				 builder.moveToElement(leftArrowButton).click().perform();
				 // Wait for another short time (you may adjust this sleep time if needed)
				 Thread.sleep(1500);
	
				// Capture a screenshot and attach it to Allure
			        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
	
				 // Find the left arrow button element
				 WebElement rightArrowButton = driver.findElement(rgtarrwbttn);
				 // Create an Actions object
				 Actions builder11 = new Actions(driver);
				 // First click on the left arrow button
				 builder11.moveToElement(rightArrowButton).click().perform();
				 // Wait for a short time (you may adjust this sleep time if needed)
				 Thread.sleep(1500);
				 // Second click on the left arrow button
				 builder11.moveToElement(rightArrowButton).click().perform();
				 // Wait for another short time (you may adjust this sleep time if needed)
				 
				// Capture a screenshot and attach it to Allure
			        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
				 Thread.sleep(1500);
				 Thread.sleep(1500);
	
				 
			   		     
	           
	    }
	}           
	    
	  
	    
	        
	       
		    
	      
	    
	    
	  
	
