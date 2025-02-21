	//package cuesz03.Iosapp_member_home_Fuelscreen;
//
//import java.util.HashMap;
//import java.util.List;
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
//import io.appium.java_client.AppiumBy;
//import io.qameta.allure.Description;
//import io.qameta.allure.Epic;
//import io.qameta.allure.Feature;
//import io.qameta.allure.Owner;
//import io.qameta.allure.Severity;
//import io.qameta.allure.SeverityLevel;
//import io.qameta.allure.Story;
//
//@Epic ("Fuel screen detail")
//@Feature ("Verify Fuel detail functionlaity related to EarlySnacks functionlaity.")
//public class Case29_Fuel_EarlySnacks_recommendedfuel extends AppiummobileBase {
//	
//	private By Homeclick = 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
//
//	private By earlysnacklabel	= 		AppiumBy.iOSNsPredicateString("name == 'Early Snacks'");
//	private By iconearlysnacks	= 		AppiumBy.accessibilityId("Early SnacksInfoIcon");
//	private By backicon			= 		AppiumBy.accessibilityId("BackPress");
//	private By plusadd			= 		AppiumBy.accessibilityId("Early SnacksAddIcon");
//	private By doneclick		= 		AppiumBy.accessibilityId("Done");
//	private By recommendedclick	= 		AppiumBy.accessibilityId("AddRecommendedFuel");
//	private By backicon1		= 		AppiumBy.accessibilityId("RecommendBackPress");
//	private By rightarrow		= 		AppiumBy.accessibilityId("FuelCaloriesArrowRight");
//	private By Time				= 		AppiumBy.accessibilityId("RecommendedFuelTime");
//	private By pickerelement	= 		AppiumBy.xpath("//XCUIElementTypePickerWheel");
//	private By Doneclick		= 		AppiumBy.accessibilityId("AlcohalTime");
//	private By tickbreakfast	= 		AppiumBy.accessibilityId("RecommendedFuelSubmit");
//	private By brekdone			= 		AppiumBy.accessibilityId("Done");
//	private By Protcard			= 		AppiumBy.accessibilityId("Protein");
//	private By crossicon1		= 		AppiumBy.accessibilityId("FuelMacroNutrientCross");
//	private By carbcard			= 		AppiumBy.accessibilityId("Carbs");
//	private By fatcard			= 		AppiumBy.accessibilityId("Fat");
//	
//
//	@Test
//	@Owner("QA") // Add the @Owner annotation to specify the executor
//    @Severity(SeverityLevel.NORMAL)      
//    @Description("Member Fuel screen detail verification")
//    @Story("Scroll to Fuel card and verify EarlySnacks assigned by staff ")	
//	public void Fuel_EarlySnacks_recommendedfuel() throws InterruptedException
//	{	
//		// Create an instance of AppiumUtils and pass the driver
//		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
//        // Launch the app using the utility method
//        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
//		
//		WebElement Homeicon = driver.findElement(Homeclick);
//		Homeicon.click();
//		
//		Thread.sleep(3000);
//		// Method to scroll to perform screen
//		HashMap<String,Object>scrollObject =new HashMap<>();
//		scrollObject.put("direction", "down");
//		scrollObject.put("Perform Fuel Mindful Restore", "Perform");
//		driver.executeScript("mobile:scroll", scrollObject);
//		Thread.sleep(2000);
//
//        //Click on Fuel tab 
//        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();
//        
//        Thread.sleep(3500);
//        
//        // Method to scroll to perform screen
// 		HashMap<String,Object>scrollObject1 =new HashMap<>();
// 		scrollObject1.put("direction", "down");
// 		scrollObject1.put("Early Snacks", "Early Snacks");
// 		driver.executeScript("mobile:scroll", scrollObject1);
// 		Thread.sleep(2000);
//        
//		
//        // Locate the element containing the perform
//        WebElement earlysnack = driver.findElement(earlysnacklabel);
//        // Extract text from the element
//        String actualText = earlysnack.getText();
//        // Define the expected text
//        String expectedText = "Early Snacks";
//        
//        // Print the actual and expected text to the console
//        System.out.println("Actual Text: " + actualText);
//        System.out.println("Expected Text: " + expectedText);
//        // Compare the actual and expected text
//        Assert.assertEquals(actualText, expectedText);
//		
//        
//        // Locate and click on breakfasticon for cal related info
//        WebElement earlysnackicon	= driver.findElement(iconearlysnacks);
//        earlysnackicon.click();
//        WebElement backclick	= driver.findElement(backicon);
//        backclick.click();
//        
//		// Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "earlysnack1");
//        
//        // Locate the element related to breakfast + icon 
//        WebElement earlysnackplus 	= driver.findElement(plusadd);
//        earlysnackplus.click();
//        
//       //click on keypad Done button to hide keypad
//        WebElement keypaddone	= driver.findElement(doneclick);
//        keypaddone.click();
//        
//        // Capture a screenshot and attach it to Allure
//	    AllureUtils.captureScreenshot(driver, "earlysnack2");
//        
//        // Locate and click on recommended Fuel button
//        WebElement Recommendedfuel 	= driver.findElement(recommendedclick);
//        Recommendedfuel.click();
//        WebElement recommendebackclick	= driver.findElement(backicon1);
//        recommendebackclick.click();
//        
//        //click on keypad Done button to hide keypad
//        WebElement keypaddone1	= driver.findElement(doneclick);
//        keypaddone1.click();
//        // Locate and click on recommended Fuel button
//        WebElement Recommendedfuel1 	= driver.findElement(recommendedclick);
//        Recommendedfuel1.click();
//
//       
//        WebElement arrowright = driver.findElement(rightarrow);
//        arrowright.click();
//        
//        // Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "earlysnack3");
//
//        
//        // Click on timer 
//        WebElement Timerclick 	= driver.findElement(Time);
//        Timerclick.click();
//        
//        List<WebElement>values = driver.findElements(pickerelement);
//
//		for (int i=0; i<values.size();i++)
//		{		
//		System.out.println(values.get(i).getText());
//		}
//		
//		values.get(0).sendKeys("11");
//		values.get(0).sendKeys(Keys.TAB);
//
//		Thread.sleep(3500);
//		values.get(1).sendKeys("03");
//		values.get(1).sendKeys(Keys.TAB);
//		
//		Thread.sleep(3500);
//		values.get(2).sendKeys("AM");
//	
//		   // Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "earlysnack31");
//
//		
//		driver.findElement(Doneclick).click();
//        
//		// Click on breakfast-tick 
//        WebElement breakfasttick	= driver.findElement(tickbreakfast);
//        breakfasttick.click();
//    		   
//        // Click on Done-breakfast button
//        WebElement brekfastdone 	= driver.findElement(brekdone);
//        brekfastdone.click();
//           
//        // Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "earlysnack4");
//        
//        Thread.sleep(4500);
//  
//        
//     // Method to scroll to perform screen
//  		HashMap<String,Object>scrollObject5 =new HashMap<>();
//  		scrollObject5.put("direction", "up");
//  		scrollObject5.put("DRINK MORE WATER", "DRINK MORE WATER");
//  		driver.executeScript("mobile:scroll", scrollObject5);
//  		Thread.sleep(2000);
//        
//    	// Method to scroll to perform screen
//  		HashMap<String,Object>scrollObject3 =new HashMap<>();
//  		scrollObject3.put("direction", "up");
//  		scrollObject3.put("OPTIMAL FUEL TARGET ACHIEVED", "OPTIMAL FUEL TARGET ACHIEVED");
//  		driver.executeScript("mobile:scroll", scrollObject3);
//  		Thread.sleep(2000);
//  		
//  		
//  		HashMap<String,Object>scrollObject4 =new HashMap<>();
//  		scrollObject4.put("direction", "up");
//  		scrollObject4.put("Carbs", "Carbs");
//  		driver.executeScript("mobile:scroll", scrollObject4);
//  		Thread.sleep(2000);
//    
//  		//click on protein card
//  		WebElement protein = driver.findElement(Protcard);
//  		protein.click();	
//  		// Scroll to element Early Snacks
//  		HashMap<String,Object>scrollObject6 =new HashMap<>();
//  		scrollObject6.put("direction", "down");
//  		scrollObject6.put("Early Snacks", "Early Snacks");
//  		driver.executeScript("mobile:scroll", scrollObject6);
//  		Thread.sleep(2000);
//  		// Capture a screenshot and attach it to Allure
//          AllureUtils.captureScreenshot(driver, "earlysnack5");	
//  		//Click on protein cross icon
//  		WebElement proteincross = driver.findElement(crossicon1);
//  		proteincross.click();
//  		
//  		//click on carbs card
//  		WebElement carbs = driver.findElement(carbcard);
//  		carbs.click();	
//  		// Scroll to element Early Snacks
//  		HashMap<String,Object>scrollObject7 =new HashMap<>();
//  		scrollObject7.put("direction", "down");
//  		scrollObject7.put("Early Snacks", "Early Snacks");
//  		driver.executeScript("mobile:scroll", scrollObject7);
//  		Thread.sleep(2000); 		
//  		// Capture a screenshot and attach it to Allure
//          AllureUtils.captureScreenshot(driver, "earlysnack6");
//  		//Click on protein cross icon
//  		WebElement carbscross = driver.findElement(crossicon1);
//  		carbscross.click();
//  		
//  		//click on fats card
//  		WebElement fats = driver.findElement(fatcard);
//  		fats.click();	
//  		// Scroll to element Early Snacks
//  		HashMap<String,Object>scrollObject8 =new HashMap<>();
//  		scrollObject8.put("direction", "down");
//  		scrollObject8.put("Early Snacks", "Early Snacks");
//  		driver.executeScript("mobile:scroll", scrollObject8);
//  		Thread.sleep(2000); 
//  		// Capture a screenshot and attach it to Allure
//          AllureUtils.captureScreenshot(driver, "earlysnack7");
//  		//Click on protein cross icon
//  		WebElement fatscross = driver.findElement(crossicon1);
//  		fatscross.click();
//        
//        
//		Thread.sleep(2500);
//        driver.terminateApp("com.cuesz.mobile");
//	}
//}
//
////}
//	
//

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

