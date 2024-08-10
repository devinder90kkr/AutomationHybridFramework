package cuesz.membersummary.actionsteps;

import org.openqa.selenium.WebDriver;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.date.functions.DateGenerator;
import cuesz.pages.BasePage;
import cuesz.web.resources.ElementActions;
import cuesz.web.resources.webTestdata;
import cuesz.web.resources.weblocators;

public class Cases114_Action_Steps_SharingNotes extends BasePage {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Cases114_Action_Steps_SharingNotes.class);
    private ElementActions elementActions;
    public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date
    
    public Cases114_Action_Steps_SharingNotes(WebDriver driver) {
        super(driver);
        this.elementActions = new ElementActions(driver);
    }

    @Test
    public void sharingmultiplenotes() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(35)); // Adjusted to 35 seconds for practicality
        
        // Create a list of notes
        List<String> notesList = Arrays.asList(
            "Note 5: " + webTestdata.notes10,
            "Note 4: " + webTestdata.notes9,
            "Note 3: " + webTestdata.notes8,
            "Note 2: " + webTestdata.notes7,
            "Note 1: " + webTestdata.notes6
        );

     // Loop through each note in the list
        for (String note : notesList) {
            // Click on plus icon for action steps 
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.actionstepsbutton));
            elementActions.clickElement(weblocators.actionstepsbutton);
            LOGGER.info("Clicked on actionstepsbutton");
            AllureUtils.logStep("Clicked on actionstepsbutton");
            AllureUtils.captureScreenshot(driver, "Cases113_Action_Steps_Mutiplenotes1");

            // Send the current note to the editor
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.editoractions));
            elementActions.sendKeysToElement(weblocators.editoractions, note);
            LOGGER.info("Entered values in editoractions field: " + note);
            AllureUtils.logStep("Entered values in editoractions field: " + note);

            // Click on submit button for action steps 
            wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.submitactionnotes));
            elementActions.clickElement(weblocators.submitactionnotes);
            LOGGER.info("Clicked on submitactionnotes");
            AllureUtils.logStep("Clicked on submitactionnotes");
            AllureUtils.captureScreenshot(driver, "Cases113_Action_Steps_Mutiplenotes1");
            
            // Optionally, you can add a small delay between submissions
            Thread.sleep(1000); // Adjust the sleep time as needed      
        }
        
        // Click on sharing icon for action steps 
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.sharing1));
        elementActions.clickElement(weblocators.sharing1);
        LOGGER.info("Clicked on sharing1 button");
        AllureUtils.logStep("Clicked on sharing1 button");
        
        //Click on checkbox
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.checkbox2));
        elementActions.clickElement(weblocators.checkbox2);
        LOGGER.info("Clicked on checkbox2 button");
        AllureUtils.logStep("Clicked on checkbox2 button");
        
      //Click on checkbox
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.sharingbutton));
        elementActions.clickElement(weblocators.sharingbutton);
        LOGGER.info("Clicked on sharingbutton button");
        AllureUtils.logStep("Clicked on sharingbutton button");
    
    
    Thread.sleep(5200);
    }

}        

