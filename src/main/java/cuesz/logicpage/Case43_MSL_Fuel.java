	package cuesz.logicpage;
	
	import java.text.ParseException;
	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
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
		private By fatInput = (By.id("FuelRecFat-Monday"));
		private By carbInput = (By.id("FuelRecCarbs-Monday"));
		private By protinInput = (By.id("FuelRecProtein-Monday"));
		private By calorisSpan = (By.xpath("//div[@class='col-6']/span[text()='Rec Calories (kcal)']"));
		private By calriInput = (By.id("FuelRecCalories-Monday"));
					
		
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
		  //      utils.navigateToLastAndNextWeek();
		    
	   		   driver.findElement(By.xpath("//span[normalize-space()='Next Week']")).click();
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
			   
			// Replace "FuelActivityType-Monday" with the actual ID of your dropdown
			   String dropdownId = "FuelActivityType-Monday";
			   // Find the dropdown element by ID
			   WebElement dropdown = driver.findElement(By.id(dropdownId));
			   // Click on the dropdown to open the options
			   dropdown.click();
			   // Wait for the options to become visible
			   WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));
			   WebElement recoveryDayOption = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='FuelActivityType-Monday']//div[text()='Recovery Day']")));
			   // Create an Actions object to perform mouse hover
			   Actions actions = new Actions(driver);
			   // Hover over the "Recovery Day" option
			   actions.moveToElement(recoveryDayOption).perform();
			   // Click on the "Recovery Day" option to select it
			   recoveryDayOption.click();
			   
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
		        
			   // Replace "FuelMealList-Monday" with the actual ID of your dropdown
			   String dropdownId1 = "FuelMealList-Monday";
			   // Find the dropdown element by ID
			   WebElement dropdown1 = driver.findElement(By.id(dropdownId1));
			   // Click on the dropdown to open the options
			   dropdown1.click();
			   // Wait for the options to become visible
			   WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(50));
			   // Replace "Breakfast" with the option you want to select
			   String optionText = "Breakfast";
			   WebElement option = wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='" + dropdownId1 + "']//div[text()='" + optionText + "']")));
			   // Click on the "Breakfast" option to select it
			   option.click();

			  // Replace "FuelOptionFirst_1-Monday" with the actual ID of your input element
			   String inputElementId = "FuelOptionFirst_1-Monday";
			   // Find the input element by ID
			   WebElement inputElement = driver.findElement(By.id(inputElementId));
			   // Click on the input element to open the dropdown
			   inputElement.click();
			   // Replace "Apple" with your search value
			   String searchValue = "Apple";
			   // Locate the input field for search and enter the search value
			   WebElement searchInput = driver.findElement(By.xpath("//input[@aria-autocomplete='list']"));
			   searchInput.sendKeys(searchValue);
			   // Wait for the updated options to become visible
			   WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(50));
			   By optionLocator = By.xpath("//div[@class='react-select__menu-list']//label[contains(text(), '" + searchValue + "')]");
			   WebElement option1 = wait3.until(ExpectedConditions.visibilityOfElementLocated(optionLocator));
			   // Click on the specific option you want
			   option1.click();

	   
			   
			   
			   Thread.sleep(2500);
			   
			   

			   
			   
			   
			   

			 
			   
			   
		    
			   
			   
		 }
	}
	 
	
