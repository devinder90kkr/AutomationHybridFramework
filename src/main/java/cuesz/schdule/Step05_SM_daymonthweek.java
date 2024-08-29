
package cuesz.schdule;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.web.resources.weblocators;

public class Step05_SM_daymonthweek extends BasePage {
	
	public Step05_SM_daymonthweek(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@Test
	public void Viewevent() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(weblocators.scheduleIcon).click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");		
	    Thread.sleep(2000);
	    driver.findElement(weblocators.monthview).click();
	    driver.findElement(weblocators.dayview).click();
	    driver.findElement(weblocators.weekview).click();
        
		}
	}	