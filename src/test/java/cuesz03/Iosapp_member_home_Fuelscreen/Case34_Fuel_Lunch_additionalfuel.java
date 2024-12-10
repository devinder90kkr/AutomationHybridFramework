package cuesz03.Iosapp_member_home_Fuelscreen;

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
@Feature ("Verify Fuel detail functionlaity related to lunch addtional fuel.")
public class Case34_Fuel_Lunch_additionalfuel extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case34_Fuel_Lunch_additionalfuel.class);
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Member Fuel screen detail verification")
    @Story("Scroll to Fuel card and verify lunch addtional for member ")	
	public void Fuel_Lunch_additionalfuel() throws InterruptedException{
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
 		AllureUtils.captureScreenshot(driver, "Case34_1");
		
		
		Thread.sleep(3000);
		
		scroll("down", "Perform");
		Thread.sleep(2000);

        //Click on Fuel tab 
        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();
        // Log console message to Allure
        LOGGER.info("Click on fuel screen");
        AllureUtils.logStep("Click on fuel screen");
        AllureUtils.captureScreenshot(driver, "Case34_2");
       
        Thread.sleep(3500);
        // Scroll to "Early Snacks" element if it's not present on the screen
        By lunchLocator = AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Lunch\"`][1]");
        if (!isElementPresent(driver, lunchLocator)) {
            // Scroll to "Early Snacks" if it's not present
            HashMap<String, Object> scrollObject1 = new HashMap<>();
            scrollObject1.put("direction", "down");
            scrollObject1.put("Lunch", "Lunch");
            driver.executeScript("mobile:scroll", scrollObject1);
            Thread.sleep(2000);
        }
        
        // Locate the element related to breakfast + icon 
        WebElement lunchplus 	= driver.findElement(mobileLocators.lunchplusicon);
        lunchplus.click();
        // Log console message to Allure
        LOGGER.info("Click on lunchplus");
        AllureUtils.logStep("Click on lunchplus");
        AllureUtils.captureScreenshot(driver, "Case34_3");
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone	= driver.findElement(mobileLocators.doneclick);
        keypaddone.click();
        // Log console message to Allure
        LOGGER.info("Click on keypaddone");
        AllureUtils.logStep("Click on keypaddone");
        AllureUtils.captureScreenshot(driver, "Case34_4");
        
        // Click on fuel search field 
        WebElement additionalfuel = driver.findElement(mobileLocators.additionalsearch);
        additionalfuel.click();
        // Log console message to Allure
        LOGGER.info("Click on additionalfuel");
        AllureUtils.logStep("Click on additionalfuel");
        AllureUtils.captureScreenshot(driver, "Case34_5");
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "lunchadd1");
          
//        WebElement searchtext1	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"M\""));
//        searchtext1.click();
//        
//        WebElement searchtext2	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"e\""));
//        searchtext2.click();
//        
//        WebElement searchtext3	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"a\""));
//        searchtext3.click();
//        
//        WebElement searchtext4	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"t\""));
//        searchtext4.click();
        additionalfuel.sendKeys(mobileTestData.food10);
        
 
        WebElement Keypaddone	= driver.findElement(mobileLocators.doneclick);
        Keypaddone.click();
        // Log console message to Allure
        LOGGER.info("Enter values for search, Click on Done");
        AllureUtils.logStep("Enter values for search, Click on done");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case34_7");
        
        WebElement brandedshowmore	= driver.findElement(mobileLocators.showmorebutton);
        brandedshowmore.click();
        // Log console message to Allure
        LOGGER.info("Click on brandedshowmore");
        AllureUtils.logStep("Click on brandedshowmore");
        AllureUtils.captureScreenshot(driver, "Case34_8");
        
        
        WebElement fuelselection	= driver.findElement(mobileLocators.stewmeat);
        fuelselection.click();
        // Log console message to Allure
        LOGGER.info("Click on fuelselection");
        AllureUtils.logStep("Click on fuelselection");
        AllureUtils.captureScreenshot(driver, "Case34_9");
        
        Thread.sleep(4500);
        
        // Click on timer 
        WebElement Timerclick 	= driver.findElement(mobileLocators.Time);
        Timerclick.click();
        List<WebElement>values = driver.findElements(mobileLocators.pickerelement);
		for (int i=0; i<values.size();i++)
		{		
		System.out.println(values.get(i).getText());
		}
		values.get(0).sendKeys("01");
		values.get(0).sendKeys(Keys.TAB);
		Thread.sleep(3500);
		values.get(1).sendKeys("03");
		values.get(1).sendKeys(Keys.TAB);
		Thread.sleep(3500);
		values.get(2).sendKeys("PM");
		driver.findElement(mobileLocators.Doneclick).click();
		// Log console message to Allure
		LOGGER.info("enter time ");
		AllureUtils.logStep("Enter time");    
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "Case34_10");
        
    	WebElement submit = driver.findElement(mobileLocators.lunchsubmittick);
		submit.click();
		// Log console message to Allure
        LOGGER.info("Click on submit");
        AllureUtils.logStep("Click on submit");
        AllureUtils.captureScreenshot(driver, "Case34_11");
        

		scroll("down", "Lunch");
		Thread.sleep(2000);
		
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "lunchadd21");
        
		  // Locate the element related to breakfast + icon 
        WebElement breakfastplus2 	= driver.findElement(mobileLocators.lunchplusicon);
        breakfastplus2.click();
        // Log console message to Allure
        LOGGER.info("Click on breakfastplus2");
        AllureUtils.logStep("Click on breakfastplus2");
        AllureUtils.captureScreenshot(driver, "Case34_12");
        
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone2	= driver.findElement(mobileLocators.doneclick);
        keypaddone2.click();
        // Log console message to Allure
        LOGGER.info("Click on keypaddone2");
        AllureUtils.logStep("Click on keypaddone2");
        AllureUtils.captureScreenshot(driver, "Case34_13");
        
        // Click on fuel search field 
        WebElement additionalfuel2 = driver.findElement(mobileLocators.additionalsearch);
        additionalfuel2.click();
