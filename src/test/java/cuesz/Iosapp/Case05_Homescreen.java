package cuesz.Iosapp;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AllureUtils;
import cuesz.utils.AppiumappUtils;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Home screen detail ")
@Feature ("Verify Homescreen detail for Perform, Fuel, Mindful & Restore.")
public class Case05_Homescreen extends AppiummobileBase {
	 private ByteArrayOutputStream consoleOutput; // To capture console output
	   
	@BeforeClass
	 public void setUp() {
	      
	 // Redirect console output to capture it
	 consoleOutput = new ByteArrayOutputStream();
	 PrintStream printStream = new PrintStream(consoleOutput);
	 System.setOut(printStream);
	        
	  }
	      
	@Test
	
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Member Homescreen detail verification")
    @Story("Scroll to activity card and verify features lable")	
	public void Homescreen() throws InterruptedException
	{	
		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
		
		WebElement Homeicon = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]"));
		Homeicon.click();
		
		Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject =new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("Perform Fuel Mindful Restore", "Perform");
		driver.executeScript("mobile:scroll", scrollObject);
		Thread.sleep(2000);
		
		// Locate the element containing the perform
        WebElement Perform = driver.findElement(AppiumBy.iOSNsPredicateString("name == 'Perform'"));
        // Extract text from the element
        String actualText = Perform.getText();
        // Define the expected text
        String expectedText = "Perform";
        
        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText);
        System.out.println("Expected Text: " + expectedText);
        // Compare the actual and expected text
        Assert.assertEquals(actualText, expectedText);
		
        // Locate the element containing the Fuel
        WebElement Fuel = driver.findElement(AppiumBy.iOSNsPredicateString("name == 'Fuel'"));
        // Extract text from the element
        String actualText1 = Fuel.getText();
        // Define the expected text
        String expectedText1 = "Fuel";
        
        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText1);
        System.out.println("Expected Text: " + expectedText1);
        // Compare the actual and expected text
        Assert.assertEquals(actualText1, expectedText1);
        
        // Locate the element containing the Mindful
        WebElement Mindful = driver.findElement(AppiumBy.iOSNsPredicateString("name == 'Mindful'"));
        // Extract text from the element
        String actualText2 = Mindful.getText();
        // Define the expected text
        String expectedText2 = "Mindful";
        
        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText2);
        System.out.println("Expected Text: " + expectedText2);
        // Compare the actual and expected text
        Assert.assertEquals(actualText2, expectedText2);
        
        
        // Locate the element containing the Mindful
        WebElement Restore = driver.findElement(AppiumBy.iOSNsPredicateString("name == 'Restore'"));
        // Extract text from the element
        String actualText3 = Restore.getText();
        // Define the expected text
        String expectedText3 = "Restore";
        
        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText3);
        System.out.println("Expected Text: " + expectedText3);
        // Compare the actual and expected text
        Assert.assertEquals(actualText3, expectedText3);
        
        
        // Capture console logs
        String consoleLogs = consoleOutput.toString();
        System.out.println(consoleLogs); // Print console logs to console (optional)
        
        // Log console logs in Allure
        Allure.addAttachment("Console Output", "text/plain", consoleLogs);
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "ios_Homescreen_screenshot");
     
        
        
		 // driver.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"Perform\"])[2]")).click();
		
		
		Thread.sleep(5500);
	}
	
}

