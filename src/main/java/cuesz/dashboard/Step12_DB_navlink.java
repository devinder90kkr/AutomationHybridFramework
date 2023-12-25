package cuesz.dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.weblocators;

public class Step12_DB_navlink extends BasePage {
	
	weblocators locators = new weblocators();
	
	 public Step12_DB_navlink(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	 @Test 
		public void Navigationfunctionality() throws InterruptedException {
		 
		 Thread.sleep(2000);
		 driver.findElement(weblocators.schdulemastr).click();
		 
		 Thread.sleep(2000);
		 WebElement element = driver.findElement(weblocators.elemnt);
		 Actions actions = new Actions(driver);
		 actions.moveToElement(element).click().build().perform();
		 
		 Thread.sleep(2000);
		 driver.findElement(weblocators.Membrcommunicate).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(weblocators.elemnt).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(weblocators.stafcommuniction).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(weblocators.elemnt).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(weblocators.knwledge).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(weblocators.elemnt).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(weblocators.membersummary).click();
		 
	 }

}
