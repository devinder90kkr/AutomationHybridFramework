//https://chat.openai.com/share/f592ab35-529c-4434-a989-5fac7039696c
package cuesz06.Iosapp_member_Advcoatechat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import cuesz.pages.AppiummobileBase;
import cuesz.utils.AllureUtils;
import cuesz.utils.AppiumappUtils;
import cuesz.utils.mobileLocators;
import cuesz.utils.mobileTestData;
import cuesz.utils.mobilelement;
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
	public void manualmorningscan() throws InterruptedException {	

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

        
        //Click on media-link icon
        mobilelement.clickElement(driver, mobileLocators.medialinks);
        // Log message to console and Allure report
        LOGGER.info("Click on media link from chat screen");
        AllureUtils.logStep("Click on media link from chat screen");
        
        
        //Click on media-link icon
        mobilelement.clickElement(driver, mobileLocators.backpressbutton);
        // Log message to console and Allure report
        LOGGER.info("Click on back from chat screen");
        AllureUtils.logStep("Click on back icon from chat screen");
        
        //Click on media-link icon
        mobilelement.clickElement(driver, mobileLocators.medialinks);
        // Log message to console and Allure report
        LOGGER.info("Click on media link from chat screen");
        AllureUtils.logStep("Click on media link from chat screen");
      
        //Click on media
        mobilelement.clickElement(driver, mobileLocators.media);
        // Log message to console and Allure report
        LOGGER.info("Click on media");
        AllureUtils.logStep("Click on media");
        
        
        mobilelement.clickElement(driver, mobileLocators.documents);
     // Log message to console and Allure report
        LOGGER.info("Click on documents");
        AllureUtils.logStep("Click on documents");
        
        
        mobilelement.clickElement(driver, mobileLocators.links);
     // Log message to console and Allure report
        LOGGER.info("Click on links");
        AllureUtils.logStep("Click on links");
        
        //Click on media-link icon
        mobilelement.clickElement(driver, mobileLocators.backpressbutton);
        // Log message to console and Allure report
        LOGGER.info("Click on back from chat screen");
        AllureUtils.logStep("Click on back icon from chat screen");
        
        Thread.sleep(8500);
        driver.terminateApp("com.cuesz.mobile");
        
	}
}
