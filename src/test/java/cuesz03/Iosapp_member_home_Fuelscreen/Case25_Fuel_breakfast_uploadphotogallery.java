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

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import cuesz.utils.reporting.AllureUtils;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Fuel upload screen functionlaity ")
@Feature ("Verify Upload detail functionlaity for breakfast.")
public class Case25_Fuel_breakfast_uploadphotogallery extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case25_Fuel_breakfast_uploadphotogallery.class);
	private By Homeclick 				= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By uploadbreakfastimage		=		AppiumBy.accessibilityId("BreakfastUploadIcon");
	private By gallery					=		AppiumBy.accessibilityId("GalleryClicked");
	private By Time						= 		AppiumBy.accessibilityId("SelectTime");
	private By pickerelement			= 		AppiumBy.xpath("//XCUIElementTypePickerWheel");
	private By Doneclick				= 		AppiumBy.accessibilityId("AlcohalTime");
	private By submittap				= 		AppiumBy.accessibilityId("SubmitImage");
	private By photoupload					= 		AppiumBy.accessibilityId("PhotoUpload");
	private By arrowclick				= 		AppiumBy.accessibilityId("RightArrow");
	private By Icondelete				= 		AppiumBy.accessibilityId("DeletePhoto");

	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Member check upload functionlaity verification")
    @Story("Scroll to Fuel card and upload image for breakfast.")	
	public void Homescreen() throws InterruptedException{
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
		AllureUtils.captureScreenshot(driver, "Case21_Fuel_breakfast_recommendedfuel1");
	       
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
        AllureUtils.logStep("Click on fuel screenc");
        AllureUtils.captureScreenshot(driver, "Case21_Fuel_breakfast_recommendedfuel2");
        
        WebElement uploadicon	= driver.findElement(uploadbreakfastimage);
        uploadicon.click();
        // Log console message to Allure
        LOGGER.info("Click on uploadicon");
        AllureUtils.logStep("Click on uploadicon");
        AllureUtils.captureScreenshot(driver, "uploadicon1");
        
        WebElement galleryclick	= driver.findElement(gallery);
        galleryclick.click();
        // Log console message to Allure
        LOGGER.info("Click on galleryclick");
        AllureUtils.logStep("Click on galleryclick");
        AllureUtils.captureScreenshot(driver, "uploadicon2");
        
        WebElement firstPhoto = driver.findElement(AppiumBy.xpath("//XCUIElementTypeImage[2]"));
        firstPhoto.click();
        // Log console message to Allure
        LOGGER.info("Click on firstPhoto");
        AllureUtils.logStep("Click on firstPhoto");
        AllureUtils.captureScreenshot(driver, "uploadicon3");
        
        WebElement addclick = driver.findElement(AppiumBy.accessibilityId("Add"));
        addclick.click();
        // Log console message to Allure
        LOGGER.info("Click on addclick");
        AllureUtils.logStep("Click on addclick");
        AllureUtils.captureScreenshot(driver, "uploadicon4");
        
        // Click on timer 
        WebElement Timerclick 	= driver.findElement(Time);
        Timerclick.click();
        // Log console message to Allure
        LOGGER.info("Click on Timerclick");
        AllureUtils.logStep("Click on Timerclick");
        AllureUtils.captureScreenshot(driver, "uploadicon5");
        
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
        AllureUtils.captureScreenshot(driver, "uploadicon6");

		driver.findElement(Doneclick).click();
		// Log console message to Allure
		LOGGER.info("Click on Doneclick ");
        AllureUtils.logStep("Click on Doneclick");  
        
		WebElement Submittap = driver.findElement(submittap);
		Submittap.click();
		// Log console message to Allure
		LOGGER.info("click on Submittap");
        AllureUtils.logStep("click on Submittap");    
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "uploadicon7");
         
		Thread.sleep(4500);
		
		
		WebElement uploadicon1	= driver.findElement(uploadbreakfastimage);
	    uploadicon1.click();
	    // Log console message to Allure
	    LOGGER.info("click on uploadicon1");
        AllureUtils.logStep("click on uploadicon1");    
        
        
        
        
        WebElement Photoupload	= driver.findElement(photoupload);
        Photoupload.click();
	    // Log console message to Allure
	    LOGGER.info("click on Photoupload");
        AllureUtils.logStep("click on Photoupload");    
          
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "uploadicon8");
        
        
      
	   
	    WebElement galleryclick2	= driver.findElement(gallery);
        galleryclick2.click();
        // Log console message to Allure
        LOGGER.info("click on galleryclick2");
        AllureUtils.logStep("click on galleryclick2");    
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "uploadicon9");
	    
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
		
		values1.get(0).sendKeys("9");
		values1.get(0).sendKeys(Keys.TAB);

		Thread.sleep(3500);
		values1.get(1).sendKeys("13");
		values1.get(1).sendKeys(Keys.TAB);
		
		Thread.sleep(3500);
		values1.get(2).sendKeys("AM");
		// Log console message to Allure
		LOGGER.info("enter time ");
		AllureUtils.logStep("Enter time");    
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "uploadicon10");

		driver.findElement(Doneclick).click();
        
		WebElement Submittap1 = driver.findElement(submittap);
		Submittap1.click();
		// Log console message to Allure
        LOGGER.info("click on Submittap1");
        AllureUtils.logStep("click on Submittap1");    
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "uploadicon11");
		Thread.sleep(4500);
	
		WebElement uploadicon2	= driver.findElement(uploadbreakfastimage);
	    uploadicon2.click();
	    // Log console message to Allure
        LOGGER.info("click on uploadicon2");
        AllureUtils.logStep("click on uploadicon2");    
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "uploadicon12");
        
	    //locate and click on toggel arrow 
	    WebElement arrowright	= driver.findElement(arrowclick);
	    arrowright.click();
	    // Log console message to Allure
        LOGGER.info("click on arrowright");
        AllureUtils.logStep("click on arrowright");    
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "uploadicon13");
	    
	    //Locate and click on delete icon
	    WebElement deleticon	= driver.findElement(Icondelete);
	    deleticon.click();
	    // Log console message to Allure
        LOGGER.info("click on deleticon");
        AllureUtils.logStep("click on deleticon");    
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "uploadicon14");
	    Thread.sleep(4500);

	  //scroll to image upload
  		By imageuplaodedLocator = AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"Image uploaded\"]");
  	        if(!isElementPresent(driver, imageuplaodedLocator)){
  	            // Scroll to "Basketball" if it's not present
  	            HashMap<String,Object> scrollObject1 = new HashMap<>();
  	            scrollObject1.put("direction", "down");
  	            scrollObject1.put("Image uploaded", "Image uploaded");
  	            driver.executeScript("mobile:scroll", scrollObject1);
  	            Thread.sleep(2000);
  	        }
	      

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
	
