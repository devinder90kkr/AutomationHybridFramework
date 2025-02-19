package cuesz.membersummary.graphs;

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
import cuesz.pages.BasePage;
import cuesz.schdule.Case01_createvent;
import cuesz.utils.SeleniumUtils;
import cuesz.web.resources.weblocators;

public class Case64_RestingPhysiology extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(Case01_createvent.class);
    SeleniumUtils utils = new SeleniumUtils(driver);

    public Case64_RestingPhysiology(WebDriver driver) {
        super(driver);
    }

    @Test
    public void RestingPhysiology() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        LOGGER.info("Navigating to Member Summary");
        AllureUtils.logStep("Navigating to Member Summary");
        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);

        LOGGER.info("Entering search text");
        AllureUtils.logStep("Entering search text");
        utils.enterSearchText();
        utils.clickMembername();

        WebElement graphIconElement = driver.findElement(weblocators.graphIcon);
        graphIconElement.click();
        LOGGER.info("Clicked on graphIconElement");
        AllureUtils.logStep("Clicked on graphIconElement");

        WebElement dropdownElement = driver.findElement(weblocators.dropdown);
        dropdownElement.click();
        LOGGER.info("Clicked on dropdownElement");
        AllureUtils.logStep("Clicked on dropdownElement");

        WebElement optionElement = driver.findElement(weblocators.option);
        optionElement.click();
        LOGGER.info("Selected 'Resting Physiology' option");
        AllureUtils.logStep("Selected 'Resting Physiology' option");

        WebElement restingPhysiologyHeadingElement = driver.findElement(weblocators.restingHeading);
        String headingText = restingPhysiologyHeadingElement.getText();

        if (headingText.equals("Resting Physiology")) {
            LOGGER.info("Heading is 'Resting Physiology'");
            AllureUtils.logStep("Heading is 'Resting Physiology'");
        } else {
            LOGGER.error("Heading is not 'Resting Physiology'");
            AllureUtils.logStep("Heading is not 'Resting Physiology'");
        }
        
        Thread.sleep(5000);

        try {
            String[][] dropdownOptions = {
                {"RestingoptionPhyiology", "7 Days", "14 Days", "30 Days", "60 Days"},
            };

            String dropdownIdDuration = "RestingPhysiology";
            WebElement dropdownElementDuration = wait.until(
                ExpectedConditions.elementToBeClickable(By.id(dropdownIdDuration)));
            
            dropdownElementDuration.click();
            LOGGER.info("Clicked on Resting Physiology duration dropdown");
            AllureUtils.logStep("Clicked on Resting Physiology duration dropdown");
            Thread.sleep(2000);

            for (int i = 1; i < dropdownOptions[0].length; i++) {
                String optionText = dropdownOptions[0][i];
                LOGGER.info("Selecting option: " + optionText);
                AllureUtils.logStep("Selecting option: " + optionText);

                WebElement optionElement1 = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//div[@id='" + dropdownIdDuration + "']//div[contains(text(), '" + optionText + "')]")));

                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", optionElement1);
                optionElement1.click();
                LOGGER.info("Selected option: " + optionText);
                AllureUtils.logStep("Selected option: " + optionText);

                dropdownElementDuration.click();
                LOGGER.info("Closed the duration dropdown after selecting: " + optionText);
                AllureUtils.logStep("Closed the duration dropdown after selecting: " + optionText);

                Thread.sleep(1000);
            }
        } catch (Exception e) {
            LOGGER.error("An error occurred while selecting duration options: ", e);
            AllureUtils.logStep("Error: " + e.getMessage());
        }
    }
}
