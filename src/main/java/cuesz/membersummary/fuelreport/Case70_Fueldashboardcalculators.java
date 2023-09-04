package cuesz.membersummary.fuelreport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class Case70_Fueldashboardcalculators extends BasePage{
				
	SeleniumUtils utils = new SeleniumUtils(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(10));
	
	private By fuelicon = (By.id("MemberSummary-FuelReport"));
	
	
        	
		public Case70_Fueldashboardcalculators(WebDriver driver) {
			super(driver);
		}
			
		 @Test
		    public void fuelreport()throws InterruptedException {
			 Thread.sleep(2000);
			
			        utils.clickMembersummary();
			        utils.waitForMilliseconds(2000);
			        utils.enterSearchText();
				    utils.clickMembername();
			
				 WebElement Fuelreporticon = driver.findElement(fuelicon);
				 Fuelreporticon.click();
				 
				 Thread.sleep(3000);	 
		
			/********************************************************************************************************************/	         
				 try {
			            // Scroll to the "Calories Calculator" section
			            WebElement caloriesCalculator = driver.findElement(By.xpath("//h4[contains(text(),'Calories Calculator')]"));
			            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", caloriesCalculator);

			            // Input age
			            WebElement ageField = driver.findElement(By.id("FuelReport-CaloriesCalculator-Age"));
			            ageField.clear();
			            ageField.sendKeys("34");

			            // Input height in cm
			            WebElement heightCmField = driver.findElement(By.id("FuelReport-CaloriesCalculator-Height-Cm"));
			            heightCmField.clear();
			            heightCmField.sendKeys("165");

			            // Input weight
			            WebElement weightField = driver.findElement(By.id("FuelReport-CaloriesCalculator-Weight"));
			            weightField.clear();
			            weightField.sendKeys("82");

			            /*Select Activity	*/
					    Thread.sleep(2000);
					    WebElement Activityselection =driver.findElement(By.id("FuelReport-CaloriesCalculator-Activity"));
					    Actions builder2 = new Actions(driver);
					    builder2.moveToElement(Activityselection).click().sendKeys("Light: exercise 1-3 times/week").sendKeys(Keys.ENTER).perform();
			            

			            // Click the "Calculate" button
			            WebElement calculateButton = driver.findElement(By.id("FuelReport-CaloriesCalculator-Calculate"));
			            calculateButton.click();

			         // Locate the target element using its XPath
			            WebElement targetElement = driver.findElement(By.xpath("//div[@class='d-flex align-items-center row']"));

			            // Use JavascriptExecutor to scroll to the element
			            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", targetElement);
			        
			            
			            // Optionally, you can wait for the results or perform other actions here

			        } catch (Exception e) {
			            e.printStackTrace();
			        } 
				 
			
				 Thread.sleep(8500);

				        
				 }
			
			}
