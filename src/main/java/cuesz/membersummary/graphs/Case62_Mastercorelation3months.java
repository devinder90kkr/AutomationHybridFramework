package cuesz.membersummary.graphs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;

public class Case62_Mastercorelation3months extends BasePage {

    SeleniumUtils utils = new SeleniumUtils(driver);

    private By grahpicon = By.id("MemberSummary-/insights");
    private By dropdown = By.id("GraphDropdown");
    private By selectmastercorelation = By.xpath("//div[@id='GraphDropdown']//div[contains(text(), 'Master Correlation Analysis')]");
    private By mastercorelatonheading = By.xpath("//h3[normalize-space()='Master Correlation Analysis']");
    private By noCorrelationMessage = By.xpath("//div[@class='d-flex justify-content-center align-items-center correction_status']");
    private By drpdwn1 = (By.id("MasterCorrelationAnalysisHrvListOption"));
    private By drpdwn2 = (By.id("MasterCorrelationAnalysisHrvListOption"));
    private By corelatinBlock = (By.xpath("//h4[text()='Daily and Weekly Correlations']/following-sibling::div[@class='row justify-content-center dwc_sec']"));
    private By dayToDayElement = (By.xpath(".//div[contains(span,'Day to Day Corelation')]/h5"));
    private By baseLineElement = (By.xpath(".//div[contains(span,'BaseLine Corelation')]/h5"));
    private By grapCntainer = (By.xpath("//div[@class='dw_block']//div[@class='graphContainer']"));
   

    public Case62_Mastercorelation3months(WebDriver driver) {
        super(driver);
    }

    @Test
    public void mastercorelation() throws InterruptedException {
        Thread.sleep(2000);
        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText("Kumar Devinder");
        utils.clickMembername();

        WebElement Graphicon = driver.findElement(grahpicon);
        Graphicon.click();
        
        // Find the dropdown element by its ID
        WebElement dropdownselection = driver.findElement(dropdown);
        // Click the dropdown to open it
        dropdownselection.click();

        // Locate and click the desired option "Master Correlation Analysis"
        WebElement selectmastercoreelationoption = driver.findElement(selectmastercorelation);
        selectmastercoreelationoption.click();

        // Find the heading element and extract the text
        WebElement mastercorelationheading = driver.findElement(mastercorelatonheading);
        String headingText = mastercorelationheading.getText();

        // Verify if the heading is "Master Correlation Analysis"
        if (headingText.equals("Master Correlation Analysis")) {
            System.out.println("Heading is 'Master Correlation Analysis'.");
        } else {
            System.out.println("Heading is not 'Master Correlation Analysis'.");
        }

        // Check if the "No Correlation" message is displayed
        try {
            driver.findElement(noCorrelationMessage);
            System.out.println("There is basically no correlation and a there is basically no baseline correlation between the selected parameters.");
            // Add your handling logic here if needed.
        } catch (org.openqa.selenium.NoSuchElementException e) {
            // Element not found, proceed with other actions
        }
        
        // Locate and click the dropdown element to open it
        WebElement dropdown2 = driver.findElement(By.id("MasterCorrelationAnalysisDuration"));
        dropdown2.click();

        // Locate and click the "3 Months" option
        WebElement option14Days = driver.findElement(By.xpath("//div[contains(@class, 'react-select-dropdown-prefix__option') and text()='3 Months']"));
        option14Days.click();
        

     // Locate and click the dropdown element
        WebElement dropdown = driver.findElement(drpdwn1);
        dropdown.click();
        // Use the Actions class to send Tab key to select the first option
        Actions actions = new Actions(driver);
        // Press Tab key to select the first option
        actions.sendKeys(Keys.TAB);
//        // Press Space key to confirm the selection
//        actions.sendKeys(Keys.SPACE);

        for (int i = 0; i < 3; i++) {
            // Press Down arrow key once
            actions.sendKeys(Keys.DOWN);    
            // Press Space key
            actions.sendKeys(Keys.SPACE);
        }
        // Perform all the actions
        actions.build().perform();

        Thread.sleep(2500);
        
      // Locate and click the dropdown element
        WebElement dropdown1 = driver.findElement(drpdwn2);
        dropdown1.click();
        // Use the Actions class to send Tab key to select the first option
        Actions actions1 = new Actions(driver);
        // Press Tab key to select the first option
        actions1.sendKeys(Keys.TAB);
//        // Press Space key to confirm the selection
//        actions.sendKeys(Keys.SPACE);

        for (int i = 0; i < 6; i++) {
            // Press Down arrow key once
        	actions1.sendKeys(Keys.DOWN);        
            // Press Space key
        	actions1.sendKeys(Keys.SPACE);
        }
        // Perform all the actions
        actions1.build().perform();
        
        
        Thread.sleep(2500);
        
      // Locate and extract Day to Day Correlation and BaseLine Correlation values
      WebElement correlationBlock = driver.findElement(corelatinBlock);

      WebElement dayToDayCorrelationElement = correlationBlock.findElement(dayToDayElement);
      WebElement baseLineCorrelationElement = correlationBlock.findElement(baseLineElement);

      String dayToDayCorrelation = dayToDayCorrelationElement.getText();
      String baseLineCorrelation = baseLineCorrelationElement.getText();

      System.out.println("Day to Day Correlation: " + dayToDayCorrelation);
      System.out.println("BaseLine Correlation: " + baseLineCorrelation);

      // Check if graphs are available
      WebElement graphContainer = driver.findElement(grapCntainer);

      // Scroll to the graphContainer element
      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", graphContainer);
      
      if (graphContainer.isDisplayed()) {
          System.out.println("Graphs are available.");
      } else {
          System.out.println("No graphs found.");

          Thread.sleep(2000);
          /******************************/
          
      
           
          
      }
	}
    }
    



