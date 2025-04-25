package feature.case16_exercisetemplate;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import allureframework.reporting.AllureUtils;
import commonfunction.workoutassignhelper;
import base.BasePage;
import utils.SeleniumUtils;
import constant.ElementActions;
import constant.webTestdata;
import constant.weblocators;

public class Case108_Workout_Templates_assigntomember extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(Case108_Workout_Templates_assigntomember.class);
    SeleniumUtils utils = new SeleniumUtils(driver);
    private ElementActions elementActions;
    private workoutassignhelper workoutStepsHelper;
    
    public Case108_Workout_Templates_assigntomember(WebDriver driver) {
        super(driver);
        this.elementActions = new ElementActions(driver);
        this.workoutStepsHelper = new workoutassignhelper(driver);
    }

    @Test
//    public void asignlp1() throws InterruptedException {
    public void asignlp1() throws InterruptedException {
	
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2500));
      
        	
        	 utils.clickMembersummary();
             utils.waitForMilliseconds(2000);
             utils.enterSearchText();
             utils.clickMembername();
	
             Thread.sleep(2500);
			// Use the new method with locators from weblocators class
			elementActions.clickElementUsingOr(
			    weblocators.assignlp1,
			    weblocators.editassignlp1,
			    weblocators.editassignlp1draft
			);
			LOGGER.info("Clicked on assignLp1 or editassignLp1 or editassignlp1draft");
			AllureUtils.logStep("Clicked on assignLp1 or editassignLp1 or editassignlp1draft");
			AllureUtils.captureScreenshot(driver, "Case108_Workout_Templates_assigntomember1");

			Thread.sleep(2500);
			// Use the new method with locators from weblocators class
			elementActions.clickElementUsingOr(
			    weblocators.primaryobjective,
			    weblocators.draftoption
			);
			LOGGER.info("Clicked on click on primary and edit program");
			AllureUtils.logStep("Clicked on click on primary and edit program");
			AllureUtils.captureScreenshot(driver, "Case108_Workout_Templates_assigntomember1");
			
			
//			wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.primaryobjective));
//			// Enter values for each field using different descriptions
//	        elementActions.sendKeysToElement(weblocators.primaryobjective, webTestdata.descriptionForPrimaryObjective);
//	        LOGGER.info("Entered description for primary objective");
//	        AllureUtils.logStep("Entered description for primary objective");
//	        
//	        
//	        WebElement PrimaryObjectives = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.primarynotes));
//	        // Scroll to the "Staff Notes" element using JavaScriptExecutor
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", PrimaryObjectives);
//	        elementActions.sendKeysToElement(weblocators.primarynotes, webTestdata.descriptionForPrimaryNotes);
//	        LOGGER.info("Entered description for primary notes");
//	        AllureUtils.logStep("Entered description for primary notes");
//	        AllureUtils.captureScreenshot(driver, "Case108_Workout_Templates_assigntomember4");
//	        
//	        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.secondaryobjective));
//	        elementActions.sendKeysToElement(weblocators.secondaryobjective, webTestdata.descriptionForSecondaryObjective);
//	        LOGGER.info("Entered description for secondary objective");
//	        AllureUtils.logStep("Entered description for secondary objective");
//	        
//	        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.secondarynotes));
//	        elementActions.sendKeysToElement(weblocators.secondarynotes, webTestdata.descriptionForSecondaryNotes);
//	        LOGGER.info("Entered description for secondary notes");
//	        AllureUtils.logStep("Entered description for secondary notes");
//	        AllureUtils.captureScreenshot(driver, "Case108_Workout_Templates_assigntomember6");
//	        
//	        WebElement injuries = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.injuries));
//	        // Scroll to the "Staff Notes" element using JavaScriptExecutor
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", injuries);
//	        elementActions.sendKeysToElement(weblocators.injuries, webTestdata.descriptionForInjuries);
//	        LOGGER.info("Entered description for injuries");
//	        AllureUtils.logStep("Entered description for injuries");
//	        
//	        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.perfectlikedislike));
//	        elementActions.sendKeysToElement(weblocators.perfectlikedislike, webTestdata.descriptionForPerfectlikes);
//	        LOGGER.info("Entered description for perfectlikedislike");
//	        AllureUtils.logStep("Entered description for perfectlikedislike");
//	        
//	        WebElement motiongraph = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.motiongraph));
//	        // Scroll to the "Staff Notes" element using JavaScriptExecutor
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", motiongraph);
//	        elementActions.sendKeysToElement(weblocators.motiongraph, webTestdata.descriptionForMotionAssessmentGraph);
//	        LOGGER.info("Entered description for motiongraph");
//	        AllureUtils.logStep("Entered description for motiongraph");
//	        
//	        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.Inablities));
//	        elementActions.sendKeysToElement(weblocators.Inablities, webTestdata.descriptionForInablitiesGraph);
//	        LOGGER.info("Entered description for Inablities");
//	        AllureUtils.logStep("Entered description for Inablities");
//	        
//	        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.gymequipment));
//	        elementActions.sendKeysToElement(weblocators.gymequipment, webTestdata.descriptionForGymEquipment);
//	        LOGGER.info("Entered description for Inablities");
//	        AllureUtils.logStep("Entered description for Inablities");
//	        
//	        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.newprogram));
//	        elementActions.sendKeysToElement(weblocators.newprogram, webTestdata.descriptionForNewProgram);
//	        LOGGER.info("Entered description for Inablities");
//	        AllureUtils.logStep("Entered description for Inablities");
	        
//	        WebElement addexercisworkout = wait.until(ExpectedConditions.elementToBeClickable(weblocators.addnewworkout));
//	        // Scroll to the "Staff Notes" element using JavaScriptExecutor
//			 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", addexercisworkout);
			 
			 Thread.sleep(2500);
			// Iterate over the test data sets
	            for (int i = 0; i < webTestdata.exercisenamesmultiple.length; i++) {
	                workoutStepsHelper.repeatWorkoutSteps(wait, webTestdata.exercisenamesmultiple[i], webTestdata.descriptionsmultiple[i], webTestdata.repsdata[i], webTestdata.recoverydata[i], webTestdata.optional1[i], webTestdata.optional2[i]);
	            }
			

            // Click on submit button
            WebElement publishbtn =wait.until(ExpectedConditions.elementToBeClickable(weblocators.publishoption));
            // Scroll to the "Staff Notes" element using JavaScriptExecutor
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", publishbtn);
            Thread.sleep(3500);
            elementActions.clickElement(weblocators.publishoption);
            // Log message to console and Allure report
            LOGGER.info("Click on publishoption");
            AllureUtils.logStep("Click on publishoption");    
		        
	       
	        
	        Thread.sleep(5500);
    }
    
}