package feature.case04_memberspec_actionsteps;

import org.openqa.selenium.WebDriver;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import allureframework.reporting.AllureUtils;
import base.BasePage;
import utils.SeleniumUtils;
import web.resources.ElementActions;
import web.resources.webTestdata;
import web.resources.weblocators;

public class Cases116_Action_Steps_member_delete extends BasePage {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Cases116_Action_Steps_member_delete.class);
    private ElementActions elementActions;
    SeleniumUtils utils = new SeleniumUtils(driver);
    public Cases116_Action_Steps_member_delete(WebDriver driver) {
        super(driver);
        this.elementActions = new ElementActions(driver);
    }

    @Test
    public void actionmembersteps() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(35)); // Adjusted to 35 seconds for practicality
        
   	 	utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();
        
        // Click on plus icon for action steps 
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.actionmember));
        elementActions.clickElement(weblocators.actionmember);
        // Log message to console and Allure report
        LOGGER.info("Clicked on actionmember");
        AllureUtils.logStep("Clicked on actionmember");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Cases110_Action_Steps1");
        
        // Send values in editor for action steps 
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.editoractions));
        elementActions.sendKeysToElement(weblocators.editoractions, webTestdata.descriptionForactionnotes);
        // Log message to console and Allure report
        LOGGER.info("Enter values in editoractions field :" + webTestdata.descriptionForactionnotes );
        AllureUtils.logStep("Enter values in editoractions field :" + webTestdata.descriptionForactionnotes);
        
        // Click on submit button from  acion steps 
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.submitactionmembernotes));
        elementActions.clickElement(weblocators.submitactionmembernotes);
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.deletemembernotes));
        elementActions.clickElement(weblocators.deletemembernotes);
        // Log message to console and Allure report
        LOGGER.info("Clicked on deletemembernotes");
        AllureUtils.logStep("Clicked on deletemembernotes");
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
