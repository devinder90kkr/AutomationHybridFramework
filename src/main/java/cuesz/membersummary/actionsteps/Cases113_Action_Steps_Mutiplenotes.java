package cuesz.membersummary.actionsteps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.date.functions.DateGenerator;
import cuesz.pages.BasePage;
import cuesz.web.resources.ElementActions;
import cuesz.web.resources.webTestdata;
import cuesz.web.resources.weblocators;

public class Cases113_Action_Steps_Mutiplenotes extends BasePage {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Cases113_Action_Steps_Mutiplenotes.class);
    private ElementActions elementActions;
    public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date
    
    public Cases113_Action_Steps_Mutiplenotes(WebDriver driver) {
        super(driver);
        this.elementActions = new ElementActions(driver);
    }

    @Test
    public void multiplenotes() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(35)); // Adjusted to 35 seconds for practicality
        
        // Create a list of notes
        List<String> notesList = Arrays.asList(
            "Note 5: " + webTestdata.notes1,
            "Note 4: " + webTestdata.notes2,
            "Note 3: " + webTestdata.notes3,
            "Note 2: " + webTestdata.notes4,
            "Note 1: " + webTestdata.notes5
        );

     // Loop through each note in the list
        for (String note : notesList) {
            // Click on plus icon for action steps 
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.actionstepsbutton));
            elementActions.clickElement(weblocators.actionstepsbutton);
            LOGGER.info("Clicked on actionstepsbutton");
            AllureUtils.logStep("Clicked on actionstepsbutton");
            AllureUtils.captureScreenshot(driver, "Cases113_Action_Steps_Mutiplenotes1");

            // Send the current note to the editor
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.editoractions));
            elementActions.sendKeysToElement(weblocators.editoractions, note);
            LOGGER.info("Entered values in editoractions field: " + note);
            AllureUtils.logStep("Entered values in editoractions field: " + note);

            // Click on submit button for action steps 
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.submitactionnotes));
            elementActions.clickElement(weblocators.submitactionnotes);
            LOGGER.info("Clicked on submitactionnotes");
            AllureUtils.logStep("Clicked on submitactionnotes");
            AllureUtils.captureScreenshot(driver, "Cases113_Action_Steps_Mutiplenotes1");
            
            // Optionally, you can add a small delay between submissions
            Thread.sleep(1000); // Adjust the sleep time as needed      
        }
        
     // Define locators in an array for important and priority sections
        List<By> importantLocators = Arrays.asList(
            weblocators.important2,
            weblocators.priority2
           
        );

        // Loop through important and priority locators
        for (By locator : importantLocators) {
            // Click on the locator (important or priority)
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            elementActions.clickElement(locator);
            LOGGER.info("Clicked on element: " + locator);
            AllureUtils.logStep("Clicked on element: " + locator);
            AllureUtils.captureScreenshot(driver, "Cases113_Action_Steps_Locator_Click");
            Thread.sleep(3500); // Adjust the sleep time as needed
            // Enter value for date field
            WebElement dateField = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.importancedatefield));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dateField);
            Actions builder = new Actions(driver);
            builder.moveToElement(dateField).click().sendKeys(eventDate).sendKeys(Keys.ENTER).perform();
            LOGGER.info("Entered values for date field: " + eventDate);
            AllureUtils.logStep("Entered values for date field: " + eventDate);
            Thread.sleep(3500); // Adjust the sleep time as needed
            // Enter time values for the date field
            WebElement timeField = wait.until(ExpectedConditions.elementToBeClickable(weblocators.importancetimefield));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", timeField);
            builder.moveToElement(timeField).click().sendKeys(webTestdata.startime).perform();
            Thread.sleep(3500); // Adjust the sleep time as needed
            builder.click();
            LOGGER.info("Entered values for time field: " + webTestdata.startime);
            AllureUtils.logStep("Entered values for time field: " + webTestdata.startime);
            Thread.sleep(3500); // Adjust the sleep time as needed
            // Click on the submit button for importance or priority
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.submtimportance));            
            elementActions.clickElement(weblocators.submtimportance);
            LOGGER.info("Clicked on submtimportance");
            AllureUtils.logStep("Clicked on submtimportance");
        }
    
    
    }

}        

