package cuesz01.Iosapp_member_homeScreen;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AllureUtils;
import cuesz.utils.AppiumappUtils;
import cuesz.utils.mobileLocators;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Home screen detail ")
@Feature ("Verify Scroll down on screen for up & down direction.")


public class Case07_Homescreen_scroller extends AppiummobileBase {

	mobileLocators locators = new mobileLocators();	

	@Test

	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify scroller functionlaity on home screen.")
    @Story("Here, we need to check scroller move screen up or down.")	
	
	public void Homescreenscroller() throws InterruptedException
	{	

		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");
		
		// CLick on home menu from bottom
		WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
		Homeicon.click();
		
		WebElement scrolldown = driver.findElement(mobileLocators.HomeScrollDown);
		scrolldown.click();

		  // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "HomeScrollDown1");
		
		
		WebElement scrollup = driver.findElement(mobileLocators.HomeScrollup);
		scrollup.click();
		
		 // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "HomeScrollup1");
	
		Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
	
	
	
	}
	
}
