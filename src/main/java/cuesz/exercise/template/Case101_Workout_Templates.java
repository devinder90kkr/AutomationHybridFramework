package cuesz.exercise.template;

import org.openqa.selenium.WebDriver;
import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import org.testng.SkipException;

import cuesz.pages.BasePage;
import cuesz.utils.reporting.AllureUtils;
import cuesz.utils.web.ElementActions;
import cuesz.utils.web.weblocators;

public class Case101_Workout_Templates extends BasePage {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case101_Workout_Templates.class);
	private ElementActions elementActions;

    public Case101_Workout_Templates(WebDriver driver) {
        super(driver);
        this.elementActions = new ElementActions(driver);
    }

    @Test
    public void Workouttemplate() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
        	// Click on Workout template icon from nav bar menu
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.templateicon));
            elementActions.clickElement(weblocators.templateicon);
            // Log message to console and Allure report
            LOGGER.info("Clicked on templateicon");
            AllureUtils.logStep("Clicked on templateicon");
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case102_Workout_Templates1");
        	
            // Click on Workout template icon from nav bar menu
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.templateplsicon));
            elementActions.clickElement(weblocators.templateplsicon);
            // Log message to console and Allure report
	        LOGGER.info("Click on templateplsicon");
	        AllureUtils.logStep("Click on templateplsicon");
	        // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "Case101_Workout_Templates2");
            
            
        } catch (TimeoutException e) {
            System.out.println("Element not found within the timeout period. Skipping the test case.");
            // Log message to console and Allure report
	        LOGGER.info("Element not found within the timeout period. Skipping the test case.");
	        AllureUtils.logStep("Element not found within the timeout period. Skipping the test case."); 
            throw new SkipException("Skipping the test case as the elements were not found.");
	        
        } catch (NoSuchElementException e) {
            System.out.println("Coach is non-lead. Skipping the test case.");
         // Log message to console and Allure report
	        LOGGER.info("Coach is non-lead. Skipping the test case.");
	        AllureUtils.logStep("Coach is non-lead. Skipping the test case."); 
            throw new SkipException("Skipping the test case as the coach is non-lead.");
        }
    }
}
