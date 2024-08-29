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

import cuesz.date.functions.DayofWeek;
import cuesz.pages.BasePage;
	import cuesz.utils.SeleniumUtils;
import cuesz.web.resources.webTestdata;
import cuesz.web.resources.weblocators;
	
	public class Case42_01_MSL_Perform_currentday extends BasePage {
		
		SeleniumUtils utils = new SeleniumUtils(driver);
		
		 public Case42_01_MSL_Perform_currentday(WebDriver driver) {
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
	
		  /***********************************landed on Logic page *****************************************************************************/
	   		   Thread.sleep(2000);
	   		   WebElement Logicbutton =  driver.findElement(weblocators.Logibttn);
	   		   Logicbutton.click();

		  	
		 /***************************************Click on Perfom and scroll******************************************************************************************/
		  	   Thread.sleep(5500);
		  	   WebElement Performheading = driver.findElement(weblocators.Prfrmhading);
		       // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);;", Performheading);
			   		   
			     		
			   Thread.sleep(5500);				// Wait for the element to be clickable
			   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); // Adjust the timeout as needed
			   WebElement Performnoteplus = wait.until(ExpectedConditions.elementToBeClickable(weblocators.Prfrmhadingplsu));
			   Performnoteplus.click();
			   		
			   Thread.sleep(5500);
			   // Example usage:
			   WebElement selectbutton = driver.findElement(weblocators.selctbttn);
			   // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", selectbutton);

			   Thread.sleep(5500);

	     /*******************Input data as per next week selected and populate data in three days***********************************************/ 
			
			   WebElement  activeblock = driver.findElement(By.xpath("//div[@id='active_logic_block']"));
			   // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", activeblock);
			     	   
	    /*****************************Populate data for monday first activity ******************************************************************/
					

			    Thread.sleep(5500);
			    
			    int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
			    String dayName = DayofWeek.getDayName(dayOfWeek);
		        String partialId = "performActivity-0-" + dayName;
			    WebElement searchactivity = driver.findElement(By.id(partialId));
			    Actions builder2 = new Actions(driver);
			    builder2.moveToElement(searchactivity).click().sendKeys(webTestdata.activityname).perform();
			    Thread.sleep(2000);
			    builder2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		        
			    Thread.sleep(2500);
				
			  
			    String partialId1 = "PerformActivityMin-0-" + dayName;
			    WebElement min =driver.findElement(By.id(partialId1));
			    Actions builder3 = new Actions(driver);
			    min.clear();
			    builder3.moveToElement(min).click().sendKeys(webTestdata.activitymin).perform();
			  
			    Thread.sleep(2000);
			  
			    
			    String partialId2 = "PerformActivityIntesity-0-" + dayName;
			    WebElement searchIntensity =driver.findElement(By.id(partialId2));
			    Actions builder4 = new Actions(driver);
			    builder4.moveToElement(searchIntensity).click().sendKeys(webTestdata.activityintensity).perform();
			    Thread.sleep(2000);
			    builder4.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			    
			    Thread.sleep(2000);
			    
			    String partialId3 = "PerformActivityHr-0-" + dayName;
			    WebElement HRvalue =driver.findElement(By.id(partialId3));			
			    Actions builder41 = new Actions(driver);
			    builder41.moveToElement(HRvalue).click().sendKeys(webTestdata.activityHrvalue).perform();
			    Thread.sleep(2000);
			    builder41.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			    Thread.sleep(2000);
			    
			    String partialId4 = "PerformActivityCue-0-" + dayName;
			    WebElement cue =driver.findElement(By.id(partialId4));	
			    Actions builder5 = new Actions(driver);
			    builder5.moveToElement(cue).click().sendKeys(webTestdata.activitydec).sendKeys(Keys.ENTER).perform();
			   
			    Thread.sleep(2000);
			    // Click outside of the block to save data
		        WebElement outsideBlock1 = driver.findElement(weblocators.outsieBlcok1);
		        outsideBlock1.click(); 
			    
		        
		        Thread.sleep(3500);
		        
		        /************************************************************/
		        String partialId6 = "performActivity-1-" + dayName;
			    WebElement searchactivity1 = driver.findElement(By.id(partialId6));
			    Actions builder21 = new Actions(driver);
			    builder21.moveToElement(searchactivity1).click().sendKeys(webTestdata.activityname2).perform();
			    Thread.sleep(2000);
			    builder21.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		        
			    Thread.sleep(2500);
				
			  
			    
			    String partialId7 = "PerformActivityMin-1-" + dayName;
			    WebElement min12 =driver.findElement(By.id(partialId7));
			    Actions builder31 = new Actions(driver);
			    min12.clear();
			    builder31.moveToElement(min12).click().sendKeys(webTestdata.activitymin2).perform();
			  
			    Thread.sleep(2000);
			  
			    
			    String partialId22 = "PerformActivityIntesity-1-" + dayName;
			    WebElement searchIntensity69 =driver.findElement(By.id(partialId22));
			    Actions builder44 = new Actions(driver);
			    builder44.moveToElement(searchIntensity69).click().sendKeys(webTestdata.activityintensity2).perform();
			    Thread.sleep(2000);
			    builder44.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			    
			    Thread.sleep(2000);
			    
			    String partialId39 = "PerformActivityHr-1-" + dayName;
			    WebElement HRvalue45 =driver.findElement(By.id(partialId39));			
			    Actions builder46 = new Actions(driver);
			    builder46.moveToElement(HRvalue45).click().sendKeys(webTestdata.activityHrvalue2).perform();
			    Thread.sleep(2000);
			    builder46.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			    Thread.sleep(2000);
			    
			    String partialId47 = "PerformActivityCue-1-" + dayName;
			    WebElement cue67 =driver.findElement(By.id(partialId47));	
			    Actions builder54 = new Actions(driver);
			    builder54.moveToElement(cue67).click().sendKeys(webTestdata.activitydec2).sendKeys(Keys.ENTER).perform();
			   
			    Thread.sleep(2000);
			    // Click outside of the block to save data
		        WebElement outsideBlock14 = driver.findElement(weblocators.outsieBlcok1);
		        outsideBlock14.click(); 
		                
		        Thread.sleep(3500);
			    
			 
	}
		
	}
	