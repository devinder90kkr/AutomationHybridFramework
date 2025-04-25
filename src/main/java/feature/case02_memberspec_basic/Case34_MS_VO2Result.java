/*https://chat.openai.com/share/fb99a8d3-9b88-4b49-8555-3f5eab0b24e5 */
package feature.case02_memberspec_basic;

import org.openqa.selenium.JavascriptExecutor;
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
import java.util.List;

import allureframework.reporting.AllureUtils;
import commonfunction.DateGenerator;
import base.BasePage;
import utils.SeleniumUtils;
import constant.weblocators;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

@Epic("Member Summary Management")
@Feature("VO2 Result Management")
public class Case34_MS_VO2Result extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(Case34_MS_VO2Result.class);
    //public static String eventDate = "26-10-2023"; // Date to be passed nextscandate below
    public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date
    SeleniumUtils utils = new SeleniumUtils(driver);
    private WebDriverWait wait;
    private static final int MAX_SELECTIONS = 5; // Maximum number of selections to make
    
    public Case34_MS_VO2Result(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private void selectFromDropdown(WebElement dropdown) throws InterruptedException {
        Actions actions = new Actions(driver);
        
        // Click to open dropdown
        actions.moveToElement(dropdown).click().perform();
        Thread.sleep(1000);

        // Wait for dropdown options to be visible
        List<WebElement> options = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
            weblocators.dropdownOptions));
        
        if (options.isEmpty()) {
            LOGGER.warn("No options found in dropdown");
            return;
        }

        // Get the number of options to select (minimum of available options or MAX_SELECTIONS)
        int selectionsToMake = Math.min(options.size(), MAX_SELECTIONS);
        
        for (int i = 0; i < selectionsToMake; i++) {
            // Click to open dropdown for each selection
            if (i > 0) {
                actions.moveToElement(dropdown).click().perform();
                Thread.sleep(1000);
                // Refresh the options list for each selection
                options = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(
                    weblocators.dropdownOptions));
            }
            
            WebElement option = options.get(i);
            String optionText = option.getText();
            actions.moveToElement(option).click().perform();
            LOGGER.info("Selected option {}: {}", i + 1, optionText);
            AllureUtils.logStep("Selected dropdown option: " + optionText);
            Thread.sleep(1000);
        }
    }

    @Test
    @Description("Manage VO2 Result settings and next scan date")
    @Story("VO2 Result Configuration")
    public void bodyscan() throws InterruptedException {
        LOGGER.info("Starting VO2 Result configuration process");
        Thread.sleep(2000);

        utils.clickMembersummary();
        LOGGER.info("Clicked on Member Summary");
        AllureUtils.logStep("Navigated to Member Summary");

        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        LOGGER.info("Entered search text");
        
        utils.clickMembername();
        LOGGER.info("Selected member from search results");
        AllureUtils.logStep("Selected member profile");

        Thread.sleep(3000);
        WebElement elementToScrolTO4spherElement = driver.findElement(weblocators.elementScrollTo4sphere);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementToScrolTO4spherElement);
        LOGGER.info("Scrolled to 4 Spheres section");
        AllureUtils.logStep("Scrolled to 4 Spheres section");

        Thread.sleep(5000);
        WebElement elementToScrollTo = driver.findElement(weblocators.elementScrollTo);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
        LOGGER.info("Scrolled to VO2 Result section");
        AllureUtils.logStep("Scrolled to VO2 Result section");

        Thread.sleep(5000);
        AllureUtils.captureScreenshot(driver, "vo2_result_initial_view");

        // Configure Duration settings
        WebElement durationDropdown = wait.until(ExpectedConditions.elementToBeClickable(weblocators.selectype));
        selectFromDropdown(durationDropdown);
        AllureUtils.captureScreenshot(driver, "vo2_result_duration_selections");

        // Set next scan date
        Thread.sleep(2000);
        WebElement nextscandate = driver.findElement(weblocators.selectype5);
        Actions builder = new Actions(driver);
        builder.moveToElement(nextscandate).click().sendKeys(eventDate).sendKeys(Keys.ENTER).perform();
        LOGGER.info("Set next scan date to: {}", eventDate);
        AllureUtils.logStep("Set next scan date");
        AllureUtils.captureScreenshot(driver, "vo2_result_next_scan_date");

        Thread.sleep(5000);
        LOGGER.info("VO2 Result configuration completed successfully");
    }
}

