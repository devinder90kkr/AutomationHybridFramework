/*https://chat.openai.com/share/c262f25b-bab9-4b0a-ae68-6065478296aa*/
package cuesz.membersummary;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.AllureUtils;
import cuesz.utils.SeleniumUtils;

public class Case80_MS_Sessionoutcome extends BasePage {
	
	SeleniumUtils utils = new SeleniumUtils(driver);
	
	private By Sesionoutcme = (By.id("MemberSummary-SessionOutcome"));
	
	private By selectype = (By.id("SessionOutcome-Selectdateoftheliveperformsession"));
	
  

    public Case80_MS_Sessionoutcome(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Test
    public void Sessionoutcomes() throws InterruptedException {
        Thread.sleep(2000);

        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();
       
        Thread.sleep(2000);
        WebElement sessionoutcome = driver.findElement(Sesionoutcme);
        sessionoutcome.click();
    
        
        Thread.sleep(5500);
	    WebElement selecttype1 = driver.findElement(selectype);
        Actions builder1 = new Actions(driver);
	    builder1.moveToElement(selecttype1).click().sendKeys("14-06-2023").perform();
	    Thread.sleep(2000);
	    builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	 
	    // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "sessionoutcomes");
   
	    Thread.sleep(3500);
	    WebElement selecttype2 = driver.findElement(selectype);	          
        Actions builder2 = new Actions(driver);
	    builder2.moveToElement(selecttype2).click().sendKeys("24-05-2023").perform();
	    Thread.sleep(2000);
	    builder2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        
	 // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "sessionoutcomes");
	              
	    Thread.sleep(5500);
	    WebElement selecttype21 = driver.findElement(selectype);     
        Actions builder21 = new Actions(driver);
	    builder21.moveToElement(selecttype21).click().sendKeys("14-09-2022").perform();
	    Thread.sleep(2000);
	    builder21.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	    
	   	    
        Thread.sleep(4500);
        }    
    }
  
    
        
       
	    
      
    
    
  

