package cuesz.membersummary.graphs;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;

public class Case65_BiofeedbackAnalysis extends BasePage {

    SeleniumUtils utils = new SeleniumUtils(driver);

    private By graphIcon = By.id("MemberSummary-/insights");
    private By dropdown = By.id("GraphDropdown");
    private By option = By.xpath("//div[@id='GraphDropdown']//div[contains(text(), 'Biofeedback Analysis')]");
    private By restingHeading = By.xpath("//h3[normalize-space()='Biofeedback Analysis']");

    public Case65_BiofeedbackAnalysis(WebDriver driver) {
        super(driver);
    }

    @Test
    public void BiofeedbackAnalysis() throws InterruptedException {
        // Create WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as needed

        Thread.sleep(2000);
        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText("Kumar Devinder");
        utils.clickMembername();

        WebElement graphIconElement = driver.findElement(graphIcon);
        graphIconElement.click();

        // Find the dropdown element by its ID
        WebElement dropdownElement = driver.findElement(dropdown);
        // Click the dropdown to open it
        dropdownElement.click();

        // Locate and click the desired option "Biofeedback Analysis"
        WebElement optionElement = driver.findElement(option);
        optionElement.click();

        // Find the heading element and extract the text
        WebElement restingPhysiologyHeadingElement = driver.findElement(restingHeading);
        String headingText = restingPhysiologyHeadingElement.getText();

        // Verify if the heading is "Biofeedback Analysis"
        if (headingText.equals("Biofeedback Analysis")) {
            System.out.println("Heading is 'Biofeedback Analysis'.");
        } else {
            System.out.println("Heading is not 'Biofeedback Analysis'.");
        }
        Thread.sleep(5000);

        try {
            // Define individual dropdown IDs and corresponding option texts
            String[][] dropdownOptions = {
                {"BiofeedbackAnalysisDuration", "7 Days", "14 Days", "30 Days", "60 Days"},
            };

            // Click on "RestingPhysiology" first
            String dropdownIdDuration = "BiofeedbackAnalysisDuration";
            WebElement dropdownElementDuration = wait.until(ExpectedConditions.elementToBeClickable(By.id(dropdownIdDuration)));
            dropdownElementDuration.click();
            Thread.sleep(2000);

            for (int i = 1; i < dropdownOptions[0].length; i++) {
                String optionText = dropdownOptions[0][i];
                Thread.sleep(1000);
                WebElement optionElement1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='" + dropdownIdDuration + "']//div[contains(text(), '" + optionText + "')]")));

                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", optionElement1);
                optionElement1.click();
                // Close the dropdown after selecting an option
                dropdownElementDuration.click();
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            // Handle exceptions here
        }
    }
}
