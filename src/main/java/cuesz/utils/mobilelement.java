package cuesz.utils;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

public class mobilelement {
	
	// Method to get text from an element
	public static String getElementText(AppiumDriver driver, By elementLocator) {
	    WebElement element = driver.findElement(elementLocator);
	    return element.getText();
	}
	
	
		// Method to perform horizontal swipe
		public static void performHorizontalSwipe(AppiumDriver driver) {
		    // Screen size
		    int screenWidth = driver.manage().window().getSize().width;
		    int screenHeight = driver.manage().window().getSize().height;
		
		    // Define start and end points for the swipe
		    int startX = (int) (screenWidth * 0.9);
		    int endX = (int) (screenWidth * 0.1);
		    int startY = screenHeight / 2;
		
		    // Create the touch actions using PointerInput
		    PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		    Sequence swipe = new Sequence(finger, 1);
		
		    swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
		    swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		    swipe.addAction(finger.createPointerMove(Duration.ofSeconds(1), PointerInput.Origin.viewport(), endX, startY));
		    swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		
		    driver.perform(Arrays.asList(swipe));
		}
	
	
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
	    
	    // Method to send keys to an element
	    public static void sendKeysToElement(AppiumDriver driver, By elementLocator, String text) {
	        WebElement element = driver.findElement(elementLocator);
	        element.sendKeys(text);
	    }
	    public static boolean isElementPresent(AppiumDriver driver, By locator) {
	        try {
	            // Attempt to find the element
	            driver.findElement(locator);
	            return true; // Element found
	        } catch (org.openqa.selenium.NoSuchElementException e) {
	            return false; // Element not found
	        }
	    }

}
	

