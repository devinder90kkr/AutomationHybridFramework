	package cuesz.logicpage;
	
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

import cuesz.pages.BasePage;
import cuesz.utils.DatePickerUtility_logicpage;
import cuesz.utils.SeleniumUtils;
	
	public class Case42_MSL_Perform extends BasePage {
		
		SeleniumUtils utils = new SeleniumUtils(driver);
		private By Logibttn =   (By.xpath("//span[normalize-space()='Logic Page']"));
		private By Prfrmhading = (By.id("LivePerfromCard"));
		private By Prfrmhadingplsu = (By.xpath("//button[@data-bs-target='#LivePerform']"));
		private By selctbttn = (By.xpath("//div[@id='LivePerfromCard']//div[@class='d-flex justify-content-end calender_drop']//button[1]"));
		private By selctLP = (By.xpath("//*[@id='LivePerform']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"));
		private By sarchacivity =(By.xpath("//*[@id='LivePerform']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
		private By minutes =	(By.xpath("(//input[@placeholder='Min'])[1]"));
		private By sarchIntsity =	(By.xpath("//*[@id='LivePerform']/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
		private By HR1value =(By.xpath("//*[@id='LivePerform']/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"));
		private By cueinpt = (By.xpath("//*[@id='LivePerform']/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]"));
	    private By outsieBlcok1 = (By.tagName("body"));
	  
	    
	    private By slctBttn4 = (By.xpath("//div[@id='LivePerfromCard']//div[@class='d-flex justify-content-end calender_drop']//button[1]"));
	    private By Cpybttn = (By.xpath("(//button[@class='btn btn-sm btn-primary m-1'])[6]"));      
        private By sveysbttn = (By.xpath("(//button[normalize-space()='Yes'])[1]"));
        
        
	  	
		
		 public Case42_MSL_Perform(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
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
	   		   WebElement Logicbutton =  driver.findElement(Logibttn);
	   		   Logicbutton.click();

	   		  /****************************************Click on next & previous button and get week*****************************************************************************************************/        

	   		// Use the next&	previous utility method
		        utils.navigateToLastAndNextWeek();
		        
		        Thread.sleep(2000);
		  	        
		  	
	  /***************************************Click on Perfom and scroll******************************************************************************************/
		  	   Thread.sleep(5500);
		  	   WebElement Performheading = driver.findElement(Prfrmhading);
		       // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);;", Performheading);
			     		
			   Thread.sleep(5500);				// Wait for the element to be clickable
			   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); // Adjust the timeout as needed
			   WebElement Performnoteplus = wait.until(ExpectedConditions.elementToBeClickable(Prfrmhadingplsu));
			   Performnoteplus.click();
			   		
			   Thread.sleep(5500);
			   // Example usage:
			   WebElement selectbutton = driver.findElement(selctbttn);
			   // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", selectbutton);

			   Thread.sleep(2500);
		  
	  /************************************************Input data as per next week selected and populate data in three days***************************************************************************************************/
		        
			// Locate the element for Monday
		        By mondayElementLocator = By.xpath("//h6[contains(@class, 'g_title') and contains(text(), 'Monday')]");
		        WebElement mondayElement = driver.findElement(mondayElementLocator);

		        // Extract and print the value for Monday
		        String mondayValue = mondayElement.getText();
		        System.out.println("Monday value: " + mondayValue);

	  	   
     /********************************************************************Populate data for monday first activity *************************************************************************************/
					    	
		        Thread.sleep(2000);
			    WebElement selectLP =driver.findElement(selctLP);
			    Actions builder = new Actions(driver);
			    builder.moveToElement(selectLP).click().sendKeys("LP1R1").perform();
			    Thread.sleep(2000);
			    builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		        
			    Thread.sleep(2500);
			    
			    WebElement searchactivity =driver.findElement(sarchacivity);
			    Actions builder2 = new Actions(driver);
			    builder2.moveToElement(searchactivity).click().sendKeys("Walking").perform();
			    Thread.sleep(2000);
			    builder2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		        
			    Thread.sleep(2500);
		
			    WebElement min =driver.findElement(minutes);
			    Actions builder3 = new Actions(driver);
			    min.clear();
			    builder3.moveToElement(min).click().sendKeys("05").perform();
			  
			    Thread.sleep(2000);
			    WebElement searchIntensity =driver.findElement(sarchIntsity);
			    Actions builder4 = new Actions(driver);
			    builder4.moveToElement(searchIntensity).click().sendKeys("Low").perform();
			    Thread.sleep(2000);
			    builder4.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			    
			    Thread.sleep(2000);
			    WebElement HRvalue =driver.findElement(HR1value);
			    Actions builder41 = new Actions(driver);
			    builder41.moveToElement(HRvalue).click().sendKeys("60-80").perform();
			    Thread.sleep(2000);
			    builder41.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			       
			    Thread.sleep(2000);
			    WebElement cue = driver.findElement(cueinpt);
			    Actions builder5 = new Actions(driver);
			    builder5.moveToElement(cue).click().sendKeys("Please Sync Scosche").sendKeys(Keys.ENTER).perform();
			   
			    Thread.sleep(2000);
			    // Click outside of the block to save data
		        WebElement outsideBlock1 = driver.findElement(outsieBlcok1);
		        outsideBlock1.click(); 
			    


		     
		
		        /**************************** Select week and copy data*****************************************************************************************/    	       		        

		     Thread.sleep(2500);

		     // Find and click on the "Select" button
		     WebElement selectButton = driver.findElement(slctBttn4);
		     selectButton.click();

		     // Call the utility method to select the desired date as per above scripts 
		        DatePickerUtility_logicpage.selectDesiredDate(driver);

		        
		        Thread.sleep(2500);
			    WebElement Copybutton = driver.findElement(Cpybttn);
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
		        
		        
		        WebElement saveyesbutton = driver.findElement(sveysbttn);
		        saveyesbutton.click();
		        Thread.sleep(2500);
		  	  	
        
		        
			    
		 }
	}
	 
	
