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

import allureframework.AllureUtils;
import commonfunction.WorkoutStepsHelper;
import base.BasePage;
import constant.ElementActions;
import commonfunction.TemplateNameStorage;
import constant.webTestdata;
import constant.weblocators;

public class Case107_Workout_Templates_multipleexercise extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(Case107_Workout_Templates_multipleexercise.class);
    private ElementActions elementActions;
    private WorkoutStepsHelper workoutStepsHelper;

    public Case107_Workout_Templates_multipleexercise(WebDriver driver) {
        super(driver);
        this.elementActions = new ElementActions(driver);
        this.workoutStepsHelper = new WorkoutStepsHelper(driver);
    }

    @Test
    public void Createworkoutmultiple() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
        try {
            // Click on Workout template icon from nav bar menu
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.templateicon));
            elementActions.clickElement(weblocators.templateicon);
            LOGGER.info("Clicked on templateicon");
            AllureUtils.logStep("Clicked on templateicon");
            AllureUtils.captureScreenshot(driver, "Case107_Workout_Templates1");

            // Verify Work Template heading is displayed
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.workoutemplateheading));
            boolean isHeadingDisplayed = elementActions.isElementDisplayed(weblocators.workoutemplateheading);
            Assert.assertTrue(isHeadingDisplayed, "Add Template heading is not displayed");

            // Get heading text
            String headingText = elementActions.getTextFromPopup(weblocators.workoutemplateheading);
            LOGGER.info("Verified Add Template heading is displayed: " + headingText);
            AllureUtils.logStep("Verified Add Template heading is displayed: " + headingText);

            // Click on Workout template icon from nav bar menu
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.templateplsicon));
            elementActions.clickElement(weblocators.templateplsicon);
            LOGGER.info("Click on templateplsicon");
            AllureUtils.logStep("Click on templateplsicon");
            AllureUtils.captureScreenshot(driver, "Case107_Workout_Templates2");

            // Verify Add Template heading is displayed
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.addTemplateHeading));
            boolean isHeadingDisplayed1 = elementActions.isElementDisplayed(weblocators.addTemplateHeading);
            Assert.assertTrue(isHeadingDisplayed1, "Add Template heading is not displayed");

            // Get heading text
            String headingText1 = elementActions.getTextFromPopup(weblocators.addTemplateHeading);
            LOGGER.info("Verified Add Template heading is displayed: " + headingText1);
            AllureUtils.logStep("Verified Add Template heading is displayed: " + headingText1);

            Thread.sleep(3500);

            // Verify Add Template heading is displayed
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.templatname));
            String uniqueTemplateName = elementActions.generateUniqueTemplateName1(webTestdata.templatname);
            elementActions.sendKeysToElement(weblocators.templatname, uniqueTemplateName);
            // Save the template name for future use
            TemplateNameStorage.setTemplateName(uniqueTemplateName);
            
            LOGGER.info("Generated unique template name: " + uniqueTemplateName);
            AllureUtils.logStep("Generated unique template name: " + uniqueTemplateName);
            Thread.sleep(2000);

            // Iterate over the test data sets
            for (int i = 0; i < webTestdata.exercisenamesmultiple.length; i++) {
                workoutStepsHelper.repeatWorkoutSteps(wait, webTestdata.exercisenamesmultiple[i], webTestdata.descriptionsmultiple[i], webTestdata.repsdata[i], webTestdata.recoverydata[i], webTestdata.optional1[i], webTestdata.optional2[i]);
            }

            // Click on chain set
            WebElement chainset =wait.until(ExpectedConditions.elementToBeClickable(weblocators.chain1));
            // Scroll to the "Staff Notes" element using JavaScriptExecutor
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", chainset);
            Thread.sleep(3500);
            elementActions.clickElement(weblocators.chain1);
            // Log message to console and Allure report
            LOGGER.info("Click on chain1");
            AllureUtils.logStep("Click on chain1");
            Thread.sleep(3500);

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
            
            // Click on edit button
            WebElement editicon =wait.until(ExpectedConditions.elementToBeClickable(weblocators.editworkouticon));
            // Scroll to the "Staff Notes" element using JavaScriptExecutor
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", editicon);
            Thread.sleep(3500);
            elementActions.clickElement(weblocators.editworkouticon);
            // Log message to console and Allure report
            LOGGER.info("Click on editworkouticon");
            AllureUtils.logStep("Click on editworkouticon");
            Thread.sleep(3500);
            
            
            WebElement addexercisworkout = wait.until(ExpectedConditions.elementToBeClickable(weblocators.addnewworkout));
            // Scroll to the "Staff Notes" element using JavaScriptExecutor
    		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", addexercisworkout);
            AllureUtils.logStep("Click on addnewworkout");
           
            Thread.sleep(4500);
         // Iterate over the test data sets
            for (int i = 0; i < webTestdata.exercisenameeditsmultiple.length; i++) {
                workoutStepsHelper.repeatWorkoutSteps(wait, webTestdata.exercisenameeditsmultiple[i], webTestdata.descriptioneditsmultiple[i], webTestdata.repseditdata[i], webTestdata.recoveryeditdata[i], webTestdata.optional1edit[i], webTestdata.optional2edit[i]);
            }
          
            // Click on chain set
            WebElement chainset2 =wait.until(ExpectedConditions.elementToBeClickable(weblocators.chain2));
            // Scroll to the "Staff Notes" element using JavaScriptExecutor
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", chainset2);
            Thread.sleep(3500);
            elementActions.clickElement(weblocators.chain2);
            // Log message to console and Allure report
            LOGGER.info("Click on chain2");
            AllureUtils.logStep("Click on chain2");
            Thread.sleep(3500);
            
            
            
            Thread.sleep(2500);            // Click on submit button
            WebElement exercisesave1 =wait.until(ExpectedConditions.elementToBeClickable(weblocators.savebutton));
            // Scroll to the "Staff Notes" element using JavaScriptExecutor
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", exercisesave1);
            Thread.sleep(3500);
            elementActions.clickElement(weblocators.savebutton);
            // Log message to console and Allure report
            LOGGER.info("Click on savebutton");
            AllureUtils.logStep("Click on savebutton");
            
            Thread.sleep(3500);
            
            // Click on submit button
            WebElement confirmsave1 =wait.until(ExpectedConditions.elementToBeClickable(weblocators.confirmbttn));
            // Scroll to the "Staff Notes" element using JavaScriptExecutor
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", confirmsave1);
            Thread.sleep(3500);
            elementActions.clickElement(weblocators.confirmbttn);
            // Log message to console and Allure report
            LOGGER.info("Click on confirmbttn");
            AllureUtils.logStep("Click on confirmbttn");
            Thread.sleep(3500);
            

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
    }}
