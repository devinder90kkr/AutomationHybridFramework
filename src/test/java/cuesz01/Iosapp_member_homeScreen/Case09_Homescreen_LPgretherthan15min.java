package cuesz01.Iosapp_member_homeScreen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AllureUtils;
import cuesz.utils.AppiumappUtils;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Home screen detail ")
@Feature ("Verify Live perform icon when event time more than 15 min")


public class Case09_Homescreen_LPgretherthan15min extends AppiummobileBase {

	private By Homeclick = 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By liveperfrmicon = 		AppiumBy.accessibilityId("HomeScreenLPIcon");

	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify home screen & check LP redirection to perform card on homescreen.")
    @Story("here, we need to verify LP icon functionality redirection to perform screen if counter exceed more than 15 min")	
	
	public void Homescreensperators() throws InterruptedException
	{	

		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");
		
		// CLick on home menu from bottom
		WebElement Homeicon = driver.findElement(Homeclick);
		Homeicon.click();
		
		   // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "LP icon");
		
		
        Thread.sleep(3500);
		WebElement livePerform = driver.findElement(liveperfrmicon);
		livePerform.click();
		
		  // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform selection");
	
	
		Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
	
	
	
	}}
