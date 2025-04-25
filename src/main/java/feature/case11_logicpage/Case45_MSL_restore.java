package feature.case11_logicpage;

import java.text.ParseException;
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

import commonfunction.functions.DatePickerUtility_logicpage;
import base.BasePage;
import utils.SeleniumUtils;
import constant.weblocators;
	
	public class Case45_MSL_restore extends BasePage {
		
		SeleniumUtils utils = new SeleniumUtils(driver);
		public Case45_MSL_restore(WebDriver driver) {
			super(driver);
			
		}

		 @Test
		    public void restore() throws InterruptedException, ParseException {
		        Thread.sleep(2000);
	
		        utils.clickMembersummary();
		        utils.waitForMilliseconds(2000);
		        utils.enterSearchText();
		        utils.clickMembername();
		  /***********************************landed on Logic page ***************************************************************************************************/
	   	
		       Thread.sleep(2000);
	   		   WebElement Logicbutton =   driver.findElement(weblocators.Logicbttn);
	   		   Logicbutton.click();

	    /****************************************Click on next & previous button and get week*****************************************************************************************************/        

	   		// Use the next&	previous utility method
		        utils.navigateToLastAndNextWeek();
		        
		        Thread.sleep(2000);		
		  	        
		  	
	 /***************************************Click on restor and scroll******************************************************************************************/
		  	   Thread.sleep(5500);
		  	   WebElement restorheading = driver.findElement(weblocators.rstrhading);
		       // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);;", restorheading);
			     		
			   Thread.sleep(5500);				// Wait for the element to be clickable
			   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); // Adjust the timeout as needed
			   WebElement restornoteplus = wait.until(ExpectedConditions.elementToBeClickable(weblocators.rsornotepls));
			   restornoteplus.click();
			   		
			   Thread.sleep(5500);
			   // Example usage:
			   WebElement selectbutton = driver.findElement(weblocators.slctbttn);
			   // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", selectbutton);


     /********************************************************************Populate data for monday first activity *************************************************************************************/
			 
			   Thread.sleep(2500);
			   // Locate the heading element
		       WebElement headingElement = driver.findElement(weblocators.hadnglement);
		       // Get the text of the heading
		       String actualHeading = headingElement.getText();
		       // Expected heading value
		       String expectedHeading = "Before Sleep Time";
		       // Perform the assertion
		       if (actualHeading.equals(expectedHeading)) {
		           System.out.println("Assertion Passed: Heading is 'Before Sleep Time'");
		       } else {
		           System.out.println("Assertion Failed: Heading is not 'Before Sleep Time'");
		       }
			    
		       
		       Thread.sleep(2000);
			   WebElement restoreoption1 =driver.findElement(weblocators.rstropton1);
			   Actions builder = new Actions(driver);
			   builder.moveToElement(restoreoption1).click().sendKeys("ice bath for 30 seconds").perform();
			   Thread.sleep(2000);
			  builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			   
			   Thread.sleep(2000);
			   WebElement restoreoption2 =driver.findElement(weblocators.rstropton2);
			   Actions builder2 = new Actions(driver);
			   builder2.moveToElement(restoreoption2).click().sendKeys("3x ZMA").perform();
			   Thread.sleep(2000);
			   builder2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			   
			   Thread.sleep(2000);
			   WebElement restoreoption3 =driver.findElement(weblocators.rstropton3);
			   Actions builder3 = new Actions(driver);
			   builder3.moveToElement(restoreoption3).click().sendKeys("This is manual enterny by automation tool").perform();
			   Thread.sleep(2000);
			   builder3.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			   
			   Thread.sleep(2500);
			   // Locate the heading element
		       WebElement SleepheadingElement = driver.findElement(weblocators.SlephadngElement);
		       // Get the text of the heading
		       String actualHeading1 = SleepheadingElement.getText();
		       // Expected heading value
		       String expectedHeading1 = "Sleep Time";
		       // Perform the assertion
		       if (actualHeading1.equals(expectedHeading1)) {
		           System.out.println("Assertion Passed: Heading is 'Sleep Time'");
		       } else {
		           System.out.println("Assertion Failed: Heading is not 'Sleep Time'");
		       }
		       
		       
		       Thread.sleep(2000);
			   WebElement Sleepeoption =driver.findElement(weblocators.Slepeopton);
			   Actions builder4 = new Actions(driver);
			   builder4.moveToElement(Sleepeoption).click().sendKeys("swedish relaxation").perform();
			   Thread.sleep(2000);
			   builder4.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			   Thread.sleep(2000);
		       
	//			   Thread.sleep(2000);
	//			   WebElement Sleepeoption2 =driver.findElement(weblocators.Slepeopton2);
	//			   Actions builder5 = new Actions(driver);
	//			   builder5.moveToElement(Sleepeoption2).click().sendKeys("thinking on purpose").perform();
	//			   Thread.sleep(2000);
	//			   builder5.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	//			   Thread.sleep(2000);
	//// /********************************************************************Populate data for tUESDAY first activity *************************************************************************************/
//			   Thread.sleep(2000);
//			   WebElement restoreoption21 =driver.findElement(weblocators.rstropton4);
//			   Actions builder51 = new Actions(driver);
//			   builder51.moveToElement(restoreoption21).click().sendKeys("infrared sauna 5 minutes").perform();
//			   Thread.sleep(2000);
//			   builder51.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
//			   
//			   Thread.sleep(2000);
//			   WebElement restoreoption211 =driver.findElement(weblocators.rstropton5);
//			   Actions builder211 = new Actions(driver);
//			   builder211.moveToElement(restoreoption211).click().sendKeys("3x ZMA").perform();
//			   Thread.sleep(2000);
//			   builder211.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
//			   
//			   Thread.sleep(2000);
//			   WebElement sleepoption211 =driver.findElement(weblocators.Slepeopton3);
//			   Actions builder32 = new Actions(driver);
//			   builder32.moveToElement(sleepoption211).click().sendKeys("phone 10 feet away").perform();
//			   Thread.sleep(2000);
//			   builder32.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
//			   
//			       
//			   Thread.sleep(2500);
//				// Click outside of the block to save data
//			   WebElement outsideBlock1 = driver.findElement(weblocators.outside1);
//			   outsideBlock1.click();
				   
			   /************************************ Select week and copy data******************************************************************/    
		        
//		        Thread.sleep(5500);
//				// Example usage:
//				WebElement selectbutton11 = driver.findElement(weblocators.slctbttn3);
//			    // Scroll to the "Staff Notes" element using JavaScriptExecutor
//				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", selectbutton11);
//		        
		        
		        Thread.sleep(2500);
		        // Find and click on the "Select" button
			    WebElement selectButton = driver.findElement(weblocators.slctbttn3);
			    selectButton.click();

			  // Call the utility method to select the desired date as per above scripts 
			   DatePickerUtility_logicpage.selectDesiredDate(driver);
		        
		        Thread.sleep(2500);
			    WebElement Copybutton = driver.findElement(weblocators.Cpybttn);
			    Copybutton.click();
		        Thread.sleep(2500);		
		        
		        // Locate an element within the pop-up
		        By popupElementLocator = By.xpath("//h3[contains(text(), 'Are you sure you want to copy the data for 1 weeks.')]");
		        WebElement popupElement = driver.findElement(popupElementLocator);

		        // Check if the pop-up element is displayed
		        if (popupElement.isDisplayed()) {
		            System.out.println("Pop-up is open.");
		        } else {
		            System.out.println("Pop-up is not open.");
		        }
		        Thread.sleep(500);
		     // Locate elements within the pop-up
		        By dataFromElementLocator = By.xpath("//span[contains(@class, 'date_field')]");
		        By dataToElementLocator = By.xpath("//ul[contains(@class, 'data_copy_list')]//span");

		        WebElement dataFromElement = driver.findElement(dataFromElementLocator);
		        WebElement dataToElement = driver.findElement(dataToElementLocator);

		        // Extract and print the values
		        String dataFromValue = dataFromElement.getText();
		        String dataToValue = dataToElement.getText();

		        System.out.println("Data to be copied from: " + dataFromValue);
		        System.out.println("Data will be copied to: " + dataToValue);
		        
		        
		        WebElement saveyesbutton = driver.findElement(weblocators.savebttn);
		        saveyesbutton.click();
		      
				   Thread.sleep(5000);
		 }
	}
	 
	
