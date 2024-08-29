//https://chat.openai.com/share/f592ab35-529c-4434-a989-5fac7039696c
package cuesz03.Iosapp_member_home_Fuelscreen;

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
public class Case53_Fuel_notesbottom extends AppiummobileBase {
	
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
        AllureUtils.captureScreenshot(driver, "Case53_Fuel_notesbottom1");
		 
        /*************** Add  upload fuel images for breakfast***************/
        
        // Click on Fuel screen
        mobilelement.clickElement(driver, mobileLocators.notesclick);
        
        // Click on option1
        mobilelement.clickElement(driver, mobileLocators.option1);
        
        // Click on option2
        mobilelement.clickElement(driver, mobileLocators.option2);

     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case53_Fuel_notesbottom2");
        // Click on option3
        mobilelement.clickElement(driver, mobileLocators.option3);
       
       
        // Click on option3
        mobilelement.sendKeysToElement(driver, mobileLocators.Notesclick, mobileTestData.notefield);
        
        // Click on done from keypad 
        mobilelement.clickElement(driver, mobileLocators.doneclick1);
        
        
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case53_Fuel_notesbottom3");
        
        mobilelement.clickElement(driver, mobileLocators.tick);
        
        
        Thread.sleep(8500);
        driver.terminateApp("com.cuesz.mobile");
        
	}
}
