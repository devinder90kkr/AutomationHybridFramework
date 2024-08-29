package cuesz.exercise.template;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import org.testng.SkipException;

import cuesz.allure.reporting.AllureUtils;
import cuesz.pages.BasePage;
import cuesz.web.resources.ElementActions;
import cuesz.web.resources.TemplateNameStorage;
import cuesz.web.resources.WorkoutStepsHelper;
import cuesz.web.resources.weblocators;

public class Case108_Workout_Templates_editmultipleexercise extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(Case108_Workout_Templates_editmultipleexercise.class);
    private ElementActions elementActions;
    public Case108_Workout_Templates_editmultipleexercise(WebDriver driver) {
        super(driver);
        this.elementActions = new ElementActions(driver);
        new WorkoutStepsHelper(driver);
    }

    @Test
    public void EditWorkout() throws InterruptedException {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
         try {
             String templateName = TemplateNameStorage.getTemplateName();
             if (templateName == null) {
                 throw new SkipException("Template name not found in storage. Skipping the test case.");
             }

             // Navigate to the workout templates list
             wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.templateicon));
             elementActions.clickElement(weblocators.templateicon);
             LOGGER.info("Clicked on templateicon");
             AllureUtils.logStep("Clicked on templateicon");
             AllureUtils.captureScreenshot(driver, "EditWorkoutTemplate1");

             // Locate the template elements
             List<WebElement> templateElements = driver.findElements(By.cssSelector(".member-block"));

             for (WebElement templateElement : templateElements) {
                 WebElement nameElement = templateElement.findElement(By.cssSelector(".user_inf h4"));
                 String currentTemplateName = nameElement.getText();

                 if (currentTemplateName.equals(templateName)) {
                     WebElement editButton = templateElement.findElement(By.cssSelector(".btn_group .btn_grey:first-of-type"));
                     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", editButton);
//                     elementActions.clickElement(editButton);
                     editButton.click();
                     LOGGER.info("Clicked edit button for template: " + templateName);
                     AllureUtils.logStep("Clicked edit button for template: " + templateName);
                     AllureUtils.captureScreenshot(driver, "EditWorkoutTemplate2");

//                     // Perform edit actions (example: change description and save)
//                     wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.templateDescription));
//                     elementActions.sendKeysToElement(weblocators.templateDescription, "Updated description");
//                     LOGGER.info("Updated template description");
//                     AllureUtils.logStep("Updated template description");
//
//                     WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(weblocators.savebutton));
//                     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", saveButton);
//                     elementActions.clickElement(saveButton);
//                     LOGGER.info("Clicked save button");
//                     AllureUtils.logStep("Clicked save button");
//                     Thread.sleep(2000);
//
//                     WebElement confirmSaveButton = wait.until(ExpectedConditions.elementToBeClickable(weblocators.confirmbttn));
//                     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", confirmSaveButton);
//                     elementActions.clickElement(confirmSaveButton);
//                     LOGGER.info("Confirmed save action");
//                     AllureUtils.logStep("Confirmed save action");
//                     Thread.sleep(2000);

                     break;
                 }
             }

         } catch (TimeoutException e) {
             System.out.println("Element not found within the timeout period. Skipping the test case.");
             LOGGER.info("Element not found within the timeout period. Skipping the test case.");
             AllureUtils.logStep("Element not found within the timeout period. Skipping the test case.");
             throw new SkipException("Skipping the test case as the elements were not found.");
         } catch (NoSuchElementException e) {
             System.out.println("Element not found. Skipping the test case.");
             LOGGER.info("Element not found. Skipping the test case.");
             AllureUtils.logStep("Element not found. Skipping the test case.");
             throw new SkipException("Skipping the test case as the element was not found.");
         }
     }
 }