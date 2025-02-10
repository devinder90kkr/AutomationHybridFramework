package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.mobile.resources.CustomFoodScreenUtils;
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

@Epic ("Fuel custom screen detail ")
@Feature ("Verify Fuel detail functionlaity related to Custom fuel.")
public class Case39_Fuel_Latesnacks_customfood extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case39_Fuel_Latesnacks_customfood .class);
	
//	private By submittick		=		AppiumBy.accessibilityId("ItemSubmit");
//	private By latesnack		= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"Late Snacks\"`][2]");

	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
	@Description("Custom Fuel screen detail verification")
    @Story("Scroll to Fuel card and verify custom food latesnacks.")
	public void Fuel_Latesnacks_customfood() throws InterruptedException{
		try {
			 // Initialize utility class
	        CustomFoodScreenUtils utils = new CustomFoodScreenUtils(driver);	
			// Create an instance of AppiumUtils and pass the driver
			AppiumappUtils appiumUtils = new AppiumappUtils(driver);
	        // Launch the app using the utility method
//	        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
			 appiumUtils.launchAppWithPackageId(mobileTestData.bundelID);
			
			WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
			Homeicon.click();
			// Log console message to Allure
			LOGGER.info("Click on home menu from bottom");
			AllureUtils.logStep("Click on home menu from bottom");
			// Capture a screenshot and attach it to Allure
			AllureUtils.captureScreenshot(driver, "Case26_1");
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
	        AllureUtils.captureScreenshot(driver, "Case26_2");
	        
	        
	        // Locate the element related to breakfast + icon 
	        WebElement breakfastplus 	= driver.findElement(mobileLocators.lateSnackplus);
	        breakfastplus.click();
	        // Log console message to Allure
	        LOGGER.info("Click on breakfastplus icon");
	        AllureUtils.logStep("Click on breakfastplus icon");
	        AllureUtils.captureScreenshot(driver, "Case26_3");
	        
	        
	        //click on keypad Done button to hide keypad
	        WebElement keypaddone	= driver.findElement(mobileLocators.doneclick);
	        keypaddone.click();
	        // Log console message to Allure
	        LOGGER.info("Click on keypaddone icon");
	        AllureUtils.logStep("Click on keypaddone icon");
	        AllureUtils.captureScreenshot(driver, "Case26_4");
	        
	        
	    // Call the utility method
	    String searchText = mobileTestData.searchText;
	    utils.addCustomFood(searchText);    
//        
//        WebElement Latesnack	= driver.findElement(mobileLocators.latesnack);
//        Latesnack.click();
//        // Log console message to Allure
//        LOGGER.info(" Click on Latesnack");
//        AllureUtils.logStep("Click on fuelLatesnackselection3");
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

	    
        WebElement editsubmit 	= driver.findElement(mobileLocators.latesncaktick);
		editsubmit.click();
		// Log console message to Allure
        LOGGER.info("Click on editsubmit");
        AllureUtils.logStep("Click on editsubmit");
        AllureUtils.captureScreenshot(driver,"39_17");
        
		 scroll("down", "Lunch");
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
	
	 private void scroll(String direction, String elementName) {
	        HashMap<String, Object> scrollObject = new HashMap<>();
	        scrollObject.put("direction", direction);
	        scrollObject.put(elementName, elementName);
	        driver.executeScript("mobile:scroll", scrollObject);
	    }

}
	