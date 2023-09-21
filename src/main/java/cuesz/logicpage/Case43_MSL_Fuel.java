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
	import cuesz.utils.SeleniumUtils;
	
	public class Case43_MSL_Fuel extends BasePage {
		
		SeleniumUtils utils = new SeleniumUtils(driver);
		private By fuelcrad = (By.id("FuelCard"));
		private By Fulplus= (By.xpath("//button[@data-bs-target='#FuelToTrain']"));
		private By selectbton = (By.xpath("//div[@id='FuelCard']//div[@class='d-flex justify-content-end calender_drop']//button[1]"));
		public Case43_MSL_Fuel(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}
		
		 @Test
		    public void Fuel() throws InterruptedException, ParseException {
		        Thread.sleep(2000);
	
		        utils.clickMembersummary();
		        utils.waitForMilliseconds(2000);
		        utils.enterSearchText();
		        utils.clickMembername();
	
	   		   /***********************************landed on Logic page ***************************************************************************************************/
	   		   Thread.sleep(2000);
	   		   WebElement Logicbutton =   driver.findElement(By.xpath("//span[normalize-space()='Logic Page']"));
	   		   Logicbutton.click();

	   /****************************************Click on next & previous button and get week*****************************************************************************************************/        
	   		// Use the next&	previous utility method
		  //      utils.navigateToLastAndNextWeek();
		    
	   		   driver.findElement(By.xpath("//span[normalize-space()='Next Week']")).click();
	   
		      
	 /***************************************Click on Perfom and scroll******************************************************************************************/
		  	   Thread.sleep(5500);
		  	   WebElement Fuelheading = driver.findElement(fuelcrad);
		       // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);;", Fuelheading);
			     		
			   Thread.sleep(5500);				// Wait for the element to be clickable
			   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000)); // Adjust the timeout as needed
			   WebElement Performnoteplus = wait.until(ExpectedConditions.elementToBeClickable(Fulplus));
			   Performnoteplus.click();
			   		
			   Thread.sleep(5500);
			   // Example usage:
			   WebElement selectbutton = driver.findElement(selectbton);
			   // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", selectbutton);

			   Thread.sleep(2500);
		 
	  	   
     /********************************************************************Populate data for monday first activity *************************************************************************************/
			   
		   
//		        https://chat.openai.com/share/68e7bc08-e866-4816-b311-cdcc35405dea
		        
			   try {
		            // Locate the input field
		            WebElement inputField = driver.findElement(By.xpath("//div[@class='FuelOptionFirst_1-Monday react-select__input']/input"));
		            // Enter values into the input field
		            inputField.sendKeys("Apple green");
		            // Wait for a moment (optional)
		            Thread.sleep(1000);
		            // Simulate pressing the Enter key
		            inputField.sendKeys(Keys.ENTER);
		         
		            // Clear the input field to enter the second value
		            inputField.clear();
		            
		            
		         // Enter the second value "Curd" into the input field
		            inputField.sendKeys("bacon");

		            // Wait for a moment (optional)
		            Thread.sleep(1000);

		            // Simulate pressing the Enter key to select the second value
		            inputField.sendKeys(Keys.ENTER);
		            // Wait for a moment (optional)
		            Thread.sleep(1000);
		    
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        } finally {
			   
			   
			   
			   Thread.sleep(2500);
		        
			 
			   
			   
		    
			   
			   
		 }
	}
	}
	 
	
