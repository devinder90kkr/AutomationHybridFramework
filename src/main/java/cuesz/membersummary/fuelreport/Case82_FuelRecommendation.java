package cuesz.membersummary.fuelreport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;
import org.openqa.selenium.JavascriptExecutor;

public class Case82_FuelRecommendation extends BasePage{
				
	SeleniumUtils utils = new SeleniumUtils(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(10));
	
	private By fuelicon = (By.id("MemberSummary-FuelReport"));
	
	
        	
		public Case82_FuelRecommendation(WebDriver driver) {
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
			            WebElement FuelRecommendation = driver.findElement(By.xpath("//h4[contains(text(),'Fuel Recommendation')]"));
			            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", FuelRecommendation);

			         WebElement recoveryday = driver.findElement(By.xpath("//button[@id='3']"));
			         recoveryday.click();
			         
			         
			            
			            // Optionally, you can wait for the results or perform other actions here

			        } catch (Exception e) {
			            e.printStackTrace();
			        } 
				 
			
				 Thread.sleep(8500);

				        
				 }
			
			}
