//package cuesz.membersummary;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import cuesz.pages.BasePage;
//import cuesz.utils.AllureUtils;
//import cuesz.utils.ElementActions; // Import ElementActions class
//import cuesz.utils.SeleniumUtils;
//import cuesz.utils.webTestdata;
//import cuesz.utils.weblocators;
//import io.qameta.allure.Allure;
//
//public class Case90_MS_Actionsteps extends BasePage {
//    private static final Logger LOGGER = LoggerFactory.getLogger(Case90_MS_Actionsteps.class);
//    SeleniumUtils utils = new SeleniumUtils(driver);
//    private ElementActions elementActions; // Declare ElementActions object
//
//    weblocators locators = new weblocators();
//
//    public Case90_MS_Actionsteps(WebDriver driver) {
//        super(driver);
//        elementActions = new ElementActions(driver); // Initialize ElementActions object
//    }
//
//    @Test
//    public void actionsteps() throws InterruptedException {
//        Thread.sleep(2000);
//
//        utils.clickMembersummary();
//        // Log message to console and Allure report
//        LOGGER.info("Clicking on membersummary feaure");
//        AllureUtils.logStep("Clicking on membersummary feaure");
//        
//        utils.waitForMilliseconds(2000);
//        utils.enterSearchText();
//        utils.clickMembername();
//        // Log message to console and Allure report
//        LOGGER.info("search for member");
//        AllureUtils.logStep("Search for members from list");
//        
//        Thread.sleep(2000);
//
//        // Identify the element containing the heading text "Action Steps"
//        WebElement headingElement = driver.findElement(weblocators.actionheading);
//        // Retrieve the text of the heading element
//        String headingText = headingElement.getText();
//        // Assert that the heading text matches the expected value
//        String expectedHeadingText = "Action Steps";
//        Assert.assertEquals(headingText, expectedHeadingText, "Heading text doesn't match");
//        // Log the expected text result to Allure report
//        Allure.addAttachment("Expected Heading Text", expectedHeadingText);
//        Thread.sleep(3000);
//        // Click on the button using ElementActions
//        elementActions.clickElement(weblocators.addbttn);
//        // Log message to console and Allure report
//        LOGGER.info("Clicking on the button");
//        AllureUtils.logStep("Clicking on the button");
//        // Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "acionsteps1");
//        
//        Thread.sleep(3000);
//        // Input text into the textarea using ElementActions and test data
//        String noteText = webTestdata.notefield1;
//        elementActions.sendKeysToElement(weblocators.actioninputfield, noteText);
//        // Log message to console and Allure report
//        LOGGER.info("Inputting text into the textarea: " + noteText);
//        AllureUtils.logStep("Inputting text into the textarea: " + noteText);
//        // Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "acionsteps2");
//        
//        Thread.sleep(3000);
//        // Click on the button using ElementActions
//        elementActions.clickElement(weblocators.addbttn);
//        // Log message to console and Allure report
//        LOGGER.info("Clicking on the button");
//        AllureUtils.logStep("Clicking on the button");
//        // Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "acionsteps3");
//        
//        Thread.sleep(3000);
//        // Click on "See more" button
//        elementActions.clickElement(weblocators.seeMoreButton);
//        // Log message to console and Allure report
//        LOGGER.info("Clicking on the see more");
//        AllureUtils.logStep("Clicking on the see more");
//        // Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "acionsteps4");
//        
//        
//        Thread.sleep(3000);
//        // Click on "See more" button
//        elementActions.clickElement(weblocators.seemoreclose);
//        // Log message to console and Allure report
//        LOGGER.info("Clicking on the see morecross icon");
//        AllureUtils.logStep("Clicking on the see more close icon");
//        // Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "acionsteps5"); 
//        
//        Thread.sleep(3000);
//        // Click on "edit" button
//        elementActions.clickElement(weblocators.editicon);
//        // Log message to console and Allure report
//        LOGGER.info("Clicking on the edit icon");
//        AllureUtils.logStep("Clicking on the edit icon");
//        // Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "acionsteps6");
//             
//        Thread.sleep(3000);
//        // Click on "text area"
//        String noteText1 = webTestdata.notefield2;
//        elementActions.sendKeysToElement(weblocators.edittextarea,noteText1);
//        LOGGER.info("Inputting text into the textarea: " + noteText1);
//        AllureUtils.logStep("Inputting text into the textarea: " + noteText1);
//        // Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "acionsteps7");
//        
//        Thread.sleep(3000);
//        // Click on "edit" button
//        elementActions.clickElement(weblocators.submitbutton);
//        // Log message to console and Allure report
//        LOGGER.info("Clicking on the submit button");
//        AllureUtils.logStep("Clicking on the submit button");
//        // Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "acionsteps8");
//             
//        Thread.sleep(3000);
//        // Click on "edit" button
//        elementActions.clickElement(weblocators.deleteicon);
//        // Log message to console and Allure report
//        LOGGER.info("Clicking on the delete button");
//        AllureUtils.logStep("Clicking on the delete button");
//        // Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "acionsteps9");
//        
//        
//        // Get text from popup
//        String popupText = elementActions.getTextFromPopup(weblocators.deletePopupHeading, weblocators.deletePopupContent);
//        // Log the popup text to Allure report
//        Allure.addAttachment("Popup Text", popupText);
//        LOGGER.info("Popup Text:\n" + popupText);
//        
//
//        Thread.sleep(3000);
//        // Click on "cancel" button
//        elementActions.clickElement(weblocators.cancelbuttn);
//        // Log message to console and Allure report
//        LOGGER.info("Clicking on the cancel button");
//        AllureUtils.logStep("Clicking on the cancel button");
//        // Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "acionsteps10");
//        
//        Thread.sleep(3000);
//        // Click on "edit" button
//        elementActions.clickElement(weblocators.deleteicon);
//        // Log message to console and Allure report
//        LOGGER.info("Clicking on the delete button");
//        AllureUtils.logStep("Clicking on the delete button");
// 
//        
//        Thread.sleep(3000);
//        // Click on "cancel" button
//        elementActions.clickElement(weblocators.confirmbttn);
//        // Log message to console and Allure report
//        LOGGER.info("Clicking on the confirm button");
//        AllureUtils.logStep("Clicking on the confirm button");
//        // Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "acionsteps11");
//        
//        
//        Thread.sleep(3000);
//        
//        
//        
//        
//            }
//}

