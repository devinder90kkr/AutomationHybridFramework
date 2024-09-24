package cuesz06.Iosapp_member_Advcoatechat;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("Member chat feature")
@Feature("Verify that member able to do chat with advocate")
public class Case57_01_Advocate_chat extends AppiummobileBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(Case57_01_Advocate_chat.class);

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

//										        // Define a Faker instance
										        Faker faker = new Faker();
//										
//										        // Define your messages in an array or list
//										        String[] messages = new String[4];
//										        for (int i = 0; i < messages.length; i++) {
////										        	 messages[i] = faker.lorem().paragraph(5); // Generates a paragraph with 4 sentences
//										       	 messages[i] = faker.shakespeare().hamletQuote();
//										       	 
//										       	 //various faker lib availbale as below 
////										       	 messages[0] = faker.chuckNorris().fact(); // Chuck Norris fact
////										         messages[1] = faker.book().title() + " by " + faker.book().author(); // Book title and author
////										         messages[2] = faker.harryPotter().quote(); // Harry Potter quote
////										         messages[3] = faker.shakespeare().hamletQuote(); // Shakespeare Hamlet quote 
//										       	 
//										        }           
										         // Define your messages in an array or list
										            String[] messages = new String[8];
										            for (int i = 0; i < messages.length; i++) {
										                // Combine multiple quotes to ensure 3-4 lines
										                StringBuilder messageBuilder = new StringBuilder();
										                while (messageBuilder.length() < 150) { // Approximate length for 3-4 lines
										                    messageBuilder.append(faker.shakespeare().hamletQuote()).append(" ");
										                }
										                messages[i] = messageBuilder.toString().trim();
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
										
										        }

            Thread.sleep(3500);
          // Click on chat + icon for sending urgent message functionality 
	      mobilelement.clickElement(driver, mobileLocators.chatplus);
	      LOGGER.info("Click on chatplus icon");
	      AllureUtils.logStep("Click on chat icon");
            
          //Click on urgenticon
          mobilelement.clickElement(driver, mobileLocators.urgenticon);
          // Log message to console and Allure report
          LOGGER.info("Click on urgenticon icon");
          AllureUtils.logStep("Click on urgenticon icon");
          // Capture a screenshot and attach it to Allure
          AllureUtils.captureScreenshot(driver, "Case57Advocate_chat17");
          
          // Define your messages in an array or list
          String[] messages1 = new String[1];
          for (int i = 0; i < messages1.length; i++) {
//          	 messages1[i] = faker.lorem().paragraph(3); // Generates a paragraph with 4 sentences
        	  	 messages1[i] = faker.chuckNorris().fact(); // Generates a paragraph with 4 sentences 
          }

          for (int i = 0; i < messages1.length; i++) {
              String message = messages1[i];

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

          }
            
