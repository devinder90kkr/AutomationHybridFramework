//https://chat.openai.com/share/f592ab35-529c-4434-a989-5fac7039696c
package cuesz07.Iosapp_member_Mindful;

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
public class Case58mindfulcasebasic extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case58mindfulcasebasic.class);
	
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
            
            //Click on mindfulstart button 
            mobilelement.clickElement(driver, mobileLocators.mindfulstart);
            // Log message to console and Allure report
            LOGGER.info("Click on Mindful start button");
            AllureUtils.logStep("Click on Mindful start button");
            
            //Click & assert for guided label. 
            WebElement Guidedlabel = driver.findElement(mobileLocators.guidelabel);
            // Extract text from the element
            String actualText1 = Guidedlabel.getText();
            // Define the expected text
            String expectedText1 = "Guided";

            // Print the actual and expected text to the console
            System.out.println("Actual Text: " + actualText1);
            System.out.println("Expected Text: " + expectedText1);
            // Compare the actual and expected text
            Assert.assertEquals(actualText1, expectedText1);

            // Attach values to Allure report
            Allure.addAttachment("Actual Text", actualText1);
            Allure.addAttachment("Expected Text", expectedText1);

            // Log message to console and Allure report
            LOGGER.info("Verify label for option i.e; Guided");
            AllureUtils.logStep("Verify label for option i.e; Guided");
                
            //click on guided option
            mobilelement.clickElementMultipleTimes(driver, mobileLocators.guidedoption, 4);
            // Log message to console and Allure report
            LOGGER.info("Click on Mindful guidedoption");
            AllureUtils.logStep("Click on Mindful guidedoption");
            
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case58mindfulcasebasic3");
            
            // Skip default sound 
            
            //Click & assert for Vibration label. 
            WebElement vibrationLabel = driver.findElement(mobileLocators.vibrationlabel);
            // Extract text from the element
            String actualText2 = vibrationLabel.getText();
            // Define the expected text
            String expectedText2 = "Vibration";

            // Print the actual and expected text to the console
            System.out.println("Actual Text: " + actualText2);
            System.out.println("Expected Text: " + expectedText2);
            // Compare the actual and expected text
            Assert.assertEquals(actualText2, expectedText2);

            // Attach values to Allure report
            Allure.addAttachment("Actual Text", actualText2);
            Allure.addAttachment("Expected Text", expectedText2);

            // Log message to console and Allure report
            LOGGER.info("Verify label for option i.e; Vibration");
            AllureUtils.logStep("Verify label for option i.e; Vibration");
                        
            // Click on Vibrationtoggel
            mobilelement.clickElementMultipleTimes(driver, mobileLocators.vibrationToggel, 4);
            // Log message to console and Allure report
            LOGGER.info("Click on vibrationToggel");
            AllureUtils.logStep("Click on vibrationToggel");
            
            
            //Click on sound
            mobilelement.clickElementMultipleTimes(driver, mobileLocators.mindfulsounds,4);
            // Log message to console and Allure report
            LOGGER.info("Click on mindfulsounds");
            AllureUtils.logStep("Click on mindfulsounds");
            
            
            //Click & assert for Display Physiological Data label. 
            WebElement displaylabel = driver.findElement(mobileLocators.displaylabel);
            // Extract text from the element
            String actualText3 = displaylabel.getText();
            // Define the expected text
            String expectedText3 = "Display Physiological Data";

            // Print the actual and expected text to the console
            System.out.println("Actual Text: " + actualText3);
            System.out.println("Expected Text: " + expectedText3);
            // Compare the actual and expected text
            Assert.assertEquals(actualText3, expectedText3);

            // Attach values to Allure report
            Allure.addAttachment("Actual Text", actualText3);
            Allure.addAttachment("Expected Text", expectedText3);

            // Log message to console and Allure report
            LOGGER.info("Verify label for option i.e; displaylabel");
            AllureUtils.logStep("Verify label for option i.e; displaylabel");
            
            //Click on Display data toggel icon
            mobilelement.clickElementMultipleTimes(driver, mobileLocators.displaydatatoggel, 4);
            // Log message to console and Allure report
            LOGGER.info("Click on displaydatatoggel");
            AllureUtils.logStep("Click on displaydatatoggel");       
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case58mindfulcasebasic4");
            
            
            //Click & assert for Adaptive Biofeedback Reminder label. 
            WebElement AdaptiveReminderlabel = driver.findElement(mobileLocators.adaptivereminderlabel);
            // Extract text from the element
            String actualText4 = AdaptiveReminderlabel.getText();
            // Define the expected text
            String expectedText4 = "Adaptive Biofeedback Reminder";

            // Print the actual and expected text to the console
            System.out.println("Actual Text: " + actualText4);
            System.out.println("Expected Text: " + expectedText4);
            // Compare the actual and expected text
            Assert.assertEquals(actualText4, expectedText4);

            // Attach values to Allure report
            Allure.addAttachment("Actual Text", actualText4);
            Allure.addAttachment("Expected Text", expectedText4);

            // Log message to console and Allure report
            LOGGER.info("Verify label for option i.e; adaptivereminderlabel");
            AllureUtils.logStep("Verify label for option i.e; adaptivereminderlabel");
           
            
