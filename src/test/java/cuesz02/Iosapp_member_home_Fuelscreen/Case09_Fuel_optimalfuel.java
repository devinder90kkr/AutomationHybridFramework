package cuesz02.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

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

@Epic ("Fuel screen detail ")
@Feature ("Verify Fuel detail functionlaity related to hydration, breakfast, early snacks, Lunch, late Snacks & Dinner")
public class Case09_Fuel_optimalfuel extends AppiummobileBase {
	
	private By Homeclick = 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By Fuelable = 		AppiumBy.iOSNsPredicateString("name == 'Fuel'");
	private By fuellabel = 		AppiumBy.iOSNsPredicateString("name == 'Fuel'");
	private By Fuelmacroheading = 	AppiumBy.iOSNsPredicateString("name == 'FUEL MACROS BREAKDOWN'");
	private By arrowclick1 		= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"FuelCaloryRight\"`][1]");
	private By arrowclick2		=  AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"FuelCaloryRight\"`][2]");
	private By todayarrow 		= AppiumBy.accessibilityId("FuelCaloryArrowDown");
	
	      
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Member Fuel screen detail verification")
    @Story("Scroll to Fuel card and verify features assigned by staff ")	
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

		
        // Locate the element containing the Fuel
        WebElement Fuel = driver.findElement(Fuelable);
        // Extract text from the element
        String actualText1 = Fuel.getText();
        // Define the expected text
        String expectedText1 = "Fuel";
        
        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText1);
        System.out.println("Expected Text: " + expectedText1);
        // Compare the actual and expected text
        Assert.assertEquals(actualText1, expectedText1);
        
        //Click on Fuel tab 
        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();
        
		// Method to scroll to Food Senstivity card
		HashMap<String,Object>scrollObject2 =new HashMap<>();
		scrollObject2.put("direction", "down");
		scrollObject2.put("Food Senstivity", "Food Senstivity");
		driver.executeScript("mobile:scroll", scrollObject2);
	
		// Method to scroll to Food Senstivity card
		HashMap<String,Object>scrollObject3 =new HashMap<>();
		scrollObject3.put("direction", "up");
		scrollObject3.put("OPTIMAL FUEL", "OPTIMAL FUEL");
		driver.executeScript("mobile:scroll", scrollObject3);
		
		
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
        
	    // click on today arrow for select radio values 
        driver.findElement(todayarrow).click();
        
        driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Today\"`]"));
      
        
      
  
       
		Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
	}
}
	

