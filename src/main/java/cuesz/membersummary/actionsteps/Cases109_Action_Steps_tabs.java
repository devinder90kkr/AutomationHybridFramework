package cuesz.membersummary.actionsteps;

import org.openqa.selenium.WebDriver;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.pages.BasePage;
import cuesz.web.resources.ElementActions;
import cuesz.web.resources.weblocators;

public class Cases109_Action_Steps_tabs extends BasePage {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Cases109_Action_Steps_tabs.class);
    private ElementActions elementActions;
    
    public Cases109_Action_Steps_tabs(WebDriver driver) {
        super(driver);
        this.elementActions = new ElementActions(driver);
    }

    @Test
    public void actionstepstabs() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(35)); // Adjusted to 35 seconds for practicality

        
        // Click on plus icon for action steps 
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.activetab));
        elementActions.clickElement(weblocators.activetab);    
        // Log message to console and Allure report
        LOGGER.info("Clicked on completetab");
        AllureUtils.logStep("Clicked on completetab");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Cases110_Action_Steps2");
        // Get the text from completetab and log it
        String completetabText1 = driver.findElement(weblocators.activetab).getText();
        LOGGER.info("Text from completetab: " + completetabText1);
        AllureUtils.logStep("Text from completetab: " + completetabText1);

        Thread.sleep(2500);        
        // Click on plus icon for action steps 
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.completetab));
        elementActions.clickElement(weblocators.completetab);    
        // Log message to console and Allure report
        LOGGER.info("Clicked on completetab");
        AllureUtils.logStep("Clicked on completetab");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Cases110_Action_Steps1");
        // Get the text from completetab and log it
        String completetabText2 = driver.findElement(weblocators.completetab).getText();
        LOGGER.info("Text from completetab: " + completetabText2);
        AllureUtils.logStep("Text from completetab: " + completetabText2);
        
        
        Thread.sleep(2500);        
        // Click on plus icon for action steps 
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.alltab));
        elementActions.clickElement(weblocators.alltab);    
        // Log message to console and Allure report
        LOGGER.info("Clicked on alltab");
        AllureUtils.logStep("Clicked on alltab");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Cases110_Action_Steps3");
        // Get the text from completetab and log it
        String completetabText3 = driver.findElement(weblocators.alltab).getText();
        LOGGER.info("Text from completetab: " + completetabText3);
        AllureUtils.logStep("Text from completetab: " + completetabText3);

        
        
        
       Thread.sleep(2500); 
        
    }
}
