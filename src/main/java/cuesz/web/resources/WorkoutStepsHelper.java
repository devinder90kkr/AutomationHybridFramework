package cuesz.web.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import cuesz.allure.reporting.AllureUtils;

public class WorkoutStepsHelper {
	  private static final Logger LOGGER = LoggerFactory.getLogger(WorkoutStepsHelper.class);
    private WebDriver driver;
    private ElementActions elementActions;

    public WorkoutStepsHelper(WebDriver driver) {
        this.driver = driver;
        this.elementActions = new ElementActions(driver);
    }

    public void repeatWorkoutSteps(WebDriverWait wait, String exercisename, String description, String repsdata, String recoverydata, String optional1, String optional2) throws InterruptedException {

    	Thread.sleep(3500);
        WebElement addexercisworkout = wait.until(ExpectedConditions.elementToBeClickable(weblocators.addnewworkout));
        // Scroll to the "Staff Notes" element using JavaScriptExecutor
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", addexercisworkout);
        elementActions.clickElement(weblocators.addnewworkout);
        AllureUtils.logStep("Click on addnewworkout");
        LOGGER.info("Click on addnewworkout");
        Thread.sleep(4500);

        // Verify exercise container is displayed
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.exerciseconatiner));
        boolean isExerciseContainerDisplayed = elementActions.isElementDisplayed(weblocators.exerciseconatiner);
        Assert.assertTrue(isExerciseContainerDisplayed, "Exercise container is not displayed");
        AllureUtils.logStep("Verified exercise container is displayed");
        LOGGER.info("Verified exercise container is displayed");
        Thread.sleep(5500);
       
        // Enter exercise name values
        WebElement exericseclick = wait.until(ExpectedConditions.elementToBeClickable(weblocators.exerciseslection));
        Actions builder1 = new Actions(driver);
        builder1.moveToElement(exericseclick).click();
        builder1.sendKeys(exercisename).perform();
        Thread.sleep(3500);
        builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.TAB).perform();
        AllureUtils.logStep("Verified and added exercise in list: " + exercisename);
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case102_Workout_Exercise_Container_Displayed");
        LOGGER.info("Verified and added exercise in list: " + exercisename);
      
        Thread.sleep(5500);
        // Click on submit button
        WebElement exercisubmit =wait.until(ExpectedConditions.elementToBeClickable(weblocators.submitbuttn));
        // Scroll to the "Staff Notes" element using JavaScriptExecutor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", exercisubmit);
        LOGGER.info("Scroll down to submitbuttn");
        AllureUtils.logStep("Scroll down to submitbuttn");
        
        Thread.sleep(9000);
        // Send values for description
        wait.until(ExpectedConditions.elementToBeClickable(weblocators.exercisedescription));
        elementActions.setRichTextEditorValue(weblocators.exercisedescription, description);
        elementActions.clickElement(weblocators.exercisedescription);
        AllureUtils.logStep("Set value for exercise description: " + description);
        LOGGER.info("Set value for exercise description: " + description);
        Thread.sleep(9000);

        // Add reps for exercise
        WebElement addexercisereps = wait.until(ExpectedConditions.elementToBeClickable(weblocators.repsfield));
        // Scroll to the "Staff Notes" element using JavaScriptExecutor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", addexercisereps);
        elementActions.sendKeysToElement(weblocators.repsfield, repsdata);
        Thread.sleep(3500);
        AllureUtils.logStep("Verified and added reps values corresponding to exercise: " + repsdata);
        LOGGER.info("Verified and added reps values corresponding to exercise: " + repsdata);
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case102_Workout_Exercise_Container_Displayed1");
        elementActions.sendKeysToElement(weblocators.repsfield, repsdata);
        AllureUtils.logStep("Enter values for  repsdata");
        LOGGER.info("Enter values for  repsdata");
        
        Thread.sleep(9000);
  
        // Add recovery for exercise
        WebElement addexerciserecovery = wait.until(ExpectedConditions.elementToBeClickable(weblocators.recoveryfield));
        // Scroll to the "Staff Notes" element using JavaScriptExecutor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", addexerciserecovery);
        LOGGER.info("Scroll down to recoveryfield");
        AllureUtils.logStep("Scroll down to recoveryfield");
        Thread.sleep(3500);
        elementActions.sendKeysToElement(weblocators.recoveryfield, recoverydata);
        Thread.sleep(3500);
        AllureUtils.logStep("Verified and added recovery values corresponding to exercise: " + recoverydata);
        LOGGER.info("Verified and added recovery values corresponding to exercise: " + recoverydata);
        elementActions.sendKeysToElement(weblocators.recoveryfield, recoverydata);
        Thread.sleep(9000);

        // Add optional values for exercise
        WebElement addoptional1 = wait.until(ExpectedConditions.elementToBeClickable(weblocators.optional1));
        // Scroll to the "Staff Notes" element using JavaScriptExecutor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", addoptional1);
        LOGGER.info("Scroll down to optional1");
        AllureUtils.logStep("Scroll down to optional1");
        Thread.sleep(3500);
        elementActions.performActionsOnElement(weblocators.optional1, webTestdata.optional1value);
        AllureUtils.logStep("Verified and added reps values corresponding to exercise: " + webTestdata.optional1value);
        Thread.sleep(3500);
        elementActions.sendKeysToElement(weblocators.Optionaltextfield, optional1);
        AllureUtils.logStep("Verified and added reps values corresponding to exercise: " + optional1);
        
        
        // Add optional values for exercise
        WebElement addoptional2 = wait.until(ExpectedConditions.elementToBeClickable(weblocators.optional1));
        // Scroll to the "Staff Notes" element using JavaScriptExecutor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", addoptional2);
        Thread.sleep(3500);
        elementActions.performActionsOnElement(weblocators.optional1, webTestdata.optionalvalue2);
        AllureUtils.logStep("Verified and added reps values corresponding to exercise: " + webTestdata.optionalvalue2);
        Thread.sleep(3500);
        elementActions.sendKeysToElement(weblocators.optionaltextfield2, optional2);
        AllureUtils.logStep("Verified and added reps values corresponding to exercise: " + optional2);
        
        
        // Click on setsplus button
        wait.until(ExpectedConditions.elementToBeClickable(weblocators.setsplus));
        elementActions.clickElement(weblocators.setsplus);
        AllureUtils.logStep("Click on setsplus");
        Thread.sleep(9000);
        
        // Click on submit button
        WebElement exercisubmit1 =wait.until(ExpectedConditions.elementToBeClickable(weblocators.submitbuttn));
        // Scroll to the "Staff Notes" element using JavaScriptExecutor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", exercisubmit1);
        Thread.sleep(3500);
        elementActions.clickElement(weblocators.submitbuttn);
        LOGGER.info("Click on submitbuttn");
        AllureUtils.logStep("Click on submitbuttn");
        Thread.sleep(3500);
    }
}


