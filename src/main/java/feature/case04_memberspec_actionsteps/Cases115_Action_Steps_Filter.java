package feature.case04_memberspec_actionsteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import allureframework.reporting.AllureUtils;
import commonfunction.functions.DateGenerator;
import base.BasePage;
import constant.ElementActions;
import constant.webTestdata;
import constant.weblocators;

public class Cases115_Action_Steps_Filter extends BasePage {

    private static final Logger LOGGER = LoggerFactory.getLogger(Cases115_Action_Steps_Filter.class);
    private ElementActions elementActions;
    public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date

    public Cases115_Action_Steps_Filter(WebDriver driver) {
        super(driver);
        this.elementActions = new ElementActions(driver);
    }

    @Test
    public void filternotes() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(500));
        
        
        // Click on filter icon
      wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.filtericon));
      elementActions.clickElement(weblocators.filtericon);
      LOGGER.info("Clicked on filtericon");
      AllureUtils.logStep("Clicked on filtericon");
      AllureUtils.captureScreenshot(driver, "Cases115_Action_Steps_Filter");

        
        // Define filter types and views to be selected
        By[] filterTypes = {weblocators.activetype, weblocators.completedtype, weblocators.alltype};
        By[] viewTypes = {weblocators.personaltype, weblocators.shareview, weblocators.allviewtype};

        // Loop through each filter type
        for (By filterType : filterTypes) {
            
        	// Add a short wait to allow UI updates to reflect
            Thread.sleep(3500);
        	// Click on action button
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.actionbuton));
            elementActions.clickElement(weblocators.actionbuton);
            LOGGER.info("Clicked on actionbuton");
            AllureUtils.logStep("Clicked on actionbuton");

         // Add a short wait to allow UI updates to reflect
            Thread.sleep(2000);
            // Click on filter icon
            elementActions.clickElement(weblocators.filtericon);
            LOGGER.info("Clicked on filtericon");
            AllureUtils.logStep("Clicked on filtericon");

         // Add a short wait to allow UI updates to reflect
            Thread.sleep(2000);
            // Click on the current filter type
            elementActions.clickElement(filterType);
            LOGGER.info("Clicked on filter type: " + filterType);
            AllureUtils.logStep("Clicked on filter type: " + filterType);
            
            // Loop through each view type within the current filter type
            for (By viewType : viewTypes) {
            	// Add a short wait to allow UI updates to reflect
            	 Thread.sleep(2000);
                // Click on action button
                wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.actionbuton));
                elementActions.clickElement(weblocators.actionbuton);
                LOGGER.info("Clicked on actionbuton");
                AllureUtils.logStep("Clicked on actionbuton");

             // Add a short wait to allow UI updates to reflect
                Thread.sleep(2000);
                // Click on filter icon
                elementActions.clickElement(weblocators.filtericon);
                LOGGER.info("Clicked on filtericon");
                AllureUtils.logStep("Clicked on filtericon");

             // Add a short wait to allow UI updates to reflect
                Thread.sleep(2000);
                // Click on the current view type
                elementActions.clickElement(viewType);
                LOGGER.info("Clicked on view type: " + viewType);
                AllureUtils.logStep("Clicked on view type: " + viewType);
                
                // Add a short wait to allow UI updates to reflect
                Thread.sleep(3500);
            }
        }
        // Click on date field
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.datefilter));
        elementActions.performActionsOnElement(weblocators.datefilter, webTestdata.dateoption1);
        LOGGER.info("Clicked on datefilter");
        AllureUtils.logStep("Clicked on datefilter");
        
        
        elementActions.clickElement(weblocators.actionbuton);
        LOGGER.info("Clicked on actionbuton");
        AllureUtils.logStep("Clicked on actionbuton");

        
        // Add a longer wait at the end if needed for UI to stabilize
        Thread.sleep(5200);
    }
}
