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

import allureframework.reporting.AllureUtils;
import base.BasePage;
import utils.SeleniumUtils;
import constant.weblocators;
	
	public class Case43_1_MSL_Fuelperform extends BasePage {
		
		SeleniumUtils utils = new SeleniumUtils(driver);
//		private By fuelcrad = 		(By.id("FuelCard"));
//		private By Fulplus= 		(By.xpath("//button[@data-bs-target='#FuelToTrain']"));
//		private By selectbton = 	(By.xpath("//div[@id='FuelCard']//div[@class='d-flex justify-content-end calender_drop']//button[1]"));
//		private By logibttn =	(By.xpath("//span[normalize-space()='Logic Page']"));
//		private By fatfild =	(By.id("FuelRecFat-Monday"));
//		private By carbfild	= 	(By.id("FuelRecCarbs-Monday"));
//		private By Prteinfeld	= (By.id("FuelRecProtein-Monday"));
//		private By Activityselect	= (By.id("FuelPerform-SelectActivity-Monday"));
//		private By notesfield		= (By.id("editorFuelPerform-Note-Monday"));
//		private By Durationfield	= (By.id("FuelPerform-Mins-Monday"));
//		private By inptFild 	= 	(By.xpath("//div[@id='FuelPerformSelectedOptionsPrePerform-Perform-prePerform-Primary-Monday']//input"));
//		private By inptFild1 = (By.xpath("//div[@id='FuelPerformSelectedOptionsPrePerform-Perform-prePerform-Secondary-Monday']//input"));
//		private By inptFild2 = (By.xpath("//div[@id='FuelPerformSelectedOptionsDuringPerform-Perform-duringPerform-Primary-Monday']//input"));	
//	private By inptFild3	= (By.xpath("//div[@id='FuelPerformSelectedOptionsPostPerform-Perform-postPerform-Secondary-Monday']//input"));
		
		public Case43_1_MSL_Fuelperform(WebDriver driver) {
			super(driver);
			
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
	   		   WebElement Logicbutton =   driver.findElement(weblocators.logibttn);
	   		   Logicbutton.click();

	   		   /****************************************Click on next & previous button and get week*****************************************************************************************************/        
	   		   // Use the next&	previous utility method
	   		   //      utils.navigateToLastAndNextWeek();
		    
	   		   driver.findElement(By.xpath("//span[normalize-space()='Next Week']")).click();
	   		 driver.findElement(By.xpath("//span[normalize-space()='Next Week']")).click();
	   		 driver.findElement(By.xpath("//span[normalize-space()='Next Week']")).click();
	   
		      
	   		   /***************************************Click on Perfom and scroll******************************************************************************************/
		  	   Thread.sleep(5500);
		  	   WebElement Fuelheading = driver.findElement(weblocators.fuelcrad);
		       // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);;", Fuelheading);
			     		
			   Thread.sleep(5500);				// Wait for the element to be clickable
			   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000)); // Adjust the timeout as needed
			   WebElement Performnoteplus = wait.until(ExpectedConditions.elementToBeClickable(weblocators.Fulplus));
			   Performnoteplus.click();
			   		
			   Thread.sleep(5500);
			   // Example usage:
			   WebElement selectbutton = driver.findElement(weblocators.selectbton);
			   // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", selectbutton);

			   Thread.sleep(2500);
		 
	  	   
     /********************************************************************Populate data for monday first activity *************************************************************************************/
			   AllureUtils.captureScreenshot(driver, "day1");
			   try {
		            // Define individual dropdown IDs and corresponding option texts
		            String[][] dropdownOptions = {
		                {"FuelActivityType-Monday", "Recovery Day", "Live Perform Day", "Perform Activity Day"},            
		            };

		            // Click on "CorrelationAnalysisDuration" first
		            String dropdownIdDuration = "FuelActivityType-Monday";
		            WebElement dropdownElementDuration = wait.until(ExpectedConditions.elementToBeClickable(By.id(dropdownIdDuration)));
		            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", dropdownElementDuration);
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
		//    try {
		//        // Enter values for fat fields
		//        WebElement fatsfield = driver.findElement(weblocators.fatfild);

		//        // Check if values exist, and if so, clear them
		// 	   if (!fatsfield.getDomAttribute("value").isEmpty()) {
		//     	   fatsfield.clear();		           
		//        }

		//        // Ensure the input field has focus
		//        fatsfield.click();  // Click to focus
		//        // Enter the new value
		//        fatsfield.sendKeys("45");

		       
		    //    Thread.sleep(3500);
		    //    // Repeat the same process for carbs and protein fields
		    //    WebElement carbsfield = driver.findElement(weblocators.carbfild);
		    //    if (!carbsfield.getAttribute("value").isEmpty()) {
		    // 	   carbsfield.clear();		    	  
		    //    }
		    //    // Ensure the input field has focus
		    //    carbsfield.click();  // Click to focus
		    //    carbsfield.sendKeys("210");
		     
		    //    Thread.sleep(3500);
		    //    WebElement Proteinfield = driver.findElement(weblocators.Prteinfeld);
		    //    if (!Proteinfield.getAttribute("value").isEmpty()) {
		    // 	   Proteinfield.clear();
		    //    }
		    //    // Ensure the input field has focus
		    //    Proteinfield.click();  // Click to focus
		    //    Proteinfield.sendKeys("175");
			       	       
			//    } catch (Exception e) {
			//        e.printStackTrace();
			//    } finally {
			//        // Your finally block code here (optional)
			//    }
		   
			   AllureUtils.captureScreenshot(driver, "Optimal1");
		       
		   
		/********************************************now move to Performactivity*************************************************/	 
		  
			   try {
		            // Define individual dropdown IDs and corresponding option texts
		            String[][] dropdownOptions = {
		                {"FuelMealList-Monday", "Perform"},            
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
		            }
		            } catch (Exception e) 
			   		{
					  e.printStackTrace();
					} finally {
					   
					}
			   Thread.sleep(4500);
	
			   AllureUtils.captureScreenshot(driver, "Perform");
			      
	 /********************************************Now move to Select activity*************************************************/	 
					   
			    /*Enter values for Activity*/
			    Thread.sleep(2000);
			    WebElement Activity =driver.findElement(weblocators.Activityselect);
			    Actions builder6 = new Actions(driver);
			    builder6.moveToElement(Activity).click().sendKeys("walking").perform();
			    Thread.sleep(2000);
			    builder6.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			   Thread.sleep(4500);
		
			   AllureUtils.captureScreenshot(driver, "Activityselect");

   /********************************************Now move to Note/duration field*************************************************/		   
			  
   
			//    WebElement notes = driver.findElement(weblocators.notesfield);   
			//    if (!notes.getAttribute("value").isEmpty()) {
			// 	   notes.clear();
		    //    }
			//    notes.click();
			//    notes.sendKeys("hi this is just for testing pupose. \n Are you availble for yesterday for LP. ");
 
			   
			//    Thread.sleep(1500);
			//    WebElement duration = driver.findElement(weblocators.Durationfield);
			//    if (!duration.getAttribute("value").isEmpty()) {
			// 	   duration.clear();
		    //    }
			//    notes.click();
			//    duration.sendKeys("45");
		
/******************************Input values for option 1 Pre-Perform primary field*****************************************/		   
			   
	//		   https://chat.openai.com/share/22682d4e-1970-48e1-b07f-87efef4ae07a
			   
			   try {
		            // Locate the input field
				   WebElement inputField = driver.findElement(weblocators.inptFild);
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
			   
			   Thread.sleep(3500);

	   /******************************Input values for option 2 Pre-Perform Secondary field*****************************************/		   
			   try {
		            // Locate the input field
				   WebElement inputField = driver.findElement(weblocators.inptFild1);
		            // Enter values into the input field
		            inputField.sendKeys("fried egg");
		            Thread.sleep(3500);
		            // Simulate pressing the Enter key
		            inputField.sendKeys(Keys.ENTER);
		         
		            // Clear the input field to enter the second value
		            inputField.clear();
		            Thread.sleep(1000);              
		         // Enter the second value "Curd" into the input field
		            inputField.sendKeys("Milk");
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
			   
			   Thread.sleep(3500);
			   
 /******************************Input values for option 1  during perform field*****************************************/		   
			   
				//		   https://chat.openai.com/share/22682d4e-1970-48e1-b07f-87efef4ae07a
						   
						   try {
					            // Locate the input field
							   WebElement inputField = driver.findElement(weblocators.inptFild2);
					            // Enter values into the input field
					            inputField.sendKeys("Broccoli");
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
						   
						   Thread.sleep(3500);
	 /******************************Input values for option 1  Post perform field*****************************************/		   
						   
							//		   https://chat.openai.com/share/22682d4e-1970-48e1-b07f-87efef4ae07a
									   
									   try {
								            // Locate the input field
										   WebElement inputField = driver.findElement(weblocators.inptFild3);
								            // Enter values into the input field
								            inputField.sendKeys("jicama");
								            Thread.sleep(3500);
								            // Simulate pressing the Enter key
								            inputField.sendKeys(Keys.ENTER);
								         
								            // Clear the input field to enter the second value
								            inputField.clear();
								            Thread.sleep(1000);              
								         // Enter the second value "Curd" into the input field
								            inputField.sendKeys("soup");
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
									   
									   Thread.sleep(3500);
						   
						
			   
			   
			   
			   
			   
		 }
		
	
	}
	
	
