	package cuesz.logicpage;
	
	import java.text.ParseException;
	import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;
	
	public class Case43_MSL_Fuel extends BasePage {
		
		SeleniumUtils utils = new SeleniumUtils(driver);
					
		
		public Case43_MSL_Fuel(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}
		
		 @Test
		    public void Perform() throws InterruptedException, ParseException {
		        Thread.sleep(2000);
	
		        utils.clickMembersummary();
		        utils.waitForMilliseconds(2000);
		        utils.enterSearchText("Kumar Devinder");
		        utils.clickMembername();
	
	   		   /***********************************landed on Logic page ***************************************************************************************************/
	   		   Thread.sleep(2000);
	   		   WebElement Logicbutton =   driver.findElement(By.xpath("//span[normalize-space()='Logic Page']"));
	   		   Logicbutton.click();

	   /****************************************Click on next & previous button and get week*****************************************************************************************************/        
	   		// Use the next&	previous utility method
		        utils.navigateToLastAndNextWeek();
		        
		        Thread.sleep(2000);		
		  	        
	 /***************************************Click on Perfom and scroll******************************************************************************************/
		  	   Thread.sleep(5500);
		  	   WebElement Fuelheading = driver.findElement(By.xpath("(//div[normalize-space()='Fuel'])[1]"));
		       // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);;", Fuelheading);
			     		
			   Thread.sleep(5500);				// Wait for the element to be clickable
			   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); // Adjust the timeout as needed
			   WebElement Performnoteplus = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-bs-target='#FuelToTrain']")));
			   Performnoteplus.click();
			   		
			   Thread.sleep(5500);
			   // Example usage:
			   WebElement selectbutton = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/div[1]/h2[1]/div[2]/button[1]"));
			   // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", selectbutton);

			   Thread.sleep(2500);
		 
	  	   
     /********************************************************************Populate data for monday first activity *************************************************************************************/
			   
			    /***********For now this case pending due to ID not uniques***/
		 }
	}
	 
	
