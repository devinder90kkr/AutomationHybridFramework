package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
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

@Epic ("Member fuel screen detail ")
@Feature ("Verify Fuel detail functionlaity related to dinner functionlaity.")
public class Case46_Fuel_Addandevent_additional extends AppiummobileBase {
	
	private By Homeclick = 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");

	private By addeventlabel	= 		AppiumBy.iOSNsPredicateString("label == \"Add An Event\"");
	
	
	

	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Member Fuel screen detail verification")
    @Story("Scroll to Fuel card and verify Dinner assigned by staff ")	
	public void Fuel_addaneventadditionalcase() throws InterruptedException
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
        AllureUtils.captureScreenshot(driver, "addevent1"); 
        
        //Click on Fuel tab 
        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();
        
        // Method to scroll to perform screen
 		HashMap<String,Object>scrollObject2 =new HashMap<>();
 		scrollObject2.put("direction", "down");
 		scrollObject2.put("Add An Event", "Add An Event");
 		driver.executeScript("mobile:scroll", scrollObject2);
 		Thread.sleep(2000);
        
		
        // Locate the element containing the perform
        WebElement eventadd = driver.findElement(addeventlabel);
        // Extract text from the element
        String actualText = eventadd.getText();
        // Define the expected text
        String expectedText = "Add An Event";
        
        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText);
        System.out.println("Expected Text: " + expectedText);
        // Compare the actual and expected text
        Assert.assertEquals(actualText, expectedText);
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addevent1");  
        
        
        
        
       
        
		Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
	}
}
	

