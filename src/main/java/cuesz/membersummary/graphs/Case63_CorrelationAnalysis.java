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

public class Case63_CorrelationAnalysis extends BasePage {

    SeleniumUtils utils = new SeleniumUtils(driver);

    private By grahpicon = By.id("MemberSummary-/insights");
    private By drodown = By.id("GraphDropdown");
    private By opton = (By.xpath("//div[@id='GraphDropdown']//div[contains(text(), 'Correlation Analysis')][2]"));
    private By corelatonheading = By.xpath("//h3[normalize-space()='Correlation Analysis']");

    public Case63_CorrelationAnalysis (WebDriver driver) {
        super(driver);
    }

    @Test
    public void corelation() throws InterruptedException {
        // Create WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000)); // Adjust the timeout as needed

        Thread.sleep(2000);
        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText("Kumar Devinder");
        utils.clickMembername();

        WebElement Graphicon = driver.findElement(grahpicon);
        Graphicon.click();

        // Find the dropdown element by its ID
        WebElement dropdown = driver.findElement(drodown);
        // Click the dropdown to open it
        dropdown.click();

        // Locate and click the desired option "Correlation Analysis" (the second occurrence)
        WebElement corelationoption = driver.findElement(opton);
        corelationoption.click();

        // Find the heading element and extract the text
        WebElement corelationanalysisheading = driver.findElement(corelatonheading);
        String headingText = corelationanalysisheading.getText();

        // Verify if the heading is " Correlation Analysis"
        if (headingText.equals("Correlation Analysis")) {
            System.out.println("Heading is 'Correlation Analysis'.");
        } else {
            System.out.println("Heading is not 'Correlation Analysis'.");
        }
        Thread.sleep(5000);


        try {
            // Define individual dropdown IDs and corresponding option texts
            String[][] dropdownOptions = {
                {"CorrelationAnalysisDuration", "7 Days", "14 Days", "30 Days", "60 Days"},
                {"CorrelationAnalysisHeartRateOptions", "Resting Heart Rate", "Heart Rate Variability", "Heart Rate During Live Perform"},
                {"CorrelationAnalysisPhysicalCondition", "Sleep Time", "Sleep Quality", "Mental Energy"}
            };

            // Click on "CorrelationAnalysisDuration" first
            String dropdownIdDuration = "CorrelationAnalysisDuration";
            WebElement dropdownElementDuration = wait.until(ExpectedConditions.elementToBeClickable(By.id(dropdownIdDuration)));
            dropdownElementDuration.click();
            Thread.sleep(2000);

            for (int i = 1; i < dropdownOptions[0].length; i++) {
                String optionText = dropdownOptions[0][i];
                Thread.sleep(1000);
                WebElement optionElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='" + dropdownIdDuration + "']//div[contains(text(), '" + optionText + "')]")));

                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", optionElement);
                optionElement.click();
                // Close the dropdown after selecting an option
                dropdownElementDuration.click();
                Thread.sleep(1000);
            }

            // Click on "CorrelationAnalysisHeartRateOptions" second
            String dropdownIdHeartRate = "CorrelationAnalysisHeartRateOptions";
            WebElement dropdownElementHeartRate = wait.until(ExpectedConditions.elementToBeClickable(By.id(dropdownIdHeartRate)));
            dropdownElementHeartRate.click();
            Thread.sleep(2000);

            for (int i = 1; i < dropdownOptions[1].length; i++) {
                String optionText = dropdownOptions[1][i];
                Thread.sleep(1000);
                WebElement optionElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='" + dropdownIdHeartRate + "']//div[contains(text(), '" + optionText + "')]")));

                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", optionElement);
                optionElement.click();

                // Close the dropdown after selecting an option
                dropdownElementHeartRate.click();
                dropdownElementHeartRate.click();
                Thread.sleep(1000);
            }

            // Click on "CorrelationAnalysisPhysicalCondition" third
            String dropdownIdCondition = "CorrelationAnalysisPhysicalCondition";
            WebElement dropdownElementCondition = wait.until(ExpectedConditions.elementToBeClickable(By.id(dropdownIdCondition)));
            dropdownElementCondition.click();
            Thread.sleep(2000);

            for (int i = 1; i < dropdownOptions[2].length; i++) {
                String optionText = dropdownOptions[2][i];
                Thread.sleep(1000);
                WebElement optionElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='" + dropdownIdCondition + "']//div[contains(text(), '" + optionText + "')]")));

                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", optionElement);
                optionElement.click();

                // Close the dropdown after selecting an option
                dropdownElementCondition.click();
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            // Handle exceptions here
        }

     // Locate the table element
        WebElement tableElement = driver.findElement(By.xpath("//table[@class='table table-borderless']"));

        // Scroll to the bottom of the table using JavaScript
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = arguments[0].scrollHeight;", tableElement);
        Thread.sleep(2500);


        }
    }



