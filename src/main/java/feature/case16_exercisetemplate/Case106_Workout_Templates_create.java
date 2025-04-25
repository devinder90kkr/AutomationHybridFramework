package feature.case16_exercisetemplate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.SkipException;

import allureframework.reporting.AllureUtils;
import commonfunction.functions.WorkoutStepsHelper;
import base.BasePage;
import constant.ElementActions;
import constant.webTestdata;
import constant.weblocators;

public class Case106_Workout_Templates_create extends BasePage {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case106_Workout_Templates_create.class);
	private ElementActions elementActions;
	private WorkoutStepsHelper workoutStepsHelper;

    public Case106_Workout_Templates_create(WebDriver driver) {
        super(driver);
        this.elementActions = new ElementActions(driver);
        this.workoutStepsHelper = new WorkoutStepsHelper(driver);
    }

    @Test
    public void Createworkout() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2500));
        try {
            	
        	// Click on Workout template icon from nav bar menu
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.templateicon));
            elementActions.clickElement(weblocators.templateicon);
            // Log message to console and Allure report
            LOGGER.info("Clicked on templateicon");
            AllureUtils.logStep("Clicked on templateicon");
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case102_Workout_Templates1");
            
            
            // Verify Work Template heading is displayed
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.workoutemplateheading));
            boolean isHeadingDisplayed = elementActions.isElementDisplayed(weblocators.workoutemplateheading);
            Assert.assertTrue(isHeadingDisplayed, "Add Template heading is not displayed");

            // Get heading text
            String headingText = elementActions.getTextFromPopup(weblocators.workoutemplateheading);
            // Log message to console and Allure report
            LOGGER.info("Verified Add Template heading is displayed: " + headingText);
            AllureUtils.logStep("Verified Add Template heading is displayed: " + headingText);
            
    
            // Click on Workout template icon from nav bar menu
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.templateplsicon));
            elementActions.clickElement(weblocators.templateplsicon);
            // Log message to console and Allure report
	        LOGGER.info("Click on templateplsicon");
	        AllureUtils.logStep("Click on templateplsicon");
	        // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "Case101_Workout_Templates2");
	        
	        // Verify Add Template heading is displayed
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.addTemplateHeading));
            boolean isHeadingDisplayed1 = elementActions.isElementDisplayed(weblocators.addTemplateHeading);
            Assert.assertTrue(isHeadingDisplayed1, "Add Template heading is not displayed");

            // Get heading text
            String headingText1 = elementActions.getTextFromPopup(weblocators.addTemplateHeading);
            // Log message to console and Allure report
            LOGGER.info("Verified Add Template heading is displayed: " + headingText1);
            AllureUtils.logStep("Verified Add Template heading is displayed: " + headingText1);
	        
            //Verify Add Template heading is displayed
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.templatname));
            // Generate a unique template name
            String uniqueTemplateName = elementActions.generateUniqueTemplateName1(webTestdata.templatename);
            // Clear and insert values in templatname field
            elementActions.sendKeysToElement(weblocators.templatname, uniqueTemplateName);
            // Log the generated template name
            LOGGER.info("Generated unique template name: " + uniqueTemplateName);
            AllureUtils.logStep("Generated unique template name: " + uniqueTemplateName);
            

            // Iterate over the test data sets
            for (int i = 0; i < webTestdata.exercisenamesmultipl.length; i++) {
                workoutStepsHelper.repeatWorkoutSteps(wait, webTestdata.exercisenamesmultipl[i], webTestdata.descriptionsmultipl[i], webTestdata.repsdata3[i], webTestdata.recoverydata3[i], webTestdata.optional13[i], webTestdata.optional23[i]);
            }

            // Click on submit button
            WebElement exercisesave =wait.until(ExpectedConditions.elementToBeClickable(weblocators.savebutton));
            // Scroll to the "Staff Notes" element using JavaScriptExecutor
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", exercisesave);
            Thread.sleep(3500);
            elementActions.clickElement(weblocators.savebutton);
            // Log message to console and Allure report
            LOGGER.info("Click on savebutton");
            AllureUtils.logStep("Click on savebutton");
            
            Thread.sleep(3500);
            
            // Click on submit button
            WebElement confirmsave =wait.until(ExpectedConditions.elementToBeClickable(weblocators.confirmbttn));
            // Scroll to the "Staff Notes" element using JavaScriptExecutor
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", confirmsave);
            Thread.sleep(3500);
            elementActions.clickElement(weblocators.confirmbttn);
            // Log message to console and Allure report
            LOGGER.info("Click on confirmbttn");
            AllureUtils.logStep("Click on confirmbttn");
            Thread.sleep(3500);
            
            
            Thread.sleep(5500);
            
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
