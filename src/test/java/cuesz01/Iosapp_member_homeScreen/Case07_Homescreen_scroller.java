package cuesz01.Iosapp_member_homeScreen;

import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.mobile.resources.mobileLocators;
import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
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
	private static final Logger LOGGER = LoggerFactory.getLogger(Case08_Homescreen_notification.class);

	
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
		
		 // Log message to console and Allure report
        LOGGER.info("Clicked on home menu from bottom");
        AllureUtils.logStep("Clicked on home menu from bottom");
		
		WebElement scrolldown = driver.findElement(mobileLocators.HomeScrollDown);
		scrolldown.click();
		
		// Log message to console and Allure report
        LOGGER.info("Clicked on scroll down arrow");
        AllureUtils.logStep("Clicked on scroll down arrow");

		  // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "HomeScrollDown1");
		
		
		WebElement scrollup = driver.findElement(mobileLocators.HomeScrollup);
		scrollup.click();
		
		// Log message to console and Allure report
        LOGGER.info("Clicked on scroll up arrow");
        AllureUtils.logStep("Clicked on scroll up arrow");
		
		 // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "HomeScrollup1");
	
		Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
	
	
	
	}
	
}
