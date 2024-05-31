package cuesz.dashboard;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.AllureUtils;
import cuesz.utils.ResponsiveTester;

import cuesz.utils.weblocators;
import io.qameta.allure.Step;

public class Step12_DB_navlink extends BasePage {
	
	weblocators locators = new weblocators();
	
	 public Step12_DB_navlink(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	 @Test 
		public void Navigationfunctionality() throws InterruptedException, IOException {
		 
		
//		 // Call the utility method to perform responsive testing
//	        ResponsiveTester.testResponsive(driver);
		 
		 Thread.sleep(2000);
		 driver.findElement(weblocators.schdulemastr).click();
		 
		 Thread.sleep(2000);
		 WebElement element = driver.findElement(weblocators.elemnt);
		 Actions actions = new Actions(driver);
		 actions.moveToElement(element).click().build().perform();
		 
		 Thread.sleep(2000);
		 driver.findElement(weblocators.Membrcommunicate).click();
		 
		 
		 // Capture a screenshot and attach it to Allure
	     AllureUtils.captureScreenshot(driver, "Step12_DB_navlink"); 
	        
		 Thread.sleep(2000);
		 driver.findElement(weblocators.elemnt).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(weblocators.stafcommuniction).click();
		 
		// Capture a screenshot and attach it to Allure
	     AllureUtils.captureScreenshot(driver, "Step12_DB_navlink2"); 
		 
		 Thread.sleep(2000);
		 driver.findElement(weblocators.elemnt).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(weblocators.knwledge).click();
		// Capture a screenshot and attach it to Allure
	     AllureUtils.captureScreenshot(driver, "Step12_DB_navlink3"); 
		 
		 Thread.sleep(2000);
		 driver.findElement(weblocators.elemnt).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(weblocators.membersummary).click();
		 
			// Capture a screenshot and attach it to Allure
	     AllureUtils.captureScreenshot(driver, "Step12_DB_navlink4");
		 
	 }
	
}