package cuesz.membersummary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;
import cuesz.utils.reporting.AllureUtils;
import cuesz.utils.web.ElementActions;
import cuesz.utils.web.webTestdata;
import cuesz.utils.web.weblocators;
import io.qameta.allure.Allure;

public class Case90_MS_Actionsteps extends BasePage {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case90_MS_Actionsteps.class);
  SeleniumUtils utils = new SeleniumUtils(driver);
  private ElementActions elementActions; // Declare ElementActions object

  weblocators locators = new weblocators();

    public Case90_MS_Actionsteps(WebDriver driver) {
        super(driver);
        elementActions = new ElementActions(driver); // Initialize ElementActions object    
    }

    @Test
    public void actionsteps() throws InterruptedException {
        Thread.sleep(2000);

        utils.clickMembersummary();
        AllureUtils.logStep("Clicking on membersummary feature");
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();
        AllureUtils.logStep("Searching for members from list");
        Thread.sleep(2000);

		// Identify the element containing the heading text "Action Steps"
		WebElement headingElement = driver.findElement(weblocators.actionheading);
		// Retrieve the text of the heading element
		String headingText = headingElement.getText();
		// Assert that the heading text matches the expected value
		String expectedHeadingText = "Action Steps";
		Assert.assertEquals(headingText, expectedHeadingText, "Heading text doesn't match");
		// Log the expected text result to Allure report
		Allure.addAttachment("Expected Heading Text", expectedHeadingText);

        elementActions.clickElement(weblocators.addbttn);
        AllureUtils.logStep("Clicking on the button");
        AllureUtils.captureScreenshot(driver, "acionsteps1");

        Thread.sleep(3000);

        String noteText = webTestdata.notefield1;
        elementActions.sendKeysToElement(weblocators.actioninputfield, noteText);
        AllureUtils.logStep("Inputting text into the textarea: " + noteText);
        AllureUtils.captureScreenshot(driver, "acionsteps2");

        Thread.sleep(3000);

        elementActions.clickElement(weblocators.addbttn);
        AllureUtils.logStep("Clicking on the button");
        AllureUtils.captureScreenshot(driver, "acionsteps3");

        Thread.sleep(3000);

        elementActions.clickElement(weblocators.seeMoreButton);
        AllureUtils.logStep("Clicking on the see more");
        AllureUtils.captureScreenshot(driver, "acionsteps4");

        Thread.sleep(3000);

        elementActions.clickElement(weblocators.seemoreclose);
        AllureUtils.logStep("Clicking on the see more close icon");
        AllureUtils.captureScreenshot(driver, "acionsteps5");

        Thread.sleep(3000);

        elementActions.clickElement(weblocators.editicon);
        AllureUtils.logStep("Clicking on the edit icon");
        AllureUtils.captureScreenshot(driver, "acionsteps6");

        Thread.sleep(3000);

        String noteText1 = webTestdata.notefield2;
        elementActions.sendKeysToElement(weblocators.edittextarea, noteText1);
        AllureUtils.logStep("Inputting text into the textarea: " + noteText1);
        AllureUtils.captureScreenshot(driver, "acionsteps7");

        Thread.sleep(3000);

        elementActions.clickElement(weblocators.submitbutton);
        AllureUtils.logStep("Clicking on the submit button");
        AllureUtils.captureScreenshot(driver, "acionsteps8");

        Thread.sleep(3000);

        elementActions.clickElement(weblocators.deleteicon);
        AllureUtils.logStep("Clicking on the delete button");
        AllureUtils.captureScreenshot(driver, "acionsteps9");

        Thread.sleep(3000);

        String popupText = elementActions.getTextFromPopup(weblocators.deletePopupHeading, weblocators.deletePopupContent);
        Allure.addAttachment("Popup Text", popupText);
        LOGGER.info("Popup Text:\n" + popupText);

        Thread.sleep(3000);

        elementActions.clickElement(weblocators.cancelbuttn);
        AllureUtils.logStep("Clicking on the cancel button");
        AllureUtils.captureScreenshot(driver, "acionsteps10");

        Thread.sleep(3000);

        elementActions.clickElement(weblocators.deleteicon);
        AllureUtils.logStep("Clicking on the delete button");

        Thread.sleep(3000);

        elementActions.clickElement(weblocators.confirmbttn);
        AllureUtils.logStep("Clicking on the confirm button");
        AllureUtils.captureScreenshot(driver, "acionsteps11");

        Thread.sleep(3000);
    }
}
