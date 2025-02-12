/*https://chat.openai.com/share/c262f25b-bab9-4b0a-ae68-6065478296aa*/
package cuesz.membersummary.basic;

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

public class Case81_MS_Sleeptime extends BasePage {
	
	
	SeleniumUtils utils = new SeleniumUtils(driver);
	 // Create WebDriverWait
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as needed
	private By sleep = (By.xpath("//h6[normalize-space()='Sleep Data']"));  
		
    public Case81_MS_Sleeptime(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Test
    public void Sleeptime() throws InterruptedException {
        Thread.sleep(2000);

        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();
       
        Thread.sleep(2000);
  
        
     // Locate the element you want to scroll to
        WebElement element = driver.findElement(sleep);        
        // Create a JavascriptExecutor object
        JavascriptExecutor js = (JavascriptExecutor) driver;      
        // Use JavaScript to scroll to the element
        js.executeScript("arguments[0].scrollIntoView();", element);
	    
        try {
            // Define individual dropdown IDs and corresponding option texts
            String[][] dropdownOptions = {
                {"MemberSummary-SleepData-Duration", "7 Days", "14 Days", "30 Days", "60 Days"},
            };

            // Click on "CorrelationAnalysisDuration" first
            String dropdownIdDuration = "MemberSummary-SleepData-Duration";
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
                dropdownElementDuration.click();
                dropdownElementDuration.click();
                
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            // Handle exceptions here
        }
        Thread.sleep(4500);
        }    
    }
  
    
        
       
	    
      
    
    
  

