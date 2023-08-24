package cuesz.dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;

public class Step12_DB_navlink extends BasePage {
	
	
	private By schdulemastr = (By.id("Dashboard-ScheduleMaster"));
	private By elemnt = (By.id("dashboard"));
	private By Membrcommunicate	 =	(By.id("Dashboard-MemberCommunication"));
	private By stafcommuniction	=	(By.id("Dashboard-StaffCommunication"));
	private By knwledge	= (By.id("Dashboard-Knowledge"));
	private By membersummary	=	(By.id("Dashboard-Knowledge"));

	
	
	 public Step12_DB_navlink(WebDriver driver) {
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
		 
		 Thread.sleep(2000);
		 driver.findElement(Membrcommunicate).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(elemnt).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(stafcommuniction).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(elemnt).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(knwledge).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(elemnt).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(membersummary).click();
		 
	 }

}
