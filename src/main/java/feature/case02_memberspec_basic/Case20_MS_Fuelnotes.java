package feature.case02_memberspec_basic;

// import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import allureframework.reporting.AllureUtils;
import base.BasePage;
import utils.SeleniumUtils;
import web.resources.webTestdata;
import web.resources.weblocators;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

@Epic("Member Summary Management")
@Feature("Fuel Notes Management")
public class Case20_MS_Fuelnotes extends BasePage {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Case20_MS_Fuelnotes.class);
    SeleniumUtils utils = new SeleniumUtils(driver);
    
   
  


    public Case20_MS_Fuelnotes(WebDriver driver) {
        super(driver);
    }

    @Test
    @Description("Test fuel notes functionality")
    @Story("Fuel Notes Management")
    public void Fuel_notes() throws InterruptedException {
        LOGGER.info("Starting Fuel Notes test");
        Thread.sleep(2000);

        LOGGER.info("Navigating to Member Summary page");
        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();
        AllureUtils.captureScreenshot(driver, "member_summary_initial");
        
        Thread.sleep(2000);
        
        try {
            // Check if edit button exists (meaning there's an existing fuel note)
            LOGGER.info("Checking for existing fuel notes");
            WebElement editButton = driver.findElement(weblocators.editbttnfuenotes);
            if (editButton.isDisplayed()) {
                LOGGER.info("Found existing fuel note, proceeding to delete it first");
                editButton.click();
                AllureUtils.logStep("Clicked edit button on existing fuel note");
                
                Thread.sleep(2000);
                // Delete existing fuel note
                WebElement deleteIcon = driver.findElement(weblocators.deltbttnfuenotes);
                deleteIcon.click();
                AllureUtils.logStep("Deleted existing fuel note");
                Thread.sleep(2000);

                 // Click on the confirm icon to remove the preference
                 LOGGER.info("Confirm preference");
                 WebElement confirm = driver.findElement(weblocators.confirm);
                 confirm.click();
                 AllureUtils.logStep("Confirm successfully");
            }
        } catch (org.openqa.selenium.NoSuchElementException e) {
            LOGGER.info("No existing fuel notes found, proceeding with new note creation");
        }

        try {
            // Add new fuel note
            LOGGER.info("Adding new fuel note");
            WebElement plusIcon = driver.findElement(weblocators.pluicn);
            if (plusIcon.isDisplayed()) {
                plusIcon.click();
                AllureUtils.logStep("Clicked plus icon to add new fuel note");
                AllureUtils.captureScreenshot(driver, "add_fuel_note");

                // Enter fuel note information
                LOGGER.info("Entering fuel note information");
                WebElement preferenceInput = driver.findElement(weblocators.prefTexAre);
                String initialNote = webTestdata.getRandomFitnessMessage();
                LOGGER.info("Generated initial fuel note content: {}", initialNote);
                preferenceInput.sendKeys(initialNote);
                AllureUtils.logStep("Entered fuel note information");

                // Save the fuel note
                LOGGER.info("Saving fuel note");
                WebElement saveButton = driver.findElement(weblocators.savbttnfuenotes);
                saveButton.click();
                AllureUtils.logStep("Saved fuel note successfully");
                AllureUtils.captureScreenshot(driver, "fuel_note_saved");
                Thread.sleep(3000);

                // Edit the fuel note
                LOGGER.info("Editing fuel note");
                WebElement editButton = driver.findElement(weblocators.editbttnfuenotes);
                editButton.click();
                AllureUtils.logStep("Clicked edit button");

                // Update the fuel note
                LOGGER.info("Updating fuel note information");
                WebElement preferenceTextArea = driver.findElement(weblocators.prefTexAre);
                preferenceTextArea.clear();
                String updatedNote = webTestdata.getRandomFitnessMessage();
                LOGGER.info("Generated updated fuel note content: {}", updatedNote);
                preferenceTextArea.sendKeys(updatedNote);
                AllureUtils.logStep("Updated fuel note information");

                // Save the updated note
                LOGGER.info("Saving updated fuel note");
                saveButton = driver.findElement(weblocators.savbttnfuenotes);
                saveButton.click();
                AllureUtils.logStep("Saved updated fuel note");
                AllureUtils.captureScreenshot(driver, "fuel_note_updated");
                Thread.sleep(2000);

               
            } else {
                LOGGER.error("Plus icon found but not visible");
                throw new RuntimeException("Plus icon not visible on the page");
            }
        } catch (org.openqa.selenium.NoSuchElementException e) {
            LOGGER.error("Required elements not found on the page");
            throw new RuntimeException("Required elements not found on the page");
        }
    }
}

