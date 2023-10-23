package cuesz02.Iosapp_member_home_PerformScreen;

import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import io.appium.java_client.AppiumBy;
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

	private By Homeclick = 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By performclick	= AppiumBy.accessibilityId("PERFORM_SCREEN");
	private By Vo2label 		= AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"VO2 Max Test\"`]");
	private By vo2tap			= AppiumBy.accessibilityId("VO2 Max Test Start");
	private By Ticktap			= AppiumBy.accessibilityId("Submit");
	private By okatap			= AppiumBy.accessibilityId("OK");
	private By Vo2label1		= AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"VO2 Max Test\"]");
	private By count			= AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"06:00\"]");
	private By synclick			= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"SyncDevice\"])[2]");
	private By Enabletick		= AppiumBy.accessibilityId("EnableBluetooth");
	private By Startbutton		= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"Start\n"
			+ "VO2 Test\"])[2]");
	
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
		WebElement Homeicon = driver.findElement(Homeclick);
		Homeicon.click();
		
		 Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject =new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("Perform Fuel Mindful Restore", "Perform");
		driver.executeScript("mobile:scroll", scrollObject);
		Thread.sleep(2000);
		 
		// CLick on Perform card
		WebElement performcard = driver.findElement(performclick);
		performcard.click();
		
		Thread.sleep(2500);
		
		// Locate the element containing the perform
        WebElement Vo2card = driver.findElement(Vo2label);
        // Extract text from the element
        String actualText = Vo2card.getText();
        // Define the expected text
        String expectedText = "VO2 Max Test";
        
        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText);
        System.out.println("Expected Text: " + expectedText);
        // Compare the actual and expected text
        Assert.assertEquals(actualText, expectedText);
		
		WebElement Vo2start	= driver.findElement(vo2tap);
		Vo2start.click();
		
	
		WebElement vo2heading =driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Current Weight\"`]"));

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
		
		WebElement submitcurrentweight 	= driver.findElement(Ticktap);
		submitcurrentweight.click();
			
		// Check if the Crossclick element is displayed before clicking on it
				WebElement notificationclick = null;
				try {
					notificationclick = driver.findElement(okatap);
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
        WebElement Vo2card1 = driver.findElement(Vo2label1);
        // Extract text from the element
        String actualText2 = Vo2card1.getText();
        // Define the expected text
        String expectedText2 = "VO2 Max Test";
        
        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText2);
        System.out.println("Expected Text: " + expectedText2);
        // Compare the actual and expected text
        Assert.assertEquals(actualText2, expectedText2);	
				
     // Locate the element containing for the counter for Vo2 max main screen
        WebElement counter = driver.findElement(count);
        // Extract text from the element
        String actualText3 = counter.getText();
        // Define the expected text
        String expectedText3 = "06:00";
        
        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText3);
        System.out.println("Expected Text: " + expectedText3);
        // Compare the actual and expected text
        Assert.assertEquals(actualText3, expectedText3);
        
		WebElement Synctap 	= driver.findElement(synclick);
		Synctap.click();
		WebElement bluetoothtick = driver.findElement(Enabletick);
		bluetoothtick.click();
		
		WebElement 	Startvo2testbutton	= driver.findElement(Startbutton);
		Startvo2testbutton.click();
		
		WebElement bluetoothtick2= driver.findElement(Enabletick);
		bluetoothtick2.click();
		
		
		
		Thread.sleep(3500);
        driver.terminateApp("com.cuesz.mobile");
	
	
	
	}}