//            //  mobilelement.setPickerValues(driver, mobileLocators.Timepicker, mobileLocators.pickerelement, valuesToSet3);
//            mobilelement.clickElement(driver, mobileLocators.Timepicker);
//            // Log message to console and Allure report
//            LOGGER.info("Click on Timer value");
//            AllureUtils.logStep("Click on timer value");   
//
//            // Set values in the picker elements
//            String[] valuesToSet3 = {"10", "18", "AM"};
//            mobilelement.setPickerValues(driver, mobileLocators.selectTimereminder, mobileLocators.pickerelement, valuesToSet3);
//            // Convert the array to a string for logging
//            String timepickerValues = String.join(":", valuesToSet3);
//            // Log message to console and Allure report
//            LOGGER.info("Verify label for option i.e; Timepicker. Values set: " + timepickerValues);
//            AllureUtils.logStep("Verify label for option i.e; Timepicker. Values set: " + timepickerValues);
//            // Capture a screenshot and attach it to Allure
//            AllureUtils.captureScreenshot(driver, "Case58mindfulcasebasic4");
//            Thread.sleep(2500);
//            //Click on done button for timer
//            mobilelement.clickElement(driver, mobileLocators.Doneclick);
//            // Log message to console and Allure report
//            LOGGER.info("Click on Timer done");
//            AllureUtils.logStep("Click on timer done");   
//            
//            //Click on submit
//            mobilelement.clickElement(driver, mobileLocators.submittimer);
//            mobilelement.clickElement(driver, mobileLocators.submittimer);
//         // Log message to console and Allure report
//            LOGGER.info("Click on Timer submit");
//            AllureUtils.logStep("Click on timer submit");   
//            
            //Click on stress options
            mobilelement.clickElement(driver, mobileLocators.stressoption1);
            mobilelement.clickElement(driver, mobileLocators.stressoption2);
            mobilelement.clickElement(driver, mobileLocators.stressoption3);
            // Log message to console and Allure report
            LOGGER.info("Click on stressoption's");
            AllureUtils.logStep("Click on stressoption");   
            
            mobilelement.scrollDownToElement(driver, "Energy");
            
            //Click on energy options
            mobilelement.clickElement(driver, mobileLocators.energy1);
            mobilelement.clickElement(driver, mobileLocators.energy2);
            mobilelement.clickElement(driver, mobileLocators.energy3);
            // Log message to console and Allure report
            LOGGER.info("Click on energy's");
            AllureUtils.logStep("Click on energy's'");  
            
            
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case58mindfulcasebasic5");
            
            //Click on tick option 
            mobilelement.clickElement(driver, mobileLocators.tick);
            // Log message to console and Allure report
            LOGGER.info("Click on tick");
            AllureUtils.logStep("Click on tick");  
            
            
        
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