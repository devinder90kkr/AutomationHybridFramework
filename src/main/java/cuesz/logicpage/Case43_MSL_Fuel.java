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
		private By activtytpe = (By.id("FuelActivityType-Monday"));
		private By fatInput = (By.id("FuelRecFat-Monday"));
		private By carbInput = (By.id("FuelRecCarbs-Monday"));
		private By protinInput = (By.id("FuelRecProtein-Monday"));
		private By calorisSpan = (By.xpath("//div[@class='col-6']/span[text()='Rec Calories (kcal)']"));
		private By calriInput = (By.id("FuelRecCalories-Monday"));
		private By mealist= (By.id("FuelMealList-Monday"));
		private By optionprimary1 = (By.id("FuelOptionFirst_1-Monday"));
		
					
		
		public Case43_MSL_Fuel(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}
		
		 @Test
		    public void Fuel() throws InterruptedException, ParseException {
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
		  	   WebElement Fuelheading = driver.findElement(fuelcrad);
		       // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);;", Fuelheading);
			     		
			   Thread.sleep(5500);				// Wait for the element to be clickable
			   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); // Adjust the timeout as needed
			   WebElement Performnoteplus = wait.until(ExpectedConditions.elementToBeClickable(Fulplus));
			   Performnoteplus.click();
			   		
			   Thread.sleep(5500);
			   // Example usage:
			   WebElement selectbutton = driver.findElement(selectbton);
			   // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", selectbutton);

			   Thread.sleep(2500);
		 
	  	   
     /********************************************************************Populate data for monday first activity *************************************************************************************/
			   
			   // select Activity type for fuel 
			   WebElement Activittype = driver.findElement(activtytpe);
			   Actions builder = new Actions(driver);
			   builder.moveToElement(Activittype).click().sendKeys("Live Perform Day").perform();
			   Thread.sleep(2000);
			   builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			  
			   // Input values for Fats, Carbs, and Protein
		        WebElement fatsInput = driver.findElement(fatInput);
		        fatsInput.clear();
		        fatsInput.sendKeys("50"); // Set your desired value
		        
		        WebElement carbsInput = driver.findElement(carbInput);
		        carbsInput.clear();
		        carbsInput.sendKeys("180"); // Set your desired value
		        
		        WebElement proteinInput = driver.findElement(protinInput);
		        proteinInput.clear();
		        proteinInput.sendKeys("80"); // Set your desired value
		        
		        // Extract the value for Calories
		        WebElement caloriesSpan = driver.findElement(calorisSpan);
		        WebElement caloriesInput = driver.findElement(calriInput);
		        String caloriesValue = caloriesInput.getAttribute("value");
		        
		        System.out.println("Calories: " + caloriesValue);
			      
			   /*********/
			   
			   
		        // select Activity type for fuel 
			   WebElement meallist = driver.findElement(mealist);
			// Create an Actions object
		        Actions actions = new Actions(driver);
		        // Hover over the desired options
		        WebElement breakfastOption = driver.findElement(By.id("react-select-490-option-0"));
		        actions.moveToElement(breakfastOption).perform();
			   Thread.sleep(2500);
			   
			// Find the input field
		        WebElement inputField = driver.findElement(optionprimary1); // Replace with the actual locator
		        // Enter the first value ("Buckwheat")
		        inputField.sendKeys("Buckwheat");

		        // Wait for the dropdown options to appear (adjust the timeout as needed)
		        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));
		        WebElement dropdownOption = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Buckwheat')]"))); // Replace with the actual locator

		        // Click on the desired option (you can loop through options for multi-select)
		        dropdownOption.click();
			   
		        Thread.sleep(2500);
			   
			   
			   
			   

			 
			   
			   
		    
			   
			   
		 }
	}
	 
	
