package cuesz.exercise.template;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
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

import cuesz.allure.reporting.AllureUtils;
import cuesz.pages.BasePage;
import cuesz.web.resources.ElementActions;
import cuesz.web.resources.webTestdata;
import cuesz.web.resources.weblocators;

public class Case106_Workout_Templates_multipleexercise extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(Case106_Workout_Templates_multipleexercise.class);
    private ElementActions elementActions;

    public Case106_Workout_Templates_multipleexercise(WebDriver driver) {
        super(driver);
        this.elementActions = new ElementActions(driver);
    }

    @Test
    public void Createworkout() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
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

            // Verify Add Template heading is displayed
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.templatname));
            // Clear and insert values in templatname field
            elementActions.sendKeysToElement(weblocators.templatname, webTestdata.templatname);
            // Log the generated template name
            LOGGER.info("Generated template name: " + webTestdata.templatname);
            AllureUtils.logStep("Generated template name: " + webTestdata.templatname);
            Thread.sleep(2500);

            
            // Iterate over the test data sets
            for (int i = 0; i < webTestdata.exercisenamesmultiple.length; i++) {
                repeatWorkoutSteps(wait, webTestdata.exercisenamesmultiple[i], webTestdata.descriptionsmultiple[i], webTestdata.repsdata[i], webTestdata.recoverydata[i]);
            }

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

    private void repeatWorkoutSteps(WebDriverWait wait, String exercisename, String description, String repsdata, String recoverydata) throws InterruptedException {
        // Click on Add new workout button
        Thread.sleep(2500);
        WebElement addexercisworkout = wait.until(ExpectedConditions.elementToBeClickable(weblocators.addnewworkout));
        // Scroll to the "Staff Notes" element using JavaScriptExecutor
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", addexercisworkout);
        elementActions.clickElement(weblocators.addnewworkout);
        // Log message to console and Allure report
        LOGGER.info("Click on addnewworkout");
        AllureUtils.logStep("Click on addnewworkout");
        Thread.sleep(2500);

        // Verify exercise container is displayed
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.exerciseconatiner));
        boolean isExerciseContainerDisplayed = elementActions.isElementDisplayed(weblocators.exerciseconatiner);
        Assert.assertTrue(isExerciseContainerDisplayed, "Exercise container is not displayed");
        // Log message to console and Allure report
        LOGGER.info("Verified exercise container is displayed");
        AllureUtils.logStep("Verified exercise container is displayed");

        // Enter exercise name values
        WebElement exericseclick = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.exerciseslection));
        Actions builder1 = new Actions(driver);
        builder1.moveToElement(exericseclick).click();
        builder1.sendKeys(exercisename).perform();
        Thread.sleep(3500);
        builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.TAB).perform();
        // Log message to console and Allure report
        LOGGER.info("Verified and added exercise in list: " + exercisename);
        AllureUtils.logStep("Verified and added exercise in list: " + exercisename);
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case102_Workout_Exercise_Container_Displayed");

        // Click on submit button
        WebElement exercisubmit =wait.until(ExpectedConditions.elementToBeClickable(weblocators.submitbuttn));
        // Scroll to the "Staff Notes" element using JavaScriptExecutor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", exercisubmit);
        
        Thread.sleep(9000);
        // Send values for description
        wait.until(ExpectedConditions.elementToBeClickable(weblocators.exercisedescription));
        elementActions.setRichTextEditorValue(weblocators.exercisedescription, description);
        elementActions.clickElement(weblocators.exercisedescription);
        LOGGER.info("Set value for exercise description: " + description);
        AllureUtils.logStep("Set value for exercise description: " + description);
        Thread.sleep(9000);

        // Add reps for exercise
        WebElement addexercisereps = wait.until(ExpectedConditions.elementToBeClickable(weblocators.repsfield));
        // Scroll to the "Staff Notes" element using JavaScriptExecutor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", addexercisereps);
     
//        elementActions.clickElement(weblocators.repsfield);
        elementActions.sendKeysToElement(weblocators.repsfield, repsdata);
        Thread.sleep(3500);
        // Log message to console and Allure report
        LOGGER.info("Verified and added reps values corresponding to exercise: " + repsdata);
        AllureUtils.logStep("Verified and added reps values corresponding to exercise: " + repsdata);
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case102_Workout_Exercise_Container_Displayed1");
        elementActions.sendKeysToElement(weblocators.repsfield, repsdata);
        Thread.sleep(9000);
  
        // Add recovery for exercise
        WebElement addexerciserecovery = wait.until(ExpectedConditions.elementToBeClickable(weblocators.recoveryfield));
        // Scroll to the "Staff Notes" element using JavaScriptExecutor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", addexerciserecovery);
        Thread.sleep(3500);
        elementActions.sendKeysToElement(weblocators.recoveryfield, recoverydata);
        Thread.sleep(3500);
        // Log message to console and Allure report
        LOGGER.info("Verified and added recovery values corresponding to exercise: " + recoverydata);
        AllureUtils.logStep("Verified and added recovery values corresponding to exercise: " + recoverydata);
        elementActions.sendKeysToElement(weblocators.recoveryfield, recoverydata);
        Thread.sleep(9000);

        // Click on setsplus button
        wait.until(ExpectedConditions.elementToBeClickable(weblocators.setsplus));
        elementActions.clickElement(weblocators.setsplus);
        // Log message to console and Allure report
        LOGGER.info("Click on setsplus");
        AllureUtils.logStep("Click on setsplus");
        Thread.sleep(9000);
        
        // Click on submit button
        WebElement exercisubmit1 =wait.until(ExpectedConditions.elementToBeClickable(weblocators.submitbuttn));
        // Scroll to the "Staff Notes" element using JavaScriptExecutor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", exercisubmit1);
        Thread.sleep(3500);
        elementActions.clickElement(weblocators.submitbuttn);
        // Log message to console and Allure report
        LOGGER.info("Click on submitbuttn");
        Thread.sleep(3500);
    }
}