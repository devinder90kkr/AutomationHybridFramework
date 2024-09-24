package cuesz02.Iosapp_member_home_PerformScreen;

import java.util.Calendar;
import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.mobile.resources.mobileLocators;
import cuesz.mobile.resources.mobileTestData;
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

@Epic ("Home screen detail ")
@Feature ("Verify Next week activity data and show alert")


public class Case19_Perform_nextweekactivitywithLP extends AppiummobileBase {

	mobileLocators locators = new mobileLocators();	
	private static final Logger LOGGER = LoggerFactory.getLogger(Case19_Perform_nextweekactivitywithLP.class);
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify home screen & check activity should not be start for next week")
    @Story("here, we need to check next week activity data.")	
	
	public void HomescreenLiveperfrom() throws InterruptedException
	{	
try {
		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
//        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");
		 appiumUtils.launchAppWithPackageId(mobileTestData.bundelID);
		
		// CLick on home menu from bottom
		WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
		Homeicon.click();
		
		 // Log console message to Allure
        LOGGER.info("Click on home menu from bottom");
        AllureUtils.logStep("Click on home menu from bottom");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "nextweek1");
	
		// CLick on forward arrow button	
		WebElement arrowicon = driver.findElement(mobileLocators.arrowclick);
		arrowicon.click();
		
		 // Log console message to Allure
        LOGGER.info("Click on Arrow for next week");
        AllureUtils.logStep("Click on Arrow for next week");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "nextweek2");
			
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
        
        // Log console message to Allure
        LOGGER.info("Click on day for next week");
        AllureUtils.logStep("Click on day for next week");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "nextweek3");
        
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
        LOGGER.info("Click on perform");
        AllureUtils.logStep("Click on perform");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "nextweek4");
        
		WebElement Liveperform	= driver.findElement(mobileLocators.Liveclick);
		Liveperform.click();
		
		
		
		

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
//       driver.terminateApp("com.cuesz.mobile");
       driver.terminateApp(mobileTestData.bundelID);
   }
}
}
