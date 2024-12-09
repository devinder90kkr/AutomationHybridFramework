package cuesz03.Iosapp_member_home_Fuelscreen.copy;

import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
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
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Fuel screen detail ")
@Feature ("Verify Fuel detail functionlaity related to Optimal fuel.")
public class Case23_01_Fuel_breakfast_editadditionalfuel extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case23_01_Fuel_breakfast_editadditionalfuel.class);
	
	
	


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
        LOGGER.info("Click on Homeicon");
        AllureUtils.logStep("Click on Homeicon");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Homeicon1");
		
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
        AllureUtils.captureScreenshot(driver, "Case23_Fuel_screen1");

//        // **New Scroll Action to Ensure the Edit Beetroot Element is Visible**
//        HashMap<String, Object> scrollToEditBeetroot = new HashMap<>();
//        scrollToEditBeetroot.put("direction", "down");
//        scrollToEditBeetroot.put("element", driver.findElement(mobileLocators.editbeetroot)); // Scroll until the element is visible
//        driver.executeScript("mobile:scroll", scrollToEditBeetroot);
//        Thread.sleep(2000);
        
        // Edit feature testing
        WebElement Editbeetroot		= driver.findElement(mobileLocators.editbeetroot);
        Editbeetroot.click();
        // Log console message to Allure
        LOGGER.info("Click on Editbeetroot");
        AllureUtils.logStep("Click on Editbeetroot");
        AllureUtils.captureScreenshot(driver, "Case23_Editbeetroot");

        
        WebElement plusclick	= driver.findElement(mobileLocators.editclick1);
        int numberOfClicks = 3;
        for (int i = 0; i < numberOfClicks; i++) {   
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

//        Thread.sleep(3000);
//		// Method to scroll to perform screen
//		HashMap<String,Object>scrollObject11 =new HashMap<>();
//		scrollObject11.put("direction", "down");
//		scrollObject11.put("Source", "Source");
//		
//		driver.executeScript("mobile:scroll", scrollObject11);
//		Thread.sleep(2000);
        
		WebElement editsubmit 	= driver.findElement(mobileLocators.submittick);
		editsubmit.click();
		// Log console message to Allure
        LOGGER.info("Click on editsubmit");
        AllureUtils.logStep("Click on editsubmit");
        AllureUtils.captureScreenshot(driver, "Case23_editsubmit");

		
		Thread.sleep(5000);
		
		/***************edit meat fuel*****************/
		//scroll to image upload
		By meatLocator = AppiumBy.accessibilityId("Meat");
	        if(!isElementPresent(driver, meatLocator)){
	            // Scroll to "Basketball" if it's not present
	            HashMap<String,Object> scrollObject1 = new HashMap<>();
	            scrollObject1.put("direction", "down");
	            scrollObject1.put("Meat", "Meat");
	            driver.executeScript("mobile:scroll", scrollObject1);
	            Thread.sleep(2000);
	        }
		
		
		WebElement meatedit		= driver.findElement(mobileLocators.meatfuel);
		meatedit.click();
		// Log console message to Allure
        LOGGER.info("Click on meatedit");
        AllureUtils.logStep("Click on meatedit");
        AllureUtils.captureScreenshot(driver, "Case23_meatedit");
		
		
		//Click on notes and enter values in field. 
        WebElement noteedit2 = driver.findElement(mobileLocators.noteclick);
        noteedit2.sendKeys("hello this notes is update by automation to verifiy edit field values");
        LOGGER.info("Enter value for note field");
        AllureUtils.logStep("Enter value for note field");
        
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"DONE\"]")).click();
       
        
        //Click on early snacks 
        WebElement whenclick3	= driver.findElement(mobileLocators.earlyclick);
        whenclick3.click();
        // Log console message to Allure
        LOGGER.info("Click on whenclick3");
        AllureUtils.logStep("Click on whenclick3");
        
        
        WebElement editsubmit2 	= driver.findElement(mobileLocators.submittick);
		editsubmit2.click();
		 // Log console message to Allure
        LOGGER.info("Click on editsubmit2");
        AllureUtils.logStep("Click on editsubmit2");
        AllureUtils.captureScreenshot(driver, "editsubmit2");
        
        
		Thread.sleep(4000);
		//scroll to image upload
		By meatLocator1 = AppiumBy.accessibilityId("Meat");
	        if(!isElementPresent(driver, meatLocator1)){
	            // Scroll to "Basketball" if it's not present
	            HashMap<String,Object> scrollObject1 = new HashMap<>();
	            scrollObject1.put("direction", "down");
	            scrollObject1.put("Meat", "Meat");
	            driver.executeScript("mobile:scroll", scrollObject1);
	            Thread.sleep(2000);
	        }

		Thread.sleep(3000);
		
		
		WebElement meatedit1		= driver.findElement(mobileLocators.meatfuel);
		meatedit1.click();
		// Log console message to Allure
        LOGGER.info("Click on meatedit1");
        AllureUtils.logStep("Click on meatedit1");
        AllureUtils.captureScreenshot(driver, "editsubmit122");
       

		 //Click on early snacks 
        WebElement whenclick4	= driver.findElement(mobileLocators.breakfastclick);
        whenclick4.click();
     // Log console message to Allure
        LOGGER.info("Click on whenclick4");
        AllureUtils.logStep("Click on whenclick4");
        AllureUtils.captureScreenshot(driver, "editsubmit542");
		
        WebElement editsubmit3 	= driver.findElement(mobileLocators.submittick);
		editsubmit3.click();
		// Log console message to Allure
        LOGGER.info("Click on editsubmit3");
        AllureUtils.logStep("Click on editsubmit3");
        AllureUtils.captureScreenshot(driver, "editsubmit265");

		Thread.sleep(2500);
		
		
		//scroll to image upload
		By breakfastLocator = AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Breakfast\"`][1]");
	        if(!isElementPresent(driver, breakfastLocator)){
	            // Scroll to "Basketball" if it's not present
	            HashMap<String,Object> scrollObject1 = new HashMap<>();
	            scrollObject1.put("direction", "up");
	            scrollObject1.put("Breakfast", "Breakfast");
	            driver.executeScript("mobile:scroll", scrollObject1);
	            Thread.sleep(2000);
	        }
		
