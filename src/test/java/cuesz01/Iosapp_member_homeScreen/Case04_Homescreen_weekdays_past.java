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
@Feature ("Verify homescreens weekdays and its details.")

public class Case04_Homescreen_weekdays_past extends AppiummobileBase {

	mobileLocators locators = new mobileLocators();	  
	private static final Logger LOGGER = LoggerFactory.getLogger(Case04_Homescreen_weekdays_past.class);

	@Test

	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify home screen details with previous week days data.")
    @Story("Click on weeks days and verify its related data for activity.")	
    public void Homescreen_weekdays() throws InterruptedException {
        // Create an instance of AppiumUtils and pass the driver
        AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");

        // Click on home menu from the bottom
        WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
        Homeicon.click();
        Homeicon.click();
		 // Log message to console and Allure report
       LOGGER.info("Click on home menu from bottom");
       AllureUtils.logStep("Click on home menu from bottom");
       // Capture a screenshot and attach it to Allure
       AllureUtils.captureScreenshot(driver, "ios_Homescreen_screenshot");
        
        
        
	     driver.findElement(AppiumBy.accessibilityId("ThuClicked")).click();
		 	// Log message to console and Allure report
	       LOGGER.info("Click on Thu");
	       AllureUtils.logStep("Click on Thu");
	       
	     driver.findElement(AppiumBy.accessibilityId("FriClicked")).click();
	 	// Log message to console and Allure report
	       LOGGER.info("Click on Fri");
	       AllureUtils.logStep("Click on Fri");
	     driver.findElement(AppiumBy.accessibilityId("SatClicked")).click();
	 	// Log message to console and Allure report
	       LOGGER.info("Click on Sat");
	       AllureUtils.logStep("Click on Sat");
	    
	     Thread.sleep(1000);
	     // Capture a screenshot and attach it to Allure
	     AllureUtils.captureScreenshot(driver, "SatClicked");
	     
	     driver.findElement(AppiumBy.accessibilityId("SunClicked")).click();
	 	// Log message to console and Allure report
	       LOGGER.info("Click on Sun");
	       AllureUtils.logStep("Click on Sun");
	     driver.findElement(AppiumBy.accessibilityId("MonClicked")).click();
	 	// Log message to console and Allure report
	       LOGGER.info("Click on Mon");
	       AllureUtils.logStep("Click on Mon");
	     driver.findElement(AppiumBy.accessibilityId("TueClicked")).click();
	 	// Log message to console and Allure report
	       LOGGER.info("Click on Tue");
	       AllureUtils.logStep("Click on Tue");
	     
	     Thread.sleep(1000);
	     // Capture a screenshot and attach it to Allure
	     AllureUtils.captureScreenshot(driver, "TueClicked");
	     
	     driver.findElement(AppiumBy.accessibilityId("WedClicked")).click();
	 		// Log message to console and Allure report
	     	LOGGER.info("Click on Wed");
	       AllureUtils.logStep("Click on Wed");
	     
	     Thread.sleep(2500);
	     driver.terminateApp("com.cuesz.mobile");
	
	
	}
}