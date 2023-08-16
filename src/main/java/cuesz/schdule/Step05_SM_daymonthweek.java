
package cuesz.schdule;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;

public class Step05_SM_daymonthweek extends BasePage {

	 private By scheduleIcon 	= (By.xpath("//a[@href='/schedule-master']//span//img[@alt='icon']"));
	 private By monthview 		= (By.xpath("//span[normalize-space()='Month']"));
	 private By dayview			= (By.xpath("//span[normalize-space()='Day']"));
	 private By weekview			= (By.xpath("//span[normalize-space()='Week']"));
	
	public Step05_SM_daymonthweek(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@Test
	public void Viewevent() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(scheduleIcon).click();
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		
	    Thread.sleep(2000);
	    driver.findElement(monthview).click();
	    
	    
	    driver.findElement(dayview).click();
	    
	    driver.findElement(weekview).click();
        
		}
	}	