package cuesz03.Iosapp_member_home_Fuelscreen.copy;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

@Epic ("Fuel upload screen functionlaity ")
@Feature ("Verify Upload detail functionlaity for latesnacks.")
public class Case38_Fuel_LateSnacks_uploadphoto extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case38_Fuel_LateSnacks_uploadphoto .class);
	
	private By Homeclick 				= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By uploadlunchimage		=		AppiumBy.accessibilityId("Late SnacksUploadIcon");
	private By gallery					=		AppiumBy.accessibilityId("GalleryClicked");
	private By Time						= 		AppiumBy.accessibilityId("SelectTime");
	private By pickerelement			= 		AppiumBy.xpath("//XCUIElementTypePickerWheel");
	private By Doneclick				= 		AppiumBy.accessibilityId("AlcohalTime");
	private By submittap				= 		AppiumBy.accessibilityId("SubmitImage");
	private By arrowclick				= 		AppiumBy.accessibilityId("RightArrow");
	private By Icondelete				= 		AppiumBy.accessibilityId("DeletePhoto");
	private By uploadphoto				=		AppiumBy.accessibilityId("PhotoUpload");


	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Member check upload functionlaity verification")
    @Story("Scroll to Fuel card and upload image for latesnacks.")	
	public void LateSnacks_uploadphoto() throws InterruptedException{
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
        AllureUtils.captureScreenshot(driver, "38_1");
		        
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
        AllureUtils.captureScreenshot(driver,"38_2");
        
        Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject1 =new HashMap<>();
		scrollObject1.put("direction", "down");
		scrollObject1.put("Breakfast", "Breakfast");
		driver.executeScript("mobile:scroll", scrollObject1);
		Thread.sleep(2000);
		// Log console message to Allure
        LOGGER.info("Scroll to breakfast");
        AllureUtils.logStep("Scroll to breakfast");
		
		
		Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject2 =new HashMap<>();
		scrollObject2.put("direction", "down");
		scrollObject2.put("Early Snacks", "Early Snacks");
		driver.executeScript("mobile:scroll", scrollObject2);
		Thread.sleep(2000);
		// Log console message to Allure
        LOGGER.info("Scroll to early snack");
        AllureUtils.logStep("Scroll to early snacks");

        
        WebElement uploadicon	= driver.findElement(uploadlunchimage);
        uploadicon.click();
        // Log console message to Allure
        LOGGER.info("Click on uploadicon");
        AllureUtils.logStep("Click on uploadicon");
        AllureUtils.captureScreenshot(driver, "Case38_3");
        
        WebElement galleryclick	= driver.findElement(gallery);
        galleryclick.click();
        // Log console message to Allure
        LOGGER.info("Click on galleryclick");
        AllureUtils.logStep("Click on galleryclick");
        AllureUtils.captureScreenshot(driver, "Case38_4");
        
        WebElement firstPhoto = driver.findElement(AppiumBy.xpath("//XCUIElementTypeImage[2]"));
        firstPhoto.click();
        
        WebElement addclick = driver.findElement(AppiumBy.accessibilityId("Add"));
        addclick.click();
        
        
        // Click on timer 
        WebElement Timerclick 	= driver.findElement(Time);
        Timerclick.click();
        
        List<WebElement>values = driver.findElements(pickerelement);

		for (int i=0; i<values.size();i++)
		{		
		System.out.println(values.get(i).getText());
		}
		
		values.get(0).sendKeys("5");
		values.get(0).sendKeys(Keys.TAB);

		Thread.sleep(3500);
		values.get(1).sendKeys("45");
		values.get(1).sendKeys(Keys.TAB);
		
		Thread.sleep(3500);
		values.get(2).sendKeys("PM");

		driver.findElement(Doneclick).click();
		
		
		  // Capture a screenshot and attach it to Allure
	    AllureUtils.captureScreenshot(driver, "latesnacks5");
        
		WebElement Submittap = driver.findElement(submittap);
		Submittap.click();
		// Log console message to Allure
        LOGGER.info("Click on Submittap");
        AllureUtils.logStep("Click on Submittap");
        AllureUtils.captureScreenshot(driver, "Case38_5");
		Thread.sleep(4500);
		
		
		WebElement uploadicon1	= driver.findElement(uploadlunchimage);
	    uploadicon1.click();
	    // Log console message to Allure
        LOGGER.info("Click on uploadicon1");
        AllureUtils.logStep("Click on uploadicon1");
        AllureUtils.captureScreenshot(driver, "Case38_6");
        
	    WebElement photoicon	= driver.findElement(uploadphoto);
	    photoicon.click();
	   
	    WebElement galleryclick2	= driver.findElement(gallery);
        galleryclick2.click();
        // Log console message to Allure
        LOGGER.info("Click on galleryclick2");
        AllureUtils.logStep("Click on galleryclick2");
        AllureUtils.captureScreenshot(driver, "Case38_7");
        
        WebElement firstPhoto2 = driver.findElement(AppiumBy.xpath("//XCUIElementTypeImage[3]"));
        firstPhoto2.click();
        
        WebElement addclick2 = driver.findElement(AppiumBy.accessibilityId("Add"));
        addclick2.click();
        
        
        // Click on timer 
        WebElement Timerclick2 	= driver.findElement(Time);
        Timerclick2.click();
        
        List<WebElement>values1 = driver.findElements(pickerelement);

		for (int i=0; i<values1.size();i++)
		{		
		System.out.println(values1.get(i).getText());
		}
		
		values1.get(0).sendKeys("5");
		values1.get(0).sendKeys(Keys.TAB);

		Thread.sleep(3500);
		values1.get(1).sendKeys("43");
		values1.get(1).sendKeys(Keys.TAB);
		
		Thread.sleep(3500);
		values1.get(2).sendKeys("PM");

		driver.findElement(Doneclick).click();
		// Log console message to Allure
        LOGGER.info("Click on done");
        AllureUtils.logStep("Click on done");
        
		  // Capture a screenshot and attach it to Allure
	    AllureUtils.captureScreenshot(driver, "latesnacks6");
		
		WebElement Submittap1 = driver.findElement(submittap);
		Submittap1.click();
		// Log console message to Allure
        LOGGER.info("Click on Submittap1");
        AllureUtils.logStep("Click on Submittap1");
        AllureUtils.captureScreenshot(driver, "Case38_7");
		Thread.sleep(4500);
	
		WebElement uploadicon2	= driver.findElement(uploadlunchimage);
	    uploadicon2.click();
        
	    //locate and click on toggel arrow 
	    WebElement arrowright	= driver.findElement(arrowclick);
	    arrowright.click();
	    // Log console message to Allure
        LOGGER.info("Click on arrowclick");
        AllureUtils.logStep("Click on arrowclick");
        AllureUtils.captureScreenshot(driver, "Case38_8");
	    
		  // Capture a screenshot and attach it to Allure
	    AllureUtils.captureScreenshot(driver, "latesnacks7");
	    
	    //Locate and click on delete icon
	    WebElement deleticon	= driver.findElement(Icondelete);
	    deleticon.click();
	    Thread.sleep(4500);
	    
	    Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject11 =new HashMap<>();
		scrollObject11.put("direction", "down");
		scrollObject11.put("Image uploaded", "Perform");
		driver.executeScript("mobile:scroll", scrollObject11);
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
	
