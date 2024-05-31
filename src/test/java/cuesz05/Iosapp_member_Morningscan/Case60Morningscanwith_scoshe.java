//https://chat.openai.com/share/f592ab35-529c-4434-a989-5fac7039696c
package cuesz05.Iosapp_member_Morningscan;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import cuesz.pages.AppiummobileBase;
import cuesz.utils.AllureUtils;
import cuesz.utils.AppiumappUtils;
import cuesz.utils.mobileLocators;
import cuesz.utils.mobilelement;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Member add Member_manual_input data")
@Feature ("Verify that member able to add manual morning scan data")
public class Case60Morningscanwith_scoshe extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case60Morningscanwith_scoshe.class);	
	mobileLocators locators = new mobileLocators();	

	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
	@Description("Member Click on morning scan and do activity with sosche")
    @Story("Perform mo ")
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
        AllureUtils.captureScreenshot(driver, "Case60Morningscanwith_scoshe1"); 
        
        //Click on morning scan sync my devices
        mobilelement.clickElement(driver, mobileLocators.syncdevice);
        // Log message to console and Allure report
        LOGGER.info("Click on Morningscan Sync devide button");
        AllureUtils.logStep("Click on Morning scan sync device button"); 
        
        try {
            // Find and click on Syncmydevicebttn
            WebElement Syncmydevicebttn = driver.findElement(mobileLocators.syncdevicebttn);
            Syncmydevicebttn.click();      
            // Log console message to Allure
            LOGGER.info("Clicked on Syncmydevice button");
            AllureUtils.logStep("Clicked on Syncmydevice button");
        } catch (NoSuchElementException e) {
            // Handle the case where the element is not found
            LOGGER.error("Element not found: syncdevicebttn", e);
            AllureUtils.logStep("Element not found: syncdevicebttn");
        }
        // Log message to console and Allure report
        LOGGER.info("Verify label for popup tracklabel label");
        AllureUtils.logStep("Verify label for popup tracklabel label");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case60Morningscanwith_scoshe2"); 
        
        WebElement Popuptext = driver.findElement(mobileLocators.morningscanlabel);
        // Extract text from the element
        String actualText = Popuptext.getText();
        // Define the expected text
        String expectedText = "Please ensure that you keep the app active in the foreground while completing your Morning Scan session so that your progress can be tracked.";

        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText);
        System.out.println("Expected Text: " + expectedText);
        // Compare the actual and expected text
        Assert.assertEquals(actualText, expectedText);

        // Attach values to Allure report
        Allure.addAttachment("Actual Text", actualText);
        Allure.addAttachment("Expected Text", expectedText);

        // Log message to console and Allure report
        LOGGER.info("Verify label for popup tracklabel label");
        AllureUtils.logStep("Verify label for popup tracklabel label");
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case60Morningscanwith_scoshe3");

        //Click on tick button from poppop
        mobilelement.clickElement(driver, mobileLocators.tick);
        // Log message to console and Allure report
        LOGGER.info("Click on tick");
        AllureUtils.logStep("Click on tick"); 
        
        //landed on morning scan and click on backbutton 
        mobilelement.clickElement(driver, mobileLocators.backclick);
        // Log message to console and Allure report
        LOGGER.info("Click on backclick");
        AllureUtils.logStep("Click on backclick");
        
        //Click on morning scan sync my devices
        mobilelement.clickElement(driver, mobileLocators.syncdevice);
        // Log message to console and Allure report
        LOGGER.info("Click on Morningscan syncdevice button");
        AllureUtils.logStep("Click on Morning scan syncdevice button"); 
        
        //Click on morning scan sync my devices
        mobilelement.clickElement(driver, mobileLocators.  syncdevicebttn);
        // Log message to console and Allure report
        LOGGER.info("Click on Morningscan syncdevicebttn button");
        AllureUtils.logStep("Click on Morning scan syncdevicebttn button"); 
      
        //Click on tick button from poppop
        mobilelement.clickElement(driver, mobileLocators.tick);
        // Log message to console and Allure report
        LOGGER.info("Click on tick");
        AllureUtils.logStep("Click on tick"); 
        
        
        WebElement morningheading = driver.findElement(mobileLocators.morninglabel);
        // Extract text from the element
        String actualText1 = morningheading.getText();
        // Define the expected text
        String expectedText1 = "MORNING SCAN";

        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText1);
        System.out.println("Expected Text: " + expectedText1);
        // Compare the actual and expected text
        Assert.assertEquals(actualText1, expectedText1);

        // Attach values to Allure report
        Allure.addAttachment("Actual Text", actualText1);
        Allure.addAttachment("Expected Text", expectedText1);

        // Log message to console and Allure report
        LOGGER.info("Verify heading for morning scan");
        AllureUtils.logStep("Verify heading for morning scan");
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case60Morningscanwith_scoshe4");
        
        //click on cancel in morning scan screen
        mobilelement.clickElement(driver, mobileLocators.cancel);
        // Log message to console and Allure report
        LOGGER.info("Click on cancel button");
        AllureUtils.logStep("Click on cancel button");
        
        //Click on morning scan sync my devices
        mobilelement.clickElement(driver, mobileLocators.syncdevice);
        // Log message to console and Allure report
        LOGGER.info("Click on syncdevice button");
        AllureUtils.logStep("Click on syncdevice button");
        
        //Click on morning scan sync my devices
        mobilelement.clickElement(driver, mobileLocators.  syncdevicebttn);
        // Log message to console and Allure report
        LOGGER.info("Click on syncdevicebttn button");
        AllureUtils.logStep("Click on syncdevicebttn button");
      
        //Click on tick button from poppop
        mobilelement.clickElement(driver, mobileLocators.tick);
        // Log message to console and Allure report
        LOGGER.info("Click on tick button");
        AllureUtils.logStep("Click on tick button");
        
        //click on morning scan start
        mobilelement.clickElement(driver, mobileLocators.starttme);
        // Log message to console and Allure report
        LOGGER.info("Click on starttme button");
        AllureUtils.logStep("Click on starttme button");
        
        Thread.sleep(8500);
        mobilelement.clickElement(driver, mobileLocators.redo);
        // Log message to console and Allure report
        LOGGER.info("Click on redo button");
        AllureUtils.logStep("Click on redo button");
        
        mobilelement.clickElement(driver, mobileLocators.graphclse);
        // Log message to console and Allure report
        LOGGER.info("Click on graphclse button");
        AllureUtils.logStep("Click on graphclse button");
       
        Thread.sleep(500);
        
        WebElement scanninglabel = driver.findElement(mobileLocators.scanningtext);
        // Extract text from the element
        String actualText11 = scanninglabel.getText();
        // Define the expected text
        String expectedText11 = "Scanning";

        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText11);
        System.out.println("Expected Text: " + expectedText11);
        // Compare the actual and expected text
        Assert.assertEquals(actualText11, expectedText11);

        // Attach values to Allure report
        Allure.addAttachment("Actual Text", actualText11);
        Allure.addAttachment("Expected Text", expectedText11);

        // Log message to console and Allure report
        LOGGER.info("Verify label for scanning");
        AllureUtils.logStep("Verify label for scanning");
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case60Morningscanwith_scoshe4");
        

     // Wait loop with check for the next button
        for (int i = 0; i < 7; i++) {
            try {
                Thread.sleep(1000);
                LOGGER.info("Waiting for nextbutton to enabled and complete morning scan: " + (i + 1));
                if (mobilelement.isElementDisplayed(driver, mobileLocators.nextbutton)) {
                    mobilelement.clickElement(driver, mobileLocators.nextbutton);
                 // Capture a screenshot and attach it to Allure
                    AllureUtils.captureScreenshot(driver, "Case60Morningscanwith_scoshe5");
//                    mobilelement.clickElement(driver, mobileLocators.nextbutton);
                    LOGGER.info("Click on nextbutton");
                    AllureUtils.logStep("Click on nextbutton");
                    break;
                }
            } catch (InterruptedException e) {
                LOGGER.error("Thread interrupted", e);
                Thread.currentThread().interrupt();
            } catch (NoSuchElementException e) {
                LOGGER.error("Element not found: textbutton", e);
            }
        }      
