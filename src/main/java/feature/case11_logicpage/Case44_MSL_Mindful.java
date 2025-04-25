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
	
	public class Case44_MSL_Mindful extends BasePage {
	
		
		SeleniumUtils utils = new SeleniumUtils(driver);
	
		 public Case44_MSL_Mindful(WebDriver driver) {
			super(driver);
			
		}

		@Test
		    public void mindful() throws InterruptedException, ParseException {
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
		  	        
	   		   
	        /***************************************Click on mindful and scroll******************************************************************************************/
		  	   Thread.sleep(5500);
		  	   WebElement mindfulheading = driver.findElement(weblocators.mindfulhdng);
		       // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);;", mindfulheading);
			     		
			   Thread.sleep(5500);				// Wait for the element to be clickable
			   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); // Adjust the timeout as needed
			   WebElement mindfulnoteplus = wait.until(ExpectedConditions.elementToBeClickable(weblocators.mindflnopls));
			   mindfulnoteplus.click();
			   		
			   Thread.sleep(5500);
			   // Example usage:
			   WebElement selectbutton = driver.findElement(weblocators.slctbttn);
			   // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", selectbutton);

		
    
		        

     /********************************************************************Populate data for monday first activity *************************************************************************************/
			   Thread.sleep(2500);
			   // Locate the heading element
		       WebElement headingElement = driver.findElement(weblocators.heainelment);
		       // Get the text of the heading
		       String actualHeading = headingElement.getText();
		       // Expected heading value
		       String expectedHeading = "Biofeedback";
		       // Perform the assertion
		       if (actualHeading.equals(expectedHeading)) {
		           System.out.println("Assertion Passed: Heading is 'Biofeedback'");
		       } else {
		           System.out.println("Assertion Failed: Heading is not 'Biofeedback'");
		       }
   
		       
			   
			   Thread.sleep(2000);
			   WebElement selectLP =driver.findElement(weblocators.selectLPInput);
			   Actions builder = new Actions(driver);
			   builder.moveToElement(selectLP).click().sendKeys("Training Day").perform();
			   Thread.sleep(2000);
			   builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			   
			 

			   Thread.sleep(2000);
			   WebElement Selectmin =driver.findElement(weblocators.slecttmin);
			   Actions builder1 = new Actions(driver);
			   builder1.moveToElement(Selectmin).click().sendKeys("18 Minutes").perform();
			   Thread.sleep(2000);
			   builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			   
			   Thread.sleep(2500);
			// Click outside of the block to save data
		        WebElement outsideBlock1 = driver.findElement(weblocators.outsBlcok1);
		        outsideBlock1.click();
			   
			   
			   /********************************************************************Populate data for tuesday first activity *************************************************************************************/		      
		     // Locate the element using XPath
		        WebElement element = driver.findElement(By.xpath("//h6[@class='g_title']"));
		        // Extract the text from the element
		        String extractedText = element.getText();
		        // Print the extracted text
		        System.out.println("Extracted Text: " + extractedText);
		        
			   Thread.sleep(2000);
			   WebElement selectLP1 =driver.findElement(weblocators.selectLPinpt1);
			   Actions builder2 = new Actions(driver);
			   builder2.moveToElement(selectLP1).click().sendKeys("Non Training Day").perform();
			   Thread.sleep(2000);
			   builder2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			   
			   Thread.sleep(2000);
			   WebElement Selectmin2 =driver.findElement(weblocators.Selectmininpt2);
			   Actions builder3 = new Actions(driver);
			   builder3.moveToElement(Selectmin2).click().sendKeys("16 Minutes").perform();
			   Thread.sleep(2000);
			   builder3.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			   
			   Thread.sleep(2500);
			   
			// Click outside of the block to save data
		        WebElement outsideBlock2 = driver.findElement(weblocators.outsideBlck2);
		        outsideBlock2.click();
			   /************************************ Select week and copy data******************************************************************/    
		        
		        Thread.sleep(5500);
				// Example usage:
				WebElement selectbutton11 = driver.findElement(weblocators.slctbtt11);
			    // Scroll to the "Staff Notes" element using JavaScriptExecutor
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", selectbutton11);
		        
		        
//		        Thread.sleep(2500);
		        // Find and click on the "Select" button
			    WebElement selectButton = driver.findElement(weblocators.slctBttn);
			    selectButton.click();
				
			    // Call the utility method to select the desired date as per above scripts 
			    DatePickerUtility_logicpage.selectDesiredDate(driver);
			    
			    
			    Thread.sleep(2500);
			    WebElement Copybutton1 = driver.findElement(weblocators.Cpybttn);
			    Copybutton1.click();
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
		        
		        
		        WebElement saveyesbutton = driver.findElement(weblocators.Savesbttn);
		        saveyesbutton.click();
		        Thread.sleep(2500); 
		       

		
			        
			        
			   
		 }
	}
	 
	
