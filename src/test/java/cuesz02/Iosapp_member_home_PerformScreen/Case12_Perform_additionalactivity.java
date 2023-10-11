package cuesz02.Iosapp_member_home_PerformScreen;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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


public class Case12_Perform_additionalactivity extends AppiummobileBase {

	private By Homeclick = 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By performclick	= AppiumBy.accessibilityId("PERFORM_SCREEN");
	private By perfomplus	=	 AppiumBy.accessibilityId("AddEvent");
	private By additionalperform	= AppiumBy.accessibilityId("Start My Perform Activity");
	private By cross_additionalpopup 	= AppiumBy.accessibilityId("CrossClicked");
	private By searcharea			= AppiumBy.accessibilityId("EnterActivityName");
	private By doneclick			= AppiumBy.accessibilityId("Done");
	
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify perform screen & check Additional activity functionlaity.")
    @Story("here, we need to verify Additional perform activity functionality")	
	
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

		
		WebElement perfomplusicon 	= driver.findElement(perfomplus);
		perfomplusicon.click();
		
		WebElement startmyperformactivity 	= driver.findElement(additionalperform);
		startmyperformactivity.click();
		
		WebElement startmyperfromactivitycross 	= driver.findElement(cross_additionalpopup);
		startmyperfromactivitycross.click();
		
		// repeat steps again 
		WebElement perfomplusicon1 	= driver.findElement(perfomplus);
		perfomplusicon1.click();
		
		WebElement startmyperformactivity2 	= driver.findElement(additionalperform);
		startmyperformactivity2.click();
		
		// Enter text for Search field 
		WebElement Additonalperformsearch	= driver.findElement(searcharea);
		Additonalperformsearch.sendKeys("Baseball");
		
		// Enter text for Search field 
		WebElement donekeypad	= driver.findElement(doneclick);
		donekeypad.click();
		
		
		
		
		
		Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
	
	
	
	}}
