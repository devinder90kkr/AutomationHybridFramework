	package cuesz.logicpage;
	
	import java.text.ParseException;
	
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

	public class Case43_03_MSL_fuelperform_currentday extends BasePage {
		
	

		SeleniumUtils utils = new SeleniumUtils(driver);
		private By Logibttn =   (By.xpath("//span[normalize-space()='Logic Page']"));
		private By Fuelheading = (By.id("FuelCard"));
		private By Fuelheadingplus = (By.xpath("//button[@data-bs-target='#FuelToTrain']"));
		private By selctbttn = (By.id("SelectWeekFuelCard"));
		private By outsideBlck2 = (By.tagName("body"));

		

		 public Case43_03_MSL_fuelperform_currentday(WebDriver driver) {
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

			   Thread.sleep(2500);
		  
	  /************************************************Input data as per next week selected and populate data in three days***************************************************************************************************/
		        
			
			   WebElement  activeblock = driver.findElement(By.xpath("//div[@id='active_logic_block']"));
			// Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", activeblock);
			   

	  	   
     /********************************************************************Select the Meal Type *************************************************************************************/

			    Thread.sleep(2500);
			    int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
			    String dayName = DayofWeek.getDayName(dayOfWeek);       

			    String partialId = "FuelMealList-" + dayName;
			    WebElement searchactivity = driver.findElement(By.id(partialId));

			 // Click on the search activity to open it
			    searchactivity.click();

			    // Press the down arrow key 5 times and then click the tab key
			    Actions builder = new Actions(driver);
			    for (int i = 0; i < 5; i++) {
			        builder.sendKeys(Keys.ARROW_DOWN).build().perform();
			        Thread.sleep(1000);
			    }
			    builder.sendKeys(Keys.TAB).build().perform();	
			/********************************************now move to Activity*************************************************/	 

						    int dayOfWeek1 = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
						    Thread.sleep(3500);
						    

						    try {
							// Get the current day of the week
							String dayName1 = DayofWeek.getDayName(dayOfWeek1);
						    // Locate the input field
							WebElement inputField = driver.findElement(By.xpath("//div[@id='FuelPerform-SelectActivity-" + dayName1 + "']"));	
							Actions builder6 = new Actions(driver);
						    builder6.moveToElement(inputField).click().sendKeys("Basketball").perform();
						    Thread.sleep(2000);
						    builder6.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
						   Thread.sleep(4500);
												   
						   WebElement notes = driver.findElement(By.xpath("//textarea[@id='editorFuelPerform-Note-" + dayName1 + "']")); 
						   notes.click();
						   notes.clear();
						   Actions builder7 = new Actions(driver);
						    builder7.moveToElement(notes).click().sendKeys("hi this is just for testing pupose. Are you available for yesterday for LP. ").perform();
						    Thread.sleep(2000);			 
						   
						   Thread.sleep(1500);
						   WebElement duration = driver.findElement(By.xpath("//input[@id='FuelPerform-Mins-" + dayName1 + "']"));
						   duration.click();
						   duration.clear();
						   
						   
						   Actions builder8 = new Actions(driver);
						    builder8.moveToElement(duration).click().sendKeys(Keys.BACK_SPACE).sendKeys("45").perform();
						    Thread.sleep(2000);
							 } catch (Exception e) {
							e.printStackTrace();
								} finally {
								    // Your finally block code here (optional)
								}
							   // Thread.sleep(3500);
						 // Click outside of the block to save data
					        WebElement outsideBlock2 = driver.findElement(outsideBlck2);
					        outsideBlock2.click();
				   
  /******************************Input values for option 1 Pre-Perform primary field*****************************************/		   
							   
	//		   https://chat.openai.com/share/22682d4e-1970-48e1-b07f-87efef4ae07a
					    			   
    			   try {
    				// Get the current day of the week
						String dayName1 = DayofWeek.getDayName(dayOfWeek1);
    			   // Locate the input field
						WebElement inputField = driver.findElement(By.xpath("//div[@id='FuelPerformSelectedOptionsPrePerform-Perform-prePerform-Primary-" + dayName1 + "']//div[@class='react-select__value-container react-select__value-container--is-multi css-1hwfws3']"));
						inputField.click();

				   Thread.sleep(2000);
				   Actions builder6 = new Actions(driver);
				    builder6.moveToElement(inputField).click().sendKeys("Gluten Free bread").perform();
				    Thread.sleep(2000);
				    builder6.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
				   Thread.sleep(4500);
				   
				   Actions builder7 = new Actions(driver);
				    builder7.moveToElement(inputField).click().sendKeys("Almond milk").perform();
				    Thread.sleep(2000);
				    builder7.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
				   Thread.sleep(4500);
					    		    
    			   } catch (Exception e) {
    				   e.printStackTrace();
    			   } finally {
    				   // Your finally block code here (optional)
    			   }   
    			   Thread.sleep(3500);
	   /******************************Input values for option 2 Pre-Perform Secondary field*****************************************/		   
					try {
					// Get the current day of the week
					String dayName1 = DayofWeek.getDayName(dayOfWeek1);
					// Locate the input field
					WebElement inputField = driver.findElement(By.xpath("//div[@id='FuelPerformSelectedOptionsPrePerform-Perform-prePerform-Secondary-"+ dayName1 +"']//div[@class='react-select__control css-yk16xz-control']"));
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", inputField);
					inputField.click();
					Thread.sleep(2000);
					Actions builder6 = new Actions(driver);
				    builder6.moveToElement(inputField).click().sendKeys("fried egg").perform();
				    Thread.sleep(2000);
				    builder6.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
				    Thread.sleep(4500);
								    		         
					
					Actions builder7 = new Actions(driver);
				    builder7.moveToElement(inputField).click().sendKeys("Milk").perform();
				    Thread.sleep(2000);
				    builder7.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
				   Thread.sleep(4500);
								    		    
					} catch (Exception e) {
					  e.printStackTrace();
					} finally {
					    // Your finally block code here (optional)
					}   
								    			   
					 Thread.sleep(3500);
					    			   
					     /******************************Input values for option 1  during perform field*****************************************/		   
					    			   
					    				//		   https://chat.openai.com/share/22682d4e-1970-48e1-b07f-87efef4ae07a
					    						   
		 				try {
					    // Get the current day of the week
					    String dayName1 = DayofWeek.getDayName(dayOfWeek1);
					    // Locate the input field
					    WebElement inputField1 = driver.findElement(By.xpath("//div[@id='FuelPerformSelectedOptionsDuringPerform-Perform-duringPerform-Primary-"+ dayName1 +"']//div[@class='react-select__control css-yk16xz-control']"));
					    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", inputField1);
					    inputField1.click();
					    Thread.sleep(2000);
					    Actions builder6 = new Actions(driver);
					    builder6.moveToElement(inputField1).click().sendKeys("Broccoli").perform();
					    Thread.sleep(2000);
					    builder6.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
					   Thread.sleep(4500);
					    
					    
					    Actions builder7 = new Actions(driver);
					    builder7.moveToElement(inputField1).click().sendKeys("peanuts").perform();
					    Thread.sleep(2000);
					    builder7.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
					   Thread.sleep(4500);
					    
					    } catch (Exception e) {
					    e.printStackTrace();
					    } finally {
					    // Your finally block code here (optional)
					    }   
					     
					    Thread.sleep(3500);
					    	 /******************************Input values for option 1  Post perform field*****************************************/		   
					    						   
					    //		   https://chat.openai.com/share/22682d4e-1970-48e1-b07f-87efef4ae07a
					    									   
					    try {
					    // Get the current day of the week
					    String dayName1 = DayofWeek.getDayName(dayOfWeek1);
					    // Locate the input field
					    WebElement inputField = driver.findElement(By.xpath("//div[@id='FuelPerformSelectedOptionsPostPerform-Perform-postPerform-Secondary-"+ dayName1 +"']//div[@class='react-select__value-container react-select__value-container--is-multi css-1hwfws3']"));
					    WebElement scrview = driver.findElement(By.xpath("//label[normalize-space()='Post Perform']"));
					    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", scrview);
					    Thread.sleep(2000);
					    
					    Actions builder6 = new Actions(driver);
					    builder6.moveToElement(inputField).click().sendKeys("jicama").perform();
					    Thread.sleep(2000);
					    builder6.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
					   Thread.sleep(2500);
					   
					    
					    Actions builder7 = new Actions(driver);
					    builder7.moveToElement(inputField).click().sendKeys("soup").perform();
					    Thread.sleep(2000);
					    builder7.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
					   Thread.sleep(2500);
					    
					    } catch (Exception e) {
					    e.printStackTrace();
					    } finally {
					    // Your finally block code here (optional)
					    }   
					    Thread.sleep(3500);

					    		
					    	
					    	
				   
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
				    builder7.moveToElement(HydrationTarget).click().sendKeys("3 Glasses").perform();
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
		}
	}
		
	
	 
	
