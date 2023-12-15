package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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

@Epic ("Member Add an event screen detail ")
@Feature ("Verify member able to add functionlaity related to add an event for post-performance functionlaity.")
public class Case50_Fuel_Addandevent_Recommendedfuel extends AppiummobileBase {
	
	private By Homeclick 		= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By preicon			=		AppiumBy.iOSNsPredicateString("name == \"Pre PerformancePlueIcon\"");
	private By doneclick		= 		AppiumBy.accessibilityId("Done");
	private By recommendedclick	= 		AppiumBy.accessibilityId("AddRecommendedFuel");
	private By headingpre		=		AppiumBy.accessibilityId("Pre");
	private By tickaction		= 		AppiumBy.accessibilityId("RecommendedFuelSubmit");
	private By Time				= 		AppiumBy.accessibilityId("RecommendedFuelTime");
	private By pickerelement	= 		AppiumBy.xpath("//XCUIElementTypePickerWheel");
	private By Doneclick		= 		AppiumBy.accessibilityId("AlcohalTime");
	private By brekdone			= 		AppiumBy.accessibilityId("Done");
	private By duringicon		=		AppiumBy.iOSNsPredicateString("name == \"During PerformancePlueIcon\"");
	private By during1heading	=		AppiumBy.accessibilityId("During");
	private By posticon			=		AppiumBy.iOSNsPredicateString("name == \"Post PerformancePlueIcon\"");
	private By postheading		=		AppiumBy.accessibilityId("Post");
	
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
		
		WebElement Homeicon = driver.findElement(Homeclick);
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
        
        // Method to scroll to perform screen
  		HashMap<String,Object>scrollObject2 =new HashMap<>();
  		scrollObject2.put("direction", "down");
  		scrollObject2.put("Breakfast", "Breakfast");
  		driver.executeScript("mobile:scroll", scrollObject2);
  		Thread.sleep(2000);
        
  		 // Method to scroll to perform screen
  		HashMap<String,Object>scrollObject3 =new HashMap<>();
  		scrollObject3.put("direction", "down");
  		scrollObject3.put("Lunch", "Lunch");
  		driver.executeScript("mobile:scroll", scrollObject3);
  		Thread.sleep(2000);
        
        
        // Method to scroll to perform screen
  		HashMap<String,Object>scrollObject4 =new HashMap<>();
  		scrollObject4.put("direction", "down");
  		scrollObject4.put("Basketball", "Basketball");
  		driver.executeScript("mobile:scroll", scrollObject4);
  		Thread.sleep(2000);

  		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addpoevent1");
  		
        WebElement preplusicon	= driver.findElement(preicon);
        preplusicon.click();
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone	= driver.findElement(doneclick);
        keypaddone.click();
        
        // Locate and click on recommended Fuel button
        WebElement Recommendedfuel 	= driver.findElement(recommendedclick);
        Recommendedfuel.click();
        Thread.sleep(5500);
        
        WebElement preheading	= driver.findElement(headingpre);
        preheading.click();
        
        WebElement preperformancetick	= driver.findElement(tickaction);
        preperformancetick.click();
                
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addpoevent2");
        
        // Click on timer 
        WebElement Timerclick 	= driver.findElement(Time);
        Timerclick.click();
        
        List<WebElement>values = driver.findElements(pickerelement);

		for (int i=0; i<values.size();i++)
		{		
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
        AllureUtils.captureScreenshot(driver, "addpoevent3");
		
		driver.findElement(Doneclick).click();
        
		  // Click on Done-breakfast button
        WebElement brekfastdone 	= driver.findElement(brekdone);
        brekfastdone.click();
        
        Thread.sleep(5500);
    
        WebElement Duringplusicon	= driver.findElement(duringicon);
        Duringplusicon.click();
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone2	= driver.findElement(doneclick);
        keypaddone2.click();
        
        // Locate and click on recommended Fuel button
        WebElement Recommendedfuel2 	= driver.findElement(recommendedclick);
        Recommendedfuel2.click();
        
        WebElement duringheading	= driver.findElement(during1heading);
        duringheading.click();
       
        
        WebElement preperformancetick1	= driver.findElement(tickaction);
        preperformancetick1.click();
                
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addpoevent2");
        
        // Click on timer 
        WebElement Timerclick1 	= driver.findElement(Time);
        Timerclick1.click();
        
        List<WebElement>values1 = driver.findElements(pickerelement);

		for (int i=0; i<values1.size();i++)
		{		
		System.out.println(values1.get(i).getText());
		}
		
		values1.get(0).sendKeys("8");
		values1.get(0).sendKeys(Keys.TAB);

		Thread.sleep(3500);
		values1.get(1).sendKeys("43");
		values1.get(1).sendKeys(Keys.TAB);
		
		Thread.sleep(3500);
		values1.get(2).sendKeys("AM");
	
		 // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addpoevent3");
		
		driver.findElement(Doneclick).click();
        
		  // Click on Done-breakfast button
        WebElement brekfastdone1 	= driver.findElement(brekdone);
        brekfastdone1.click();
        
        
        WebElement Postplusicon	= driver.findElement(posticon);
        Postplusicon.click();
        
      //click on keypad Done button to hide keypad
        WebElement keypaddone3	= driver.findElement(doneclick);
        keypaddone3.click();
        
        // Locate and click on recommended Fuel button
        WebElement Recommendedfuel3 	= driver.findElement(recommendedclick);
        Recommendedfuel3.click();
        
        WebElement duringheading3	= driver.findElement(postheading);
        duringheading3.click();
       
        
        WebElement preperformancetick3 = driver.findElement(tickaction);
        preperformancetick3.click();
        
        
        // Click on Done-breakfast button
        WebElement brekfastdone3 	= driver.findElement(brekdone);
        brekfastdone3.click();
        
        Thread.sleep(5500);
        

       	Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
	}
}
	

