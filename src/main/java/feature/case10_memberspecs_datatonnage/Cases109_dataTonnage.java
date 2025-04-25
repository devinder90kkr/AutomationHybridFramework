package feature.case10_memberspecs_datatonnage;

import org.openqa.selenium.WebDriver;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import allureframework.AllureUtils;
import base.BasePage;
import utils.SeleniumUtils;
import constant.ElementActions;
import constant.weblocators;

public class Cases109_dataTonnage extends BasePage {
	private static final Logger LOGGER = LoggerFactory.getLogger(Cases109_dataTonnage.class);
	private ElementActions elementActions;
	SeleniumUtils utils = new SeleniumUtils(driver);

    public Cases109_dataTonnage(WebDriver driver) {
        super(driver);
        this.elementActions = new ElementActions(driver);
    }

    @Test
    public void datatonnage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        utils.clickMembersummary();
        AllureUtils.logStep("Clicking on membersummary feature");
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();
        AllureUtils.logStep("Searching for members from list");
        Thread.sleep(2000);
	
        // Click on Workout template icon from nav bar menu
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.templateicon));
        elementActions.clickElement(weblocators.templateicon);
        // Log message to console and Allure report
        LOGGER.info("Clicked on templateicon");
        AllureUtils.logStep("Clicked on templateicon");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case102_Workout_Templates1");
        
        
        
    }}
