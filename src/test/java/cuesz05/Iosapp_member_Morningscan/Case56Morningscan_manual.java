//https://chat.openai.com/share/f592ab35-529c-4434-a989-5fac7039696c
package cuesz05.Iosapp_member_Morningscan;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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

@Epic ("Member add Member_manual_input data")
@Feature ("Verify that member able to add manual morning scan data")
public class Case56Morningscan_manual extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case56Morningscan_manual.class);
	
	mobileLocators locators = new mobileLocators();	

	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
	@Description("Member scroll to restore and able to add by using restor from + icon")
    @Story("Scroll to ")
	public void manualmorningscan() throws InterruptedException {	
try {
		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
				
        // Click on Home-icon
        mobilelement.clickElement(driver, mobileLocators.Morningscanclick);
        
        // Log message to console and Allure report
        LOGGER.info("Click on Morningscan menu button");
        AllureUtils.logStep("Click on Morning scan menu button"); 
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case56Morningscan_manual1"); 
        
        mobilelement.clickElement(driver, mobileLocators.manualinput);
        // Log message to console and Allure report
        LOGGER.info("Click on manual input link");
        AllureUtils.logStep("Click on manual input link"); 
        Thread.sleep(2000);
      
		
        mobilelement.clickElement(driver, mobileLocators.backpressbutton);
        // Log message to console and Allure report
        LOGGER.info("Click on back button");
        AllureUtils.logStep("Click on back button"); 
        
        mobilelement.clickElement(driver, mobileLocators.manualinput);
        // Log message to console and Allure report
        LOGGER.info("Click on manual input link");
        AllureUtils.logStep("Click on manual input link"); 
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case56Morningscan_manual2"); 
        
        // Click on HRV + & - icon
        mobilelement.clickElementMultipleTimes(driver,mobileLocators.HRVminus,6);
        // Log message to console and Allure report
        LOGGER.info("Click on HRV minus ");
        AllureUtils.logStep("Click on HRV minus"); 
        mobilelement.clickElementMultipleTimes(driver,mobileLocators.HRVplus,8);
        // Log message to console and Allure report
        LOGGER.info("Click on HRV plus");
        AllureUtils.logStep("Click on HRV plus"); 
        
        //Click on RHR + & - icon
        mobilelement.clickElementMultipleTimes(driver,mobileLocators.RHRminus,8);
        // Log message to console and Allure report
        LOGGER.info("Click on RHR minus ");
        AllureUtils.logStep("Click on RHR minus"); 
        mobilelement.clickElementMultipleTimes(driver,mobileLocators.RHRplus,12);
        // Log message to console and Allure report
        LOGGER.info("Click on RHR plus");
        AllureUtils.logStep("Click on RHR plus"); 
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case56Morningscan_manual3"); 
        
        //Click on Gripstength L option for + & - icon         
        mobilelement.clickElementMultipleTimes(driver,mobileLocators.Lminus,5);
        // Log message to console and Allure report
        LOGGER.info("Click on Grip L minus ");
        AllureUtils.logStep("Click on Grip L minus"); 
        mobilelement.clickElementMultipleTimes(driver,mobileLocators.Lplus,9);
        // Log message to console and Allure report
        LOGGER.info("Click on Grip L plus");
        AllureUtils.logStep("Click on Grip L plus"); 
        
        
        //Click on Gripstength R option for + & - icon         
        mobilelement.clickElementMultipleTimes(driver,mobileLocators.Rminus,5);
        // Log message to console and Allure report
        LOGGER.info("Click on Grip R minus ");
        AllureUtils.logStep("Click on Grip R minus"); 
        mobilelement.clickElementMultipleTimes(driver,mobileLocators.Rplus,9);
        // Log message to console and Allure report
        LOGGER.info("Click on Grip R plus");
        AllureUtils.logStep("Click on Grip R plus"); 
        
        //Click on Grip strenght option
        mobilelement.clickElementMultipleTimes(driver, mobileLocators.Gripoption, 1);        
        // Log message to console and Allure report
        LOGGER.info("Click on Grip-options");
        AllureUtils.logStep("Click on Grip-options"); 
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case56Morningscan_manual4"); 
        
        //Enter values for Co2 field 
        mobilelement.sendKeysToElement(driver, mobileLocators.co2field, mobileTestData.Co2text);
        // Log message to console and Allure report
        LOGGER.info("Enter values for Co2 field");
        AllureUtils.logStep("Enter values for Co2 field"); 
        
        mobilelement.sendKeysToElement(driver,mobileLocators.Noteclick , mobileTestData.notefield);
        LOGGER.info("Enter values for NOtes field for additonal comment in restore");
        AllureUtils.logStep("Enter values for NOtes field for additonal comment in restore");  
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case56Morningscan_manual5"); 
        
        //Click on Update button
        mobilelement.clickElement(driver, mobileLocators.Updatebutton);

        //Click on Update button
        mobilelement.clickElement(driver, mobileLocators.Updatebutton);
        // Log message to console and Allure report
        LOGGER.info("Click on Update button");
        AllureUtils.logStep("Click on Update button"); 
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case56Morningscan_manual6"); 
        
        //Click on sleep Quality
        mobilelement.clickElement(driver, mobileLocators.sleep1);
        mobilelement.clickElement(driver, mobileLocators.sleep2);
        // Log message to console and Allure report
        LOGGER.info("Click on sleep options");
        AllureUtils.logStep("Click on sleep options"); 
        
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case56Morningscan_manual6"); 
        
        
        //Click on mental Energy
        mobilelement.clickElement(driver, mobileLocators.mental1);
        mobilelement.clickElement(driver, mobileLocators.mental2);
        // Log message to console and Allure report
        LOGGER.info("Click on mental options");
        AllureUtils.logStep("Click on mental options"); 
     
        //Click on Physical Energy
        mobilelement.clickElement(driver, mobileLocators.physical1);
        mobilelement.clickElement(driver, mobileLocators.physical2);
        // Log message to console and Allure report
        LOGGER.info("Click on Physical Physical");
        AllureUtils.logStep("Click on mental options"); 
        
        
        //Click on Muscular Sorness
        mobilelement.clickElement(driver, mobileLocators.musucle1);
        mobilelement.clickElement(driver, mobileLocators.musucle2);
        // Log message to console and Allure report
        LOGGER.info("Click on Muscular Sornees options");
        AllureUtils.logStep("Click on Muscular sorness options"); 
        
        //Click On stress
        mobilelement.clickElement(driver,mobileLocators.strees1);
        // Log message to console and Allure report
        LOGGER.info("Click on Stree options");
        AllureUtils.logStep("Click on Stress options"); 
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case56Morningscan_manual6"); 
        
        mobilelement.clickElement(driver, mobileLocators.tick);
        // Log message to console and Allure report
        LOGGER.info("Click on Tick options");
        AllureUtils.logStep("Click on tick options"); 
        
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
    driver.terminateApp("com.cuesz.mobile");
}
}}