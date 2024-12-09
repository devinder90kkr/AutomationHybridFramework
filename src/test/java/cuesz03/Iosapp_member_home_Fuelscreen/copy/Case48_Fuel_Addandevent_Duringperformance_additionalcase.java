package cuesz03.Iosapp_member_home_Fuelscreen.copy;

import java.util.HashMap;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

@Epic ("Member Add an event screen detail ")
@Feature ("Verify member able to add functionlaity related to add an event for During-performance functionlaity.")
public class Case48_Fuel_Addandevent_Duringperformance_additionalcase extends AppiummobileBase {
	
	mobileLocators locators = new mobileLocators();	
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
	@Description("Member scroll to add an Event screen for during-perfoemnace detail verification")
    @Story("Scroll to during-performance detail and add its related values")
	public void Fuel_addaneventadditionalcasewithduringperformance() throws InterruptedException {	

		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
//        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
		 appiumUtils.launchAppWithPackageId(mobileTestData.bundelID);
		
		WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
		Homeicon.click();
		
		
		Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject =new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("Perform Fuel Mindful Restore", "Perform");
		driver.executeScript("mobile:scroll", scrollObject);
		Thread.sleep(2000);
        
        //Click on Fuel tab 
        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();
 
        By duringperformanceLocator = AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"During Performance\"`][2]");
        if(!isElementPresent(driver, duringperformanceLocator)){
            // Scroll to "Basketball" if it's not present
            HashMap<String,Object> scrollObject1 = new HashMap<>();
            scrollObject1.put("direction", "down");
            scrollObject1.put("During Performance", "During Performance");
            driver.executeScript("mobile:scroll", scrollObject1);
            Thread.sleep(2000);
        }
        
        
        
        // Method to scroll to perform screen
  		HashMap<String,Object>scrollObject3 =new HashMap<>();
  		scrollObject3.put("direction", "down");
  		scrollObject3.put("During Performance", "During Performance");
  		driver.executeScript("mobile:scroll", scrollObject3);
  		Thread.sleep(2000);

  		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addduringevent1");
  		
  		
     	// Add fuel data for pre-performance 
     	WebElement duringpreperformance	= driver.findElement(mobileLocators.duringplusicon);
     	duringpreperformance.click();
        
     	//click on keypad Done button to hide keypad
        WebElement keypaddone	= driver.findElement(mobileLocators.doneclick);
        keypaddone.click();
        
        // Click on fuel search field 
        WebElement additionalfuel = driver.findElement(mobileLocators.additionalsearch);
        additionalfuel.click();
        
        WebElement searchtext1	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"J\""));
        searchtext1.click();
        
        WebElement searchtext2	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"i\""));
        searchtext2.click();
        
        WebElement searchtext3	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"m\""));
        searchtext3.click();

        WebElement Keypaddone	= driver.findElement(mobileLocators.doneclick);
        Keypaddone.click();
       
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addduringevent2");

        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addevent6");
   
        WebElement fuelselection	= driver.findElement(mobileLocators.jimmie);
        fuelselection.click();
        
        Thread.sleep(2500);
        WebElement submititems	= driver.findElement(mobileLocators.submitclick);
        submititems.click();

        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addduringevent3");
        
        Thread.sleep(5500);
     // Add fuel data for pre-performance 
     	WebElement duringpreperformance2	= driver.findElement(mobileLocators.duringplusicon);
     	duringpreperformance2.click();
        
        // Click on fuel search field 
        WebElement additionalfuel2 = driver.findElement(mobileLocators.additionalsearch);
        additionalfuel2.click();
        
        WebElement searchtext11	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"C\""));
        searchtext11.click();
        
        WebElement searchtext21	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"o\""));
        searchtext21.click();
        
        WebElement searchtext31	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"g\""));
        searchtext31.click();
        
        WebElement Keypaddone1	= driver.findElement(mobileLocators.doneclick);
        Keypaddone1.click();
        
        WebElement brandedShowmore	= driver.findElement(mobileLocators.Showclick);
        brandedShowmore.click();
                
        Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject1 =new HashMap<>();
		scrollObject1.put("direction", "down");
		scrollObject1.put("Cognac Pate", "Cognac Pate");
		driver.executeScript("mobile:scroll", scrollObject1);
		
		WebElement fuelselection1	= driver.findElement(mobileLocators.cognpate);
        fuelselection1.click();
        
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addduringevent3");
        
        
        Thread.sleep(2500);
        WebElement submititems2	= driver.findElement(mobileLocators.submitclick);
        submititems2.click();

					
		Thread.sleep(3500);
		WebElement infoicon		= driver.findElement(mobileLocators.infoclick);
		infoicon.click();
		
		Thread.sleep(3000); 
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject4 =new HashMap<>();
		scrollObject4.put("direction", "down");
		scrollObject4.put("Source", "Source");
		driver.executeScript("mobile:scroll", scrollObject4);
		Thread.sleep(2000);

		WebElement 	backincon	= driver.findElement(mobileLocators.backbttn);
		backincon.click();
		
		Thread.sleep(3500);
		 By duringperformanceLocator1 = AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"During Performance\"`][2]");
	        if(!isElementPresent(driver, duringperformanceLocator1)){
	            // Scroll to "Basketball" if it's not present
	            HashMap<String,Object> scrollObject2 = new HashMap<>();
	            scrollObject2.put("direction", "down");
	            scrollObject2.put("During Performance", "During Performance");
	            driver.executeScript("mobile:scroll", scrollObject2);
	            Thread.sleep(2000);
	        }
	        
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addduringevent4");
        
       	Thread.sleep(2500);
//        driver.terminateApp("com.cuesz.mobile");
        driver.terminateApp(mobileTestData.bundelID);
        
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
	

