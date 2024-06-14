package cuesz02.Iosapp_member_home_PerformScreen;

import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import cuesz.utils.mobile.mobileLocators;
import cuesz.utils.reporting.AllureUtils;
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


public class Case12_Perform_additionalactivity_deleteprocess extends AppiummobileBase {

	mobileLocators locators = new mobileLocators();	
	private static final Logger LOGGER = LoggerFactory.getLogger(Case12_Perform_additionalactivity_deleteprocess.class);
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify perform screen & check Additional activity functionlaity with delete process.")
    @Story("here, we need to verify member able to delete additional perform activity functionality")	
	
	public void perfom_additionaldeleteactivty() throws InterruptedException
	{	

		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");
		
		// CLick on home menu from bottom
		WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
		Homeicon.click();
		
		 // Log console message to Allure
        LOGGER.info("Click on home menu from bottom");
        AllureUtils.logStep("Click on home menu from bottom");
		
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
		Thread.sleep(3500);
		
		 // Log console message to Allure
        LOGGER.info("Click on perform card ");
        AllureUtils.logStep("Click on perform card");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform_click1");
		
		WebElement perfomplusicon 	= driver.findElement(mobileLocators.perfomplus);
		perfomplusicon.click();
		 
		// Log console message to Allure
        LOGGER.info("Click on plus icon  for open popup related to Start my perform & Perfom activity completed");
        AllureUtils.logStep("Click on plus icon  for open popup related to Start my perform & Perfom activity completed");
        
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform_click2");
		
		WebElement startmyperformactivity 	= driver.findElement(mobileLocators.additionalperform);
		startmyperformactivity.click();
		
		// Log console message to Allure
        LOGGER.info("Click on Start my perform button");
        AllureUtils.logStep("Click on Start my perform button");
        
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform_click3");
		
		WebElement startmyperfromactivitycross 	= driver.findElement(mobileLocators.cross_additionalpopup);
		startmyperfromactivitycross.click();
	
		// Log console message to Allure
        LOGGER.info("Click on Cross button to close popup");
        AllureUtils.logStep("Click on Cross button to close popup");
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform_click4");
		
		
		// repeat steps again 
		WebElement perfomplusicon1 	= driver.findElement(mobileLocators.perfomplus);
		perfomplusicon1.click();
		
		// Log console message to Allure
        LOGGER.info("Click agian on plus icon  for open popup related to Start my perform & Perfom activity completed");
        AllureUtils.logStep("Click again on plus icon  for open popup related to Start my perform & Perfom activity completed");
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform_click5");
		
		WebElement startmyperformactivity2 	= driver.findElement(mobileLocators.additionalperform);
		startmyperformactivity2.click();

		// Log console message to Allure
        LOGGER.info("Click again on to open Start my perform button");
        AllureUtils.logStep("Click again on to open Start my perform button");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform_click6");
		
		// Enter text for Search field 
		WebElement Additonalperformsearch	= driver.findElement(mobileLocators.searcharea);
		Additonalperformsearch.click();	
		
		// Log console message to Allure
        LOGGER.info("Click on search to enter perform activity");
        AllureUtils.logStep("Click on search to enter perform activity");
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform_click7");
		
		// Enter text for Search field 
		WebElement Additonalperformsearch1	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"B\""));
		Additonalperformsearch1.click();

		// Enter text for Search field 
		WebElement Additonalperformsearch2	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"a\""));
		Additonalperformsearch2.click();

		// Enter text for Search field 
		WebElement Additonalperformsearch3	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"s\""));
		Additonalperformsearch3.click();

		// Enter text for Search field 
		WebElement Additonalperformsearch4	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"e\""));
		Additonalperformsearch4.click();
		

		// Enter text for Search field 
		WebElement Additonalperformsearch5	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"b\""));
		Additonalperformsearch5.click();

		// Enter text for Search field 
		WebElement Additonalperformsearch6	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"a\""));
		Additonalperformsearch6.click();
		
		// Enter text for Search field 
		WebElement Additonalperformsearch7	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"l\""));
		Additonalperformsearch7.click();
		
		// Enter text for Search field 
		WebElement Additonalperformsearch8	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"l\""));
		Additonalperformsearch8.click();
		
		// Log console message to Allure
        LOGGER.info("Enter activity name for additonal");
        AllureUtils.logStep("Enter activity name for additonal");
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform_click8");
		
			
		// Enter text for Search field 
		WebElement donekeypad	= driver.findElement(mobileLocators.doneclick);
		donekeypad.click();
		
		// Log console message to Allure
        LOGGER.info("Click on done button from keypad");
        AllureUtils.logStep("Click on done button from keypad");
    
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform_click2");
		Thread.sleep(2500);
		
		// Select perform aditonal activity 
		WebElement selectbaseball 	= driver.findElement(mobileLocators.selectactivity1);
		selectbaseball.click();
		
		// Log console message to Allure
        LOGGER.info("Select acitvity from list");
        AllureUtils.logStep("Select acitvity from list");
		
		
		Thread.sleep(2500);
		
		WebElement backactivity 	= driver.findElement(mobileLocators.backclick);
		backactivity.click();
		
		
		// Log console message to Allure
        LOGGER.info("Click on back button");
        AllureUtils.logStep("Click on back button");
		
		WebElement deleteaddiotnal	= driver.findElement(mobileLocators.selectdeleteactivity);
		deleteaddiotnal.click();
		 // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform_click10");
		
		// Log console message to Allure
        LOGGER.info("Click on delete button");
        AllureUtils.logStep("Click on delete button");
		
		WebElement nodeleteoption	= driver.findElement(mobileLocators.nodelete);
		nodeleteoption.click();
		
		// Log console message to Allure
        LOGGER.info("Click on No option for delete button");
        AllureUtils.logStep("Click on no option for delete button");
		
		WebElement deleteaddiotnal1	= driver.findElement(mobileLocators.selectdeleteactivity);
		deleteaddiotnal1.click();
		
		// Log console message to Allure
        LOGGER.info("Click again on delete button");
        AllureUtils.logStep("Click again on delete button");
		
		WebElement yesdeleteoption	= driver.findElement(mobileLocators.yesdelete);
		yesdeleteoption.click();
		 // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform_click11");
		
		// Log console message to Allure
        LOGGER.info("Click on yes option for delete button");
        AllureUtils.logStep("Click on yes option for delete button");
		
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform_click3");
		
		Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
	
	
	
	}}
