//https://chat.openai.com/share/f592ab35-529c-4434-a989-5fac7039696c
package cuesz06.Iosapp_member_Advcoatechat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import cuesz.utils.mobile.mobileLocators;
import cuesz.utils.mobile.mobileTestData;
import cuesz.utils.mobile.mobilelement;
import cuesz.utils.reporting.AllureUtils;
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
        
        
        // Define your messages in an array or list
        String[] messages = { mobileTestData.message1, mobileTestData.message2, mobileTestData.message3 };

        for (int i = 0; i < messages.length; i++) {
            String message = messages[i];
            
            // Enter message in field
            mobilelement.sendKeysToElement(driver, mobileLocators.entermessage, message);
            
            // Log message to console and Allure report
            LOGGER.info("Enter message field: " + message);
            AllureUtils.logStep("Enter input message in field: " + message);
            
            // Click on send button
            mobilelement.clickElement(driver, mobileLocators.sendmessage);
            
            // Log message to console and Allure report
            LOGGER.info("Click on send message icon");
            AllureUtils.logStep("Click on send message icon");
            
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case57Advocate_chat" + (i + 2)); // Start with chat2 for second message, chat3 for third, etc.
        }

        //Click on media chat plus icon
        mobilelement.clickElement(driver, mobileLocators.chatplus);
        
        // Click on media icon
        mobilelement.clickElement(driver, mobileLocators.media);
        
        //Click on back icon
        mobilelement.clickElement(driver, mobileLocators.backpressbutton);
        
        // Click on media icon
        mobilelement.clickElement(driver, mobileLocators.media);
        
        //Click on media click 
        mobilelement.clickElement(driver, mobileLocators.media1);
        
        //Click on crossi icon
        mobilelement.clickElement(driver, mobileLocators.cross);
        
        
        
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