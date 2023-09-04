package cuesz.membersummary.fuelreport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;
import org.openqa.selenium.StaleElementReferenceException;

public class Case67_Fueldashboard extends BasePage{
				
	SeleniumUtils utils = new SeleniumUtils(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(10));
	
	private By fuelicon = (By.id("MemberSummary-FuelReport"));
		private By insulin = (By.id("FuelReport-Insulin"));
		private By hormones = (By.id("FuelReport-Hormone"));
		private By cardio = (By.id("FuelReport-Cardio"));
		private By gut = (By.id("FuelReport-Gut"));
		private By brain = (By.id("FuelReport-Brain"));
		private By adrenal = (By.id("FuelReport-Adrenal"));
		private By Detox = (By.id("FuelReport-Detox"));
		private By lipids = (By.id("FuelReport-Lipids"));
		
		private By KetoDiet = (By.id("FuelReport-FuelRecommendations-KetoDiet"));
		private By LowCarb = (By.id("FuelReport-FuelRecommendations-LowCarb"));
		private By values = (By.id("FuelReport-FuelRecommendations-40/30/30"));
		private By Fast186 = (By.id("FuelReport-FuelRecommendations-Fast18:6"));
		
		private By vegan = (By.id("FuelReport-Preferredfoods-Vegan"));
		private By MeatEater = (By.id("FuelReport-Preferredfoods-MeatEater"));
		private By Vegetarian = (By.id("FuelReport-Preferredfoods-Vegetarian"));
		private By Pescatarian = (By.id("FuelReport-Preferredfoods-Pescatarian"));
		
		
		public Case67_Fueldashboard(WebDriver driver) {
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
		 /************************Member target details**************************************************************************/		 
			try {
				
				WebElement Insulincard = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(insulin)));
				Insulincard.click();				
				 
				 WebElement hormonescard  = driver.findElement(hormones);
				 hormonescard.click();
				 
				 WebElement cardiocard = driver.findElement(cardio);
				 cardiocard.click();
				 
				 WebElement gutcard = driver.findElement(gut);
				 gutcard.click();
				 
				 WebElement braincard = driver.findElement(brain);
				 braincard.click();
				
				 WebElement adrenalcard = driver.findElement(adrenal);
				 adrenalcard.click();
		
				 WebElement Detoxcard  = driver.findElement(Detox);
				 Detoxcard.click();
				 
				 WebElement lipidscard = driver.findElement(lipids);
				 lipidscard.click();
				 
				} catch (StaleElementReferenceException e) {
					    
			}
				
	 
			 Thread.sleep(3500);
	   /************************Member Fuel Recommendations details********************************************************************/
			 try {
			 WebElement KetoDietcard = driver.findElement(KetoDiet);
			 KetoDietcard.click();
			 
			 WebElement LowCarbcard = driver.findElement(LowCarb);
			 LowCarbcard.click();
			 
			 WebElement valuescard  = driver.findElement(values);
			 valuescard.click();
			 
			 WebElement Fast186card = driver.findElement(Fast186);
			 Fast186card.click();
			 } catch (StaleElementReferenceException e) {
				    
				}
			
			 Thread.sleep(2500);
			   /************************Member Preferred foods details**************************************************************************/
		try {	 
			 WebElement vegancard = driver.findElement(vegan);
			 vegancard.click();
			 
			 WebElement MeatEatercard = driver.findElement(MeatEater);
			 MeatEatercard.click();
			 
			 WebElement Vegetariancard  = driver.findElement(Vegetarian);
			 Vegetariancard.click();
			 
			 WebElement Pescatariancard = driver.findElement(Pescatarian);
			 Pescatariancard.click();	
			 
		} catch (StaleElementReferenceException e) {
		    
		}
			 
			 Thread.sleep(5500);
				        
				 }
			
			}
