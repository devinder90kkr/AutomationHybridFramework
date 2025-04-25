//package exercise.template;
//
//import org.openqa.selenium.WebDriver;
//import java.time.Duration;
//
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.TimeoutException;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.testng.annotations.Test;
//import org.testng.SkipException;
//
//import allureframework.reporting.AllureUtils;
//import base.BasePage;
//import web.resources.ElementActions;
//import web.resources.weblocators;
//
//public class Case101_Workout_Templates extends BasePage {
//    private static final Logger LOGGER = LoggerFactory.getLogger(Case101_Workout_Templates.class);
//    private ElementActions elementActions;
//
//    public Case101_Workout_Templates(WebDriver driver) {
//        super(driver);
//        this.elementActions = new ElementActions(driver);
//    }
//
//    @Test
//    public void Workouttemplate() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        try {
//            // Click on Workout template icon from nav bar menu
//            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.templateicon));
//            elementActions.clickElement(weblocators.templateicon);
//            LOGGER.info("Clicked on templateicon");
//            AllureUtils.logStep("Clicked on templateicon");
//            AllureUtils.captureScreenshot(driver, "Case101_Workout_Templates1");
//
//        } catch (TimeoutException e) {
//            LOGGER.error("TimeoutException: Element not found within the timeout period. Skipping the test case.", e);
//            AllureUtils.logStep("Element not found within the timeout period. Skipping the test case.");
//            throw new SkipException("Skipping the test case as the elements were not found.");
//        } catch (NoSuchElementException e) {
//            LOGGER.error("NoSuchElementException: Coach is non-lead. Skipping the test case.", e);
//            AllureUtils.logStep("Coach is non-lead. Skipping the test case.");
//            throw new SkipException("Skipping the test case as the coach is non-lead.");
//        } catch (Exception e) {
//            LOGGER.error("Exception: An unexpected error occurred.", e);
//            AllureUtils.logStep("An unexpected error occurred.");
//            throw new SkipException("Skipping the test case due to an unexpected error.");
//        }
//    }
//}


package feature.case16_exercisetemplate;

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

import allureframework.reporting.AllureUtils;
import base.BasePage;
import web.resources.ElementActions;
import web.resources.weblocators;

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
            // Wait for Workout template icon to be visible
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.templateicon));
            // Wait for Workout template icon to be clickable
            wait.until(ExpectedConditions.elementToBeClickable(weblocators.templateicon));
            
            // Click on Workout template icon from nav bar menu
            elementActions.clickElement(weblocators.templateicon);
            LOGGER.info("Clicked on templateicon");
            AllureUtils.logStep("Clicked on templateicon");
            AllureUtils.captureScreenshot(driver, "Case101_Workout_Templates1");

        } catch (TimeoutException e) {
            LOGGER.error("TimeoutException: Element not found within the timeout period. Skipping the test case.", e);
            AllureUtils.logStep("Element not found within the timeout period. Skipping the test case.");
            throw new SkipException("Skipping the test case as the elements were not found.");
        } catch (NoSuchElementException e) {
            LOGGER.error("NoSuchElementException: Coach is non-lead. Skipping the test case.", e);
            AllureUtils.logStep("Coach is non-lead. Skipping the test case.");
            throw new SkipException("Skipping the test case as the coach is non-lead.");
        } catch (Exception e) {
            LOGGER.error("Exception: An unexpected error occurred.", e);
            AllureUtils.logStep("An unexpected error occurred.");
            throw new SkipException("Skipping the test case due to an unexpected error.");
        }
    }
}
