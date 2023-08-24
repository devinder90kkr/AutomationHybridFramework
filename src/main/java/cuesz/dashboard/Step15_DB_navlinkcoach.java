package cuesz.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;

public class Step15_DB_navlinkcoach extends BasePage {
	
	private By schdulemastr = (By.id("Dashboard-Schedule"));
	private By elemnt = (By.id("dashboard"));
	private By Golive= (By.id("Dashboard-GoLive"));
	private By knwledge	= (By.id("Dashboard-Knowledge"));
	private By staffcomm = (By.id("Dashboard-StaffCommunication"));
	private By membersummary	=	(By.id("Dashboard-MemberSpecs"));
	private By pendingsesson = 	(By.id("Dashboard-PendingSessionOutcomes"));

	
	
	 public Step15_DB_navlinkcoach(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	 @Test 
		public void Navigationfunctionality() throws InterruptedException {
		 
		 Thread.sleep(2000);
		 driver.findElement(schdulemastr).click();
		 
		 Thread.sleep(2000);
		 WebElement element = driver.findElement(elemnt);
		 Actions actions = new Actions(driver);
		 actions.moveToElement(element).click().build().perform();
		 
		 driver.findElement(Golive).click();
		 
		 WebElement element2 = driver.findElement(elemnt);
		 Actions actions2 = new Actions(driver);
		 actions2.moveToElement(element2).click().build().perform();
		  
		 driver.findElement(knwledge).click();
		 
		 
		 WebElement element3 = driver.findElement(elemnt);
		 Actions actions3 = new Actions(driver);
		 actions3.moveToElement(element3).click().build().perform();
		 
		 driver.findElement(staffcomm).click();
		 
		 WebElement element4 = driver.findElement(elemnt);
		 Actions actions4 = new Actions(driver);
		 actions4.moveToElement(element4).click().build().perform();
		 
		 Thread.sleep(2000);
		 driver.findElement(membersummary).click();
		 
		 WebElement element5 = driver.findElement(elemnt);
		 Actions actions5 = new Actions(driver);
		 actions5.moveToElement(element5).click().build().perform();
		 
		 Thread.sleep(2000);
		 driver.findElement(pendingsesson).click();
		 
	 }

}
