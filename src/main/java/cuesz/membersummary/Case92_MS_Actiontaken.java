package cuesz.membersummary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import cuesz.pages.BasePage;
import cuesz.utils.AllureUtils;
import cuesz.utils.DateGenerator;
import cuesz.utils.ElementActions;
import cuesz.utils.SeleniumUtils;
import cuesz.utils.webTestdata;
import cuesz.utils.weblocators;
import io.qameta.allure.Allure;

public class Case92_MS_Actiontaken extends BasePage {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case92_MS_Actiontaken.class);
	SeleniumUtils utils = new SeleniumUtils(driver);
	private ElementActions elementActions; // Declare ElementActions object
	public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date

  weblocators locators = new weblocators();

    public Case92_MS_Actiontaken(WebDriver driver) {
        super(driver);
        elementActions = new ElementActions(driver); // Initialize ElementActions object    
    }

    @Test
    public void actiontaken() throws InterruptedException {
        Thread.sleep(2000);

        utils.clickMembersummary();
        AllureUtils.logStep("Clicking on membersummary feature");
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();
        AllureUtils.logStep("Searching for members from list");
        Thread.sleep(2000);

        // Identify the element containing the heading text "Reminders"
        WebElement headingElement = driver.findElement(weblocators.actiontakenheading);      
        // Scroll to the headingElement
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", headingElement);
        Thread.sleep(1000); // Add a short sleep to ensure scrolling is completed
		// Retrieve the text of the heading element
		String headingText = headingElement.getText();
		// Assert that the heading text matches the expected value
		String expectedHeadingText = "Action Taken";
		Assert.assertEquals(headingText, expectedHeadingText, "Heading text doesn't match");
		// Log the expected text result to Allure report
		Allure.addAttachment("Expected Heading Text", expectedHeadingText);
		
		AllureUtils.logStep("Assert heading text for actiontaken");
	    AllureUtils.captureScreenshot(driver, "actiontaken1");
	    
	    
	    Thread.sleep(3000);
	    elementActions.clickElement(weblocators.actionplusicon);
	    LOGGER.info("Click on action taken + icon");
	    AllureUtils.logStep("Click on action taken plus icon");
	    AllureUtils.captureScreenshot(driver, "actiontaken2");
	    
	    // Enter notes in reminder section
        String noteText1 = webTestdata.notefield2;
        elementActions.sendKeysToElement(weblocators.actiontextarea, noteText1);
        LOGGER.info("Enter note fields in action");
        AllureUtils.logStep("Inputting text into the textarea: " + noteText1);
        AllureUtils.captureScreenshot(driver, "actiontaken3");
        Thread.sleep(2500);
        // Enter the date into the date picker field
        elementActions.selectValueFromPicker(weblocators.actiondatefield, eventDate);
        LOGGER.info("Entering date: " + eventDate);
        AllureUtils.logStep("Entering date: " + eventDate);
        AllureUtils.captureScreenshot(driver, "actiontaken4");
	    
        Thread.sleep(3000);
	    elementActions.clickElement(weblocators.submitaction);
	    LOGGER.info("Click on Submit button");
	    AllureUtils.logStep("Click on Submit button");
	    AllureUtils.captureScreenshot(driver, "actiontaken5");

//	    Thread.sleep(2500);
//	    elementActions.clickElement(weblocators.showmoreaction);
//	    LOGGER.info("Click on show more button");
//        AllureUtils.logStep("Click on showmore button");
//        AllureUtils.captureScreenshot(driver, "actiontaken6");
//        
//        Thread.sleep(2500);
//        elementActions.clickElement(weblocators.crossicon1);
//        LOGGER.info("Click on cross icon");
//	    AllureUtils.logStep("Click on cross icon");
//	    AllureUtils.captureScreenshot(driver, "actiontaken13");
        
        Thread.sleep(2500);
        elementActions.clickElement(weblocators.actionedit);
	    LOGGER.info("Click on edit action taken icon");
	    AllureUtils.logStep("Click on edit action taken");
        AllureUtils.captureScreenshot(driver, "actiontaken7");
        
        Thread.sleep(3000);
	    elementActions.clickElement(weblocators.submitaction);
	    LOGGER.info("Click on Submit button");
	    AllureUtils.logStep("Click on Submit button");
	    AllureUtils.captureScreenshot(driver, "actiontaken8");
	    
	    Thread.sleep(2500);
        elementActions.clickElement(weblocators.deleteaction);
        LOGGER.info("Click on delete button");
	    AllureUtils.logStep("Click on delete button");
	    AllureUtils.captureScreenshot(driver, "actiontaken9");
	    
	    String popupText1 = elementActions.getTextFromPopup(weblocators.deleteactionnotemainheading, weblocators.deletecontent);
        Allure.addAttachment("Popup Text", popupText1);
        LOGGER.info("Popup Text:\n" + popupText1);
        Thread.sleep(2000);
        elementActions.clickElement(weblocators.cancelbuttn);
        AllureUtils.logStep("Clicking on the delete all button to delete reminder");
        AllureUtils.captureScreenshot(driver, "reminder10");
        
        Thread.sleep(2500);
        elementActions.clickElement(weblocators.deleteaction);
        LOGGER.info("Click on delete button");
	    AllureUtils.logStep("Click on delete button");
	    AllureUtils.captureScreenshot(driver, "actiontaken12");
        
        
        Thread.sleep(2500);
        elementActions.clickElement(weblocators.confirmbttn);
        LOGGER.info("Click on delete button");
	    AllureUtils.logStep("Click on delete button");
	    AllureUtils.captureScreenshot(driver, "actiontake11");
	    
	   
        Thread.sleep(2500);
        
	    
    }
}
