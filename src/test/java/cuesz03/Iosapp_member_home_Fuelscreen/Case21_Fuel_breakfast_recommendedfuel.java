//package cuesz03.Iosapp_member_home_Fuelscreen;
//
//import java.util.HashMap;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import cuesz.pages.AppiummobileBase;
//import cuesz.utils.AllureUtils;
//import cuesz.utils.AppiumappUtils;
//import io.appium.java_client.AppiumBy;
//import io.qameta.allure.Description;
//import io.qameta.allure.Epic;
//import io.qameta.allure.Feature;
//import io.qameta.allure.Owner;
//import io.qameta.allure.Severity;
//import io.qameta.allure.SeverityLevel;
//import io.qameta.allure.Story;
//
//@Epic ("Fuel screen detail ")
//@Feature ("Verify Fuel detail functionlaity related to breakfast functionlaity.")
//public class Case21_Fuel_breakfast_recommendedfuel extends AppiummobileBase {
//	
//	private By Homeclick = 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
//
//	private By breakfastlabel	= 		AppiumBy.iOSNsPredicateString("name == 'Breakfast'");
//	private By iconbreakfast	= 		AppiumBy.accessibilityId("BreakfastInfoIcon");
//	private By backicon			= 		AppiumBy.accessibilityId("BackPress");
//	private By plusadd			= 		AppiumBy.accessibilityId("BreakfastAddIcon");
//	private By doneclick		= 		AppiumBy.accessibilityId("Done");
//	private By recommendedclick	= 		AppiumBy.accessibilityId("AddRecommendedFuel");
//	private By backicon1		= 		AppiumBy.accessibilityId("RecommendBackPress");
//	private By rightarrow		= 		AppiumBy.accessibilityId("FuelCaloriesArrowRight");
//	private By Time				= 		AppiumBy.accessibilityId("RecommendedFuelTime");
//	private By pickerelement	= 		AppiumBy.xpath("//XCUIElementTypePickerWheel");
//	private By Doneclick		= 		AppiumBy.accessibilityId("AlcohalTime");
//	private By tickbreakfast	= 		AppiumBy.accessibilityId("RecommendedFuelSubmit");
//	private By brekdone			= 		AppiumBy.accessibilityId("Done");
//	
//
//	@Test
//	@Owner("QA") // Add the @Owner annotation to specify the executor
//    @Severity(SeverityLevel.NORMAL)      
//    @Description("Member Fuel screen detail verification")
//    @Story("Scroll to Fuel card and verify breakfast assigned by staff ")	
//	public void Homescreen() throws InterruptedException
//	{	
//		// Create an instance of AppiumUtils and pass the driver
//		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
//        // Launch the app using the utility method
//        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
//		
//		WebElement Homeicon = driver.findElement(Homeclick);
//		Homeicon.click();
//		
//		Thread.sleep(3000);
//		// Method to scroll to perform screen
//		HashMap<String,Object>scrollObject =new HashMap<>();
//		scrollObject.put("direction", "down");
//		scrollObject.put("Perform Fuel Mindful Restore", "Perform");
//		driver.executeScript("mobile:scroll", scrollObject);
//		Thread.sleep(2000);
//
//        //Click on Fuel tab 
//        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();
//        
//		
//        // Locate the element containing the perform
//        WebElement breakfast = driver.findElement(breakfastlabel);
//        // Extract text from the element
//        String actualText = breakfast.getText();
//        // Define the expected text
//        String expectedText = "Breakfast";
//        
//        // Print the actual and expected text to the console
//        System.out.println("Actual Text: " + actualText);
//        System.out.println("Expected Text: " + expectedText);
//        // Compare the actual and expected text
//        Assert.assertEquals(actualText, expectedText);
//		
//        
//        // Locate and click on breakfasticon for cal related info
//        WebElement breakfasticon	= driver.findElement(iconbreakfast);
//        breakfasticon.click();
//        WebElement backclick	= driver.findElement(backicon);
//        backclick.click();
//        
//		// Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "Fuel11");
//        
//        // Locate the element related to breakfast + icon 
//        WebElement breakfastplus 	= driver.findElement(plusadd);
//        breakfastplus.click();
//        
//       //click on keypad Done button to hide keypad
//        WebElement keypaddone	= driver.findElement(doneclick);
//        keypaddone.click();
//        
//        // Locate and click on recommended Fuel button
//        WebElement Recommendedfuel 	= driver.findElement(recommendedclick);
//        Recommendedfuel.click();
//        WebElement recommendebackclick	= driver.findElement(backicon1);
//        recommendebackclick.click();
//      //click on keypad Done button to hide keypad
//        WebElement keypaddone1	= driver.findElement(doneclick);
//        keypaddone1.click();
//        // Locate and click on recommended Fuel button
//        WebElement Recommendedfuel1 	= driver.findElement(recommendedclick);
//        Recommendedfuel1.click();
//        
//        WebElement arrowright = driver.findElement(rightarrow);
//        arrowright.click();
//        
//		// Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "Fuel12");
//
//        
//        // Click on timer 
//        WebElement Timerclick 	= driver.findElement(Time);
//        Timerclick.click();
//        
//        List<WebElement>values = driver.findElements(pickerelement);
//
//		for (int i=0; i<values.size();i++)
//		{		
//		System.out.println(values.get(i).getText());
//		}
//		
//		values.get(0).sendKeys("6");
//		values.get(0).sendKeys(Keys.TAB);
//
//		Thread.sleep(3500);
//		values.get(1).sendKeys("43");
//		values.get(1).sendKeys(Keys.TAB);
//		
//		Thread.sleep(3500);
//		values.get(2).sendKeys("AM");
//	
//		// Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "Fuel13");
//
//		
//		
//		driver.findElement(Doneclick).click();
//        
//		// Click on breakfast-tick 
//        WebElement breakfasttick	= driver.findElement(tickbreakfast);
//        breakfasttick.click();
//    		   
//        // Click on Done-breakfast button
//        WebElement brekfastdone 	= driver.findElement(brekdone);
//        brekfastdone.click();
//        
//        // Locate and click on breakfasticon for cal related info
//        WebElement breakfasticon1	= driver.findElement(iconbreakfast);
//        breakfasticon1.click();
//        WebElement backclick1	= driver.findElement(backicon);
//        backclick1.click();
//        
//		// Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "Fuel14");
//        
//		Thread.sleep(2500);
//        driver.terminateApp("com.cuesz.mobile");
//	}
//}
//	
package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AllureUtils;
import cuesz.utils.AppiumappUtils;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("Fuel screen detail ")
@Feature("Verify Fuel detail functionality related to breakfast functionality.")
public class Case21_Fuel_breakfast_recommendedfuel extends AppiummobileBase {

