package feature.case02_memberspec_basic;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import allureframework.reporting.AllureUtils;
import commonfunction.functions.DateGenerator;
import base.BasePage;
import utils.SeleniumUtils;
import constant.webTestdata;
import constant.weblocators;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

@Epic("Member Summary Management")
@Feature("Reminder Management")
public class Case91_MS_Reminderfeature extends BasePage {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case91_MS_Reminderfeature.class);
	SeleniumUtils utils = new SeleniumUtils(driver);
	private WebDriverWait wait;
	public static String eventDate = DateGenerator.generateFixedDate();

	public Case91_MS_Reminderfeature(WebDriver driver) {
		super(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@Test
	@Description("Manage reminder functionality")
	@Story("Reminder Configuration")
	public void reminder() throws InterruptedException {
		LOGGER.info("Starting Reminder test");
		Thread.sleep(2000);

		utils.clickMembersummary();
		AllureUtils.logStep("Clicking on membersummary feature");
		utils.waitForMilliseconds(2000);
		utils.enterSearchText();
		utils.clickMembername();
		AllureUtils.logStep("Searching for members from list");
		Thread.sleep(2000);

		// Identify and scroll to the heading element
		WebElement headingElement = driver.findElement(weblocators.reminderheading);      
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", headingElement);
		Thread.sleep(1000);

		// Verify heading text
		String headingText = headingElement.getText();
		String expectedHeadingText = "Reminders";
		Assert.assertEquals(headingText, expectedHeadingText, "Heading text doesn't match");
		Allure.addAttachment("Expected Heading Text", expectedHeadingText);
		AllureUtils.logStep("Assert heading text for Reminder");
		AllureUtils.captureScreenshot(driver, "reminder1");

		// Click reminder arrow multiple times
		WebElement reminderArrow = wait.until(ExpectedConditions.elementToBeClickable(weblocators.reminderarrow));
		for (int i = 0; i < 2; i++) {
			reminderArrow.click();
			LOGGER.info("Clicked on the reminder arrow - Iteration: " + (i + 1));
			AllureUtils.logStep("Clicking on the reminder arrow - Iteration: " + (i + 1));
			AllureUtils.captureScreenshot(driver, "acionsteps" + (i + 1));
			Thread.sleep(3000);
		}

		// Add new reminder
		WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(weblocators.reminderaddbttn));
		addButton.click();
		AllureUtils.logStep("Clicking on the + icon for reminder");
		AllureUtils.captureScreenshot(driver, "reminder2");
			
		// Enter date
		WebElement dateField = wait.until(ExpectedConditions.elementToBeClickable(weblocators.dateField));
		dateField.clear();
		dateField.sendKeys(eventDate);
		LOGGER.info("Entering date: " + eventDate);
		AllureUtils.logStep("Entering date: " + eventDate);
		AllureUtils.captureScreenshot(driver, "reminder3");
	
        Thread.sleep(2000);
		// Enter subject
		String noteText1 = webTestdata.notefield3;
		WebElement subjectField = wait.until(ExpectedConditions.elementToBeClickable(weblocators.remindersubject));
		subjectField.sendKeys(noteText1);
		AllureUtils.logStep("Inputting text into the subject: " + noteText1);
		AllureUtils.captureScreenshot(driver, "reminder4");

		// Enter reminder notes
		String noteText2 = webTestdata.notefield2;
		WebElement notesField = wait.until(ExpectedConditions.elementToBeClickable(weblocators.remindernotesfield));
		notesField.sendKeys(noteText2);
		AllureUtils.logStep("Inputting text into the reminder notes: " + noteText2);
		AllureUtils.captureScreenshot(driver, "reminder4");

		// Select email options
		WebElement emailTick = wait.until(ExpectedConditions.elementToBeClickable(weblocators.emailtick));
		emailTick.click();
		AllureUtils.logStep("Clicking on the email tick option");
		AllureUtils.captureScreenshot(driver, "reminder5");
		
        Thread.sleep(2000);
		// Handle time selection
		WebElement timeInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("reminder-time-picker")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", timeInput);
		AllureUtils.logStep("Clicking on the time picker");
		AllureUtils.captureScreenshot(driver, "reminder6");
		
		// Wait for time picker to be visible and select 08:00 AM
		Thread.sleep(1500); // Increased wait for animation
		WebElement amTime = wait.until(ExpectedConditions.presenceOfElementLocated(
			By.xpath("//li[contains(@class, 'MuiDigitalClock-item') and contains(text(), '08:00 AM')]")));
		
		// Scroll the time picker container to bring 8 AM into view
		((JavascriptExecutor) driver).executeScript(
			"arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'center'});", amTime);
		Thread.sleep(1000); // Wait for scroll to complete
		
		// Use JavaScript click instead of regular click
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", amTime);
		LOGGER.info("Selected time: 08:00 AM");
		AllureUtils.logStep("Selected morning time: 08:00 AM");
		AllureUtils.captureScreenshot(driver, "reminder7");

		Thread.sleep(2000);

		WebElement outsideClick1 = wait.until(ExpectedConditions.elementToBeClickable(weblocators.outsideclick));
		outsideClick1.click();

		Thread.sleep(2000);
		
		// // Set recurring options
		// WebElement recurring = wait.until(ExpectedConditions.elementToBeClickable(weblocators.recurring));
		// recurring.click();
		// AllureUtils.logStep("Clicking on the recurring button");
		// AllureUtils.captureScreenshot(driver, "reminder8");	

		// // Set recurring frequency
		// String option1 = webTestdata.Dailyfield;
		// WebElement recurringField = wait.until(ExpectedConditions.elementToBeClickable(weblocators.recuuring1));
		// recurringField.clear();
		// recurringField.sendKeys(option1);
		// LOGGER.info("Setting recurring frequency: " + option1);
		// AllureUtils.logStep("Setting recurring frequency: " + option1);
		// AllureUtils.captureScreenshot(driver, "reminder9");
		 
		// Thread.sleep(2000);
		
		// Submit reminder - scroll first, then click
		WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(weblocators.submitbttn));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", submitButton);
		Thread.sleep(1000); // Wait for scroll to complete
		submitButton.click();
		LOGGER.info("Scrolled to and clicked submit button");
		AllureUtils.logStep("Submitting reminder");
		AllureUtils.captureScreenshot(driver, "reminder10");
		
		Thread.sleep(3000);
		
		// Click reminder arrow again
		reminderArrow = wait.until(ExpectedConditions.elementToBeClickable(weblocators.reminderarrow));
		reminderArrow.click();
		LOGGER.info("Clicked on the reminder arrow again");
		AllureUtils.logStep("Expanding reminder section");
		AllureUtils.captureScreenshot(driver, "reminder_expanded");
		Thread.sleep(3000);
		
		// Format and click date
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
		LocalDate date = LocalDate.parse(eventDate, inputFormatter);
		String formattedDate = date.format(outputFormatter);

		WebElement dateElement = wait.until(ExpectedConditions.elementToBeClickable(
			By.xpath("//abbr[@aria-label='" + formattedDate + "']")));
		dateElement.click();
		AllureUtils.logStep("Selecting date: " + formattedDate);
		AllureUtils.captureScreenshot(driver, "reminder11");
	
		// Edit reminder
		WebElement editButton = wait.until(ExpectedConditions.elementToBeClickable(weblocators.editreminder));
		editButton.click();
		AllureUtils.logStep("Editing reminder");
		AllureUtils.captureScreenshot(driver, "reminder12");	
		
		// Update reminder notes
		String updatedNotes = webTestdata.notefield3;
		notesField = wait.until(ExpectedConditions.elementToBeClickable(weblocators.remindernotesfield));
		notesField.clear();
		notesField.sendKeys(updatedNotes);
		AllureUtils.logStep("Updating reminder notes: " + updatedNotes);
		AllureUtils.captureScreenshot(driver, "reminder13");
		
		Thread.sleep(2000);
		
		// Submit updates
		submitButton = wait.until(ExpectedConditions.elementToBeClickable(weblocators.submitbttn));
		submitButton.click();
		AllureUtils.logStep("Submitting updated reminder");
		AllureUtils.captureScreenshot(driver, "reminder14");	
		
		
		// Cancel edit
		WebElement cancelButton = wait.until(ExpectedConditions.elementToBeClickable(weblocators.deleteicon));
		cancelButton.click();
		AllureUtils.logStep("Cancelling reminder edit");
		AllureUtils.captureScreenshot(driver, "reminder15");	
		
		Thread.sleep(2000); 

		// Get and log delete confirmation popup
		WebElement deleteHeading = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.deletheading));
		WebElement deleteContent = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.headingreminder));
		String deletePopupText = deleteHeading.getText() + " " + deleteContent.getText();
		Allure.addAttachment("Delete Confirmation", deletePopupText);
		LOGGER.info("Delete Confirmation:\n" + deletePopupText);
		Thread.sleep(2000);
		
		// Cancel deletion
		cancelButton = wait.until(ExpectedConditions.elementToBeClickable(weblocators.cancelbuttn));
		cancelButton.click();
		AllureUtils.logStep("Cancelling reminder deletion");
		AllureUtils.captureScreenshot(driver, "reminder17");

		// Cancel edit
		WebElement cancelButtonagainElement = wait.until(ExpectedConditions.elementToBeClickable(weblocators.deleteicon));
		cancelButtonagainElement.click();
		AllureUtils.logStep("Cancelling reminder edit");
		AllureUtils.captureScreenshot(driver, "reminder15");	
		
		Thread.sleep(2000); 
		// Cancel edit
		WebElement confirmbutton = wait.until(ExpectedConditions.elementToBeClickable(weblocators.confirmbttn));
		confirmbutton.click();
		AllureUtils.logStep("Cancelling reminder edit");
		AllureUtils.captureScreenshot(driver, "reminder15");
		
		Thread.sleep(2000);
		LOGGER.info("Reminder test completed successfully");
	}
}
