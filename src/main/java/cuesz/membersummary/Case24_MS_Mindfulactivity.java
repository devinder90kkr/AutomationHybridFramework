 /*https://chat.openai.com/share/fb99a8d3-9b88-4b49-8555-3f5eab0b24e5 */
package cuesz.membersummary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.AllureUtils;
import cuesz.utils.SeleniumUtils;

public class Case24_MS_Mindfulactivity extends BasePage {
	
	SeleniumUtils utils = new SeleniumUtils(driver);
	
	private By mindflHeadng = (By.xpath("//h2[contains(text(), 'Mindful')]"));
	//private By drpdwnThWek = (By.xpath("//div[@id='MindFulData']//div[contains(@class, 'react-select-dropdown-prefix__value-container')]"));
	private By drpdwnThWek = (By.id("MemberSummary-Mindfull-Activity"));
	private By optnthWek	= (By.xpath("//div[@id='MindFulData']//div[contains(@class, 'react-select-dropdown-prefix__value-container')]"));
	private By slectOptnThsWek = (By.xpath("//div[@id='MindFulData']//div[contains(@class, 'react-select-dropdown-prefix__value-container')]"));
	private By drpdon1 = (By.xpath("//div[@class='cstm_row d-flex']//*[normalize-space()='Last Week']"));
	private By elment2	= (By.xpath("//div[@class='DayPicker']"));
	private By currtDate 	= (By.xpath("//div[contains(@class, 'DayPicker-Day--today')]"));
	private By drpdwn3	= (By.xpath("//div[contains(text(),'7 - 13 Aug, 2023')]"));
	private By lftarrwbttn	= (By.xpath("//button[@class='btn btn-grey pre']//span"));
	private By rgtarrwbttn= (By.xpath("//button[@class='btn btn-grey next']"));

    public Case24_MS_Mindfulactivity(WebDriver driver) {
		super(driver);
	}

    @Test
    public void mindfulactivity() throws InterruptedException {
        Thread.sleep(2000);

        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();

        // Scroll to the "Team Leader Coach Notes" heading
       
        Thread.sleep(5000);
        String headingText = "Mindful";
        String xpathExpression = "//h2[contains(text(), '" + headingText + "')]";
        By headingLocator = By.xpath(xpathExpression);
        // Scroll to the heading using JavaScriptExecutor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(headingLocator));        
        
        Thread.sleep(2500);
     // Find the element for the perform heading
        WebElement mindfulHeading = driver.findElement(mindflHeadng);

        // Validate the heading for perform
        if (mindfulHeading.isDisplayed()) {
            System.out.println("Heading for Mindful is verified.");
        } else {
            System.out.println("Heading for Mindful is not found.");
        }

        Thread.sleep(2000);
     // Find the dropdown element for "This Week"
        WebElement dropdownThisWeek = driver.findElement(drpdwnThWek);
        dropdownThisWeek.click();


        // Validate the selected option for "This Week" dropdown
        WebElement selectedOptionThisWeek = driver.findElement(optnthWek);
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
//	        WebElement dropdown1 = driver.findElement(slectOptnThsWek);
	        WebElement dropdown1 = driver.findElement(drpdwnThWek);
		    Actions builder1 = new Actions(driver);
		    builder1.moveToElement(dropdown1).click().sendKeys("Last Week").perform();
		    Thread.sleep(2000);
		    builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
            Thread.sleep(3000);
     
         // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
            
  	     // Find the dropdown element
  	       // WebElement dropdown2 = driver.findElement(drpdon1);
	        WebElement dropdown2 = driver.findElement(drpdwnThWek);
  		    Actions builder2 = new Actions(driver);
  		    builder2.moveToElement(dropdown2).click().sendKeys("Select week").perform();
  		  Thread.sleep(2000);
		    builder2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		    
		    
  		       Thread.sleep(3000);

  		       // Wait for the date picker to appear (you can use explicit wait here)
  		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  		wait.until(ExpectedConditions.visibilityOfElementLocated(elment2));

  		// Get the current date
  		String currentDate = driver.findElement(currtDate).getAttribute("aria-label");

  		// Assuming currentDate is in the format "Sun Jul 23 2023"
  		// You can parse it and find the previous week's start date

  		// ... parsing logic to find previous week's start date ...
  		// Let's say the previous week's start date is "Mon Jul 17 2023"

  		// Now, locate and click on the previous week's start date
  		String previousWeekStartDate = "Sun Sep 03 2023";
  		WebElement previousWeekDateElement = driver.findElement(By.xpath("//div[@aria-label='" + previousWeekStartDate + "']"));
  		previousWeekDateElement.click();

  		// Wait for the date picker to close (you can use explicit wait here)
  	//	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='DayPicker']")));
		//    Thread.sleep(500);
  	// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot"); 
		    
		    Thread.sleep(3000);
		     // Find the dropdown element
//		        WebElement dropdown3 = driver.findElement(drpdwn3);
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
			 Thread.sleep(1500);
			// Capture a screenshot and attach it to Allure
		        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
			 
			 Thread.sleep(1500);

		   		     
           
    }
}           
    
  
    
        
       
	    
      
    
    
  

