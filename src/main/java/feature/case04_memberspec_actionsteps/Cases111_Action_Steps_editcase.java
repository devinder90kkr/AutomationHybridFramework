package feature.case04_memberspec_actionsteps;

import org.openqa.selenium.WebDriver;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import allureframework.reporting.AllureUtils;
import commonfunction.functions.DateGenerator;
import base.BasePage;
import web.resources.ElementActions;
import web.resources.webTestdata;
import web.resources.weblocators;

public class Cases111_Action_Steps_editcase extends BasePage {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Cases111_Action_Steps_editcase.class);
    private ElementActions elementActions;
    public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date
    
    public Cases111_Action_Steps_editcase(WebDriver driver) {
        super(driver);
        this.elementActions = new ElementActions(driver);
    }

    @Test
    public void editactionsteps() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(35)); // Adjusted to 35 seconds for practicality

        // Click on plus icon for action steps 
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.actionstepsbutton));
        elementActions.clickElement(weblocators.actionstepsbutton);
        // Log message to console and Allure report
        LOGGER.info("Clicked on actionstepsbutton");
        AllureUtils.logStep("Clicked on actionstepsbutton");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Cases110_Action_Steps1");
        Thread.sleep(2500);
        // Send values in editor for action steps 
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.editoractions));
        elementActions.sendKeysToElement(weblocators.editoractions, webTestdata.notes);
        // Log message to console and Allure report
        LOGGER.info("Enter values in editoractions field :" + webTestdata.notes );
        AllureUtils.logStep("Enter values in editoractions field :" + webTestdata.notes);
        Thread.sleep(2500);
        // Click on submit button from  acion steps 
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.submitactionnotes));
        elementActions.clickElement(weblocators.submitactionnotes);
        // Log message to console and Allure report
        LOGGER.info("Clicked on submitactionnotes");
        AllureUtils.logStep("Clicked on submitactionnotes");
       
        Thread.sleep(2500);
        // Click on plus icon for action steps 
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.editiconaction));
        elementActions.clickElement(weblocators.editiconaction);
        // Log message to console and Allure report
        LOGGER.info("Clicked on editiconaction");
        AllureUtils.logStep("Clicked on editiconaction");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Cases110_Action_Steps2");
            
        //search for action steps
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.editactionsteps));
        elementActions.sendKeysToElement(weblocators.editactionsteps, webTestdata.notefield1);
        // Log message to console and Allure report
        LOGGER.info("Enter values in Edit Action Step  field : " + webTestdata.notefield1 );
        AllureUtils.logStep("Enter values in Edit Action Step field : " + webTestdata.notefield1);
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Cases110_Action_Steps3");
        
        Thread.sleep(2500);
        elementActions.clickElement(weblocators.submitbttnaction);
        // Log message to console and Allure report
        LOGGER.info("Clicked on submitbttnaction");
        AllureUtils.logStep("Clicked on submitbttnaction");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Cases110_Action_Steps4");
        Thread.sleep(3500);
        
        // Click on plus icon for action steps 
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.historyicon));
        elementActions.clickElement(weblocators.historyicon);
        // Log message to console and Allure report
        LOGGER.info("Clicked on editiconaction");
        AllureUtils.logStep("Clicked on editiconaction");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Cases110_Action_Steps3");
        
        Thread.sleep(2500); 
       
       
        // Assertions after clicking the history icon
       wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.historySection));
       boolean isHistoryVisible = driver.findElement(weblocators.historySection).isDisplayed();
       Assert.assertTrue(isHistoryVisible, "History section is not visible");
       LOGGER.info("History section is visible");
       AllureUtils.logStep("History section is visible");
       AllureUtils.captureScreenshot(driver, "Cases110_Action_Steps_History");

       // Retrieve text from the history section
       String historyText = driver.findElement(weblocators.historySection).getText();
       LOGGER.info("History section text: " + historyText);
       AllureUtils.logStep("History section text: " + historyText);
       
    }
}
