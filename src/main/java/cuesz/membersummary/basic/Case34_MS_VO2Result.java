/*https://chat.openai.com/share/fb99a8d3-9b88-4b49-8555-3f5eab0b24e5 */
package cuesz.membersummary.basic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cuesz.allure.reporting.AllureUtils;
import cuesz.date.functions.DateGenerator;
import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;
import cuesz.web.resources.weblocators;
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
    
    public Case34_MS_VO2Result(WebDriver driver) {
        super(driver);
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

        Thread.sleep(3000);
        WebElement elementToScrollTo = driver.findElement(weblocators.elementScrollTo);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
        LOGGER.info("Scrolled to VO2 Result section");
        AllureUtils.logStep("Scrolled to VO2 Result section");

        Thread.sleep(3000);
        AllureUtils.captureScreenshot(driver, "vo2_result_initial_view");

        // Configure Duration settings  
        WebElement selecttype = driver.findElement(weblocators.selectype);
        Actions builder1 = new Actions(driver);
        builder1.moveToElement(selecttype).click().sendKeys("24").perform();
        Thread.sleep(2000);
        builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        LOGGER.info("Set first duration value to 24");
        AllureUtils.logStep("Configured first duration setting");
        AllureUtils.captureScreenshot(driver, "vo2_result_duration_1");

        Thread.sleep(2500);
        WebElement selecttype1 = driver.findElement(weblocators.selectype);
        Actions builder2 = new Actions(driver);
        builder2.moveToElement(selecttype1).click().sendKeys("12").perform();
        Thread.sleep(2000);
        builder2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        LOGGER.info("Set second duration value to 12");
        AllureUtils.logStep("Configured second duration setting");
        AllureUtils.captureScreenshot(driver, "vo2_result_duration_2");

        Thread.sleep(2500);
        WebElement selecttype3 = driver.findElement(weblocators.selectype);
        Actions builder3 = new Actions(driver);
        builder3.moveToElement(selecttype3).click().sendKeys("06").perform();
        Thread.sleep(2000);
        builder3.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        LOGGER.info("Set third duration value to 06");
        AllureUtils.logStep("Configured third duration setting");
        AllureUtils.captureScreenshot(driver, "vo2_result_duration_3");

        // Set next scan date
        Thread.sleep(2000);
        WebElement nextscandate = driver.findElement(weblocators.selectype5);
        Actions builder112 = new Actions(driver);
        builder112.moveToElement(nextscandate).click().sendKeys(eventDate).sendKeys(Keys.ENTER).perform();
        LOGGER.info("Set next scan date to: {}", eventDate);
        AllureUtils.logStep("Set next scan date");
        AllureUtils.captureScreenshot(driver, "vo2_result_next_scan_date");

        Thread.sleep(5000);
        LOGGER.info("VO2 Result configuration completed successfully");
    }
}