@Epic("Fuel screen detail")
@Feature("Verify Fuel detail functionality related to EarlySnacks functionality.")
public class Case29_Fuel_EarlySnacks_recommendedfuel extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case29_Fuel_EarlySnacks_recommendedfuel.class);

    private By earlysnacklabel = AppiumBy.iOSNsPredicateString("name == 'Early Snacks'");
    private By plusadd = AppiumBy.accessibilityId("Early SnacksAddIcon");
    private By doneclick = AppiumBy.accessibilityId("Done");
    private By recommendedclick = AppiumBy.accessibilityId("AddRecommendedFuel");
    private By backicon1 = AppiumBy.accessibilityId("RecommendBackPress");
    private By rightarrow = AppiumBy.accessibilityId("FuelCaloriesArrowRight");
    private By Time = AppiumBy.accessibilityId("RecommendedFuelTime");
    private By pickerelement = AppiumBy.xpath("//XCUIElementTypePickerWheel");
    private By Doneclick = AppiumBy.accessibilityId("AlcohalTime");
    private By tickbreakfast = AppiumBy.accessibilityId("RecommendedFuelSubmit");
    private By brekdone = AppiumBy.accessibilityId("Done");


    @Test
    @Owner("QA")
    @Severity(SeverityLevel.NORMAL)
    @Description("Member Fuel screen detail verification")
    @Story("Scroll to Fuel card and verify EarlySnacks assigned by staff ")
    public void Fuel_EarlySnacks_recommendedfuel() throws InterruptedException {
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
 		AllureUtils.captureScreenshot(driver, "Case29_1");	
        Thread.sleep(3000);
        
        // Method to scroll to perform screen
        HashMap<String, Object> scrollObject = new HashMap<>();
        scrollObject.put("direction", "down");
        scrollObject.put("Perform Fuel Mindful Restore", "Perform");
        driver.executeScript("mobile:scroll", scrollObject);
        Thread.sleep(2000);

        // Click on Fuel tab
        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();
        // Log console message to Allure
        LOGGER.info("Click on fuel screen");
        AllureUtils.logStep("Click on fuel screen");
        AllureUtils.captureScreenshot(driver, "Case29_2");
        
        Thread.sleep(3500);

        // Scroll to "Early Snacks" element if it's not present on the screen
        By earlysnacksLocator = AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Early Snacks\"`][1]");
        if (!isElementPresent(driver, earlysnacksLocator)) {
            // Scroll to "Early Snacks" if it's not present
            HashMap<String, Object> scrollObject1 = new HashMap<>();
            scrollObject1.put("direction", "down");
            scrollObject1.put("Early Snacks", "Early Snacks");
            driver.executeScript("mobile:scroll", scrollObject1);
            Thread.sleep(2000);
        }

        // Locate the element containing the Early Snacks label
        WebElement earlysnack = driver.findElement(earlysnacklabel);
        // Extract text from the element
        String actualText = earlysnack.getText();
        // Define the expected text
        String expectedText = "Early Snacks";

        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText);
        System.out.println("Expected Text: " + expectedText);
        // Compare the actual and expected text
        Assert.assertEquals(actualText, expectedText);

