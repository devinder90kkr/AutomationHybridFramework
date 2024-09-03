package cuesz.exercise.template;

import org.openqa.selenium.WebDriver;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;
import cuesz.web.resources.ElementActions;
import cuesz.web.resources.webTestdata;
import cuesz.web.resources.weblocators;

public class Case108_Workout_Templates_assigntomember extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(Case108_Workout_Templates_assigntomember.class);
    SeleniumUtils utils = new SeleniumUtils(driver);
    private ElementActions elementActions;
    
    public Case108_Workout_Templates_assigntomember(WebDriver driver) {
        super(driver);
        this.elementActions = new ElementActions(driver);
    }

    @Test
    public void asignlp1() throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
      
        	
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
			    weblocators.editprogram
			);
			LOGGER.info("Clicked on click on primary and edit program");
			AllureUtils.logStep("Clicked on click on primary and edit program");
			AllureUtils.captureScreenshot(driver, "Case108_Workout_Templates_assigntomember1");
			
			// Enter values for each field using different descriptions
	        elementActions.sendKeysToElement(weblocators.primaryobjective, webTestdata.descriptionForPrimaryObjective);
	        LOGGER.info("Entered description for primary objective");
	        AllureUtils.logStep("Entered description for primary objective");
	        AllureUtils.captureScreenshot(driver, "Case108_Workout_Templates_assigntomember3");

	        elementActions.sendKeysToElement(weblocators.primarynotes, webTestdata.descriptionForPrimaryNotes);
	        LOGGER.info("Entered description for primary notes");
	        AllureUtils.logStep("Entered description for primary notes");
	        AllureUtils.captureScreenshot(driver, "Case108_Workout_Templates_assigntomember4");

	        elementActions.sendKeysToElement(weblocators.secondaryobjective, webTestdata.descriptionForSecondaryObjective);
	        LOGGER.info("Entered description for secondary objective");
	        AllureUtils.logStep("Entered description for secondary objective");
	        AllureUtils.captureScreenshot(driver, "Case108_Workout_Templates_assigntomember5");

	        elementActions.sendKeysToElement(weblocators.secondarynotes, webTestdata.descriptionForSecondaryNotes);
	        LOGGER.info("Entered description for secondary notes");
	        AllureUtils.logStep("Entered description for secondary notes");
	        AllureUtils.captureScreenshot(driver, "Case108_Workout_Templates_assigntomember6");

	        Thread.sleep(5500);
    }
    
}