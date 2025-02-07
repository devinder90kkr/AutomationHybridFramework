package cuesz03.Iosapp_member_home_Fuelscreen.Uploadphotocases;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.Keys;
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
@Feature ("Verify Upload detail functionlaity for latesnacks.")
public class Case38_Fuel_LateSnacks_uploadphoto extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case38_Fuel_LateSnacks_uploadphoto .class);
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Member check upload functionlaity verification")
    @Story("Scroll to Fuel card and upload image for latesnacks.")	
	public void LateSnacks_uploadphoto() throws InterruptedException{
		try {
		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
	
		appiumUtils.launchAppWithPackageId(mobileTestData.bundelID);
		
		WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
		Homeicon.click();
		// Log console message to Allure
		LOGGER.info("Click on home menu from bottom");
		AllureUtils.logStep("Click on home menu from bottom");
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "Case38_Fuel_LateSnacks_uploadphoto1");
		        
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
                
        Thread.sleep(2500);
        WebElement uploadicon	= driver.findElement(mobileLocators.uploadlatesnackoption);
        uploadicon.click();
        Thread.sleep(2500);
        // Log console message to Allure
        LOGGER.info("Click on uploadicon");
        AllureUtils.logStep("Click on uploadicon");
        AllureUtils.captureScreenshot(driver, "Case35_3");
                
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
        
        WebElement firstPhoto = driver.findElement(mobileLocators.imagselection5);
		firstPhoto.click();
		// Log console message to Allure
		LOGGER.info("Click on firstPhoto");
		AllureUtils.logStep("Click on firstPhoto");
		AllureUtils.captureScreenshot(driver, "uploadicon3"); 
        
		// Wait for category selection to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));
        WebElement Timerclick = wait.until(ExpectedConditions.visibilityOfElementLocated(mobileLocators.Time));
        Timerclick.click();
        
        List<WebElement>values = driver.findElements(mobileLocators.pickerelement);

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

		driver.findElement(mobileLocators.Doneclick).click();
		
		
		  // Capture a screenshot and attach it to Allure
	    AllureUtils.captureScreenshot(driver, "latesnacks5");
        
		WebElement Submittap = driver.findElement(mobileLocators.latesnacktick);
		Submittap.click();
		// Log console message to Allure
        LOGGER.info("Click on Submittap");
        AllureUtils.logStep("Click on Submittap");
        AllureUtils.captureScreenshot(driver, "Case38_5");
		

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
	
