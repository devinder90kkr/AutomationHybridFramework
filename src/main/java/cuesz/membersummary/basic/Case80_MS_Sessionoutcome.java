/*https://chat.openai.com/share/c262f25b-bab9-4b0a-ae68-6065478296aa*/
package cuesz.membersummary.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.time.Duration;

import cuesz.allure.reporting.AllureUtils;
import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

@Epic("Member Summary Management")
@Feature("Session Outcome Management")
public class Case80_MS_Sessionoutcome extends BasePage {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Case80_MS_Sessionoutcome.class);
    SeleniumUtils utils = new SeleniumUtils(driver);
    private WebDriverWait wait;
    private static final int MAX_SELECTIONS = 5; // Maximum number of date selections to make
    
    private By sessionOutcome = By.id("MemberSummary-SessionOutcome");
    private By selectDate = By.id("SessionOutcome-Selectdateoftheliveperformsession");
    
    public Case80_MS_Sessionoutcome(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private void selectDateFromDropdown(int index) throws InterruptedException {
        WebElement dateElement = wait.until(ExpectedConditions.elementToBeClickable(selectDate));
        Actions actions = new Actions(driver);
        
        // Click to open dropdown
        actions.moveToElement(dateElement).click().perform();
        Thread.sleep(1000);
        
        // Press down arrow key 'index' number of times to select different dates
        for (int i = 0; i < index; i++) {
            actions.sendKeys(Keys.ARROW_DOWN).perform();
            Thread.sleep(500);
        }
        
        // Press Enter to select the date
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(1000);
        
        LOGGER.info("Selected date at index: {}", index);
        AllureUtils.logStep("Selected date at position " + (index + 1));
    }

    @Test
    @Description("Manage Session Outcome settings and date selections")
    @Story("Session Outcome Configuration")
    public void sessionOutcomes() throws InterruptedException {
        LOGGER.info("Starting Session Outcome configuration process");
        
        utils.clickMembersummary();
        LOGGER.info("Clicked on Member Summary");
        AllureUtils.logStep("Navigated to Member Summary");

        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        LOGGER.info("Entered search text");
        
        utils.clickMembername();
        LOGGER.info("Selected member from search results");
        AllureUtils.logStep("Selected member profile");

        Thread.sleep(5000);
        WebElement sessionOutcomeElement = wait.until(ExpectedConditions.elementToBeClickable(sessionOutcome));
        sessionOutcomeElement.click();
        LOGGER.info("Clicked on Session Outcome section");
        AllureUtils.logStep("Navigated to Session Outcome section");
        AllureUtils.captureScreenshot(driver, "session_outcome_initial");

        // Select dates up to MAX_SELECTIONS
        for (int i = 0; i < MAX_SELECTIONS; i++) {
            selectDateFromDropdown(i);
            AllureUtils.captureScreenshot(driver, "session_outcome_date_" + (i + 1));
            Thread.sleep(1500);
        }

        LOGGER.info("Session Outcome configuration completed successfully");
        AllureUtils.logStep("Completed Session Outcome configuration");
        Thread.sleep(2000);
    }
}