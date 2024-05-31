package cuesz01.Iosapp_member_homeScreen;

import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AllureUtils;
import cuesz.utils.AppiumappUtils;
import cuesz.utils.mobileLocators;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Home screen detail ")
@Feature ("Verify on home screen click on forward & backward arrow functionality.")


public class Case05_Homescreen_forward_backwardarrows extends AppiummobileBase {

	mobileLocators locators = new mobileLocators();	
	private static final Logger LOGGER = LoggerFactory.getLogger(Case05_Homescreen_forward_backwardarrows.class);	
	
	@Test

	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify the functionlaity for arrow and back. ")
    @Story(" here we check data when click on forward and backward arrorw icon")	
	
	public void Homescreenarrows() throws InterruptedException
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
		
//		scrollDown();
		
		// Click on HomeBackArrow button 4 times
	    for (int i = 0; i < 4; i++) {
	        WebElement backarrow = driver.findElement(mobileLocators.backarrowbttn);
	        backarrow.click();
	        //  Thread.sleep(1000); // Optional delay to observe the action
	    		// Log message to console and Allure report
		       LOGGER.info("Click on back arrow for old week");
		       AllureUtils.logStep("Click on back arrow for old week");
	        
	        Thread.sleep(2500);
	        // Capture a screenshot and attach it to Allure
	           AllureUtils.captureScreenshot(driver, "backarrowbttn");
	        
	    }

	    // Click on HomeForwardArrow button 5 times
	    for (int i = 0; i < 5; i++) {
	        WebElement forwardarrow = driver.findElement(mobileLocators.forwardarrowbttn );
	        forwardarrow.click();
	    //    Thread.sleep(1000); // Optional delay to observe the action
	     // Log message to console and Allure report
		       LOGGER.info("Click on forward arrow for new or upcoming week");
		       AllureUtils.logStep("Click on new arrow for new or upcoming week");
	        
	        Thread.sleep(2500);
	        // Capture a screenshot and attach it to Allure
	           AllureUtils.captureScreenshot(driver, "backarrowbttn");
	    }

	    // Click on HomeBackArrow button 1 more time
	    WebElement backarrow = driver.findElement(mobileLocators.backarrowbttn);
	    backarrow.click();
	 // Log message to console and Allure report
	       LOGGER.info("Click on back button");
	       AllureUtils.logStep("Click on back button");
	    Thread.sleep(1000); // Optional delay to observe the action
		
	    Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
         	
	}
	

}
