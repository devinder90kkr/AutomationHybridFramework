package cuesz03.Iosapp_member_home_Fuelscreen.Additionalcases;

import java.util.HashMap;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.mobile.resources.mobileLocators;
import cuesz.mobile.resources.mobileTestData;
import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import cuesz.utils.RetryUtils;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Fuel screen detail ")
@Feature ("Verify Fuel detail functionlaity related to additional fuel.")
public class Case23_02_Fuel_breakfast_additionalfueldeletecase extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case23_02_Fuel_breakfast_additionalfueldeletecase.class);
	@Test
	@Owner("QA")
	@Severity(SeverityLevel.NORMAL)
	@Description("Member Fuel screen detail verification for additional")
	@Story("Scroll to Fuel card and check additional fuel for breakfast.")
	public void Homescreen() throws InterruptedException {
	    try {
	        // Create an instance of AppiumUtils and pass the driver
	        AppiumappUtils appiumUtils = new AppiumappUtils(driver);
	        // Launch the app using the utility method
	        appiumUtils.launchAppWithPackageId(mobileTestData.bundelID);

	        RetryUtils.retryingFindClick(driver, mobileLocators.Homeclick, 3);
	        LOGGER.info("Click on Homeicon fuel");
	        AllureUtils.logStep("Click on Homeicon fuel");
	        AllureUtils.captureScreenshot(driver, "additionalfueldeletecase1");

	        Thread.sleep(3000);

	        // Scroll to Perform Fuel Mindful Restore
	        HashMap<String, Object> scrollObject = new HashMap<>();
	        scrollObject.put("direction", "down");
	        scrollObject.put("Perform Fuel Mindful Restore", "Perform");
	        driver.executeScript("mobile:scroll", scrollObject);
	        LOGGER.info("Scroll to Fuel");
	        AllureUtils.logStep("Scroll to Fuel");
	        Thread.sleep(2000);

	        RetryUtils.retryingFindClick(driver, AppiumBy.accessibilityId("FUEL_SCREEN"), 3);
	        LOGGER.info("Click on fuel screen");
	        AllureUtils.logStep("Click on fuel screen");
	        AllureUtils.captureScreenshot(driver, "Case223_021");

	        RetryUtils.retryingFindClick(driver, mobileLocators.plusadd, 3);
	        LOGGER.info("Click on breakfastplus");
	        AllureUtils.logStep("Click on breakfastplus");
	        AllureUtils.captureScreenshot(driver, "additionalfueldeletecase2");

	        RetryUtils.retryingFindClick(driver, mobileLocators.doneclick, 3);
	        LOGGER.info("Click on Done");
	        AllureUtils.logStep("Click on done");

	        RetryUtils.retryingFindClick(driver, mobileLocators.additionalsearch, 3);
	        LOGGER.info("Click on additionalfuel");
	        AllureUtils.logStep("Click on additionalfuel");
	        AllureUtils.captureScreenshot(driver, "Case223_022");

	        RetryUtils.retryingSendKeys(driver, mobileLocators.additionalsearch, mobileTestData.food4, 5);
	        RetryUtils.retryingFindClick(driver, mobileLocators.doneclick, 3);
	        LOGGER.info("Enter values for search, Click on Done");
	        AllureUtils.logStep("Enter values for search, Click on Done");

	        Thread.sleep(3000);
       
	        RetryUtils.retryingFindClick(driver, mobileLocators.fish, 5);
	        LOGGER.info("Click on fuelselection");
	        AllureUtils.logStep("Click on fuelselection");
	        Thread.sleep(2500);
	        AllureUtils.captureScreenshot(driver, "Case223_027");

	        RetryUtils.retryingFindClick(driver, mobileLocators.fishRemove, 3);
	        LOGGER.info("Click on fueldelete");
	        AllureUtils.logStep("Click on fueldelete");
	        Thread.sleep(2500);
	        AllureUtils.captureScreenshot(driver, "Case223_028");

	        RetryUtils.retryingFindClick(driver, mobileLocators.additionalsearch, 3);
	        LOGGER.info("Click on additionalfuel2");
	        AllureUtils.logStep("Click on additionalfuel2");
	        AllureUtils.captureScreenshot(driver, "Case223_029");

	        RetryUtils.retryingSendKeys(driver, mobileLocators.additionalsearch, mobileTestData.food5, 5);
	        RetryUtils.retryingFindClick(driver, mobileLocators.doneclick, 5);
	        LOGGER.info("Enter values for search, Click on Done");
	        AllureUtils.logStep("Enter values for search, Click on Done");

	        Thread.sleep(3000);	        
	        
	        try {
	            // Check if the food item exists in the history
	            WebElement foodHistoryItem = driver.findElement(AppiumBy.accessibilityId("Chevre Goat cheese"));
	            LOGGER.info("Food item 'Chevre Goat cheese' found in the history.");

	            // Click on the existing food item if clickable
	            if (foodHistoryItem.isDisplayed() && foodHistoryItem.isEnabled()) {
	                foodHistoryItem.click();
	                AllureUtils.logStep("Clicked on Chevre Goat cheese' from the history.");
	            } else {
	                LOGGER.warn("'Chevre Goat cheese' is found but not clickable.");
	            }

	            // Click on 'fuelselection' after clicking on the foodHistoryItem
	            WebElement fuelselection = driver.findElement(mobileLocators.chevrecheese);
	            fuelselection.click();
	            AllureUtils.logStep("Clicked on 'fuelselection' after 'Chevre Goat cheese' ");
	        } catch (NoSuchElementException e) 
	        {
	            LOGGER.info("Food item 'Chevre Goat cheese' not found in the history. Selecting fuel option instead.");

	            // Click on 'fuelselection' as the food item doesn't exist in the history
	            WebElement fuelselection = driver.findElement(mobileLocators.chevrecheese);
	            fuelselection.click();
	            AllureUtils.logStep("Clicked on 'fuelselection' to add a new food item.");
	        }

	                
	         //Click on submit tick button
	          WebElement submit = driver.findElement(mobileLocators.submitick);
	          submit.click();
	            // Log console message to Allure
	          LOGGER.info("Click on submit");
	          AllureUtils.logStep("Click on submit");
	          AllureUtils.captureScreenshot(driver, "submit");
	          
	        Thread.sleep(4500);

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
	        driver.terminateApp(mobileTestData.bundelID);
	    }
	}}
