package cuesz02.Iosapp_member_home_PerformScreen;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
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
@Feature ("Verify Live perform icon when event time min 15 min")


public class Case11_Perform_recommendedactivity extends AppiummobileBase {

	private By Homeclick = 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By performclick	= AppiumBy.accessibilityId("PERFORM_SCREEN");
	private By walkinlabel = AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"Walking\"]");
	private By walkingstart	= AppiumBy.accessibilityId("Walking Start");
	private By backpressbutton	= AppiumBy.accessibilityId("BackPress");
//	private By Syncclick	= AppiumBy.accessibilityId("SyncDevice");
	private By deviation	= AppiumBy.accessibilityId("AddDeviation");
	private By Crossclick	= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"CrossClicked\"`][2]");
	private By lessthanprecribeclick	= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Less Than Prescribed\"`][3]");
	private By morethanprecribeclick	= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"More Than Prescribed\"`][3]");
	private By Injury					= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"ItemPressed\"])[4]");
	private By Noteclick				= AppiumBy.accessibilityId("Notes");
	private By tickclick				= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"Submit\"])[2]");
	private By Tick_walking				= AppiumBy.accessibilityId("Submit");
	private By performnobttn			= AppiumBy.accessibilityId("No");
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify home screen & check LP redirection to perform card on homescreen.")
    @Story("here, we need to verify LP icon functionality redirection to perform screen if counter equal or less than 15 min")	
	
	public void perfom_recommendedactivty() throws InterruptedException
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
	
		// Locate the element containing the perform
        WebElement Perform = driver.findElement(walkinlabel);
        // Extract text from the element
        String actualText = Perform.getText();
        // Define the expected text
        String expectedText = "Walking";
        
        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText);
        System.out.println("Expected Text: " + expectedText);
        // Compare the actual and expected text
        Assert.assertEquals(actualText, expectedText);
        
        // Attach values to Allure report
        Allure.addAttachment("Actual Text", actualText);
        Allure.addAttachment("Expected Text", expectedText);
		
        
		// CLick on Walking  card
		WebElement walkingcard = driver.findElement(walkingstart);
		walkingcard.click();

		//Click on back button 
		WebElement Backbttn = driver.findElement(backpressbutton);
		Backbttn.click();
		
		// CLick on Walking  card
		WebElement walkingcard1 = driver.findElement(walkingstart);
		walkingcard1.click();
		
		
//		// CLick on Walking  card
//		WebElement syncdevice = driver.findElement(Syncclick);
//		syncdevice.click();
		
     
		// Click on deviation 
		WebElement adddeviation = driver.findElement(deviation);
		adddeviation.click();
		
		// Click on deviation 
		WebElement deviationcrossclick = driver.findElement(Crossclick);
		deviationcrossclick.click();
		
		// Click on deviation 
		WebElement adddeviation2 = driver.findElement(deviation);
		adddeviation2.click();
		
		// Click on deviation option-1
		WebElement lessprecribed = driver.findElement(lessthanprecribeclick);
		lessprecribed.click();
				
		// Click on deviation option-2
		WebElement moreprecribed = driver.findElement(morethanprecribeclick);
		moreprecribed.click();
		
		// Click on deviation option-1
		WebElement lessprecribed1 = driver.findElement(lessthanprecribeclick);
		lessprecribed1.click();
		
		// Click on deviation option-1
		WebElement injuryoption = driver.findElement(Injury);
		injuryoption.click();
		

		WebElement notes = driver.findElement(Noteclick);
		notes.sendKeys("verify field accept automate values in Notes field");

		WebElement tickicon = driver.findElement(tickclick);
		tickicon.click();

		WebElement WalkingTick = driver.findElement(Tick_walking);
		WalkingTick.click();
		

		WebElement PerformNo = driver.findElement(performnobttn);
		PerformNo.click();
		
		WebElement WalkingTick1 = driver.findElement(Tick_walking);
		WalkingTick1.click();
		
	
		Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
	
	
	
	}}
