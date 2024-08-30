package cuesz07.Iosapp_member_Mindful;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.mobile.resources.mobileLocators;
import cuesz.mobile.resources.mobilelement;
import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Member access Resonant frequency feature")
@Feature ("Verify that member able to do access Resonant frequency with sochse")
public class Case63_Resonantfrequency extends AppiummobileBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(Case63_Resonantfrequency.class);

    mobileLocators locators = new mobileLocators();    

    @Test
    @Owner("QA")
    @Severity(SeverityLevel.NORMAL)
    @Description("Member able to do Resonant frequency")
    @Story("Scroll to mindful and access Resonant frequency")
    public void resonantfrequency() throws InterruptedException {    
        try { 
            // Create an instance of AppiumUtils and pass the driver
            AppiumappUtils appiumUtils = new AppiumappUtils(driver);
            // Launch the app using the utility method
            appiumUtils.launchAppWithPackageId("com.cuesz.mobile");

            // Click on Home-icon
            mobilelement.clickElement(driver, mobileLocators.Homeclick);

            // Log message to console and Allure report
            LOGGER.info("Click on Home menu button");
            AllureUtils.logStep("Click on Home button");
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case63_Resonantfrequency");

            // Scroll down to perform fuel mind-full restore label
            mobilelement.scrollDownToElement(driver, "Perform Fuel Mindful Restore");

            // Log message to console and Allure report
            LOGGER.info("Scroll down to Mindful");
            AllureUtils.logStep("Scroll down to mindful");

            // Click on mindful screen
            mobilelement.clickElement(driver, mobileLocators.mindulscreen);
            Thread.sleep(2500);
            // Log message to console and Allure report
            LOGGER.info("Click on Mindful screen");
            AllureUtils.logStep("Click on Mindful screen");
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case63_Resonantfrequency1");

            // Check if the resonant frequency option is available
            if (mobilelement.isElementPresent(driver, mobileLocators.resonantfrequency)) {
                // Click on mindful start
//                mobilelement.clickElement(driver, mobileLocators.mindfulstart);
                mobilelement.clickElement(driver, mobileLocators.resonantfrequency);
                Thread.sleep(2500);
                // Log message to console and Allure report
                LOGGER.info("Click on Resonant Frequency");
                AllureUtils.logStep("Click on Resonant Frequency");
                // Capture a screenshot and attach it to Allure
                AllureUtils.captureScreenshot(driver, "Case63_Resonantfrequency2");
            } else {
                // Skip the test if resonant frequency is not available
                LOGGER.warn("Resonant frequency is not available on the screen. Skipping the test.");
                AllureUtils.logStep("Resonant frequency not enabled for member. Skipping the test.");
                throw new SkipException("Resonant frequency not enabled for member. Skipping the test.");
            }
            
            mobilelement.clickElement(driver, mobileLocators.tick);
            LOGGER.info("Click on popup tick button");
            AllureUtils.logStep("Click on popup tick button");
            
            Thread.sleep(2500);
            
            
            try {
                // Find and click on Syncmydevicebttn
                WebElement Syncmydevicebttn = driver.findElement(mobileLocators.syncdevicebttn);
                Syncmydevicebttn.click();
                
                // Log console message to Allure
                LOGGER.info("Clicked on Syncmydevice button");
                AllureUtils.logStep("Clicked on Syncmydevice button");
            } catch (NoSuchElementException e) {
                // Handle the case where the element is not found
                LOGGER.error("Element not found: syncdevicebttn", e);
                AllureUtils.logStep("Element not found: syncdevicebttn");
            }
            // Log message to console and Allure report
            LOGGER.info("");
            AllureUtils.logStep("Verify label for popup tracklabel label");
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case63_Resonantfrequency3");

            //Click on sysndevices
            mobilelement.clickElement(driver, mobileLocators.syncdevice);
            // Log console message to Allure
            LOGGER.info("Clicked on syncdevice button");
            AllureUtils.logStep("Clicked on syncdevice button");

            try {
                // Find and click on Syncmydevicebttn
                WebElement Syncmydevicebttn = driver.findElement(mobileLocators.syncdevicebttn);
                Syncmydevicebttn.click();
                
                // Log console message to Allure
                LOGGER.info("Clicked on Syncmydevice button");
                AllureUtils.logStep("Clicked on Syncmydevice button");
            } catch (NoSuchElementException e) {
                // Handle the case where the element is not found
                LOGGER.error("Element not found: syncdevicebttn", e);
                AllureUtils.logStep("Element not found: syncdevicebttn");
            }
            // Log message to console and Allure report
            LOGGER.info("");
            AllureUtils.logStep("Verify label for popup tracklabel label");
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case63_Resonantfrequency4");
            
            //Click on mindful start button
            mobilelement.clickElement(driver, mobileLocators.startmindful);
            //Log console message to Allure
            LOGGER.info("Clicked on startmindful button");
            AllureUtils.logStep("Clicked on startmindful button");
                 
            // Wait for the mindful session to complete (timer to reach 00:00)
               for (int i = 0; i < 123; i++) { // Adjust the maximum wait time as needed
                   Thread.sleep(1000);
                   try {
                       WebElement timerElement = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"00:00\"`]"));
                       if (timerElement != null) {
                           break;
                       }
                   } catch (NoSuchElementException e) {
                       // If the element is not found, continue waiting
                       System.out.println("Waiting for Resonant session to complete: " + (i + 1) + " seconds");
                   }
               }

               // Click on performanceeditsubmit button
               mobilelement.clickElement(driver, mobileLocators.performanceeditsubmit);
               // Capture a screenshot and attach it to Allure
               AllureUtils.captureScreenshot(driver, "Case63_Resonantfrequency5");
               LOGGER.info("Click on performanceeditsubmit");
               AllureUtils.logStep("Click on performanceeditsubmit");
               
 
            Thread.sleep(3500);
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case63_Resonantfrequency4");
            
            Thread.sleep(3000);
            mobilelement.clickElement(driver, mobileLocators.doneclick);
            // Capture a screenshot and attach it to Allure
            LOGGER.info("Click on doneclick");
            AllureUtils.logStep("Click on doneclick");

        
        
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
            driver.terminateApp("com.cuesz.mobile");
        }
    }
}
