package cuesz01.Iosapp_member_homeScreen;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AllureUtils;
import cuesz.utils.AppiumappUtils;
import cuesz.utils.mobileLocators;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Home screen detail ")
@Feature ("Verify Live perform icon when event time min 15 min")


public class Case10_Homescreen_LPwith15min extends AppiummobileBase {
	
	mobileLocators locators = new mobileLocators();	
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify home screen & check LP redirection to perform card on homescreen.")
    @Story("here, we need to verify LP icon functionality redirection to perform screen if counter equal or less than 15 min")	
	
	public void HomescreenLiveperfrom() throws InterruptedException
	{	

		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");
		
		// CLick on home menu from bottom
		WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
		Homeicon.click();
		
		   // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "LP icon");
				
//        Thread.sleep(3500);
//		WebElement livePerform = driver.findElement(mobileLocators.liveperfrmicon);
//		livePerform.click();
		
		  // Check if the Crossclick element is displayed before clicking on it
				WebElement livePerform = null;
				try {
					livePerform = driver.findElement(mobileLocators.liveperfrmicon);
				    if (livePerform.isDisplayed()) {
				    	livePerform.click();
				    } else {
				        // Handle the case where the element is not displayed
				        System.out.println("Live perform element is displayed but not clickable may be its LP greater than 15 min");
				        // Perform some other action or throw an exception if needed
				    }
				} catch (NoSuchElementException e) {
				    // Handle the case where the element is not found
				    System.out.println("Live perform element not found.");
				    // Perform some other action or throw an exception if needed
				}
		
		
		  // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform selection");
        
//     // Method to scroll to perform screen
//     		HashMap<String,Object>scrollObject =new HashMap<>();
//     		scrollObject.put("direction", "down");
//     		scrollObject.put("Start Live Perform", "Start Live Perform");
//     		driver.executeScript("mobile:scroll", scrollObject);
     		
     		  // Capture a screenshot and attach it to Allure
      		
//        
     // Scroll to "Start Live Perform" without specifying the time
        By imaguploadLocator = AppiumBy.accessibilityId("Live Perform");
        if (!isElementPresent(driver, imaguploadLocator)) {
            // Scroll to "Start Live Perform" if it's not present
            HashMap<String, Object> scrollObject = new HashMap<>();
            scrollObject.put("Live Perform", "Live Perform'");
            driver.executeScript("mobile:scroll", scrollObject);
            Thread.sleep(2000);
        }   		
            AllureUtils.captureScreenshot(driver, "perform selection1");
	
		Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
	
	}
	// Function to check if an element is present on the screen
			public boolean isElementPresent(AppiumDriver driver, By by){
			    try{
			        driver.findElement(by);
			        return true;
			    } catch (NoSuchElementException e){
			        return false;
			    }
			}
	

}
