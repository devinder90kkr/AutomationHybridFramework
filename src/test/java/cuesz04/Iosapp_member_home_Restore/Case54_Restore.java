package cuesz04.Iosapp_member_home_Restore;

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

@Epic("verify restore recommended option")
@Feature("Verify member able to click on restore option assigned by staff")
public class Case54_Restore extends AppiummobileBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(Case54_Restore.class);

    mobileLocators locators = new mobileLocators();

    @Test
    @Owner("QA")
    @Severity(SeverityLevel.NORMAL)
    @Description("Member scroll to restore option and then click on restore options")
    @Story("Scroll to restore and click on recommended option assigned by staff")
    public void restoreclick() throws InterruptedException {
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
            AllureUtils.captureScreenshot(driver, "Case54_Restore1");

            // scroll-down to perform fuel mind-full restore label
            mobilelement.scrollDownToElement(driver, "Perform Fuel Mindful Restore");

            // Log message to console and Allure report
            LOGGER.info("Scroll down to restore");
            AllureUtils.logStep("Scroll down to restore");

            // Click on Restore screen
            mobilelement.clickElement(driver, mobileLocators.restoreclick);
            Thread.sleep(2500);
            // Log message to console and Allure report
            LOGGER.info("Click on restore screen");
            AllureUtils.logStep("Click on restore screen");
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case54_Restore2");

            // Check if restorelabel is present
            if (mobilelement.isElementPresent(driver, mobileLocators.restorelabel)) {
                // Proceed with actions related to restorelabel
                // Locate the element containing the perform
                WebElement Restorelabel = driver.findElement(mobileLocators.restorelabel);
                // Extract text from the element
                String actualText = Restorelabel.getText();
                // Define the expected text
                String expectedText = "Before Sleep Time";

                // Print the actual and expected text to the console
                System.out.println("Actual Text: " + actualText);
                System.out.println("Expected Text: " + expectedText);
                // Compare the actual and expected text
                Assert.assertEquals(actualText, expectedText);

                // Attach values to Allure report
                Allure.addAttachment("Actual Text", actualText);
                Allure.addAttachment("Expected Text", expectedText);

                // Log message to console and Allure report
                LOGGER.info("Verify label for Before Sleep Time");
                AllureUtils.logStep("Verify label for Before Sleep time");

                // Locate the element containing the perform
                WebElement Restoresublabel = driver.findElement(mobileLocators.restoresublabel);
                // Extract text from the element
                String actualText2 = Restoresublabel.getText();
                // Define the expected text
                String expectedText2 = "one hour before sleep";

                // Print the actual and expected text to the console
                System.out.println("Actual Text: " + actualText2);
                System.out.println("Expected Text: " + expectedText2);
                // Compare the actual and expected text
                Assert.assertEquals(actualText2, expectedText2);

                // Attach values to Allure report
                Allure.addAttachment("Actual Text", actualText2);
                Allure.addAttachment("Expected Text", expectedText2);

                // Log message to console and Allure report
                LOGGER.info("Verify sub label for Before Sleep Time");
                AllureUtils.logStep("Verify sub label for Before Sleep time");
                // Capture a screenshot and attach it to Allure
                AllureUtils.captureScreenshot(driver, "Case54_Restore3");

                // Click on restore option
                mobilelement.clickElement(driver, mobileLocators.restor1);
                mobilelement.clickElement(driver, mobileLocators.restor2);

                // Log message to console and Allure report
                LOGGER.info("Click on restore options for Before Sleep Time");
                AllureUtils.logStep("Click on restore options for Before Sleep Time");
                // Capture a screenshot and attach it to Allure
                AllureUtils.captureScreenshot(driver, "Case54_Restore4");

                mobilelement.clickElement(driver, mobileLocators.Beforesleeptick);

                // Log message to console and Allure report
                LOGGER.info("Click on restore Before Sleep Time tick");
                AllureUtils.logStep("Click on restore Before Sleep Time tick");
                // Capture a screenshot and attach it to Allure
                AllureUtils.captureScreenshot(driver, "Case54_Restore5");

                // scroll-down to perform fuel mind-full restore label
                mobilelement.scrollDownToElement(driver, "Sleep Time");
                // Log message to console and Allure report
                LOGGER.info("Scroll down to Sleep Time");
                AllureUtils.logStep("Scroll down to Sleep Time");

                // Beginning for Sleep time
                Thread.sleep(2500);

                // Click on Sleep Time tick
                mobilelement.clickElement(driver, mobileLocators.sleeptick);

                // Log message to console and Allure report
                LOGGER.info("Click on Sleep Time tick");
                AllureUtils.logStep("Click on Sleep Time tick");
                // Capture a screenshot and attach it to Allure
                AllureUtils.captureScreenshot(driver, "Case54_Restore6");

                Thread.sleep(8500);
                driver.terminateApp("com.cuesz.mobile");
            } else {
                // Log message and handle if restorelabel is not present
                LOGGER.warn("Restore recommended option not available, skipping test steps related to restore.");
                Allure.addAttachment("Warning", "Restore recommended option not available, test steps skipped.");
                // Optionally, you can choose to mark the test as skipped or continue with other tests
                // throw new SkipException("Restore recommended option not available");
            }
        } catch (Exception e) {
            LOGGER.error("Exception occurred: " + e.getMessage());
            // Handle exception gracefully
            Assert.fail("Test execution failed: " + e.getMessage());
        }
    }}