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
	   		driver.findElement(By.xpath("//span[normalize-space()='Next Week']")).click();
		        Thread.sleep(2000);		
		  	        
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
			   
			// Locate the element by its class name (replace 'FuelOptionFirst_1-Monday' with the actual class name)

			   // Locate the React Select element by its CSS selector
		        WebElement reactSelect = driver.findElement(By.cssSelector("div.FuelOptionFirst_1-Monday.react-select__control"));

		        // Click on the React Select to open the dropdown
		        reactSelect.click();

		        // Wait for the dropdown to appear (you may need to adjust the timeout)
		        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5500));
		        WebElement dropdown = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.FuelOptionFirst_1-Monday.react-select__menu")));

		        //		        WebElement inputField = driver.findElement(By.cssSelector("div.react-select__input-container input[type='text']"));
		        WebElement inputField = driver.findElement(By.xpath("//div[@class='FuelOptionFirst_1-Monday react-select__indicators css-1wy0on6']"));
		        //Explicitly wait for the input field to be clickable
		        WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(4500));
		        wait11.until(ExpectedConditions.elementToBeClickable(inputField));
		        


		        // Clear any existing value and enter your desired value
//		        inputField.clear();
		        inputField.sendKeys("Apple Greeb");

		        // Use Actions class to send the Tab key to select the option
		        Actions actions = new Actions(driver);
		        actions.sendKeys(inputField, Keys.TAB).perform();
			   
Thread.sleep(2500);
		        
			 
			   
			   
		    
			   
			   
		 }
	}
	 
	
