package feature.case07_memberspecs_graphs;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import allureframework.AllureUtils;
import base.BasePage;
import utils.SeleniumUtils;
import constant.weblocators;

public class Case64_02_RestingPhysiology_editcase extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(Case64_02_RestingPhysiology_editcase.class);
    SeleniumUtils utils = new SeleniumUtils(driver);

    public Case64_02_RestingPhysiology_editcase(WebDriver driver) {
        super(driver);
    }

    @Test
    public void editRestingPhysiology() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Thread.sleep(2500);
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

        WebElement restingedit = wait.until(ExpectedConditions.elementToBeClickable(weblocators.resrtingedit));
        restingedit.click();
        LOGGER.info("Clicked on restingedit");
        AllureUtils.logStep("Clicked on restingedit");

        // Verify the text on the popup
        WebElement popupTextElement = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.restingphyiologypop));
        String expectedText = "Welcome to Edit Mode! To eliminate outliers, simply click on the bar representing the data you wish to remove.";
        String actualText = popupTextElement.getText();
        LOGGER.info("Popup text: " + actualText);
        AllureUtils.logStep("Popup text: " + actualText);
        Assert.assertEquals(actualText, expectedText, "Popup text does not match!");
        LOGGER.info("Verified popup text successfully");
        AllureUtils.logStep("Verified popup text successfully");

        // Click on the Continue button
        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(weblocators.continueButton));
        continueButton.click();
        LOGGER.info("Clicked on Continue button");
        AllureUtils.logStep("Clicked on Continue button");

        // Click on the canvas element
        WebElement canvasElement = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.canvasclick));
        clickOnCanvas(canvasElement, 100, 100); // Adjust the x and y coordinates as needed
         clickOnCanvas(canvasElement, 50, 80); // Adjust the x and y coordinates as needed



        LOGGER.info("Clicked on canvas element at position (100, 100)");
        AllureUtils.logStep("Clicked on canvas element at position (100, 100)");


    }

    private void clickOnCanvas(WebElement canvas, int x, int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("var canvas = arguments[0];" +
                         "var context = canvas.getContext('2d');" +
                         "var rect = canvas.getBoundingClientRect();" +
                         "var x = arguments[1];" +
                         "var y = arguments[2];" +
                         "var clickEvent = new MouseEvent('click', {" +
                         "    clientX: rect.left + x," +
                         "    clientY: rect.top + y," +
                         "    bubbles: true," +
                         "    cancelable: true" +
                         "});" +
                         "canvas.dispatchEvent(clickEvent);", canvas, x, y);
    }


    }

