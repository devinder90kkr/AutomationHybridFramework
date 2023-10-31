package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AllureUtils;
import cuesz.utils.AppiumappUtils;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Fuel screen detail ")
@Feature ("Verify Fuel detail functionlaity related to optimal fuel")
public class Case20_Fuel_optimalfuel extends AppiummobileBase {
	
	private By Homeclick = 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");

	private By fuellabel = 		AppiumBy.iOSNsPredicateString("name == 'Fuel'");
	private By Fuelmacroheading = 	AppiumBy.iOSNsPredicateString("name == 'FUEL MACROS BREAKDOWN'");
	private By arrowclick1 		= AppiumBy.accessibilityId("FuelCaloriesArrowLeft");
	private By arrowclick2		=  AppiumBy.accessibilityId("FuelCaloriesArrowRight");

	private By dayseven		= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"7 days\"])[2]");
	private By dayfourteen	= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"14 days\"])[2]");
//	private By Yestrday		= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"Yesterday\"])[2]");
	private By backfuel		= AppiumBy.accessibilityId("FuelCalorieBackPress");
	private By Protcard		= AppiumBy.accessibilityId("Protein");
	private By crossicon1	= AppiumBy.accessibilityId("FuelMacroNutrientCross");
	private By carbcard		= AppiumBy.accessibilityId("Carbs");
	private By fatcard		= AppiumBy.accessibilityId("Fat");
//	private By popup1		= AppiumBy.accessibilityId("FuelDrinkInfo");
	private By glas1		= AppiumBy.accessibilityId("WaterGlass1");
	private By glas2		= AppiumBy.accessibilityId("WaterGlass2");	
	private By glas3		= AppiumBy.accessibilityId("WaterGlass3");	
	private By glas4		= AppiumBy.accessibilityId("WaterGlass4");	
//	private By caffeine		= AppiumBy.accessibilityId("CaffeineDeviation");
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Member Fuel screen detail verification")
    @Story("Scroll to Fuel card and verify optimal fuel assigned by staff ")		
	public void Homescreen() throws InterruptedException
	{	
		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
		
		WebElement Homeicon = driver.findElement(Homeclick);
		Homeicon.click();
		
		Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject =new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("Perform Fuel Mindful Restore", "Perform");
		driver.executeScript("mobile:scroll", scrollObject);
		Thread.sleep(2000);

		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel1");
     
        //Click on Fuel tab 
        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();
        	
		// Locate the element containing the perform
        WebElement Fuel1 = driver.findElement(fuellabel);
        // Extract text from the element
        String actualText = Fuel1.getText();
        // Define the expected text
        String expectedText = "Fuel";
        
        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText);
        System.out.println("Expected Text: " + expectedText);
        // Compare the actual and expected text
        Assert.assertEquals(actualText, expectedText);
		
		// click on Calories optimal fuel 
        driver.findElement(AppiumBy.accessibilityId("Calories")).click();
        
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel2");
        
        // Locate the element containing the perform
        WebElement Fuelmacro = driver.findElement(Fuelmacroheading);
        // Extract text from the element
        String actualText2 = Fuelmacro.getText();
        // Define the expected text
        String expectedText2 = "FUEL MACROS BREAKDOWN";
        
        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText2);
        System.out.println("Expected Text: " + expectedText2);
        // Compare the actual and expected text
        Assert.assertEquals(actualText2, expectedText2);
       
        {
        // Click on fuelBackArrow button 4 times
	    for (int i = 0; i < 3; i++) {
	        WebElement backarrow = driver.findElement(arrowclick1);
	        backarrow.click();
	      //  Thread.sleep(1000); // Optional delay to observe the action
	    }
        
      
        }
        // Click on fuelBackArrow button 4 times
	    for (int i = 0; i < 2; i++) {
	        WebElement forwardarrow = driver.findElement(arrowclick2);
	        forwardarrow.click();
	    }
       
        
		// Method to scroll to Food Senstivity card
		HashMap<String,Object>scrollObject2 =new HashMap<>();
		scrollObject2.put("direction", "down");
		scrollObject2.put("Today", "Today");
		driver.executeScript("mobile:scroll", scrollObject2);
      
		//Click on  7days from 
		WebElement day7 = driver.findElement(dayseven);
		day7.click();
  
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel3");
		
		//Click on  14days from 
		WebElement day14 = driver.findElement(dayfourteen);
		day14.click();

//		//Click on  yesterday from 
//		WebElement yestday = driver.findElement(Yestrday);
//		yestday.click();
//		
		//Click on backfuel from macrobreakdown screen
		WebElement backclick = driver.findElement(backfuel);
		backclick.click();
		
		//click on protein card
		WebElement protein = driver.findElement(Protcard);
		protein.click();	
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel4");
		
		//Click on protein cross icon
		WebElement proteincross = driver.findElement(crossicon1);
		proteincross.click();
		
		//click on carbs card
		WebElement carbs = driver.findElement(carbcard);
		carbs.click();	
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel5");
		//Click on protein cross icon
		WebElement carbscross = driver.findElement(crossicon1);
		carbscross.click();
		
		//click on fats card
		WebElement fats = driver.findElement(fatcard);
		fats.click();	
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel6");
		//Click on protein cross icon
		WebElement fatscross = driver.findElement(crossicon1);
		fatscross.click();
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel7");
		
		
		// Array of glass locators
        By[] glassLocators = {glas1, glas2, glas3, glas4};

        try {
            // Open the website
            driver.get("https://example.com");

            // Click on glasses using a loop
            for (By locator : glassLocators) {
                try {
                    WebElement glass = driver.findElement(locator);
                    glass.click();
                    // Add logic for validation or other actions if necessary
                } catch (NoSuchElementException e) {
                    System.out.println("Element not found: " + e.getMessage());
                    // Handle the exception (e.g., log, retry, or terminate the loop)
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel8");
        
//        // locate Caffeine deviation icon
//        WebElement caffeineicon	= driver.findElement(caffeine);
//        caffeineicon.click();
//        
        
		Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
	}
}
	

