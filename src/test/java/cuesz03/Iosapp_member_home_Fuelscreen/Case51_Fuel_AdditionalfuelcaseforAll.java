package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;

import cuesz.utils.mobileLocators;

import io.appium.java_client.AppiumBy;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Member Add an event screen detail ")
@Feature ("Verify member able to add functionlaity related to add an event for post-performance functionlaity.")
public class Case51_Fuel_AdditionalfuelcaseforAll extends AppiummobileBase {
	
	mobileLocators locators = new mobileLocators();	

	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
	@Description("Member scroll to add an Event screen for post-perfoemnace detail verification")
    @Story("Scroll to post-performance detail and add its related values")
	public void Fuel_addaneventadditionalcasewithpostperformance() throws InterruptedException {	

		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
		
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
        Thread.sleep(4500);
        
        Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject2 =new HashMap<>();
		scrollObject2.put("direction", "down");
		scrollObject2.put("Early Snacks", "Early Snacks");
		driver.executeScript("mobile:scroll", scrollObject2);
		Thread.sleep(2000);
     
        
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject3 =new HashMap<>();
		scrollObject3.put("direction", "down");
		scrollObject3.put("Dinner", "Dinner");
		driver.executeScript("mobile:scroll", scrollObject3);
		Thread.sleep(2000);

		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject4 =new HashMap<>();
		scrollObject4.put("direction", "down");
		scrollObject4.put("TODAY'S FUEL SUMMARY", "TODAY'S FUEL SUMMARY");
		driver.executeScript("mobile:scroll", scrollObject4);
		Thread.sleep(2000);
	
	}
	

}

