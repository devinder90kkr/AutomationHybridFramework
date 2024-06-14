//package cuesz03.Iosapp_member_home_Fuelscreen;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.NoSuchElementException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import cuesz.pages.AppiummobileBase;
//import cuesz.utils.AllureUtils;
//import cuesz.utils.AppiumappUtils;
//import cuesz.utils.mobileLocators;
//import io.appium.java_client.AppiumBy;
//import io.appium.java_client.AppiumDriver;
//import io.qameta.allure.Allure;
//import io.qameta.allure.Description;
//import io.qameta.allure.Epic;
//import io.qameta.allure.Feature;
//import io.qameta.allure.Owner;
//import io.qameta.allure.Severity;
//import io.qameta.allure.SeverityLevel;
//import io.qameta.allure.Story;
//
//@Epic ("Member Add an event screen detail ")
//@Feature ("Verify member able to functionlaity related to add an event functionlaity.")
//public class Case46_Fuel_Addandevent_additionalwithdelete extends AppiummobileBase {
//	
//	mobileLocators locators = new mobileLocators();	
//	
//	@Test
//	@Owner("QA") // Add the @Owner annotation to specify the executor
//    @Severity(SeverityLevel.NORMAL)      
//    @Description("Member add an Event screen detail verification")
//    @Story("Scroll to add an event & verify its related fuel added")	
//	public void Fuel_addaneventadditionalcasewithdelete() throws InterruptedException
//	{	
//		// Create an instance of AppiumUtils and pass the driver
//		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
//        // Launch the app using the utility method
//        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
//		
//        WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
//		Homeicon.click();
//		
//		// Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "addevent1");
//		
//		Thread.sleep(3000);
//		// Method to scroll to perform screen
//		HashMap<String,Object>scrollObject =new HashMap<>();
//		scrollObject.put("direction", "down");
//		scrollObject.put("Perform Fuel Mindful Restore", "Perform");
//		driver.executeScript("mobile:scroll", scrollObject);
//		Thread.sleep(2000);
//
//		// Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "addevent1"); 
//        
//        //Click on Fuel tab 
//        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();
//        Thread.sleep(3500);
//        
//        Thread.sleep(3500);
//		 By addeventlocator = AppiumBy.accessibilityId("AddEvent");
//	        if(!isElementPresent(driver, addeventlocator)){
//	            // Scroll to "Basketball" if it's not present
//	            HashMap<String,Object> scrollObject2 = new HashMap<>();
//	            scrollObject2.put("direction", "down");
//	            scrollObject2.put("During Performance", "During Performance");
//	            driver.executeScript("mobile:scroll", scrollObject2);
//	            Thread.sleep(2000);
//	        }
//        
//		
//        // Locate the element containing the perform
//	        WebElement eventadd = driver.findElement(mobileLocators.addeventlabel);
//        // Extract text from the element
//        String actualText = eventadd.getText();
//        // Define the expected text
//        String expectedText = "Add An Event";
//        
//        // Print the actual and expected text to the console
//        System.out.println("Actual Text: " + actualText);
//        System.out.println("Expected Text: " + expectedText);
//        // Compare the actual and expected text
//        Assert.assertEquals(actualText, expectedText);
//        
//        // Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "addevent2"); 
//        
//        // Locate the element related to add event button 
//        WebElement addaneventbutton 	= driver.findElement(mobileLocators.eventbttn);
//        addaneventbutton.click();
//              
//        // Locate the element related to cross icon
//        WebElement eventcrossbutton 	= driver.findElement(mobileLocators.eventcross);
//        eventcrossbutton.click();
//        
//        // again click on add an event button 
//        addaneventbutton.click();
//        
//        // Locate Select activity field 
//        WebElement selectacticity 	= driver.findElement(mobileLocators.selectactivityfield);
//        selectacticity.click();
//                
//        WebElement Activityname		= driver.findElement(mobileLocators.Enteractivityname);   
//        Activityname.sendKeys("Walking");
//        
//        // Enter text for Search field 
//        WebElement donekeypad	= driver.findElement(mobileLocators.doneclick);
//     	donekeypad.click();
//     	
//     	 // Locate Select activity field 	
//        WebElement selectwalking 	= driver.findElement(mobileLocators.walkingclikc);
//        selectwalking.click();
//
//        // Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "addevent3"); 
//      
//     	// Select starttime	for add an event
//        WebElement startTimerclick 	= driver.findElement(mobileLocators.startTime);
//        startTimerclick.click();
//        
//        List<WebElement>values = driver.findElements(mobileLocators.pickerelement);
//
//		for (int i=0; i<values.size();i++)
//		{		
//		System.out.println(values.get(i).getText());
//		}
//		
//		values.get(0).sendKeys("10");
//		values.get(0).sendKeys(Keys.TAB);
//
//		Thread.sleep(3500);
//		values.get(1).sendKeys("03");
//		values.get(1).sendKeys(Keys.TAB);
//		
//		Thread.sleep(3500);
//		values.get(2).sendKeys("AM");
//		driver.findElement(mobileLocators.Doneclick).click();
//       
//		
//		 // Click on start time 
//        WebElement endTimerclick 	= driver.findElement(mobileLocators.endtime);
//        endTimerclick.click();
//        
//        List<WebElement>values1 = driver.findElements(mobileLocators.pickerelement);
//
//		for (int i=0; i<values1.size();i++)
//		{		
//		System.out.println(values1.get(i).getText());
//		}
//		
//		values1.get(0).sendKeys("10");
//		values1.get(0).sendKeys(Keys.TAB);
//
//		Thread.sleep(3500);
//		values1.get(1).sendKeys("33");
//		values1.get(1).sendKeys(Keys.TAB);
//		
//		Thread.sleep(3500);
//		values1.get(2).sendKeys("AM");
//		driver.findElement(mobileLocators.Doneclick).click();
//		
//		// Click on plus icon from hydration
//		WebElement hydrationclick = driver.findElement(mobileLocators.hydration);
//		for (int i = 0; i < 4; i++) {
//		    hydrationclick.click();
//		}
//
//		
//		// Click on Electrolyte glasses
//		 By[] electrolyte = {mobileLocators.electro1, mobileLocators.electro2};
//        try {   
//            // Click on glasses using a loop
//            for (By locator6 : electrolyte) {
//                try {
//                    WebElement glass = driver.findElement(locator6);
//                    glass.click();
//                    // Add logic for validation or other actions if necessary
//                } catch (NoSuchElementException e) {
//                    System.out.println("Element not found: " + e.getMessage());
//                    // Handle the exception (e.g., log, retry, or terminate the loop)
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }       
//		
//        WebElement tellusmre	= driver.findElement(mobileLocators.notesevent);
//		tellusmre.sendKeys("Add values by automation tools");
//		
//		
//		// Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "addevent4"); 
//	
//        Thread.sleep(2500);
//        WebElement walkingtick = driver.findElement(mobileLocators.tickbttn);
//		walkingtick.click();
//		walkingtick.click();
//	        
//		Thread.sleep(5500);
//		WebElement succeskip	= driver.findElement(mobileLocators.Skipclick);
//		succeskip.click();
//	
//		Thread.sleep(2500);
//		WebElement headingverifiy	= driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Walking\"`][1]"));
//		
//		String expectedLabel = "Walking";
//		String actualLabel = headingverifiy.getText();
//
//		// Use TestNG assertion to compare the expected and actual labels
//		Assert.assertEquals(actualLabel, expectedLabel, "Label verification failed!");
//
//		// Log the expected and actual labels to Allure report
//        Allure.addAttachment("Expected Label", expectedLabel);
//        Allure.addAttachment("Actual Label", actualLabel);
//		
//        // Click on walking- hydration icon	
//        WebElement walkinghydration	= driver.findElement(mobileLocators.hydration1click);
//        walkinghydration.click();
//        
//        // Click on plus icon from hydration
//        WebElement hydrationpopclick = driver.findElement(mobileLocators.hydrationplus);
//     	for (int i = 0; i < 2; i++) {
//     	hydrationpopclick.click();
//     	}
//        
//     	WebElement hydrationsubmit	= driver.findElement(mobileLocators.submithydration);
//     	hydrationsubmit.click();
//
//     	// Click on delte icon for walking event
//     	WebElement deletehydration	= driver.findElement(mobileLocators.deleticon);
//     	deletehydration.click();
//     	
//     // Click on delte icon for walking event
//     	WebElement yesdeletehydration	= driver.findElement(mobileLocators.yesdeleticon);
//     	yesdeletehydration.click();
//     	
//     	
//		Thread.sleep(2500);
//        driver.terminateApp("com.cuesz.mobile");
//	}
//	
//	// Function to check if an element is present on the screen
//	public boolean isElementPresent(AppiumDriver driver, By by){
//	    try{
//	        driver.findElement(by);
//	        return true;
//	    } catch (NoSuchElementException e){
//	        return false;
//	    }
//	}
//}
//	
//
package cuesz03.Iosapp_member_home_Fuelscreen;

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

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import cuesz.utils.mobile.mobileLocators;
import cuesz.utils.reporting.AllureUtils;
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

