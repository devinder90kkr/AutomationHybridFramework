 /*https://chat.openai.com/share/fb99a8d3-9b88-4b49-8555-3f5eab0b24e5 */
package cuesz.membersummary.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.date.functions.DateGenerator;
import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;

public class Case34_MS_VO2Result extends BasePage {
	 //public static String eventDate = "26-10-2023"; // Date to be passed nextscandate below
	 public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date

	 SeleniumUtils utils = new SeleniumUtils(driver);
	private By elementScrollTo 	=	(By.xpath("//h4[contains(text(), 'VO2 Result')]"));
	private By selectype 	= 	(By.id("MemberSummary-Vo2Result-Duration"));
	private By selectype5 	= (By.id("MemberSummary-Vo2Result-NextScan-DatePicker"));

	

	 public Case34_MS_VO2Result(WebDriver driver) {
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

        Thread.sleep(3000);
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
        
        WebElement selecttype = driver.findElement(selectype);
        Actions builder1 = new Actions(driver);
//	    builder1.moveToElement(selecttype).click().sendKeys("24-08-2023").perform();
        builder1.moveToElement(selecttype).click().sendKeys("24").perform();
	    Thread.sleep(2000);
	    builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
  
	  
        
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
	    
	     
        Thread.sleep(2500);
//	    WebElement selecttype1 = driver.findElement(selctype2);
	    WebElement selecttype1 = driver.findElement(selectype);
        Actions builder2 = new Actions(driver);
//	    builder2.moveToElement(selecttype1).click().sendKeys("12-07-2023").perform();
        builder2.moveToElement(selecttype1).click().sendKeys("12").perform();
        Thread.sleep(2000);
	    builder2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        
	
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
        
        Thread.sleep(2500);
	  //  WebElement selecttype3 = driver.findElement(selctype3);
	    WebElement selecttype3 = driver.findElement(selectype);
        Actions builder3 = new Actions(driver);
//	    builder3.moveToElement(selecttype3).click().sendKeys("06-06-2023").perform();
        builder3.moveToElement(selecttype3).click().sendKeys("06").perform();
        Thread.sleep(2000);
	    builder3.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        
	
        
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
        
        
        /*Enter date and then click*/
	    Thread.sleep(2000);
	    WebElement nextscandate =driver.findElement(selectype5);
	    Actions builder112 = new Actions(driver);
	    builder112.moveToElement(nextscandate).click().sendKeys(eventDate).sendKeys(Keys.ENTER).perform();;
        
	 // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
	    
	    Thread.sleep(5000);
        
        }    
    
    
    }
  
    
        
       
	    
      
    
    
  

