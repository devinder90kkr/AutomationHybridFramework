//https://chat.openai.com/share/f592ab35-529c-4434-a989-5fac7039696c
package cuesz07.Iosapp_member_Mindful;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import cuesz.pages.AppiummobileBase;
import cuesz.utils.AllureUtils;
import cuesz.utils.AppiumappUtils;
import cuesz.utils.mobileLocators;
import cuesz.utils.mobilelement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Member access mindful feature")
@Feature ("Verify that member able to do access mindful biofeedback")
public class Case60mindfulwith_sosche extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case60mindfulwith_sosche.class);
	
	mobileLocators locators = new mobileLocators();	

	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
	@Description("Member able to update and change biofeedback options on screen and redirect to mindful screen")
    @Story("Scroll to mindful and access options for mindful feature ")
	public void mindfulscreen() throws InterruptedException {	
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
            AllureUtils.captureScreenshot(driver, "Case59mindful_functionliaty1");

            // scroll-down to perform fuel mind-full restore label
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
            AllureUtils.captureScreenshot(driver, "Case59mindful_functionliaty2");
   
            
            //Click on mindfulstart button 
            mobilelement.clickElement(driver, mobileLocators.mindfulstart);
            // Log message to console and Allure report
            LOGGER.info("Click on Mindful start button");
            AllureUtils.logStep("Click on Mindful start button");
                 
            //Click on stress options
            mobilelement.clickElement(driver, mobileLocators.stressoption1);
            mobilelement.clickElement(driver, mobileLocators.stressoption2);
            mobilelement.clickElement(driver, mobileLocators.stressoption3);
            // Log message to console and Allure report
            LOGGER.info("Click on stressoption's");
            AllureUtils.logStep("Click on stressoption");   
            
            // scroll-down to perform fuel mind-full restore label
            mobilelement.scrollDownToElement(driver, "High");
            
            //Click on energy options
            mobilelement.clickElement(driver, mobileLocators.energy1);
            mobilelement.clickElement(driver, mobileLocators.energy2);
            mobilelement.clickElement(driver, mobileLocators.energy3);
            // Log message to console and Allure report
            LOGGER.info("Click on energy's");
            AllureUtils.logStep("Click on energy's'");  
            
            
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case59mindful_functionliaty3");
            
            //Click on tick option 
            mobilelement.clickElement(driver, mobileLocators.tick);
            // Log message to console and Allure report
            LOGGER.info("Click on tick");
            AllureUtils.logStep("Click on tick");  
            
            
            WebElement Popuptext = driver.findElement(mobileLocators.tracklabel);
            // Extract text from the element
            String actualText = Popuptext.getText();
            // Define the expected text
            String expectedText = "To track your progress accurately during your Adaptive Biofeedback session, it is recommended that you keep the app active in the foreground.";

            // Print the actual and expected text to the console
            System.out.println("Actual Text: " + actualText);
            System.out.println("Expected Text: " + expectedText);
            // Compare the actual and expected text
            Assert.assertEquals(actualText, expectedText);

            // Attach values to Allure report
            Allure.addAttachment("Actual Text", actualText);
            Allure.addAttachment("Expected Text", expectedText);

            // Log message to console and Allure report
            LOGGER.info("Verify label for popup tracklabel label");
            AllureUtils.logStep("Verify label for popup tracklabel label");
            
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case59mindful_functionliaty4");
            
            
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
            AllureUtils.captureScreenshot(driver, "Case59mindful_functionliaty5");

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
            AllureUtils.captureScreenshot(driver, "Case59mindful_functionliaty6");
            
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
                       System.out.println("Waiting for mindful session to complete: " + (i + 1) + " seconds");
                   }
               }

               // Click on performanceeditsubmit button
               mobilelement.clickElement(driver, mobileLocators.performanceeditsubmit);
               // Capture a screenshot and attach it to Allure
               AllureUtils.captureScreenshot(driver, "Case59mindful_functionliaty7");
               LOGGER.info("Click on performanceeditsubmit");
               AllureUtils.logStep("Click on performanceeditsubmit");
               
               
               mobilelement.clickElement(driver,mobileLocators.stressoption1);
               mobilelement.clickElement(driver,mobileLocators.stressoption3);
               
               // Capture a screenshot and attach it to Allure
               AllureUtils.captureScreenshot(driver, "Case59mindful_functionliaty8");
               LOGGER.info("Click on stressoption");
               AllureUtils.logStep("Click on stressoption");
               
               Thread.sleep(3000);
               mobilelement.clickElement(driver, mobileLocators.submittimer);
               // Capture a screenshot and attach it to Allure
        
               LOGGER.info("Click on submittimer");
               AllureUtils.logStep("Click on submittimer");
               

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
       }}