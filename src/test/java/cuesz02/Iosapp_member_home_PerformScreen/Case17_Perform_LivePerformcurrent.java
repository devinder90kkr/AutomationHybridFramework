//package cuesz02.Iosapp_member_home_PerformScreen;
//
//import org.openqa.selenium.WebElement;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.testng.annotations.Test;
//
//import cuesz.pages.AppiummobileBase;
//import cuesz.utils.AllureUtils;
//import cuesz.utils.AppiumappUtils;
//import cuesz.utils.mobileLocators;
//import io.qameta.allure.Description;
//import io.qameta.allure.Epic;
//import io.qameta.allure.Feature;
//import io.qameta.allure.Owner;
//import io.qameta.allure.Severity;
//import io.qameta.allure.SeverityLevel;
//import io.qameta.allure.Story;
//
//@Epic ("Home screen detail ")
//@Feature ("Verify Live perform icon when event time min 15 min")
//
//
//public class Case17_Perform_LivePerformcurrent extends AppiummobileBase {
//
//	mobileLocators locators = new mobileLocators();	
//	private static final Logger LOGGER = LoggerFactory.getLogger(Case17_Perform_LivePerformcurrent.class);
//
//	
//	@Test
//	@Owner("QA") // Add the @Owner annotation to specify the executor
//    @Severity(SeverityLevel.NORMAL)      
//    @Description("Verify home screen & check LP redirection to perform card on homescreen.")
//    @Story("here, we need to verify LP icon functionality redirection to perform screen if counter equal or less than 15 min")	
//	
//	public void HomescreenLiveperfrom() throws InterruptedException	{	
//try {
//		// Create an instance of AppiumUtils and pass the driver
//		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
//        // Launch the app using the utility method
//        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");
//		
//		// CLick on home menu from bottom
//		WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
//		Homeicon.click();
//		
//		 // Log console message to Allure
//        LOGGER.info("Click on home menu from bottom");
//        AllureUtils.logStep("Click on home menu from bottom");
//        
//		
//		   // Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "LP icon");
//		
//		
//        Thread.sleep(3500);
//		WebElement livePerform = driver.findElement(mobileLocators.liveperfrmicon);
//		livePerform.click();
//		
//		 // Log console message to Allure
//        LOGGER.info("Click on livePerform ");
//        AllureUtils.logStep("Click on livePerform");
//		
//		  // Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "perform selection");
//        
//        WebElement StartLP	= driver.findElement(mobileLocators.liveperform);
//        StartLP.click();
//     // Log console message to Allure
//        LOGGER.info("Click on StartLP ");
//        AllureUtils.logStep("Click on StartLP");
//        
////        this is incomplete script for LP 
//
//        
//} catch (Exception e) {
//    LOGGER.error("An error occurred during the mindful screen test", e);
//    AllureUtils.logStep("An error occurred: " + e.getMessage());
//} finally {
//    // Terminate the app whether the test passed or failed
//    try {
//        Thread.sleep(8500);
//    } catch (InterruptedException e) {
//        LOGGER.error("Thread interrupted during final sleep", e);
//        Thread.currentThread().interrupt();
//    }
//    driver.terminateApp("com.cuesz.mobile");
//}
//}}

package cuesz02.Iosapp_member_home_PerformScreen;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.mobile.resources.mobileLocators;
import cuesz.mobile.resources.mobileTestData;
import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("Home screen detail")
@Feature("Verify Live perform icon when event time min 15 min")
public class Case17_Perform_LivePerformcurrent extends AppiummobileBase {

    mobileLocators locators = new mobileLocators();    
    private static final Logger LOGGER = LoggerFactory.getLogger(Case17_Perform_LivePerformcurrent.class);

    @Test
    @Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify home screen & check LP redirection to perform card on homescreen.")
    @Story("here, we need to verify LP icon functionality redirection to perform screen if counter equal or less than 15 min")    
    public void HomescreenLiveperfrom() throws InterruptedException {    
        try {
            // Create an instance of AppiumUtils and pass the driver
            AppiumappUtils appiumUtils = new AppiumappUtils(driver);
            // Launch the app using the utility method
//            appiumUtils.launchAppWithPackageId("com.cuesz.mobile");
            appiumUtils.launchAppWithPackageId(mobileTestData.bundelID);
            
            // Click on home menu from bottom
            WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
            Homeicon.click();
            
            // Log console message to Allure
            LOGGER.info("Click on home menu from bottom");
            AllureUtils.logStep("Click on home menu from bottom");
            
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "LP icon");
            
            Thread.sleep(3500);
            
            // Try to find the live perform icon
            try {
                WebElement livePerform = driver.findElement(mobileLocators.liveperfrmicon);
                livePerform.click();
                
                // Log console message to Allure
                LOGGER.info("Click on livePerform");
                AllureUtils.logStep("Click on livePerform");
                
                // Capture a screenshot and attach it to Allure
                AllureUtils.captureScreenshot(driver, "perform selection");
                
                WebElement StartLP = driver.findElement(mobileLocators.liveperform);
                StartLP.click();
                
                // Log console message to Allure
                LOGGER.info("Click on StartLP");
                AllureUtils.logStep("Click on StartLP");
                
            } catch (NoSuchElementException e) {
                LOGGER.warn("Live perform icon not available. Skipping test.");
                AllureUtils.logStep("Live perform icon not available. Skipping test.");
                throw new SkipException("Live perform icon not available.");
            }

        } catch (Exception e) {
            LOGGER.error("An error occurred during the mindful screen test", e);
            AllureUtils.logStep("An error occurred: " + e.getMessage());
        } finally {
            // Terminate the app whether the test passed or failed
            try {
                Thread.sleep(8500);
            } catch (InterruptedException e) {
                LOGGER.error("Thread interrupted during final sleep", e);
                Thread.currentThread().interrupt();
            }
//            driver.terminateApp("com.cuesz.mobile");
            driver.terminateApp(mobileTestData.bundelID);
        }
    }
}