//          
//											          // Click on chat + icon for sending Gallery image message functionality 
//												      mobilelement.clickElement(driver, mobileLocators.chatplus);
//												      mobilelement.clickElement(driver, mobileLocators.chatplus);
//												      LOGGER.info("Click on chatplus icon");
//												      AllureUtils.logStep("Click on chat icon");
//												      												   
//												      // Click on camera option 
//													  mobilelement.clickElement(driver, mobileLocators.search);
//													  // Log message to console and Allure report
//												      LOGGER.info("Click on camera icon");
//												      AllureUtils.logStep("Click on camera icon");
//														
//												      // Click on camera option 
//													  mobilelement.clickElement(driver, mobileLocators.takephoto);
//													  // Log message to console and Allure report
//												      LOGGER.info("Click on takephoto icon");
//												      AllureUtils.logStep("Click on takephoto icon");
//												      
//												        // Proceed with the login steps if the user is not already logged in
//												        WebElement allowClick = null;
//												        try {
//												            allowClick = driver.findElement(AppiumBy.accessibilityId("Allow"));
//												            if (allowClick.isDisplayed()) {
//												                allowClick.click();
//												                // Log message to console and Allure report
//												                LOGGER.info("Click on allow notification alert for permission");
//												                AllureUtils.logStep("Click on allow notification");
//												            } else {
//												                LOGGER.info("OK allow element is not displayed.");
//												                AllureUtils.logStep("OK allow element is not displayed.");
//												            }
//												        } catch (NoSuchElementException e) {
//												            LOGGER.info("Crossclick element not found.");
//												            AllureUtils.logStep("Crossclick element not found.");
//												        }
//												        
//												       // Click on photocapture option 
//													   mobilelement.clickElement(driver, mobileLocators.photocapture);
//													   // Log message to console and Allure report
//													   LOGGER.info("Click on photocapture icon");
//													   AllureUtils.logStep("Click on photocapture icon");
//													   
//													   //click on usephoto icon
//													   mobilelement.clickElement(driver, mobileLocators.useohoto);
//													   // Log message to console and Allure report
//													   LOGGER.info("Click on useohoto icon");
//													   AllureUtils.logStep("Click on useohoto icon");
													   
												        
//												        
//         //Click event for three horizontal line from chat header 
////	     mobilelement.clickElement(driver, mobileLocators.horizontal);											   
//		 mobilelement.clickElement(driver, mobileLocators.medialinks);
//		 // Log message to console and Allure report
//		 LOGGER.info("Click on medialinks");
//		 AllureUtils.logStep("Click on medialinks");
//		 
//		 // Click on media icon
//		 mobilelement.clickElement(driver, mobileLocators.media);
//		 // Log message to console and Allure report
//		 LOGGER.info("Click on media");
//		 AllureUtils.logStep("Click on media");
//		 // Capture a screenshot and attach it to Allure
//		 AllureUtils.captureScreenshot(driver, "Case57Advocate_chat5"); 
//	   
//		 //Click on back icon
//		 mobilelement.clickElement(driver, mobileLocators.backpressbutton);
//		 // Log message to console and Allure report
//		 LOGGER.info("Click on backpressbutton icon");
//		 AllureUtils.logStep("Click on backpressbutton icon");
//		 
////	     mobilelement.clickElement(driver, mobileLocators.horizontal);		
//		 mobilelement.clickElement(driver, mobileLocators.medialinks);
//		 // Log message to console and Allure report
//		 LOGGER.info("Click on medialinks");
//		 AllureUtils.logStep("Click on medialinks");
//		 
//		 // Click on media icon
//		 mobilelement.clickElement(driver, mobileLocators.media);
//		 // Log message to console and Allure report
//	    
//	   // Check if media1 element is present and clickable
//       if (mobilelement.isElementPresent(driver, mobileLocators.media1)) {
//           // Click on media1
//           mobilelement.clickElement(driver, mobileLocators.media1);
//           // Log message to console and Allure report
//           LOGGER.info("Click on media1 detail");
//           AllureUtils.logStep("Click on media1 detail");
//           // Capture a screenshot and attach it to Allure
//           AllureUtils.captureScreenshot(driver, "Case57Advocate_chat6"); 
//       } else {
//           // Log message to console and Allure report
//           LOGGER.info("media1 is not available, skipping this step");
//           AllureUtils.logStep("media1 is not available, skipping this step");
//           // Capture a screenshot and attach it to Allure
//           AllureUtils.captureScreenshot(driver, "Case57Advocate_chat7"); 
//       }
//       
//       
//       // Check if media1 element is present and clickable
//       if (mobilelement.isElementPresent(driver, mobileLocators.cross)) {
//       	  //Click on crossi icon
//           mobilelement.clickElement(driver, mobileLocators.cross);
//           // Log message to console and Allure report
//           LOGGER.info("Click on cross icon");
//           AllureUtils.logStep("Click on cross icon");
//           // Capture a screenshot and attach it to Allure
//           AllureUtils.captureScreenshot(driver, "Case57Advocate_chat8"); 
//       } else {
//           // Log message to console and Allure report
//           LOGGER.info("cross icon is not available, skipping this step");
//           AllureUtils.logStep("cross icon is not available, skipping this step");
//           // Capture a screenshot and attach it to Allure
//           AllureUtils.captureScreenshot(driver, "Case57Advocate_chat9"); 
//       }
//       
//											     //click on document
//											     mobilelement.clickElement(driver, mobileLocators.document);
//											     // Log message to console and Allure report
//											     LOGGER.info("Click on document");
//											     AllureUtils.logStep("Click on document");
//											     
//											  // Check if document1 element is present and clickable
//											     if (mobilelement.isElementPresent(driver, mobileLocators.document1)) {
//											         // Click on document1
//											         mobilelement.clickElement(driver, mobileLocators.document1);
//											         // Log message to console and Allure report
//											         LOGGER.info("Click on document1");
//											         AllureUtils.logStep("Click on document1");
//											         // Capture a screenshot and attach it to Allure
//											         AllureUtils.captureScreenshot(driver, "Case57Advocate_chat10"); 
//											     } else {
//											         // Log message to console and Allure report
//											         LOGGER.info("document1 is not available, skipping this step");
//											         AllureUtils.logStep("document1 is not available, skipping this step");
//											         // Capture a screenshot and attach it to Allure
//											         AllureUtils.captureScreenshot(driver, "Case57Advocate_chat10"); 
//											     }
//											     
//											     // Check if media1 element is present and clickable
//											     if (mobilelement.isElementPresent(driver, mobileLocators.done1)) {
//											     	 //Click on crossi icon
//											         mobilelement.clickElement(driver, mobileLocators.done1);
//											         // Log message to console and Allure report
//											         LOGGER.info("Click on done1 icon");
//											         AllureUtils.logStep("Click on done1 icon");
//											         // Capture a screenshot and attach it to Allure
//											         AllureUtils.captureScreenshot(driver, "Case57Advocate_chat11"); 
//											     } else {
//											         // Log message to console and Allure report
//											         LOGGER.info("done1 icon is not available, skipping this step");
//											         AllureUtils.logStep("done1 icon is not available, skipping this step");
//											         // Capture a screenshot and attach it to Allure
//											         AllureUtils.captureScreenshot(driver, "Case57Advocate_chat12"); 
//											     }
//											     
//											 
//											     //click on links	
//											     mobilelement.clickElement(driver, mobileLocators.links);
//											     // Log message to console and Allure report
//											     LOGGER.info("Click on links");
//											     AllureUtils.logStep("Click on links");
//											     // Capture a screenshot and attach it to Allure
//											     AllureUtils.captureScreenshot(driver, "Case57Advocate_chat13"); 
//											     
//										        //Click on back icon
//										        mobilelement.clickElement(driver, mobileLocators.backpressbutton);
//										        // Log message to console and Allure report
//										        LOGGER.info("Click on backpressbutton icon");
//										        AllureUtils.logStep("Click on backpressbutton icon");
//										        // Capture a screenshot and attach it to Allure
//										        AllureUtils.captureScreenshot(driver, "Case57Advocate_chat14"); 
//		
//		
//		//Click event for three horizontal line from chat header
////		mobilelement.clickElement(driver, mobileLocators.horizontal);		
//		mobilelement.clickElement(driver, mobileLocators.askforcall);
//		 // Log message to console and Allure report
//        LOGGER.info("Click on askforcall icon");
//        AllureUtils.logStep("Click on askforcall icon");
//        AllureUtils.captureScreenshot(driver, "Case57Advocate_chat15"); 
//        
//		mobilelement.getElementText(driver, mobileLocators.askforcallheading);
//		 // Log message to console and Allure report
//        LOGGER.info("get text for heading askforcallheading");
//        AllureUtils.logStep("get text for heading askforcallheadin");
//        
//        //click on convenient date field 
//		mobilelement.clickElement(driver, mobileLocators.convientdate);
//		 // Log message to console and Allure report
//        LOGGER.info("Click on convientdate field");
//        AllureUtils.logStep("Click on convientdate field");
//        // Define the locator for the date picker
//        By datePickerLocator = By.className("XCUIElementTypePickerWheel");
//        // Call the method to set the next date
//        mobilelement.setDatePickerValues(driver, datePickerLocator);
////      //click on done button for timepicker
////        mobilelement.clickElement(driver, mobileLocators.Doneclick);
//        
//        
//        //click on convenient time field 
//		mobilelement.clickElement(driver, mobileLocators.convienttime);
//		 // Log message to console and Allure report
//        LOGGER.info("Click on convientdate field");
//        AllureUtils.logStep("Click on convientdate field");
//        // Define values for time (e.g., "12", "45", "PM")
//        String[] timeValues = {"12", "45", "PM"};
//        mobilelement.setPickerValues(driver, datePickerLocator, datePickerLocator, timeValues);
//        // Log message to console and Allure report
//        LOGGER.info("Enter time values");
//        AllureUtils.logStep("Enter time value");
//        
//        //click on done button for timepicker
//        mobilelement.clickElement(driver, mobileLocators.Doneclick);
//        // Log message to console and Allure report
//        LOGGER.info("Click on Doneclick");
//        AllureUtils.logStep("Click on Doneclick");
//        
//        //click on meeting min options 
//      	mobilelement.clickElement(driver, mobileLocators.min1);
//      	// Log message to console and Allure report
//        LOGGER.info("Click on min1");
//        AllureUtils.logStep("Click on min1");
//      	
//        //Click on min meeting
//      	mobilelement.clickElement(driver, mobileLocators.min2);
//      	// Log message to console and Allure report
//        LOGGER.info("Click on min2");
//        AllureUtils.logStep("Click on min2");
//      	
//      	
//      	//enter values in note field 
//      	mobilelement.sendKeysToElement(driver, mobileLocators.Notesclick, mobileTestData.notefield);
//      	// Log message to console and Allure report
//        LOGGER.info("Enter message in notes field ");
//        AllureUtils.logStep("Enter message in field");
//        
//        //click on urgent options 
//      	mobilelement.clickElement(driver, mobileLocators.urgentoption);
//      	// Log message to console and Allure report
//        LOGGER.info("Click on urgentoption");
//        AllureUtils.logStep("Click on urgentoption");
//													 
//        //click on schdule button 
//      	mobilelement.clickElement(driver, mobileLocators.schdulebttn);
//      	// Log message to console and Allure report
//        LOGGER.info("Click on schdulebttn");
//        AllureUtils.logStep("Click on schdulebttn");
            
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
