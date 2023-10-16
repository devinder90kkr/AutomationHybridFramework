	package cuesz.logicpage;
	
	import java.text.ParseException;
	import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
import cuesz.utils.AllureUtils;
import cuesz.utils.Currentdategenerator;
import cuesz.utils.DatePickerUtility_logicpage;
import cuesz.utils.SeleniumUtils;
	
	public class Case43_MSL_Fuel extends BasePage {
		
		SeleniumUtils utils = new SeleniumUtils(driver);
		private By fuelcrad = 		(By.id("FuelCard"));
		private By Fulplus= 		(By.xpath("//button[@data-bs-target='#FuelToTrain']"));
		private By selectbton = 	(By.xpath("//div[@id='FuelCard']//div[@class='d-flex justify-content-end calender_drop']//button[1]"));
		private By logibttn =	(By.xpath("//span[normalize-space()='Logic Page']"));
		private By fatfild =	(By.id("FuelRecFat-Monday"));
		private By carbfild	= 	(By.id("FuelRecCarbs-Monday"));
		private By Prteinfeld	= (By.id("FuelRecProtein-Monday"));
		private By inputFeld = (By.xpath("//div[@class='FuelOptionFirst_1-Monday react-select__input']/input"));
		private By inputFeld1 = (By.xpath("//div[@class='FuelOptionSecond_1-Monday react-select__input']/input"));
		private By inputFeld2 = (By.xpath("//div[@class='FuelOptionFirst_2-Monday react-select__input']/input"));
		private By inputFeld3 = (By.xpath("//div[@class='FuelOptionFirst_3-Monday react-select__input']/input"));
		private By inputFeld4 = (By.xpath("//div[@class='FuelOptionSecond_3-Monday react-select__input']/input"));
		private By inputFeld5 = (By.xpath("//div[@class='FuelOptionFirst_4-Monday react-select__input']/input"));
		private By hydTarget	= (By.id("hydration_fuel-Monday"));
		private By 	electrTarget	= (By.id("Electrolyte_fuel-Monday"));
		private By 	Tequilatarget	= (By.id("Tequila_Alcoholfuel-Monday"));
		private By Lagertarget		= (By.id("Lager_Alcoholfuel-Monday"));
		private By 	redwinetarget	= (By.id("Red Wine_Alcoholfuel-Monday"));
		private By Mojitotarget		= (By.id("Mojito_Alcoholfuel-Monday"));
		private By Coffeetarget		= (By.id("Coffee_Caffeinefuel-Monday"));
		private By sugarcradio		= (By.name("Sugar"));
		private By sveysbttn	 	= (By.xpath("(//button[normalize-space()='Yes'])[1]"));
		private By Cpybttn 			= (By.xpath("//h2[@id='FuelCard']//button[@id='SelectCopy']"));   
		private By slctBttn4 		= (By.id("SelectWeekFuelCard"));
		
		
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
	   		   WebElement Logicbutton =   driver.findElement(logibttn);
	   		   Logicbutton.click();

	   		   /****************************************Click on next & previous button and get week*****************************************************************************************************/        
	   		   // Use the next&	previous utility method
	   		   //      utils.navigateToLastAndNextWeek();
		    
	   		   driver.findElement(By.xpath("//span[normalize-space()='Next Week']")).click();
	   		 driver.findElement(By.xpath("//span[normalize-space()='Next Week']")).click();
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
			   AllureUtils.captureScreenshot(driver, "day1");
			   try {
		            // Define individual dropdown IDs and corresponding option texts
		            String[][] dropdownOptions = {
		                {"FuelActivityType-Monday", "Perform Activity Day", "Recovery Day", "Live Perform Day"},            
		            };

		            // Click on "CorrelationAnalysisDuration" first
		            String dropdownIdDuration = "FuelActivityType-Monday";
		            WebElement dropdownElementDuration = wait.until(ExpectedConditions.elementToBeClickable(By.id(dropdownIdDuration)));
		            dropdownElementDuration.click();
		            Thread.sleep(2000);

		            for (int i = 1; i < dropdownOptions[0].length; i++) {
		                String optionText = dropdownOptions[0][i];
		                Thread.sleep(1000);
		                WebElement optionElement1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='" + dropdownIdDuration + "']//div[contains(text(), '" + optionText + "')]")));

		                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", optionElement1);
		                optionElement1.click();
		                // Close the dropdown after selecting an option
		                dropdownElementDuration.click();
		                Thread.sleep(1000);
		            }} catch (Exception e) {
					    e.printStackTrace();
					} finally {
					    // Your finally block code here (optional)
					}
		 			   
			   AllureUtils.captureScreenshot(driver, "day");
			   
   /*********************************Input optimal values for carbs,fats and proteins******************************************************************************************************************/
     
			   
			   
			  
			   Thread.sleep(3500);
			   AllureUtils.captureScreenshot(driver, "Optimal");
			   try {
			       // Enter values for fat fields
			       WebElement fatsfield = driver.findElement(fatfild);

			       // Check if values exist, and if so, clear them
			       if (!fatsfield.getAttribute("value").isEmpty()) {
			    	   fatsfield.clear();		           
			       }

			       // Ensure the input field has focus
			       fatsfield.click();  // Click to focus
			       // Enter the new value
			       fatsfield.sendKeys("45");

			       
			       Thread.sleep(3500);
			       // Repeat the same process for carbs and protein fields
			       WebElement carbsfield = driver.findElement(carbfild);
			       if (!carbsfield.getAttribute("value").isEmpty()) {
			    	   carbsfield.clear();		    	  
			       }
			       // Ensure the input field has focus
			       carbsfield.click();  // Click to focus
			       carbsfield.sendKeys("210");
			     
			       Thread.sleep(3500);
			       WebElement Proteinfield = driver.findElement(Prteinfeld);
			       if (!Proteinfield.getAttribute("value").isEmpty()) {
			    	   Proteinfield.clear();
			       }
			       // Ensure the input field has focus
			       Proteinfield.click();  // Click to focus
			       Proteinfield.sendKeys("175");
			       	       
			   } catch (Exception e) {
			       e.printStackTrace();
			   } finally {
			       // Your finally block code here (optional)
			   }
		   
			   AllureUtils.captureScreenshot(driver, "Optimal1");
		       
	/*********************************Input values for option 1 primary  breakfast field**********************************************************/
