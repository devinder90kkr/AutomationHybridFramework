package feature.case06_memberspecs_fuelreport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
// import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import allureframework.AllureUtils;
import base.BasePage;
import utils.SeleniumUtils;

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
				
				 Thread.sleep(11000);	

			/***********************************************Fuel Recommendation*********************************************************************/
				// Scroll to the element
				 WebElement Fuelreco = driver.findElement(By.xpath("(//div[@class='card_box row'])[1]"));
				 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Fuelreco);
				 Thread.sleep(8000);
				 
				 // Find the element with the id `FuelReport-Switch-MemberVisibility`
				 WebElement membvis = driver.findElement(By.id("FuelReport-Switch-MemberVisibility"));

				 // Click the element twice and wait for a different amount of time after each click
				 for (int a = 0; a < 2; a++) {

				 // Click the element
				   membvis.click();

				 // Wait for 4 seconds if it is the first click, or 3 seconds if it is the second click
				   if (a == 0) {
				     Thread.sleep(4000);
				   } else {
				     Thread.sleep(3000);
				   }
				 }
//				 // Find the button with the id `FuelReport-FuelRecommendations-Calories-Increment`
//				 WebElement incrementButton = driver.findElement(By.id("FuelReport-FuelRecommendations-Calories-Increment"));
//
//				 // Click the button twice
//				 for (int i = 0; i < 2; i++) {
//				   incrementButton.click();
//				 }
//
//				 // Hold the button for 8 seconds
//				 Actions actions = new Actions(driver);
//				 actions.clickAndHold(incrementButton).perform();
//				 Thread.sleep(8000);
//				 actions.release().perform();

				 // Find the button with the id `FuelReport-FuelRecommendations-Carbs-Increment`
				 WebElement carbIncrementButton = driver.findElement(By.id("FuelReport-FuelRecommendations-Carbs-Increment"));
				 Thread.sleep(8000);

				 // Click the button twice
				 for (int j = 0; j < 2; j++) {
				   carbIncrementButton.click();
				 }

				 // Hold the button for 5 seconds
				 Actions action1 = new Actions(driver);
				 action1.clickAndHold(carbIncrementButton).perform();
				 Thread.sleep(5000);
				 action1.release().perform();

				 // Find the button with the id `FuelReport-FuelRecommendations-Protein-Increment`
				 WebElement proteinIncrementButton = driver.findElement(By.id("FuelReport-FuelRecommendations-Protein-Increment"));
				 Thread.sleep(8000);

				 // Click the button twice
				 for (int k = 0; k < 2; k++) {
				   proteinIncrementButton.click();
				 }

				 // Hold the button for 3 seconds
				 Actions action2 = new Actions(driver);
				 action2.clickAndHold(proteinIncrementButton).perform();
				 Thread.sleep(3000);
				 action2.release().perform();

				 // Find the button with the id `FuelReport-FuelRecommendations-Fat-Increment`
				 WebElement fatIncrementButton = driver.findElement(By.id("FuelReport-FuelRecommendations-Fat-Increment"));
				 Thread.sleep(8000);

				 // Click the button twice
				 for (int l = 0; l < 2; l++) {
				   fatIncrementButton.click();
				 }

				 // Hold the button for 3 seconds
				 Actions action3 = new Actions(driver);
				 action3.clickAndHold(fatIncrementButton).perform();
				 Thread.sleep(3000);
				 action3.release().perform();
				 
				 
				 // Capture a screenshot and attach it to Allure
			        AllureUtils.captureScreenshot(driver, "Case82_FuelRecommendation1");
				 Thread.sleep(3000);
				 
				 WebElement Defcal = driver.findElement(By.id("Recovery Days"));
					// Click the element twice and wait for a different amount of time after each click
					 for (int b = 0; b < 2; b++) {

					 // Click the element
						 Defcal.click();

					 // Wait for 4 seconds if it is the first click, or 3 seconds if it is the second click
					   if (b == 0) {
					     Thread.sleep(4000);
					   } else {
					     Thread.sleep(3000);
					   }
					 }
		 }
}
