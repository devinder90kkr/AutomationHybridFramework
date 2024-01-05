package cuesz.utils;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class mobilelement {
	
		// mobile scroll down method
		public static void scrollDownToElement(AppiumDriver driver, String elementText) throws InterruptedException {
        HashMap<String, Object> scrollObject = new HashMap<>();
        scrollObject.put("direction", "down");
        scrollObject.put(elementText, elementText);
        driver.executeScript("mobile:scroll", scrollObject);
        Thread.sleep(2000); // You can adjust the sleep duration as needed
    }

		// mobile scroll up method
		public static void scrollupToElement(AppiumDriver driver, String elementText) throws InterruptedException {
	    HashMap<String, Object> scrollObject = new HashMap<>();
	    scrollObject.put("direction", "up");
	    scrollObject.put(elementText, elementText);
	    driver.executeScript("mobile:scroll", scrollObject);
	    Thread.sleep(2000); // You can adjust the sleep duration as needed
	    }
	
	 
		// Generic click method
	    public static void clickElement(AppiumDriver driver, By elementLocator) {
	        WebElement element = driver.findElement(elementLocator);
	        element.click();
	    }
	    
	    // Generic click method for Keypad input
	    public static void clickElementByText(AppiumDriver driver, String text) {
	        By locator = AppiumBy.iOSNsPredicateString("label == \"" + text + "\"");
	        WebElement element = driver.findElement(locator);
	        element.click();
	    }
	    
	    // Method for looping for click mulitple time in fuel plus or anyother place
	    public static void clickElementMultipleTimes(AppiumDriver driver, By locator, int numberOfClicks) {
	        WebElement element = driver.findElement(locator);
	        for (int i = 0; i < numberOfClicks; i++) {
	            element.click();
	        }
	    }
	    
	    // Method for Time selection in mobile
	    public static void setPickerValues(AppiumDriver driver, By timeLocator, By pickerLocator, String[] valuesToSet) throws InterruptedException {
        WebElement timerClick = driver.findElement(timeLocator);
        timerClick.click();

        List<WebElement> values = driver.findElements(pickerLocator);
        for (int i = 0; i < valuesToSet.length; i++) {
            values.get(i).sendKeys(valuesToSet[i]);
            values.get(i).sendKeys(Keys.TAB);
            Thread.sleep(3500); // Adjust the sleep duration as needed
        }
	    
	    
	    
	    
	    
	    }   
}
	

