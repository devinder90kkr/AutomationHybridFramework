package cuesz03.Iosapp_member_home_Fuelscreen.recommendedcase;

import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.mobile.resources.mobileLocators;
import cuesz.mobile.resources.mobileTestData;
import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Fuel screen detail")
@Feature ("Verify Fuel detail functionlaity related to Lunch functionlaity.")
public class Case33_Fuel_Lunch_recommendedfuel extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case33_Fuel_Lunch_recommendedfuel.class);

	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Member Fuel screen detail verification")
    @Story("Scroll to Fuel card and verify Lunch assigned by staff ")	
	public void Fuel_Lunch_recommendedfuel() throws InterruptedException{
		try {
		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
		//        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
		 appiumUtils.launchAppWithPackageId(mobileTestData.bundelID);
		
		WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
		Homeicon.click();
		// Log console message to Allure
 		LOGGER.info("Click on Homeicon");
 		AllureUtils.logStep("Click on Homeicon");
 		// Capture a screenshot and attach it to Allure
 		AllureUtils.captureScreenshot(driver, "Case33_1");
		 		
		Thread.sleep(3000);
		scroll("down", "Perform Fuel Mindful Restore");
		
		Thread.sleep(2000);
        //Click on Fuel tab 
        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();
        // Log console message to Allure
        LOGGER.info("Click on fuel screen");
        AllureUtils.logStep("Click on fuel screen");
        AllureUtils.captureScreenshot(driver, "Case33_2");
        
 		
     // Scroll to "Early Snacks" element if it's not present on the screen
        By lunchLocator = AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Lunch\"`][1]");
        if (!isElementPresent(driver, lunchLocator)) {
            // Scroll to "Early Snacks" if it's not present
            HashMap<String, Object> scrollObject1 = new HashMap<>();
            scrollObject1.put("direction", "down");
            scrollObject1.put("Lunch", "Lunch");
            driver.executeScript("mobile:scroll", scrollObject1);
            Thread.sleep(2000);
        }
        
        Thread.sleep(2000);
        
		
        // Locate the element containing the perform
        WebElement lunchlabel	= driver.findElement(mobileLocators.Lunchlabel);
        // Extract text from the element
        String actualText = lunchlabel.getText();
        // Define the expected text
        String expectedText = "Lunch";
        
        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText);
        System.out.println("Expected Text: " + expectedText);
        // Compare the actual and expected text
        Assert.assertEquals(actualText, expectedText);
		
        
        // Locate and click on breakfasticon for cal related info
        WebElement earlysnackicon	= driver.findElement(mobileLocators.iconforlunch);
        earlysnackicon.click();
        // Log console message to Allure
        LOGGER.info("Click on earlysnackicon");
        AllureUtils.logStep("Click on earlysnackicon");
        AllureUtils.captureScreenshot(driver, "Case33_3");
        
        WebElement backclick	= driver.findElement(mobileLocators.backicon);
        backclick.click();
        // Log console message to Allure
        LOGGER.info("Click on backicon");
        AllureUtils.logStep("Click on backicon");
        AllureUtils.captureScreenshot(driver, "Case33_4");
        
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "lunch1");
        
        // Locate the element related to breakfast + icon 
        WebElement earlysnackplus 	= driver.findElement(mobileLocators.lunchplusicon);
        earlysnackplus.click();
        // Log console message to Allure
        LOGGER.info("Click on earlysnackplus");
        AllureUtils.logStep("Click on earlysnackplus");
        AllureUtils.captureScreenshot(driver, "Case33_5");
        
       //click on keypad Done button to hide keypad
        WebElement keypaddone	= driver.findElement(mobileLocators.doneclick);
        keypaddone.click();
        // Log console message to Allure
        LOGGER.info("Click on keypaddone");
        AllureUtils.logStep("Click on keypaddone");
        AllureUtils.captureScreenshot(driver, "Case33_6");
        
        
        // Locate and click on recommended Fuel button
        WebElement Recommendedfuel 	= driver.findElement(mobileLocators.recommendedclick);
        Recommendedfuel.click();
        // Log console message to Allure
        LOGGER.info("Click on Recommendedfuel");
        AllureUtils.logStep("Click on Recommendedfuel");
        AllureUtils.captureScreenshot(driver, "Case33_7");
        

        Thread.sleep(5000);
        
        try {
        	WebElement arrowright = driver.findElement(mobileLocators.arrowclick2);
        	arrowright.click();
        	// Log console message to Allure
            LOGGER.info("Click on arrowright");
            AllureUtils.logStep("Click on arrowright");
   
        // Click on timer 
        WebElement Timerclick 	= driver.findElement(mobileLocators.Time11);
        Timerclick.click();
        // Log console message to Allure
        LOGGER.info("Click on Timerclick");
        AllureUtils.logStep("Click on Timerclick");
        AllureUtils.captureScreenshot(driver, "Case33_11");
        
        List<WebElement>values = driver.findElements(mobileLocators.pickerelement);

		for (int i=0; i<values.size();i++)
		{		
		System.out.println(values.get(i).getText());
		}
		
		values.get(0).sendKeys("1");
		values.get(0).sendKeys(Keys.TAB);

		Thread.sleep(3500);
		values.get(1).sendKeys("03");
		values.get(1).sendKeys(Keys.TAB);
		
		Thread.sleep(3500);
		values.get(2).sendKeys("PM");
		// Log console message to Allure
		LOGGER.info("enter time ");
		AllureUtils.logStep("Enter time");   
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Lunch3");

		driver.findElement(mobileLocators.Doneclick).click();
		// Log console message to Allure
        LOGGER.info("Click on Doneclick ");
        AllureUtils.logStep("Click on Doneclick"); 
        
		// Click on breakfast-tick 
        WebElement breakfasttick	= driver.findElement(mobileLocators.tickbreakfast);
        breakfasttick.click();
        // Log console message to Allure
        LOGGER.info("Click on breakfasttick");
        AllureUtils.logStep("Click on breakfasttick");
        AllureUtils.captureScreenshot(driver, "Case33_12");
        
        // Click on Done-breakfast button
        WebElement brekfastdone 	= driver.findElement(mobileLocators.brekdone);
        brekfastdone.click();
        // Log console message to Allure
        LOGGER.info("Click on brekdone");
        AllureUtils.logStep("Click on brekdone");
       
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Lunch4");
        
        Thread.sleep(4500);
        
        } catch (Exception e) {
        	// If the arrowright element is not found, log an error message and terminate the app
            String errorMessage = "Arrowright element not found. Skipping further steps.";
            System.out.println(errorMessage);
            Allure.addAttachment("Error", errorMessage);
            AllureUtils.captureScreenshot(driver, "ArrowRightNotFound");
            driver.terminateApp("com.cuesz.mobile");
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
//	            driver.terminateApp("com.cuesz.mobile");
	            driver.terminateApp(mobileTestData.bundelID);
	        }
	    }

	
	 private void scroll(String direction, String elementName) {
	        HashMap<String, Object> scrollObject = new HashMap<>();
	        scrollObject.put("direction", direction);
	        scrollObject.put(elementName, elementName);
	        driver.executeScript("mobile:scroll", scrollObject);
	    }
	 
	 // Function to check if an element is present on the screen
	    public boolean isElementPresent(AppiumDriver driver, By by) {
	        try {
	            driver.findElement(by);
	            return true;
	        } catch (NoSuchElementException e) {
	            return false;
	        }
	    }
	}
	 


	
