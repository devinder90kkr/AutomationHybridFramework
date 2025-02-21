//https://chat.openai.com/share/f592ab35-529c-4434-a989-5fac7039696c
package cuesz04.Iosapp_member_home_Fuelscreen.Uploadphotocases.perform.pending;

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
import cuesz.mobile.resources.mobilelement;
import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import cuesz03.Iosapp_member_home_Fuelscreen.recommendedcase.Case20_Fuel_optimalfuel;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Member add additional fuel from Additional Fuel Button at bottom")
@Feature ("Verify member able to add additional Fuel for all categories")
public class Case51_Fuel_AdditionalfuelcaseforAll extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case20_Fuel_optimalfuel.class);
	mobileLocators locators = new mobileLocators();	

	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
	@Description("Member scroll to additional fuel button and than add fuel corresponding to each categories")
    @Story("Scroll to additional fuel and add breakfast to Dinner values")
	public void fueladditonalfuels() throws InterruptedException {	
try {
		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
//        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
		 appiumUtils.launchAppWithPackageId(mobileTestData.bundelID);
				
        // Click on Home-icon
        mobilelement.clickElement(driver, mobileLocators.Homeclick);
        // Log console message to Allure
        LOGGER.info("Click on Homeclick");
        AllureUtils.logStep("Click on Homeclick");
        
  
		// scroll-down to perform fuel mind-full restore label
		mobilelement.scrollDownToElement(driver, "Perform Fuel Mindful Restore");
		 // Log console message to Allure
        LOGGER.info("Scrolldown to fuelcard");
        AllureUtils.logStep("Scrolldown to fuelcard");
		
	
        //Click on Fuel tab 
        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();
        // Log console message to Allure
        LOGGER.info("Click on FUEL_SCREEN");
        AllureUtils.logStep("Click on FUEL_SCREEN");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case22_Fuel_breakfast_additionalfuel2");
        
        // Locate the element related to breakfast + icon 
        WebElement additionalfuelbutton    = driver.findElement(mobileLocators.addtionafuelbttn);
        additionalfuelbutton.click();
        // Log console message to Allure
        LOGGER.info("Click on additionalfuelbutton");
        AllureUtils.logStep("Click on additionalfuelbutton");
        AllureUtils.captureScreenshot(driver, "additionalfuelbutton");
        
        
       //click on keypad Done button to hide keypad
        WebElement keypaddone    = driver.findElement(mobileLocators.doneclick);
        keypaddone.click();
        // Log console message to Allure
        LOGGER.info("Click on Done");
        AllureUtils.logStep("Click on done");
        
        Thread.sleep(2500);
        //click on keypad Done button to hide keypad
        WebElement selectfuel    = driver.findElement(mobileLocators.selectfuel);
        selectfuel.click();
        // Log console message to Allure
        LOGGER.info("Click on selectfuel");
        AllureUtils.logStep("Click on selectfuel");
        
        Thread.sleep(2500);
        //click on keypad Done button to hide keypad
        WebElement earlycategoryoption    = driver.findElement(mobileLocators.earlycategoryoption);
        earlycategoryoption.click();
        // Log console message to Allure
        LOGGER.info("Click on earlycategoryoption");
        AllureUtils.logStep("Click on earlycategoryoption");
        
        
        // Click on fuel search field 
        WebElement additionalfuel = driver.findElement(mobileLocators.additionalsearch);
        additionalfuel.click();
        // Log console message to Allure
        LOGGER.info("Click on additionalfuel");
        AllureUtils.logStep("Click on additionalfuel");
        AllureUtils.captureScreenshot(driver, "additionalfuel_30");
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "earlysnack5");
        
        additionalfuel.sendKeys(mobileTestData.food25);
        
        WebElement Keypaddone	= driver.findElement(mobileLocators.doneclick);
        Keypaddone.click();
        
        Thread.sleep(3500);
        try {
            // Check if the food item exists in the history
//            WebElement foodHistoryItem = driver.findElement(AppiumBy.accessibilityId("Blueberry Timbit"));
            WebElement foodHistoryItem = driver.findElement(mobileLocators.grilledsnacks);
            
            
            LOGGER.info("Food item 'Blueberry Timbit' found in the history.");

            // Click on the existing food item if clickable
            if (foodHistoryItem.isDisplayed() && foodHistoryItem.isEnabled()) {
                foodHistoryItem.click();
                AllureUtils.logStep("Clicked on 'Blueberry Timbit' from the history.");
            } else {
                LOGGER.warn("'Blueberry Timbit' is found but not clickable.");
            }

            // Click on 'fuelselection' after clicking on the foodHistoryItem
            WebElement fuelselection = driver.findElement(mobileLocators.grilledsnacks);
            fuelselection.click();
            AllureUtils.logStep("Clicked on 'fuelselection' after 'Blueberry Timbit'.");
        } catch (NoSuchElementException e) {
            LOGGER.info("Food item 'Blueberry Timbit' not found in the history. Selecting fuel option instead.");

            // Click on 'fuelselection' as the food item doesn't exist in the history
            WebElement fuelselection = driver.findElement(mobileLocators.grilledsnacks);
            fuelselection.click();
            AllureUtils.logStep("Clicked on 'fuelselection' to add a new food item.");
        }
        
        Thread.sleep(2500);
        // Click on timer 
        WebElement Timerclick 	= driver.findElement(mobileLocators.Time);
        Timerclick.click();
        List<WebElement>values = driver.findElements(mobileLocators.pickerelement);
		for (int i=0; i<values.size();i++)
		{		
		System.out.println(values.get(i).getText());
		}
		values.get(0).sendKeys("11");
		values.get(0).sendKeys(Keys.TAB);
		Thread.sleep(3500);
		values.get(1).sendKeys("18");
		values.get(1).sendKeys(Keys.TAB);
		Thread.sleep(3500);
		values.get(2).sendKeys("AM");
		
		driver.findElement(mobileLocators.Doneclick).click();
		Thread.sleep(3000);        
    	WebElement submit = driver.findElement(mobileLocators.earlysnacksubmitick);
		submit.click();
		// Log console message to Allure
        LOGGER.info("Click on submit");
        AllureUtils.logStep("Click on submit");
        AllureUtils.captureScreenshot(driver, "submit_30");
        
        
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
//       driver.terminateApp("com.cuesz.mobile");
       driver.terminateApp(mobileTestData.bundelID);
   }
}
}