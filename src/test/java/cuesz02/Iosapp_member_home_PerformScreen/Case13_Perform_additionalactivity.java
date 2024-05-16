package cuesz02.Iosapp_member_home_PerformScreen;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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

@Epic ("Perform detail")
@Feature ("Verify Additional perform activity functionlaity")


public class Case13_Perform_additionalactivity extends AppiummobileBase {
	
	mobileLocators locators = new mobileLocators();	
	private static final Logger LOGGER = LoggerFactory.getLogger(Case13_Perform_additionalactivity.class);

	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify perform screen & check Additional activity functionlaity.")
    @Story("here, we need to verify Additional perform activity functionality")	
	
	public void perfom_additionalactivty() throws InterruptedException
	{	

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
		
		 // Log console message to Allure
        LOGGER.info("Scroll down to cards");
        AllureUtils.logStep("Scroll down to cards");
        
		
		// CLick on Perform card
		WebElement performcard = driver.findElement(mobileLocators.performclick);
		performcard.click();
		
		 // Log console message to Allure
        LOGGER.info("Click on perform card ");
        AllureUtils.logStep("Click on perform card");
        
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform_click11");
	
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform_additional1");
		
		WebElement perfomplusicon 	= driver.findElement(mobileLocators.perfomplus);
		perfomplusicon.click();
		
		// Log console message to Allure
        LOGGER.info("Click on plus icon  for open popup related to Start my perform & Perfom activity completed");
        AllureUtils.logStep("Click on plus icon  for open popup related to Start my perform & Perfom activity completed");
		
		WebElement startmyperformactivity 	= driver.findElement(mobileLocators.additionalperform);
		startmyperformactivity.click();
		
		// Log console message to Allure
        LOGGER.info("Click on Start my perform button");
        AllureUtils.logStep("Click on Start my perform button");
		
		
		WebElement startmyperfromactivitycross 	= driver.findElement(mobileLocators.cross_additionalpopup);
		startmyperfromactivitycross.click();
		
		// Log console message to Allure
        LOGGER.info("Click on Cross button to close popup");
        AllureUtils.logStep("Click on Cross button to close popup");
		
		// repeat steps again 
		WebElement perfomplusicon1 	= driver.findElement(mobileLocators.perfomplus);
		perfomplusicon1.click();
		
		// Log console message to Allure
        LOGGER.info("Click agian on plus icon  for open popup related to Start my perform & Perfom activity completed");
        AllureUtils.logStep("Click again on plus icon  for open popup related to Start my perform & Perfom activity completed");
        
        
		
		WebElement startmyperformactivity2 	= driver.findElement(mobileLocators.additionalperform);
		startmyperformactivity2.click();
		
		// Log console message to Allure
        LOGGER.info("Click again on to open Start my perform button");
        AllureUtils.logStep("Click again on to open Start my perform button");
		
		// Enter text for Search field 
		WebElement Additonalperformsearch	= driver.findElement(mobileLocators.searcharea);
		Additonalperformsearch.sendKeys(mobileTestData.Additonalperformsearchfield);
		
		// Log console message to Allure
        LOGGER.info("Click on search to enter perform activity");
        AllureUtils.logStep("Click on search to enter perform activity");
		
		// Enter text for Search field 
		WebElement donekeypad	= driver.findElement(mobileLocators.doneclick);
		donekeypad.click();
		
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform_additional2");
        
		// Select perform aditonal activity 
		WebElement selectbaseball 	= driver.findElement(mobileLocators.selectactivity);
		selectbaseball.click();
		
		// Log console message to Allure
        LOGGER.info("Select acitvity from list");
        AllureUtils.logStep("Select acitvity from list");

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
	   
	    // Log console message to Allure
        LOGGER.info("Extract text for start perform activity ");
	    AllureUtils.logStep(actualText4);
        AllureUtils.logStep(expectedText4);
	    
	    
	    
	    // Attach values to Allure report
        Allure.addAttachment("Actual Text", actualText4);
        Allure.addAttachment("Expected Text", expectedText4);
        
        startactivitybttn.click();
        
        // Log console message to Allure
        LOGGER.info("Start perform activity ");
        AllureUtils.logStep("Start perform activity");

		
		try {
		    WebElement rhythmtext = driver.findElement(mobileLocators.rhytmtextverification);
		    // Extract text from the element
		    String actualText2 = rhythmtext.getText();
		    // Define the expected text
		    String expectedText2 = "Rhythm 24 2759";

		    // Print the actual and expected text to the console
		    System.out.println("Actual Text: " + actualText2);
		    System.out.println("Expected Text: " + expectedText2);
		    
		    // Attach values to Allure report
	        Allure.addAttachment("Actual Text", actualText2);
	        Allure.addAttachment("Expected Text", expectedText2);
	        
	        // Use an assertion to verify that actualText4 equals expectedText4
	        Assert.assertEquals(actualText2, expectedText2);
		    
	        
	        // Log console message to Allure
	        LOGGER.info("Extract text for soche device name");
		    AllureUtils.logStep(actualText2);
	        AllureUtils.logStep(expectedText2);
		    

		    if (actualText2.equals(expectedText2)) {
		        // If actual text and expected text are the same, click on Syncmydevicebttn
		        WebElement Syncmydevicebttn = driver.findElement(mobileLocators.syncdevicebttn);
		        Syncmydevicebttn.click();
		        // Log console message to Allure
		        LOGGER.info("Click on sync my device button");
			    AllureUtils.logStep("Click on sync my device button");
		       
		        
		    } else {
		        // If actual text and expected text are different, click on syncbttn
		        WebElement syncbttn = driver.findElement(mobileLocators.synclaterbttn);
		        syncbttn.click();
		        
		        // Log console message to Allure
		        LOGGER.info("Click on sync later button");
			    AllureUtils.logStep("Click on later button");
		    }
		} catch (NoSuchElementException e) {
		    // Handle the case where the element is not found by clicking on syncbttn
		    WebElement syncbttn = driver.findElement(mobileLocators.synclaterbttn);
		    syncbttn.click();
		 // Log console message to Allure
	        LOGGER.info("Click on sync later button");
		    AllureUtils.logStep("Click on later button");
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
	        
	        
	        // Log console message to Allure
	        LOGGER.info("Extract text for soche device name");
		    AllureUtils.logStep(actualText3);
	        AllureUtils.logStep(expectedText3);
		    
		    
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
	        
	        
	        // Log console message to Allure
	        LOGGER.info("Extract text from app");
		    AllureUtils.logStep(actualText5);
	        AllureUtils.logStep(expectedText5);
		}
		
		try {
		    WebElement startrecordingcross = driver.findElement(mobileLocators.crossiconrecording);
		    startrecordingcross.click();
		    
		    // Log console message to Allure
	        LOGGER.info("Click on start recording popup");
		    AllureUtils.logStep("Click on start recording popup");
		    Thread.sleep(5000000);
		} catch (NoSuchElementException e) {
		    // Handle the case where startrecordingcross is not available
		    System.out.println("startrecordingcross element not found. Skipping.");
		    // You can add additional logging or error handling here if needed
		    
		    // Log console message to Allure
	        LOGGER.info("startrecordingcross element not found. Skipping.");
		    AllureUtils.logStep("startrecordingcross element not found. Skipping.");
		}	
		
			
				
     // Click on deviation 
     		WebElement adddeviation = driver.findElement(mobileLocators.deviation);
     		adddeviation.click();
     		
     		// Log console message to Allure
	        LOGGER.info("Click on add deviation icon");
		    AllureUtils.logStep("Click on add deviation icon");
     		
     		// Click on deviation 
     		WebElement deviationcrossclick = driver.findElement(mobileLocators.Crossclick);
     		deviationcrossclick.click();
     		
     	// Log console message to Allure
	        LOGGER.info("Click on close button for deviation icon");
		    AllureUtils.logStep("Click on close button for deviation icon");
     		
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
     		
     		
     		// Log console message to Allure
	        LOGGER.info("Fill detail for deivation field such as select prescribed option and select inhury option and notes");
		    AllureUtils.logStep("Fill detail for deivation field such as select prescribed option and select inhury option and notes");
     		
     		
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
     		
     		// selection of hours/minutes and second from perform actiivty duration popup
     		
     		WebElement hourselect = driver.findElement(mobileLocators.hourstap);
     		hourselect.click();
     		
     		WebElement minselect	= driver.findElement(mobileLocators.minutestap);
     		minselect.click();
     		
     		WebElement submittap = driver.findElement(mobileLocators.submiticon);
     		submittap.click();
     		
     		// Log console message to Allure
	        LOGGER.info("Mark complete activity and submit horus and min and click on submit");
		    AllureUtils.logStep("Mark complete activity and submit horus and min and click on submit");
     		

     		// Check if the Crossclick element is displayed before clicking on it
     		WebElement Crossclick = null;
     		try {
     		    Crossclick = driver.findElement(mobileLocators.crossicon);
     		    if (Crossclick.isDisplayed()) {
     		        Crossclick.click();
     		        
     		        
     		    // Log console message to Allure
     		        LOGGER.info("Cross click found and clickable");
     			    AllureUtils.logStep("Cross click found and clickable");
     		    } else {
     		        // Handle the case where the element is not displayed
     		        System.out.println("Crossclick element is not displayed.");
     		        // Perform some other action or throw an exception if needed
     		       // Log console message to Allure
     		        LOGGER.info("Crossclick element is not displayed.");
     			    AllureUtils.logStep("Crossclick element is not displayed.");
     		    }
     		} catch (NoSuchElementException e) {
     		    // Handle the case where the element is not found
     		    System.out.println("Crossclick element not found.");
     		    // Perform some other action or throw an exception if needed
     		    
     		   // Log console message to Allure
 		        LOGGER.info("Crossclick element is not displayed.");
 			    AllureUtils.logStep("Crossclick element is not displayed.");
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
		
     		// Log console message to Allure
	        LOGGER.info("Done rating screen score and session rating from member side");
		    AllureUtils.logStep("Done rating screen score and session rating from member side");
     		
     		
			
		Thread.sleep(3500);
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform5");
        
        By walkingperformlLocator = AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Boxing\"`]");
        if(!isElementPresent(driver, walkingperformlLocator)){
            // Scroll to "Basketball" if it's not present
            HashMap<String,Object> scrollObject1 = new HashMap<>();
            scrollObject1.put("direction", "down");
            scrollObject1.put("Baseball", "Baseball");
            driver.executeScript("mobile:scroll", scrollObject1);
            Thread.sleep(2000);
        }
        
        
        
        // Click on deviation icon
        WebElement deviation	= driver.findElement(mobileLocators.deviationicon);
        deviation.click();
        
    	// Log console message to Allure
        LOGGER.info("Click on deviation icon");
	    AllureUtils.logStep("Click on deviation icon");
        
        Thread.sleep(3500);
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform7");
        
        WebElement deviationcross 	= driver.findElement(mobileLocators.crossicondeviation);
        deviationcross.click();  
        
     // Log console message to Allure
        LOGGER.info("Click on cross icon deviation icon");
	    AllureUtils.logStep("Click on cross icon deviation icon");
        
        
        // Click on graph icon
        WebElement graphicon	= driver.findElement(mobileLocators.graphclick);
		graphicon.click();
		
		// Log console message to Allure
        LOGGER.info("Click on graph icon");
	    AllureUtils.logStep("Click on graph icon");
		
		
		Thread.sleep(3500);
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform8");
        
		WebElement graphclose	= driver.findElement(mobileLocators.graphclse);
		graphclose.click();
				
		// Log console message to Allure
        LOGGER.info("Click on graph close icon");
	    AllureUtils.logStep("Click on graph closeicon");
				
		
		
		Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
	
	
	
	}// Function to check if an element is present on the screen
	public boolean isElementPresent(AppiumDriver driver, By by){
	    try{
	        driver.findElement(by);
	        return true;
	    } catch (NoSuchElementException e){
	        return false;
	    }
	}

}