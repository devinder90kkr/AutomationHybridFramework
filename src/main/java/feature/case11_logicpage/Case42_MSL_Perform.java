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
import constant.webTestdata;
import constant.weblocators;
	
	public class Case42_MSL_Perform extends BasePage {
		
		SeleniumUtils utils = new SeleniumUtils(driver);
		 public Case42_MSL_Perform(WebDriver driver) {
			super(driver);
			
		}

		@Test
		    public void Perform() throws InterruptedException, ParseException {
		        Thread.sleep(2000);
	
		        utils.clickMembersummary();
		        utils.waitForMilliseconds(2000);
		        utils.enterSearchText();
		        utils.clickMembername();
	
	   		   /***********************************landed on Logic page ***************************************************************************************************/
	   		   Thread.sleep(2000);
	   		   WebElement Logicbutton =  driver.findElement(weblocators.Logibttn);
	   		   Logicbutton.click();

	   		  /****************************************Click on next & previous button and get week*************************************************************/        

	   		   // Use the next&	previous utility method
		        utils.navigateToLastAndNextWeek();
		        
		        Thread.sleep(2000);

		        /***************************************Click on Perfom and scroll******************************************************************************************/
		  	   Thread.sleep(5500);
		  	   WebElement Performheading = driver.findElement(weblocators.Prfrmhading);
		       // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);;", Performheading);
			     		
			   Thread.sleep(5500);				// Wait for the element to be clickable
			   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); // Adjust the timeout as needed
			   WebElement Performnoteplus = wait.until(ExpectedConditions.elementToBeClickable(weblocators.Prfrmhadingplsu));
			   Performnoteplus.click();
			   		
			   Thread.sleep(5500);
			   // Example usage:
			   WebElement selectbutton = driver.findElement(weblocators.selctbttn);
			   // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", selectbutton);

			   Thread.sleep(2500);
		  
			   /************************************************Input data as per next week selected and populate data in three days***********************************************/
		        
			   // Locate the element for Monday
		        By mondayElementLocator = By.xpath("//h6[contains(@class, 'g_title') and contains(text(), 'Monday')]");
		        WebElement mondayElement = driver.findElement(mondayElementLocator);

		        // Extract and print the value for Monday
		        String mondayValue = mondayElement.getText();
		        System.out.println("Monday value: " + mondayValue);

	  	   
		        /****************************************************************Populate data for monday first activity **************************************************************/
					    	
		        Thread.sleep(2000);
			    WebElement selectLP =driver.findElement(weblocators.selctLP);
			    Actions builder = new Actions(driver);
			    builder.moveToElement(selectLP).click().sendKeys(webTestdata.selectLp).perform();
			    Thread.sleep(2000);
			    builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		        
			    Thread.sleep(2500);
			    
			    WebElement searchactivity =driver.findElement(weblocators.sarchacivity);
			    Actions builder2 = new Actions(driver);
			    builder2.moveToElement(searchactivity).click().sendKeys(webTestdata.activityname).perform();
			    Thread.sleep(2000);
			    builder2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		        
			    Thread.sleep(2500);
		
			    WebElement min =driver.findElement(weblocators.minutes);
			    Actions builder3 = new Actions(driver);
			    min.clear();
			    builder3.moveToElement(min).click().sendKeys(webTestdata.activitymin).perform();
			  
			    Thread.sleep(2000);
			    WebElement searchIntensity =driver.findElement(weblocators.sarchIntsity);
			    Actions builder4 = new Actions(driver);
			    builder4.moveToElement(searchIntensity).click().sendKeys(webTestdata.activityintensity).perform();
			    Thread.sleep(2000);
			    builder4.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			    
			    Thread.sleep(2000);
			    WebElement HRvalue =driver.findElement(weblocators.HR1value);
			    Actions builder41 = new Actions(driver);
			    builder41.moveToElement(HRvalue).click().sendKeys(webTestdata.activityHrvalue).perform();
			    Thread.sleep(2000);
			    builder41.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			       
			    Thread.sleep(2000);
			    WebElement cue = driver.findElement(weblocators.cueinpt);
			    Actions builder5 = new Actions(driver);
			    builder5.moveToElement(cue).click().sendKeys(webTestdata.activitydec).sendKeys(Keys.ENTER).perform();
			   
			    Thread.sleep(2000);
			    // Click outside of the block to save data
		        WebElement outsideBlock1 = driver.findElement(weblocators.outsieBlcok1);
		        outsideBlock1.click(); 

		        /**************************** Select week and copy data*****************************************************************************************/    	       		        

		     Thread.sleep(2500);

		     // Find and click on the "Select" button
		     WebElement selectButton = driver.findElement(weblocators.slctBttn4);
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
		        
		        
		        WebElement saveyesbutton = driver.findElement(weblocators.sveysbttn);
		        saveyesbutton.click();
		        Thread.sleep(2500);
		  	  	
        
		        
			    
		 }
	}
	 
	