//        // Locate and click on earlysnackicon for calorie-related info
//        WebElement earlysnackicon = driver.findElement(iconearlysnacks);
//        earlysnackicon.click();

        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "earlysnack1");

        // Locate the element related to the earlysnack + icon
        WebElement earlysnackplus = driver.findElement(plusadd);
        earlysnackplus.click();
        
        // Log console message to Allure
        LOGGER.info("Click on earlysnackplus");
        AllureUtils.logStep("Click on earlysnackplus");
        AllureUtils.captureScreenshot(driver, "earlysnackplus_29");
        
        // Click on keypad Done button to hide the keypad
        WebElement keypaddone = driver.findElement(doneclick);
        keypaddone.click();
        // Log console message to Allure
        LOGGER.info("Click on Doneclick ");
        AllureUtils.logStep("Click on Doneclick"); 

        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "earlysnack2");

        // Locate and click on Recommended Fuel button
        WebElement Recommendedfuel = driver.findElement(recommendedclick);
        Recommendedfuel.click();
        //Log console message to Allure
        LOGGER.info("Click on Recommendedfuel");
        AllureUtils.logStep("Click on Recommendedfuel");
        AllureUtils.captureScreenshot(driver, "Recommendedfuel_29");

        try {
            WebElement recommendebackclick = driver.findElement(backicon1);
            recommendebackclick.click();

            // Click on keypad Done button to hide the keypad
            WebElement keypaddone1 = driver.findElement(doneclick);
            keypaddone1.click();
            //Log console message to Allure
            LOGGER.info("Click on keypaddone1");
            AllureUtils.logStep("Click on keypaddone1");
            AllureUtils.captureScreenshot(driver, "keypaddone1_29");

            // Locate and click on Recommended Fuel button
            WebElement Recommendedfuel1 = driver.findElement(recommendedclick);
            Recommendedfuel1.click();
          //Log console message to Allure
            LOGGER.info("Click on Recommendedfuel1");
            AllureUtils.logStep("Click on Recommendedfuel1");
            AllureUtils.captureScreenshot(driver, "Recommendedfuel1_29");
            try {
                WebElement arrowright = driver.findElement(rightarrow);
                arrowright.click();
                //Log console message to Allure
                LOGGER.info("Click on Recommendedfuel");
                AllureUtils.logStep("Click on Recommendedfuel");
                AllureUtils.captureScreenshot(driver, "Recommendedfuel_29");

                // Click on timer
                WebElement Timerclick = driver.findElement(Time);
                Timerclick.click();
                //Log console message to Allure
                LOGGER.info("Click on Timerclick");
                AllureUtils.logStep("Click on Timerclick");
                AllureUtils.captureScreenshot(driver, "Timerclick_30");
                

                List<WebElement> values = driver.findElements(pickerelement);

                for (int i = 0; i < values.size(); i++) {
                    System.out.println(values.get(i).getText());
                }

                values.get(0).sendKeys("11");
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
        		AllureUtils.captureScreenshot(driver, "29_322");

                // Capture a screenshot and attach it to Allure
                AllureUtils.captureScreenshot(driver, "earlysnack31");

                driver.findElement(Doneclick).click();
                // Log console message to Allure
                LOGGER.info("Click on Done");
                AllureUtils.logStep("Click on done");

                // Click on earlysnack-tick
                WebElement earlysnacktick = driver.findElement(tickbreakfast);
                earlysnacktick.click();
                // Log console message to Allure
        		LOGGER.info("Click on earlysnacktick ");
        		AllureUtils.logStep("Click on earlysnacktick");    
        		// Capture a screenshot and attach it to Allure
        		AllureUtils.captureScreenshot(driver, "29_323");

                // Click on Done-earlysnack button
                WebElement earlysnackdone = driver.findElement(brekdone);
                earlysnackdone.click();
                // Log console message to Allure
        		LOGGER.info("Click on earlysnackdone ");
        		AllureUtils.logStep("Click on earlysnackdone");    
        		
                // Capture a screenshot and attach it to Allure
                AllureUtils.captureScreenshot(driver, "earlysnack4");

                Thread.sleep(4500);

            } catch (Exception e) {
            	// If the arrowright element is not found, log an error message and terminate the app
                String errorMessage = "Arrowright element not found. Skipping further steps.";
                System.out.println(errorMessage);
                Allure.addAttachment("Error", errorMessage);
                AllureUtils.captureScreenshot(driver, "ArrowRightNotFound");
                driver.terminateApp("com.cuesz.mobile");
            }

        } catch (Exception e) {
            // Handle exceptions related to RecommendedFuel and earlysnackback
            // Log or take screenshots if needed
        }

        Thread.sleep(3500);
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
//    	            driver.terminateApp("com.cuesz.mobile");
    	            driver.terminateApp(mobileTestData.bundelID);
    	        }
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
