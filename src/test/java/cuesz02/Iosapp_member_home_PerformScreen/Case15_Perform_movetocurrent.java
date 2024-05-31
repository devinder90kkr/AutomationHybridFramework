package cuesz02.Iosapp_member_home_PerformScreen;

import java.util.HashMap;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AllureUtils;
import cuesz.utils.AppiumappUtils;
import cuesz.utils.mobileLocators;
import cuesz.utils.mobilelement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Perform detail")
@Feature ("Verify Additional perform activity functionlaity")


public class Case15_Perform_movetocurrent extends AppiummobileBase {

	mobileLocators locators = new mobileLocators();	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Case15_Perform_movetocurrent.class);
	
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify perform screen & check Additional activity functionlaity.")
    @Story("here, we need to verify Additional perform activity functionality")	
	
	public void perfom_movetocurrentactivtity() throws InterruptedException
	{	

		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");
		
		// CLick on home menu from bottom
		WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
		Homeicon.click();
		
		  // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "movetocurrent11");

		 // Log console message to Allure
        LOGGER.info("Click on home menu from bottom");
        AllureUtils.logStep("Click on home menu from bottom");
        
		// We need to add test data only for Saturday week 
		
		 driver.findElement(AppiumBy.accessibilityId("FriClicked")).click();
		
		 	// Log console message to Allure
	        LOGGER.info("Click on FriClicked ");
	        AllureUtils.logStep("Click on FriClicked");
		 
		 Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject =new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("Perform Fuel Mindful Restore", "Perform");
		driver.executeScript("mobile:scroll", scrollObject);
		Thread.sleep(2000);
		 
		// CLick on Perform card
		WebElement performcard = driver.findElement(mobileLocators.performclick);
		performcard.click();
		 // Log console message to Allure
        LOGGER.info("Click on perform card ");
        AllureUtils.logStep("Click on perform card");
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "movetocurrent13");
		
		
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "movetocurrent1");
		
		WebElement clickstart 	= driver.findElement(mobileLocators.startclick);
		clickstart.click();
		
		 // Log console message to Allure
        LOGGER.info("Click on start option ");
        AllureUtils.logStep("Click on start option ");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "movetocurrent2");
        
        // Click on Home-icon
        mobilelement.clickElement(driver, mobileLocators.movetoday);
     // Log console message to Allure
        LOGGER.info("show two option for past activity either to today toady and mark as completed ");
        AllureUtils.logStep("show two option for past activity either to today toady and mark as completed ");
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "movetocurrent3");
        
		
		
		WebElement movetoday 	= driver.findElement(mobileLocators.movetoday1);
		movetoday.click();
		
		 // Log console message to Allure
        LOGGER.info("Click on move to today option ");
        AllureUtils.logStep("Click on today option ");
		
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "movetocurrent4");
        
		WebElement backclick	= driver.findElement(mobileLocators.backbttn);
		backclick.click();
		
		
		WebElement backclick1	= driver.findElement(mobileLocators.backbttn);
		backclick1.click();
		
		// Log console message to Allure
        LOGGER.info("Click on move to back icon ");
        AllureUtils.logStep("Click on back icon ");
		
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "movetocurrent5");
		
		Thread.sleep(3500);
        driver.terminateApp("com.cuesz.mobile");
	
	
	
	}}