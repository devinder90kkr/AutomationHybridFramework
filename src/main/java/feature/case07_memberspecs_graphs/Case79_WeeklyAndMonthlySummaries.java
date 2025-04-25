 package feature.case07_memberspecs_graphs;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BasePage;
import utils.SeleniumUtils;

public class Case79_WeeklyAndMonthlySummaries extends BasePage {

    SeleniumUtils utils = new SeleniumUtils(driver);

    private By graphIcon = By.id("MemberSummary-/insights");
    private By dropdown = By.id("GraphDropdown");
    private By option = By.xpath("//div[@id='GraphDropdown']//div[contains(text(), 'Weekly and Monthly Summaries')]");
    private By Weeklyheading = By.xpath("//h3[normalize-space()='Weekly And Monthly Summaries']");

    public Case79_WeeklyAndMonthlySummaries(WebDriver driver) {
        super(driver);
    }

    @Test
    public void TrainingLoadAnalysis() throws InterruptedException {
        // Create WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as needed

        Thread.sleep(2000);
        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();

        WebElement graphIconElement = driver.findElement(graphIcon);
        graphIconElement.click();

        // Find the dropdown element by its ID
        WebElement dropdownElement = driver.findElement(dropdown);
        // Click the dropdown to open it
        dropdownElement.click();

        // Locate and click the desired option "Training Load Analysis"
        WebElement optionElement = driver.findElement(option);
        optionElement.click();

        // Find the heading element and extract the text
        WebElement WeeklyAndMonthlySummaries = driver.findElement(Weeklyheading);
        String headingText = WeeklyAndMonthlySummaries.getText();

        // Verify if the heading is "Training Load Analysis"
        if (headingText.equals("Training Load Analysis")) {
            System.out.println("Heading is 'Weekly And Monthly Summaries'.");
        } else {
            System.out.println("Heading is not 'Weekly And Monthly Summaries'.");
        }
        Thread.sleep(5000);

        try {
            // Define individual dropdown IDs and corresponding option texts
            String[][] dropdownOptions = {
                {"WeeklyAndMonthlySummariesPeriod", "Weekly", "Monthly"},
                {"WeeklyAndMonthlySummariesDuration", "1 Months", "2 Months", "3 Months", "4 Months"},
                {"WeeklyAndMonthlySummariesHeartRateOptions", "Resting Heart Rate", "Heart Rate Variability", "Heart Rate During Live Perform", "Heart Rate During Perform Activity"},
                
                
            };

            // Click on "CorrelationAnalysisDuration" first
            String dropdownIdDuration = "WeeklyAndMonthlySummariesPeriod";
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

            // Click on "CorrelationAnalysisHeartRateOptions" second
            String dropdownIdHeartRate = "WeeklyAndMonthlySummariesDuration";
            WebElement dropdownElementHeartRate = wait.until(ExpectedConditions.elementToBeClickable(By.id(dropdownIdHeartRate)));
            dropdownElementHeartRate.click();
            Thread.sleep(2000);

            for (int i = 1; i < dropdownOptions[1].length; i++) {
                String optionText = dropdownOptions[1][i];
                Thread.sleep(1000);
                WebElement optionElement1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='" + dropdownIdHeartRate + "']//div[contains(text(), '" + optionText + "')]")));

                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", optionElement1);
                optionElement1.click();

                // Close the dropdown after selecting an option
                dropdownElementHeartRate.click();
                dropdownElementHeartRate.click();
                dropdownElementHeartRate.click();
                Thread.sleep(1000);
            }

            // Click on "CorrelationAnalysisPhysicalCondition" third
            String dropdownIdCondition = "WeeklyAndMonthlySummariesHeartRateOptions";
            WebElement dropdownElementCondition = wait.until(ExpectedConditions.elementToBeClickable(By.id(dropdownIdCondition)));
            dropdownElementCondition.click();
            Thread.sleep(2000);

            for (int i = 1; i < dropdownOptions[2].length; i++) {
                String optionText = dropdownOptions[2][i];
                Thread.sleep(1000);
                WebElement optionElement1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='" + dropdownIdCondition + "']//div[contains(text(), '" + optionText + "')]")));

                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", optionElement1);
                optionElement1.click();

                // Close the dropdown after selecting an option
                dropdownElementCondition.click();
                dropdownElementCondition.click();
                dropdownElementCondition.click();
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            // Handle exceptions here
        }
    }}