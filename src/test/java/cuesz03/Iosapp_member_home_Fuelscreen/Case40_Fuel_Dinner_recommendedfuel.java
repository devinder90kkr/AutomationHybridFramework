package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.mobile.resources.mobileTestData;
import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Member fuel screen detail ")
@Feature ("Verify Fuel detail functionlaity related to dinner functionlaity.")
public class Case40_Fuel_Dinner_recommendedfuel extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case40_Fuel_Dinner_recommendedfuel.class);
	
	private By Homeclick = 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");

	private By dinnerlabel	= 		AppiumBy.iOSNsPredicateString("name == 'Dinner'");
	private By icondinner	= 		AppiumBy.accessibilityId("DinnerInfoIcon");
	private By backicon			= 		AppiumBy.accessibilityId("BackPress");
	private By plusadd			= 		AppiumBy.accessibilityId("DinnerAddIcon");
	private By doneclick		= 		AppiumBy.accessibilityId("Done");
	private By recommendedclick	= 		AppiumBy.accessibilityId("AddRecommendedFuel");
	private By backicon1		= 		AppiumBy.accessibilityId("RecommendBackPress");
	private By rightarrow		= 		AppiumBy.accessibilityId("FuelCaloriesArrowRight");
	private By Time				= 		AppiumBy.accessibilityId("RecommendedFuelTime");
	private By pickerelement	= 		AppiumBy.xpath("//XCUIElementTypePickerWheel");
	private By Doneclick		= 		AppiumBy.accessibilityId("AlcohalTime");
	private By tickdinner	= 		AppiumBy.accessibilityId("RecommendedFuelSubmit");
	private By brekdone			= 		AppiumBy.accessibilityId("Done");
	

	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Member Fuel screen detail verification")
    @Story("Scroll to Fuel card and verify Dinner assigned by staff ")	
	public void Fuel_Dinner_recommendedfuel() throws InterruptedException{
		try {
		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
//        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
		 appiumUtils.launchAppWithPackageId(mobileTestData.bundelID);
		 
		WebElement Homeicon = driver.findElement(Homeclick);
		Homeicon.click();
		// Log console message to Allure
		LOGGER.info("Click on home menu from bottom");
        AllureUtils.logStep("Click on home menu from bottom");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "40_1");
		        
		Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject =new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("Perform Fuel Mindful Restore", "Perform");
		driver.executeScript("mobile:scroll", scrollObject);
		Thread.sleep(2000);

        //Click on Fuel tab 
        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();
        // Log console message to Allure
        LOGGER.info("Click on fuel screen");
        AllureUtils.logStep("Click on fuel screen");
        AllureUtils.captureScreenshot(driver,"40_2");
        
		
        // Locate the element containing the perform
        WebElement dinner = driver.findElement(dinnerlabel);
        // Extract text from the element
        String actualText = dinner.getText();
        // Define the expected text
        String expectedText = "Dinner";
        
        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText);
        System.out.println("Expected Text: " + expectedText);
        // Compare the actual and expected text
        Assert.assertEquals(actualText, expectedText);
		
        
        // Locate and click on dinnericon for cal related info
        WebElement dinnericon	= driver.findElement(icondinner);
        dinnericon.click();
        // Log console message to Allure
        LOGGER.info("Click on fuel screen");
        AllureUtils.logStep("Click on fuel screen");
        AllureUtils.captureScreenshot(driver,"40_3");
        
        WebElement backclick	= driver.findElement(backicon);
        backclick.click();
        // Log console message to Allure
        LOGGER.info("Click on backclick");
        AllureUtils.logStep("Click on backclick");
        AllureUtils.captureScreenshot(driver,"40_4");
        
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Dinner1");
        
        // Locate the element related to dinner + icon 
        WebElement dinnerplus 	= driver.findElement(plusadd);
        dinnerplus.click();
        // Log console message to Allure
        LOGGER.info("Click on dinnerplus");
        AllureUtils.logStep("Click on dinnerplus");
        AllureUtils.captureScreenshot(driver,"40_5");
        
       //click on keypad Done button to hide keypad
        WebElement keypaddone	= driver.findElement(doneclick);
        keypaddone.click();
        // Log console message to Allure
        LOGGER.info("Click on done");
        AllureUtils.logStep("Click on done");
        AllureUtils.captureScreenshot(driver,"40_6");
        
        // Locate and click on recommended Fuel button
        WebElement Recommendedfuel 	= driver.findElement(recommendedclick);
        Recommendedfuel.click();
        // Log console message to Allure
        LOGGER.info("Click on Recommendedfuel");
        AllureUtils.logStep("Click on Recommendedfuel");
        AllureUtils.captureScreenshot(driver,"40_7");
        
        WebElement recommendebackclick	= driver.findElement(backicon1);
        recommendebackclick.click();
        // Log console message to Allure
        LOGGER.info("Click on recommendebackclick");
        AllureUtils.logStep("Click on recommendebackclick");
        AllureUtils.captureScreenshot(driver,"40_8");
        
      //click on keypad Done button to hide keypad
        WebElement keypaddone1	= driver.findElement(doneclick);
        keypaddone1.click();
        // Log console message to Allure
        LOGGER.info("Click on recommendebackclick");
        AllureUtils.logStep("Click on recommendebackclick");
        AllureUtils.captureScreenshot(driver,"40_9");
        
        // Locate and click on recommended Fuel button
        WebElement Recommendedfuel1 	= driver.findElement(recommendedclick);
        Recommendedfuel1.click();
        // Log console message to Allure
        LOGGER.info("Click on recommendebackclick");
        AllureUtils.logStep("Click on recommendebackclick");
        AllureUtils.captureScreenshot(driver,"40_10");
        
        try {
        
        WebElement arrowright = driver.findElement(rightarrow);
        arrowright.click();
        // Log console message to Allure
        LOGGER.info("Click on arrowright");
        AllureUtils.logStep("Click on arrowright");
        
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Dinner2");

        
        // Click on timer 
        WebElement Timerclick 	= driver.findElement(Time);
        Timerclick.click();
        
        List<WebElement>values = driver.findElements(pickerelement);

		for (int i=0; i<values.size();i++)
		{		
		System.out.println(values.get(i).getText());
		}
		
		values.get(0).sendKeys("9");
		values.get(0).sendKeys(Keys.TAB);

		Thread.sleep(3500);
		values.get(1).sendKeys("13");
		values.get(1).sendKeys(Keys.TAB);
		
		Thread.sleep(3500);
		values.get(2).sendKeys("PM");
		
		// Log console message to Allure
		LOGGER.info("enter time ");
		AllureUtils.logStep("Enter time");    
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "Case40_time");

		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Dinner3");

		
		driver.findElement(Doneclick).click();
        
		// Click on dinner-tick 
        WebElement dinnertick	= driver.findElement(tickdinner);
        dinnertick.click();
        // Log console message to Allure
        LOGGER.info("Select dinnertick of your choice");
        AllureUtils.logStep("Select dinnertick of your choice");
        AllureUtils.captureScreenshot(driver,"40_11");
        
        // Click on Done-dinner button
        WebElement brekfastdone 	= driver.findElement(brekdone);
        brekfastdone.click();
    	// Log console message to Allure
        LOGGER.info("Click on brekfastdone");
        AllureUtils.logStep("Click on brekfastdone");
        AllureUtils.captureScreenshot(driver,"40_12");
         
        // Locate and click on dinnericon for cal related info
        WebElement dinnericon1	= driver.findElement(icondinner);
        dinnericon1.click();
        WebElement backclick1	= driver.findElement(backicon);
        backclick1.click();
        // Log console message to Allure
        LOGGER.info("Click on backclick1");
        AllureUtils.logStep("Click on backclick1");
        AllureUtils.captureScreenshot(driver,"40_13");
        
     // Log a message to Allure
        Allure.addAttachment("Info", "Clicked dinnericon and backclick1 successfully.");
        
        } catch (Exception e) {
        	// If the arrowright element is not found, log an error message and terminate the app
            String errorMessage = "Arrowright element not found. Skipping further steps.";
            System.out.println(errorMessage);
            Allure.addAttachment("Error", errorMessage);
            AllureUtils.captureScreenshot(driver, "ArrowRightNotFound");
//            driver.terminateApp("com.cuesz.mobile");
            driver.terminateApp(mobileTestData.bundelID);
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