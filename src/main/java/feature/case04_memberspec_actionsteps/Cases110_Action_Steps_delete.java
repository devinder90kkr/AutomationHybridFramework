package feature.case04_memberspec_actionsteps;  

import org.openqa.selenium.WebDriver;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import allureframework.AllureUtils;
import base.BasePage;
import constant.ElementActions;
import constant.webTestdata;
import constant.weblocators;

public class Cases110_Action_Steps_delete extends BasePage {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Cases110_Action_Steps_delete.class);
    private ElementActions elementActions;
    
    public Cases110_Action_Steps_delete(WebDriver driver) {
        super(driver);
        this.elementActions = new ElementActions(driver);
    }

    @Test
    public void actionsteps() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(35)); // Adjusted to 35 seconds for practicality

        // Click on plus icon for action steps 
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.actionstepsbutton));
        elementActions.clickElement(weblocators.actionstepsbutton);
        // Log message to console and Allure report
        LOGGER.info("Clicked on actionstepsbutton");
        AllureUtils.logStep("Clicked on actionstepsbutton");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Cases110_Action_Steps1");
        
        // Send values in editor for action steps 
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.editoractions));
        elementActions.sendKeysToElement(weblocators.editoractions, webTestdata.descriptionForactionnotes);
        // Log message to console and Allure report
        LOGGER.info("Enter values in editoractions field :" + webTestdata.descriptionForactionnotes );
        AllureUtils.logStep("Enter values in editoractions field :" + webTestdata.descriptionForactionnotes);
    
        // Click on submit button from  acion steps 
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.submitactionnotes));
        elementActions.clickElement(weblocators.submitactionnotes);
        // Log message to console and Allure report
        LOGGER.info("Clicked on submitactionnotes");
        AllureUtils.logStep("Clicked on submitactionnotes");
       
        
        //search for action steps
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.searchnotes));
        elementActions.sendKeysToElement(weblocators.searchnotes, webTestdata.descriptionForactionnotes);
        // Log message to console and Allure report
        LOGGER.info("Enter values in searchnotes field :" + webTestdata.descriptionForactionnotes );
        AllureUtils.logStep("Enter values in searchnotes field :" + webTestdata.descriptionForactionnotes);
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Cases110_Action_Steps2");
        
        // Click on plus icon for action steps 
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.deletenotes));
        elementActions.clickElement(weblocators.deletenotes);
        // Log message to console and Allure report
        LOGGER.info("Clicked on deletenotes");
        AllureUtils.logStep("Clicked on deletenotes");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Cases110_Action_Steps3");
        
        elementActions.clickElement(weblocators.confirmbttn); 
     // Log message to console and Allure report
        LOGGER.info("Clicked on confirmbttn");
        AllureUtils.logStep("Clicked on confirmbttn");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Cases110_Action_Steps4");
        
        
        
       Thread.sleep(2500); 
        
    }
}
