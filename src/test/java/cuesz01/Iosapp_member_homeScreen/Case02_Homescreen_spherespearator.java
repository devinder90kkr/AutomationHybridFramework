package cuesz01.Iosapp_member_homeScreen;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
@Feature ("Verify Spheres detail for Perform, Fuel, Mindful & Restore.")


public class Case02_Homescreen_spherespearator extends AppiummobileBase {
	
	
	private By Homeclick = 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By performlbale = 	AppiumBy.xpath("//XCUIElementTypeOther[starts-with(@name, 'Perform ')]");
	private By fuelable = 		AppiumBy.xpath("//XCUIElementTypeOther[starts-with(@name, 'Fuel ')]");
	private By mindulable = 	AppiumBy.xpath("//XCUIElementTypeOther[starts-with(@name, 'Mindful ')]");
	private By Restorlabel = 	AppiumBy.xpath("//XCUIElementTypeOther[starts-with(@name, 'Restore ')]");
	private By backbttn = 		AppiumBy.iOSNsPredicateString("name == 'backButton'");

	
	
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
    @Description("Verify home screen spheres card for Member Homescreen detail verification")
    @Story("Scroll to activity card and verify features lable")	
	
	public void Homescreen() throws InterruptedException
	{	

		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");
		
		// CLick on home menu from bottom
		WebElement Homeicon = driver.findElement(Homeclick);
		Homeicon.click();
		
		 // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "ios_Homescreen_screenshot");
		
		/*************************** Perform ********************************/
		
		// Find the element with the "Perform 7%" text
        WebElement perfelement = driver.findElement(performlbale);

        // Get the text of the element
        String PerformValue = perfelement.getAttribute("name");

        // Extract the numeric value (assuming it's always a number followed by "%")
        String numericValue1 = PerformValue.split(" ")[1].replace("%", "");

        // Construct the dynamic XPath with the extracted value
        String performdynamicXPath = String.format("//XCUIElementTypeOther[@name='Perform %s%%']", numericValue1);

        // Use the dynamic XPath for automation
        WebElement performElement = driver.findElement(AppiumBy.xpath(performdynamicXPath));
        performElement.click();
        
        Thread.sleep(1000);
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "ios_Performscreen_screenshot");
        
        WebElement backicon1 = driver.findElement(backbttn);
        backicon1.click();
        
		/*************************** Fuel********************************/
		
		// Find the element with the "Fuel 7%" text
        WebElement fuelelement = driver.findElement(fuelable);

        // Get the text of the element
        String fuelValue = fuelelement.getAttribute("name");

        // Extract the numeric value (assuming it's always a number followed by "%")
        String numericValue = fuelValue.split(" ")[1].replace("%", "");

        // Construct the dynamic XPath with the extracted value
        String dynamicXPath = String.format("//XCUIElementTypeOther[@name='Fuel %s%%']", numericValue);

        // Use the dynamic XPath for automation
        WebElement fuelElement = driver.findElement(AppiumBy.xpath(dynamicXPath));
        fuelElement.click();
        
        Thread.sleep(1000);
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "ios_Fuelscreen_screenshot");
        
        WebElement backicon2 = driver.findElement(backbttn);
        backicon2.click();
        /*************************** Mindful********************************/
		
		// Find the element with the "Fuel 7%" text
        WebElement mmindulelement = driver.findElement(mindulable);

        // Get the text of the element
        String mindfulValue = mmindulelement.getAttribute("name");

        // Extract the numeric value (assuming it's always a number followed by "%")
        String mindfulnumericValue = mindfulValue.split(" ")[1].replace("%", "");

        // Construct the dynamic XPath with the extracted value
        String mindfuldynamicXPath = String.format("//XCUIElementTypeOther[@name='Mindful %s%%']", mindfulnumericValue);

        // Use the dynamic XPath for automation
        WebElement mindfulElement = driver.findElement(AppiumBy.xpath(mindfuldynamicXPath));
        mindfulElement.click();
        
        Thread.sleep(1000);
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "ios_mindfulscreen_screenshot");
        
        WebElement backicon3 = driver.findElement(backbttn);
        backicon3.click();
        /*************************** Restore ********************************/
		
		// Find the element with the "Fuel 7%" text
        WebElement Restoreelement = driver.findElement(Restorlabel);

        // Get the text of the element
        String restoreValue = Restoreelement.getAttribute("name");

        // Extract the numeric value (assuming it's always a number followed by "%")
        String restorenumericValue = restoreValue.split(" ")[1].replace("%", "");

        // Construct the dynamic XPath with the extracted value
        String restoredynamicXPath = String.format("//XCUIElementTypeOther[@name='Restore %s%%']", restorenumericValue);

        // Use the dynamic XPath for automation
        WebElement restoreElement = driver.findElement(AppiumBy.xpath(restoredynamicXPath));
        restoreElement.click();
        
        Thread.sleep(1000);
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "ios_restorescreen_screenshot");
        
        WebElement backicon4 = driver.findElement(backbttn);
        backicon4.click();
        
        
        // Capture console logs
        String consoleLogs = consoleOutput.toString();
        System.out.println(consoleLogs); // Print console logs to console (optional)
        
        // Log console logs in Allure
        Allure.addAttachment("Console Output", "text/plain", consoleLogs);
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "ios_Homescreen_screenshot");
        
	
		Thread.sleep(2500);
	}
	
}