//		        https://chat.openai.com/share/68e7bc08-e866-4816-b311-cdcc35405dea
			   
			   Thread.sleep(3500);
			   try {
		            // Locate the input field
		            WebElement inputField = driver.findElement(inputFeld);
		            // Enter values into the input field
		            inputField.sendKeys("Mushrooms Cooked");
		            Thread.sleep(3500);
		            // Simulate pressing the Enter key
		            inputField.sendKeys(Keys.ENTER); 

		            // Clear the input field to enter the second value
		            inputField.clear();
		            
		            Thread.sleep(1000);
		         // Enter the second value "Curd" into the input field
		            inputField.sendKeys("Blueberries");
		            Thread.sleep(3500);
		            // Simulate pressing the Enter key to select the second value
		            inputField.sendKeys(Keys.ENTER);
		            // Wait for a moment (optional)
		            Thread.sleep(1000);
		    
			   } catch (Exception e) {
				    e.printStackTrace();
				} finally {
				    // Your finally block code here (optional)
				}
		
			   Thread.sleep(3500);
	   /***********************************************Input values for option 1 Secondary breakfast field*****************************************/
			   
//			   try {
//		            // Locate the input field
//		            WebElement inputField = driver.findElement(inputFeld1);
//		            // Enter values into the input field
//		            inputField.sendKeys("Pizza");		
//		            Thread.sleep(3500);
//		            // Simulate pressing the Enter key
//		            inputField.sendKeys(Keys.ENTER);
//		      
//
//		            // Clear the input field to enter the second value
//		            inputField.clear();
//		            Thread.sleep(2500);
//		            
//		          // Enter the second value "Curd" into the input field
//		            inputField.sendKeys("Kiwi");	
//		            Thread.sleep(3500);
//		            // Simulate pressing the Enter key to select the second value
//		            inputField.sendKeys(Keys.ENTER);
//		            // Wait for a moment (optional)
//		            Thread.sleep(3500);
//		    
//			   } catch (Exception e) {
//				    e.printStackTrace();
//				} finally {
//				    // Your finally block code here (optional)
//				}
//		 
//			   Thread.sleep(3500);
//	   /******************************Input values for option 2 primary breakfast field*****************************************/
			   
			   try {
		            // Locate the input field
		            WebElement inputField = driver.findElement(inputFeld2);
		            // Enter values into the input field
		            inputField.sendKeys("walnuts");
		            Thread.sleep(3500);
		            // Simulate pressing the Enter key
		            inputField.sendKeys(Keys.ENTER);
          	    
			   } catch (Exception e) {
				    e.printStackTrace();
				} finally {
				    // Your finally block code here (optional)
				}
			   Thread.sleep(3500);
			   
			   AllureUtils.captureScreenshot(driver, "breakfastend");
			   
		/********************************************now move to EarlySnacks*************************************************/	 
		 
			   
			   try {
		            // Define individual dropdown IDs and corresponding option texts
		            String[][] dropdownOptions = {
		                {"FuelMealList-Monday", "Early Snacks"},            
		            };

		            // Click on "CorrelationAnalysisDuration" first
		            String dropdownIdDuration = "FuelMealList-Monday";
		            WebElement dropdownElementDuration = wait.until(ExpectedConditions.elementToBeClickable(By.id(dropdownIdDuration)));
		            dropdownElementDuration.click();
		            Thread.sleep(2000);

		            for (int i = 1; i < dropdownOptions[0].length; i++) {
		                String optionText = dropdownOptions[0][i];
		                Thread.sleep(1000);
		                WebElement optionElement1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='" + dropdownIdDuration + "']//div[contains(text(), '" + optionText + "')]")));

		                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", optionElement1);
		                optionElement1.click();
		                // Close the dropdown after selecting an option
		                dropdownElementDuration.click();
		                dropdownElementDuration.click();
		                Thread.sleep(1000);
		            }} catch (Exception e) {
					    e.printStackTrace();
					} finally {
					   
					}
			   Thread.sleep(4500);
	
			   AllureUtils.captureScreenshot(driver, "EarlySnacks");
	 /******************************Input values for option 1 primary  Early Snacks field*****************************************/
			   
			   try {
		            // Locate the input field
		            WebElement inputField = driver.findElement(inputFeld);
		            // Enter values into the input field
		            inputField.sendKeys("Gluten Free bread");
		            Thread.sleep(3500);
		            // Simulate pressing the Enter key
		            inputField.sendKeys(Keys.ENTER);
		         
		            // Clear the input field to enter the second value
		            inputField.clear();
		            Thread.sleep(1000);              
		         // Enter the second value "Curd" into the input field
		            inputField.sendKeys("Almond milk");
		            Thread.sleep(3500);
		            // Simulate pressing the Enter key to select the second value
		            inputField.sendKeys(Keys.ENTER);
		            // Wait for a moment (optional)
		            Thread.sleep(3000);
		    
			   } catch (Exception e) {
				    e.printStackTrace();
				} finally {
				    // Your finally block code here (optional)
				}   

    /******************************Input values for option 2 EarlySnacks field**********************************************************/
			     Thread.sleep(3000);
			   try {
		            // Locate the input field
		            WebElement inputField = driver.findElement(inputFeld2);
		            // Enter values into the input field
		            inputField.sendKeys("boiled egg");
		            Thread.sleep(3500);
		            // Simulate pressing the Enter key
		            inputField.sendKeys(Keys.ENTER);
          	    
			   } catch (Exception e) {
				    e.printStackTrace();
				} finally {
				    // Your finally block code here (optional)
				}
			    Thread.sleep(3000);

	/******************************Input values for option 3 EarlySnacks field***************************************************************************/
			   
			   try {
		            // Locate the input field
		            WebElement inputField = driver.findElement(inputFeld3);
		            // Enter values into the input field
		            inputField.sendKeys("Dark Chocolate");
		            Thread.sleep(3500);
		            // Simulate pressing the Enter key
		            inputField.sendKeys(Keys.ENTER);
          	    
			   } catch (Exception e) {
				    e.printStackTrace();
				} finally {
				    // Your finally block code here (optional)
				}
			   
			   Thread.sleep(2000);
			   AllureUtils.captureScreenshot(driver, "EarlySnacksend");
			   
	/********************************************now move to Lunch *************************************************/	 
				 
			   try {
		            // Define individual dropdown IDs and corresponding option texts
		            String[][] dropdownOptions = {
		                {"FuelMealList-Monday", "Lunch"},            
		            };

		            // Click on "CorrelationAnalysisDuration" first
		            String dropdownIdDuration = "FuelMealList-Monday";
		            WebElement dropdownElementDuration = wait.until(ExpectedConditions.elementToBeClickable(By.id(dropdownIdDuration)));
		            dropdownElementDuration.click();
		            Thread.sleep(2000);

		            for (int i = 1; i < dropdownOptions[0].length; i++) {
		                String optionText = dropdownOptions[0][i];
		                Thread.sleep(1000);
		                WebElement optionElement1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='" + dropdownIdDuration + "']//div[contains(text(), '" + optionText + "')]")));

		                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", optionElement1);
		                optionElement1.click();
		                // Close the dropdown after selecting an option
		                dropdownElementDuration.click();
		                dropdownElementDuration.click();
		                Thread.sleep(1000);
		            }} catch (Exception e) {
					    e.printStackTrace();
					} finally {
					   
					}
			   Thread.sleep(4500);		   
			  
			   AllureUtils.captureScreenshot(driver, "Lunch");
		 /******************************Input values for option 1 primary Lunch field*****************************************/
			   
			   try {
		            // Locate the input field
		            WebElement inputField = driver.findElement(inputFeld);
		            // Enter values into the input field
		            inputField.sendKeys("Cauliflower");
		            Thread.sleep(3500);
		            // Simulate pressing the Enter key
		            inputField.sendKeys(Keys.ENTER);
		         
		            // Clear the input field to enter the second value
		            inputField.clear();
		            
		            Thread.sleep(1000);   	            
		         
		            // Enter the second value "Curd" into the input field
		            inputField.sendKeys("Meat");
		            Thread.sleep(3500);
		            // Simulate pressing the Enter key to select the second value
		            inputField.sendKeys(Keys.ENTER);
		            // Wait for a moment (optional)
		            Thread.sleep(3000);
		    
			   } catch (Exception e) {
				    e.printStackTrace();
				} finally {
				    // Your finally block code here (optional)
				}   

    /******************************Input values for option 2 Lunch field**********************************************************/
			     Thread.sleep(3000);
			   try {
		            // Locate the input field
		            WebElement inputField = driver.findElement(inputFeld2);
		            // Enter values into the input field
		            inputField.sendKeys("avocado");
		            Thread.sleep(3500);	    
		            // Simulate pressing the Enter key
		            inputField.sendKeys(Keys.ENTER);
          	    
			   } catch (Exception e) {
				    e.printStackTrace();
				} finally {
				    // Your finally block code here (optional)
				}
			    Thread.sleep(3000);

	/******************************Input values for option 3 Lunch field***************************************************************************/
			   
			   try {
		            // Locate the input field
		            WebElement inputField = driver.findElement(inputFeld3);
		            // Enter values into the input field
		            inputField.sendKeys("rice");
		            Thread.sleep(3500);
		            // Simulate pressing the Enter key
		            inputField.sendKeys(Keys.ENTER);
          	    
			   } catch (Exception e) {
				    e.printStackTrace();
				} finally {
				    // Your finally block code here (optional)
				}
			   
			   Thread.sleep(2000);
			   
			   
