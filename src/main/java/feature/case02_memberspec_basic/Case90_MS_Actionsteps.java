package feature.case02_memberspec_basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

import allureframework.AllureUtils;
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
@Feature("Action Steps Management")
public class Case90_MS_Actionsteps extends BasePage {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case90_MS_Actionsteps.class);
	SeleniumUtils utils = new SeleniumUtils(driver);
	private WebDriverWait wait;

	public Case90_MS_Actionsteps(WebDriver driver) {
		super(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@Test
	@Description("Manage and verify action steps functionality")
	@Story("Action Steps Configuration")
	public void actionSteps() throws InterruptedException {
		LOGGER.info("Starting Action Steps test");
		Thread.sleep(2000);

		utils.clickMembersummary();
		LOGGER.info("Clicked on Member Summary");
		AllureUtils.logStep("Navigated to Member Summary");

		utils.waitForMilliseconds(2000);
		utils.enterSearchText();
		LOGGER.info("Entered search text");
		
		utils.clickMembername();
		LOGGER.info("Selected member from search results");
		AllureUtils.logStep("Selected member profile");
		Thread.sleep(2000);

		// Verify Action Steps heading
		WebElement headingElement = driver.findElement(weblocators.actionheading);
		String headingText = headingElement.getText();
		String expectedHeadingText = "Action Steps";
		Assert.assertEquals(headingText, expectedHeadingText, "Heading text doesn't match");
		LOGGER.info("Verified Action Steps heading");
		Allure.addAttachment("Expected Heading Text", expectedHeadingText);
		AllureUtils.logStep("Verified Action Steps heading");

		// Add new action step
		WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(weblocators.addbttn));
		addButton.click();
		LOGGER.info("Clicked add button");
		AllureUtils.logStep("Clicked add button");
		AllureUtils.captureScreenshot(driver, "action_steps_add");

		Thread.sleep(3000);
		String noteText = webTestdata.notefield1;
		WebElement actionInput = wait.until(ExpectedConditions.elementToBeClickable(weblocators.actioninputfield));
		actionInput.sendKeys(noteText);
		LOGGER.info("Entered action step text: {}", noteText);
		AllureUtils.logStep("Entered action step text");
		AllureUtils.captureScreenshot(driver, "action_steps_text_entered");

		Thread.sleep(5000);
		WebElement sendButton = wait.until(ExpectedConditions.elementToBeClickable(weblocators.sendactionstep));
		sendButton.click();
		LOGGER.info("Submitted action step");
		AllureUtils.logStep("Submitted action step");
		AllureUtils.captureScreenshot(driver, "action_steps_submitted");

		Thread.sleep(3000);
		WebElement seeMoreButton = wait.until(ExpectedConditions.elementToBeClickable(weblocators.seeMoreButton));
		seeMoreButton.click();
		LOGGER.info("Clicked see more button");
		AllureUtils.logStep("Expanded action steps view");
		AllureUtils.captureScreenshot(driver, "action_steps_expanded");

		Thread.sleep(3000);
		WebElement editIcon = wait.until(ExpectedConditions.elementToBeClickable(weblocators.editicon));
		editIcon.click();
		LOGGER.info("Clicked edit icon");
		AllureUtils.logStep("Editing action step");
		AllureUtils.captureScreenshot(driver, "action_steps_edit_mode");

		Thread.sleep(3000);
		String updatedText = webTestdata.notefield2;
		WebElement editTextArea = wait.until(ExpectedConditions.elementToBeClickable(weblocators.edittextarea));
		editTextArea.sendKeys(updatedText);
		LOGGER.info("Updated action step text: {}", updatedText);
		AllureUtils.logStep("Updated action step text");
		AllureUtils.captureScreenshot(driver, "action_steps_text_updated");

		Thread.sleep(3000);
		WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(weblocators.submitbutton));
		submitButton.click();
		LOGGER.info("Submitted updated action step");
		AllureUtils.logStep("Submitted updated action step");
		AllureUtils.captureScreenshot(driver, "action_steps_update_submitted");

		Thread.sleep(3000);
		WebElement deleteIcon = wait.until(ExpectedConditions.elementToBeClickable(weblocators.deleteicon));
		deleteIcon.click();
		LOGGER.info("Clicked delete icon");
		AllureUtils.logStep("Initiated action step deletion");
		AllureUtils.captureScreenshot(driver, "action_steps_delete_confirmation");

		// Get and log popup text
		WebElement popupHeading = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.deletePopupHeading));
		WebElement popupContent = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.deletePopupContent));
		String popupText = popupHeading.getText() + " " + popupContent.getText();
		LOGGER.info("Delete confirmation popup text: {}", popupText);
		Allure.addAttachment("Delete Confirmation Text", popupText);

		Thread.sleep(3000);
		WebElement cancelButton = wait.until(ExpectedConditions.elementToBeClickable(weblocators.cancelbuttn));
		cancelButton.click();
		LOGGER.info("Cancelled deletion");
		AllureUtils.logStep("Cancelled action step deletion");
		AllureUtils.captureScreenshot(driver, "action_steps_delete_cancelled");

		Thread.sleep(3000);
		deleteIcon = wait.until(ExpectedConditions.elementToBeClickable(weblocators.deleteicon));
		deleteIcon.click();
		LOGGER.info("Clicked delete icon again");
		AllureUtils.logStep("Reinitiated action step deletion");

		Thread.sleep(3000);
		WebElement confirmButton = wait.until(ExpectedConditions.elementToBeClickable(weblocators.confirmbttn));
		confirmButton.click();
		LOGGER.info("Confirmed deletion");
		AllureUtils.logStep("Confirmed action step deletion");
		AllureUtils.captureScreenshot(driver, "action_steps_deleted");

		Thread.sleep(3000);
		LOGGER.info("Action Steps test completed successfully");
		AllureUtils.logStep("Action Steps test completed");
	}
}
