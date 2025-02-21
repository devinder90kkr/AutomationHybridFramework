package cuesz03.Iosapp_member_home_Fuelscreen.customcases;

import java.util.HashMap;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.mobile.resources.CustomFoodScreenUtils;
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

@Epic ("Fuel custom screen detail ")
@Feature ("Verify Fuel detail functionlaity related to Custom fuel for Lunch.")
public class Case36_Fuel_Lunch_customfood extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case36_Fuel_Lunch_customfood .class);
	
	

	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
	@Description("Custom Fuel screen detail verification")
    @Story("Scroll to Fuel card and verify custom food Lunch.")
	public void Fuel_Lunch_customfood() throws InterruptedException{
		try {

			// Initialize utility class
	        CustomFoodScreenUtils utils = new CustomFoodScreenUtils(driver);	
			// Create an instance of AppiumUtils and pass the driver
			AppiumappUtils appiumUtils = new AppiumappUtils(driver);
	        // Launch the app using the utility method
//	        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
			 appiumUtils.launchAppWithPackageId(mobileTestData.bundelID);
			
			WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
			Homeicon.click();
			// Log console message to Allure
			LOGGER.info("Click on home menu from bottom");
			AllureUtils.logStep("Click on home menu from bottom");
			// Capture a screenshot and attach it to Allure
			AllureUtils.captureScreenshot(driver, "Case26_1");
			Thread.sleep(3000);
			
			// Method to scroll to perform screen
			HashMap<String,Object>scrollObject =new HashMap<>();
			scrollObject.put("direction", "down");
			scrollObject.put("Perform Fuel Mindful Restore", "Perform");
			driver.executeScript("mobile:scroll", scrollObject);
			Thread.sleep(2000);

	        //Click on Fuel tab 
	        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();
	        // Log console message to Allure
	        LOGGER.info("Click on fuel screen");
	        AllureUtils.logStep("Click on fuel screen");
	        AllureUtils.captureScreenshot(driver, "Case26_2");
	        
	        
	        // Locate the element related to breakfast + icon 
	        WebElement breakfastplus 	= driver.findElement(mobileLocators.lunchplusicon);
	        breakfastplus.click();
	        // Log console message to Allure
	        LOGGER.info("Click on breakfastplus icon");
	        AllureUtils.logStep("Click on breakfastplus icon");
	        AllureUtils.captureScreenshot(driver, "Case26_3");
	        
	        
	        //click on keypad Done button to hide keypad
	        WebElement keypaddone	= driver.findElement(mobileLocators.doneclick);
	        keypaddone.click();
	        // Log console message to Allure
	        LOGGER.info("Click on keypaddone icon");
	        AllureUtils.logStep("Click on keypaddone icon");
	        AllureUtils.captureScreenshot(driver, "Case26_4");
	        

	     // Call the utility method
	        String searchText = mobileTestData.searchText;
	        utils.addCustomFood(searchText);
        		
        Thread.sleep(3500);
        WebElement submit2 = driver.findElement(mobileLocators.lunchsubmittick);
		submit2.click();
		// Log console message to Allure
        LOGGER.info("Click on submit2");
        AllureUtils.logStep("Click on submit2");
        AllureUtils.captureScreenshot(driver, "Case34_16");
        
       
	        Thread.sleep(3500);
		 } catch (Exception e) {
	            LOGGER.error("An error occurred during the cases ", e);
	            AllureUtils.logStep("An error occurred: " + e.getMessage());
	        } finally {
	            // Terminate the app whether the test passed or failed
	            try {
	                Thread.sleep(8500);
	            } catch (InterruptedException e) {
	                LOGGER.error("Thread interrupted during final sleep", e);
	                Thread.currentThread().interrupt();
	            }
	            driver.terminateApp("com.cuesz.mobile");
	            driver.terminateApp(mobileTestData.bundelID);
	        }
	    }

	 
}
	