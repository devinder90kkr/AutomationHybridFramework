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
@Feature ("Verify Fuel detail functionlaity related to early snacks fuel.")
public class Case30_Fuel_Earlysnacks_additionalfuel extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case30_Fuel_Earlysnacks_additionalfuel.class);
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Member Fuel screen detail verification")
    @Story("Scroll to Fuel card and verify early snacks ")	
	public void Fuel_Earlysnacks_additionalfuel() throws InterruptedException{
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
 		AllureUtils.captureScreenshot(driver, "Case30_1");	
		 		
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
        AllureUtils.captureScreenshot(driver, "Case30_2");
        Thread.sleep(3500);
                 
	    // Method to scroll to perform screen
		HashMap<String,Object>scrollObject12 =new HashMap<>();
		scrollObject12.put("direction", "down");
		scrollObject12.put("Early Snacks", "Early Snacks");
		driver.executeScript("mobile:scroll", scrollObject12);
		Thread.sleep(2000);
              
        // Locate the element related to breakfast + icon 
        WebElement earlysnackplus 	= driver.findElement(mobileLocators.earlysnacksplusadd);
        earlysnackplus.click();
        // Log console message to Allure
        LOGGER.info("Click on earlysnackplus");
        AllureUtils.logStep("Click on earlysnackplus");
        AllureUtils.captureScreenshot(driver, "earlysnackplus32");
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone	= driver.findElement(mobileLocators.doneclick);
        keypaddone.click();
        // Log console message to Allure
        LOGGER.info("Click on Doneclick ");
        AllureUtils.logStep("Click on Doneclick"); 
        
        // Click on fuel search field 
        WebElement additionalfuel = driver.findElement(mobileLocators.additionalsearch);
        additionalfuel.click();
        // Log console message to Allure
        LOGGER.info("Click on additionalfuel");
        AllureUtils.logStep("Click on additionalfuel");
        AllureUtils.captureScreenshot(driver, "additionalfuel_30");
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "earlysnack5");
        
        additionalfuel.sendKeys(mobileTestData.food8);
        
        WebElement Keypaddone	= driver.findElement(mobileLocators.doneclick);
        Keypaddone.click();
        
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
        
    	WebElement submit = driver.findElement(mobileLocators.earlysnacksubmitick);
		submit.click();
		// Log console message to Allure
        LOGGER.info("Click on submit");
        AllureUtils.logStep("Click on submit");
        AllureUtils.captureScreenshot(driver, "submit_30");
		
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
//		            driver.terminateApp("com.cuesz.mobile");
		            driver.terminateApp(mobileTestData.bundelID);
		        }
		    }
	}