/******************************Input values for option 3 Lunch secondary field***************************************************************************/
			   
			   try {
		            // Locate the input field
		            WebElement inputField = driver.findElement(inputFeld4);
		            // Enter values into the input field
		            inputField.sendKeys("fish");
		            Thread.sleep(3500);
		            // Simulate pressing the Enter key
		            inputField.sendKeys(Keys.ENTER);
		            
		            // Clear the input field to enter the second value
		            inputField.clear();
		            
		            Thread.sleep(1000);  	            
		         // Enter the second value "Curd" into the input field
		            inputField.sendKeys("Goetta");
		            Thread.sleep(3500);
		            // Simulate pressing the Enter key to select the second value
		            inputField.sendKeys(Keys.ENTER);
		            // Wait for a moment (optional)
		            Thread.sleep(3000);
          	    
			   } catch (Exception e) {
				    e.printStackTrace();
				} finally {
				    // Your finally block code here (optional)
				}
			   
			   Thread.sleep(2000);
			   
			   
/******************************Input values for option 4 Lunch Primary field***************************************************************************/
			   
			   try {
		            // Locate the input field
		            WebElement inputField = driver.findElement(inputFeld5);
		            // Enter values into the input field
		            inputField.sendKeys("Carrots");
		            Thread.sleep(3500);
		            // Simulate pressing the Enter key
		            inputField.sendKeys(Keys.ENTER);
		            
		            // Clear the input field to enter the second value
		            inputField.clear();
		            
		            Thread.sleep(1000);          
		         // Enter the second value "Curd" into the input field
		            inputField.sendKeys("hazelnuts");
		            Thread.sleep(3500);
		            // Simulate pressing the Enter key to select the second value
		            inputField.sendKeys(Keys.ENTER);
		            // Wait for a moment (optional)
		            Thread.sleep(3000);
          	    
			   } catch (Exception e) {
				    e.printStackTrace();
				} finally {
				    // Your finally block code here (optional)
				}
			   
			   Thread.sleep(2000);
	
			   AllureUtils.captureScreenshot(driver, "Lunchend");
	  /********************************************now move to LateSnacks *************************************************/	 
				 
			   try {
		            // Define individual dropdown IDs and corresponding option texts
		            String[][] dropdownOptions = {
		                {"FuelMealList-Monday", "Late Snacks"},            
		            };

		            // Click on "CorrelationAnalysisDuration" first
		            String dropdownIdDuration = "FuelMealList-Monday";
		            WebElement dropdownElementDuration = wait.until(ExpectedConditions.elementToBeClickable(By.id(dropdownIdDuration)));
		            dropdownElementDuration.click();
		            Thread.sleep(2000);

		            for (int i = 1; i < dropdownOptions[0].length; i++) {
		                String optionText = dropdownOptions[0][i];
		                Thread.sleep(1000);
		                WebElement optionElement1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='" + dropdownIdDuration + "']//div[contains(text(), '" + optionText + "')]")));

		                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", optionElement1);
		                optionElement1.click();
		                // Close the dropdown after selecting an option
		                dropdownElementDuration.click();
		                dropdownElementDuration.click();
		                Thread.sleep(1000);
		            }} catch (Exception e) {
					    e.printStackTrace();
					} finally {
					   
					}
			   Thread.sleep(4500);		  
			   
			   AllureUtils.captureScreenshot(driver, "LateSnacks");
	 /******************************Input values for option 1 primary LateSnacks field*****************************************/
			   
			   try {
		            // Locate the input field
		            WebElement inputField = driver.findElement(inputFeld);
		            // Enter values into the input field
		            inputField.sendKeys("Swordfish");
		            Thread.sleep(3500);
		            // Simulate pressing the Enter key
		            inputField.sendKeys(Keys.ENTER);
		         
		            // Clear the input field to enter the second value
		            inputField.clear();
		            
		            Thread.sleep(1000);   	            
		         // Enter the second value "Curd" into the input field
		            inputField.sendKeys("peanuts");
		            Thread.sleep(3500);
		            // Simulate pressing the Enter key to select the second value
		            inputField.sendKeys(Keys.ENTER);
		            // Wait for a moment (optional)
		            Thread.sleep(3000);
		    
			   } catch (Exception e) {
				    e.printStackTrace();
				} finally {
				    // Your finally block code here (optional)
				}   

    /******************************Input values for option 2 LateSnacks field**********************************************************/
			     Thread.sleep(3000);
			   try {
		            // Locate the input field
		            WebElement inputField = driver.findElement(inputFeld2);
		            // Enter values into the input field
		            inputField.sendKeys("peanuts");
		            Thread.sleep(3500);
		            // Simulate pressing the Enter key
		            inputField.sendKeys(Keys.ENTER);
          	    
			   } catch (Exception e) {
				    e.printStackTrace();
				} finally {
				    // Your finally block code here (optional)
				}
			    Thread.sleep(3000);

	/******************************Input values for option 3 LateSnacks field***************************************************************************/
			   
			   try {
		            // Locate the input field
		            WebElement inputField = driver.findElement(inputFeld3);
		            // Enter values into the input field
		            inputField.sendKeys("garden of Life");
		            Thread.sleep(3500);
		            // Simulate pressing the Enter key
		            inputField.sendKeys(Keys.ENTER);
          	    
			   } catch (Exception e) {
				    e.printStackTrace();
				} finally {
				    // Your finally block code here (optional)
				}
			   
			   Thread.sleep(2000);
			   AllureUtils.captureScreenshot(driver, "LateSnacksend");
		
			   /********************************************now move to Dinner *************************************************/	 
				 
			   try {
		            // Define individual dropdown IDs and corresponding option texts
		            String[][] dropdownOptions = {
		                {"FuelMealList-Monday", "Dinner"},            
		            };

		            // Click on "CorrelationAnalysisDuration" first
		            String dropdownIdDuration = "FuelMealList-Monday";
		            WebElement dropdownElementDuration = wait.until(ExpectedConditions.elementToBeClickable(By.id(dropdownIdDuration)));
		            dropdownElementDuration.click();
		            Thread.sleep(2000);

		            for (int i = 1; i < dropdownOptions[0].length; i++) {
		                String optionText = dropdownOptions[0][i];
		                Thread.sleep(1000);
		                WebElement optionElement1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='" + dropdownIdDuration + "']//div[contains(text(), '" + optionText + "')]")));

		                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", optionElement1);
		                optionElement1.click();
		                // Close the dropdown after selecting an option
		                dropdownElementDuration.click();
		                dropdownElementDuration.click();
		                Thread.sleep(1000);
		            }} catch (Exception e) {
					    e.printStackTrace();
					} finally {
					   
					}
			   Thread.sleep(4500);		  		   
			   AllureUtils.captureScreenshot(driver, "Dinner");
	
 /******************************Input values for option 1 primary Dinner field*****************************************/
			   
			   try {
		            // Locate the input field
		            WebElement inputField = driver.findElement(inputFeld);
		            // Enter values into the input field
		            inputField.sendKeys("Cauliflower");
		            Thread.sleep(3500);
		            // Simulate pressing the Enter key
		            inputField.sendKeys(Keys.ENTER);
		         
		            // Clear the input field to enter the second value
		            inputField.clear();
		            
		            Thread.sleep(1000);   	            
		         // Enter the second value "Curd" into the input field
		            inputField.sendKeys("Meat");
		            Thread.sleep(3500);
		            // Simulate pressing the Enter key to select the second value
		            inputField.sendKeys(Keys.ENTER);
		            // Wait for a moment (optional)
		            Thread.sleep(3000);
		    
			   } catch (Exception e) {
				    e.printStackTrace();
				} finally {
				    // Your finally block code here (optional)
				}   

    /******************************Input values for option 2 Dinner field**********************************************************/
			     Thread.sleep(3000);
			   try {
		            // Locate the input field
		            WebElement inputField = driver.findElement(inputFeld2);
		            // Enter values into the input field
		            inputField.sendKeys("avocado");
		            Thread.sleep(3500);
		            // Simulate pressing the Enter key
		            inputField.sendKeys(Keys.ENTER);
          	    
			   } catch (Exception e) {
				    e.printStackTrace();
				} finally {
				    // Your finally block code here (optional)
				}
			    Thread.sleep(3000);

	/******************************Input values for option 3 Dinner field***************************************************************************/
			   
			   try {
		            // Locate the input field
		            WebElement inputField = driver.findElement(inputFeld3);
		            // Enter values into the input field
		            inputField.sendKeys("rice");
		            Thread.sleep(3500);
		            // Simulate pressing the Enter key
		            inputField.sendKeys(Keys.ENTER);
          	    
			   } catch (Exception e) {
				    e.printStackTrace();
				} finally {
				    // Your finally block code here (optional)
				}
			   
			   Thread.sleep(2000);
			   
			   
