package cuesz.membersummary.actionsteps;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

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

public class Cases112_Action_Steps_editcaseImportancorPriority extends BasePage {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Cases112_Action_Steps_editcaseImportancorPriority.class);
    private ElementActions elementActions;
    public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date
    
    public Cases112_Action_Steps_editcaseImportancorPriority(WebDriver driver) {
        super(driver);
        this.elementActions = new ElementActions(driver);
    }

    @Test
    public void editactionsteps() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(35)); // Adjusted to 35 seconds for practicality

        // Click on plus icon for action steps 
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.importancesection));
        elementActions.clickElement(weblocators.importancesection);
        // Log message to console and Allure report
        LOGGER.info("Clicked on importancesection");
        AllureUtils.logStep("Clicked on importancesection");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Cases112_Action_Steps_editcaseImportancorPriority1");
        Thread.sleep(2500);

        /*Enter value for importance date field*/
        WebElement importancedatefield = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.importancedatefield));
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(importancedatefield).click().sendKeys(eventDate).sendKeys(Keys.ENTER).perform();
		 // Log message to console and Allure report
        LOGGER.info("Enter values for importance date field: " +  eventDate);
        AllureUtils.logStep("Enter values for importance date field; " +  eventDate);
        
        /*Enter Time values for importance date field*/
		WebElement importanceTime = wait.until(ExpectedConditions.elementToBeClickable(weblocators.importancetimefield));
	    Actions builder = new Actions(driver);
	    builder.moveToElement(importanceTime).click().sendKeys(webTestdata.startime).perform();
	    Thread.sleep(3500);
	    builder.click();
//	    builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();	    
	    // Log message to console and Allure report
        LOGGER.info("Enter values for importance time field :" +  webTestdata.startime);
        AllureUtils.logStep("Enter values for importance time field :" +  webTestdata.startime);
       
        // Click on plus icon for action steps 
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.submtimportance));
        elementActions.clickElement(weblocators.submtimportance);
        // Log message to console and Allure report
        LOGGER.info("Clicked on submtimportance");
        AllureUtils.logStep("Clicked on submtimportance");
        
        Thread.sleep(2500);
       
    }
}
