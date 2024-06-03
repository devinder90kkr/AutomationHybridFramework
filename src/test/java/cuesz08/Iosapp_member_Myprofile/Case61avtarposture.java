package cuesz08.Iosapp_member_Myprofile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import cuesz.pages.AppiummobileBase;
import cuesz.utils.AllureUtils;
import cuesz.utils.AppiumappUtils;
import cuesz.utils.mobileLocators;
import cuesz.utils.mobileTestData;
import cuesz.utils.mobilelement;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Member access review body scan detail")
@Feature ("Verify that member able to access my profile setting and check body scan result")
public class Case61avtarposture extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case61avtarposture.class);
	
	mobileLocators locators = new mobileLocators();	

	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
	@Description("Member able to review body scan detail")
    @Story("Body scan result feature access able by member ")
	public void avtarscren() throws InterruptedException {	
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
            AllureUtils.captureScreenshot(driver, "Case59Myprofile1");

            
            //Click on avatar postire 
            mobilelement.clickElement(driver, mobileLocators.Posturedclick);
            // Log message to console and Allure report
            LOGGER.info("Click on Avatar posture from profile screen");
            AllureUtils.logStep("Click on Avatar posture from profile screen");
            
            Thread.sleep(2500);
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case59Myprofile2");
            
            
									      //Click on dropdown list 1 for compared 
									        mobilelement.clickElement(driver, mobileLocators.bodyscandrop);
									        // Log message to console and Allure report
									        LOGGER.info("Click on compared date option ");
									        AllureUtils.logStep("Click on compared data option");
									 
									            // Option text to select
									        String optionText3 = mobileTestData.posturedate3;
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
									        AllureUtils.captureScreenshot(driver, "Case60compare41");   
            
            
            //Click on dropdown list 2 for compared 
            mobilelement.clickElement(driver, mobileLocators.bodyscandrop);
            // Log message to console and Allure report
            LOGGER.info("Click on compared date option ");
            AllureUtils.logStep("Click on compared data option");
 
            // Option text to select
            String optionText = mobileTestData.posturedate2;
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
            AllureUtils.captureScreenshot(driver, "Case60compare42");    
            
            
											      //Click on dropdown list 3 for compared 
											        mobilelement.clickElement(driver, mobileLocators.bodyscandrop);
											        // Log message to console and Allure report
											        LOGGER.info("Click on compared date option ");
											        AllureUtils.logStep("Click on compared data option");
											 
											            // Option text to select
											        String optionText1 = mobileTestData.posturedate1;
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
											        AllureUtils.captureScreenshot(driver, "Case60compare4");  
            
											        Thread.sleep(2500);
											     // Click on right arrow 4 times
											        for (int i = 0; i < 4; i++) {
											            mobilelement.clickElement(driver, mobileLocators.rightarrow);
											            LOGGER.info("Clicked right arrow " + (i + 1) + " of 4 times");
											            AllureUtils.logStep("Clicked right arrow " + (i + 1) + " of 4 times");
											            AllureUtils.captureScreenshot(driver, "RightArrowClick" + (i + 1));
											            Thread.sleep(500); // Adjust the sleep duration as needed
											        }
											        Thread.sleep(2500);
											        // Click on left arrow 3 times
											        for (int i = 0; i < 3; i++) {
											            mobilelement.clickElement(driver, mobileLocators.leftarrow);
											            LOGGER.info("Clicked left arrow " + (i + 1) + " of 3 times");
											            AllureUtils.logStep("Clicked left arrow " + (i + 1) + " of 3 times");
											            AllureUtils.captureScreenshot(driver, "LeftArrowClick" + (i + 1));
											            Thread.sleep(500); // Adjust the sleep duration as needed
											        }
            
            
            //Click on body scan sphere
            mobilelement.clickElement(driver, mobileLocators.scanspeher);            
            // Logging and reporting
            LOGGER.info("Click in scan sphere icon to view image");
            AllureUtils.logStep("Click in scan sphere icon to view image");
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case60compare5");    
            
            mobilelement.clickElement(driver, mobileLocators.bodyscangrid);
            // Logging and reporting
            LOGGER.info("Click on bodyscangrid");
            AllureUtils.logStep("Click on bodyscangrid");
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case60compare6");    

            
            Thread.sleep(2500);
            mobilelement.clickElement(driver, mobileLocators.movetoresult);  
            // Logging and reporting
            LOGGER.info("Click on movetoresult");
            AllureUtils.logStep("Click on movetoresult");
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case60compare7");    
            
            Thread.sleep(2500);
            //Click on back button
            mobilelement.clickElement(driver, mobileLocators.backpressbutton);
            // Log message to console and Allure report
            LOGGER.info("Click on backpressbutton");
            AllureUtils.logStep("Click on backpressbutton");
            
            mobilelement.clickElement(driver, mobileLocators.movetoresult);  
            // Logging and reporting
            LOGGER.info("Click on movetoresult");
            AllureUtils.logStep("Click on movetoresult");
            
            Thread.sleep(2500);
            mobilelement.clickElement(driver, mobileLocators.totalbodyfat1);  
            // Logging and reporting
            LOGGER.info("Click on totalbodyfat1");
            AllureUtils.logStep("Click on totalbodyfat1");
          
            mobilelement.clickElement(driver, mobileLocators.visceralfat);  
            // Logging and reporting
            LOGGER.info("Click on visceralfat");
            AllureUtils.logStep("Click on visceralfat");
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case60compare8");  
            
            mobilelement.clickElement(driver, mobileLocators.waisthip);  
            // Logging and reporting
            LOGGER.info("Click on waisthip");
            AllureUtils.logStep("Click on waisthip");
            
            mobilelement.clickElement(driver, mobileLocators.waistcirmference);  
            // Logging and reporting
            LOGGER.info("Click on waistcirmference");
            AllureUtils.logStep("Click on waistcirmference");
            
            
            mobilelement.clickElement(driver, mobileLocators.hipcircumference);  
            // Logging and reporting
            LOGGER.info("Click on hipcircumference");
            AllureUtils.logStep("Click on hipcircumference");
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case60compare9"); 
            
            mobilelement.clickElement(driver, mobileLocators.waistcirmference);  
            // Logging and reporting
            LOGGER.info("Click on waistcirmference");
            AllureUtils.logStep("Click on waistcirmference");
            
            
            mobilelement.clickElement(driver, mobileLocators.infobodyscan);
            // Logging and reporting
            LOGGER.info("Click on hipcircumference");
            AllureUtils.logStep("Click on hipcircumference");
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Case60compare9"); 
      
            
            // Perform horizontal swipe after clicking infobodyscan
            for (int i = 0; i < 5; i++) {
                // Perform the swipe
                mobilelement.performHorizontalSwipe(driver);
                
                // Log the swipe action
                LOGGER.info("Performed horizontal swipe " + (i + 1) + " of 5");
                AllureUtils.logStep("Performed horizontal swipe " + (i + 1) + " of 5");
                
                // Capture a screenshot after each swipe
                AllureUtils.captureScreenshot(driver, "Swipe" + (i + 1));

              
            }
            
            

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