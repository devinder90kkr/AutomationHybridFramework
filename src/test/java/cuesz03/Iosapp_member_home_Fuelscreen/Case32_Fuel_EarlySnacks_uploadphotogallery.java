package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import cuesz.utils.reporting.AllureUtils;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Fuel upload screen functionlaity ")
@Feature ("Verify Upload detail functionlaity for breakfast.")
public class Case32_Fuel_EarlySnacks_uploadphotogallery extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case32_Fuel_EarlySnacks_uploadphotogallery.class);
	
	private By Homeclick 				= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By uploadbreakfastimage		=		AppiumBy.accessibilityId("Early SnacksUploadIcon");
	private By gallery					=		AppiumBy.accessibilityId("GalleryClicked");
	private By Time						= 		AppiumBy.accessibilityId("SelectTime");
	private By pickerelement			= 		AppiumBy.xpath("//XCUIElementTypePickerWheel");
	private By Doneclick				= 		AppiumBy.accessibilityId("AlcohalTime");
	private By submittap				= 		AppiumBy.accessibilityId("SubmitImage");

	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Member check upload functionlaity verification")
    @Story("Scroll to Fuel card and upload image for breakfast.")	
	public void Fuel_EarlySnacks_uploadphotogallery() throws InterruptedException{
		try {
		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
		
		WebElement Homeicon = driver.findElement(Homeclick);
		Homeicon.click();
		// Log console message to Allure
 		LOGGER.info("Click on Homeicon");
 		AllureUtils.logStep("Click on Homeicon");
 		// Capture a screenshot and attach it to Allure
 		AllureUtils.captureScreenshot(driver, "Case32_1");
		
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
        AllureUtils.captureScreenshot(driver, "Case32_2");
        
        
        WebElement uploadicon	= driver.findElement(uploadbreakfastimage);
        uploadicon.click();
     // Log console message to Allure
  		LOGGER.info("Click on uploadicon");
  		AllureUtils.logStep("Click on uploadicon");
  		// Capture a screenshot and attach it to Allure
  		AllureUtils.captureScreenshot(driver, "uploadicon_32");
  		
        WebElement galleryclick	= driver.findElement(gallery);
        galleryclick.click();
     // Log console message to Allure
  		LOGGER.info("Click on galleryclick");
  		AllureUtils.logStep("Click on galleryclick");
  		// Capture a screenshot and attach it to Allure
  		AllureUtils.captureScreenshot(driver, "galleryclick_32");
        
        WebElement firstPhoto = driver.findElement(AppiumBy.xpath("//XCUIElementTypeImage[2]"));
        firstPhoto.click();
        
        WebElement addclick = driver.findElement(AppiumBy.accessibilityId("Add"));
        addclick.click();
        
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "earlysnack6");
        // Click on timer 
        WebElement Timerclick 	= driver.findElement(Time);
        Timerclick.click();
        
        List<WebElement>values = driver.findElements(pickerelement);

		for (int i=0; i<values.size();i++)
		{		
		System.out.println(values.get(i).getText());
		}
		
		values.get(0).sendKeys("8");
		values.get(0).sendKeys(Keys.TAB);

		Thread.sleep(3500);
		values.get(1).sendKeys("13");
		values.get(1).sendKeys(Keys.TAB);
		
		Thread.sleep(3500);
		values.get(2).sendKeys("AM");
		// Log console message to Allure
		LOGGER.info("enter time ");
		AllureUtils.logStep("Enter time");    
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "CASE232");

		driver.findElement(Doneclick).click();
		// Log console message to Allure
        LOGGER.info("Click on Doneclick ");
        AllureUtils.logStep("Click on Doneclick"); 
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "earlysnack7");
		
		WebElement Submittap = driver.findElement(submittap);
		Submittap.click();
		// Log console message to Allure
		LOGGER.info("enter time ");
		AllureUtils.logStep("Enter time");    
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "CASE132");
				
		Thread.sleep(4500);
		
	    
//		// Method to scroll to perform screen
//		HashMap<String,Object>scrollObject2 =new HashMap<>();
//		scrollObject2.put("direction", "down");
//		scrollObject2.put("Early Snacks", "Early Snacks");
//		driver.executeScript("mobile:scroll", scrollObject2);

		
	    Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject1 =new HashMap<>();
		scrollObject1.put("direction", "down");
		scrollObject1.put("Image uploaded", "Image uploaded");
		driver.executeScript("mobile:scroll", scrollObject1);
		Thread.sleep(2000);
	    
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "earlysnack8");
        
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
