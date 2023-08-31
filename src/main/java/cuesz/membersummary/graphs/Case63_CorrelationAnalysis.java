package cuesz.membersummary.graphs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
    
   

    public Case63_CorrelationAnalysis(WebDriver driver) {
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
        WebElement coreltaionoption = driver.findElement(opton);
        coreltaionoption.click();
        
        
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
        
        /*********Select CorrelationAnalysisDuration******/
      // Locate the dropdown element by its ID
      WebElement dropdown2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("CorrelationAnalysisDuration")));
      // Ensure the element is visible before interacting with it
      wait.until(ExpectedConditions.visibilityOf(dropdown2));
      // Scroll to the element if necessary
      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdown2);
      // Click the dropdown to open it
      dropdown2.click();        
     // Locate and click the "14 Days" option
      WebElement option14Days = driver.findElement(By.xpath("//div[contains(text(),'7 Days')]"));
      option14Days.click();
        
        
//       // Locate the dropdown element by its ID
//        WebElement dropdown2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("CorrelationAnalysisDuration")));
//        // Ensure the element is visible before interacting with it
//        wait.until(ExpectedConditions.visibilityOf(dropdown2));
//        // Scroll to the element if necessary
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdown2);
//        // Click the dropdown to open it
//        dropdown2.click();        
//       // Locate and click the "14 Days" option
//        WebElement option14Days = driver.findElement(By.xpath("//div[contains(text(),'14 Days')]"));
//        option14Days.click();
        
        /*********Select CorrelationAnalysisHeartRateOptions******/
        // Locate the dropdown element by its ID
        WebElement dropdown3 = wait.until(ExpectedConditions.elementToBeClickable(By.id("CorrelationAnalysisHeartRateOptions")));
        // Ensure the element is visible before interacting with it
        wait.until(ExpectedConditions.visibilityOf(dropdown3));
        // Scroll to the element if necessary
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdown3);
        // Click the dropdown to open it
        dropdown3.click();        
       // Locate and click the "14 Days" option
        WebElement optionHRVvalues = driver.findElement(By.xpath("//div[contains(text(),'Heart Rate Variability')]"));
        optionHRVvalues.click();
        
        /*********Select CorrelationAnalysisPhysicalCondition******/
        // Locate the dropdown element by its ID
        WebElement dropdown4 = wait.until(ExpectedConditions.elementToBeClickable(By.id("CorrelationAnalysisPhysicalCondition")));
        // Ensure the element is visible before interacting with it
        wait.until(ExpectedConditions.visibilityOf(dropdown4));
        // Scroll to the element if necessary
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdown4);
        // Click the dropdown to open it
        dropdown4.click();        
       // Locate and click the "14 Days" option
        WebElement optionsleepvalues = driver.findElement(By.xpath("//div[contains(text(),'Sleep Time')]"));
        optionsleepvalues.click();
        
        
        
        Thread.sleep(8500);
          
      }

}

