package cuesz06.Iosapp_member_Advcoatechat;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

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
public class Case57_02_Advocate_chat_camera extends AppiummobileBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(Case57_02_Advocate_chat_camera.class);

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
         
											          // Click on chat + icon for sending Gallery image message functionality 
												      mobilelement.clickElement(driver, mobileLocators.chatplus);
//												      mobilelement.clickElement(driver, mobileLocators.chatplus);
												      LOGGER.info("Click on chatplus icon");
												      AllureUtils.logStep("Click on chat icon");
												      												   
												      // Click on camera option 
													  mobilelement.clickElement(driver, mobileLocators.search);
													  // Log message to console and Allure report
												      LOGGER.info("Click on camera icon");
												      AllureUtils.logStep("Click on camera icon");
														
												      // Click on camera option 
													  mobilelement.clickElement(driver, mobileLocators.takephoto);
													  // Log message to console and Allure report
												      LOGGER.info("Click on takephoto icon");
												      AllureUtils.logStep("Click on takephoto icon");
												      
												   // Handle the Allow permission if present
												      try {
												          List<WebElement> allowElements = driver.findElements(AppiumBy.accessibilityId("Allow"));
												          if (!allowElements.isEmpty()) {
												              allowElements.get(0).click();
												              LOGGER.info("Clicked on allow notification alert for permission");
												              AllureUtils.logStep("Clicked on allow notification");
												          } else {
												              LOGGER.info("Allow element is not displayed.");
												              AllureUtils.logStep("Allow element is not displayed.");
												          }
												      } catch (Exception e) {
												          LOGGER.error("Exception while handling allow element: ", e);
												          AllureUtils.logStep("Exception while handling allow element: " + e.getMessage());
												      }

												        
												       // Click on photocapture option 
													   mobilelement.clickElement(driver, mobileLocators.photocapture);
													   // Log message to console and Allure report
													   LOGGER.info("Click on photocapture icon");
													   AllureUtils.logStep("Click on photocapture icon");
													   
													   //click on usephoto icon
													   mobilelement.clickElement(driver, mobileLocators.useohoto);
													   // Log message to console and Allure report
													   LOGGER.info("Click on useohoto icon");
													   AllureUtils.logStep("Click on useohoto icon");
													   
            
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
