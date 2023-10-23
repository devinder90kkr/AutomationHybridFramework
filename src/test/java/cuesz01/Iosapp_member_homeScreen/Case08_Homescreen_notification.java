package cuesz01.Iosapp_member_homeScreen;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AllureUtils;
import cuesz.utils.AppiumappUtils;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Home screen detail ")
@Feature ("Verify spheres separtors detail for Perform, Fuel, Mindful & Restore.")


public class Case08_Homescreen_notification extends AppiummobileBase {

	private By Homeclick = 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By notificlick	= 	AppiumBy.accessibilityId("notificationIcon");

	
	@SuppressWarnings("deprecation")
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify home screen & check spheres separtors.")
    @Story("Click on spheres and verify bounces spehere activity.")	
	
	public void Homes_notification() throws InterruptedException
	{	

		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");
		
		// CLick on home menu from bottom
		WebElement Homeicon = driver.findElement(Homeclick);
		Homeicon.click();
		
		
		// CLick on notification icon 
		WebElement notificationicon = driver.findElement(notificlick);
		notificationicon.click();
		
//		// Method to scroll to Food Senstivity card
//		HashMap<String,Object>scrollObject2 =new HashMap<>();
//		scrollObject2.put("direction", "down");
//		scrollObject2.put("ShowAllNotification", "ShowAllNotification");
//		driver.executeScript("mobile:scroll", scrollObject2);
		
		// Perform the pull-down action
        WebElement element = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"ShowAllNotification\"])[1]"));        int startX = element.getLocation().getX() + element.getSize().getWidth() / 2;
        int startY = element.getLocation().getY() + element.getSize().getHeight() / 2;
        int endY = startY + 200; // Adjust the endY coordinate according to the swipe length

        new TouchAction<>(driver)
                .longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(element)))
                .moveTo(ElementOption.point(startX, endY))
                .release()
                .perform();

		
		
		Thread.sleep(2500);
	    // Capture a screenshot and attach it to Allure
	    AllureUtils.captureScreenshot(driver, "Case07_Homescreen_scroller");
	
		Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
	
	
	
	}}
