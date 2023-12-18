package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AllureUtils;
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
	
	private By additionalsearch	= 		AppiumBy.accessibilityId("AdditionalFuelSearch");
//	private By faggot			= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Faggot 90 kcal\"`][3]");
	private By faggot			=		AppiumBy.iOSNsPredicateString("name == \"Faggot\"");
	private By fagoticon		= 		AppiumBy.accessibilityId("FaggotFuelItemInfo");
	private By backtap			= 		AppiumBy.accessibilityId("BackPress");
//	private By downarrow		= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"ArrowDown\"`][4]");
	private By fagotplus		= 		AppiumBy.accessibilityId("FaggotPlus");
	private By submitick		= 		AppiumBy.accessibilityId("ItemSubmit");
	
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
        
      
        By basketballLocator = AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Basketball \"`][1]");
        if(!isElementPresent(driver, basketballLocator)){
            // Scroll to "Basketball" if it's not present
            HashMap<String,Object> scrollObject1 = new HashMap<>();
            scrollObject1.put("direction", "down");
            scrollObject1.put("Basketball", "Basketball");
            driver.executeScript("mobile:scroll", scrollObject1);
            Thread.sleep(2000);
        }
        

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
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addpoevent4");
        
        // Add additional values in pre-performance plus icon 
        WebElement preplusicon1	= driver.findElement(preicon);
        preplusicon1.click();
        
      //click on keypad Done button to hide keypad
        WebElement keypaddone1	= driver.findElement(doneclick);
        keypaddone1.click();
        
        // Click on fuel search field 
        WebElement additionalfuel = driver.findElement(additionalsearch);
        additionalfuel.click();
        
        WebElement searchtext1	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"F\""));
        searchtext1.click();
        
        WebElement searchtext2	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"a\""));
        searchtext2.click();
        
        WebElement searchtext3	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"g\""));
        searchtext3.click();

        WebElement searchtext4	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"g\""));
        searchtext4.click();
        
        WebElement searchtext5	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"o\""));
        searchtext5.click();
        
        WebElement searchtext6	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"t\""));
        searchtext6.click();
      
        WebElement Keypaddone	= driver.findElement(doneclick);
        Keypaddone.click();
        
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addpoevent5");
        
        WebElement fuelselection	= driver.findElement(faggot);
        fuelselection.click();
        
        WebElement faggoticon		= driver.findElement(fagoticon);
        faggoticon.click();
        
        WebElement backicon 		= driver.findElement(backtap);
        backicon.click();
        
        Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject56 =new HashMap<>();
		scrollObject56.put("direction", "down");
		scrollObject56.put("fagotplus", "fagotplus");
		driver.executeScript("mobile:scroll", scrollObject56);
		Thread.sleep(2000);
        
        
        WebElement faggotplus		= driver.findElement(fagotplus);
        int numberOfClicks = 3;
        for (int i = 0; i < numberOfClicks; i++) {   
        faggotplus.click();
        }
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addpoevent6");
            
        
		WebElement submit = driver.findElement(submitick);
		submit.click();
		 
        Thread.sleep(5500);
        
        
        
        
        
       	Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
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
	

