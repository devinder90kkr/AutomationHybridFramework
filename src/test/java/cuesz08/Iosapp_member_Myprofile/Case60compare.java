package cuesz08.Iosapp_member_Myprofile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import cuesz.pages.AppiummobileBase;
import cuesz.utils.AllureUtils;
import cuesz.utils.AppiumappUtils;
import cuesz.utils.mobileLocators;
import cuesz.utils.mobileTestData;
import cuesz.utils.mobilelement;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Member Compare feature")
@Feature ("Verify that member able to acess compare features")
public class Case60compare extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case60compare.class);
	
	mobileLocators locators = new mobileLocators();	

	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
	@Description("Member able to access compare feature")
    @Story("Change data in compare features")
	public void avtarcomparescren() throws InterruptedException {	
	try {
		// Create an instance of AppiumUtils and pass the driver
            AppiumappUtils appiumUtils = new AppiumappUtils(driver);
            // Launch the app using the utility method
            appiumUtils.launchAppWithPackageId("com.cuesz.mobile");

            // Click on Home-icon
            mobilelement.clickElement(driver, mobileLocators.profilclick);

            // Log message to console and Allure report
            LOGGER.info("Click on profile icon from menu button");
            AllureUtils.logStep("Click from profile icon from home menu");
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case60compare1");

            
            //Click on avatar postire 
            mobilelement.clickElement(driver, mobileLocators.Posturedclick);
            // Log message to console and Allure report
            LOGGER.info("Click on Avatar posture from profile screen");
            AllureUtils.logStep("Click on Avatar posture from profile screen");
            
            
            
            
            
            
            
            Thread.sleep(2500);
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case60compare2");
            
            //Scroll to Compare text
            mobilelement.scrollDownToElement(driver, "Compare");
            // Log message to console and Allure report
            LOGGER.info("Scroll down to Compare");
            AllureUtils.logStep("Scroll down to Compare");
            
            mobilelement.clickElement(driver, mobileLocators.comparebttn); 
            // Log message to console and Allure report
            LOGGER.info("Click on Compare button ");
            AllureUtils.logStep("Click on compare button");
            Thread.sleep(2500);
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case60compare3");
 
            
            //Click on dropdown list 1 for compared 
            mobilelement.clickElement(driver, mobileLocators.drop1);
            // Log message to console and Allure report
            LOGGER.info("Click on compared date option ");
            AllureUtils.logStep("Click on compared data option");
 
            // Option text to select
            String optionText = mobileTestData.comparedate1;
            // Construct the XPath for the desired option
            By dropdownOption = By.xpath("//XCUIElementTypeOther[@name='" + optionText + "']");


            // Find the element using MobileElement instead of WebElement
            WebElement element = (WebElement) driver.findElement(dropdownOption);
            // Click on the element using MobileElement API
            element.click();

            // Logging and reporting
            LOGGER.info("Selected option from dropdown: " + optionText);
            AllureUtils.logStep("Selected option from dropdown: " + optionText);
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case60compare4");

            // Add a delay if needed to allow the dropdown to close or for the next step
            Thread.sleep(2500);
            
										        //Click on dropdown list 2 for compared 
										        mobilelement.clickElement(driver, mobileLocators.dropd2);
										        // Log message to console and Allure report
										        LOGGER.info("Click on compared date option ");
										        AllureUtils.logStep("Click on compared data option");
										 
										            // Option text to select
										        String optionText1 = mobileTestData.comparedate2;
										        // Construct the XPath for the desired option
										        By dropdownOption1 = By.xpath("//XCUIElementTypeOther[@name='" + optionText1 + "']");
										
										        // Find the element using MobileElement instead of WebElement
										        WebElement element1 = (WebElement) driver.findElement(dropdownOption1);
										        // Click on the element using MobileElement API
										        element1.click();
										
										        // Logging and reporting
										        LOGGER.info("Selected option from dropdown: " + optionText1);
										        AllureUtils.logStep("Selected option from dropdown: " + optionText1);
										        // Capture a screenshot and attach it to Allure
									            AllureUtils.captureScreenshot(driver, "Case60compare5");
										
										        // Add a delay if needed to allow the dropdown to close or for the next step
										        Thread.sleep(2500);
            
            
		      //Click on dropdown list 1 for compared 
	            mobilelement.clickElement(driver, mobileLocators.drop1);
	            // Log message to console and Allure report
	            LOGGER.info("Click on compared date option ");
	            AllureUtils.logStep("Click on compared data option");
	 
	            // Option text to select
	            String optionText2 = mobileTestData.comparedate3;
	            // Construct the XPath for the desired option
	            By dropdownOption2 = By.xpath("//XCUIElementTypeOther[@name='" + optionText2 + "']");


	            // Find the element using MobileElement instead of WebElement
	            WebElement element2 = (WebElement) driver.findElement(dropdownOption2);
	            // Click on the element using MobileElement API
	            element2.click();

	            // Logging and reporting
	            LOGGER.info("Selected option from dropdown: " + optionText2);
	            AllureUtils.logStep("Selected option from dropdown: " + optionText2);

	            // Capture a screenshot and attach it to Allure
	            AllureUtils.captureScreenshot(driver, "Case60compare6");
	            // Add a delay if needed to allow the dropdown to close or for the next step
	            Thread.sleep(2500);
	            

								            //Click on dropdown list 2 for compared 
									        mobilelement.clickElement(driver, mobileLocators.dropd2);
									        // Log message to console and Allure report
									        LOGGER.info("Click on compared date option ");
									        AllureUtils.logStep("Click on compared data option");
									 
									            // Option text to select
									        String optionText3 = mobileTestData.comparedate4;
									        // Construct the XPath for the desired option
									        By dropdownOption3 = By.xpath("//XCUIElementTypeOther[@name='" + optionText3 + "']");
									
									        // Find the element using MobileElement instead of WebElement
									        WebElement element3 = (WebElement) driver.findElement(dropdownOption3);
									        // Click on the element using MobileElement API
									        element3.click();
									
									        // Logging and reporting
									        LOGGER.info("Selected option from dropdown: " + optionText3);
									        AllureUtils.logStep("Selected option from dropdown: " + optionText3);
		
									        // Capture a screenshot and attach it to Allure
								            AllureUtils.captureScreenshot(driver, "Case60compare7");
									        // Add a delay if needed to allow the dropdown to close or for the next step
									        Thread.sleep(2500);
										        
										        
										        
            
            
            
            
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