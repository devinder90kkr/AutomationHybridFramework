package feature.case02_memberspec_basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import allureframework.reporting.AllureUtils;
import base.BasePage;
import utils.SeleniumUtils;
import constant.weblocators;
import constant.webTestdata;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

@Epic("Member Summary Management")
@Feature("Member Preferences")
public class Case19_MS_Preferences extends BasePage {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Case19_MS_Preferences.class);
	SeleniumUtils utils = new SeleniumUtils(driver);
	

   	
	public Case19_MS_Preferences(WebDriver driver) {
		super(driver);
	}
    @Test
    @Description("Test member preferences functionality")
    @Story("Member Preferences Management")
    public void Preferences() throws InterruptedException {
        LOGGER.info("Starting Member Preferences test");
        Thread.sleep(2000);

        LOGGER.info("Navigating to Member Summary page");
        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();
        AllureUtils.captureScreenshot(driver, "member_summary_initial");
        
        Thread.sleep(2000);
        
        try {
            // Check if edit button exists (meaning there's an existing preference)
            LOGGER.info("Checking for existing preferences");
            WebElement editButton = driver.findElement(weblocators.editbttnprefernce);
            if (editButton.isDisplayed()) {
                LOGGER.info("Found existing preference, proceeding to delete it first");
                editButton.click();
                AllureUtils.logStep("Clicked edit button on existing preference");
                
                Thread.sleep(2000);
                // Delete existing preference
                WebElement deleteIcon = driver.findElement(weblocators.deletbttnprefernce);
                deleteIcon.click();
                AllureUtils.logStep("Deleted existing preference");
                Thread.sleep(2000);


                // Click on the confirm icon to remove the preference
                LOGGER.info("Confirm preference");
                WebElement confirm = driver.findElement(weblocators.confirm);
                confirm.click();
                AllureUtils.logStep("Confirm successfully");
            }
        } catch (org.openqa.selenium.NoSuchElementException e) {
            LOGGER.info("No existing preferences found, proceeding with new preference creation");
        }

        // Continue with adding new preference
        LOGGER.info("Adding new preference");
        WebElement plusIcon = driver.findElement(weblocators.plsicn);
        plusIcon.click();
        AllureUtils.logStep("Clicked plus icon to add new preference");

        // Find the preference input text field and fill in some information
        LOGGER.info("Entering preference information");
        WebElement preferenceInput = driver.findElement(weblocators.prefnceInpt);
        String initialPreference = webTestdata.getRandomFitnessMessage();
        LOGGER.info("Generated initial preference content: {}", initialPreference);
        preferenceInput.sendKeys(initialPreference);
        AllureUtils.logStep("Entered preference information");

        // Find the save button and click on it
        LOGGER.info("Saving preference");
        WebElement saveButton = driver.findElement(weblocators.savbttn);
        saveButton.click();
        AllureUtils.logStep("Saved preference successfully");
        AllureUtils.captureScreenshot(driver, "preference_saved");

        Thread.sleep(3000);
    
            // Text is available, click on the edit button
            LOGGER.info("Editing preference");
            WebElement editButton = driver.findElement(weblocators.editbttnprefernce);
            editButton.click();
            AllureUtils.logStep("Clicked edit button");

            // Find the textarea and update the information
            LOGGER.info("Updating preference information");
            WebElement preferenceTextArea = driver.findElement(weblocators.prefnceInpt);
            preferenceTextArea.clear();
            String updatedPreference = webTestdata.getRandomFitnessMessage();
            LOGGER.info("Generated updated preference content: {}", updatedPreference);
            preferenceTextArea.sendKeys(updatedPreference);
            AllureUtils.logStep("Updated preference information");

            Thread.sleep(5000);
         // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "preference_updated");
          }
        
        
    		}


