package cuesz.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.pages.BasePage;
import cuesz.web.resources.ElementActions;

public class Step14_DB_Clock extends BasePage {
	
	private By plsIcon = (By.xpath("//div[@class='btn_grey']"));
	private By serchInput = (By.xpath("//input[@placeholder='Search here...']"));
	private By drpdwnValue = (By.xpath("//li[contains(span, 'India, Delhi, Delhi (IST)')]"));
	private By tickcion = (By.xpath("//button[@id='Dashboard-Clock-AddNew']"));
    private By dlteBttn = (By.xpath("//span[@id='Dashboard-Clock-Delete-2']//img"));
  
    
    private ElementActions elementActions;

	public Step14_DB_Clock(WebDriver driver) {
		super(driver);
		this.elementActions = new ElementActions(driver); // Initialize elementActions
		
	}

	@Test
	public void Clock() throws InterruptedException {
		
		Thread.sleep(2500);
		elementActions.clickElement(plsIcon);
		
		elementActions.sendKeysToElement(serchInput, "delh");
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Step14_DB_Clock1");
		
		elementActions.clickElement(drpdwnValue);
		
		elementActions.clickElement(tickcion);
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Step14_DB_Clock2");
        Thread.sleep(3000);
        elementActions.clickElement(dlteBttn);
        
        Thread.sleep(1500);
		
		
	}
}

