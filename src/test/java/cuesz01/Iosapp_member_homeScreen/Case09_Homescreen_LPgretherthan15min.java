package cuesz01.Iosapp_member_homeScreen;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import cuesz.utils.mobile.mobileLocators;
import cuesz.utils.reporting.AllureUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Home screen detail ")
@Feature ("Verify Live perform icon when event time more than 15 min")


public class Case09_Homescreen_LPgretherthan15min extends AppiummobileBase {

	private static final Logger LOGGER = LoggerFactory.getLogger(Case09_Homescreen_LPgretherthan15min.class);
	
	mobileLocators locators = new mobileLocators();	
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify home screen & check LP redirection to perform card on homescreen.")
    @Story("here, we need to verify LP icon functionality redirection to perform screen if counter exceed more than 15 min")	
	
	public void HomescreenLiveperfrom() throws InterruptedException
	{	

		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");
		
		// CLick on home menu from bottom
		WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
		Homeicon.click();
		
        // Log message to console and Allure report
        LOGGER.info("Clicked on home menu from bottom");
        AllureUtils.logStep("Clicked on home menu from bottom");

		
		   // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "LP icon");
			
		  // Check if the Crossclick element is displayed before clicking on it
		WebElement livePerform = null;
		try {
			livePerform = driver.findElement(mobileLocators.liveperfrmicon);
		    if (livePerform.isDisplayed()) {
		    	livePerform.click();
		    } else {
		        // Handle the case where the element is not displayed
		        System.out.println("Live perform element is not displayed.");
		        // Perform some other action or throw an exception if needed
		     // Log message to console and Allure report
                LOGGER.info("Live perform element is not displayed.");
                AllureUtils.logStep("Live perform element is not displayed.");
		    }
		} catch (NoSuchElementException e) {
		    // Handle the case where the element is not found
		    System.out.println("Live perform element not found.");
		    // Perform some other action or throw an exception if needed
		 // Log message to console and Allure report
            LOGGER.info("Live perform element not found.");
            AllureUtils.logStep("Live perform element not found.");
		}
		     
		  // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform selection");
	
	
		Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
	

	}}
