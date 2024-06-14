//https://chat.openai.com/share/f592ab35-529c-4434-a989-5fac7039696c
package cuesz03.Iosapp_member_home_Fuelscreen;

import org.testng.annotations.Test;
import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import cuesz.utils.mobile.mobileLocators;
import cuesz.utils.mobile.mobilelement;
import cuesz.utils.reporting.AllureUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Member add additional Upload images for at bottom for categories")
@Feature ("Verify member able to Uplaod fuel images for brekafat to dinner")
public class Case52_Fuel_uploadphotosforfuel extends AppiummobileBase {
	
	mobileLocators locators = new mobileLocators();	

	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
	@Description("Member scroll to upload photos button and than add images corresponding to each categories")
    @Story("Scroll to ")
	public void fueladditonalfuels() throws InterruptedException {	

		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
				
        // Click on Home-icon
        mobilelement.clickElement(driver, mobileLocators.Homeclick);
  
		// scroll-down to perform fuel mind-full restore label
		mobilelement.scrollDownToElement(driver, "Perform Fuel Mindful Restore");
	
		// Click on Fuel screen
        mobilelement.clickElement(driver, mobileLocators.Fuelhomeclick);
		
		
		Thread.sleep(3000);
		// Scroll to "Early-Snacks"
		mobilelement.scrollDownToElement(driver, "Early Snacks");

		// Scroll to "Dinner"
		mobilelement.scrollDownToElement(driver, "Dinner");

		// Scroll to "TODAY'S FUEL SUMMARY"
		mobilelement.scrollDownToElement(driver, "TODAY'S FUEL SUMMARY");
		Thread.sleep(2000);
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case52_Fuel_uploadphotosforfuel1");
		
        
        /*************** Add  upload fuel images for breakfast***************/
        
        // Click on Upload option from bottom
        Thread.sleep(2000);
		mobilelement.clickElement(driver, mobileLocators.uploadclickall);
		
		// Click on Upload option for Breakfast Option
		mobilelement.clickElement(driver, mobileLocators.breakfastuploadoption);
		
		// Click on gallery option 
		mobilelement.clickElement(driver, mobileLocators.gallery);
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case52_Fuel_uploadphotosforfuel2");
		
		// Select image 1 from gallery
		mobilelement.clickElement(driver, mobileLocators.galleryimage1);
		
		// Click on add option from image viewer
		mobilelement.clickElement(driver, mobileLocators.addoption);
		
		 // Set values in the picker elements
        String[] valuesToSet = {"7", "18", "AM"};
        mobilelement.setPickerValues(driver, mobileLocators.Timepicker, mobileLocators.pickerelement, valuesToSet);
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case52_Fuel_uploadphotosforfuel3");
        mobilelement.clickElement(driver, mobileLocators.Doneclick);

        mobilelement.clickElement(driver, mobileLocators.submittap);
        
        
        /*************** Add  upload fuel images for early snacks***************/
        
        // Click on Upload option from bottom
        Thread.sleep(2000);
		mobilelement.clickElement(driver, mobileLocators.uploadclickall);
		
		// Click on Upload option for Breakfast Option
		mobilelement.clickElement(driver, mobileLocators.earlysnacksuploadoption);
		
		// Click on gallery option 
		mobilelement.clickElement(driver, mobileLocators.gallery);
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case52_Fuel_uploadphotosforfuel4");
		
		// Select image 1 from gallery
		mobilelement.clickElement(driver, mobileLocators.galleryimage2);
		
		// Click on add option from image viewer
		mobilelement.clickElement(driver, mobileLocators.addoption);
		
		 // Set values in the picker elements
        String[] valuesToSet2 = {"10", "18", "AM"};
        mobilelement.setPickerValues(driver, mobileLocators.Timepicker, mobileLocators.pickerelement, valuesToSet2);
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case52_Fuel_uploadphotosforfuel5");
        mobilelement.clickElement(driver, mobileLocators.Doneclick);

        mobilelement.clickElement(driver, mobileLocators.submittap);
        
        /*************** Add  upload fuel images for early snacks***************/
        
        // Click on Upload option from bottom
        Thread.sleep(2000);
		mobilelement.clickElement(driver, mobileLocators.uploadclickall);
		
		// Click on Upload option for Breakfast Option
		mobilelement.clickElement(driver, mobileLocators.lunchuploadoption);
		
		// Click on gallery option 
		mobilelement.clickElement(driver, mobileLocators.gallery);
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case52_Fuel_uploadphotosforfuel6");
		
		// Select image 1 from gallery
		mobilelement.clickElement(driver, mobileLocators.galleryimage3);
		
		// Click on add option from image viewer
		mobilelement.clickElement(driver, mobileLocators.addoption);
		
		 // Set values in the picker elements
        String[] valuesToSet3 = {"1", "45", "PM"};
        mobilelement.setPickerValues(driver, mobileLocators.Timepicker, mobileLocators.pickerelement, valuesToSet3);
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case52_Fuel_uploadphotosforfuel7");
        mobilelement.clickElement(driver, mobileLocators.Doneclick);

        mobilelement.clickElement(driver, mobileLocators.submittap);
        
        
        /*************** Add  upload fuel images for late snacks***************/
        
        // Click on Upload option from bottom
        Thread.sleep(2000);
		mobilelement.clickElement(driver, mobileLocators.uploadclickall);
		
		// Click on Upload option for Breakfast Option
		mobilelement.clickElement(driver, mobileLocators.latesnacksuploadoption);
		
		// Click on gallery option 
		mobilelement.clickElement(driver, mobileLocators.gallery);
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case52_Fuel_uploadphotosforfuel8");
		
		// Select image 1 from gallery
		mobilelement.clickElement(driver, mobileLocators.galleryimage4);
		
		// Click on add option from image viewer
		mobilelement.clickElement(driver, mobileLocators.addoption);
		
		 // Set values in the picker elements
        String[] valuesToSet4 = {"5", "15", "PM"};
        mobilelement.setPickerValues(driver, mobileLocators.Timepicker, mobileLocators.pickerelement, valuesToSet4);
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case52_Fuel_uploadphotosforfuel9");
        mobilelement.clickElement(driver, mobileLocators.Doneclick);

        mobilelement.clickElement(driver, mobileLocators.submittap);
        
        /*************** Add  upload fuel images for Dinner***************/
        
        // Click on Upload option from bottom
        Thread.sleep(2000);
		mobilelement.clickElement(driver, mobileLocators.uploadclickall);
		
		// Click on Upload option for Breakfast Option
		mobilelement.clickElement(driver, mobileLocators.dinneruploadoption);
		
		// Click on gallery option 
		mobilelement.clickElement(driver, mobileLocators.gallery);
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case52_Fuel_uploadphotosforfuel10");
		
		// Select image 1 from gallery
		mobilelement.clickElement(driver, mobileLocators.galleryimage5);
		
		// Click on add option from image viewer
		mobilelement.clickElement(driver, mobileLocators.addoption);
		
		 // Set values in the picker elements
        String[] valuesToSet5 = {"5", "15", "PM"};
        mobilelement.setPickerValues(driver, mobileLocators.Timepicker, mobileLocators.pickerelement, valuesToSet5);
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case52_Fuel_uploadphotosforfuel11");
        mobilelement.clickElement(driver, mobileLocators.Doneclick);

        mobilelement.clickElement(driver, mobileLocators.submittap);
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case52_Fuel_uploadphotosforfuel12");
        
        
    	    
        mobilelement.clickElement(driver, mobileLocators.eventcross);
        
        
    	// Scroll to "TODAY'S FUEL SUMMARY"
		mobilelement.scrollupToElement(driver, "TODAY'S FUEL SUMMARY");
		Thread.sleep(2000);
		
		// Scroll to "Dinner"
		mobilelement.scrollupToElement(driver, "Dinner");
		
        
        Thread.sleep(3000);
		// Scroll to "Early-Snacks"
		mobilelement.scrollupToElement(driver, "Early Snacks");


        
        Thread.sleep(8500);
        driver.terminateApp("com.cuesz.mobile");
        
	}
}
