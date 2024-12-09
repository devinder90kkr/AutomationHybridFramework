package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import java.util.List;

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
public class Case22_Fuel_breakfast_additionalfuel extends AppiummobileBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(Case22_Fuel_breakfast_additionalfuel.class);

    
    

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
        
        
//        WebElement searchtext1    = driver.findElement(AppiumBy.iOSNsPredicateString("label == \"F\""));
//        searchtext1.click();
//        
//        WebElement searchtext2    = driver.findElement(AppiumBy.iOSNsPredicateString("label == \"a\""));
//        searchtext2.click();
//        
//        WebElement searchtext3    = driver.findElement(AppiumBy.iOSNsPredicateString("label == \"g\""));
//        searchtext3.click();
//
//        WebElement searchtext4    = driver.findElement(AppiumBy.iOSNsPredicateString("label == \"g\""));
//        searchtext4.click();
//        
//        WebElement searchtext5    = driver.findElement(AppiumBy.iOSNsPredicateString("label == \"o\""));
//        searchtext5.click();
//        
//        WebElement searchtext6    = driver.findElement(AppiumBy.iOSNsPredicateString("label == \"t\""));
//        searchtext6.click();
      
//        WebElement searchtext1 =driver.findElement(AppiumBy.accessibilityId("AdditionalFuelSearch"));
        additionalfuel.sendKeys(mobileTestData.food1);
        
//        WebElement Keypaddone    = driver.findElement(mobileLocators.doneclick);
//        Keypaddone.click();
//        // Log console message to Allure
//        LOGGER.info("Enter value for search,Click on Done");
//        AllureUtils.logStep("Enter value for search,Click on Done");       
//        // Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "additional1");
        
        WebElement fuelselection    = driver.findElement(mobileLocators.faggot);
        fuelselection.click();
        LOGGER.info("Click on  fuelselection ");
        AllureUtils.logStep("Click on  fuelselection ");
        AllureUtils.captureScreenshot(driver, "Case22_Fuel_breakfast_additionalfuel5");
        
        
        WebElement faggoticon        = driver.findElement(mobileLocators.fagoticon);
        faggoticon.click();
        LOGGER.info("Click on  faggoticon ");
        AllureUtils.logStep("Click on  faggoticon ");
        AllureUtils.captureScreenshot(driver, "Case22_Fuel_breakfast_additionalfuel6");
        
        
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
        scrollObject56.put("fagotplus", "fagotplus");
        driver.executeScript("mobile:scroll", scrollObject56);
        Thread.sleep(2000);
         LOGGER.info("Scroll object");
         AllureUtils.logStep("Scroll object");  
        
        WebElement faggotplus        = driver.findElement(mobileLocators.fagotplus);
        int numberOfClicks = 3;
        for (int i = 0; i < numberOfClicks; i++) {   
        faggotplus.click();
        LOGGER.info("Click on  faggotplus icon");
        AllureUtils.logStep("Click on faggotplus icon");    
        }
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "additional2");
        

        WebElement submit = driver.findElement(mobileLocators.submitick);
        submit.click();
          // Log console message to Allure
        LOGGER.info("Click on submit");
        AllureUtils.logStep("Click on submit");
        AllureUtils.captureScreenshot(driver, "submit");
        
        /*****************************/
        
        
         // Locate the element related to breakfast + icon 
        WebElement breakfastplus2     = driver.findElement(mobileLocators.plusadd);
        breakfastplus2.click();
        LOGGER.info("click on  breakfastplus2");
        AllureUtils.logStep("click on  breakfastplus2");    
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Fuel131");
        
       //click on keypad Done button to hide keypad
        WebElement keypaddone3    = driver.findElement(mobileLocators.doneclick);
        keypaddone3.click();
        LOGGER.info("Click on Done ");
        AllureUtils.logStep("Click on done");       
        
        // Click on fuel search field 
        WebElement additionalfuel2 = driver.findElement(mobileLocators.additionalsearch);
        additionalfuel2.click();
        LOGGER.info("click on   additionalfuel2");
        AllureUtils.logStep("click on   additionalfuel2");    
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, " additionalfuel2");
        
