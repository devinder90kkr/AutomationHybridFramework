//https://chat.openai.com/share/f592ab35-529c-4434-a989-5fac7039696c
package cuesz03.Iosapp_member_home_Fuelscreen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

@Epic ("Member add additional fuel from Additional Fuel Button at bottom")
@Feature ("Verify member able to add additional Fuel for all categories")
public class Case51_Fuel_AdditionalfuelcaseforAll extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case20_Fuel_optimalfuel.class);
	mobileLocators locators = new mobileLocators();	

	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
	@Description("Member scroll to additional fuel button and than add fuel corresponding to each categories")
    @Story("Scroll to additional fuel and add breakfast to Dinner values")
	public void fueladditonalfuels() throws InterruptedException {	
try {
		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
				
        // Click on Home-icon
        mobilelement.clickElement(driver, mobileLocators.Homeclick);
        // Log console message to Allure
        LOGGER.info("Click on Homeclick");
        AllureUtils.logStep("Click on Homeclick");
        
  
		// scroll-down to perform fuel mind-full restore label
		mobilelement.scrollDownToElement(driver, "Perform Fuel Mindful Restore");
		 // Log console message to Allure
        LOGGER.info("Scrolldown to fuelcard");
        AllureUtils.logStep("Scrolldown to fuelcard");
		
	
		// Click on Fuel screen
        mobilelement.clickElement(driver, mobileLocators.Fuelhomeclick);
        // Log console message to Allure
        LOGGER.info("Click on Fuelhomeclick");
        AllureUtils.logStep("Click on Fuelhomeclick");
		
		Thread.sleep(3000);
		// Scroll to "Early-Snacks"
		mobilelement.scrollDownToElement(driver, "Early Snacks");
		 // Log console message to Allure
        LOGGER.info("Scrolldown to erlysnack");
        AllureUtils.logStep("Scrolldown to early snacks");

		// Scroll to "Dinner"
		mobilelement.scrollDownToElement(driver, "Dinner");
		 // Log console message to Allure
        LOGGER.info("Scrolldown to Dinner");
        AllureUtils.logStep("Scroll down to Dinner");

		// Scroll to "TODAY'S FUEL SUMMARY"
		mobilelement.scrollDownToElement(driver, "TODAY'S FUEL SUMMARY");
		Thread.sleep(2000);
		 // Log console message to Allure
        LOGGER.info("Scroll down to Today fuel summary");
        AllureUtils.logStep("Scroll down to Today fuel summary");
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case51_Fuel_Additional1");
		
		// Click on Additional fuel button
		mobilelement.clickElement(driver, mobileLocators.addtionafuelbttn);
		 // Log console message to Allure
        LOGGER.info("Click on addtionafuelbttn");
        AllureUtils.logStep("Click on addtionafuelbttn");
		
		// Click on done from keypad
		mobilelement.clickElement(driver, mobileLocators.doneclick);
		// Log console message to Allure
        LOGGER.info("Click on Done");
        AllureUtils.logStep("Click on Done");
		
		
		// Click on additional search search 
		mobilelement.clickElement(driver, mobileLocators.additionalsearch);
		// Log console message to Allure
        LOGGER.info("Click on additonasearc");
        AllureUtils.logStep("Click on addtionasearch");
		
		// Click on "F", "a", "g", "g", "o", "t"
        mobilelement.clickElementByText(driver, "F");
        mobilelement.clickElementByText(driver, "a");
        mobilelement.clickElementByText(driver, "g");
        mobilelement.clickElementByText(driver, "g");
        mobilelement.clickElementByText(driver, "o");
        mobilelement.clickElementByText(driver, "t");
        
        // Click on Keypad done (assuming done-click is defined as a locator)
        mobilelement.clickElement(driver, mobileLocators.doneclick);
        // Log console message to Allure
        LOGGER.info("Enter value in search and click on done");
        AllureUtils.logStep("Enter value in search and click on done");
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case51_Fuel_Additional2");
        
        // Click on fuel selection using the provided locator (faggot)
        mobilelement.clickElement(driver, mobileLocators.faggot);
        // Log console message to Allure
        LOGGER.info("Click on faggot");
        AllureUtils.logStep("Click on faggot");

        // scroll down to perform fuel mind-full restore label
     	mobilelement.scrollDownToElement(driver, "mobileLocators.fagotplus");
     	// Log console message to Allure
        LOGGER.info("Click on faggotplus");
        AllureUtils.logStep("Click on faggogt plus");
     		
     	// Click the faggot-plus element 3 times
        mobilelement.clickElementMultipleTimes(driver, mobileLocators.fagotplus, 3);
     // Log console message to Allure
        LOGGER.info("Click on faggoot plus");
        AllureUtils.logStep("Click on faggoot plus");
        
        Thread.sleep(4500);
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case51_Fuel_Additional3");
        
        // Set values in the picker elements
        String[] valuesToSet = {"8", "08", "AM"};
        mobilelement.setPickerValues(driver, mobileLocators.timepicker, mobileLocators.pickerelement, valuesToSet);

        mobilelement.clickElement(driver, mobileLocators.Doneclick);
        
        // Log console message to Allure
        LOGGER.info("Enter values in time");
        AllureUtils.logStep("Enter values in time");

        mobilelement.clickElement(driver, mobileLocators.submitick);
        
        // Log console message to Allure
        LOGGER.info("Click on submit tick");
        AllureUtils.logStep("Click on Submit tick");

        /*********Add early-snacks for category**********/
        
        // Click on Additional fuel button
        mobilelement.clickElement(driver, mobileLocators.addtionafuelbttn);
        // Log console message to Allure
        LOGGER.info("Click on addtionafuelbttn");
        AllureUtils.logStep("Click on addtionafuelbttn");
        
        // Click on done from keypad
     	mobilelement.clickElement(driver, mobileLocators.doneclick);
     	// Log console message to Allure
        LOGGER.info("Click on done button");
        AllureUtils.logStep("Click on done button");
     		
     	// Click on additional search search 
     	mobilelement.clickElement(driver, mobileLocators.additionalsearch);
     	// Log console message to Allure
        LOGGER.info("Click on addtionafuelbttn");
        AllureUtils.logStep("Click on addtionafuelbttn");
        
     	// Add Grape food in list
        mobilelement.clickElementByText(driver, "G");
        mobilelement.clickElementByText(driver, "r");
        mobilelement.clickElementByText(driver, "a");
        mobilelement.clickElementByText(driver, "p");
        mobilelement.clickElementByText(driver, "e");
        
        // Click on Keypad done (assuming done-click is defined as a locator)
        mobilelement.clickElement(driver, mobileLocators.doneclick);
        
        // Log console message to Allure
        LOGGER.info("Enter values ins earch and click on done");
        AllureUtils.logStep("Enter values in search and click on done");
        
        // Click on fuel selection using the provided locator (faggot)
        mobilelement.clickElement(driver, mobileLocators.grapefuel);
        // Log console message to Allure
        LOGGER.info("Click on graphfuel");
        AllureUtils.logStep("Click on graph fuel");
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case51_Fuel_Additional4");
        
        // scroll down to perform fuel mind-full restore label
     	mobilelement.scrollDownToElement(driver, "mobileLocators.grapefuel");
     	// Log console message to Allure
        LOGGER.info("scroll down to grapesfuel");
        AllureUtils.logStep("Scroll down to grapesfuel");
        
     	
        // Click on Early snacks category
        mobilelement.clickElement(driver, mobileLocators.eventcategory);
        // Log console message to Allure
        LOGGER.info("Click on eventcategory");
        AllureUtils.logStep("Click on event category");
      
        // Set values in the picker elements
        String[] valuesToSet2 = {"10", "08", "AM"};
        mobilelement.setPickerValues(driver, mobileLocators.timepicker, mobileLocators.pickerelement, valuesToSet2);
        
        mobilelement.clickElement(driver, mobileLocators.Doneclick);
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case51_Fuel_Additional5");

        mobilelement.clickElement(driver, mobileLocators.submitick);
        
        
        /*********Add Lunch for category**********/
        
        // Click on Additional fuel button
        mobilelement.clickElement(driver, mobileLocators.addtionafuelbttn);
        
        // Click on done from keypad
     	mobilelement.clickElement(driver, mobileLocators.doneclick);
     	
     	 // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case51_Fuel_Additional6");
     		
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
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case51_Fuel_Additional7");
        
        // Click on Early snacks category
        mobilelement.clickElement(driver, mobileLocators.lunchcategory);
      
        // Set values in the picker elements
        String[] valuesToSet3 = {"2", "18", "PM"};
        mobilelement.setPickerValues(driver, mobileLocators.timepicker, mobileLocators.pickerelement, valuesToSet3);
        
        mobilelement.clickElement(driver, mobileLocators.Doneclick);

        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case51_Fuel_Additional8");
        
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
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case51_Fuel_Additional9");
        
        // Click on fuel selection using the provided locator (faggot)
        mobilelement.clickElement(driver, mobileLocators.fiofuel);
        
        // Click on Early snacks category
        mobilelement.clickElement(driver, mobileLocators.latesnackscategory);
      
        // Set values in the picker elements
        String[] valuesToSet4 = {"2", "18", "PM"};
        mobilelement.setPickerValues(driver, mobileLocators.timepicker, mobileLocators.pickerelement, valuesToSet4);
        
        mobilelement.clickElement(driver, mobileLocators.Doneclick);
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case51_Fuel_Additional10");

        mobilelement.clickElement(driver, mobileLocators.submitick);
        
        /*********Add Dinner for category**********/
        
        // Click on Additional fuel button
        mobilelement.clickElement(driver, mobileLocators.addtionafuelbttn);
        
        // Click on done from keypad
     	mobilelement.clickElement(driver, mobileLocators.doneclick);
     		
     	// Click on additional search search 
     	mobilelement.clickElement(driver, mobileLocators.additionalsearch);
        
     	// Add Grape food in list
        mobilelement.clickElementByText(driver, "H");
        mobilelement.clickElementByText(driver, "u");
        mobilelement.clickElementByText(driver, "m");
      
        
        // Click on Keypad done (assuming done-click is defined as a locator)
        mobilelement.clickElement(driver, mobileLocators.doneclick);
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case51_Fuel_Additional11");
        
        // Click on fuel selection using the provided locator (faggot)
        mobilelement.clickElement(driver, mobileLocators.humfuel);
        
        // Click on Early snacks category
        mobilelement.clickElement(driver, mobileLocators.dinnercategory);

        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case51_Fuel_Additional12");
        
        
        mobilelement.clickElement(driver, mobileLocators.submitick);
        
        
        
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
   }
}
}