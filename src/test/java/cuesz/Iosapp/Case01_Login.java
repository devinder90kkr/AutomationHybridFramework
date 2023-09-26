package cuesz.Iosapp;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import io.appium.java_client.AppiumBy;

public class Case01_Login extends AppiummobileBase {

	
	@Test
	public void login() throws InterruptedException
	{
		
		WebElement countryvalues = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"🇺🇸\"])[2]"));
		countryvalues.click();
		
		WebElement countryname = driver.findElement(AppiumBy.accessibilityId("text-input-country-filter"));
		countryname.sendKeys("India");
		
		WebElement indiaselection = driver.findElement(AppiumBy.accessibilityId("country-selector-IN"));
		indiaselection.click();
		
		Thread.sleep(2500);
		WebElement mobilefield	= driver.findElement(AppiumBy.xpath("//XCUIElementTypeOther[@name=\"Mobile Number\"]/XCUIElementTypeTextField"));
		mobilefield.sendKeys("9671114235");
		
		
		
		Thread.sleep(5500);
	}
	
}

