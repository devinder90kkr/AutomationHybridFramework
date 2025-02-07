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
@Feature ("Verify Fuel detail functionlaity related to additional fuel.")
public class Case44_Fuel_Dinner_additionalfueldeletecase extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case44_Fuel_Dinner_additionalfueldeletecase.class);
	
//	private By Homeclick 		= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
//	private By plusadd			= 		AppiumBy.accessibilityId("DinnerAddIcon");
//	private By doneclick		= 		AppiumBy.accessibilityId("Done");
//	private By additionalsearch	= 		AppiumBy.accessibilityId("AdditionalFuelSearch");
//	private By fish				= 		AppiumBy.iOSNsPredicateString("name == \"Fish\"");
//	private By fishRemove		=		AppiumBy.accessibilityId("FishFuelItemDelete");
//	private By Showclick		= 		AppiumBy.iOSNsPredicateString("name == \"Show More\"");
//	private By Cheesegoat		= 		AppiumBy.accessibilityId("Goat Cheese");
//	private By submitick		= 		AppiumBy.accessibilityId("ItemSubmit");
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Member Fuel screen detail verification for addtional")
    @Story("Scroll to Fuel card and check additional fuel for Dinner.")	
	public void Fuel_Dinner_additional() throws InterruptedException{
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
        AllureUtils.captureScreenshot(driver, "44_1");
		        
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
        AllureUtils.captureScreenshot(driver,"44_2");
        
        // Locate the element related to breakfast + icon 
        WebElement breakfastplus 	= driver.findElement(mobileLocators.dinnerplusicon);
        breakfastplus.click();
        // Log console message to Allure
        LOGGER.info("Click on breakfastplus");
        AllureUtils.logStep("Click on breakfastplus");
        AllureUtils.captureScreenshot(driver,"44_3");
        
       //click on keypad Done button to hide keypad
        WebElement keypaddone	= driver.findElement(mobileLocators.doneclick);
        keypaddone.click();
        // Log console message to Allure
        LOGGER.info("Click on keypaddone");
        AllureUtils.logStep("Click on keypaddone");
        AllureUtils.captureScreenshot(driver,"44_4");
        
        // Click on fuel search field 
        WebElement additionalfuel = driver.findElement(mobileLocators.additionalsearch);
        additionalfuel.click();
        // Log console message to Allure
        LOGGER.info("Click on additionalfuel");
        AllureUtils.logStep("Click on additionalfuel");
        AllureUtils.captureScreenshot(driver,"44_5");
               
        additionalfuel.sendKeys(mobileTestData.food19);
          
        //click on keypad Done button to hide keypad
        WebElement keypaddone11	= driver.findElement(mobileLocators.doneclick);
        keypaddone11.click();
        // Log console message to Allure
        LOGGER.info("Click on keypaddone icon");
        AllureUtils.logStep("Click on keypaddone icon");
        AllureUtils.captureScreenshot(driver, "Case26_4");
        		
        try {
            // Check if the food item exists in the history
//            WebElement foodHistoryItem = driver.findElement(AppiumBy.accessibilityId("Blueberry Timbit"));
            WebElement foodHistoryItem = driver.findElement(mobileLocators.butterclik);
            
            
            LOGGER.info("Food item 'Blueberry Timbit' found in the history.");

            // Click on the existing food item if clickable
            if (foodHistoryItem.isDisplayed() && foodHistoryItem.isEnabled()) {
                foodHistoryItem.click();
                AllureUtils.logStep("Clicked on 'Blueberry Timbit' from the history.");
            } else {
                LOGGER.warn("'Blueberry Timbit' is found but not clickable.");
            }

            // Click on 'fuelselection' after clicking on the foodHistoryItem
            WebElement fuelselection = driver.findElement(mobileLocators.butterclik);
            fuelselection.click();
            AllureUtils.logStep("Clicked on 'fuelselection' after 'Blueberry Timbit'.");
        } catch (NoSuchElementException e) {
            LOGGER.info("Food item 'Blueberry Timbit' not found in the history. Selecting fuel option instead.");

            // Click on 'fuelselection' as the food item doesn't exist in the history
            WebElement fuelselection = driver.findElement(mobileLocators.butterclik);
            fuelselection.click();
            AllureUtils.logStep("Clicked on 'fuelselection' to add a new food item.");
        }
        
        
        Thread.sleep(2000);
        // Click on timer 
        WebElement Timerclick 	= driver.findElement(mobileLocators.Time);
        Timerclick.click();
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
	// Log console message to Allure
	    LOGGER.info("Click on done icon");
	    AllureUtils.logStep("Click on done icon");

        
        WebElement submit1 = driver.findElement(mobileLocators.dinnerTickoption);
		submit1.click();
		// Log console message to Allure
        LOGGER.info("Click on submit1");
        AllureUtils.logStep("Click on submit1");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case44_13");
        
		Thread.sleep(4500);
		
		Thread.sleep(3500);
		// Method to scroll to early snack
		HashMap<String,Object>scrollObject53 =new HashMap<>();
		scrollObject53.put("direction", "down");
		scrollObject53.put("Dinner", "Dinner");
		driver.executeScript("mobile:scroll", scrollObject53);
		Thread.sleep(2000);

		
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
	
