//https://chat.openai.com/share/f592ab35-529c-4434-a989-5fac7039696c
package cuesz03.Iosapp_member_home_Fuelscreen;

import org.testng.annotations.Test;
import cuesz.pages.AppiummobileBase;
import cuesz.utils.AllureUtils;
import cuesz.utils.AppiumappUtils;
import cuesz.utils.mobileLocators;
import cuesz.utils.mobilelement;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Member add additional fuel from Additional Fuel Button at bottom")
@Feature ("Verify member able to add additional Fuel for all categories")
public class Case51_Fuel_AdditionalfuelcaseforAll extends AppiummobileBase {
	
	mobileLocators locators = new mobileLocators();	

	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
	@Description("Member scroll to additional fuel button and than add fuel corresponding to each categories")
    @Story("Scroll to additional fuel and add breakfast to Dinner values")
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
        AllureUtils.captureScreenshot(driver, "Case51_Fuel_Additional1");
		
		// Click on Additional fuel button
		mobilelement.clickElement(driver, mobileLocators.addtionafuelbttn);
		
		// Click on done from keypad
		mobilelement.clickElement(driver, mobileLocators.doneclick);
		
		// Click on additional search search 
		mobilelement.clickElement(driver, mobileLocators.additionalsearch);
		
		// Click on "F", "a", "g", "g", "o", "t"
        mobilelement.clickElementByText(driver, "F");
        mobilelement.clickElementByText(driver, "a");
        mobilelement.clickElementByText(driver, "g");
        mobilelement.clickElementByText(driver, "g");
        mobilelement.clickElementByText(driver, "o");
        mobilelement.clickElementByText(driver, "t");
        
        // Click on Keypad done (assuming done-click is defined as a locator)
        mobilelement.clickElement(driver, mobileLocators.doneclick);
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case51_Fuel_Additional2");
        
        // Click on fuel selection using the provided locator (faggot)
        mobilelement.clickElement(driver, mobileLocators.faggot);

        // scroll down to perform fuel mind-full restore label
     	mobilelement.scrollDownToElement(driver, "mobileLocators.fagotplus");
     		
     	// Click the faggot-plus element 3 times
        mobilelement.clickElementMultipleTimes(driver, mobileLocators.fagotplus, 3);
        
        Thread.sleep(4500);
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case51_Fuel_Additional3");
        
        // Set values in the picker elements
        String[] valuesToSet = {"8", "08", "AM"};
        mobilelement.setPickerValues(driver, mobileLocators.timepicker, mobileLocators.pickerelement, valuesToSet);

        mobilelement.clickElement(driver, mobileLocators.Doneclick);

        mobilelement.clickElement(driver, mobileLocators.submitick);

        /*********Add early-snacks for category**********/
        
        // Click on Additional fuel button
        mobilelement.clickElement(driver, mobileLocators.addtionafuelbttn);
        
        // Click on done from keypad
     	mobilelement.clickElement(driver, mobileLocators.doneclick);
     		
     	// Click on additional search search 
     	mobilelement.clickElement(driver, mobileLocators.additionalsearch);
        
     	// Add Grape food in list
        mobilelement.clickElementByText(driver, "G");
        mobilelement.clickElementByText(driver, "r");
        mobilelement.clickElementByText(driver, "a");
        mobilelement.clickElementByText(driver, "p");
        mobilelement.clickElementByText(driver, "e");
        
        // Click on Keypad done (assuming done-click is defined as a locator)
        mobilelement.clickElement(driver, mobileLocators.doneclick);
        
        // Click on fuel selection using the provided locator (faggot)
        mobilelement.clickElement(driver, mobileLocators.grapefuel);
        
        // scroll down to perform fuel mind-full restore label
     	mobilelement.scrollDownToElement(driver, "mobileLocators.grapefuel");
        
     	
        // Click on Early snacks category
        mobilelement.clickElement(driver, mobileLocators.eventcategory);
      
        // Set values in the picker elements
        String[] valuesToSet2 = {"10", "08", "AM"};
        mobilelement.setPickerValues(driver, mobileLocators.timepicker, mobileLocators.pickerelement, valuesToSet2);
        
        mobilelement.clickElement(driver, mobileLocators.Doneclick);

        mobilelement.clickElement(driver, mobileLocators.submitick);
        
        
        /*********Add Lunch for category**********/
        
        // Click on Additional fuel button
        mobilelement.clickElement(driver, mobileLocators.addtionafuelbttn);
        
        // Click on done from keypad
     	mobilelement.clickElement(driver, mobileLocators.doneclick);
     		
     	// Click on additional search search 
     	mobilelement.clickElement(driver, mobileLocators.additionalsearch);
        
     	// Add Grape food in list
        mobilelement.clickElementByText(driver, "R");
        mobilelement.clickElementByText(driver, "e");
        mobilelement.clickElementByText(driver, "s");
      
        
        // Click on Keypad done (assuming done-click is defined as a locator)
        mobilelement.clickElement(driver, mobileLocators.doneclick);
        
        // Click on fuel selection using the provided locator (faggot)
        mobilelement.clickElement(driver, mobileLocators.resfuel);
        
        // Click on Early snacks category
        mobilelement.clickElement(driver, mobileLocators.lunchcategory);
      
        // Set values in the picker elements
        String[] valuesToSet3 = {"2", "18", "PM"};
        mobilelement.setPickerValues(driver, mobileLocators.timepicker, mobileLocators.pickerelement, valuesToSet3);
        
        mobilelement.clickElement(driver, mobileLocators.Doneclick);

        mobilelement.clickElement(driver, mobileLocators.submitick);
        
        /*********Add Latesnacks for category**********/
        
        // Click on Additional fuel button
        mobilelement.clickElement(driver, mobileLocators.addtionafuelbttn);
        
        // Click on done from keypad
     	mobilelement.clickElement(driver, mobileLocators.doneclick);
     		
     	// Click on additional search search 
     	mobilelement.clickElement(driver, mobileLocators.additionalsearch);
        
     	// Add Grape food in list
        mobilelement.clickElementByText(driver, "F");
        mobilelement.clickElementByText(driver, "i");
        mobilelement.clickElementByText(driver, "o");
      
        
        // Click on Keypad done (assuming done-click is defined as a locator)
        mobilelement.clickElement(driver, mobileLocators.doneclick);
        
        // Click on fuel selection using the provided locator (faggot)
        mobilelement.clickElement(driver, mobileLocators.fiofuel);
        
        // Click on Early snacks category
        mobilelement.clickElement(driver, mobileLocators.latesnackscategory);
      
        // Set values in the picker elements
        String[] valuesToSet4 = {"2", "18", "PM"};
        mobilelement.setPickerValues(driver, mobileLocators.timepicker, mobileLocators.pickerelement, valuesToSet4);
        
        mobilelement.clickElement(driver, mobileLocators.Doneclick);

        mobilelement.clickElement(driver, mobileLocators.submitick);
        
        
        
        
        
        
        
     	Thread.sleep(3500);	
        
	}
}
