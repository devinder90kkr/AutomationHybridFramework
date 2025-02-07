//https://chat.openai.com/share/f592ab35-529c-4434-a989-5fac7039696c
package cuesz04.Iosapp_member_home_Fuelscreen.Uploadphotocases.perform.pending;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.mobile.resources.mobileLocators;
import cuesz.mobile.resources.mobileTestData;
import cuesz.mobile.resources.mobilelement;
import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
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
	private static final Logger LOGGER = LoggerFactory.getLogger(Case52_Fuel_uploadphotosforfuel.class);
	
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
//        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
		 appiumUtils.launchAppWithPackageId(mobileTestData.bundelID);
				
        // Click on Home-icon
        mobilelement.clickElement(driver, mobileLocators.Homeclick);
        // Log console message to Allure
	    LOGGER.info("click on Homeclick");
		AllureUtils.logStep("click on Homeclick");
        
  
		// scroll-down to perform fuel mind-full restore label
		mobilelement.scrollDownToElement(driver, "Perform Fuel Mindful Restore");
		// Log console message to Allure
	    LOGGER.info("Scroll down to card");
		AllureUtils.logStep("Scroll down to card");
	
		// Click on Fuel screen
        mobilelement.clickElement(driver, mobileLocators.Fuelhomeclick);
        // Log console message to Allure
	    LOGGER.info("click on Fuelhomeclick");
		AllureUtils.logStep("click on Fuelhomeclick");
		
		
		Thread.sleep(3000);
		// Scroll to "Early-Snacks"
		mobilelement.scrollDownToElement(driver, "Breakfast");
		// Log console message to Allure
	    LOGGER.info("Scroll down");
		AllureUtils.logStep("Scroll down");

		mobilelement.scrollDownToElement(driver, "Early Snacks");
		// Log console message to Allure
	    LOGGER.info("Scroll down");
		AllureUtils.logStep("Scroll down");
		// Scroll to "Dinner"
		mobilelement.scrollDownToElement(driver, "Lunch");
		// Log console message to Allure
	    LOGGER.info("Scroll down");
		AllureUtils.logStep("Scroll down");

		mobilelement.scrollDownToElement(driver, "Late Snacks");
		// Log console message to Allure
	    LOGGER.info("Scroll down");
		AllureUtils.logStep("Scroll down");
		
		mobilelement.scrollDownToElement(driver, "Dinner");
		// Log console message to Allure
	    LOGGER.info("Scroll down");
		AllureUtils.logStep("Scroll down");
		
		// Scroll to "TODAY'S FUEL SUMMARY"
		mobilelement.scrollDownToElement(driver, "Add An Event");
		// Log console message to Allure
	    LOGGER.info("Scroll down");
		AllureUtils.logStep("Scroll down");

		Thread.sleep(2000);
		// Scroll to "TODAY'S FUEL SUMMARY"
		mobilelement.scrollDownToElement(driver, "TODAY'S FUEL SUMMARY");
		// Log console message to Allure
	    LOGGER.info("Scroll down");
		AllureUtils.logStep("Scroll down");	
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case52_Fuel_uploadphotosforfuel1");
		
        
        /*************** Add  upload fuel images for breakfast***************/
        
        
        mobilelement.clickElement(driver, mobileLocators.uploadoptions);
        // Log console message to Allure
	    LOGGER.info("click on uploadoptions");
		AllureUtils.logStep("click on uploadoptions");
        
		// Click on Upload option from bottom
        Thread.sleep(2000);
		mobilelement.clickElement(driver, mobileLocators.uploadclickallbrakfast);
		// Log console message to Allure
	    LOGGER.info("click on uploadclickallbrakfast");
		AllureUtils.logStep("click on uploadclickallbrakfast");
		
		// Click on Upload option for Breakfast Option
		mobilelement.clickElement(driver, mobileLocators.breakfastuploadoption);
		// Log console message to Allure
	    LOGGER.info("click on breakfastuploadoption");
		AllureUtils.logStep("click on breakfastuploadoption");
		
		// Click on gallery option 
		mobilelement.clickElement(driver, mobileLocators.gallery);
		// Log console message to Allure
	    LOGGER.info("click on gallery");
		AllureUtils.logStep("click on gallery");
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case52_Fuel_uploadphotosforfuel2");
		
		// Select image 1 from gallery
		mobilelement.clickElement(driver, mobileLocators.galleryimage1);
		// Log console message to Allure
	    LOGGER.info("click on galleryimage1");
		AllureUtils.logStep("click on galleryimage1");
		
		// Click on add option from image viewer
		mobilelement.clickElement(driver, mobileLocators.addoption);
		// Log console message to Allure
	    LOGGER.info("click on addoption");
		AllureUtils.logStep("click on addoption");
		
		 // Set values in the picker elements
        String[] valuesToSet = {"7", "18", "AM"};
        mobilelement.setPickerValues(driver, mobileLocators.Timepicker, mobileLocators.pickerelement, valuesToSet);
        // Log console message to Allure
        LOGGER.info("Enter time values");
		AllureUtils.logStep("Enter time value");
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case52_Fuel_uploadphotosforfuel3");
        mobilelement.clickElement(driver, mobileLocators.Doneclick);
        // Log console message to Allure
	    LOGGER.info("click on Doneclick");
		AllureUtils.logStep("click on Doneclick");

        mobilelement.clickElement(driver, mobileLocators.submittap);
        // Log console message to Allure
	    LOGGER.info("click on submittap");
		AllureUtils.logStep("click on submittap");
        
        
        /*************** Add  upload fuel images for early snacks***************/
        
        // Click on Upload option from bottom
        Thread.sleep(2000);
		mobilelement.clickElement(driver, mobileLocators.uploadclickallearlysnacks);
		// Log console message to Allure
	    LOGGER.info("click on uploadclickallearlysnacks");
		AllureUtils.logStep("click on uploadclickallearlysnacks");
		
		// Click on Upload option for Breakfast Option
		mobilelement.clickElement(driver, mobileLocators.earlysnacksuploadoption);
		// Log console message to Allure
	    LOGGER.info("click on earlysnacksuploadoption");
		AllureUtils.logStep("click on earlysnacksuploadoption");
		
		// Click on gallery option 
		mobilelement.clickElement(driver, mobileLocators.gallery);
		// Log console message to Allure
	    LOGGER.info("click on gallery");
		AllureUtils.logStep("click on gallery");
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case52_Fuel_uploadphotosforfuel4");
		
		// Select image 1 from gallery
		mobilelement.clickElement(driver, mobileLocators.galleryimage2);
		// Log console message to Allure
	    LOGGER.info("click on galleryimage2");
		AllureUtils.logStep("click on galleryimage2");
		
		// Click on add option from image viewer
		mobilelement.clickElement(driver, mobileLocators.addoption);
		// Log console message to Allure
	    LOGGER.info("click on addoption");
		AllureUtils.logStep("click on addoption");
		
		 // Set values in the picker elements
        String[] valuesToSet2 = {"10", "18", "AM"};
        mobilelement.setPickerValues(driver, mobileLocators.Timepicker, mobileLocators.pickerelement, valuesToSet2);
        // Log console message to Allure
        LOGGER.info("Enter time values");
		AllureUtils.logStep("Enter time value");
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case52_Fuel_uploadphotosforfuel5");
        mobilelement.clickElement(driver, mobileLocators.Doneclick);

        mobilelement.clickElement(driver, mobileLocators.submittap);
        
        /*************** Add  upload fuel images for lunchs***************/
        
        // Click on Upload option from bottom
        Thread.sleep(2000);
		mobilelement.clickElement(driver, mobileLocators.uploadclickalllunch);
		
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
        // Log console message to Allure
        LOGGER.info("Enter time values");
		AllureUtils.logStep("Enter time value");
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case52_Fuel_uploadphotosforfuel7");
        mobilelement.clickElement(driver, mobileLocators.Doneclick);
        // Log console message to Allure
	    LOGGER.info("click on Doneclick");
		AllureUtils.logStep("click on Doneclick");

        mobilelement.clickElement(driver, mobileLocators.submittap);
        // Log console message to Allure
	    LOGGER.info("click on submittap");
		AllureUtils.logStep("click on submittap");
        
        
        /*************** Add  upload fuel images for late snacks***************/
        
        // Click on Upload option from bottom
        Thread.sleep(2000);
		mobilelement.clickElement(driver, mobileLocators.uploadclickallatesnacks);
		 // Log console message to Allure
	    LOGGER.info("click on uploadclickallatesnacks");
		AllureUtils.logStep("click on uploadclickallatesnacks");
		
		
		// Click on Upload option for Breakfast Option
		mobilelement.clickElement(driver, mobileLocators.latesnacksuploadoption);
		 // Log console message to Allure
	    LOGGER.info("click on latesnacksuploadoption");
		AllureUtils.logStep("click on latesnacksuploadoption");
		
		// Click on gallery option 
		mobilelement.clickElement(driver, mobileLocators.gallery);
		 // Log console message to Allure
	    LOGGER.info("click on gallery");
		AllureUtils.logStep("click on gallery");
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case52_Fuel_uploadphotosforfuel8");
		
		// Select image 1 from gallery
		mobilelement.clickElement(driver, mobileLocators.galleryimage4);
		 // Log console message to Allure
	    LOGGER.info("click on galleryimage4");
		AllureUtils.logStep("click on galleryimage4");
		
		// Click on add option from image viewer
		mobilelement.clickElement(driver, mobileLocators.addoption);
		 // Log console message to Allure
	    LOGGER.info("click on addoption");
		AllureUtils.logStep("click on addoption");
		
		 // Set values in the picker elements
        String[] valuesToSet4 = {"5", "15", "PM"};
        mobilelement.setPickerValues(driver, mobileLocators.Timepicker, mobileLocators.pickerelement, valuesToSet4);
        // Log console message to Allure
        LOGGER.info("Enter time values");
		AllureUtils.logStep("Enter time value");
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case52_Fuel_uploadphotosforfuel9");
        mobilelement.clickElement(driver, mobileLocators.Doneclick);
        // Log console message to Allure
	    LOGGER.info("click on Doneclick");
		AllureUtils.logStep("click on Doneclick");

        mobilelement.clickElement(driver, mobileLocators.submittap);
        // Log console message to Allure
	    LOGGER.info("click on submittap");
		AllureUtils.logStep("click on submittap");
        /*************** Add  upload fuel images for Dinner***************/
        
        // Click on Upload option from bottom
        Thread.sleep(2000);
		mobilelement.clickElement(driver, mobileLocators.uploadclickalldinner);
		 // Log console message to Allure
	    LOGGER.info("click on uploadclickalldinner");
		AllureUtils.logStep("click on uploadclickalldinner");
		
		// Click on Upload option for Breakfast Option
		mobilelement.clickElement(driver, mobileLocators.dinneruploadoption);
		 // Log console message to Allure
	    LOGGER.info("click on dinneruploadoption");
		AllureUtils.logStep("click on dinneruploadoption");
		
		// Click on gallery option 
		mobilelement.clickElement(driver, mobileLocators.gallery);
		 // Log console message to Allure
	    LOGGER.info("click on gallery");
		AllureUtils.logStep("click on gallery");
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case52_Fuel_uploadphotosforfuel10");
		
		// Select image 1 from gallery
		mobilelement.clickElement(driver, mobileLocators.galleryimage5);
		 // Log console message to Allure
	    LOGGER.info("click on galleryimage5");
		AllureUtils.logStep("click on galleryimage5");
		
		// Click on add option from image viewer
		mobilelement.clickElement(driver, mobileLocators.addoption);
		 // Log console message to Allure
	    LOGGER.info("click on addoption");
		AllureUtils.logStep("click on addoption");
		
		 // Set values in the picker elements
        String[] valuesToSet5 = {"5", "15", "PM"};
        mobilelement.setPickerValues(driver, mobileLocators.Timepicker, mobileLocators.pickerelement, valuesToSet5);
        // Log console message to Allure
        LOGGER.info("Enter time values");
		AllureUtils.logStep("Enter time value");
		
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case52_Fuel_uploadphotosforfuel11");
        mobilelement.clickElement(driver, mobileLocators.Doneclick);
        // Log console message to Allure
	    LOGGER.info("click on Doneclick");
		AllureUtils.logStep("click on Doneclick");

        mobilelement.clickElement(driver, mobileLocators.submittap);
        // Log console message to Allure
	    LOGGER.info("click on submittap");
		AllureUtils.logStep("click on submittap");
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case52_Fuel_uploadphotosforfuel12");
        
        
    	    
        mobilelement.clickElement(driver, mobileLocators.eventcross);
        // Log console message to Allure
	    LOGGER.info("click on eventcross");
		AllureUtils.logStep("click on eventcross");
        
        
    	// Scroll to "TODAY'S FUEL SUMMARY"
		mobilelement.scrollupToElement(driver, "TODAY'S FUEL SUMMARY");
		Thread.sleep(2000);
		// Log console message to Allure
	    LOGGER.info("Scroll up");
		AllureUtils.logStep("Scroll up");
		
		// Scroll to "Dinner"
		mobilelement.scrollupToElement(driver, "Dinner");
		// Log console message to Allure
	    LOGGER.info("Scroll up");
		AllureUtils.logStep("Scroll up");
        
        Thread.sleep(3000);
		// Scroll to "Early-Snacks"
		mobilelement.scrollupToElement(driver, "Early Snacks");
		// Log console message to Allure
	    LOGGER.info("Scroll up");
		AllureUtils.logStep("Scroll up");

        
        Thread.sleep(8500);
//        driver.terminateApp("com.cuesz.mobile");
        driver.terminateApp(mobileTestData.bundelID);
        
	}
}
