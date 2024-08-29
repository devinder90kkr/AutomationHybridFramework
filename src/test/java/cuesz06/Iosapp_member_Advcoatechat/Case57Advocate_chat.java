//https://chat.openai.com/share/f592ab35-529c-4434-a989-5fac7039696c
package cuesz06.Iosapp_member_Advcoatechat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

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

@Epic ("Member chat feature")
@Feature ("Verify that member able to do chat with advocate")
public class Case57Advocate_chat extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case57Advocate_chat.class);
	
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
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
				
        // Click on Home-icon
        mobilelement.clickElement(driver, mobileLocators.ChatClick);
        
        // Log message to console and Allure report
        LOGGER.info("Click on chat icon from menu");
        AllureUtils.logStep("Click on chat icon from menu"); 
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case57Advocate_chat1"); 
        
        
//        // Define your messages in an array or list
//        String[] messages = { mobileTestData.message1, mobileTestData.message2, mobileTestData.message3 };
//
//        for (int i = 0; i < messages.length; i++) {
//            String message = messages[i];
//            
//            // Enter message in field
//            mobilelement.sendKeysToElement(driver, mobileLocators.entermessage, message);
//            
//            // Log message to console and Allure report
//            LOGGER.info("Enter message field: " + message);
//            AllureUtils.logStep("Enter input message in field: " + message);
//            
//            // Click on send button
//            mobilelement.clickElement(driver, mobileLocators.sendmessage);
//            
//            // Log message to console and Allure report
//            LOGGER.info("Click on send message icon");
//            AllureUtils.logStep("Click on send message icon");
//            
//            // Capture a screenshot and attach it to Allure
//            AllureUtils.captureScreenshot(driver, "Case57Advocate_chat" + (i + 2)); // Start with chat2 for second message, chat3 for third, etc.
//        }
        
        // Define a Faker instance
        Faker faker = new Faker();

        // Define your messages in an array or list
        String[] messages = new String[4];
        for (int i = 0; i < messages.length; i++) {
            messages[i] = faker.lorem().sentence();
        }

        for (int i = 0; i < messages.length; i++) {
            String message = messages[i];

            // Enter message in field
            mobilelement.sendKeysToElement(driver, mobileLocators.entermessage, message);
            LOGGER.info("Enter message field: " + message);
            AllureUtils.logStep("Enter input message in field: " + message);

            // Click on send button
            mobilelement.clickElement(driver, mobileLocators.sendmessage);
            LOGGER.info("Click on send message icon");
            AllureUtils.logStep("Click on send message icon");

            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case57Advocate_chat" + (i + 2)); // Start with chat2 for second message, chat3 for third, etc.

        //Click on media chat plus icon
        mobilelement.clickElement(driver, mobileLocators.chatplus);
        // Log message to console and Allure report
        LOGGER.info("Click on chatplus icon");
        AllureUtils.logStep("Click on chatplus icon");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case57Advocate_chat4"); 
        
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
        
        // Click on media icon
        mobilelement.clickElement(driver, mobileLocators.media);
        // Log message to console and Allure report
        LOGGER.info("Click on media");
        AllureUtils.logStep("Click on media");
        
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
        
        
//        //click on search option
//        mobilelement.clickElement(driver, mobileLocators.searchtext);
//        // Log message to console and Allure report
//        LOGGER.info("Click on searchtext icon");
//        AllureUtils.logStep("Click on searchtext icon");
        
        //Click on attachment 
        mobilelement.clickElement(driver, mobileLocators.Attahment);
        // Log message to console and Allure report
        LOGGER.info("Click on Attahment icon");
        AllureUtils.logStep("Click on Attahment icon");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case57Advocate_chat15"); 
        
    	// Click on gallery option 
		mobilelement.clickElement(driver, mobileLocators.gallery);
		 // Log message to console and Allure report
        LOGGER.info("Click on gallery icon");
        AllureUtils.logStep("Click on gallery icon");
		
		// Select image 1 from gallery
		mobilelement.clickElement(driver, mobileLocators.galleryimage1);
		 // Log message to console and Allure report
        LOGGER.info("Click on galleryimage1");
        AllureUtils.logStep("Click on galleryimage1");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case57Advocate_chat16"); 
        
		// Click on add option from image viewer
		mobilelement.clickElement(driver, mobileLocators.submittap);
		 // Log message to console and Allure report
        LOGGER.info("Click on submittap icon");
        AllureUtils.logStep("Click on submittap icon");
        
        Thread.sleep(2500);
        //Click on media chat plus icon
        mobilelement.clickElement(driver, mobileLocators.chatplus);
        mobilelement.clickElement(driver, mobileLocators.chatplus);
        // Log message to console and Allure report
        LOGGER.info("Click on chatplus icon");
        AllureUtils.logStep("Click on chatplus icon");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case57Advocate_chat4");
        
        //Click on urgenticon
        mobilelement.clickElement(driver, mobileLocators.urgenticon);
        // Log message to console and Allure report
        LOGGER.info("Click on urgenticon icon");
        AllureUtils.logStep("Click on urgenticon icon");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case57Advocate_chat17"); 
        
        
        // Define your messages in an array or list
        String[] messages1 = { mobileTestData.message4, mobileTestData.message5 };

        for (int i1 = 0; i1 < messages1.length; i1++) {
            String message1 = messages1[i1];
            
            // Enter message in field
            mobilelement.sendKeysToElement(driver, mobileLocators.entermessage, message1);
            
            // Log message to console and Allure report
            LOGGER.info("Enter message field: " + message1);
            AllureUtils.logStep("Enter input message in field: " + message1);
            
            // Click on send button
            mobilelement.clickElement(driver, mobileLocators.sendmessage);
            
            // Log message to console and Allure report
            LOGGER.info("Click on send message icon");
            AllureUtils.logStep("Click on send message icon");
            
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case57Advocate_chat" + (i1 + 2)); // Start with chat2 for second message, chat3 for third, etc.
        }

        Thread.sleep(3500);
        }} catch (Exception e) {
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
	
		}}