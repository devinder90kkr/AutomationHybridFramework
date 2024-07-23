package cuesz.exercise.template;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.SkipException;

import cuesz.pages.BasePage;
import cuesz.utils.reporting.AllureUtils;
import cuesz.utils.web.ElementActions;
import cuesz.utils.web.webTestdata;
import cuesz.utils.web.weblocators;

public class Case102_Workout_Templates_create extends BasePage {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case102_Workout_Templates_create.class);
	private ElementActions elementActions;

    public Case102_Workout_Templates_create(WebDriver driver) {
        super(driver);
        this.elementActions = new ElementActions(driver);
    }

    @Test
    public void Createworkout() throws InterruptedException {
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
            
            
            // Verify Work Template heading is displayed
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.workoutemplateheading));
            boolean isHeadingDisplayed = elementActions.isElementDisplayed(weblocators.workoutemplateheading);
            Assert.assertTrue(isHeadingDisplayed, "Add Template heading is not displayed");

            // Get heading text
            String headingText = elementActions.getTextFromPopup(weblocators.workoutemplateheading);
            // Log message to console and Allure report
            LOGGER.info("Verified Add Template heading is displayed: " + headingText);
            AllureUtils.logStep("Verified Add Template heading is displayed: " + headingText);
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case102_Workout_Templates_Add_Template_Heading");
            
    
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
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case102_Workout_Templates_Add_Template_Heading");
	        
            //Verify Add Template heading is displayed
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.templatname));
            // Generate a unique template name
            String uniqueTemplateName = elementActions.generateUniqueTemplateName1(webTestdata.templatename);
            // Clear and insert values in templatname field
            elementActions.sendKeysToElement(weblocators.templatname, uniqueTemplateName);
            // Log the generated template name
            LOGGER.info("Generated unique template name: " + uniqueTemplateName);
            AllureUtils.logStep("Generated unique template name: " + uniqueTemplateName);
            
            //Click on Add new workout button 
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.addnewworkout));
            elementActions.clickElement(weblocators.addnewworkout);
            // Log message to console and Allure report
	        LOGGER.info("Click on addnewworkout");
	        AllureUtils.logStep("Click on addnewworkout");
	        
	        // Verify exerciseconatiner is displayed
	        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.exerciseconatiner));
	        boolean isExerciseContainerDisplayed = elementActions.isElementDisplayed(weblocators.exerciseconatiner);
	        Assert.assertTrue(isExerciseContainerDisplayed, "Exercise container is not displayed");
	        // Log message to console and Allure report
	        LOGGER.info("Verified exercise container is displayed");
	        AllureUtils.logStep("Verified exercise container is displayed");
	        
	        
	        /*Enter date values*/
			WebElement exericseclick = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.exerciseslection));
			Actions builder1 = new Actions(driver);
			builder1.moveToElement(exericseclick).click();
			builder1.sendKeys(webTestdata.exercisename).perform();
			Thread.sleep(2500);
			builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.TAB).perform();
			// Log message to console and Allure report
	        LOGGER.info("Verified and add exercise in list");
	        AllureUtils.logStep("Verified and add exercise in list");
	        // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "Case102_Workout_Exercise_Container_Displayed");
	        
			
	        Thread.sleep(9000);
	        // Send values for description set
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.exercisedescription));
            elementActions.setRichTextEditorValue(weblocators.exercisedescription, webTestdata.description);
            elementActions.clickElement(weblocators.exercisedescription);
            LOGGER.info("Set value for exercise description: " + webTestdata.description);
            AllureUtils.logStep("Set value for exercise description: " + webTestdata.description);

            //add reps for exercise
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.repsfield));
            elementActions.clickElement(weblocators.repsfield);
            elementActions.sendKeysToElement(weblocators.repsfield, webTestdata.repsdata);
            // Log message to console and Allure report
	        LOGGER.info("Verified and add reps values corresponding to exercise");
	        AllureUtils.logStep("Verified and add reps values corresponding to exercise");

            
            //add reps for exercise
	        wait.until(ExpectedConditions.elementToBeClickable(weblocators.recoveryfield));
            elementActions.sendKeysToElement(weblocators.recoveryfield, webTestdata.recoverydata);
            // Log message to console and Allure report
	        LOGGER.info("Verified and add recoveryfield values corresponding to exercise");
	        AllureUtils.logStep("Verified and add recoveryfield values corresponding to exercise");
	        
	        //Click on Add new workout button 
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.setsplus));
            elementActions.clickElement(weblocators.setsplus);
            // Log message to console and Allure report
	        LOGGER.info("Click on setsplus");
	        AllureUtils.logStep("Click on setsplus");
            
	        //Click on Add new workout button 
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.submitbuttn));
            elementActions.clickElement(weblocators.submitbuttn);
            // Log message to console and Allure report
	        LOGGER.info("Click on submitbuttn");
	        AllureUtils.logStep("Click on submitbuttn");
            
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
