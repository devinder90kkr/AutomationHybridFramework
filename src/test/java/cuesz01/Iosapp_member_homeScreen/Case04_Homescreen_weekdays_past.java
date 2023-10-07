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
@Feature ("Verify homescreens weekdays and its details.")

public class Case04_Homescreen_weekdays_past extends AppiummobileBase {

    private By Homeclick = AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
    

	@Test

	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify home screen details with previous week days data.")
    @Story("Click on weeks days and verify its related data for activity.")	
    public void Homescreen_weekdays() throws InterruptedException {
        // Create an instance of AppiumUtils and pass the driver
        AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");

        // Click on home menu from the bottom
        WebElement Homeicon = driver.findElement(Homeclick);
        Homeicon.click();
        
	     driver.findElement(AppiumBy.accessibilityId("ThuClicked")).click();
	     driver.findElement(AppiumBy.accessibilityId("FriClicked")).click();
	     driver.findElement(AppiumBy.accessibilityId("SatClicked")).click();
	    
	     Thread.sleep(1000);
	     // Capture a screenshot and attach it to Allure
	     AllureUtils.captureScreenshot(driver, "SatClicked");
	     
	     driver.findElement(AppiumBy.accessibilityId("SunClicked")).click();
	     driver.findElement(AppiumBy.accessibilityId("MonClicked")).click();
	     driver.findElement(AppiumBy.accessibilityId("TueClicked")).click();
	     
	     Thread.sleep(1000);
	     // Capture a screenshot and attach it to Allure
	     AllureUtils.captureScreenshot(driver, "TueClicked");
	     
	     driver.findElement(AppiumBy.accessibilityId("WedClicked")).click();
		
	     Thread.sleep(2500);
	     driver.terminateApp("com.cuesz.mobile");
	
	
	}
}