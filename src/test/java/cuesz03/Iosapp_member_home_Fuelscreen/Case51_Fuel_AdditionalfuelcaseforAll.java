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

@Epic ("Member Add an event screen detail ")
@Feature ("Verify member able to add functionlaity related to add an event for post-performance functionlaity.")
public class Case51_Fuel_AdditionalfuelcaseforAll extends AppiummobileBase {
	
	mobileLocators locators = new mobileLocators();	

	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
	@Description("Member scroll to add an Event screen for post-perfoemnace detail verification")
    @Story("Scroll to post-performance detail and add its related values")
	public void Fuel_addaneventadditionalcasewithpostperformance() throws InterruptedException {	

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

        
        
     		
        
	}
}

