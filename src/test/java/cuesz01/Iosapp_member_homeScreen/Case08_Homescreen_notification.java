package cuesz01.Iosapp_member_homeScreen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.mobile.resources.mobileLocators;
import cuesz.mobile.resources.mobileTestData;
import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebElement;

import java.time.Duration;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Epic ("Home screen detail for notification")
@Feature ("Verify spheres separtors detail for Perform, Fuel, Mindful & Restore.")


public class Case08_Homescreen_notification extends AppiummobileBase {

	mobileLocators locators = new mobileLocators();	
	private static final Logger LOGGER = LoggerFactory.getLogger(Case08_Homescreen_notification.class);
	

	@SuppressWarnings("deprecation")
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify home screen & Check notification feature functionality.")
    @Story("Tap on Notification and view listing for recieved notification.")	
	
	public void Homes_notification() throws InterruptedException{	
try {
		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
//        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");
		 appiumUtils.launchAppWithPackageId(mobileTestData.bundelID);
		
		// CLick on home menu from bottom
		WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
		Homeicon.click();
		
		 // Log message to console and Allure report
        LOGGER.info("Clicked on home menu from bottom");
        AllureUtils.logStep("Clicked on home menu from bottom");
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Notif1");
		
		// CLick on notification icon 
		WebElement notificationicon = driver.findElement(mobileLocators.notificlick);
		notificationicon.click();
		
		 // Log message to console and Allure report
        LOGGER.info("Clicked on Notification icon on top right corner");
        AllureUtils.logStep("Clicked on notification icon");
		
//		// Perform the pull-down action
//        WebElement element = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"ShowAllNotification\"])[1]"));       
//        int startX = element.getLocation().getX() + element.getSize().getWidth() / 2;
//        int startY = element.getLocation().getY() + element.getSize().getHeight() / 2;
//        int endY = startY + 200; // Adjust the endY coordinate according to the swipe length
//
//        new TouchAction<>(driver)
//                .longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(element)))
//                .moveTo(ElementOption.point(startX, endY))
//                .release()
//                .perform();
//
//		
//		Thread.sleep(2500);
//	    // Capture a screenshot and attach it to Allure
//	    AllureUtils.captureScreenshot(driver, "Case07_Homescreen_scroller");
     // Find the element to interact with
     // Locate the element you want to scroll on
        WebElement element = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"ShowAllNotification\"])[1]"));

        // Use the mobile gesture to scroll down
        Map<String, Object> args = new HashMap<>();
        args.put("direction", "down");
        args.put("element", ((RemoteWebElement) element).getId()); // cast WebElement to RemoteWebElement to get element ID
        driver.executeScript("mobile:scroll", args);

        // Capture screenshot after the scroll
        AllureUtils.captureScreenshot(driver, "Case07_Homescreen_scroller");
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
//    driver.terminateApp("com.cuesz.mobile");
    driver.terminateApp(mobileTestData.bundelID);
}
}}