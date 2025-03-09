package cuesz.membersummary.basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.date.functions.Currentdategenerator;
import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;
import io.qameta.allure.Step;

public class Case34_01_MS_VO2assigntomember extends BasePage {
    private static final Logger logger = LoggerFactory.getLogger(Case34_01_MS_VO2assigntomember.class);
    public static String eventDate = Currentdategenerator.generateCurrentDate();
    
    SeleniumUtils utils = new SeleniumUtils(driver);
    private final By elementScrollTo = By.xpath("//h4[normalize-space()='VO2 Result']");
    private final By selectype5 = By.id("MemberSummary-Vo2Result-NextScan-DatePicker");

    public Case34_01_MS_VO2assigntomember(WebDriver driver) {
        super(driver);
    }

    @Test
    @Step("Navigate to VO2 Result section and set next scan date")
    public void vo2scan() throws InterruptedException {
        logger.info("Starting VO2 Result scan process");
        
        utils.clickMembersummary();
        logger.info("Clicked on Member Summary");
        
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        logger.info("Entered search text");
        
        utils.clickMembername();
        logger.info("Selected member from search results");

        Thread.sleep(3000);
        WebElement elementToScrollTo = driver.findElement(elementScrollTo);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
        logger.info("Scrolled to VO2 Result section");

        Thread.sleep(3500);
        WebElement multiwsitch = driver.findElement(By.id("MemberSummary-Vo2Result-NextScan-Switch"));
        multiwsitch.click();
        logger.info("Clicked on VO2 Result switch");

        WebElement nextscandate = driver.findElement(selectype5);
        nextscandate.click();
        logger.info("Opened date picker for next scan");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement dateElement = wait.until(ExpectedConditions.elementToBeClickable(
            By.cssSelector("[role='option'][aria-disabled='false']")));
        dateElement.click();
        logger.info("Selected next scan date");

        AllureUtils.captureScreenshot(driver, "vo2_result_scan");
        logger.info("VO2 Result scan process completed successfully");
    }
} 