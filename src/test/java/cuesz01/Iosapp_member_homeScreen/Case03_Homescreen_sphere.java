package cuesz01.Iosapp_member_homeScreen;

import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.mobile.resources.mobileLocators;
import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Home screen detail ")
@Feature ("Verify spheres separtors detail for Perform, Fuel, Mindful & Restore.")


public class Case03_Homescreen_sphere extends AppiummobileBase {


	mobileLocators locators = new mobileLocators();	
	private static final Logger LOGGER = LoggerFactory.getLogger(Case03_Homescreen_sphere.class);
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify home screen & check spheres separtors.")
    @Story("Click on spheres and verify bounces spehere activity.")	
	
	public void Homescreensperators() throws InterruptedException
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
        
        
        Thread.sleep(2000);
		// Click on sphere sperators to check spheres activity.
        WebElement separtor =driver.findElement(mobileLocators.separtorclick);
        separtor.click();
        // Log message to console and Allure report
        LOGGER.info("Click on sphere sperator");
        AllureUtils.logStep("Click sphere seprator");
        
        Thread.sleep(2500);
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "ios_Homescreen_spehereseparators2");
        
        
        Thread.sleep(2000);
		// Click on sphere sperators to check spheres activity.
        WebElement combinsepartor =driver.findElement(mobileLocators.combinesphereclick);
        combinsepartor .click();
        
     // Log message to console and Allure report
        LOGGER.info("Click on sphere sperator for combine");
        AllureUtils.logStep("Click sphere seprator for combine");
        
        Thread.sleep(2500);
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "ios_Homescreen_Combineeeparators");
        
        
        Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
	
	}
	
}