/******************************Input values for option 3 Dinner secondary field***************************************************************************/
			   
			   try {
		            // Locate the input field
		            WebElement inputField = driver.findElement(inputFeld4);
		            // Enter values into the input field
		            inputField.sendKeys("fish");
		            Thread.sleep(3500);
		            // Simulate pressing the Enter key
		            inputField.sendKeys(Keys.ENTER);
		            
		            // Clear the input field to enter the second value
		            inputField.clear();
		            
		            Thread.sleep(1000);  	            
		         // Enter the second value "Curd" into the input field
		            inputField.sendKeys("Goetta");
		            Thread.sleep(3500);
		            // Simulate pressing the Enter key to select the second value
		            inputField.sendKeys(Keys.ENTER);
		            // Wait for a moment (optional)
		            Thread.sleep(3000);
          	    
			   } catch (Exception e) {
				    e.printStackTrace();
				} finally {
				    // Your finally block code here (optional)
				}
			   
			   Thread.sleep(2000);
			   
			   
/******************************Input values for option 4 Dinner Primary field***************************************************************************/
			   
			   try {
		            // Locate the input field
		            WebElement inputField = driver.findElement(inputFeld5);
		            // Enter values into the input field
		            inputField.sendKeys("Carrots");
		            Thread.sleep(3500);
		            // Simulate pressing the Enter key
		            inputField.sendKeys(Keys.ENTER);
		            
		            // Clear the input field to enter the second value
		            inputField.clear();
		            
		            Thread.sleep(1000);          
		         // Enter the second value "Curd" into the input field
		            inputField.sendKeys("hazelnuts");
		            Thread.sleep(3500);
		            // Simulate pressing the Enter key to select the second value
		            inputField.sendKeys(Keys.ENTER);
		            // Wait for a moment (optional)
		            Thread.sleep(3000);
          	    
			   } catch (Exception e) {
				    e.printStackTrace();
				} finally {
				    // Your finally block code here (optional)
				}
			   
			   Thread.sleep(2000);	   
			   
			   AllureUtils.captureScreenshot(driver, "Dinnerend");
			   
			   /*Enter values for HydrationTarget*/
			    Thread.sleep(2000);
			    
			    // Scroll to the HydrationTarget element
			    WebElement HydrationTarget = driver.findElement(hydTarget);
			    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", HydrationTarget);
			    Thread.sleep(2000);
			    // Now you can interact with the HydrationTarget element
			    Actions builder1 = new Actions(driver);			    
			    builder1.moveToElement(HydrationTarget).click().sendKeys("3 Glasses").perform();
			    Thread.sleep(2000);
			    builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

			    Thread.sleep(2000);				   
			    /*Enter values for Electrolyte Target*/
			    Thread.sleep(2000);
			    WebElement ElectrolyteTarget =driver.findElement(electrTarget);
			    Actions builder2 = new Actions(driver);
			    builder2.moveToElement(ElectrolyteTarget).click().sendKeys("2").perform();
			    Thread.sleep(2000);
			    builder2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			    
