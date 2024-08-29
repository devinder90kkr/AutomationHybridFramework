package cuesz.membersummary;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.date.functions.DateGenerator;
import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;
import cuesz.web.resources.ElementActions;
import cuesz.web.resources.webTestdata;
import cuesz.web.resources.weblocators;
import io.qameta.allure.Allure;

public class Case91_MS_Reminderfeature extends BasePage {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case91_MS_Reminderfeature.class);
	SeleniumUtils utils = new SeleniumUtils(driver);
	private ElementActions elementActions; // Declare ElementActions object
	public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date

  weblocators locators = new weblocators();

    public Case91_MS_Reminderfeature(WebDriver driver) {
        super(driver);
        elementActions = new ElementActions(driver); // Initialize ElementActions object    
    }

    @Test
    public void reminder() throws InterruptedException {
        Thread.sleep(2000);

        utils.clickMembersummary();
        AllureUtils.logStep("Clicking on membersummary feature");
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();
        AllureUtils.logStep("Searching for members from list");
        Thread.sleep(2000);

        // Identify the element containing the heading text "Reminders"
        WebElement headingElement = driver.findElement(weblocators.reminderheading);      
        // Scroll to the headingElement
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", headingElement);
        Thread.sleep(1000); // Add a short sleep to ensure scrolling is completed
		// Retrieve the text of the heading element
		String headingText = headingElement.getText();
		// Assert that the heading text matches the expected value
		String expectedHeadingText = "Reminders";
		Assert.assertEquals(headingText, expectedHeadingText, "Heading text doesn't match");
		// Log the expected text result to Allure report
		Allure.addAttachment("Expected Heading Text", expectedHeadingText);
		
		AllureUtils.logStep("Assert heading text for Reminder");
	    AllureUtils.captureScreenshot(driver, "reminder1");

		int numOfIterations = 2; // Number of times to click the element
        for (int i = 0; i < numOfIterations; i++) {
            elementActions.clickElement(weblocators.reminderarrow);
            LOGGER.info("Clicked on the reminder arrow - Iteration: " + (i + 1));
            AllureUtils.logStep("Clicking on the reminder arrow - Iteration: " + (i + 1));
            AllureUtils.captureScreenshot(driver, "acionsteps" + (i + 1));
            Thread.sleep(3000); // Wait for some time before the next iteration
        }

        Thread.sleep(3000);
        elementActions.clickElement(weblocators.reminderaddbttn);
        AllureUtils.logStep("Clicking on the + icon for reminder");
        AllureUtils.captureScreenshot(driver, "reminder2");
               
        // Enter the date into the date picker field
        elementActions.selectValueFromPicker(weblocators.dateField, eventDate);
        LOGGER.info("Entering date: " + eventDate);
        AllureUtils.logStep("Entering date: " + eventDate);
        AllureUtils.captureScreenshot(driver, "reminder3");
        
        // Enter notes in reminder section
        String noteText1 = webTestdata.notefield2;
        elementActions.sendKeysToElement(weblocators.remindernotesfield, noteText1);
        AllureUtils.logStep("Inputting text into the textarea: " + noteText1);
        AllureUtils.captureScreenshot(driver, "reminder4");

        // select email tick option
        elementActions.clickElement(weblocators.emailtick);
        AllureUtils.logStep("Clicking on the email tick option");
        AllureUtils.captureScreenshot(driver, "reminder5");
        
        // select email tick option
        elementActions.clickElement(weblocators.emailclick);
        AllureUtils.logStep("Clicking on the email timepicker for selct time");

        // select email timedropdown option
        elementActions.clickElement(weblocators.TimeInput);
        AllureUtils.logStep("Clicking on the email timepicker");
        AllureUtils.captureScreenshot(driver, "reminder6");
        
        elementActions.clickElement(weblocators.time1);
        elementActions.clickElement(weblocators.time2);
        elementActions.clickElement(weblocators.time3);
        AllureUtils.logStep("Clicking on the email time");
        AllureUtils.captureScreenshot(driver, "reminder7");
//      
        elementActions.clickElement(weblocators.outsideclick);

        Thread.sleep(2000);
        // select email tick option
        elementActions.clickElement(weblocators.recurring);
        AllureUtils.logStep("Clicking on the recurrring button");
        AllureUtils.captureScreenshot(driver, "reminder8");	

	    
	 // Generate the fixed date
        String option1 = webTestdata.Dailyfield;
        // Enter the date into the date picker field
        elementActions.selectValueFromPicker(weblocators.recuuring1, option1);
        LOGGER.info("Entering date: " + option1);
        AllureUtils.logStep("Entering date: " + option1);
        AllureUtils.captureScreenshot(driver, "reminder9");
         
        Thread.sleep(2000);
        // select email tick option
        elementActions.clickElement(weblocators.submitbttn);
        AllureUtils.logStep("Clicking on the recurrring button");
        AllureUtils.captureScreenshot(driver, "reminder10");	
        
        Thread.sleep(3000);
        
        //select of toggel two times
        int numOfIterations2 = 1; // Number of times to click the element
        for (int i = 0; i < numOfIterations2; i++) {
            elementActions.clickElement(weblocators.reminderarrow);
            LOGGER.info("Clicked on the reminder arrow - Iteration: " + (i + 1));
            AllureUtils.logStep("Clicking on the reminder arrow - Iteration: " + (i + 1));
            AllureUtils.captureScreenshot(driver, "acionsteps" + (i + 1));
            Thread.sleep(3000); // Wait for some time before the next iteration
        }
        
        Thread.sleep(3000);
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        LocalDate date = LocalDate.parse(eventDate, inputFormatter);
        String formattedDate = date.format(outputFormatter);

        // Use the formatted date in the XPath
        WebElement dateElement = driver.findElement(By.xpath("//abbr[@aria-label='" + formattedDate + "']"));
        dateElement.click();
        AllureUtils.logStep("Entering date: " + formattedDate);
        AllureUtils.captureScreenshot(driver, "reminder11");
       
        //Click on edit icon for reminder
        elementActions.clickElement(weblocators.editreminder);
        AllureUtils.logStep("Clicking on the edit button");
        AllureUtils.captureScreenshot(driver, "reminder12");	
        
     // Enter notes in reminder section
        String noteText2 = webTestdata.notefield3;
        elementActions.sendKeysToElement(weblocators.remindernotesfield, noteText2);
        AllureUtils.logStep("Inputting text into the textarea: " + noteText2);
        AllureUtils.captureScreenshot(driver, "reminder13");
        
        Thread.sleep(2000);
        // select email tick option
        elementActions.clickElement(weblocators.submitbttn);
        AllureUtils.logStep("Clicking on the recurrring button");
        AllureUtils.captureScreenshot(driver, "reminder14");	
        
        String popupText = elementActions.getTextFromPopup(weblocators.editreminderheading, weblocators.headingreminder);
        Allure.addAttachment("Popup Text", popupText);
        LOGGER.info("Popup Text:\n" + popupText);
        Thread.sleep(2000);
        
        
        elementActions.clickElement(weblocators.cancelbuttn);
        AllureUtils.logStep("Clicking on the All to reminder button");
        AllureUtils.captureScreenshot(driver, "reminder15");	
        Thread.sleep(2000);
        elementActions.clickElement(weblocators.remindedelte);
        AllureUtils.logStep("Clicking on the All to delete button");
        AllureUtils.captureScreenshot(driver, "reminder16");	
        
        String popupText1 = elementActions.getTextFromPopup(weblocators.deletheading, weblocators.headingreminder);
        Allure.addAttachment("Popup Text", popupText1);
        LOGGER.info("Popup Text:\n" + popupText1);
        Thread.sleep(2000);
        elementActions.clickElement(weblocators.cancelbuttn);
        AllureUtils.logStep("Clicking on the delete all button to delete reminder");
        AllureUtils.captureScreenshot(driver, "reminder17");
        
        
        Thread.sleep(2000);
        
    }
}
