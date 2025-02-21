package cuesz03.Iosapp_member_home_Fuelscreen.Additionalcases;

import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.mobile.resources.mobileLocators;
import cuesz.mobile.resources.mobileTestData;
import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Fuel screen detail ")
@Feature ("Verify Fuel detail functionlaity related to dinner addtional fuel.")
public class Case41_Fuel_Dinner_additionalfuel extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case41_Fuel_Dinner_additionalfuel.class);
		
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Member Fuel screen detail verification")
    @Story("Scroll to Fuel card and verify member able to add addtional dinner list")	
	public void Fuel_Dinner_additionalfuel() throws InterruptedException{
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
        AllureUtils.captureScreenshot(driver, "41_1");
		        		
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
        AllureUtils.captureScreenshot(driver,"41_2");
                
       
        // Locate the element related to dinner + icon 
        WebElement latesnacksplus 	= driver.findElement(mobileLocators.dinnerplusicon);
        latesnacksplus.click();
        // Log console message to Allure
        LOGGER.info("Click on latesnacksplus");
        AllureUtils.logStep("Click on latesnacksplus");
        AllureUtils.captureScreenshot(driver,"41_3");
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone	= driver.findElement(mobileLocators.doneclick);
        keypaddone.click();
        // Log console message to Allure
        LOGGER.info("Click on keypaddone");
        AllureUtils.logStep("Click on keypaddone");
        AllureUtils.captureScreenshot(driver,"41_4");
        
        // Click on fuel search field 
        WebElement additionalfuel = driver.findElement(mobileLocators.additionalsearch);
        additionalfuel.click();
        // Log console message to Allure
        LOGGER.info("Click on additionalfuel");
        AllureUtils.logStep("Click on additionalfuel");
        AllureUtils.captureScreenshot(driver,"41_5");
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Dinner5");
        
        additionalfuel.sendKeys(mobileTestData.food15);
 
        WebElement Keypaddone	= driver.findElement(mobileLocators.doneclick);
        Keypaddone.click();
        // Log console message to Allure
        LOGGER.info("Enter values for search, Click on Done");
        AllureUtils.logStep("Enter values for search, Click on done");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case41_6");
     
        Thread.sleep(2500);
        try {
            // Check if the food item exists in the history
//            WebElement foodHistoryItem = driver.findElement(AppiumBy.accessibilityId("Blueberry Timbit"));
            WebElement foodHistoryItem = driver.findElement(mobileLocators.juicefuelselection);
            
            
            LOGGER.info("Food item 'Blueberry Timbit' found in the history.");

            // Click on the existing food item if clickable
            if (foodHistoryItem.isDisplayed() && foodHistoryItem.isEnabled()) {
                foodHistoryItem.click();
                AllureUtils.logStep("Clicked on 'Blueberry Timbit' from the history.");
            } else {
                LOGGER.warn("'Blueberry Timbit' is found but not clickable.");
            }

            // Click on 'fuelselection' after clicking on the foodHistoryItem
            WebElement fuelselection = driver.findElement(mobileLocators.juicefuelselection);
            fuelselection.click();
            AllureUtils.logStep("Clicked on 'fuelselection' after 'Blueberry Timbit'.");
        } catch (NoSuchElementException e) {
            LOGGER.info("Food item 'Blueberry Timbit' not found in the history. Selecting fuel option instead.");

            // Click on 'fuelselection' as the food item doesn't exist in the history
            WebElement fuelselection = driver.findElement(mobileLocators.juicefuelselection);
            fuelselection.click();
            AllureUtils.logStep("Clicked on 'fuelselection' to add a new food item.");
        }
   
               Thread.sleep(4500);
        
        // Click on timer 
        WebElement Timerclick 	= driver.findElement(mobileLocators.Time);
        Timerclick.click();
        List<WebElement>values = driver.findElements(mobileLocators.pickerelement);
		for (int i=0; i<values.size();i++)
		{		
		System.out.println(values.get(i).getText());
		}
		values.get(0).sendKeys("9");
		values.get(0).sendKeys(Keys.TAB);
		Thread.sleep(3500);
		values.get(1).sendKeys("18");
		values.get(1).sendKeys(Keys.TAB);
		Thread.sleep(3500);
		values.get(2).sendKeys("PM");
		driver.findElement(mobileLocators.Doneclick).click();
		// Log console message to Allure
		LOGGER.info("enter time ");
		AllureUtils.logStep("Enter time");    
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "Case41_8");
		
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Dinner6");
        
    	WebElement submit = driver.findElement(mobileLocators.dinnerTickoption);
		submit.click();
		// Log console message to Allure
		LOGGER.info("click on submit ");
		AllureUtils.logStep("click on submit");    
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "Case41_9");
				
		
		Thread.sleep(3500);
		// Locate the element related to dinner + icon 
        WebElement dinnerplus2 	= driver.findElement(mobileLocators.dinnerplusicon);
        dinnerplus2.click();
        // Log console message to Allure
		LOGGER.info("click on dinnerplus2 ");
		AllureUtils.logStep("click on dinnerplus2");    
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "Case41_10");
     		
        //click on keypad Done button to hide keypad
        WebElement keypaddone2	= driver.findElement(mobileLocators.doneclick);
        keypaddone2.click();
        // Log console message to Allure
 		LOGGER.info("click on keypaddone2 ");
 		AllureUtils.logStep("click on keypaddone2");    
 		// Capture a screenshot and attach it to Allure
 		AllureUtils.captureScreenshot(driver, "Case41_11");
 		
        // Click on fuel search field 
        WebElement additionalfuel2 = driver.findElement(mobileLocators.additionalsearch);
        additionalfuel2.click();
        // Log console message to Allure
  		LOGGER.info("click on additionalfuel2 ");
  		AllureUtils.logStep("click on additionalfuel2");    
  		// Capture a screenshot and attach it to Allure
  		AllureUtils.captureScreenshot(driver, "Case41_12");
      		
     
	   // Capture a screenshot and attach it to Allure
  	   AllureUtils.captureScreenshot(driver, "Dinner7");
       additionalfuel2.sendKeys(mobileTestData.food16);
    
        WebElement Keypaddone2	= driver.findElement(mobileLocators.doneclick);
        Keypaddone2.click();
        // Log console message to Allure
        LOGGER.info("Enter values for search, Click on Done");
        AllureUtils.logStep("Enter values for search, Click on Done");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case41_13");
        Thread.sleep(2500);		
        
        try {
            // Check if the food item exists in the history
//            WebElement foodHistoryItem = driver.findElement(AppiumBy.accessibilityId("Blueberry Timbit"));
            WebElement foodHistoryItem = driver.findElement(mobileLocators.lentifuelselectionc);
            
            
            LOGGER.info("Food item 'Blueberry Timbit' found in the history.");

            // Click on the existing food item if clickable
            if (foodHistoryItem.isDisplayed() && foodHistoryItem.isEnabled()) {
                foodHistoryItem.click();
                AllureUtils.logStep("Clicked on 'Blueberry Timbit' from the history.");
            } else {
                LOGGER.warn("'Blueberry Timbit' is found but not clickable.");
            }

            // Click on 'fuelselection' after clicking on the foodHistoryItem
            WebElement fuelselection = driver.findElement(mobileLocators.lentifuelselectionc);
            fuelselection.click();
            AllureUtils.logStep("Clicked on 'fuelselection' after 'Blueberry Timbit'.");
        } catch (NoSuchElementException e) {
            LOGGER.info("Food item 'Blueberry Timbit' not found in the history. Selecting fuel option instead.");

            // Click on 'fuelselection' as the food item doesn't exist in the history
            WebElement fuelselection = driver.findElement(mobileLocators.lentifuelselectionc);
            fuelselection.click();
            AllureUtils.logStep("Clicked on 'fuelselection' to add a new food item.");
        }
        

        Thread.sleep(4500);
        // Click on fuel search field 
        WebElement additionalfuel3 = driver.findElement(mobileLocators.serchclick);
        additionalfuel3.click();
        // Log console message to Allure
        LOGGER.info("Click on additionalfuel3");
        AllureUtils.logStep("Click on additionalfuel3");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case41_15");
        
        additionalfuel2.sendKeys(mobileTestData.food17);
        
        WebElement Keypaddone3	= driver.findElement(mobileLocators.doneclick);
        Keypaddone3.click();
        // Log console message to Allure
        LOGGER.info("Enter values for search, Click on Done");
        AllureUtils.logStep("Enter values for search, Click on Done");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case41_16");
       
        try {
            // Check if the food item exists in the history
//            WebElement foodHistoryItem = driver.findElement(AppiumBy.accessibilityId("Blueberry Timbit"));
            WebElement foodHistoryItem = driver.findElement(mobileLocators.bopfuelselection);
            
            
            LOGGER.info("Food item 'Blueberry Timbit' found in the history.");

            // Click on the existing food item if clickable
            if (foodHistoryItem.isDisplayed() && foodHistoryItem.isEnabled()) {
                foodHistoryItem.click();
                AllureUtils.logStep("Clicked on 'Blueberry Timbit' from the history.");
            } else {
                LOGGER.warn("'Blueberry Timbit' is found but not clickable.");
            }

            // Click on 'fuelselection' after clicking on the foodHistoryItem
            WebElement fuelselection = driver.findElement(mobileLocators.bopfuelselection);
            fuelselection.click();
            AllureUtils.logStep("Clicked on 'fuelselection' after 'Blueberry Timbit'.");
        } catch (NoSuchElementException e) {
            LOGGER.info("Food item 'Blueberry Timbit' not found in the history. Selecting fuel option instead.");

            // Click on 'fuelselection' as the food item doesn't exist in the history
            WebElement fuelselection = driver.findElement(mobileLocators.bopfuelselection);
            fuelselection.click();
            AllureUtils.logStep("Clicked on 'fuelselection' to add a new food item.");
        }
        	      
	      
        Thread.sleep(4500);
        WebElement submit2 = driver.findElement(mobileLocators.dinnerTickoption);
		submit2.click();
		// Log console message to Allure
        LOGGER.info("Click on submit2");
        AllureUtils.logStep("Click on submit2");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case41_18");
                
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
}