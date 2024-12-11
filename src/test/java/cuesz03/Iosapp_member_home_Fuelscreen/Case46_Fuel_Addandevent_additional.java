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

import cuesz.allure.reporting.AllureUtils;
import cuesz.mobile.resources.mobileLocators;
import cuesz.mobile.resources.mobileTestData;
import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Member Add an event screen detail ")
@Feature ("Verify member able to functionlaity related to add an event functionlaity.")
public class Case46_Fuel_Addandevent_additional extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case46_Fuel_Addandevent_additional.class);
	
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
//        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
		 appiumUtils.launchAppWithPackageId(mobileTestData.bundelID);
		
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
        Activityname.sendKeys(mobileTestData.activtyname);
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
		WebElement succeskip	= driver.findElement(mobileLocators.continueclick);
		succeskip.click();
		// Log console message to Allure
		LOGGER.info("click on succeskip ");
		AllureUtils.logStep("click on succeskip");    
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "Case46_11");
		
	
		// Click on fuel search field 
        WebElement additionalfuel2 = driver.findElement(mobileLocators.additionalsearch);
        additionalfuel2.click();
        LOGGER.info("click on   additionalfuel2");
        AllureUtils.logStep("click on   additionalfuel2");    
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, " additionalfuel2"); 
        additionalfuel2.sendKeys(mobileTestData.food20);	
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone3    = driver.findElement(mobileLocators.doneclick);
        keypaddone3.click();
        LOGGER.info("Click on Done ");
        AllureUtils.logStep("Click on done");  
        
        Thread.sleep(3500);
        WebElement eventfuelselection    = driver.findElement(mobileLocators.macrofuelselection);
        eventfuelselection.click();
        LOGGER.info("click on   eventfuelselection");
        AllureUtils.logStep("click on   eventfuelselection");    
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "eventfuelselection");
        
        WebElement eventfuelclickplus        = driver.findElement(mobileLocators.macrofuelselectionplus);
        int numberOfClicks21 = 2;
        for (int i = 0; i < numberOfClicks21; i++) {   
        	eventfuelclickplus.click();
             LOGGER.info("click on   meatclickplus");
             AllureUtils.logStep("click on   meatclickplus");    
             // Capture a screenshot and attach it to Allure
             AllureUtils.captureScreenshot(driver, "meatclickplus");
        }
	        
        WebElement fuelsearch     = driver.findElement(mobileLocators.additionalsearch);
        fuelsearch.click();
        LOGGER.info("click on   fuelsearch");
        AllureUtils.logStep("click on   fuelsearch");    
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuelsearch");
         
        additionalfuel2.sendKeys(mobileTestData.food21);
        
        WebElement showmoreclick     = driver.findElement(mobileLocators.showclikc);
        showmoreclick.click();
        LOGGER.info("click on   showmoreclick");
        AllureUtils.logStep("click on   showmoreclick");    
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "showmoreclick");
        
      //click on keypad Done button to hide keypad
        WebElement keypaddone4    = driver.findElement(mobileLocators.doneclick);
        keypaddone4.click();
        LOGGER.info("Click on Done ");
        AllureUtils.logStep("Click on done");  

        Thread.sleep(3500);
        WebElement yummfuelselection    = driver.findElement(mobileLocators.yummfoodselection);
        yummfuelselection.click();
        LOGGER.info("click on   yummfuelselection");
        AllureUtils.logStep("click on   yummfuelselection");    
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "yummfuelselection");
       
        
     // Click on timer 
        WebElement Timerclick     = driver.findElement(mobileLocators.Time);
        Timerclick.click();
        LOGGER.info("Click on Timerclick ");
        AllureUtils.logStep("Click on Timerclick");    
       
        List<WebElement>values2 = driver.findElements(mobileLocators.pickerelement);
        for (int i=0; i<values2.size();i++)
        {        
        System.out.println(values2.get(i).getText());
        }
        values2.get(0).sendKeys("8");
        values2.get(0).sendKeys(Keys.TAB);
        Thread.sleep(3500);
        values2.get(1).sendKeys("08");
        values2.get(1).sendKeys(Keys.TAB);
        Thread.sleep(3500);
        values2.get(2).sendKeys("AM");
        driver.findElement(mobileLocators.Doneclick).click();
        LOGGER.info("Click on Doneclick ");
        AllureUtils.logStep("Click on Doneclick");
               
        
        
        WebElement pretickoption     = driver.findElement(mobileLocators.pretickoption);
        pretickoption.click();
        LOGGER.info("click on   pretickoption");
        AllureUtils.logStep("click on   pretickoption");    
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "pretickoption");
        
        /*****************************************************************************************************************/
         Thread.sleep(3500);
		
         // Click on fuel search field 
         WebElement additionalfuel3 = driver.findElement(mobileLocators.additionalsearch);
         additionalfuel3.click();
         LOGGER.info("click on   additionalfuel2");
         AllureUtils.logStep("click on   additionalfuel2");    
         // Capture a screenshot and attach it to Allure
         AllureUtils.captureScreenshot(driver, " additionalfuel2"); 
         additionalfuel3.sendKeys(mobileTestData.food22);	
		
		
         //click on keypad Done button to hide keypad
         WebElement keypaddone5    = driver.findElement(mobileLocators.doneclick);
         keypaddone5.click();
         LOGGER.info("Click on Done ");
         AllureUtils.logStep("Click on done");  
		
         
         Thread.sleep(3500);
         WebElement hamselectionfood    = driver.findElement(mobileLocators.hamselectionfood);
         hamselectionfood.click();
         LOGGER.info("click on   hamselectionfood");
         AllureUtils.logStep("click on   hamselectionfood");    
         // Capture a screenshot and attach it to Allure
         AllureUtils.captureScreenshot(driver, "hamselectionfood");
        
         
      // Click on timer 
         WebElement Timerclick2     = driver.findElement(mobileLocators.Time);
         Timerclick2.click();
         LOGGER.info("Click on Timerclick ");
         AllureUtils.logStep("Click on Timerclick");    
        
         List<WebElement>values3 = driver.findElements(mobileLocators.pickerelement);
         for (int i=0; i<values3.size();i++)
         {        
         System.out.println(values3.get(i).getText());
         }
         values3.get(0).sendKeys("9");
         values3.get(0).sendKeys(Keys.TAB);
         Thread.sleep(3500);
         values3.get(1).sendKeys("15");
         values3.get(1).sendKeys(Keys.TAB);
         Thread.sleep(3500);
         values3.get(2).sendKeys("AM");
         driver.findElement(mobileLocators.Doneclick).click();
         LOGGER.info("Click on Doneclick ");
         AllureUtils.logStep("Click on Doneclick");
                
         
         
         WebElement duringtickoption     = driver.findElement(mobileLocators.duringtickoption);
         duringtickoption.click();
         LOGGER.info("click on   duringtickoption");
         AllureUtils.logStep("click on   duringtickoption");    
         // Capture a screenshot and attach it to Allure
         AllureUtils.captureScreenshot(driver, "duringtickoption");
         
         Thread.sleep(3500);
         /*****************************************************************************************************************/
         
         
         Thread.sleep(3500);
 		
         // Click on fuel search field 
         WebElement additionalfuel4 = driver.findElement(mobileLocators.additionalsearch);
         additionalfuel4.click();
         LOGGER.info("click on   additionalfuel4");
         AllureUtils.logStep("click on   additionalfuel4");    
         // Capture a screenshot and attach it to Allure
         AllureUtils.captureScreenshot(driver, " additionalfuel4"); 
         additionalfuel4.sendKeys(mobileTestData.food23);	
		
		
         //click on keypad Done button to hide keypad
         WebElement keypaddone6    = driver.findElement(mobileLocators.doneclick);
         keypaddone6.click();
         LOGGER.info("Click on Done ");
         AllureUtils.logStep("Click on done");  
		
         
         //click on show more
         WebElement showclikc = driver.findElement(mobileLocators.showclikc);
         showclikc.click();
         LOGGER.info("Click on showclikc ");
         AllureUtils.logStep("Click on showclikc");
         
           
         Thread.sleep(3500);
         WebElement selectionfood    = driver.findElement(mobileLocators.food1selectiobn);
         selectionfood.click();
         LOGGER.info("click on   selectionfood");
         AllureUtils.logStep("click on   selectionfood");    
         // Capture a screenshot and attach it to Allure
         AllureUtils.captureScreenshot(driver, "selectionfood");
        
       
         
      // Click on timer 
         WebElement Timerclick3     = driver.findElement(mobileLocators.Time);
         Timerclick3.click();
         LOGGER.info("Click on Timerclick3 ");
         AllureUtils.logStep("Click on Timerclick3");    
        
         List<WebElement>values31 = driver.findElements(mobileLocators.pickerelement);
         for (int i=0; i<values31.size();i++)
         {        
         System.out.println(values31.get(i).getText());
         }
         values31.get(0).sendKeys("9");
         values31.get(0).sendKeys(Keys.TAB);
         Thread.sleep(3500);
         values31.get(1).sendKeys("15");
         values31.get(1).sendKeys(Keys.TAB);
         Thread.sleep(3500);
         values31.get(2).sendKeys("AM");
         driver.findElement(mobileLocators.Doneclick).click();
         LOGGER.info("Click on Doneclick ");
         AllureUtils.logStep("Click on Doneclick");
                
         
         WebElement posttickoption     = driver.findElement(mobileLocators.postticoption);
         posttickoption.click();
         LOGGER.info("click on   duringtickoption");
         AllureUtils.logStep("click on   duringtickoption");    
         // Capture a screenshot and attach it to Allure
         AllureUtils.captureScreenshot(driver, "duringtickoption");
         
         Thread.sleep(3500);
         // Method to scroll to perform screen
         HashMap<String,Object>scrollObject561 =new HashMap<>();
         scrollObject561.put("direction", "down");
         scrollObject561.put("Pre Performance", "Pre Performance");
         driver.executeScript("mobile:scroll", scrollObject561);
         Thread.sleep(2000);
          LOGGER.info("Scroll object");
          AllureUtils.logStep("Scroll object");
         
         
         
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
	
