//https://chat.openai.com/share/f592ab35-529c-4434-a989-5fac7039696c
package cuesz04.Iosapp_member_home_Restore;

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

@Epic ("Member add additional restore from plus icon")
@Feature ("Verify member able to add additonal restore options")
public class Case55_Restore_Add extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case55_Restore_Add.class);
	
	mobileLocators locators = new mobileLocators();	

	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
	@Description("Member scroll to restore and able to add by using restor from + icon")
    @Story("Scroll to ")
	public void restoraddoption() throws InterruptedException {	
try {
		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
//        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
		 appiumUtils.launchAppWithPackageId(mobileTestData.bundelID);
				
        // Click on Home-icon
        mobilelement.clickElement(driver, mobileLocators.Homeclick);
        
        // Log message to console and Allure report
        LOGGER.info("Click on Home menu button");
        AllureUtils.logStep("Click on Home button"); 
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case55_Restore_Add1"); 
        
  
		// scroll-down to perform fuel mind-full restore label
		mobilelement.scrollDownToElement(driver, "Perform Fuel Mindful Restore");
	
		// Log message to console and Allure report
        LOGGER.info("Scroll down to restore");
        AllureUtils.logStep("Scroll down to restore"); 
        
	
		// Click on Restore screen
        mobilelement.clickElement(driver, mobileLocators.restoreclick);
        Thread.sleep(2500);        // Log message to console and Allure report
        
        LOGGER.info("Click on restore screen");
        AllureUtils.logStep("Click on restore screen");  
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case55_Restore_Add2"); 
        
       
        //Click on +icon for restore
        mobilelement.clickElement(driver, mobileLocators.restoreplus);
        
        LOGGER.info("Click on restore plus icon");
        AllureUtils.logStep("Click on restore plus icon");  
        
        //Click on +icon for restore
        mobilelement.clickElement(driver, mobileLocators.addcomemnt);
        
        LOGGER.info("Add comment popup opened");
        AllureUtils.logStep("Add comment popup opend");  
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case55_Restore_Add3"); 
        
        //Click on additional restore options. 
        mobilelement.clickElement(driver, mobileLocators.restoraddcomment1);
        LOGGER.info("click on Add comment options1");
        AllureUtils.logStep("Click on options1 for add comemnt in restore");  
        
        //Click on additional restore options. 
        mobilelement.clickElement(driver, mobileLocators.restoraddcomment2);
        LOGGER.info("click on Add comment options2");
        AllureUtils.logStep("Click on options2 for add comemnt in restore");  
        
        //Click on additional restore options. 
        mobilelement.clickElement(driver, mobileLocators.restoraddcomment3);
        LOGGER.info("click on Add comment options3");
        AllureUtils.logStep("Click on options3 for add comemnt in restore");  
        
        //Click on additional restore options. 
        mobilelement.clickElement(driver, mobileLocators.restoraddcomment4);
        LOGGER.info("click on Add comment options4");
        AllureUtils.logStep("Click on options4 for add comemnt in restore");  
        
        //Click on additional restore options. 
        mobilelement.clickElement(driver, mobileLocators.restoraddcomment5);
        LOGGER.info("click on Add comment options5");
        AllureUtils.logStep("Click on options5 for add comemnt in restore");  
        
        //Click on additional restore options. 
        mobilelement.clickElement(driver, mobileLocators.restoraddcomment6);
        LOGGER.info("click on Add comment options");
        AllureUtils.logStep("Click on options for add comemnt in restore");  
     
        
        mobilelement.sendKeysToElement(driver,mobileLocators.Noteclick , mobileTestData.notefield);
        LOGGER.info("Enter values for NOtes field for additonal comment in restore");
        AllureUtils.logStep("Enter values for NOtes field for additonal comment in restore");  
    
        
        //Click on additional restore options. 
        mobilelement.clickElement(driver, mobileLocators.Submitclick);
        //Click on additional restore options. 
        mobilelement.clickElement(driver, mobileLocators.Submitclick);
      
        LOGGER.info("click on Submit tick");
        AllureUtils.logStep("Click on Submit tick"); 
        
        // scroll-down to perform fuel mind-full restore label
     		mobilelement.scrollDownToElement(driver, "Restore Comment");
        
    
     
        //Click on +icon for restore
        mobilelement.clickElement(driver, mobileLocators.restoreplus);
        //again click on restore plus icon to view all fields values
        
} catch (Exception e) {
    LOGGER.error("An error occurred during the mindful screen test", e);
    AllureUtils.logStep("An error occurred: " + e.getMessage());
} finally {
    // Terminate the app whether the test passed or failed
    try {
        Thread.sleep(8500);
    } catch (InterruptedException e) {
        LOGGER.error("Thread interrupted during final sleep", e);
        Thread.currentThread().interrupt();
    }
//    driver.terminateApp("com.cuesz.mobile");
    driver.terminateApp(mobileTestData.bundelID);
}
}}