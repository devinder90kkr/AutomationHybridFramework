package cuesz.membersummary.actionsteps;

import org.openqa.selenium.WebDriver;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;
import cuesz.web.resources.ElementActions;
import cuesz.web.resources.weblocators;

public class Cases110_Action_Steps extends BasePage {
	

	private static final Logger LOGGER = LoggerFactory.getLogger(Cases110_Action_Steps.class);
	private ElementActions elementActions;
	SeleniumUtils utils = new SeleniumUtils(driver);

	public Cases110_Action_Steps(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

    @Test
    public void actionsteps() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        
	
        // Click on Workout template icon from nav bar menu
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.actionstepsheading));
        // Assert the heading text
        String expectedHeadingText = "Action Steps"; // replace with the actual expected text
        elementActions.assertHeadingText(weblocators.actionstepsheading, expectedHeadingText);

        // Log message to console and Allure report
        LOGGER.info("Verified action steps heading text");
        AllureUtils.logStep("Verified action steps heading text");
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Cases110_Action_Steps1");
        
        
        
    }}
