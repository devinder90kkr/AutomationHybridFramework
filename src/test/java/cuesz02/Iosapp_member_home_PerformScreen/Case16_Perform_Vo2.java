package cuesz02.Iosapp_member_home_PerformScreen;

import java.util.HashMap;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import cuesz.utils.mobileLocators;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Perform detail")
@Feature ("Verify Additional perform activity functionlaity")


public class Case16_Perform_Vo2 extends AppiummobileBase {

	mobileLocators locators = new mobileLocators();	
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify perform screen & check Additional activity functionlaity.")
    @Story("here, we need to verify Additional perform activity functionality")	
	
	public void perfom_vo2activity() throws InterruptedException
	{	

		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");
		
		// CLick on home menu from bottom
		WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
		Homeicon.click();
		
		 Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject =new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("Perform Fuel Mindful Restore", "Perform");
		driver.executeScript("mobile:scroll", scrollObject);
		Thread.sleep(2000);
		 
		// CLick on Perform card
		WebElement performcard = driver.findElement(mobileLocators.performclick);
		performcard.click();
		
		Thread.sleep(2500);
		
		// Locate the element containing the perform
        WebElement Vo2card = driver.findElement(mobileLocators.Vo2label);
        // Extract text from the element
        String actualText = Vo2card.getText();
        // Define the expected text
        String expectedText = "VO2 Max Test";
        
        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText);
        System.out.println("Expected Text: " + expectedText);
        // Compare the actual and expected text
        Assert.assertEquals(actualText, expectedText);
        
     // Attach values to Allure report
        Allure.addAttachment("Actual Text", actualText);
        Allure.addAttachment("Expected Text", expectedText);
		
		WebElement Vo2start	= driver.findElement(mobileLocators.vo2tap);
		Vo2start.click();
		
	
		WebElement vo2heading =driver.findElement(mobileLocators.currentweighttap);

        // Check if the element is displayed
        if (vo2heading.isDisplayed()) {
            System.out.println("Current Weight popup is open.");
        } else {
            System.out.println("Current Weight popup is not open.");
        }
        // Extract text from the element
        String actualText1 = vo2heading.getText();
        // Define the expected text
        String expectedText1 = "Current Weight";
        
        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText1);
        System.out.println("Expected Text: " + expectedText1);
        // Compare the actual and expected text
        Assert.assertEquals(actualText1, expectedText1);
        
        // Attach values to Allure report
        Allure.addAttachment("Actual Text", actualText1);
        Allure.addAttachment("Expected Text", expectedText1);
        
        WebElement weightenter	= driver.findElement(mobileLocators.enterweight);
        weightenter.click();
        
        for (int i = 0; i < 5; i++) {
            WebElement deletebttn = driver.findElement(mobileLocators.deletetap);
            deletebttn.click();
        }

        WebElement num1 = driver.findElement(mobileLocators.num1);
        num1.click();
        
        WebElement num2 = driver.findElement(mobileLocators.num2);
        num2.click();

        WebElement num3 = driver.findElement(mobileLocators.num3);
        num3.click();
        
        WebElement num4 = driver.findElement(mobileLocators.num4);
        num4.click();
        
        WebElement num5 = driver.findElement(mobileLocators.num5);
        num5.click();
        
        WebElement Donclick = driver.findElement(mobileLocators.doneclick);
        Donclick.click();
                
		WebElement submitcurrentweight 	= driver.findElement(mobileLocators.Ticktap);
		submitcurrentweight.click();
			
		// Check if the Crossclick element is displayed before clicking on it
		WebElement notificationclick = null;
		try {
			notificationclick = driver.findElement(mobileLocators.okatap);
		    if (notificationclick.isDisplayed()) {
		    	notificationclick.click();
		    } else {
		        // Handle the case where the element is not displayed
		        System.out.println("OK element is not displayed.");
		        // Perform some other action or throw an exception if needed
		    }
		} catch (NoSuchElementException e) {
		    // Handle the case where the element is not found
		    System.out.println("Crossclick element not found.");
		    // Perform some other action or throw an exception if needed
		}
		
		// Locate the element containing the Vo2 for main screen
        WebElement Vo2card1 = driver.findElement(mobileLocators.Vo2label1);
        // Extract text from the element
        String actualText2 = Vo2card1.getText();
        // Define the expected text
        String expectedText2 = "VO2 Max Test";
        
        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText2);
        System.out.println("Expected Text: " + expectedText2);
        // Compare the actual and expected text
        Assert.assertEquals(actualText2, expectedText2);	
        
        // Attach values to Allure report
        Allure.addAttachment("Actual Text", actualText2);
        Allure.addAttachment("Expected Text", expectedText2);
        
				
     // Locate the element containing for the counter for Vo2 max main screen
        WebElement counter = driver.findElement(mobileLocators.count);
        // Extract text from the element
        String actualText3 = counter.getText();
        // Define the expected text
        String expectedText3 = "06:00";
        
        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText3);
        System.out.println("Expected Text: " + expectedText3);
        // Compare the actual and expected text
        Assert.assertEquals(actualText3, expectedText3);
        
        // Attach values to Allure report
        Allure.addAttachment("Actual Text", actualText3);
        Allure.addAttachment("Expected Text", expectedText3);
        
        WebElement startactivitybttn	= driver.findElement(mobileLocators.Startbutton);
		// Extract text from the element
	    String actualText4 = startactivitybttn.getText();
	    // Define the expected text
	    String expectedText4 = "Start VO2 Test";

	    // Print the actual and expected text to the console
	    System.out.println("Actual Text: " + actualText4);
	    System.out.println("Expected Text: " + expectedText4);
	    
	    // Attach values to Allure report
        Allure.addAttachment("Actual Text", actualText4);
        Allure.addAttachment("Expected Text", expectedText4);
        
        startactivitybttn.click();
        
        // Check if the Crossclick element is displayed before clicking on it
 		WebElement syncmydeviceclick = null;
 		try {
 			syncmydeviceclick = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"Sync my device\"])[5]"));
 		    if (syncmydeviceclick.isDisplayed()) {
 		    	syncmydeviceclick.click();
 		    } else {
 		        // Handle the case where the element is not displayed
 		        System.out.println("OK element is not displayed.");
 		        // Perform some other action or throw an exception if needed
 		    }
 		} catch (NoSuchElementException e) {
 		    // Handle the case where the element is not found
 		    System.out.println("Crossclick element not found.");
 		    // Perform some other action or throw an exception if needed
 		}
        
        
        
        
    		
		Thread.sleep(3500);
        driver.terminateApp("com.cuesz.mobile");
	
	
	
	}}
