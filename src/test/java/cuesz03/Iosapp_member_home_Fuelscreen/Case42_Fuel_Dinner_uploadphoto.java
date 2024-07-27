package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
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

@Epic ("Fuel upload screen functionlaity ")
@Feature ("Verify Upload detail functionlaity for dinner.")
public class Case42_Fuel_Dinner_uploadphoto extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case42_Fuel_Dinner_uploadphoto.class);
	
	private By Homeclick 				= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By uploadlunchimage		=		AppiumBy.accessibilityId("DinnerUploadIcon");
	private By gallery					=		AppiumBy.accessibilityId("GalleryClicked");
	private By Time						= 		AppiumBy.accessibilityId("SelectTime");
	private By pickerelement			= 		AppiumBy.xpath("//XCUIElementTypePickerWheel");
	private By Doneclick				= 		AppiumBy.accessibilityId("AlcohalTime");
	private By submittap				= 		AppiumBy.accessibilityId("SubmitImage");
	private By arrowclick				= 		AppiumBy.accessibilityId("RightArrow");
	private By Icondelete				= 		AppiumBy.accessibilityId("DeletePhoto");


	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Member check upload functionlaity verification")
    @Story("Scroll to Fuel card and upload image for dinner.")	
	public void Fuel_Dinner_uploadphoto() throws InterruptedException{
		try {
		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
		
		WebElement Homeicon = driver.findElement(Homeclick);
		Homeicon.click();
		// Log console message to Allure
		LOGGER.info("Click on home menu from bottom");
        AllureUtils.logStep("Click on home menu from bottom");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "42_1");
		        
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
        AllureUtils.captureScreenshot(driver,"42_2");
        
        
        WebElement uploadicon	= driver.findElement(uploadlunchimage);
        uploadicon.click();
        // Log console message to Allure
 		LOGGER.info("Click on uploadicon");
         AllureUtils.logStep("Click on uploadicon");
         // Capture a screenshot and attach it to Allure
         AllureUtils.captureScreenshot(driver, "42_3");
             
        WebElement galleryclick	= driver.findElement(gallery);
        galleryclick.click();
     // Log console message to Allure
 		LOGGER.info("Click on galleryclick");
         AllureUtils.logStep("Click on galleryclick");
         // Capture a screenshot and attach it to Allure
         AllureUtils.captureScreenshot(driver, "42_4");
             
        WebElement firstPhoto = driver.findElement(AppiumBy.xpath("//XCUIElementTypeImage[2]"));
        firstPhoto.click();
        
        WebElement addclick = driver.findElement(AppiumBy.accessibilityId("Add"));
        addclick.click();
     
        // Capture a screenshot and attach it to Allure
	      AllureUtils.captureScreenshot(driver, "Dinner9");
        
        // Click on timer 
        WebElement Timerclick 	= driver.findElement(Time);
        Timerclick.click();
        
        List<WebElement>values = driver.findElements(pickerelement);

		for (int i=0; i<values.size();i++)
		{		
		System.out.println(values.get(i).getText());
		}
		
		values.get(0).sendKeys("9");
		values.get(0).sendKeys(Keys.TAB);

		Thread.sleep(3500);
		values.get(1).sendKeys("20");
		values.get(1).sendKeys(Keys.TAB);
		
		Thread.sleep(3500);
		values.get(2).sendKeys("PM");
		
		// Log console message to Allure
		LOGGER.info("enter time ");
		AllureUtils.logStep("Enter time");    
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "Case42_time");
				
		driver.findElement(Doneclick).click();
		// Log console message to Allure
       LOGGER.info("Click on done icon");
       AllureUtils.logStep("Click on done icon");
	       
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "Dinner9");

		WebElement Submittap = driver.findElement(submittap);
		Submittap.click();
		// Log console message to Allure
        LOGGER.info("Click on Submittap");
        AllureUtils.logStep("Click on Submittap");
        AllureUtils.captureScreenshot(driver,"42_5");
        
        
		Thread.sleep(4500);
		
		
