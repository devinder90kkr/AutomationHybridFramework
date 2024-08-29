 /*https://chat.openai.com/share/fb99a8d3-9b88-4b49-8555-3f5eab0b24e5 */
package cuesz.membersummary;

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

import cuesz.allure.reporting.AllureUtils;
import cuesz.date.functions.Currentdategenerator;
import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;

public class Case34_01_MS_VO2assigntomember extends BasePage {
	 //public static String eventDate = "26-10-2023"; // Date to be passed nextscandate below
//	 public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date

	 public static String eventDate = Currentdategenerator.generateCurrentDate(); // Use the generated date
	 
	 SeleniumUtils utils = new SeleniumUtils(driver);
	private By elementScrollTo 	=	(By.xpath("//h4[contains(text(), 'VO2 Result')]"));
	private By selectype5 	= (By.id("MemberSummary-Vo2Result-NextScan-DatePicker"));

	

	 public Case34_01_MS_VO2assigntomember(WebDriver driver) {
		super(driver);
	
	}

    @Test
    public void bodyscan() throws InterruptedException {
        Thread.sleep(2000);

        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();
        // Scroll to the "Team Leader Coach Notes" heading
        
        Thread.sleep(3000);
        // Replace this with the actual locator for your element
        WebElement elementToScrollTo = driver.findElement(elementScrollTo);

        // Scroll to the element using JavaScript Executor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);

        Thread.sleep(3500);
        WebElement multiwsitch = driver.findElement(By.id("MemberSummary-Vo2Result-NextScan-Switch"));
        multiwsitch.click();
        
//        Thread.sleep(3000);       
//        /*Enter date and then click*/
//	    Thread.sleep(2000);
	    WebElement nextscandate =driver.findElement(selectype5);
	    nextscandate.click();
	    //	    Actions builder112 = new Actions(driver);
//	    builder112.moveToElement(nextscandate).click().sendKeys(eventDate).sendKeys(Keys.ENTER).perform();;
//         
	    
        
        
     // Explicitly wait for the date element to be clickable based on role and aria-disabled attributes
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement dateElement = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[role='option'][aria-disabled='false']")));
        // Click the date element to select it
        dateElement.click();
        
        
	 // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
	    
	    Thread.sleep(5000);
        
        }    
    
    
    }
  
    
        
       
	    
      
    
    
  

