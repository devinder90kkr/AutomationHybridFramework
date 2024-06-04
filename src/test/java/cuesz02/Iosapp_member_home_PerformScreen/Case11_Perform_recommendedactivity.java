package cuesz02.Iosapp_member_home_PerformScreen;

import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import cuesz.utils.mobile.mobileLocators;
import cuesz.utils.mobile.mobileTestData;
import cuesz.utils.reporting.AllureUtils;
import cuesz01.Iosapp_member_homeScreen.Case10_Homescreen_LPwith15min;
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

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

@Epic ("Perform detail")
@Feature ("Verify Recommended perform activity functionlaity")


public class Case11_Perform_recommendedactivity extends AppiummobileBase {

	mobileLocators locators = new mobileLocators();	
	 private static final Logger LOGGER = LoggerFactory.getLogger(Case10_Homescreen_LPwith15min.class);
	 
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify perform screen & check recommended activity functionlaity.")
    @Story("here, we need to verify recommended perform activity functionality")	
	
	public void perfom_recommendedactivty() throws InterruptedException	{	
try {
		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");
		
		// CLick on home menu from bottom
		WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
		Homeicon.click();
		
		 // Log console message to Allure
        LOGGER.info("Click on home menu from bottom");
        AllureUtils.logStep("Click on home menu from bottom");
		
		Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject =new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("Perform Fuel Mindful Restore", "Perform");
		driver.executeScript("mobile:scroll", scrollObject);
		Thread.sleep(2000);
		
		
		// CLick on Perform card
		WebElement performcard = driver.findElement(mobileLocators.performclick);
		performcard.click();
		
		 // Log console message to Allure
        LOGGER.info("Click on perform card ");
        AllureUtils.logStep("Click on perform card");
		
		
		By walkingperformlLocator = AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Walking\"`]");
        if(!isElementPresent(driver, walkingperformlLocator)){
            // Scroll to "Basketball" if it's not present
            HashMap<String,Object> scrollObject1 = new HashMap<>();
            scrollObject1.put("direction", "down");
            scrollObject1.put("Walking", "Walking");
            driver.executeScript("mobile:scroll", scrollObject1);
            Thread.sleep(2000);
        }
        
        // Log console message to Allure
        LOGGER.info("Scroll down to activity");
        AllureUtils.logStep("Scroll down action for activity");
		
		// Locate the element containing the perform
        WebElement Perform = driver.findElement(mobileLocators.walkinlabel);
        // Extract text from the element
        String actualText = Perform.getText();
        // Define the expected text
        String expectedText = "Walking";
        
        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText);
        System.out.println("Expected Text: " + expectedText);
        // Compare the actual and expected text
        Assert.assertEquals(actualText, expectedText);
        
        // Attach values to Allure report
        Allure.addAttachment("Actual Text", actualText);
        Allure.addAttachment("Expected Text", expectedText);
        
        // Use an assertion to verify that actualText4 equals expectedText4
        Assert.assertEquals(actualText, expectedText);
		
 
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform1");
        
       
		// CLick on Walking  card
		WebElement walkingcard = driver.findElement(mobileLocators.walkingstart);
		walkingcard.click();

		// Log console message to Allure
        LOGGER.info("Click on activity");
        AllureUtils.logStep("Click on activity");
		
		
		Thread.sleep(2500);
		//Click on back button 
		WebElement Backbttn = driver.findElement(mobileLocators.backpressbutton);
		Backbttn.click();
		
		// Log console message to Allure
        LOGGER.info("Click on back button");
        AllureUtils.logStep("Click on back button");
		
		Thread.sleep(2500);
		// CLick on Walking  card
		WebElement walkingcard1 = driver.findElement(mobileLocators.walkingstart);
		walkingcard1.click();
		
		// Log console message to Allure
        LOGGER.info("Click on activity start button ");
        AllureUtils.logStep("Click on activity start button");
		
		// Click on start perform activity for walking activity
		WebElement startactivitybttn	= driver.findElement(mobileLocators.startperform);
		// Extract text from the element
	    String actualText4 = startactivitybttn.getText();
	    // Define the expected text
	    String expectedText4 = "Start "
	    		+ "Perform "
	    		+ "Activity";

	    // Print the actual and expected text to the console
	    System.out.println("Actual Text: " + actualText4);
	    System.out.println("Expected Text: " + expectedText4);
	    
	    // Attach values to Allure report
        Allure.addAttachment("Actual Text", actualText4);
        Allure.addAttachment("Expected Text", expectedText4);
        