//		WebElement uploadicon1	= driver.findElement(uploadlunchimage);
//	    uploadicon1.click();
//	    // Log console message to Allure
//        LOGGER.info("Click on uploadicon1");
//        AllureUtils.logStep("Click on uploadicon1");
//        AllureUtils.captureScreenshot(driver,"42_6");
//        
//        
////	    WebElement photoicon	= driver.findElement(uploadphoto);
////	    photoicon.click();
//	   
//	    WebElement galleryclick2	= driver.findElement(gallery);
//        galleryclick2.click();
//        // Log console message to Allure
//        LOGGER.info("Click on galleryclick2");
//        AllureUtils.logStep("Click on galleryclick2");
//        AllureUtils.captureScreenshot(driver,"42_7");
//        
//        
//        WebElement firstPhoto2 = driver.findElement(AppiumBy.xpath("//XCUIElementTypeImage[3]"));
//        firstPhoto2.click();
//        
//        WebElement addclick2 = driver.findElement(AppiumBy.accessibilityId("Add"));
//        addclick2.click();
//        
//        
//        // Click on timer 
//        WebElement Timerclick2 	= driver.findElement(Time);
//        Timerclick2.click();
//        
//        List<WebElement>values1 = driver.findElements(pickerelement);
//
//		for (int i=0; i<values1.size();i++)
//		{		
//		System.out.println(values1.get(i).getText());
//		}
//		
//		values1.get(0).sendKeys("9");
//		values1.get(0).sendKeys(Keys.TAB);
//
//		Thread.sleep(3500);
//		values1.get(1).sendKeys("43");
//		values1.get(1).sendKeys(Keys.TAB);
//		
//		Thread.sleep(3500);
//		values1.get(2).sendKeys("PM");
//
//		driver.findElement(Doneclick).click();
//        
//		WebElement Submittap1 = driver.findElement(submittap);
//		Submittap1.click();
//		// Log console message to Allure
//        LOGGER.info("Click on Submittap1");
//        AllureUtils.logStep("Click on Submittap1");
//        AllureUtils.captureScreenshot(driver,"42_8");
//        
//		
//		Thread.sleep(4500);
//	
//		WebElement uploadicon2	= driver.findElement(uploadlunchimage);
//	    uploadicon2.click();
//	    // Log console message to Allure
//        LOGGER.info("Click on uploadicon2");
//        AllureUtils.logStep("Click on uploadicon2");
//        AllureUtils.captureScreenshot(driver,"42_9");
//        
//	    // Capture a screenshot and attach it to Allure
//	    AllureUtils.captureScreenshot(driver, "Dinner10");
//        
//	    //locate and click on toggel arrow 
//	    WebElement arrowright	= driver.findElement(arrowclick);
//	    arrowright.click();
//	    // Log console message to Allure
//        LOGGER.info("Click on arrowright");
//        AllureUtils.logStep("Click on arrowright");
//        AllureUtils.captureScreenshot(driver,"42_10");
//        
//	    //Locate and click on delete icon
//	    WebElement deleticon	= driver.findElement(Icondelete);
//	    deleticon.click();
//	    // Log console message to Allure
//        LOGGER.info("Click on deleticon");
//        AllureUtils.logStep("Click on deleticon");
//        AllureUtils.captureScreenshot(driver,"42_11");
//        
//	    Thread.sleep(4500);
//	    
//	    Thread.sleep(3000);
//		// Method to scroll to perform screen
//		HashMap<String,Object>scrollObject1 =new HashMap<>();
//		scrollObject1.put("direction", "down");
//		scrollObject1.put("Image uploaded", "Image uploaded");
//		driver.executeScript("mobile:scroll", scrollObject1);
//		Thread.sleep(2000);
	    
	    
        
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
	            driver.terminateApp("com.cuesz.mobile");
	        }
	    }
}