//        WebElement searchtext11    = driver.findElement(AppiumBy.iOSNsPredicateString("label == \"M\""));
//        searchtext11.click();
//        
//        WebElement searchtext21    = driver.findElement(AppiumBy.iOSNsPredicateString("label == \"e\""));
//        searchtext21.click();
//        
//        WebElement searchtext31    = driver.findElement(AppiumBy.iOSNsPredicateString("label == \"a\""));
//        searchtext31.click();
//
//
//        WebElement searchtext41    = driver.findElement(AppiumBy.iOSNsPredicateString("label == \"t\""));
//        searchtext41.click();
        additionalfuel2.sendKeys(mobileTestData.food2);
        
//        WebElement Keypaddone1    = driver.findElement(mobileLocators.doneclick);
//        Keypaddone1.click();
//        LOGGER.info("Enter value for search , Click on Done ");
//        AllureUtils.logStep("Enter value for search , Click on Done");  
//        // Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "additional4");
        
        
        WebElement fuelselection1    = driver.findElement(mobileLocators.meat);
        fuelselection1.click();
        LOGGER.info("click on   fuelselection1");
        AllureUtils.logStep("click on   fuelselection1");    
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuelselection1");
        
        Thread.sleep(3000);
        // Method to scroll to perform screen
        HashMap<String,Object>scrollObject57 =new HashMap<>();
        scrollObject57.put("direction", "down");
        scrollObject57.put("meatplus", "meatplus");
        driver.executeScript("mobile:scroll", scrollObject57);
        Thread.sleep(2000);
           
        WebElement meatclickplus        = driver.findElement(mobileLocators.meatplus);
        int numberOfClicks21 = 1;
        for (int i = 0; i < numberOfClicks21; i++) {   
            meatclickplus.click();
             LOGGER.info("click on   meatclickplus");
             AllureUtils.logStep("click on   meatclickplus");    
             // Capture a screenshot and attach it to Allure
             AllureUtils.captureScreenshot(driver, "meatclickplus");
        }
        
        WebElement fuelsearch     = driver.findElement(mobileLocators.serchclick);
        fuelsearch.click();
        LOGGER.info("click on   fuelsearch");
        AllureUtils.logStep("click on   fuelsearch");    
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuelsearch");
        
        WebElement fuelsearch2     = driver.findElement(mobileLocators.serchclick);
        fuelsearch2.click();
        LOGGER.info("click on   fuelsearch2");
        AllureUtils.logStep("click on   fuelsearch2");    
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuelsearch2");
        
//        WebElement searchtext71    = driver.findElement(AppiumBy.iOSNsPredicateString("label == \"R\""));
//        searchtext71.click();
//        
//        WebElement searchtext51    = driver.findElement(AppiumBy.iOSNsPredicateString("label == \"o\""));
//        searchtext51.click();
//        
//        WebElement searchtext61    = driver.findElement(AppiumBy.iOSNsPredicateString("label == \"o\""));
//        searchtext61.click();
//
//        WebElement searchtext81    = driver.findElement(AppiumBy.iOSNsPredicateString("label == \"t\""));
//        searchtext81.click();
        
        fuelsearch2.sendKeys(mobileTestData.food3);
        
        WebElement Keypaddone2    = driver.findElement(mobileLocators.doneclick);
        Keypaddone2.click();
        // Log console message to Allure
        LOGGER.info("Click on Keypaddone2, Enter text to search");
        AllureUtils.logStep("Click on Keypaddone2, Enter text to search");    
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Keypaddone2");
        
        
//        WebElement Showmore        = driver.findElement(mobileLocators.Showclick1);
//        Showmore.click();
//        // Log console message to Allure
//        LOGGER.info("Click on Showmore");
//        AllureUtils.logStep("Click on Showmore");    
//        // Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "Showmore");
        
        WebElement Fuelselection3    = driver.findElement(mobileLocators.Beetroot);
        Fuelselection3.click();
        // Log console message to Allure
        LOGGER.info("Click on Fuelselection3");
        AllureUtils.logStep("Click on Fuelselection3");    

        
        //selection of category list 
        // Click on timer 
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
               
        Thread.sleep(2500);
        WebElement submit1 = driver.findElement(mobileLocators.submitick);
        submit1.click();
          // Log console message to Allure
        LOGGER.info("Click on submit");
        AllureUtils.logStep("Click on submit");
        AllureUtils.captureScreenshot(driver, "submit");
          
    
        Thread.sleep(2500);
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "additional6");


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

