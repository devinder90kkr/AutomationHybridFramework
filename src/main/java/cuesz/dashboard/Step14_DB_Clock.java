//package cuesz.dashboard;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.Test;
//
//import cuesz.pages.BasePage;
//
//public class Step14_DB_Clock extends BasePage {
//	
//	private By plsIcon = (By.xpath("//div[@class='btn_grey']"));
//	private By serchInput = (By.xpath("//input[@placeholder='Search here...']"));
//	private By drpdwnValue = (By.xpath("//li[contains(span, 'India, Delhi, Delhi (IST)')]"));
//	private By tickcion = (By.xpath("//button[@class='btn btn-primary btn_check ms-2']"));
//    private By dlteBttn = (By.xpath("//span[@class='del_btn']"));
//  
//
//	public Step14_DB_Clock(WebDriver driver) {
//		super(driver);
//		// TODO Auto-generated constructor stub
//	}
//
//	@Test
//	public void Clock() throws InterruptedException {
//		
//		 // Click on the plus icon
//        WebElement plusIcon = driver.findElement(plsIcon);
//        plusIcon.click();
//
//        // Search for "delh"
//        WebElement searchInput = driver.findElement(serchInput);
//        searchInput.sendKeys("delh");
//
//        // Wait for the dropdown list to appear
//        // Assuming the list appears dynamically, you may need to add a wait here
//
//        // Select the desired value from the dropdown list
//        WebElement dropdownValue = driver.findElement(drpdwnValue);
//        dropdownValue.click();
//
//        // Click on the tick icon to add the clock
//        WebElement tickIcon = driver.findElement(tickcion);
//        tickIcon.click();
//
//        Thread.sleep(3000);
//        
//        WebElement deleteButton = driver.findElement(dlteBttn);
//        // Click on the delete button
//        deleteButton.click();
//        Thread.sleep(1500);
//		
//		
//	}
//}

package cuesz.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.reporting.AllureUtils;
import cuesz.utils.web.ElementActions;

public class Step14_DB_Clock extends BasePage {
	
	private By plsIcon = (By.xpath("//div[@class='btn_grey']"));
	private By serchInput = (By.xpath("//input[@placeholder='Search here...']"));
	private By drpdwnValue = (By.xpath("//li[contains(span, 'India, Delhi, Delhi (IST)')]"));
	private By tickcion = (By.xpath("//button[@class='btn btn-primary btn_check ms-2']"));
    private By dlteBttn = (By.xpath("//span[@class='del_btn']"));
  
    
    private ElementActions elementActions;

	public Step14_DB_Clock(WebDriver driver) {
		super(driver);
		this.elementActions = new ElementActions(driver); // Initialize elementActions
		// TODO Auto-generated constructor stub
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

