	package cuesz.logicpage;
	
	import java.text.ParseException;
	import java.time.DayOfWeek;
	import java.time.LocalDate;
import java.util.Calendar;
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
import cuesz.utils.AllureUtils;
import cuesz.utils.SeleniumUtils;
import cuesz.utils.DayofWeek;	

	public class Case43_02_MSL_fuel_currentday extends BasePage {
		
	

		SeleniumUtils utils = new SeleniumUtils(driver);
		private By Logibttn =   (By.xpath("//span[normalize-space()='Logic Page']"));
		private By Fuelheading = (By.id("FuelCard"));
		private By Fuelheadingplus = (By.xpath("//button[@data-bs-target='#FuelToTrain']"));
		private By selctbttn = (By.id("SelectWeekFuelCard"));

		

		 public Case43_02_MSL_fuel_currentday(WebDriver driver) {
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
		        
		        Thread.sleep(2000);
		  	        
	  /***************************************Click on Fuel and scroll******************************************************************************************/
		  	   Thread.sleep(5500);
		  	   WebElement FuelHead = driver.findElement(Fuelheading);
		       // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);;", FuelHead);
			     		
			   Thread.sleep(5500);				
			   
			   // Wait for the element to be clickable
			   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); // Adjust the timeout as needed
			   WebElement Fuelnoteplus = wait.until(ExpectedConditions.elementToBeClickable(Fuelheadingplus));
			   Fuelnoteplus.click();
			   		
			   Thread.sleep(5500);
			   // Example usage:
			   WebElement selectbutton = driver.findElement(selctbttn);
			   // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", selectbutton);

			   Thread.sleep(5500);
		  
	  /************************************************Input data as per next week selected and populate data in three days***************************************************************************************************/
		        
			
//			   WebElement  activeblock = driver.findElement(By.xpath("//div[@id='active_logic_block']"));
			   WebElement  activeblock = driver.findElement(By.xpath("//div[@id='FuelToTrain']//div[@class='logic_block active']"));
			   // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", activeblock);
			   

	  	   
     /********************************************************************Populate data for monday first activity *************************************************************************************/
					
			
			   		        
			
			    Thread.sleep(2500);
			    int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
			    String dayName = DayofWeek.getDayName(dayOfWeek);       

			    String partialId = "FuelMealList-" + dayName;
			    WebElement searchactivity = driver.findElement(By.id(partialId));

			    // Click on the element with the ID partialId
			    searchactivity.click();

			    // Wait for 2 seconds
			    Thread.sleep(2000);

			   Actions builder =new Actions(driver);
			   builder.sendKeys(Keys.TAB).build().perform();
		    
		/*********************************Input values for option 1 primary  breakfast field**********************************************************/
//			        https://chat.openai.com/share/68e7bc08-e866-4816-b311-cdcc35405dea
				   
				   Thread.sleep(3500);
				   try {
					    // Get the current day of the week
					    String dayName1 = DayofWeek.getDayName(dayOfWeek);
			            // Locate the input field
			            WebElement inputField = driver.findElement(By.xpath("//div[@class='FuelOptionFirst_1-" + dayName1 + " react-select__input']/input"));
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
				   AllureUtils.captureScreenshot(driver, "Breakfast1");
		   /***********************************************Input values for option 1 Secondary breakfast field*****************************************/
				   
				   try {
					   //	Get the current day of the week
				   			String dayName2 = DayofWeek.getDayName(dayOfWeek);
			            // Locate the input field
			            WebElement inputField = driver.findElement((By.xpath("//div[@class='FuelOptionSecond_1-" + dayName2 + " react-select__input']/input")));
			            // Enter values into the input field
			            inputField.sendKeys("Pizza");		
			            Thread.sleep(3500);
			            // Simulate pressing the Enter key
			            inputField.sendKeys(Keys.ENTER);
			      
	
			            // Clear the input field to enter the second value
			            inputField.clear();
			            Thread.sleep(2500);
			            
			          // Enter the second value "Curd" into the input field
			            inputField.sendKeys("Kiwi");	
			            Thread.sleep(3500);
			            // Simulate pressing the Enter key to select the second value
			            inputField.sendKeys(Keys.ENTER);
			            // Wait for a moment (optional)
			            Thread.sleep(3500);
			    
				   } catch (Exception e) {
					    e.printStackTrace();
					} finally {
					    // Your finally block code here (optional)
					}
			 
				   Thread.sleep(3500);
		   /******************************Input values for option 2 primary breakfast field*****************************************/
				   
				   try {
					   //  Get the current day of the week
			   			String dayName3 = DayofWeek.getDayName(dayOfWeek);
			            // Locate the input field
			            WebElement inputField = driver.findElement((By.xpath("//div[@class='FuelOptionFirst_2-" + dayName3 + " react-select__input']/input")));
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
				   
				   AllureUtils.captureScreenshot(driver, "breakfastend1");
				   
			/********************************************now move to EarlySnacks*************************************************/	 
			 				String partialId1 = "FuelMealList-" + dayName;
						    WebElement searchactivity1 = driver.findElement(By.id(partialId1));

						    // Press the down arrow key
						    Actions builder1 = new Actions(driver);
						    builder1.sendKeys(Keys.ARROW_DOWN).build().perform();

						    // Press the tab key
						    builder1.sendKeys(Keys.TAB).build().perform();

						    // Click on the element with the ID partialId
						    searchactivity1.click();

						    // Wait for 2 seconds
						    Thread.sleep(2000);
//				   			
						 // Wait for 2 seconds
						    Thread.sleep(2000);

						    // Repeat the above steps multiple times
						    for (int i = 0; i < 1; i++) {
						        builder.sendKeys(Keys.ARROW_DOWN).build().perform();
						        builder.sendKeys(Keys.TAB).build().perform();
						        searchactivity.click();

						        // Wait for 2 seconds
						        Thread.sleep(2000);
						    }
  				   AllureUtils.captureScreenshot(driver, "EarlySnacks1");
		 /******************************Input values for option 1 primary  Early Snacks field*****************************************/
				   
				   try {//  Get the current day of the week
			   			String dayName1 = DayofWeek.getDayName(dayOfWeek);
			            // Locate the input field
			            WebElement inputField = driver.findElement(By.xpath("//div[@class='FuelOptionFirst_1-" + dayName1 + " react-select__input']/input"));
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
//				   		 Get the current day of the week
				   			String dayName2 = DayofWeek.getDayName(dayOfWeek);
			            // Locate the input field
			            WebElement inputField = driver.findElement((By.xpath("//div[@class='FuelOptionFirst_2-" + dayName2 + " react-select__input']/input")));
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
					  // Get the current day of the week
			   			String dayName3 = DayofWeek.getDayName(dayOfWeek);
			            // Locate the input field
			            WebElement inputField = driver.findElement((By.xpath("//div[@class='FuelOptionFirst_3-" + dayName3 + " react-select__input']/input")));
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
				   AllureUtils.captureScreenshot(driver, "EarlySnacksend1");
				   
		/********************************************now move to Lunch *************************************************/	
				   String partialId2 = "FuelMealList-" + dayName;
				    WebElement searchactivity2 = driver.findElement(By.id(partialId2));

				    // Press the down arrow key
				    Actions builder2 = new Actions(driver);
				    builder2.sendKeys(Keys.ARROW_DOWN).build().perform();

				    // Press the tab key
				    builder2.sendKeys(Keys.TAB).build().perform();

				    // Click on the element with the ID partialId
				    searchactivity2.click();

				    // Wait for 2 seconds
				    Thread.sleep(2000);
//		   			
				 // Wait for 2 seconds
				    Thread.sleep(2000);

				    // Repeat the above steps multiple times
				    for (int i = 0; i < 1; i++) {
				        builder2.sendKeys(Keys.ARROW_DOWN).build().perform();
				        builder2.sendKeys(Keys.TAB).build().perform();
				        searchactivity2.click();

				        // Wait for 2 seconds
				        Thread.sleep(2000);
				    }
		   				  				   AllureUtils.captureScreenshot(driver, "Lunch1");
			 /******************************Input values for option 1 primary Lunch field*****************************************/
				   try {
					   // Get the current day of the week
			   			String dayName1 = DayofWeek.getDayName(dayOfWeek);
			            // Locate the input field
			            WebElement inputField = driver.findElement(By.xpath("//div[@class='FuelOptionFirst_1-" + dayName1 + " react-select__input']/input"));
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
					// Get the current day of the week
			   			String dayName2 = DayofWeek.getDayName(dayOfWeek);
			            // Locate the input field
			            WebElement inputField = driver.findElement(By.xpath("//div[@class='FuelOptionFirst_2-" + dayName2 + " react-select__input']/input"));
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
					// Get the current day of the week
			   			String dayName3 = DayofWeek.getDayName(dayOfWeek);
			            // Locate the input field
			            WebElement inputField = driver.findElement(By.xpath("//div[@class='FuelOptionFirst_3-" + dayName3 + " react-select__input']/input"));
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
					// Get the current day of the week
			   			String dayName4 = DayofWeek.getDayName(dayOfWeek);
			            // Locate the input field
			            WebElement inputField = driver.findElement(By.xpath("//div[@class='FuelOptionSecond_3-" + dayName4 + " react-select__input']/input"));
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
				  AllureUtils.captureScreenshot(driver, "Lunchend1");
		  /********************************************now move to LateSnacks *************************************************/	 
				   String partialId3 = "FuelMealList-" + dayName;
				    WebElement searchactivity3 = driver.findElement(By.id(partialId3));

				    // Press the down arrow key
				    Actions builder3 = new Actions(driver);
				    builder3.sendKeys(Keys.ARROW_DOWN).build().perform();

				    // Press the tab key
				    builder3.sendKeys(Keys.TAB).build().perform();

				    // Click on the element with the ID partialId
				    searchactivity3.click();

				    // Wait for 2 seconds
				    Thread.sleep(2000);
//		   			
				 // Wait for 2 seconds
				    Thread.sleep(2000);

				    // Repeat the above steps multiple times
				    for (int i = 0; i < 1; i++) {
				        builder3.sendKeys(Keys.ARROW_DOWN).build().perform();
				        builder3.sendKeys(Keys.TAB).build().perform();
				        searchactivity3.click();

				        // Wait for 2 seconds
				        Thread.sleep(2000);
				    }
				   Thread.sleep(4500);		  
				   
				   AllureUtils.captureScreenshot(driver, "LateSnacks1");
		 /******************************Input values for option 1 primary LateSnacks field*****************************************/
				   
				   try {
					// Get the current day of the week
			   			String dayName1 = DayofWeek.getDayName(dayOfWeek);
			            // Locate the input field
			            WebElement inputField = driver.findElement(By.xpath("//div[@class='FuelOptionFirst_1-" + dayName1 + " react-select__input']/input"));
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
					// Get the current day of the week
			   			String dayName2 = DayofWeek.getDayName(dayOfWeek);
			            // Locate the input field
			            WebElement inputField = driver.findElement(By.xpath("//div[@class='FuelOptionFirst_2-" + dayName2 + " react-select__input']/input"));
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
					// Get the current day of the week
			   			String dayName3 = DayofWeek.getDayName(dayOfWeek);
			            // Locate the input field
			            WebElement inputField = driver.findElement(By.xpath("//div[@class='FuelOptionFirst_3-" + dayName3 + " react-select__input']/input"));
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
				   AllureUtils.captureScreenshot(driver, "LateSnacksend1");
			
				   /********************************************now move to Dinner *************************************************/	 
				   String partialId4 = "FuelMealList-" + dayName;
				    WebElement searchactivity4 = driver.findElement(By.id(partialId4));

				    // Press the down arrow key
				    Actions builder4 = new Actions(driver);
				    builder4.sendKeys(Keys.ARROW_DOWN).build().perform();

				    // Press the tab key
				    builder4.sendKeys(Keys.TAB).build().perform();

				    // Click on the element with the ID partialId
				    searchactivity4.click();

				    // Wait for 2 seconds
				    Thread.sleep(2000);
//		   			
				 // Wait for 2 seconds
				    Thread.sleep(2000);

				    // Repeat the above steps multiple times
				    for (int i = 0; i < 1; i++) {
				    	builder4.sendKeys(Keys.ARROW_DOWN).build().perform();
				    	builder4.sendKeys(Keys.TAB).build().perform();
				        searchactivity4.click();

				        // Wait for 2 seconds
				        Thread.sleep(2000);
				    }
				   Thread.sleep(4500);		  		   
				   AllureUtils.captureScreenshot(driver, "Dinner1");
		
	 /******************************Input values for option 1 primary Dinner field*****************************************/
				   
				   try {
					// Get the current day of the week
			   			String dayName1 = DayofWeek.getDayName(dayOfWeek);
				   
			            // Locate the input field
			            WebElement inputField = driver.findElement(By.xpath("//div[@class='FuelOptionFirst_1-" + dayName1 + " react-select__input']/input"));
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
					// Get the current day of the week
			   			String dayName2 = DayofWeek.getDayName(dayOfWeek);
				   
			            // Locate the input field
			            WebElement inputField = driver.findElement(By.xpath("//div[@class='FuelOptionFirst_2-" + dayName2 + " react-select__input']/input"));
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
					// Get the current day of the week
			   			String dayName3 = DayofWeek.getDayName(dayOfWeek);
				   
			            // Locate the input field
			            WebElement inputField = driver.findElement(By.xpath("//div[@class='FuelOptionFirst_3-" + dayName3 + " react-select__input']/input"));
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
					// Get the current day of the week
			   			String dayName4 = DayofWeek.getDayName(dayOfWeek);
				   
			            // Locate the input field
			            WebElement inputField = driver.findElement(By.xpath("//div[@class='FuelOptionSecond_3-" + dayName4 + " react-select__input']/input"));
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
				     
//				   
				   AllureUtils.captureScreenshot(driver, "Dinnerend1");
//				   
				   /*Enter values for HydrationTarget*/
				    Thread.sleep(2000);
				    	
				 // Get the current day of the week
		   			String dayName1 = DayofWeek.getDayName(dayOfWeek);
				    // Scroll to the HydrationTarget element
				    WebElement HydrationTarget = driver.findElement(By.id("hydration_fuel-" + dayName1));
				    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", HydrationTarget);
				    Thread.sleep(2000);
				    // Now you can interact with the HydrationTarget element
				    Actions builder7 = new Actions(driver);			    
				    builder7.moveToElement(HydrationTarget).click().sendKeys("8 Glasses").perform();
				    Thread.sleep(2000);
				    builder7.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

				    Thread.sleep(2000);				   
				    /*Enter values for Electrolyte Target*/
				    Thread.sleep(2000);
				    
				 // Get the current day of the week
		   			String dayName2 = DayofWeek.getDayName(dayOfWeek);
				    WebElement ElectrolyteTarget =driver.findElement(By.id("Electrolyte_fuel-" + dayName2));
				    Actions builder8 = new Actions(driver);
				    builder8.moveToElement(ElectrolyteTarget).click().sendKeys("2").perform();
				    Thread.sleep(2000);
				    builder8.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
				    Thread.sleep(2000);				   
		}}
	 
	
