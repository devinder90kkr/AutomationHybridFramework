package cuesz08.Iosapp_member_Myprofile;

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

@Epic ("Member access review body scan detail")
@Feature ("Verify that member able to access my profile setting and check body scan result")
public class Case59Avtarclick extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case59Avtarclick.class);
	
	mobileLocators locators = new mobileLocators();	

	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
	@Description("Member able to review body scan detail")
    @Story("Body scan result feature access able by member ")
	public void avtarscren() throws InterruptedException {	
		try {  
		// Create an instance of AppiumUtils and pass the driver
            AppiumappUtils appiumUtils = new AppiumappUtils(driver);
            // Launch the app using the utility method
            appiumUtils.launchAppWithPackageId("com.cuesz.mobile");

            // Click on Home-icon
            mobilelement.clickElement(driver, mobileLocators.profilclick);

            // Log message to console and Allure report
            LOGGER.info("Click on profile icon from menu button");
            AllureUtils.logStep("Click from profile icon from home menu");
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case59Myprofile1");

            
            //Click on avatar postire 
            mobilelement.clickElement(driver, mobileLocators.Posturedclick);
            // Log message to console and Allure report
            LOGGER.info("Click on Avatar posture from profile screen");
            AllureUtils.logStep("Click on Avatar posture from profile screen");
            
            Thread.sleep(2500);
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case59Myprofile2");
            
            // Check if restorelabel is present
            if (mobilelement.isElementPresent(driver, mobileLocators.totalbodyfat)) {
            //click on totalbody fat
            mobilelement.clickElement(driver, mobileLocators.totalbodyfat);    
            // Log message to console and Allure report
            LOGGER.info("Click on totalbodyfat");
            AllureUtils.logStep("Click on totalbodyfat");
            Thread.sleep(2500);
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case59Myprofile3");
            
            //Click on back button
            mobilelement.clickElement(driver, mobileLocators.backpressbutton);
            // Log message to console and Allure report
            LOGGER.info("Click on backpressbutton");
            AllureUtils.logStep("Click on backpressbutton");
          
            //Click on Visceralfat 
            mobilelement.clickElement(driver, mobileLocators.Visceralfat);
            // Log message to console and Allure report
            LOGGER.info("Click on Visceralfat");
            AllureUtils.logStep("Click on Visceralfat");
            Thread.sleep(2500);
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case59Myprofile4");
            
            
            //Click on back button
            mobilelement.clickElement(driver, mobileLocators.backpressbutton);
            // Log message to console and Allure report
            LOGGER.info("Click on backpressbutton");
            AllureUtils.logStep("Click on backpressbutton");
        
            //Click on waist to hip ration
            mobilelement.clickElement(driver, mobileLocators.Waisttohip);
            // Log message to console and Allure report
            LOGGER.info("Click on Waisttohip");
            AllureUtils.logStep("Click on Waisttohip");
            Thread.sleep(2500);
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case59Myprofile5");
            
            //Click on back button
            mobilelement.clickElement(driver, mobileLocators.backpressbutton);
            // Log message to console and Allure report
            LOGGER.info("Click on backpressbutton");
            AllureUtils.logStep("Click on backpressbutton");
        
            //Click on waist to height 
            mobilelement.clickElement(driver, mobileLocators.waistoheight);
            // Log message to console and Allure report
            LOGGER.info("Click on waistoheight");
            AllureUtils.logStep("Click on waistoheight");
            Thread.sleep(2500);
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case59Myprofile6");
 
            //Click on back button
            mobilelement.clickElement(driver, mobileLocators.backpressbutton);
            // Log message to console and Allure report
            LOGGER.info("Click on backpressbutton");
            AllureUtils.logStep("Click on backpressbutton");
            
            //Click on waist to hip ration
            mobilelement.clickElement(driver, mobileLocators.wasitcircumference);
            // Log message to console and Allure report
            LOGGER.info("Click on wasitcircumference");
            AllureUtils.logStep("Click on wasitcircumference");
            Thread.sleep(2500);
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case59Myprofile7");
       
            //Click on back button
            mobilelement.clickElement(driver, mobileLocators.backpressbutton);
            // Log message to console and Allure report
            LOGGER.info("Click on backpressbutton");
            AllureUtils.logStep("Click on backpressbutton");
            
            //Click on waist to hip ration
            mobilelement.clickElement(driver, mobileLocators.Hipcircumference);
            // Log message to console and Allure report
            LOGGER.info("Click on Hipcircumference");
            AllureUtils.logStep("Click on Hipcircumference");
            Thread.sleep(2500);
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case59Myprofile8");
            
            
            //Click on back button
            mobilelement.clickElement(driver, mobileLocators.backpressbutton);
            // Log message to console and Allure report
            LOGGER.info("Click on backpressbutton");
            AllureUtils.logStep("Click on backpressbutton");
            
            mobilelement.clickElement(driver, mobileLocators.bodyscanrisk);
            // Log message to console and Allure report
            LOGGER.info("Click on bodyscanrisk");
            AllureUtils.logStep("Click on bodyscanrisk");
            Thread.sleep(2500);
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case59Myprofile9");
            
            //Click on back button
            mobilelement.clickElement(driver, mobileLocators.backpressbutton);
            // Log message to console and Allure report
            LOGGER.info("Click on backpressbutton");
            AllureUtils.logStep("Click on backpressbutton");
            
            
            mobilelement.clickElement(driver, mobileLocators.bodyscanumber);
            // Log message to console and Allure report
            LOGGER.info("Click on bodyscanumber");
            AllureUtils.logStep("Click on bodyscanumber");
            Thread.sleep(2500);
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case59Myprofile10");
            
            //Click on back button
            mobilelement.clickElement(driver, mobileLocators.backpressbutton);
            // Log message to console and Allure report
            LOGGER.info("Click on backpressbutton");
            AllureUtils.logStep("Click on backpressbutton");
            
           
                Thread.sleep(8500);
                driver.terminateApp("com.cuesz.mobile");
            }else {
                // Log message and handle if restorelabel is not present
                LOGGER.warn("Profile avtar values not availble, so skipping test steps related to body scan.");
                Allure.addAttachment("Warning", "option not available, test steps skipped.");
                // Optionally, you can choose to mark the test as skipped or continue with other tests
                // throw new SkipException("Restore recommended option not available");
            }
        } catch (Exception e) {
            LOGGER.error("Exception occurred: " + e.getMessage());
            // Handle exception gracefully
            Assert.fail("Test execution failed: " + e.getMessage());
        }
    }}