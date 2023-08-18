package cuesz.membersummary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;

public class Case20_MS_Fuelnotes extends BasePage {
	
	SeleniumUtils utils = new SeleniumUtils(driver);
	
	//private By membritms	=  (By.xpath("//div[@class='member-items']"));
	private By pluicn		=  (By.xpath("//ul[@class='list-unstyled pref_items fuel_notes']//em"));
	private By prefrnInpt	= (By.xpath("//textarea[@class='form-control']"));
	private By savbttn	=	(By.cssSelector("button.btn_edit"));
	private By editbttn	= (By.xpath("//button[@class='btn_edit btn-transparent']"));
	private By prefTexAre	= (By.xpath("//textarea[@class='form-control']"));
	private By deltbttn	= (By.xpath("//i[@class='rem_icon']//img[@alt='delete']"));

    public Case20_MS_Fuelnotes(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

    @Test
    public void Fuel_notes() throws InterruptedException {
        Thread.sleep(2000);

        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText("Kumar Devinder");
        utils.clickMembername();

        Thread.sleep(2000);
        //driver.findElement(membritms).click();
        
     // Find the plus icon and click on it
        WebElement plusIcon = driver.findElement(pluicn);
        plusIcon.click();

        // Find the preference input text field and fill in some information
        WebElement preferenceInput = driver.findElement(prefrnInpt);
        preferenceInput.sendKeys("Some preference information");

        // Find the save button and click on it
        WebElement saveButton = driver.findElement(savbttn);
        saveButton.click();

        Thread.sleep(3000);
    
            // Text is available, click on the edit button
            WebElement editButton = driver.findElement(editbttn);
            editButton.click();

            // Find the textarea and update the information
            WebElement preferenceTextArea = driver.findElement(prefTexAre);
            preferenceTextArea.clear();
            preferenceTextArea.sendKeys("Updated preference information");

            // Click on the delete icon to remove the preference
            WebElement deleteIcon = driver.findElement(deltbttn);
            deleteIcon.click();
           }
        
        
    		}
	    
    //}

