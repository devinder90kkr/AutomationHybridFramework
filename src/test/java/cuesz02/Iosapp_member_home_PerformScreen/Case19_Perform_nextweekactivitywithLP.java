package cuesz02.Iosapp_member_home_PerformScreen;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

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
@Feature ("Verify Next week activity data and show alert")


public class Case19_Perform_nextweekactivitywithLP extends AppiummobileBase {

	private By Homeclick = 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By arrowclick	= AppiumBy.accessibilityId("HomeForwardArrow");
	private By performclick	= AppiumBy.accessibilityId("PERFORM_SCREEN");
	private By Liveclick	= AppiumBy.iOSNsPredicateString("label == \"Live Perform Schedule\"");
	
	
	

	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify home screen & check activity should not be start for next week")
    @Story("here, we need to check next week activity data.")	
	
	public void HomescreenLiveperfrom() throws InterruptedException
	{	

		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");
		
		// CLick on home menu from bottom
		WebElement Homeicon = driver.findElement(Homeclick);
		Homeicon.click();
	
		// CLick on forward arrow button	
		WebElement arrowicon = driver.findElement(arrowclick);
		arrowicon.click();
			
		 // Get current day of the week
        Calendar calendar = Calendar.getInstance();
        int currentDay = calendar.get(Calendar.DAY_OF_WEEK);

        // Define accessibility IDs for each day of the week
        HashMap<Integer, String> dayAccessibilityIds = new HashMap<>();
        dayAccessibilityIds.put(Calendar.THURSDAY, "ThuClicked");
        dayAccessibilityIds.put(Calendar.FRIDAY, "FriClicked");
        dayAccessibilityIds.put(Calendar.SATURDAY, "SatClicked");
        dayAccessibilityIds.put(Calendar.SUNDAY, "SunClicked");
        dayAccessibilityIds.put(Calendar.MONDAY, "MonClicked");
        dayAccessibilityIds.put(Calendar.TUESDAY, "TueClicked");
        dayAccessibilityIds.put(Calendar.WEDNESDAY, "WedClicked");
        // ...and so on for other days of the week

        // Calculate next day's accessibility ID
        int nextDay = (currentDay + 1) > 7 ? 1 : (currentDay + 1);
        String nextDayAccessibilityId = dayAccessibilityIds.get(nextDay);

        // Click on the next day
        By nextDayElement = AppiumBy.accessibilityId(nextDayAccessibilityId);
        WebElement nextDayButton = driver.findElement(nextDayElement);
        nextDayButton.click();
        
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "performneext1");
        
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
        
		WebElement Liveperform	= driver.findElement(Liveclick);
		Liveperform.click();
		
		
		
		
		Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
	
	
	
	}}
