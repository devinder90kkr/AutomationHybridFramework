package cuesz01.Iosapp_member_homeScreen;

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

@Epic ("Home screen detail ")
@Feature ("Verify individual spheres detail for Perform, Fuel, Mindful & Restore.")


public class Case02_Homescreen_sphereclick extends AppiummobileBase {
	
	mobileLocators locators = new mobileLocators();	
	private static final Logger LOGGER = LoggerFactory.getLogger(Case02_Homescreen_sphereclick.class);
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
	@Description("Verify on home screen member able to click on individual click for perform, Fuel, mindful and restore")
    @Story("here we need to click on each spheres and back to click")	
	
	
	public void Homescreen() throws InterruptedException
	{	

		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");
		
		// CLick on home menu from bottom
		WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
		Homeicon.click();
		
		 // Log message to console and Allure report
        LOGGER.info("Click on home menu from bottom");
        AllureUtils.logStep("Click on home menu from bottom");
		 // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "ios_Homescreen_screenshot");
		
		/*************************** Perform ********************************/
		
		// Find the element with the "Perform 7%" text
        WebElement perfelement = driver.findElement(mobileLocators.performlbale);

        // Get the text of the element
        String PerformValue = perfelement.getAttribute("name");

        // Extract the numeric value (assuming it's always a number followed by "%")
        String numericValue1 = PerformValue.split(" ")[1].replace("%", "");

        // Construct the dynamic XPath with the extracted value
        String performdynamicXPath = String.format("//XCUIElementTypeOther[@name='Perform %s%%']", numericValue1);

        // Use the dynamic XPath for automation
        WebElement performElement = driver.findElement(AppiumBy.xpath(performdynamicXPath));
        performElement.click();

        // Log message to console and Allure report
        LOGGER.info("Click on Perform card");
        AllureUtils.logStep("Click on perfom card");
        
        Thread.sleep(1000);
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "ios_Performscreen_screenshot");
        
        WebElement backicon1 = driver.findElement(mobileLocators.backbttnperform);
        backicon1.click();
        // Log message to console and Allure report
        LOGGER.info("Click on back button");
        AllureUtils.logStep("Click on back button");
        
		/*************************** Fuel********************************/
		
		// Find the element with the "Fuel 7%" text
        WebElement fuelelement = driver.findElement(mobileLocators.fuelable);

        // Get the text of the element
        String fuelValue = fuelelement.getAttribute("name");

        // Extract the numeric value (assuming it's always a number followed by "%")
        String numericValue = fuelValue.split(" ")[1].replace("%", "");

        // Construct the dynamic XPath with the extracted value
        String dynamicXPath = String.format("//XCUIElementTypeOther[@name='Fuel %s%%']", numericValue);

        // Use the dynamic XPath for automation
        WebElement fuelElement = driver.findElement(AppiumBy.xpath(dynamicXPath));
        fuelElement.click();
        
        // Log message to console and Allure report
        LOGGER.info("Click on Fuel card");
        AllureUtils.logStep("Click on Fuel card");
        
        Thread.sleep(1000);
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "ios_Fuelscreen_screenshot");
        
        WebElement backicon2 = driver.findElement(mobileLocators.backbttnperform);
        backicon2.click();
        // Log message to console and Allure report
        LOGGER.info("Click on back button");
        AllureUtils.logStep("Click on back button");
        /*************************** Mindful********************************/
		
		// Find the element with the "Fuel 7%" text
        WebElement mmindulelement = driver.findElement(mobileLocators.mindulable);

        // Get the text of the element
        String mindfulValue = mmindulelement.getAttribute("name");

        // Extract the numeric value (assuming it's always a number followed by "%")
        String mindfulnumericValue = mindfulValue.split(" ")[1].replace("%", "");

        // Construct the dynamic XPath with the extracted value
        String mindfuldynamicXPath = String.format("//XCUIElementTypeOther[@name='Mindful %s%%']", mindfulnumericValue);

        // Use the dynamic XPath for automation
        WebElement mindfulElement = driver.findElement(AppiumBy.xpath(mindfuldynamicXPath));
        mindfulElement.click();
        
        // Log message to console and Allure report
        LOGGER.info("Click on mindful card");
        AllureUtils.logStep("Click on mindfull card");
        
        Thread.sleep(1000);
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "ios_mindfulscreen_screenshot");
        
        WebElement backicon3 = driver.findElement(mobileLocators.backbttnperform);
        backicon3.click();
        // Log message to console and Allure report
        LOGGER.info("Click on back button");
        AllureUtils.logStep("Click on back button");
        /*************************** Restore ********************************/
		
		// Find the element with the "Fuel 7%" text
        WebElement Restoreelement = driver.findElement(mobileLocators.Restorlabel);

        // Get the text of the element
        String restoreValue = Restoreelement.getAttribute("name");

        // Extract the numeric value (assuming it's always a number followed by "%")
        String restorenumericValue = restoreValue.split(" ")[1].replace("%", "");

        // Construct the dynamic XPath with the extracted value
        String restoredynamicXPath = String.format("//XCUIElementTypeOther[@name='Restore %s%%']", restorenumericValue);

        // Use the dynamic XPath for automation
        WebElement restoreElement = driver.findElement(AppiumBy.xpath(restoredynamicXPath));
        restoreElement.click();
        
     // Log message to console and Allure report
        LOGGER.info("Click on restore card");
        AllureUtils.logStep("Click on restore card");
        
        Thread.sleep(1000);
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "ios_restorescreen_screenshot");
        
        WebElement backicon4 = driver.findElement(mobileLocators.backbttnperform);
        backicon4.click();
        
     // Log message to console and Allure report
        LOGGER.info("Click on back button");
        AllureUtils.logStep("Click on back button");
        
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "ios_Homescreen_screenshot");
        
	
		Thread.sleep(2500);
		
		  driver.terminateApp("com.cuesz.mobile");
	}
	
}

