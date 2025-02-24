	package cuesz.logicpage;
	
	import java.text.ParseException;
//	import java.time.LocalDate;
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

import cuesz.date.functions.DayofWeek;
import cuesz.pages.BasePage;
//import cuesz.utils.AllureUtils;
import cuesz.utils.SeleniumUtils;
import cuesz.web.resources.weblocators;	

	public class Case44_01_MSL_Mindful_currentday extends BasePage {
		
	

		SeleniumUtils utils = new SeleniumUtils(driver);
		
		 public Case44_01_MSL_Mindful_currentday(WebDriver driver) {
			super(driver);
			
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
	   		   WebElement Logicbutton =  driver.findElement(weblocators.Logibttn);
	   		   Logicbutton.click();

	   		  /****************************************Click on next & previous button and get week*****************************************************************************************************/        
		        
		        Thread.sleep(2000);
		  	        
		        /***************************************Click on mindful and scroll******************************************************************************************/
			  	   Thread.sleep(5500);
			  	   WebElement mindfulheading = driver.findElement(weblocators.mindfulhdng);
			       // Scroll to the "Staff Notes" element using JavaScriptExecutor
				   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);;", mindfulheading);
				     		
				   Thread.sleep(9500);				// Wait for the element to be clickable
				   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); // Adjust the timeout as needed
				   WebElement mindfulnoteplus = wait.until(ExpectedConditions.elementToBeClickable(weblocators.mindflnopls));
				   mindfulnoteplus.click();
				   		
				   Thread.sleep(5500);
				   // Example usage:
				   WebElement selectbutton = driver.findElement(weblocators.slctbttn);
				   // Scroll to the "Staff Notes" element using JavaScriptExecutor
				   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", selectbutton);
		  
	  /************************************************Input data as per next week selected and populate data in three days***************************************************************************************************/
		       Thread.sleep(5500); 
			
//			   WebElement  activeblock = driver.findElement(By.xpath("//div[@id='active_logic_block']"));
		       WebElement  activeblock = driver.findElement(By.xpath("//div[@id='Mindfull1']//div[@class='logic_block active']//div[@class='logic_block_body']"));
		       // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", activeblock);
			   
Thread.sleep(3500);
	  	   
     /********************************************************************Populate data for monday first activity *************************************************************************************/
					
			
			   		        
			
			    Thread.sleep(2500);
			    int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
			    String dayName = DayofWeek.getDayName(dayOfWeek);       

			    String partialId = "MindfulDay-" + dayName;
			    WebElement searchactivity = driver.findElement(By.id(partialId));

			    // Press the down arrow key
			    Actions builder = new Actions(driver);
			    builder.sendKeys(Keys.ARROW_DOWN).build().perform();

			    // Press the tab key
			    builder.sendKeys(Keys.TAB).build().perform();

			    // Click on the element with the ID partialId
			    searchactivity.click();

			    // Wait for 2 seconds
			    Thread.sleep(2000);
		

			    // Repeat the above steps multiple times
			    for (int i = 0; i < 1; i++) {
			        builder.sendKeys(Keys.ARROW_DOWN).build().perform();
			        builder.sendKeys(Keys.TAB).build().perform();
			        Thread.sleep(2000);
			        searchactivity.click();

			        // Wait for 2 seconds
			        Thread.sleep(2000);
			     
			        // Click outside of the block to save data
			        WebElement outsideBlock2 = driver.findElement(weblocators.outsideBlck2);
			        outsideBlock2.click();
			    }
			    
			    String partialId1 = "MindfulMins-" + dayName;
			    WebElement searchactivity1 = driver.findElement(By.id(partialId1));
			    Actions builder1 = new Actions(driver);
				builder1.moveToElement(searchactivity1).click().sendKeys("8 Minutes").perform();
				Thread.sleep(2000);
				builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
				Thread.sleep(2000);
		
		    
		/*********************************Input values for Mindful Tags**********************************************************/
//			        https://chat.openai.com/share/68e7bc08-e866-4816-b311-cdcc35405dea
				   
				   Thread.sleep(3500);
				   try {     
					    // Get the current day of the week
					    String dayName1 = DayofWeek.getDayName(dayOfWeek);
			            // Locate the input field
					    WebElement inputField = driver.findElement(By.xpath("//input[@id='MindfulFirstTag-" + dayName1 + "']"));
			            inputField.click();
			            // Enter values into the input field
			            inputField.sendKeys("Do Well");
			            Thread.sleep(3500);
			            } 
				   catch (Exception e) {
				            
			            }
				   try {
			            // Get the current day of the week
					    String dayName2 = DayofWeek.getDayName(dayOfWeek);
			            // Locate the input field
					    WebElement inputField2 = driver.findElement(By.xpath("//input[@id='MindfulSecondTag-" + dayName2 + "']"));
			            inputField2.click();
			            // Enter values into the input field
			            inputField2.sendKeys("Breathe Well");
			            Thread.sleep(3500);
			            } 
				   catch (Exception e) {
				            
			            }
				   // Click outside of the block to save data
			        WebElement outsideBlock2 = driver.findElement(weblocators.outsideBlck2);
			        outsideBlock2.click();
			}
	}		
	
	 
	