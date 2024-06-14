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

@Epic ("Fuel screen detail")
@Feature ("Verify Fuel detail functionlaity related to Lunch functionlaity.")
public class Case33_Fuel_Lunch_recommendedfuel extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case33_Fuel_Lunch_recommendedfuel.class);
	private By Homeclick = 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");

	private By Lunchlabel	= 		AppiumBy.iOSNsPredicateString("name == 'Lunch'");
	private By iconforlunch	= 		AppiumBy.accessibilityId("LunchInfoIcon");
	private By backicon			= 		AppiumBy.accessibilityId("BackPress");
	private By plusadd			= 		AppiumBy.accessibilityId("LunchAddIcon");
	private By doneclick		= 		AppiumBy.accessibilityId("Done");
	private By recommendedclick	= 		AppiumBy.accessibilityId("AddRecommendedFuel");
	private By backicon1		= 		AppiumBy.accessibilityId("RecommendBackPress");
	private By rightarrow		= 		AppiumBy.accessibilityId("FuelCaloriesArrowRight");
	private By Time				= 		AppiumBy.accessibilityId("RecommendedFuelTime");
	private By pickerelement	= 		AppiumBy.xpath("//XCUIElementTypePickerWheel");
	private By Doneclick		= 		AppiumBy.accessibilityId("AlcohalTime");
	private By tickbreakfast	= 		AppiumBy.accessibilityId("RecommendedFuelSubmit");
	private By brekdone			= 		AppiumBy.accessibilityId("Done");
	private By Protcard			= 		AppiumBy.accessibilityId("Protein");
	private By crossicon1		= 		AppiumBy.accessibilityId("FuelMacroNutrientCross");
	private By carbcard			= 		AppiumBy.accessibilityId("Carbs");
	private By fatcard			= 		AppiumBy.accessibilityId("Fat");
	

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
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
		
		WebElement Homeicon = driver.findElement(Homeclick);
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
        WebElement lunchlabel	= driver.findElement(Lunchlabel);
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
        WebElement earlysnackicon	= driver.findElement(iconforlunch);
        earlysnackicon.click();
        // Log console message to Allure
        LOGGER.info("Click on earlysnackicon");
        AllureUtils.logStep("Click on earlysnackicon");
        AllureUtils.captureScreenshot(driver, "Case33_3");
        
        WebElement backclick	= driver.findElement(backicon);
        backclick.click();
        // Log console message to Allure
        LOGGER.info("Click on backicon");
        AllureUtils.logStep("Click on backicon");
        AllureUtils.captureScreenshot(driver, "Case33_4");
        
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "lunch1");
        
        // Locate the element related to breakfast + icon 
        WebElement earlysnackplus 	= driver.findElement(plusadd);
        earlysnackplus.click();
        // Log console message to Allure
        LOGGER.info("Click on earlysnackplus");
        AllureUtils.logStep("Click on earlysnackplus");
        AllureUtils.captureScreenshot(driver, "Case33_5");
        
       //click on keypad Done button to hide keypad
        WebElement keypaddone	= driver.findElement(doneclick);
        keypaddone.click();
        // Log console message to Allure
        LOGGER.info("Click on keypaddone");
        AllureUtils.logStep("Click on keypaddone");
        AllureUtils.captureScreenshot(driver, "Case33_6");
        
        
        // Locate and click on recommended Fuel button
        WebElement Recommendedfuel 	= driver.findElement(recommendedclick);
        Recommendedfuel.click();
        // Log console message to Allure
        LOGGER.info("Click on Recommendedfuel");
        AllureUtils.logStep("Click on Recommendedfuel");
        AllureUtils.captureScreenshot(driver, "Case33_7");
        
        WebElement recommendebackclick	= driver.findElement(backicon1);
        recommendebackclick.click();
        // Log console message to Allure
        LOGGER.info("Click on recommendebackclick");
        AllureUtils.logStep("Click on recommendebackclick");
        AllureUtils.captureScreenshot(driver, "Case33_8");
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone1	= driver.findElement(doneclick);
        keypaddone1.click();
        // Log console message to Allure
        LOGGER.info("Click on keypaddone1");
        AllureUtils.logStep("Click on keypaddone1");
        AllureUtils.captureScreenshot(driver, "Case33_9");
        
        
        // Locate and click on recommended Fuel button
        WebElement Recommendedfuel1 	= driver.findElement(recommendedclick);
        Recommendedfuel1.click();
     // Log console message to Allure
        LOGGER.info("Click on Recommendedfuel1");
        AllureUtils.logStep("Click on Recommendedfuel1");
        AllureUtils.captureScreenshot(driver, "Case33_10");
        
        try {
        	WebElement arrowright = driver.findElement(rightarrow);
        	arrowright.click();
        	// Log console message to Allure
            LOGGER.info("Click on arrowright");
            AllureUtils.logStep("Click on arrowright");
   
        // Click on timer 
        WebElement Timerclick 	= driver.findElement(Time);
        Timerclick.click();
        // Log console message to Allure
        LOGGER.info("Click on Timerclick");
        AllureUtils.logStep("Click on Timerclick");
        AllureUtils.captureScreenshot(driver, "Case33_11");
        
        List<WebElement>values = driver.findElements(pickerelement);

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

		driver.findElement(Doneclick).click();
		// Log console message to Allure
        LOGGER.info("Click on Doneclick ");
        AllureUtils.logStep("Click on Doneclick"); 
        
		// Click on breakfast-tick 
        WebElement breakfasttick	= driver.findElement(tickbreakfast);
        breakfasttick.click();
        // Log console message to Allure
        LOGGER.info("Click on breakfasttick");
        AllureUtils.logStep("Click on breakfasttick");
        AllureUtils.captureScreenshot(driver, "Case33_12");
        
        // Click on Done-breakfast button
        WebElement brekfastdone 	= driver.findElement(brekdone);
        brekfastdone.click();
        // Log console message to Allure
        LOGGER.info("Click on brekdone");
        AllureUtils.logStep("Click on brekdone");
       
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Lunch4");
        
        Thread.sleep(4500);
        
       
        scroll("down", "Lunch");	
  		scroll("up", "Early Snacks");
  		Thread.sleep(2000);
  		
  		scroll("up", "Breakfast");
  		Thread.sleep(2000);
  
        
  		scroll("up", "DRINK MORE WATER");
  		Thread.sleep(2000);
        
  		
  		scroll("up", "Carbs");
  		Thread.sleep(2000);
    
  		//click on protein card
  		WebElement protein = driver.findElement(Protcard);
  		protein.click();	
  		// Log console message to Allure
        LOGGER.info("Click on protein");
        AllureUtils.logStep("Click on protein");
        AllureUtils.captureScreenshot(driver, "Case33_14");
  		
  		scroll("down", "Early Snacks");
  		scroll("down", "Lunch");
  		Thread.sleep(2000);
  		// Capture a screenshot and attach it to Allure
          AllureUtils.captureScreenshot(driver, "Lunch5");	
  		//Click on protein cross icon
  		WebElement proteincross = driver.findElement(crossicon1);
  		proteincross.click();
  		// Log console message to Allure
        LOGGER.info("Click on proteincross");
        AllureUtils.logStep("Click on proteincross");
        AllureUtils.captureScreenshot(driver, "Case33_15");
        
  		//click on carbs card
  		WebElement carbs = driver.findElement(carbcard);
  		carbs.click();	
  	// Log console message to Allure
        LOGGER.info("Click on carbs");
        AllureUtils.logStep("Click on carbs");
        AllureUtils.captureScreenshot(driver, "Case33_16");
  		
  		scroll("down", "Early Snacks");  		
  		scroll("down", "Lunch");
  		Thread.sleep(2000); 		
  		// Capture a screenshot and attach it to Allure
          AllureUtils.captureScreenshot(driver, "Lunch6");
  		//Click on protein cross icon
          
  		WebElement carbscross = driver.findElement(crossicon1);
  		carbscross.click();
  		// Log console message to Allure
        LOGGER.info("Click on carbscross");
        AllureUtils.logStep("Click on carbscross");
        AllureUtils.captureScreenshot(driver, "carbscross");
        
  		//click on fats card
  		WebElement fats = driver.findElement(fatcard);
  		fats.click();	
  		// Log console message to Allure
        LOGGER.info("Click on fats");
        AllureUtils.logStep("Click on fats");
        AllureUtils.captureScreenshot(driver, "fats");
        
  		scroll("down", "Early Snacks");
  		scroll("down", "Lunch");
  		Thread.sleep(2000); 
  		// Capture a screenshot and attach it to Allure
          AllureUtils.captureScreenshot(driver, "Lunch7");
  		//Click on protein cross icon
          
  		WebElement fatscross = driver.findElement(crossicon1);
  		fatscross.click();
  		// Log console message to Allure
        LOGGER.info("Click on fatscross");
        AllureUtils.logStep("Click on fatscross");
        AllureUtils.captureScreenshot(driver, "33_fatscross");
        
        
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
	            driver.terminateApp("com.cuesz.mobile");
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
	 


	
