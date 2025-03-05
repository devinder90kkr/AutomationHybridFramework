package cuesz.membersummary.basic;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cuesz.allure.reporting.AllureUtils;
import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;
import cuesz.web.resources.weblocators;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

@Epic("Member Summary Management")
@Feature("Ability to Perform Dots Status")
public class Case18_MS_DotAbiltyPM extends BasePage {

    private static final Logger LOGGER = LoggerFactory.getLogger(Case18_MS_DotAbiltyPM.class);
    SeleniumUtils utils = new SeleniumUtils(driver);

    public Case18_MS_DotAbiltyPM(WebDriver driver) {
        super(driver);
    }

    @Test
    @Description("Test ability to perform dots status functionality")
    @Story("Dots Status Management")
    public void Dotstatus_Abilityperform() throws InterruptedException {
        LOGGER.info("Starting Dots Status Ability to Perform test");
        Thread.sleep(2000);

        LOGGER.info("Navigating to Member Summary page");
        utils.clickMembersummary();
        utils.enterSearchText();
        utils.clickMembername();
        
        AllureUtils.captureScreenshot(driver, "member_summary_initial");
        LOGGER.info("Accessed member summary page");
        
        // Click on user icon to open ability to perform popup
        LOGGER.info("Opening ability to perform popup");
        WebElement userIcon = driver.findElement(weblocators.usricn);
        userIcon.click();
        AllureUtils.logStep("Opened ability to perform popup");
        
        Thread.sleep(3500);
        
        // Click on dots
        LOGGER.info("Setting dots status");
        WebElement dot1 = driver.findElement(weblocators.Dot1);
        dot1.click();
        WebElement dot2 = driver.findElement(weblocators.Dot2);
        dot2.click();
        WebElement dot3 = driver.findElement(weblocators.Dot3);
        dot3.click();
        AllureUtils.logStep("Set dots status successfully");
        
        Thread.sleep(3500);

        // Click on add button
        LOGGER.info("Clicking add button");
        WebElement addButton = driver.findElement(weblocators.Addbutton);
        addButton.click();
        AllureUtils.logStep("Clicked add button");
        
        // Click and enter value for title and notes
        LOGGER.info("Entering title and notes");
        WebElement titleinput = driver.findElement(weblocators.Title);
        titleinput.sendKeys("this is just for testing purpose");

        WebElement notes = driver.findElement(weblocators.Notes23);
        notes.sendKeys("Hello, we have set ability to perform values one in input text field");
        Thread.sleep(2500);
        AllureUtils.logStep("Entered title and notes");
        

        // Click on dots
        LOGGER.info("Setting dots status");
        WebElement dot12Element = driver.findElement(weblocators.dotfield2);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", dot12Element);
        dot12Element.click();


        Thread.sleep(2500);
        // Click on submit button
        LOGGER.info("Submitting the form");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        WebElement submitbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'btn-primary')]//span[text()='Submit']/..")));
        JavascriptExecutor js2Executor = (JavascriptExecutor)driver;
        js2Executor.executeScript("arguments[0].scrollIntoView();", submitbutton);

        submitbutton.click();
        Thread.sleep(3500);
        AllureUtils.logStep("Form submitted successfully"); 
        
        AllureUtils.captureScreenshot(driver, "form_submitted");

        // Perform any other actions you need to after submission
        LOGGER.info("Opening user profile for deletion");
        userIcon.click();
        Thread.sleep(3500); 
        
        // Locate delete button using explicit wait
        LOGGER.info("Waiting for delete button to be clickable");
        WebElement deleteBtn = wait.until(ExpectedConditions.elementToBeClickable(weblocators.deleteButton));
        deleteBtn.click();
        AllureUtils.logStep("Clicked delete button");
        
        AllureUtils.captureScreenshot(driver, "delete_confirmation");

        // Add logic here if needed after clicking delete
        LOGGER.info("Confirming deletion");
        WebElement confirmButton = driver.findElement(weblocators.confirm);
        confirmButton.click();
        AllureUtils.logStep("Confirmed deletion");

        Thread.sleep(4500);
        
        // Click on submit button
        LOGGER.info("Submitting final changes");
        WebElement submitbutton2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'btn-primary')]//span[text()='Submit']/..")));
        submitbutton2.click();
        AllureUtils.logStep("Final changes submitted successfully");
        
        AllureUtils.captureScreenshot(driver, "test_completion");
        LOGGER.info("Dots Status Ability to Perform test completed successfully");
    }
}

	
