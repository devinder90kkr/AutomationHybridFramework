package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
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
	
	private By Homeclick 		= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By plusadd			= 		AppiumBy.accessibilityId("DinnerAddIcon");
	private By doneclick		= 		AppiumBy.accessibilityId("Done");
	private By additionalsearch	= 		AppiumBy.accessibilityId("AdditionalFuelSearch");
	private By fish				= 		AppiumBy.iOSNsPredicateString("name == \"Fish\"");
	private By fishRemove		=		AppiumBy.accessibilityId("FishFuelItemDelete");
	private By Showclick		= 		AppiumBy.iOSNsPredicateString("name == \"Show More\"");
	private By Cheesegoat		= 		AppiumBy.accessibilityId("Goat Cheese");
	private By submitick		= 		AppiumBy.accessibilityId("ItemSubmit");
	
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
		
		WebElement Homeicon = driver.findElement(Homeclick);
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
        WebElement breakfastplus 	= driver.findElement(plusadd);
        breakfastplus.click();
        // Log console message to Allure
        LOGGER.info("Click on breakfastplus");
        AllureUtils.logStep("Click on breakfastplus");
        AllureUtils.captureScreenshot(driver,"44_3");
        
       //click on keypad Done button to hide keypad
        WebElement keypaddone	= driver.findElement(doneclick);
        keypaddone.click();
        // Log console message to Allure
        LOGGER.info("Click on keypaddone");
        AllureUtils.logStep("Click on keypaddone");
        AllureUtils.captureScreenshot(driver,"44_4");
        
        // Click on fuel search field 
        WebElement additionalfuel = driver.findElement(additionalsearch);
        additionalfuel.click();
        // Log console message to Allure
        LOGGER.info("Click on additionalfuel");
        AllureUtils.logStep("Click on additionalfuel");
        AllureUtils.captureScreenshot(driver,"44_5");
        
        WebElement searchtext1	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"F\""));
        searchtext1.click();
        
        WebElement searchtext2	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"i\""));
        searchtext2.click();
        
        WebElement searchtext3	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"s\""));
        searchtext3.click();

        WebElement searchtext4	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"h\""));
        searchtext4.click();

        WebElement Keypaddone	= driver.findElement(doneclick);
        Keypaddone.click();
        
        // Log console message to Allure
        LOGGER.info("Enter values for search, Click on Done");
        AllureUtils.logStep("Enter values for search, Click on done");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case44_6");
        		
        // Capture a screenshot and attach it to Allure
	    AllureUtils.captureScreenshot(driver, "Dinner14");
        
        
        WebElement fuelselection	= driver.findElement(fish);
        fuelselection.click();
        // Log console message to Allure
        LOGGER.info("Click on fuelselection");
        AllureUtils.logStep("Click on fuelselection");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case44_7");
        
        WebElement fueldelete	= driver.findElement(fishRemove);
        fueldelete.click();
        // Log console message to Allure
        LOGGER.info("Click on fueldelete");
        AllureUtils.logStep("Click on fueldelete");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case44_8");
        
        // Click on fuel search field 
        WebElement additionalfuel2 = driver.findElement(additionalsearch);
        additionalfuel2.click();
        // Log console message to Allure
        LOGGER.info("Click on additionalfuel2");
        AllureUtils.logStep("Click on additionalfuel2");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case44_9");
        
        WebElement searchtext11	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"G\""));
        searchtext11.click();
        
        WebElement searchtext21	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"o\""));
        searchtext21.click();
        
        WebElement searchtext31	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"a\""));
        searchtext31.click();
        
        WebElement Keypaddone1	= driver.findElement(doneclick);
        Keypaddone1.click();
        
        // Log console message to Allure
        LOGGER.info("Enter values for search, Click on Done");
        AllureUtils.logStep("Enter values for search, Click on done");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case44_10");
        		
        WebElement brandedShowmore	= driver.findElement(Showclick);
        brandedShowmore.click();        
        // Log console message to Allure
        LOGGER.info("Click on brandedShowmore");
        AllureUtils.logStep("Click on brandedShowmore");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case44_11");
        
     // Capture a screenshot and attach it to Allure
	    AllureUtils.captureScreenshot(driver, "Dinner15");
        
        
        Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject1 =new HashMap<>();
		scrollObject1.put("direction", "down");
		scrollObject1.put("Goat Cheese", "Goat Cheese");
		driver.executeScript("mobile:scroll", scrollObject1);
		
		WebElement fuelselection1	= driver.findElement(Cheesegoat);
        fuelselection1.click();
        // Log console message to Allure
        LOGGER.info("Click on fuelselection1");
        AllureUtils.logStep("Click on fuelselection1");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case44_12");
        
        
        
        //Click on dinner  
	     WebElement dinnerClick = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"Dinner\"`][2]"));
	     dinnerClick.click();
	     // Log console message to Allure
       LOGGER.info("Click on dinnerClick");
       AllureUtils.logStep("Click on dinnerClick");
        
        
        WebElement submit1 = driver.findElement(submitick);
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
	