//package cuesz.web.resources;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.testng.Assert;
//
//import cuesz.allure.reporting.AllureUtils;
//
//public class WorkoutStepsHelper {
//    private static final Logger LOGGER = LoggerFactory.getLogger(WorkoutStepsHelper.class);
//    private WebDriver driver;
//    private ElementActions elementActions;
//
//    public WorkoutStepsHelper(WebDriver driver) {
//        this.driver = driver;
//        this.elementActions = new ElementActions(driver);
//    }
//
//    public void repeatWorkoutSteps(WebDriverWait wait, String exercisename, String description, String repsdata, String recoverydata, String optional1, String optional2) throws InterruptedException {
//        Thread.sleep(3500);
//        WebElement addexercisworkout = wait.until(ExpectedConditions.elementToBeClickable(weblocators.addnewworkout));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", addexercisworkout);
//        elementActions.clickElement(weblocators.addnewworkout);
//        AllureUtils.logStep("Click on addnewworkout");
//        LOGGER.info("Click on addnewworkout");
//        Thread.sleep(4500);
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.exerciseconatiner));
//        boolean isExerciseContainerDisplayed = elementActions.isElementDisplayed(weblocators.exerciseconatiner);
//        Assert.assertTrue(isExerciseContainerDisplayed, "Exercise container is not displayed");
//        AllureUtils.logStep("Verified exercise container is displayed");
//        LOGGER.info("Verified exercise container is displayed");
//        Thread.sleep(5500);
//
//        WebElement exericseclick = wait.until(ExpectedConditions.elementToBeClickable(weblocators.exerciseslection));
//        Actions builder1 = new Actions(driver);
//        builder1.moveToElement(exericseclick).click();
//        builder1.sendKeys(exercisename).perform();
//        Thread.sleep(3500);
//        builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.TAB).perform();
//        AllureUtils.logStep("Verified and added exercise in list: " + exercisename);
//        AllureUtils.captureScreenshot(driver, "Case102_Workout_Exercise_Container_Displayed");
//        LOGGER.info("Verified and added exercise in list: " + exercisename);
//        Thread.sleep(5500);
//
//        WebElement exercisubmit = wait.until(ExpectedConditions.elementToBeClickable(weblocators.submitbuttn));
//        if (!elementActions.isElementDisplayed(weblocators.exercisedescription)) {
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", exercisubmit);
//            LOGGER.info("Scroll down to submitbuttn");
//            AllureUtils.logStep("Scroll down to submitbuttn");
//        }
//
//        Thread.sleep(9000);
//        wait.until(ExpectedConditions.elementToBeClickable(weblocators.exercisedescription));
//        elementActions.setRichTextEditorValue(weblocators.exercisedescription, description);
//        elementActions.clickElement(weblocators.exercisedescription);
//        AllureUtils.logStep("Set value for exercise description: " + description);
//        LOGGER.info("Set value for exercise description: " + description);
//        Thread.sleep(9000);
//
//        WebElement addexercisereps = wait.until(ExpectedConditions.elementToBeClickable(weblocators.repsfield));
//        if (!elementActions.isElementDisplayed(weblocators.exercisedescription)) {
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", addexercisereps);
//        }
//        elementActions.sendKeysToElement(weblocators.repsfield, repsdata);
//        Thread.sleep(3500);
//        AllureUtils.logStep("Verified and added reps values corresponding to exercise: " + repsdata);
//        LOGGER.info("Verified and added reps values corresponding to exercise: " + repsdata);
//        AllureUtils.captureScreenshot(driver, "Case102_Workout_Exercise_Container_Displayed1");
//        elementActions.sendKeysToElement(weblocators.repsfield, repsdata);
//        AllureUtils.logStep("Enter values for  repsdata");
//        LOGGER.info("Enter values for  repsdata");
//        Thread.sleep(9000);
//
//        WebElement addexerciserecovery = wait.until(ExpectedConditions.elementToBeClickable(weblocators.recoveryfield));
//        if (!elementActions.isElementDisplayed(weblocators.exercisedescription)) {
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", addexerciserecovery);
//            LOGGER.info("Scroll down to recoveryfield");
//            AllureUtils.logStep("Scroll down to recoveryfield");
//        }
//        elementActions.sendKeysToElement(weblocators.recoveryfield, recoverydata);
//        Thread.sleep(3500);
//        AllureUtils.logStep("Verified and added recovery values corresponding to exercise: " + recoverydata);
//        LOGGER.info("Verified and added recovery values corresponding to exercise: " + recoverydata);
//        elementActions.sendKeysToElement(weblocators.recoveryfield, recoverydata);
//        Thread.sleep(9000);
//
//        WebElement addoptional1 = wait.until(ExpectedConditions.elementToBeClickable(weblocators.optional1));
//        if (!elementActions.isElementDisplayed(weblocators.exercisedescription)) {
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", addoptional1);
//            LOGGER.info("Scroll down to optional1");
//            AllureUtils.logStep("Scroll down to optional1");
//        }
//        elementActions.performActionsOnElement(weblocators.optional1, webTestdata.optional1value);
//        AllureUtils.logStep("Verified and added reps values corresponding to exercise: " + webTestdata.optional1value);
//        Thread.sleep(3500);
//        elementActions.sendKeysToElement(weblocators.Optionaltextfield, optional1);
//        AllureUtils.logStep("Verified and added reps values corresponding to exercise: " + optional1);
//
//        WebElement addoptional2 = wait.until(ExpectedConditions.elementToBeClickable(weblocators.optional1));
//        if (!elementActions.isElementDisplayed(weblocators.exercisedescription)) {
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", addoptional2);
//        }
//        Thread.sleep(3500);
//        elementActions.performActionsOnElement(weblocators.optional1, webTestdata.optionalvalue2);
//        AllureUtils.logStep("Verified and added reps values corresponding to exercise: " + webTestdata.optionalvalue2);
//        Thread.sleep(3500);
//        elementActions.sendKeysToElement(weblocators.optionaltextfield2, optional2);
//        AllureUtils.logStep("Verified and added reps values corresponding to exercise: " + optional2);
//
//        wait.until(ExpectedConditions.elementToBeClickable(weblocators.setsplus));
//        elementActions.clickElement(weblocators.setsplus);
//        AllureUtils.logStep("Click on setsplus");
//        Thread.sleep(9000);
//
//        WebElement exercisubmit1 = wait.until(ExpectedConditions.elementToBeClickable(weblocators.submitbuttn));
//        if (!elementActions.isElementDisplayed(weblocators.exercisedescription)) {
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", exercisubmit1);
//        }
//        Thread.sleep(3500);
//        elementActions.clickElement(weblocators.submitbuttn);
//        LOGGER.info("Click on submitbuttn");
//        AllureUtils.logStep("Click on submitbuttn");
//        Thread.sleep(3500);
//    }
//}
//