        startactivitybttn.click();
        
        // Log console message to Allure
        LOGGER.info("Click on activity start  ");
        AllureUtils.logStep("Click on activity start ");

		
		try {
		    WebElement rhythmtext = driver.findElement(mobileLocators.rhytmtextverification);
		    // Extract text from the element
		    String actualText2 = rhythmtext.getText();
		    // Define the expected text
		    String expectedText2 = "Rhythm 24 1091";

		    // Print the actual and expected text to the console
		    System.out.println("Actual Text: " + actualText2);
		    System.out.println("Expected Text: " + expectedText2);
		    
		    // Attach values to Allure report
	        Allure.addAttachment("Actual Text", actualText2);
	        Allure.addAttachment("Expected Text", expectedText2);
	        
	        // Use an assertion to verify that actualText4 equals expectedText4
	        Assert.assertEquals(actualText2, expectedText2);
		    

		    if (actualText2.equals(expectedText2)) {
		        // If actual text and expected text are the same, click on Syncmydevicebttn
		        WebElement Syncmydevicebttn = driver.findElement(mobileLocators.syncdevicebttn);
		        Syncmydevicebttn.click();
		        // Log console message to Allure
		        LOGGER.info("Click on Syncmydevice bttn  ");
		        AllureUtils.logStep("Click on Syncmydevice bttn ");
		    } else {
		        // If actual text and expected text are different, click on syncbttn
		        WebElement syncbttn = driver.findElement(mobileLocators.synclaterbttn);
		        syncbttn.click();
		        // Log console message to Allure
		        LOGGER.info("Click on Sync later bttn");
		        AllureUtils.logStep("Click on Sync later bttn ");
		    }
		} catch (NoSuchElementException e) {
		    // Handle the case where the element is not found by clicking on syncbttn
		    WebElement syncbttn = driver.findElement(mobileLocators.synclaterbttn);
		    syncbttn.click();
		    // Log console message to Allure
	        LOGGER.info("Click on Sync later bttn");
	        AllureUtils.logStep("Click on Sync later bttn ");
		}

		Thread.sleep(2500);

		try {
		    WebElement rhythmtext = driver.findElement(mobileLocators.rhytmtextlabelsyncedverification);
		    // Extract text from the element
		    String actualText3 = rhythmtext.getText();
		    // Define the expected text
		    String expectedText3 = "Rhythm 24 2759 Synced";

		    // Print the actual and expected text to the console
		    System.out.println("Actual Text: " + actualText3);
		    System.out.println("Expected Text: " + expectedText3);

		    // Attach values to Allure report
		    Allure.addAttachment("Actual Text", actualText3);
		    Allure.addAttachment("Expected Text", expectedText3);
		    
		    // Use an assertion to verify that actualText4 equals expectedText4
	        Assert.assertEquals(actualText3, expectedText3);
		    
		    
		} catch (NoSuchElementException e) {
		    // Handle the case where rhythmtext is not found or is empty
		    WebElement rhythmtext2 = driver.findElement(mobileLocators.rhytmtextlabel);
		    // Extract text from the element
		    String actualText5 = rhythmtext2.getText();
		    // Define the expected text
		    String expectedText5 = "Sync my device";

		    // Print the actual and expected text to the console
		    System.out.println("Actual Text: " + actualText5);
		    System.out.println("Expected Text: " + expectedText5);

		    // Attach values to Allure report
		    Allure.addAttachment("Actual Text", actualText5);
		    Allure.addAttachment("Expected Text", expectedText5);
		    
		    // Use an assertion to verify that actualText4 equals expectedText4
	        Assert.assertEquals(actualText5, expectedText5);
		}
		
		try {
		    WebElement startrecordingcross = driver.findElement(mobileLocators.crossiconrecording);
		    startrecordingcross.click();
		    Thread.sleep(5000000);
		} catch (NoSuchElementException e) {
		    // Handle the case where startrecordingcross is not available
		    System.out.println("startrecordingcross element not found. Skipping.");
		    // You can add additional logging or error handling here if needed
		}			
		
		// Click on deviation 
		WebElement adddeviation = driver.findElement(mobileLocators.deviation);
		adddeviation.click();
		
		// Click on deviation 
		WebElement deviationcrossclick = driver.findElement(mobileLocators.Crossclick);
		deviationcrossclick.click();
		
		// Click on deviation 
		WebElement adddeviation2 = driver.findElement(mobileLocators.deviation);
		adddeviation2.click();
		
