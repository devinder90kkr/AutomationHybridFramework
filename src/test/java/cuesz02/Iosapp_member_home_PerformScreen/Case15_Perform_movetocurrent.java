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


public class Case15_Perform_movetocurrent extends AppiummobileBase {

	private By Homeclick = 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By performclick	= AppiumBy.accessibilityId("PERFORM_SCREEN");
	
	private By movetoday1	=		AppiumBy.accessibilityId("Move to Today");
	private By startclick 	= 	AppiumBy.iOSNsPredicateString("label == \"Start\"");
	
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify perform screen & check Additional activity functionlaity.")
    @Story("here, we need to verify Additional perform activity functionality")	
	
	public void perfom_movetocurrentactivtity() throws InterruptedException
	{	

		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");
		
		// CLick on home menu from bottom
		WebElement Homeicon = driver.findElement(Homeclick);
		Homeicon.click();
		
		// We need to add test data only for Saturday week 
		
		 driver.findElement(AppiumBy.accessibilityId("SatClicked")).click();
		
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
		
		WebElement clickstart 	= driver.findElement(startclick);
		clickstart.click();
		
		
		WebElement movetoday 	= driver.findElement(movetoday1);
		movetoday.click();
		
		
		
		
		Thread.sleep(3500);
        driver.terminateApp("com.cuesz.mobile");
	
	
	
	}}