@Epic ("Member Add an event screen detail ")
@Feature ("Verify member able to functionlaity related to add an event functionlaity.")
public class Case46_Fuel_Addandevent_additionalwithdelete extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case46_Fuel_Addandevent_additionalwithdelete.class);
	
	mobileLocators locators = new mobileLocators();	
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Member add an Event screen detail verification")
    @Story("Scroll to add an event & verify its related fuel added")	
	public void Fuel_addaneventadditionalcasewithdelete() throws InterruptedException{
		try {
		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
		
        WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
		Homeicon.click();
		// Log console message to Allure
		LOGGER.info("Click on home menu from bottom");
        AllureUtils.logStep("Click on home menu from bottom");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "46_1");
		        
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addevent1");
		
		Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject =new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("Perform Fuel Mindful Restore", "Perform");
		driver.executeScript("mobile:scroll", scrollObject);
		Thread.sleep(2000);

		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addevent1"); 
        
        //Click on Fuel tab 
        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();
        // Log console message to Allure
        LOGGER.info("Click on fuel screen");
        AllureUtils.logStep("Click on fuel screen");
        AllureUtils.captureScreenshot(driver,"46_2");
        
        Thread.sleep(3500);
        
        Thread.sleep(3500);
		 By addeventlocator = AppiumBy.accessibilityId("AddEvent");
	        if(!isElementPresent(driver, addeventlocator)){
	            // Scroll to "Basketball" if it's not present
	            HashMap<String,Object> scrollObject2 = new HashMap<>();
	            scrollObject2.put("direction", "down");
	            scrollObject2.put("During Performance", "During Performance");
	            driver.executeScript("mobile:scroll", scrollObject2);
	            Thread.sleep(2000);
	        }
        
		
        // Locate the element containing the perform
	        WebElement eventadd = driver.findElement(mobileLocators.addeventlabel);
        // Extract text from the element
        String actualText = eventadd.getText();
        // Define the expected text
        String expectedText = "Add An Event";
        
        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText);
        System.out.println("Expected Text: " + expectedText);
        // Compare the actual and expected text
        Assert.assertEquals(actualText, expectedText);
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addevent2"); 
        
        // Locate the element related to add event button 
        WebElement addaneventbutton 	= driver.findElement(mobileLocators.eventbttn);
        addaneventbutton.click();
        // Log console message to Allure
        LOGGER.info("Click on addaneventbutton");
        AllureUtils.logStep("Click on addaneventbutton");
        AllureUtils.captureScreenshot(driver,"46_3");
        
        // Locate the element related to cross icon
        WebElement eventcrossbutton 	= driver.findElement(mobileLocators.eventcross);
        eventcrossbutton.click();
        // Log console message to Allure
        LOGGER.info("Click on eventcrossbutton");
        AllureUtils.logStep("Click on eventcrossbutton");
        AllureUtils.captureScreenshot(driver,"46_4");
        
        // again click on add an event button 
        addaneventbutton.click();
        // Log console message to Allure
        LOGGER.info("Click on addaneventbutton");
        AllureUtils.logStep("Click on addaneventbutton");
        AllureUtils.captureScreenshot(driver,"46_addaneventbutton");
        
        
        // Locate Select activity field 
        WebElement selectacticity 	= driver.findElement(mobileLocators.selectactivityfield);
        selectacticity.click();
        // Log console message to Allure
        LOGGER.info("Click on selectactivity");
        AllureUtils.logStep("Click on selectactivity");
        AllureUtils.captureScreenshot(driver,"46_5");
        
        WebElement Activityname		= driver.findElement(mobileLocators.Enteractivityname);   
        Activityname.sendKeys("Walking");
        // Log console message to Allure
        LOGGER.info("Enter activity name");
        AllureUtils.logStep("Enter activity name");
        AllureUtils.captureScreenshot(driver,"46_6");
        
        // Enter text for Search field 
        WebElement donekeypad	= driver.findElement(mobileLocators.doneclick);
     	donekeypad.click();
	    // Log console message to Allure
        LOGGER.info("Click on done icon");
        AllureUtils.logStep("Click on done icon");

        
     	 // Locate Select activity field 	
        WebElement selectwalking 	= driver.findElement(mobileLocators.walkingclikc);
        selectwalking.click();
        // Log console message to Allure
        LOGGER.info("select selectwalking");
        AllureUtils.logStep("select selectwalking");
        AllureUtils.captureScreenshot(driver,"46_7");
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addevent3"); 
      
     	// Select starttime	for add an event
        WebElement startTimerclick 	= driver.findElement(mobileLocators.startTime);
        startTimerclick.click();
        
        List<WebElement>values = driver.findElements(mobileLocators.pickerelement);

		for (int i=0; i<values.size();i++)
		{		
		System.out.println(values.get(i).getText());
		}
		
		values.get(0).sendKeys("10");
		values.get(0).sendKeys(Keys.TAB);

		Thread.sleep(3500);
		values.get(1).sendKeys("03");
		values.get(1).sendKeys(Keys.TAB);
		
		Thread.sleep(3500);
		values.get(2).sendKeys("AM");
		// Log console message to Allure
		LOGGER.info("enter time ");
		AllureUtils.logStep("Enter time");    
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "Case46_8");
				
		driver.findElement(mobileLocators.Doneclick).click();
		// Log console message to Allure
	       LOGGER.info("Click on done icon");
	       AllureUtils.logStep("Click on done icon");

	       
		
		 // Click on start time 
        WebElement endTimerclick 	= driver.findElement(mobileLocators.endtime);
        endTimerclick.click();
        
        List<WebElement>values1 = driver.findElements(mobileLocators.pickerelement);

		for (int i=0; i<values1.size();i++)
		{		
		System.out.println(values1.get(i).getText());
		}
		
		values1.get(0).sendKeys("10");
		values1.get(0).sendKeys(Keys.TAB);

		Thread.sleep(3500);
		values1.get(1).sendKeys("33");
		values1.get(1).sendKeys(Keys.TAB);
		
		Thread.sleep(3500);
		values1.get(2).sendKeys("AM");
		// Log console message to Allure
		LOGGER.info("enter time ");
		AllureUtils.logStep("Enter time");    
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "Case46_9");
				
		driver.findElement(mobileLocators.Doneclick).click();
		
		// Click on plus icon from hydration
		WebElement hydrationclick = driver.findElement(mobileLocators.hydration);
		for (int i = 0; i < 4; i++) {
		    hydrationclick.click();
		}

		
		// Click on Electrolyte glasses
		 By[] electrolyte = {mobileLocators.electro1, mobileLocators.electro2};
        try {   
            // Click on glasses using a loop
            for (By locator6 : electrolyte) {
                try {
                    WebElement glass = driver.findElement(locator6);
                    glass.click();
                    // Add logic for validation or other actions if necessary
                } catch (NoSuchElementException e) {
                    System.out.println("Element not found: " + e.getMessage());
                    // Handle the exception (e.g., log, retry, or terminate the loop)
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }       
		
        WebElement tellusmre	= driver.findElement(mobileLocators.notesevent);
		tellusmre.sendKeys("Add values by automation tools");
		
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addevent4"); 
	
        Thread.sleep(2500);
        WebElement walkingtick = driver.findElement(mobileLocators.tickbttn);
		walkingtick.click();
		walkingtick.click();
		// Log console message to Allure
		LOGGER.info("click on walkingtick ");
		AllureUtils.logStep("click on walkingtick ");    
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "Case46_10");
				
	        
		Thread.sleep(5500);
		WebElement succeskip	= driver.findElement(mobileLocators.Skipclick);
		succeskip.click();
		succeskip.click();
		// Log console message to Allure
		LOGGER.info("click on succeskip ");
		AllureUtils.logStep("click on succeskip");    
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "Case46_11");
				
		
        // Click on walking- hydration icon	
        WebElement walkinghydration	= driver.findElement(mobileLocators.hydration1click);
        walkinghydration.click();
        // Log console message to Allure
		LOGGER.info("click on walkinghydration ");
		AllureUtils.logStep("click on walkinghydration");    
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "Case46_12");
	
        // Click on plus icon from hydration
        WebElement hydrationpopclick = driver.findElement(mobileLocators.hydrationplus);
     	for (int i = 0; i < 2; i++) {
     	hydrationpopclick.click();
     	}
        
     	WebElement hydrationsubmit	= driver.findElement(mobileLocators.submithydration);
     	hydrationsubmit.click();
		// Log console message to Allure
		LOGGER.info("click on hydrationsubmit ");
		AllureUtils.logStep("click on hydrationsubmit");    
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "Case46_13");
     		
     	// Click on delte icon for walking event
     	WebElement deletehydration	= driver.findElement(mobileLocators.deleticon);
     	deletehydration.click();
     	
     // Click on delte icon for walking event
     	WebElement yesdeletehydration	= driver.findElement(mobileLocators.yesdeleticon);
     	yesdeletehydration.click();     	
     // Log console message to Allure
		LOGGER.info("click on yesdeletehydration ");
		AllureUtils.logStep("click on yesdeletehydration");    
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "Case46_14");
          		
     		
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
	