//        
//        WebElement searchtext11	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"K\""));
//        searchtext11.click();
//        
//        WebElement searchtext12	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"i\""));
//        searchtext12.click();
//        
//        WebElement searchtext13	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"w\""));
//        searchtext13.click();
//        
//        WebElement searchtext14	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"i\""));
//        searchtext14.click();
        additionalfuel2.sendKeys(mobileTestData.food11);
        
        WebElement Keypaddone2	= driver.findElement(mobileLocators.doneclick);
        Keypaddone2.click();
        // Log console message to Allure
        LOGGER.info("Enter values for search, Click on Done");
        AllureUtils.logStep("Enter values for search, Click on done");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case34_14");
        Thread.sleep(3500);

        WebElement fuelselection2	= driver.findElement(mobileLocators.kiwifuelselection);
        fuelselection2.click();
        // Log console message to Allure
        LOGGER.info("Click on fuelselection2");
        AllureUtils.logStep("Click on fuelselection2");
        AllureUtils.captureScreenshot(driver, "Case34_15");
        
        Thread.sleep(3500);
        WebElement submit2 = driver.findElement(mobileLocators.lunchsubmittick);
		submit2.click();
		// Log console message to Allure
        LOGGER.info("Click on submit2");
        AllureUtils.logStep("Click on submit2");
        AllureUtils.captureScreenshot(driver, "Case34_16");
        
        
////		Thread.sleep(4500);
//////		
////		 // Edit feature testing
////        WebElement editstewmeat		= driver.findElement(mobileLocators.editstewmeat);
////        editstewmeat.click();
////        // Log console message to Allure
////        LOGGER.info("Click on editstewmeat");
////        AllureUtils.logStep("Click on editstewmeat");
////        AllureUtils.captureScreenshot(driver, "Case34_17");
////        
////        
////        WebElement plusclick	= driver.findElement(mobileLocators.editclick1);
////        int numberOfClicks = 2;
////        for (int i = 0; i < numberOfClicks; i++) {   
////        	plusclick.click();
////        	// Log console message to Allure
////            LOGGER.info("Click on plusclick");
////            AllureUtils.logStep("Click on plusclick");
////            AllureUtils.captureScreenshot(driver, "Case34_18");
////            
////        }
////        
////        // Capture a screenshot and attach it to Allure
////        AllureUtils.captureScreenshot(driver, "lunchadd4");
////        //Click on notes and enter values in field. 
////        WebElement noteedit1 = driver.findElement(mobileLocators.noteclick);
////        noteedit1.sendKeys(mobileTestData.message3);
////        // Log console message to Allure
////        LOGGER.info("Enter values for noteedit1");
////        AllureUtils.logStep("Enter values for noteedit1");
////        AllureUtils.captureScreenshot(driver, "Case34_182");
////        
////        
////        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"DONE\"]")).click();
////
////        Thread.sleep(3000);
////		
////        scroll("down", "Source");
////        // Method to scroll to perform screen
////		Thread.sleep(2000);
////        
////		
////		WebElement editsubmit 	= driver.findElement(mobileLocators.lunchsubmittick);
////		editsubmit.click();
////		// Log console message to Allure
////        LOGGER.info("Click on editsubmit");
////        AllureUtils.logStep("Click on editsubmit");
////        AllureUtils.captureScreenshot(driver, "Case34_19");
////        
//
//		
//		// Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "lunchadd5");
//        Thread.sleep(3500);
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
        
   	 // Function to check if an element is present on the screen
   	    public boolean isElementPresent(AppiumDriver driver, By by) {
   	        try {
   	            driver.findElement(by);
   	            return true;
   	        } catch (NoSuchElementException e) {
   	            return false;
   	        }
   	    }
   	}
   	 


   	
