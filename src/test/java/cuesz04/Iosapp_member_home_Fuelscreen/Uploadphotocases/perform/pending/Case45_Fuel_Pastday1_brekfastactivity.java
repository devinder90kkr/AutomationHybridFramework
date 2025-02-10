package cuesz04.Iosapp_member_home_Fuelscreen.Uploadphotocases.perform.pending;

import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.appium.date.functions.DateUtilsAppium;
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
@Feature ("Verify Fuel detail functionlaity related to Optimal fuel.")
public class Case45_Fuel_Pastday1_brekfastactivity extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case45_Fuel_Pastday1_brekfastactivity.class);
	
	mobileLocators locators = new mobileLocators();	

	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Member Fuel screen detail verification")
    @Story("Scroll to Fuel card and verify breakfast assigned by staff ")	
	public void Homescreen() throws InterruptedException{
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
        AllureUtils.captureScreenshot(driver, "45_1");
		        
		// Use the utility method
		DateUtilsAppium.clickOnPreviousDay(driver);
		
		Thread.sleep(3000);
		//Click on Fuel tab 
        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();
        // Log console message to Allure
        LOGGER.info("Click on FUEL_SCREEN");
        AllureUtils.logStep("Click on FUEL_SCREEN");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case22_Fuel_breakfast_additionalfuel2");
        

        // Locate the element related to breakfast + icon 
        WebElement breakfastplus     = driver.findElement(mobileLocators.plusadd);
        breakfastplus.click();
        // Log console message to Allure
        LOGGER.info("Click on breakfastplus icon");
        AllureUtils.logStep("Click on breakfastplus icon");
        AllureUtils.captureScreenshot(driver, "Case22_Fuel_breakfast_additionalfuel3");
        
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone    = driver.findElement(mobileLocators.doneclick);
        keypaddone.click();
        // Log console message to Allure
        LOGGER.info("Click on Done");
        AllureUtils.logStep("Click on done");
        
        // Click on fuel search field 
        WebElement additionalfuel = driver.findElement(mobileLocators.additionalsearch);
        additionalfuel.click();
        // Log console message to Allure
        LOGGER.info("Click on additionalfuel");
        AllureUtils.logStep("Click on additionalfuel");
        AllureUtils.captureScreenshot(driver, "Case22_Fuel_breakfast_additionalfuel4");
        
        // Enter food name in search field
        LOGGER.info("Entering food name into the search field: " + mobileTestData.food24);
        additionalfuel.sendKeys(mobileTestData.food24);
        AllureUtils.logStep("Entering food name into the search field: " + mobileTestData.food24);
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone1    = driver.findElement(mobileLocators.doneclick);
        keypaddone1.click();
        // Log console message to Allure
        LOGGER.info("Click on Done");
        AllureUtils.logStep("Click on done");
        

        try {
            // Check if the food item exists in the history
            WebElement foodHistoryItem = driver.findElement(AppiumBy.accessibilityId("Brown Bread"));
            LOGGER.info("Food item 'Brown bread' found in the history.");

            // Click on the existing food item if clickable
            if (foodHistoryItem.isDisplayed() && foodHistoryItem.isEnabled()) {
                foodHistoryItem.click();
                AllureUtils.logStep("Clicked on 'Brown bread' from the history.");
            } else {
                LOGGER.warn("'Brown bread' is found but not clickable.");
            }

            // Click on 'fuelselection' after clicking on the foodHistoryItem
            WebElement fuelselection = driver.findElement(mobileLocators.food1);
            fuelselection.click();
            AllureUtils.logStep("Clicked on 'fuelselection' after 'Brown bread'.");
        } catch (NoSuchElementException e) {
            LOGGER.info("Food item 'Brown bread' not found in the history. Selecting fuel option instead.");

            // Click on 'fuelselection' as the food item doesn't exist in the history
            WebElement fuelselection = driver.findElement(mobileLocators.food1);
            fuelselection.click();
            AllureUtils.logStep("Clicked on 'fuelselection' to add a new food item.");
        }

        // Capture a screenshot for verification
        AllureUtils.captureScreenshot(driver, "Case22_Fuel_breakfast_additionalfuel5");

        
        //Click on food info icon
        WebElement fooditemicon        = driver.findElement(mobileLocators.foodinfoicon);
        fooditemicon.click();
        LOGGER.info("Click on  fooditemicon ");
        AllureUtils.logStep("Click on  fooditemicon ");
        AllureUtils.captureScreenshot(driver, "Case22_Fuel_breakfast_additionalfuel6");
        
        //Click on backbutton
        WebElement backicon         = driver.findElement(mobileLocators.backtap);
        backicon.click();      
        LOGGER.info("click on backicon");
        AllureUtils.logStep("click on backicon");    
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "backicon");
        
        Thread.sleep(3000);
        // Method to scroll to perform screen
        HashMap<String,Object>scrollObject56 =new HashMap<>();
        scrollObject56.put("direction", "down");
        scrollObject56.put("Brown BreadPlus", "Brown BreadPlus");
        driver.executeScript("mobile:scroll", scrollObject56);
        Thread.sleep(2000);
         LOGGER.info("Scroll object");
         AllureUtils.logStep("Scroll object");  
        
        WebElement foodplus  = driver.findElement(mobileLocators.foodplusicon);
        int numberOfClicks = 3;
        for (int i = 0; i < numberOfClicks; i++) {   
        	foodplus.click();
        LOGGER.info("Click on  foodplus icon");
        AllureUtils.logStep("Click on foodplus icon");    
        }
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "additional2");
        
        
      WebElement categoryselection = driver.findElement(mobileLocators.categoryselection);
      categoryselection.click();
      
      
      WebElement breakfastcategoryselection = driver.findElement(mobileLocators.breakfastoption);
      breakfastcategoryselection.click();
      
      // Click on timer 
      WebElement Timerclick     = driver.findElement(mobileLocators.Time);
      Timerclick.click();
      LOGGER.info("Click on Timerclick ");
      AllureUtils.logStep("Click on Timerclick");    
     
      List<WebElement>values = driver.findElements(mobileLocators.pickerelement);
      for (int i=0; i<values.size();i++)
      {        
      System.out.println(values.get(i).getText());
      }
      values.get(0).sendKeys("8");
      values.get(0).sendKeys(Keys.TAB);
      Thread.sleep(3500);
      values.get(1).sendKeys("08");
      values.get(1).sendKeys(Keys.TAB);
      Thread.sleep(3500);
      values.get(2).sendKeys("AM");
      driver.findElement(mobileLocators.Doneclick).click();
      LOGGER.info("Click on Doneclick ");
      AllureUtils.logStep("Click on Doneclick");
        
       //Click on submit tick button
        WebElement submit = driver.findElement(mobileLocators.submitick);
        submit.click();
          // Log console message to Allure
        LOGGER.info("Click on submit");
        AllureUtils.logStep("Click on submit");
        AllureUtils.captureScreenshot(driver, "submit");
        
        Thread.sleep(3000);
        
									        // Locate the element related to breakfast + icon 
									        WebElement earlysnackplus 	= driver.findElement(mobileLocators.earlysnacksplusadd);
									        earlysnackplus.click();
									        // Log console message to Allure
									        LOGGER.info("Click on earlysnackplus");
									        AllureUtils.logStep("Click on earlysnackplus");
									        AllureUtils.captureScreenshot(driver, "earlysnackplus32");
									        
									        //click on keypad Done button to hide keypad
									        WebElement keypaddone11	= driver.findElement(mobileLocators.doneclick);
									        keypaddone11.click();
									        // Log console message to Allure
									        LOGGER.info("Click on Doneclick ");
									        AllureUtils.logStep("Click on Doneclick"); 
									        
									        // Click on fuel search field 
									        WebElement additionalfuel1 = driver.findElement(mobileLocators.additionalsearch);
									        additionalfuel1.click();
									        // Log console message to Allure
									        LOGGER.info("Click on additionalfuel");
									        AllureUtils.logStep("Click on additionalfuel");
									        AllureUtils.captureScreenshot(driver, "additionalfuel_30");
									        
									        // Capture a screenshot and attach it to Allure
									        AllureUtils.captureScreenshot(driver, "earlysnack5");
									        
									        additionalfuel1.sendKeys(mobileTestData.food8);
									        
									        WebElement Keypaddone	= driver.findElement(mobileLocators.doneclick);
									        Keypaddone.click();
									        
									        Thread.sleep(3500);
									        try {
									            // Check if the food item exists in the history
									//            WebElement foodHistoryItem = driver.findElement(AppiumBy.accessibilityId("Blueberry Timbit"));
									            WebElement foodHistoryItem = driver.findElement(mobileLocators.cinamonfuelselection);
									            
									            
									            LOGGER.info("Food item 'Blueberry Timbit' found in the history.");
									
									            // Click on the existing food item if clickable
									            if (foodHistoryItem.isDisplayed() && foodHistoryItem.isEnabled()) {
									                foodHistoryItem.click();
									                AllureUtils.logStep("Clicked on 'Blueberry Timbit' from the history.");
									            } else {
									                LOGGER.warn("'Blueberry Timbit' is found but not clickable.");
									            }
									
									            // Click on 'fuelselection' after clicking on the foodHistoryItem
									            WebElement fuelselection = driver.findElement(mobileLocators.cinamonfuelselection);
									            fuelselection.click();
									            AllureUtils.logStep("Clicked on 'fuelselection' after 'Blueberry Timbit'.");
									        } catch (NoSuchElementException e) {
									            LOGGER.info("Food item 'Blueberry Timbit' not found in the history. Selecting fuel option instead.");
									
									            // Click on 'fuelselection' as the food item doesn't exist in the history
									            WebElement fuelselection = driver.findElement(mobileLocators.cinamonfuelselection);
									            fuelselection.click();
									            AllureUtils.logStep("Clicked on 'fuelselection' to add a new food item.");
									        }
									        
									        // Click on timer 
									        WebElement Timerclick1 	= driver.findElement(mobileLocators.Time);
									        Timerclick1.click();
									        List<WebElement>values1 = driver.findElements(mobileLocators.pickerelement);
											for (int i=0; i<values1.size();i++)
											{		
											System.out.println(values1.get(i).getText());
											}
											values1.get(0).sendKeys("11");
											values1.get(0).sendKeys(Keys.TAB);
											Thread.sleep(3500);
											values1.get(1).sendKeys("18");
											values1.get(1).sendKeys(Keys.TAB);
											Thread.sleep(3500);
											values1.get(2).sendKeys("AM");
											
											driver.findElement(mobileLocators.Doneclick).click();
									        
									    	WebElement submit1 = driver.findElement(mobileLocators.earlysnacksubmitick);
											submit1.click();
											// Log console message to Allure
									        LOGGER.info("Click on submit");
									        AllureUtils.logStep("Click on submit");
									        AllureUtils.captureScreenshot(driver, "submit_30");
        
        Thread.sleep(3000);
     // Locate the element related to breakfast + icon 
        WebElement lunchplus 	= driver.findElement(mobileLocators.lunchplusicon);
        lunchplus.click();
        // Log console message to Allure
        LOGGER.info("Click on lunchplus");
        AllureUtils.logStep("Click on lunchplus");
        AllureUtils.captureScreenshot(driver, "Case34_3");
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone111	= driver.findElement(mobileLocators.doneclick);
        keypaddone111.click();
        // Log console message to Allure
        LOGGER.info("Click on keypaddone");
        AllureUtils.logStep("Click on keypaddone");
        AllureUtils.captureScreenshot(driver, "Case34_4");
        
        // Click on fuel search field 
        WebElement additionalfuel11 = driver.findElement(mobileLocators.additionalsearch);
        additionalfuel11.click();
        // Log console message to Allure
        LOGGER.info("Click on additionalfuel");
        AllureUtils.logStep("Click on additionalfuel");
        AllureUtils.captureScreenshot(driver, "Case34_5");
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "lunchadd1");
          
        additionalfuel11.sendKeys(mobileTestData.food10);
        
 
        WebElement Keypaddone1	= driver.findElement(mobileLocators.doneclick);
        Keypaddone1.click();
        // Log console message to Allure
        LOGGER.info("Enter values for search, Click on Done");
        AllureUtils.logStep("Enter values for search, Click on done");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case34_7");
        
        Thread.sleep(3500);
        try {
            // Check if the food item exists in the history
//            WebElement foodHistoryItem = driver.findElement(AppiumBy.accessibilityId("Blueberry Timbit"));
            WebElement foodHistoryItem = driver.findElement(mobileLocators.stewmeat);
            
            
            LOGGER.info("Food item 'Blueberry Timbit' found in the history.");

            // Click on the existing food item if clickable
            if (foodHistoryItem.isDisplayed() && foodHistoryItem.isEnabled()) {
                foodHistoryItem.click();
                AllureUtils.logStep("Clicked on 'Blueberry Timbit' from the history.");
            } else {
                LOGGER.warn("'Blueberry Timbit' is found but not clickable.");
            }

            // Click on 'fuelselection' after clicking on the foodHistoryItem
            WebElement fuelselection = driver.findElement(mobileLocators.stewmeat);
            fuelselection.click();
            AllureUtils.logStep("Clicked on 'fuelselection' after 'Blueberry Timbit'.");
        } catch (NoSuchElementException e) {
            LOGGER.info("Food item 'Blueberry Timbit' not found in the history. Selecting fuel option instead.");

            // Click on 'fuelselection' as the food item doesn't exist in the history
            WebElement fuelselection = driver.findElement(mobileLocators.stewmeat);
            fuelselection.click();
            AllureUtils.logStep("Clicked on 'fuelselection' to add a new food item.");
        }
        
        
        Thread.sleep(4500);
        
        // Click on timer 
        WebElement Timerclick1111 	= driver.findElement(mobileLocators.Time);
        Timerclick1111.click();
        List<WebElement>values11 = driver.findElements(mobileLocators.pickerelement);
		for (int i=0; i<values11.size();i++)
		{		
		System.out.println(values11.get(i).getText());
		}
		values11.get(0).sendKeys("01");
		values11.get(0).sendKeys(Keys.TAB);
		Thread.sleep(3500);
		values11.get(1).sendKeys("03");
		values11.get(1).sendKeys(Keys.TAB);
		Thread.sleep(3500);
		values11.get(2).sendKeys("PM");
		driver.findElement(mobileLocators.Doneclick).click();
		// Log console message to Allure
		LOGGER.info("enter time ");
		AllureUtils.logStep("Enter time");    
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "Case34_10");
        
    	WebElement submit11 = driver.findElement(mobileLocators.lunchsubmittick);
		submit11.click();
		// Log console message to Allure
        LOGGER.info("Click on submit");
        AllureUtils.logStep("Click on submit");
        AllureUtils.captureScreenshot(driver, "Case34_11");				
        
        
        
        																	Thread.sleep(3000);
        																	// Locate the element related to dinner + icon 
        															        WebElement latesnacksplus 	= driver.findElement(mobileLocators.dinnerplusicon);
        															        latesnacksplus.click();
        															        // Log console message to Allure
        															        LOGGER.info("Click on latesnacksplus");
        															        AllureUtils.logStep("Click on latesnacksplus");
        															        AllureUtils.captureScreenshot(driver,"41_3");
        															        
        															        //click on keypad Done button to hide keypad
        															        WebElement keypaddone1111	= driver.findElement(mobileLocators.doneclick);
        															        keypaddone1111.click();
        															        // Log console message to Allure
        															        LOGGER.info("Click on keypaddone");
        															        AllureUtils.logStep("Click on keypaddone");
        															        AllureUtils.captureScreenshot(driver,"41_4");
        															        
        															        // Click on fuel search field 
        															        WebElement additionalfuel111 = driver.findElement(mobileLocators.additionalsearch);
        															        additionalfuel111.click();
        															        // Log console message to Allure
        															        LOGGER.info("Click on additionalfuel");
        															        AllureUtils.logStep("Click on additionalfuel");
        															        AllureUtils.captureScreenshot(driver,"41_5");
        															        
        															        // Capture a screenshot and attach it to Allure
        															        AllureUtils.captureScreenshot(driver, "Dinner5");
        															        
        															        additionalfuel111.sendKeys(mobileTestData.food15);
        															 
        															        WebElement Keypaddone11	= driver.findElement(mobileLocators.doneclick);
        															        Keypaddone11.click();
        															        // Log console message to Allure
        															        LOGGER.info("Enter values for search, Click on Done");
        															        AllureUtils.logStep("Enter values for search, Click on done");
        																	// Capture a screenshot and attach it to Allure
        															        AllureUtils.captureScreenshot(driver, "Case41_6");
        															     
        															        Thread.sleep(2500);
        															        try {
        															            // Check if the food item exists in the history
//        															            WebElement foodHistoryItem = driver.findElement(AppiumBy.accessibilityId("Blueberry Timbit"));
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
        															        WebElement Timerclick11111 	= driver.findElement(mobileLocators.Time);
        															        Timerclick11111.click();
        															        List<WebElement>values111 = driver.findElements(mobileLocators.pickerelement);
        																	for (int i=0; i<values111.size();i++)
        																	{		
        																	System.out.println(values111.get(i).getText());
        																	}
        																	values111.get(0).sendKeys("9");
        																	values111.get(0).sendKeys(Keys.TAB);
        																	Thread.sleep(3500);
        																	values111.get(1).sendKeys("18");
        																	values111.get(1).sendKeys(Keys.TAB);
        																	Thread.sleep(3500);
        																	values111.get(2).sendKeys("PM");
        																	driver.findElement(mobileLocators.Doneclick).click();
        																	// Log console message to Allure
        																	LOGGER.info("enter time ");
        																	AllureUtils.logStep("Enter time");    
        																	// Capture a screenshot and attach it to Allure
        																	AllureUtils.captureScreenshot(driver, "Case41_8");
        																	
        																	
        																	// Capture a screenshot and attach it to Allure
        															        AllureUtils.captureScreenshot(driver, "Dinner6");
        															        
        															    	WebElement submit111 = driver.findElement(mobileLocators.dinnerTickoption);
        																	submit111.click();
        																	// Log console message to Allure
        																	LOGGER.info("click on submit ");
        																	AllureUtils.logStep("click on submit");    
        																	// Capture a screenshot and attach it to Allure
        																	AllureUtils.captureScreenshot(driver, "Case41_9");
									        
									        
        
       
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
//                driver.terminateApp("com.cuesz.mobile");
                driver.terminateApp(mobileTestData.bundelID);
            }
        }
    }