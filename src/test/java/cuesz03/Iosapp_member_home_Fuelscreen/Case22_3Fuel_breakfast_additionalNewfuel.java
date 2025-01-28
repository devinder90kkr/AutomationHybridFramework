package cuesz03.Iosapp_member_home_Fuelscreen;

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
@Feature ("Verify Fuel detail functionlaity related to Optimal fuel.")
public class Case22_3Fuel_breakfast_additionalNewfuel extends AppiummobileBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(Case22_3Fuel_breakfast_additionalNewfuel.class);
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
        AllureUtils.captureScreenshot(driver, "Case22_Fuel_breakfast_additionalfuel1");
        
        Thread.sleep(3000);
        // Method to scroll to perform screen
        HashMap<String,Object>scrollObject =new HashMap<>();
        scrollObject.put("direction", "down");
        scrollObject.put("Perform Fuel Mindful Restore", "Perform");
        driver.executeScript("mobile:scroll", scrollObject);
        Thread.sleep(2000);

        // Log console message to Allure
        LOGGER.info("scroll Object to fuel");
        AllureUtils.logStep("scroll Object to fuel");
        
        
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
        LOGGER.info("Entering food name into the search field: " + mobileTestData.food3);
        additionalfuel.sendKeys(mobileTestData.food3);
        AllureUtils.logStep("Entering food name into the search field: " + mobileTestData.food3);
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone1    = driver.findElement(mobileLocators.doneclick);
        keypaddone1.click();
        // Log console message to Allure
        LOGGER.info("Click on Done");
        AllureUtils.logStep("Click on done");
        

        try {
            // Check if the food item exists in the history
            WebElement foodHistoryItem = driver.findElement(AppiumBy.accessibilityId("Protein shake"));
            LOGGER.info("Food item 'Protein shake' found in the history.");

            // Click on the existing food item if clickable
            if (foodHistoryItem.isDisplayed() && foodHistoryItem.isEnabled()) {
                foodHistoryItem.click();
                AllureUtils.logStep("Clicked on Protein shake' from the history.");
            } else {
                LOGGER.warn("'Protein shake' is found but not clickable.");
            }

            // Click on 'fuelselection' after clicking on the foodHistoryItem
            WebElement fuelselection = driver.findElement(mobileLocators.Beetroot);
            fuelselection.click();
            AllureUtils.logStep("Clicked on 'fuelselection' after ' Protein Shake' ");
        } catch (NoSuchElementException e) {
            LOGGER.info("Food item 'Protein shake' not found in the history. Selecting fuel option instead.");

            // Click on 'fuelselection' as the food item doesn't exist in the history
            WebElement fuelselection = driver.findElement(mobileLocators.Beetroot);
            fuelselection.click();
            AllureUtils.logStep("Clicked on 'fuelselection' to add a new food item.");
        }

        WebElement foodplus  = driver.findElement(mobileLocators.beetrootplusicon);
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
              
       //Click on submit tick button
        WebElement submit = driver.findElement(mobileLocators.submitick);
        submit.click();
          // Log console message to Allure
        LOGGER.info("Click on submit");
        AllureUtils.logStep("Click on submit");
        AllureUtils.captureScreenshot(driver, "submit");


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