//     // Wait for scanning to complete (replace 8500 with a suitable timeout based on your testing)
//        Thread.sleep(8500);
//
//     // Explicit wait for the Next button to be clickable (replace 10 with a suitable timeout)
//        new WebDriverWait(driver, Duration.ofSeconds(60))
//          .until(ExpectedConditions.elementToBeClickable(mobileLocators.textbutton));
//
//        // Click on the Next button
//        mobilelement.clickElement(driver, mobileLocators.textbutton);
//        LOGGER.info("Click on textbutton");
//        AllureUtils.logStep("Click on textbutton");
                
        Thread.sleep(2500);
        // Set values in the picker elements
        String[] valuesToSet = {"12", "18", "AM"};
        mobilelement.setPickerValues(driver, mobileLocators.wentobed, mobileLocators.pickerelement, valuesToSet);
        
        //click on done from timepicker
        mobilelement.clickElement(driver, mobileLocators.Doneclick);
        LOGGER.info("Click on Doneclick options");
        AllureUtils.logStep("Click on Doneclick options"); 
     
        Thread.sleep(2500);
        // Set values in the picker elements
        String[] valuesToSet1 = {"7", "18", "AM"};
        mobilelement.setPickerValues(driver, mobileLocators.Wokeupbed, mobileLocators.pickerelement, valuesToSet1);

        //click on done from timepicker
        mobilelement.clickElement(driver, mobileLocators.Doneclick);
        LOGGER.info("Click on Doneclick options");
        AllureUtils.logStep("Click on Doneclick options"); 
        
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case60Morningscanwith_scoshe6");
        
        //Click on sleep Quality
        mobilelement.clickElement(driver, mobileLocators.sleep1);
        mobilelement.clickElement(driver, mobileLocators.sleep2);
        // Log message to console and Allure report
        LOGGER.info("Click on sleep options");
        AllureUtils.logStep("Click on sleep options"); 
        
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case56Morningscan_manual7"); 
        
        
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
        AllureUtils.captureScreenshot(driver, "Case56Morningscan_manual8"); 
        
        mobilelement.clickElement(driver, mobileLocators.tick);
        // Log message to console and Allure report
        LOGGER.info("Click on Tick options");
        AllureUtils.logStep("Click on tick options"); 
        
   
        Thread.sleep(8500);
        } catch (Exception e) {
            LOGGER.error("An error occurred during the morning scan test", e);
            AllureUtils.logStep("An error occurred: " + e.getMessage());
        } finally {
            // Terminate the app whether the test passed or failed
            driver.terminateApp("com.cuesz.mobile");
        }
    }
}