//			    Thread.sleep(2000);				   
//			    /*Enter values for Tequila*/
//			    Thread.sleep(2000);
//			    WebElement Tequila =driver.findElement(Tequilatarget);
//			    Actions builder3 = new Actions(driver);
//			    builder3.moveToElement(Tequila).click().sendKeys("5").perform();
//			    Thread.sleep(2000);
//			    builder3.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			    
//			    Thread.sleep(2000);				   
//			    /*Enter values for Lager*/
//			    Thread.sleep(2000);
//			    WebElement Lager =driver.findElement(Lagertarget);
//			    Actions builder4 = new Actions(driver);
//			    builder4.moveToElement(Lager).click().sendKeys("3").perform();
//			    Thread.sleep(2000);
//			    builder4.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
//			    
//			    Thread.sleep(2000);				   
//			    /*Enter values for redwine*/
//			    Thread.sleep(2000);
//			    WebElement redwine =driver.findElement(redwinetarget);
//			    Actions builder5 = new Actions(driver);
//			    builder5.moveToElement(redwine).click().sendKeys("3").perform();
//			    Thread.sleep(2000);
//			    builder5.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
//			    
//			    Thread.sleep(2000);				   
//			    /*Enter values for Mojito*/
//			    Thread.sleep(2000);
//			    WebElement mjito =driver.findElement(Mojitotarget);
//			    Actions builder6 = new Actions(driver);
//			    builder6.moveToElement(mjito).click().sendKeys("3").perform();
//			    Thread.sleep(2000);
//			    builder6.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
//			    
//			    Thread.sleep(2000);				   
//			    /*Enter values for Coffee*/
//			    Thread.sleep(2000);
//			    WebElement Coffee =driver.findElement(Coffeetarget);
//			    Actions builder7 = new Actions(driver);
//			    builder7.moveToElement(Coffee).click().sendKeys("2").perform();
//			    Thread.sleep(2000);
//			    builder7.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
//			    			    
//			    Thread.sleep(2000);				   
//			    /*Enter values for sugar*/
//			    Thread.sleep(2000);
//			    WebElement sugar =driver.findElement(sugarcradio);
//			    Actions builder8 = new Actions(driver);
//			    builder8.moveToElement(sugar).click().perform();
//			    
//			    Thread.sleep(2000);
//			    AllureUtils.captureScreenshot(driver, "Dinnerend");
//
			     // Find and click on the "Select" button
			     WebElement selectButton = driver.findElement(slctBttn4);
				 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selectButton);
				 Thread.sleep(2000);
			     selectButton.click();
