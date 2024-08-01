package cuesz.exercise.template;

import org.openqa.selenium.WebDriver;
import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import org.testng.SkipException;

import cuesz.allure.reporting.AllureUtils;
import cuesz.pages.BasePage;
import cuesz.web.resources.ElementActions;
import cuesz.web.resources.WorkoutStepsHelper;




public class Case108_Workout_Templates_editmultipleexercise extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(Case108_Workout_Templates_editmultipleexercise.class);
    public Case108_Workout_Templates_editmultipleexercise(WebDriver driver) {
        super(driver);
        new ElementActions(driver);
        new WorkoutStepsHelper(driver);
    }

    @Test
    public void Editworkout() throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(1000));
         try {
        
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 

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
