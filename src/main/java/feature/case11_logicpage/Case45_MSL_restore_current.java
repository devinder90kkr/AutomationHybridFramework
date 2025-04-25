package feature.case11_logicpage;

import java.text.ParseException;
import java.time.Duration;
// import java.time.format.DateTimeFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

// import date.functions.DatePickerUtility_logicpage;
import base.BasePage;
import utils.SeleniumUtils;
	
	public class Case45_MSL_restore_current extends BasePage {
		
		SeleniumUtils utils = new SeleniumUtils(driver);
		private By Logicbttn =   (By.xpath("//span[normalize-space()='Logic Page']"));
		private By rstrhading = (By.xpath("(//div[normalize-space()='Restore'])[1]"));
		private By rsornotepls = (By.xpath("(//button[@data-bs-target='#Restore'])[1]"));
		private By slctbttn = (By.xpath("//div[@id='RestoreCard']//div[@class='d-flex justify-content-end calender_drop']//button[1]"));
	
		private By rstropton1 =	(By.xpath("(//input[@placeholder='Enter Cue'])[1]"));
		private By rstropton2 =(By.xpath("(//input[@placeholder='Enter Cue'])[2]"));
		private By rstropton3 =(By.xpath("(//input[@placeholder='Enter Cue'])[3]"));
		private By SlephadngElement = (By.xpath("(//h6[contains(text(),'Sleep Time')])[2]"));
		private By Slepeopton =(By.xpath("(//input[@placeholder='Enter Cue'])[5]"));
		private By Slepeopton2 =(By.xpath("(//input[@placeholder='Enter Cue'])[5]"));

		
		public Case45_MSL_restore_current(WebDriver driver) {
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
	   		   WebElement Logicbutton =   driver.findElement(Logicbttn);
	   		   Logicbutton.click();


	   		   
	   			   		   
	 /***************************************Click on restor and scroll******************************************************************************************/
		  	   Thread.sleep(5500);
		  	   WebElement restorheading = driver.findElement(rstrhading);
		       // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);;", restorheading);
			     		
			   Thread.sleep(5500);				// Wait for the element to be clickable
			   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); // Adjust the timeout as needed
			   WebElement restornoteplus = wait.until(ExpectedConditions.elementToBeClickable(rsornotepls));
			   restornoteplus.click();
			   		
			   Thread.sleep(5500);
			   // Example usage:
			   WebElement selectbutton = driver.findElement(slctbttn);
			   // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", selectbutton);
			   
			   
			   Thread.sleep(5500); 
				
			   //WebElement  activeblock = driver.findElement(By.xpath("//div[@id='active_logic_block']"));
			   WebElement  activeblock = driver.findElement(By.xpath("//div[@id='Restore']//div[@class='logic_block active']//div[@class='logic_block_body']"));
			// Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", activeblock);
			   
Thread.sleep(3500);


     /********************************************************************Populate data for monday first activity *************************************************************************************/
			 					       
		      
			   Thread.sleep(2000);
			   WebElement restoreoption1 =driver.findElement(rstropton1);
			   Actions builder = new Actions(driver);
			   builder.moveToElement(restoreoption1).click().sendKeys("ice bath for 30 seconds").perform();
			   Thread.sleep(2000);
			   builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			   
			   Thread.sleep(2500);
			   WebElement restoreoption2 =driver.findElement(rstropton2);
			   Actions builder2 = new Actions(driver);
			   builder2.moveToElement(restoreoption2).click().sendKeys("3x ZMA").perform();
			   Thread.sleep(2000);
			   builder2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			   
			   Thread.sleep(2500);
			   WebElement restoreoption3 =driver.findElement(rstropton3);
			   Actions builder3 = new Actions(driver);
			   builder3.moveToElement(restoreoption3).click().sendKeys("This is manual enterny by automation tool").perform();
			   Thread.sleep(2000);
			   builder3.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			   
			   Thread.sleep(2500);
			   // Locate the heading element
		       WebElement SleepheadingElement = driver.findElement(SlephadngElement);
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
		       
		       
		       Thread.sleep(2500);
			   WebElement Sleepeoption =driver.findElement(Slepeopton);
			   Actions builder4 = new Actions(driver);
			   builder4.moveToElement(Sleepeoption).click().sendKeys("swedish relaxation").perform();
			   Thread.sleep(2000);
			   builder4.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			 
		       
			   Thread.sleep(2500);
			   WebElement Sleepeoption2 =driver.findElement(Slepeopton2);
			   Sleepeoption2.clear();
			   Actions builder5 = new Actions(driver);
			   builder5.moveToElement(Sleepeoption2).click().sendKeys("thinking on purpose").perform();
			   Thread.sleep(2000);
			   builder5.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			   Thread.sleep(2000);

		 }
	}
	 
	