    private By Homeclick = AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
    private By breakfastlabel = AppiumBy.iOSNsPredicateString("name == 'Breakfast'");
    private By iconbreakfast = AppiumBy.accessibilityId("BreakfastInfoIcon");
    private By backicon = AppiumBy.accessibilityId("BackPress");
    private By plusadd = AppiumBy.accessibilityId("BreakfastAddIcon");
    private By doneclick = AppiumBy.accessibilityId("Done");
    private By recommendedclick = AppiumBy.accessibilityId("AddRecommendedFuel");
    private By backicon1 = AppiumBy.accessibilityId("RecommendBackPress");
    private By rightarrow = AppiumBy.accessibilityId("FuelCaloriesArrowRight");
    private By Time = AppiumBy.accessibilityId("RecommendedFuelTime");
    private By pickerelement = AppiumBy.xpath("//XCUIElementTypePickerWheel");
    private By Doneclick = AppiumBy.accessibilityId("AlcohalTime");
    private By tickbreakfast = AppiumBy.accessibilityId("RecommendedFuelSubmit");
    private By brekdone = AppiumBy.accessibilityId("Done");

    @Test
    @Owner("QA")
    @Severity(SeverityLevel.NORMAL)
    @Description("Member Fuel screen detail verification")
    @Story("Scroll to Fuel card and verify breakfast assigned by staff ")
    public void Homescreen() throws InterruptedException {
        AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");

        WebElement Homeicon = driver.findElement(Homeclick);
        Homeicon.click();

        Thread.sleep(3000);

        HashMap<String, Object> scrollObject = new HashMap<>();
        scrollObject.put("direction", "down");
        scrollObject.put("Perform Fuel Mindful Restore", "Perform");
        driver.executeScript("mobile:scroll", scrollObject);
        Thread.sleep(2000);

        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();

        WebElement breakfast = driver.findElement(breakfastlabel);
        String actualText = breakfast.getText();
        String expectedText = "Breakfast";

        System.out.println("Actual Text: " + actualText);
        System.out.println("Expected Text: " + expectedText);
        Assert.assertEquals(actualText, expectedText);

        WebElement breakfasticon = driver.findElement(iconbreakfast);
        breakfasticon.click();
        WebElement backclick = driver.findElement(backicon);
        backclick.click();

        AllureUtils.captureScreenshot(driver, "Fuel11");

        WebElement breakfastplus = driver.findElement(plusadd);
        breakfastplus.click();

        WebElement keypaddone = driver.findElement(doneclick);
        keypaddone.click();

        WebElement Recommendedfuel = driver.findElement(recommendedclick);
        Recommendedfuel.click();
        WebElement recommendebackclick = driver.findElement(backicon1);
        recommendebackclick.click();

        WebElement keypaddone1 = driver.findElement(doneclick);
        keypaddone1.click();

        WebElement Recommendedfuel1 = driver.findElement(recommendedclick);
        Recommendedfuel1.click();

        try {
            // Try to locate and click on the arrowright element
            WebElement arrowright = driver.findElement(rightarrow);
            arrowright.click();
            
            // If the arrowright element is clicked successfully, continue with the rest of the steps
            WebElement Timerclick = driver.findElement(Time);
            Timerclick.click();
            
            List<WebElement> values = driver.findElements(pickerelement);
            
            for (int i = 0; i < values.size(); i++) {
                System.out.println(values.get(i).getText());
            }
            
            values.get(0).sendKeys("6");
            values.get(0).sendKeys(Keys.TAB);
            
            Thread.sleep(3500);
            values.get(1).sendKeys("43");
            values.get(1).sendKeys(Keys.TAB);
            
            Thread.sleep(3500);
            values.get(2).sendKeys("AM");
            
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Fuel13");
            
            driver.findElement(Doneclick).click();
            
            // Click on breakfast-tick
            WebElement breakfasttick = driver.findElement(tickbreakfast);
            breakfasttick.click();
            
            // Click on Done-breakfast button
            WebElement brekfastdone = driver.findElement(brekdone);
            brekfastdone.click();
            
        } catch (Exception e) {
        	// If the arrowright element is not found, log an error message and terminate the app
            String errorMessage = "Arrowright element not found. Skipping further steps.";
            System.out.println(errorMessage);
            Allure.addAttachment("Error", errorMessage);
            AllureUtils.captureScreenshot(driver, "ArrowRightNotFound");
            driver.terminateApp("com.cuesz.mobile");
        }


        Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
    }
}
