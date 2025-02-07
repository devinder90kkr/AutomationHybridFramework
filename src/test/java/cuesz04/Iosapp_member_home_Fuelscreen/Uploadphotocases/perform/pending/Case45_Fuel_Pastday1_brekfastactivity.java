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
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject =new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("Perform Fuel Mindful Restore", "Perform");
		driver.executeScript("mobile:scroll", scrollObject);
		Thread.sleep(2000);

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
              
      
        
/******************* During edit food*******************/ 
        // Edit feature testing
        WebElement Editfood		= driver.findElement(mobileLocators.editfood);
        Editfood.click();
        // Log console message to Allure
        LOGGER.info("Click on Editfood");
        AllureUtils.logStep("Click on Editfood");
        AllureUtils.captureScreenshot(driver, "Case23_Editbeetroot");

        
        WebElement plusclick	= driver.findElement(mobileLocators.editclick1);
        int numberOfClicks1 = 1;
        for (int i = 0; i < numberOfClicks1; i++) {   
        	plusclick.click();
        	 LOGGER.info("Click on plusicon");
             AllureUtils.logStep("Click on plusicon");
             // Capture a screenshot and attach it to Allure
             AllureUtils.captureScreenshot(driver, "Case21_plusicon");
        }
        Thread.sleep(2500);
        //Click on early snacks 
        WebElement whenclick	= driver.findElement(mobileLocators.earlyclick);
        whenclick.click();
        // Log console message to Allure
        LOGGER.info("Click on earlyclick");
        AllureUtils.logStep("Click on earlyclick");
        AllureUtils.captureScreenshot(driver, "Case23_earlyclick");

        
        //Click on breakfast snacks 
        WebElement whenclick1	= driver.findElement(mobileLocators.breakfastclick);
        whenclick1.click();
        // Log console message to Allure
        LOGGER.info("Click on breakfastclick");
        AllureUtils.logStep("Click on breakfastclick");
        AllureUtils.captureScreenshot(driver, "Case23_breakfastclick");

        
        //Click on notes and enter values in field. 
        WebElement noteedit1 = driver.findElement(mobileLocators.noteclick);
        noteedit1.sendKeys("hello this notes is update by automation to verifiy edit field values");
        LOGGER.info("Enter value for note field");
        AllureUtils.logStep("Enter value for note field");
       
        Thread.sleep(1000);
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"DONE\"]")).click();
        
		WebElement editsubmit 	= driver.findElement(mobileLocators.submittick);
		editsubmit.click();
		// Log console message to Allure
        LOGGER.info("Click on editsubmit");
        AllureUtils.logStep("Click on editsubmit");
        AllureUtils.captureScreenshot(driver, "Case23_editsubmit");
        
        
        
        
       
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