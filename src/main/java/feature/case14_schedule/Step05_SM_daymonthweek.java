
package feature.case14_schedule;

// import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BasePage;
import constant.weblocators;

public class Step05_SM_daymonthweek extends BasePage {
	
	public Step05_SM_daymonthweek(WebDriver driver) {
		super(driver);
		
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