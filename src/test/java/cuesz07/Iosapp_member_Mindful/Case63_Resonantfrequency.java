//https://chat.openai.com/share/f592ab35-529c-4434-a989-5fac7039696c
package cuesz07.Iosapp_member_Mindful;

import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.mobile.resources.mobileLocators;
import cuesz.mobile.resources.mobilelement;
import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Member access mindful feature")
@Feature ("Verify that member able to do access mindful biofeedback various options")
public class Case63_Resonantfrequency extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case63_Resonantfrequency.class);
	
	mobileLocators locators = new mobileLocators();	

	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
	@Description("Member able to update and change biofeedback options on scree")
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
            AllureUtils.captureScreenshot(driver, "Case58mindfulcasebasic1");

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
            AllureUtils.captureScreenshot(driver, "Case58mindfulcasebasic2");
            
            WebElement Restorelabel = driver.findElement(mobileLocators.mindfulabel);
            // Extract text from the element
            String actualText = Restorelabel.getText();
            // Define the expected text
            String expectedText = "Mindful";

            // Print the actual and expected text to the console
            System.out.println("Actual Text: " + actualText);
            System.out.println("Expected Text: " + expectedText);
            // Compare the actual and expected text
            Assert.assertEquals(actualText, expectedText);

            // Attach values to Allure report
            Allure.addAttachment("Actual Text", actualText);
            Allure.addAttachment("Expected Text", expectedText);

            // Log message to console and Allure report
            LOGGER.info("Verify label for Mindful label");
            AllureUtils.logStep("Verify label for Mindful label");
 
            //Click on back button from mindful screen 
            mobilelement.clickElement(driver, mobileLocators.backpressbutton);
            // Log message to console and Allure report
            LOGGER.info("Click on back from mindful screen");
            AllureUtils.logStep("Click on back from Mindful screen");
            
            
            // Click on mindful screen
            mobilelement.clickElement(driver, mobileLocators.mindulscreen);
            Thread.sleep(2500);
            // Log message to console and Allure report
            LOGGER.info("Click on Mindful screen");
            AllureUtils.logStep("Click on Mindful screen");
            
           
            
            
            
            
            
        
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