//			    
			    
				   /****working fine*******************/
			     
//			     
//			     	// Get the current date using your Currentdategenerator class
//			        String currentDateStr = Currentdategenerator.generateCurrentDate();
//			        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//			        LocalDate currentDate = LocalDate.parse(currentDateStr, dateFormatter);
	//
//			        // Find today's date element
//			        WebElement todayDateElement = driver.findElement(By.xpath("//div[contains(@class, 'DayPicker-Day--today')]"));
	//
//			        // Get the text of today's date (e.g., "3")
//			        String todayDateText = todayDateElement.getText();
	//
//			        // Extract the day value from today's date
//			        int today = Integer.parseInt(todayDateText);
	//
//			        // Calculate the date for two weeks ahead (adding 14 days)
//			        int twoWeeksAhead = today + 2;
	//
//			        // Calculate the desired date
//			        LocalDate desiredDate = currentDate.plusDays(twoWeeksAhead);
	//
//			        // Check if the desired date is in the next month
//			        if (desiredDate.getMonthValue() != currentDate.getMonthValue()) {
//			            // Click on the "Next Month" arrow button
//			            WebElement nextMonthButton = driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"));
//			            nextMonthButton.click();
//			        }
	//
//			        // Find the date element for the desired date and click on it
//			        String desiredDateLocator = String.format("//div[@aria-label='%s']", desiredDate.format(DateTimeFormatter.ofPattern("EEE MMM d yyyy")));
//			        
//			        WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(1000)); // Adjust the timeout as needed
//			        WebElement desiredDateElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(desiredDateLocator)));
//			        desiredDateElement.click();
	//
//			        // Print the value of the clicked date
//			        System.out.println("Clicked on date: " + desiredDateElement.getText());


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
		        AllureUtils.captureScreenshot(driver, "Dinnerend");
		        
		        WebElement saveyesbutton = driver.findElement(sveysbttn);
		        saveyesbutton.click();
		        Thread.sleep(2500);
		  	  	
			    
			   
		 }
		
	
	}
	
	
