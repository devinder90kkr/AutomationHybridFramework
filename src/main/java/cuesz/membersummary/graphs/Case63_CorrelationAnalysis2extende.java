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

public class Case63_CorrelationAnalysis2extende extends BasePage {

    SeleniumUtils utils = new SeleniumUtils(driver);

    private By grahpicon = By.id("MemberSummary-/insights");
    private By drodown = By.id("GraphDropdown");
    private By opton = (By.xpath("//div[@id='GraphDropdown']//div[contains(text(), 'Correlation Analysis')][2]"));
    private By corelatonheading = By.xpath("//h3[normalize-space()='Correlation Analysis']");

    public Case63_CorrelationAnalysis2extende(WebDriver driver) {
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
        	
            String[] dropdownIds = {"CorrelationAnalysisDuration", "CorrelationAnalysisHeartRateOptions", "CorrelationAnalysisPhysicalCondition"};
            String[][] optionTexts = {
                {"7 Days", "14 Days", "30 Days", "60 Days"},
                {"Resting Heart Rate", "Heart Rate Variability", "Heart Rate During Live Perform"},
                {"Sleep Time", "Sleep Quality", "Mental Energy"}
            };

            for (int i = 0; i < dropdownIds.length; i++) {
                // Click the dropdown to open it
            	WebElement dropdownElement = wait.until(ExpectedConditions.elementToBeClickable(By.id(dropdownIds[i])));
            	dropdownElement.click();
                Thread.sleep(2000);

                for (String optionText : optionTexts[i]) {
                	 WebElement optionElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='" + dropdownIds[i] + "']//div[contains(text(), '" + optionText + "')]")));
                     
                     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", optionElement);
                     optionElement.click();  
                                
                     /*****/
                     WebElement dropdownElement1 = wait.until(ExpectedConditions.elementToBeClickable(By.id(dropdownIds[i])));
                 	dropdownElement1.click();        
             Thread.sleep(2000);
                }
            }
        } finally {
            driver.quit();
        }
    }
}


