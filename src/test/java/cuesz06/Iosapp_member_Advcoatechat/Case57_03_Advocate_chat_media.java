package cuesz06.Iosapp_member_Advcoatechat;

//import java.util.NoSuchElementException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.mobile.resources.mobileLocators;
import cuesz.mobile.resources.mobileTestData;
import cuesz.mobile.resources.mobilelement;
import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("Member chat feature")
@Feature("Verify that member able to do chat with advocate")
public class Case57_03_Advocate_chat_media extends AppiummobileBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(Case57_03_Advocate_chat_media.class);

    mobileLocators locators = new mobileLocators();

    @Test
    @Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)
    @Description("Member able to do chat and send message and attachment")
    @Story("Scroll to ")
    public void chatscreen() throws InterruptedException {
        try {
            // Create an instance of AppiumUtils and pass the driver
            AppiumappUtils appiumUtils = new AppiumappUtils(driver);
            // Launch the app using the utility method
//            appiumUtils.launchAppWithPackageId("com.cuesz.mobile");
            appiumUtils.launchAppWithPackageId(mobileTestData.bundelID);

            // Click on Home-icon
            mobilelement.clickElement(driver, mobileLocators.ChatClick);

            // Log message to console and Allure report
            LOGGER.info("Click on chat icon from menu");
            AllureUtils.logStep("Click on chat icon from menu");
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case57Advocate_chat1");
										        
         //Click event for three horizontal line from chat header 
//	     mobilelement.clickElement(driver, mobileLocators.horizontal);											   
		 mobilelement.clickElement(driver, mobileLocators.medialinks);
		 // Log message to console and Allure report
		 LOGGER.info("Click on medialinks");
		 AllureUtils.logStep("Click on medialinks");
		 
		 // Click on media icon
		 mobilelement.clickElement(driver, mobileLocators.media);
		 // Log message to console and Allure report
		 LOGGER.info("Click on media");
		 AllureUtils.logStep("Click on media");
		 // Capture a screenshot and attach it to Allure
		 AllureUtils.captureScreenshot(driver, "Case57Advocate_chat5"); 
	   
		 //Click on back icon
		 mobilelement.clickElement(driver, mobileLocators.backpressbutton);
		 // Log message to console and Allure report
		 LOGGER.info("Click on backpressbutton icon");
		 AllureUtils.logStep("Click on backpressbutton icon");
		 
//	     mobilelement.clickElement(driver, mobileLocators.horizontal);		
		 mobilelement.clickElement(driver, mobileLocators.medialinks);
		 // Log message to console and Allure report
		 LOGGER.info("Click on medialinks");
		 AllureUtils.logStep("Click on medialinks");
		 
		 // Click on media icon
		 mobilelement.clickElement(driver, mobileLocators.media);
		 // Log message to console and Allure report
	    
	   // Check if media1 element is present and clickable
       if (mobilelement.isElementPresent(driver, mobileLocators.media1)) {
           // Click on media1
           mobilelement.clickElement(driver, mobileLocators.media1);
           // Log message to console and Allure report
           LOGGER.info("Click on media1 detail");
           AllureUtils.logStep("Click on media1 detail");
           // Capture a screenshot and attach it to Allure
           AllureUtils.captureScreenshot(driver, "Case57Advocate_chat6"); 
       } else {
           // Log message to console and Allure report
           LOGGER.info("media1 is not available, skipping this step");
           AllureUtils.logStep("media1 is not available, skipping this step");
           // Capture a screenshot and attach it to Allure
           AllureUtils.captureScreenshot(driver, "Case57Advocate_chat7"); 
       }
       
       
       // Check if media1 element is present and clickable
       if (mobilelement.isElementPresent(driver, mobileLocators.cross)) {
       	  //Click on crossi icon
           mobilelement.clickElement(driver, mobileLocators.cross);
           // Log message to console and Allure report
           LOGGER.info("Click on cross icon");
           AllureUtils.logStep("Click on cross icon");
           // Capture a screenshot and attach it to Allure
           AllureUtils.captureScreenshot(driver, "Case57Advocate_chat8"); 
       } else {
           // Log message to console and Allure report
           LOGGER.info("cross icon is not available, skipping this step");
           AllureUtils.logStep("cross icon is not available, skipping this step");
           // Capture a screenshot and attach it to Allure
           AllureUtils.captureScreenshot(driver, "Case57Advocate_chat9"); 
       }
       
											     //click on document
											     mobilelement.clickElement(driver, mobileLocators.document);
											     // Log message to console and Allure report
											     LOGGER.info("Click on document");
											     AllureUtils.logStep("Click on document");
											     
											  // Check if document1 element is present and clickable
											     if (mobilelement.isElementPresent(driver, mobileLocators.document1)) {
											         // Click on document1
											         mobilelement.clickElement(driver, mobileLocators.document1);
											         // Log message to console and Allure report
											         LOGGER.info("Click on document1");
											         AllureUtils.logStep("Click on document1");
											         // Capture a screenshot and attach it to Allure
											         AllureUtils.captureScreenshot(driver, "Case57Advocate_chat10"); 
											     } else {
											         // Log message to console and Allure report
											         LOGGER.info("document1 is not available, skipping this step");
											         AllureUtils.logStep("document1 is not available, skipping this step");
											         // Capture a screenshot and attach it to Allure
											         AllureUtils.captureScreenshot(driver, "Case57Advocate_chat10"); 
											     }
											     
											     // Check if media1 element is present and clickable
											     if (mobilelement.isElementPresent(driver, mobileLocators.done1)) {
											     	 //Click on crossi icon
											         mobilelement.clickElement(driver, mobileLocators.done1);
											         // Log message to console and Allure report
											         LOGGER.info("Click on done1 icon");
											         AllureUtils.logStep("Click on done1 icon");
											         // Capture a screenshot and attach it to Allure
											         AllureUtils.captureScreenshot(driver, "Case57Advocate_chat11"); 
											     } else {
											         // Log message to console and Allure report
											         LOGGER.info("done1 icon is not available, skipping this step");
											         AllureUtils.logStep("done1 icon is not available, skipping this step");
											         // Capture a screenshot and attach it to Allure
											         AllureUtils.captureScreenshot(driver, "Case57Advocate_chat12"); 
											     }
											     
											 
											     //click on links	
											     mobilelement.clickElement(driver, mobileLocators.links);
											     // Log message to console and Allure report
											     LOGGER.info("Click on links");
											     AllureUtils.logStep("Click on links");
											     // Capture a screenshot and attach it to Allure
											     AllureUtils.captureScreenshot(driver, "Case57Advocate_chat13"); 
											     
										        //Click on back icon
										        mobilelement.clickElement(driver, mobileLocators.backpressbutton);
										        // Log message to console and Allure report
										        LOGGER.info("Click on backpressbutton icon");
										        AllureUtils.logStep("Click on backpressbutton icon");
										        // Capture a screenshot and attach it to Allure
										        AllureUtils.captureScreenshot(driver, "Case57Advocate_chat14"); 
		
	
            
        } finally {
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
