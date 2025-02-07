package cuesz03.Iosapp_member_home_Fuelscreen.Uploadphotocases;

import java.time.Duration;
import java.util.HashMap;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

@Epic ("Fuel upload screen functionlaity ")
@Feature ("Verify Upload detail functionlaity for breakfast.")
public class Case32_Fuel_EarlySnacks_uploadphotogallery extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case32_Fuel_EarlySnacks_uploadphotogallery.class);

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
//        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
		 appiumUtils.launchAppWithPackageId(mobileTestData.bundelID);
		
		WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
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
        AllureUtils.logStep("Click on fuel screen");
        AllureUtils.captureScreenshot(driver, "Case32_2");
        
        
        WebElement uploadicon	= driver.findElement(mobileLocators.uploadearlysnack);
        uploadicon.click();
     // Log console message to Allure
  		LOGGER.info("Click on uploadicon");
  		AllureUtils.logStep("Click on uploadicon");
  		// Capture a screenshot and attach it to Allure
  		AllureUtils.captureScreenshot(driver, "uploadicon_32");
  		
        
  		WebElement galleryclick	= driver.findElement(mobileLocators.gallery);
        galleryclick.click();
        // Log console message to Allure
        LOGGER.info("Click on galleryclick");
        AllureUtils.logStep("Click on galleryclick");
        AllureUtils.captureScreenshot(driver, "uploadicon2");
        
        
        WebElement galleryclickcollection	= driver.findElement(mobileLocators.galerycollection);
        galleryclickcollection.click();
        // Log console message to Allure
        LOGGER.info("Click on galleryclickcollection");
        AllureUtils.logStep("Click on galleryclickcollection");
        AllureUtils.captureScreenshot(driver, "uploadicon28");
        
        
        WebElement albumselection	= driver.findElement(mobileLocators.albumselection);
        albumselection.click();
        // Log console message to Allure
        LOGGER.info("Click on albumselection");
        AllureUtils.logStep("Click on albumselection");
        AllureUtils.captureScreenshot(driver, "uploadicon25");
        
        WebElement firstPhoto = driver.findElement(mobileLocators.imagselection2);
		firstPhoto.click();
		// Log console message to Allure
		LOGGER.info("Click on firstPhoto");
		AllureUtils.logStep("Click on firstPhoto");
		AllureUtils.captureScreenshot(driver, "uploadicon3");
  		
		// Wait for category selection to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));
        WebElement Submittap = wait.until(ExpectedConditions.visibilityOfElementLocated(mobileLocators.earlysubmittap));
        Submittap.click();
        
        // Log console message to Allure
		LOGGER.info("Click on submit ");
		AllureUtils.logStep("Click on submit");    
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "CASE132");
	
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
//    	            driver.terminateApp("com.cuesz.mobile");
    	            driver.terminateApp(mobileTestData.bundelID);
    	        }
    	    }
    }