		// Click on deviation option-1
		WebElement lessprecribed = driver.findElement(mobileLocators.lessthanprecribeclick);
		lessprecribed.click();
				
		// Click on deviation option-2
		WebElement moreprecribed = driver.findElement(mobileLocators.morethanprecribeclick);
		moreprecribed.click();
		
		// Click on deviation option-1
		WebElement lessprecribed1 = driver.findElement(mobileLocators.lessthanprecribeclick);
		lessprecribed1.click();
		
		// Click on deviation option-1
		WebElement injuryoption = driver.findElement(mobileLocators.Injury);
		injuryoption.click();
		

		WebElement notes = driver.findElement(mobileLocators.Noteclick);
		notes.sendKeys(mobileTestData.notefield);
		
		Thread.sleep(3500);
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform3");
		
		WebElement Donebutton = driver.findElement(mobileLocators.Donetap);
		Donebutton.click();
		

		WebElement tickicon = driver.findElement(mobileLocators.tickclick);
		tickicon.click();

		
		WebElement walkingtick = driver.findElement(mobileLocators.tick);
		walkingtick.click();
		
		WebElement noption = driver.findElement(mobileLocators.nobttn);
		noption.click();
		
		WebElement walkingtick1 = driver.findElement(mobileLocators.tick);
		walkingtick1.click();
		
		WebElement yesption = driver.findElement(mobileLocators.yesbttn);
		yesption.click();
		
		
		// Check if the Crossclick element is displayed before clicking on it
		WebElement Crossclick = null;
		try {
		    Crossclick = driver.findElement(mobileLocators.crossicon);
		    if (Crossclick.isDisplayed()) {
		        Crossclick.click();
		    } else {
		        // Handle the case where the element is not displayed
		        System.out.println("Crossclick element is not displayed.");
		        // Perform some other action or throw an exception if needed
		    }
		} catch (NoSuchElementException e) {
		    // Handle the case where the element is not found
		    System.out.println("Crossclick element not found.");
		    // Perform some other action or throw an exception if needed
		}
		
	
		// Slider handle for score your activity 
		WebElement Score1 =driver.findElement(mobileLocators.Scro1);
		Score1.click();
		WebElement Score2 =driver.findElement(mobileLocators.Scro2);
		Score2.click();
		WebElement Score3 =driver.findElement(mobileLocators.Scro3);
		Score3.click();
		WebElement Score4 =driver.findElement(mobileLocators.Scro4);
		Score4.click();
		
		
		// Slider handle for enjoy your session
		WebElement session1 =driver.findElement(mobileLocators.sesson1);
		session1.click();
		WebElement session2 =driver.findElement(mobileLocators.sesson2);
		session2.click();
		WebElement session3 =driver.findElement(mobileLocators.sesson3);
		session3.click();
		
		
		WebElement tellusmore = driver.findElement(mobileLocators.noteclcik);
		tellusmore.sendKeys(mobileTestData.notefield);
		
		
		Thread.sleep(3500);
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform4");
			
		WebElement telldone = driver.findElement(mobileLocators.donebttn);
		telldone.click();
		
		WebElement feedbacktick = driver.findElement(mobileLocators.tick);
		feedbacktick.click();
		
			
		Thread.sleep(3500);
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform5");
        
        // Click on Import icon
        WebElement importnow	= driver.findElement(mobileLocators.importicon);
        importnow.click();
        
        Thread.sleep(3500);
  		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform6");
        
        WebElement importlater	= driver.findElement(mobileLocators.importlatericon);
        importlater.click();
        
        // Click on deviation icon
        WebElement deviation	= driver.findElement(mobileLocators.deviationicon);
        deviation.click();
        
        Thread.sleep(3500);
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform7");
        
        WebElement deviationcross 	= driver.findElement(mobileLocators.crossicondeviation);
        deviationcross.click();  
        
        
        
        // Click on graph icon
        WebElement graphicon	= driver.findElement(mobileLocators.graphclick);
		graphicon.click();
		
		
		Thread.sleep(3500);
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform8");
        
		WebElement graphclose	= driver.findElement(mobileLocators.graphclse);
		graphclose.click();
		
		
		
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
}
	// Function to check if an element is present on the screen
		public boolean isElementPresent(AppiumDriver driver, By by){
		    try{
		        driver.findElement(by);
		        return true;
		    } catch (NoSuchElementException e){
		        return false;
		    }
		}


}
