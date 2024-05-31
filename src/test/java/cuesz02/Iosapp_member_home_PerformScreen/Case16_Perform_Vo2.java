package cuesz02.Iosapp_member_home_PerformScreen;

import java.util.HashMap;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AllureUtils;
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
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Case16_Perform_Vo2.class);
	
	mobileLocators locators = new mobileLocators();	
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify perform screen & check Additional activity functionlaity.")
    @Story("here, we need to verify Additional perform activity functionality")	
	
	public void perfom_vo2activity() throws InterruptedException{	
try {
		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");
		
		// CLick on home menu from bottom
		WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
		Homeicon.click();
		
		 // Log console message to Allure
        LOGGER.info("Click on home menu from bottom");
        AllureUtils.logStep("Click on home menu from bottom");
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Vo21");
		
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
		
		 // Log console message to Allure
        LOGGER.info("Click on perform card ");
        AllureUtils.logStep("Click on perform card");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Vo22");
        
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

        // Log console message to Allure
        LOGGER.info("Extract Vo2 label heading");
        AllureUtils.logStep(actualText);
        AllureUtils.logStep(expectedText);
            
        
		WebElement Vo2start	= driver.findElement(mobileLocators.vo2tap);
		Vo2start.click();
		   // Log console message to Allure
			LOGGER.info("Click on Vo2 start ");
	        AllureUtils.logStep("Click on vo2 start ");
	        // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "Vo23");
	
		WebElement vo2heading =driver.findElement(mobileLocators.currentweighttap);

        // Check if the element is displayed
        if (vo2heading.isDisplayed()) {
            System.out.println("Current Weight popup is open.");
            
            AllureUtils.logStep("Current Weight popup is open.");
        } else {
            System.out.println("Current Weight popup is not open.");
            AllureUtils.logStep("Current Weight popup is not open.");
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
        
        
        // Log console message to Allure
        LOGGER.info("Extract label for current weight popup");
        AllureUtils.logStep(actualText1);
        AllureUtils.logStep(expectedText1);
        
        WebElement weightenter	= driver.findElement(mobileLocators.enterweight);
        weightenter.click();
        
        // Log console message to Allure
     			LOGGER.info("Enter weight info for Vo2 start ");
     	        AllureUtils.logStep("Enter weight detail for vo2 start ");
     	        // Capture a screenshot and attach it to Allure
     	        AllureUtils.captureScreenshot(driver, "Vo24");
        
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
        
        	// Log console message to Allure
			LOGGER.info("Fill rating for Vo2 screem and click on done");
	        AllureUtils.logStep("Fill rating for Vo2 screem and click on done");
	        // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "Vo25");
        
		WebElement submitcurrentweight 	= driver.findElement(mobileLocators.Ticktap);
		submitcurrentweight.click();
		
		// Log console message to Allure
					LOGGER.info("Click on tick icon");
			        AllureUtils.logStep("Click on tick icon");
			        // Capture a screenshot and attach it to Allure
			        AllureUtils.captureScreenshot(driver, "Vo26");
			
		// Check if the Crossclick element is displayed before clicking on it
		WebElement notificationclick = null;
		try {
			notificationclick = driver.findElement(mobileLocators.okatap);
		    if (notificationclick.isDisplayed()) {
		    	notificationclick.click();
		    	
		    	LOGGER.info("Click on nitification for allow");
		        AllureUtils.logStep("Click on notification for allow");
		    } else {
		        // Handle the case where the element is not displayed
		        System.out.println("OK element is not displayed.");
		        AllureUtils.logStep("OK element is not displayed.");
		        // Perform some other action or throw an exception if needed
		    }
		} catch (NoSuchElementException e) {
		    // Handle the case where the element is not found
		    System.out.println("Crossclick element not found.");
		    AllureUtils.logStep("Crossclick element not found.");
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
        
        // Log console message to Allure
        LOGGER.info("Extract label for VO2 Max Test");
        AllureUtils.logStep(actualText2);
        AllureUtils.logStep(expectedText2);
               
				
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
        
     // Log console message to Allure
        LOGGER.info("Extract label for vo2 duration");
        AllureUtils.logStep(actualText3);
        AllureUtils.logStep(expectedText3);
        
        
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
        
        
     // Log console message to Allure
        LOGGER.info("Extract label for Start vo2");
        AllureUtils.logStep(actualText4);
        AllureUtils.logStep(expectedText4);
        
        startactivitybttn.click();
        
        // Check if the Crossclick element is displayed before clicking on it
 		WebElement syncmydeviceclick = null;
 		try {
 			syncmydeviceclick = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"Sync my device\"])[5]"));
 		    if (syncmydeviceclick.isDisplayed()) {
 		    	syncmydeviceclick.click();
 		    	AllureUtils.logStep("Click on syncmydeviceclick");
 		    	
 		    	
 		    } else {
 		        // Handle the case where the element is not displayed
 		        System.out.println("OK element is not displayed.");
 		       AllureUtils.logStep("Crossclick element not found.");
 		        // Perform some other action or throw an exception if needed
 		    }
 		} catch (NoSuchElementException e) {
 		    // Handle the case where the element is not found
 		    System.out.println("Crossclick element not found.");
 		   AllureUtils.logStep("Crossclick element not found.");
 		    // Perform some other action or throw an exception if needed
 		}
        
        
        
        
    		
} catch (Exception e) {
    LOGGER.error("An error occurred during the mindful screen test", e);
    AllureUtils.logStep("An error occurred: " + e.getMessage());
} finally {
    // Terminate the app whether the test passed or failed
    try {
        Thread.sleep(8500);
    } catch (InterruptedException e) {
        LOGGER.error("Thread interrupted during final sleep", e);
        Thread.currentThread().interrupt();
    }
    driver.terminateApp("com.cuesz.mobile");
}
}}