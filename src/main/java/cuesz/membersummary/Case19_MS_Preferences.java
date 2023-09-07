package cuesz.membersummary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.AllureUtils;
import cuesz.utils.SeleniumUtils;

public class Case19_MS_Preferences extends BasePage {
	
	SeleniumUtils utils = new SeleniumUtils(driver);
	
	//private By membritms	=  (By.xpath("//div[@class='member-items']"));
	private By plsicn		=  (By.xpath("//div[@class='graph_icon active']/em/img"));
	private By prefnceInpt =(By.cssSelector("textarea.form-control"));
	private By savbttn	 = (By.cssSelector("button.btn_edit"));
	private By editbttn	= (By.xpath("//button[@class='btn_edit btn-transparent']"));
	private By prefrnceTxtArea	= (By.cssSelector("textarea.form-control"));
	private By deletbttn	= (By.cssSelector("img[alt='delete']"));
   
	
	
	public Case19_MS_Preferences(WebDriver driver) {
		super(driver);
	}
    @Test
    public void Preferences() throws InterruptedException {
        Thread.sleep(2000);

        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();
        

        Thread.sleep(2000);
       // driver.findElement(membritms).click();
        
     // Find the plus icon and click on it
        WebElement plusIcon = driver.findElement(plsicn);
        plusIcon.click();

        // Find the preference input text field and fill in some information
        WebElement preferenceInput = driver.findElement(prefnceInpt);
        preferenceInput.sendKeys("Some preference information");

        // Find the save button and click on it
        WebElement saveButton = driver.findElement(savbttn);
        saveButton.click();

        Thread.sleep(3000);
    
            // Text is available, click on the edit button
            WebElement editButton = driver.findElement(editbttn);
            editButton.click();

            // Find the textarea and update the information
            WebElement preferenceTextArea = driver.findElement(prefrnceTxtArea);
            preferenceTextArea.clear();
            preferenceTextArea.sendKeys("Updated preference information");
            
         // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");

            // Click on the delete icon to remove the preference
            WebElement deleteIcon = driver.findElement(deletbttn);
            deleteIcon.click();
           }
        
        
    		}
	    
    //}

