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
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Verify tutorial screen features")
@Feature ("Verify that member able to view tutorial screen info")
public class Case62Tutorial extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case62Tutorial.class);
	
	mobileLocators locators = new mobileLocators();	

	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
	@Description("Member able to view and read various tutorial screen")
    @Story("By using profile setting member able to access tutorial screen")
	public void tutorialinfo() throws InterruptedException {	
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
            AllureUtils.captureScreenshot(driver, "Case62Tutorial1");
            
            // Click on tutorial screen
            mobilelement.clickElement(driver, mobileLocators.tutorialbttn);
            // Log message to console and Allure report
            LOGGER.info("Click on tutorial button");
            AllureUtils.logStep("Click on tutorial button");
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case62Tutorial2");
            
            
            
            // Get text and assert
            String motionSessionText = mobilelement.getElementText(driver, mobileLocators.motionsession);
            LOGGER.info("Motion session text: " + motionSessionText);
            AllureUtils.logStep("Motion session text: " + motionSessionText);
            Assert.assertEquals(motionSessionText, "Motion Explore Session", "Motion session text does not match!");
            
            // Click on motionsession 
            mobilelement.clickElement(driver, mobileLocators.motionsession);
            // Log message to console and Allure report
            LOGGER.info("Click on motion Explore session ");
            AllureUtils.logStep("Click on motion Explore Session");
            Thread.sleep(2500);
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case62Tutorial3"); 

            // Click on backbutton 
            mobilelement.clickElement(driver, mobileLocators.backpressbutton);
            
            
            // Get text and assert
            String liveSessionText = mobilelement.getElementText(driver, mobileLocators.livesession);
            LOGGER.info("Live session text: " + liveSessionText);
            AllureUtils.logStep("Live session text: " + liveSessionText);
            Assert.assertEquals(liveSessionText, "Live Perform Session", "Live session text does not match!");

            // Click on livesession 
            mobilelement.clickElement(driver, mobileLocators.livesession);
            // Log message to console and Allure report
            LOGGER.info("Click on live session button");
            AllureUtils.logStep("Click on live session button");
            Thread.sleep(2500);
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case62Tutorial4");
            
          
            // Click on backbutton 
            mobilelement.clickElement(driver, mobileLocators.backpressbutton);

            
            // Get text and assert
            String monthlyBodyText = mobilelement.getElementText(driver, mobileLocators.monthlybody);
            LOGGER.info("Monthly body text: " + monthlyBodyText);
            AllureUtils.logStep("Monthly body text: " + monthlyBodyText);
            Assert.assertEquals(monthlyBodyText, "Monthly Body Composition", "Monthly body text does not match!");
            
            // Click on monthlybody 
            mobilelement.clickElement(driver, mobileLocators.monthlybody);
            // Log message to console and Allure report
            LOGGER.info("Click on monthly body button");
            AllureUtils.logStep("Click on monthly body button");
            Thread.sleep(2500);
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case62Tutorial5");

            // Click on backbutton 
            mobilelement.clickElement(driver, mobileLocators.backpressbutton);
          

              
            Thread.sleep(3500);
		 } catch (Exception e) {
	            LOGGER.error("An error occurred during the cases ", e);
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