//		// Method to scroll to perform screen
//		HashMap<String,Object>scrollObject3 =new HashMap<>();
//		scrollObject3.put("direction", "up");
//		scrollObject3.put("Breakfast", "Breakfast");
//		driver.executeScript("mobile:scroll", scrollObject3);

		 // Click on timer 
        WebElement breakfastedittime 	= driver.findElement(mobileLocators.editbreakfastime);
        breakfastedittime.click();
     // Log console message to Allure
        LOGGER.info("Click on breakfastedittime");
        AllureUtils.logStep("Click on breakfastedittime");
        AllureUtils.captureScreenshot(driver, "Case23_Fuel_breakfastedittime");
        
        List<WebElement>values = driver.findElements(mobileLocators.pickerelement);
		for (int i=0; i<values.size();i++)
		{		
		System.out.println(values.get(i).getText());
		}
		values.get(0).sendKeys("9");
		values.get(0).sendKeys(Keys.TAB);
		Thread.sleep(3500);
		values.get(1).sendKeys("08");
		values.get(1).sendKeys(Keys.TAB);
		Thread.sleep(3500);
		values.get(2).sendKeys("AM");
		driver.findElement(mobileLocators.Doneclick).click();
		// Log console message to Allure
        LOGGER.info("Click on Done");
        AllureUtils.logStep("Click on done");
       
		
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
//	            driver.terminateApp("com.cuesz.mobile");
	            driver.terminateApp(mobileTestData.bundelID);
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
	
