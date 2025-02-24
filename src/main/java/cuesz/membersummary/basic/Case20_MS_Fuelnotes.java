package cuesz.membersummary.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;

public class Case20_MS_Fuelnotes extends BasePage {
	
	SeleniumUtils utils = new SeleniumUtils(driver);
	
	//private By membritms	=  (By.xpath("//div[@class='member-items']"));
	//private By pluicn		=  (By.xpath("//ul[@class='list-unstyled pref_items fuel_notes']//em"));
	private By pluicn		=  (By.id("MemberSummary-FuelNotesAdd"));
	private By prefTexAre	= (By.id("MemberSummary-FuelNotes-AddNotes"));
	//private By prefrnInpt	= (By.xpath("//textarea[@class='form-control']"));
	private By savbttn	=	(By.xpath("//img[@id=\"MemberSummary-FuelNotes-Save\"]"));
	private By editbttn	= (By.xpath("//img[@id=\"MemberSummary-FuelNotes-Edit\"]"));
	
	private By deltbttn	= (By.xpath("//i[@class='rem_icon']//img[@alt='delete']"));

    public Case20_MS_Fuelnotes(WebDriver driver) {
		super(driver);
		
	}

    @Test
    public void Fuel_notes() throws InterruptedException {
        Thread.sleep(2000);

        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();

        Thread.sleep(2000);
        //driver.findElement(membritms).click();
        
     // Find the plus icon and click on it
        WebElement plusIcon = driver.findElement(pluicn);
        plusIcon.click();

     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
        
        // Find the preference input text field and fill in some information
        WebElement preferenceInput = driver.findElement(prefTexAre);
        preferenceInput.sendKeys("Some preference information");

        // Find the save button and click on it
        WebElement saveButton = driver.findElement(savbttn);
        saveButton.click();

     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
        Thread.sleep(3000);
    
            // Text is available, click on the edit button
            WebElement editButton = driver.findElement(editbttn);
            editButton.click();
         // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
            
            // Find the textarea and update the information
            WebElement preferenceTextArea = driver.findElement(prefTexAre);
            preferenceTextArea.clear();
            preferenceTextArea.sendKeys("Updated preference information");
            
            // Find the save button and click on it
            WebElement saveButton1 = driver.findElement(savbttn);
            saveButton1.click();

         // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
            
         // Text is available, click on the edit button
            WebElement editButton2 = driver.findElement(editbttn);
            editButton2.click();
            
         // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
            
            // Click on the delete icon to remove the preference
            WebElement deleteIcon = driver.findElement(deltbttn);
            deleteIcon.click();
            
         // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
    Thread.sleep(2500);       
    }
        
        
    		}
	    
    //}

