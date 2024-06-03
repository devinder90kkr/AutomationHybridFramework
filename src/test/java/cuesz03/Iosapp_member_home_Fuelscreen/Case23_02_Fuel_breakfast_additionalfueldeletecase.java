package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AllureUtils;
import cuesz.utils.AppiumappUtils;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
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

	
	private By Homeclick 		= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By plusadd			= 		AppiumBy.accessibilityId("BreakfastAddIcon");
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
    @Description("Member Fuel screen detail verificationfor addtional")
    @Story("Scroll to Fuel card and check additional fuel for breakfast.")	
	public void Homescreen() throws InterruptedException{
		try {
		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
		
		WebElement Homeicon = driver.findElement(Homeclick);
		Homeicon.click();
		// Log console message to Allure
        LOGGER.info("Click on Homeicon fuel");
        AllureUtils.logStep("Click on Homeicon fuel");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "additionalfueldeletecase1");
        
        Thread.sleep(3000);
		
		Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject =new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("Perform Fuel Mindful Restore", "Perform");
		driver.executeScript("mobile:scroll", scrollObject);
		// Log console message to Allure
        LOGGER.info("Scroll to Fuel");
        AllureUtils.logStep("Scroll to Fuel");
		Thread.sleep(2000);

        //Click on Fuel tab 
        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();
        // Log console message to Allure
        LOGGER.info("Click on fuel screen");
        AllureUtils.logStep("Click on fuel screen");
        AllureUtils.captureScreenshot(driver, "Case223_021");
        
        
        // Locate the element related to breakfast + icon 
        WebElement breakfastplus 	= driver.findElement(plusadd);
        breakfastplus.click();
        // Log console message to Allure
        LOGGER.info("Click on breakfastplus");
        AllureUtils.logStep("Click on breakfastplus");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "additionalfueldeletecase2");
        
       //click on keypad Done button to hide keypad
        WebElement keypaddone	= driver.findElement(doneclick);
        keypaddone.click();
        // Log console message to Allure
        LOGGER.info("Click on Done");
        AllureUtils.logStep("Click on done");
               
        
        
        // Click on fuel search field 
        WebElement additionalfuel = driver.findElement(additionalsearch);
        additionalfuel.click();
        // Log console message to Allure
        LOGGER.info("Click on additionalfuel");
        AllureUtils.logStep("Click on additionalfuel");
        AllureUtils.captureScreenshot(driver, "Case223_022");
        
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
        LOGGER.info("Enter values for search , Click on Done");
        AllureUtils.logStep("Enter values for search , Click on Done");
        
        Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject57 =new HashMap<>();
		scrollObject57.put("direction", "down");
		scrollObject57.put("fish", "fish");
		driver.executeScript("mobile:scroll", scrollObject57);
		Thread.sleep(2000);
        
        
        WebElement fuelselection	= driver.findElement(fish);
        fuelselection.click();
        // Log console message to Allure
        LOGGER.info("Click on fuelselection");
        AllureUtils.logStep("Click on fuelselection");
        Thread.sleep(2500);
        AllureUtils.captureScreenshot(driver, "Case223_027");
		
        WebElement fueldelete	= driver.findElement(fishRemove);
        fueldelete.click();
        // Log console message to Allure
        LOGGER.info("Click on fueldelete");
        AllureUtils.logStep("Click on fueldelete");
        Thread.sleep(2500);
        AllureUtils.captureScreenshot(driver, "Case223_028");
        
        // Click on fuel search field 
        WebElement additionalfuel2 = driver.findElement(additionalsearch);
        additionalfuel2.click();
        // Log console message to Allure
        LOGGER.info("Click on additionalfuel2");
        AllureUtils.logStep("Click on additionalfuel2");
        AllureUtils.captureScreenshot(driver, "Case223_029");
        
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
        
        WebElement brandedShowmore	= driver.findElement(Showclick);
        brandedShowmore.click();
        // Log console message to Allure
        LOGGER.info("Click on brandedShowmore");
        AllureUtils.logStep("Click on brandedShowmore");
        AllureUtils.captureScreenshot(driver, "Case223_033");
        
        
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
        AllureUtils.captureScreenshot(driver, "Case223_034");
        
        WebElement submit1 = driver.findElement(submitick);
		submit1.click();
		 // Log console message to Allure
        LOGGER.info("Click on submit1");
        AllureUtils.logStep("Click on submit1");
        AllureUtils.captureScreenshot(driver, "Case223_035");
        
		
		
		
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
	            driver.terminateApp("com.cuesz.mobile");
	        }
	    }
	

	// Function to check if an element is present on the screen
		public boolean isElementPresent(AppiumDriver driver, By by){
		    try{
		        driver.findElement(by);
		        return true;
		    } catch (NoSuchElementException e){
		        return false;
		    }
		}

	
}
	
