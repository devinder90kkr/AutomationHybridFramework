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

import cuesz.utils.mobileLocators;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Allure;
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
        
     
        
      try {
    	 
    	// Method to scroll to perform screen
  		HashMap<String,Object>scrollObject1 =new HashMap<>();
  		scrollObject1.put("direction", "down");
  		scrollObject1.put("Lunch", "Lunch");
  		driver.executeScript("mobile:scroll", scrollObject1);
  		Thread.sleep(2000);
    	  
    	  
  		// Method to scroll to perform screen
  		HashMap<String,Object>scrollObject51 =new HashMap<>();
  		scrollObject51.put("direction", "down");
  		scrollObject51.put("Basketball", "Basketball");
  		driver.executeScript("mobile:scroll", scrollObject51);
  		Thread.sleep(2000);
        

  		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addpoevent1");
  		
        WebElement preplusicon	= driver.findElement(mobileLocators.preicon1);
        preplusicon.click();
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone	= driver.findElement(mobileLocators.doneclick);
        keypaddone.click();
        
        // Locate and click on recommended Fuel button
        WebElement Recommendedfuel 	= driver.findElement(mobileLocators.recommendedclick);
        Recommendedfuel.click();
        Thread.sleep(5500);
        
    try {
        
        WebElement preheading	= driver.findElement(mobileLocators.headingpre);
        preheading.click();
        
        WebElement preperformancetick	= driver.findElement(mobileLocators.tickaction);
        preperformancetick.click();
                
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addpoevent2");
        
        // Click on timer 
        WebElement Timerclick 	= driver.findElement(mobileLocators.Time);
        Timerclick.click();
        
        List<WebElement>values = driver.findElements(mobileLocators.pickerelement);

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
		
		driver.findElement(mobileLocators.Doneclick).click();
        
		  // Click on Done-breakfast button
        WebElement brekfastdone 	= driver.findElement(mobileLocators.brekdone);
        brekfastdone.click();
        
        Thread.sleep(5500);
        
        } catch (Exception e) {
        	// If the arrowright element is not found, log an error message and terminate the app
            String errorMessage = "Arrowright element not found. Skipping further steps.";
            System.out.println(errorMessage);
            Allure.addAttachment("Error", errorMessage);
            AllureUtils.captureScreenshot(driver, "ArrowRightNotFound");
            driver.terminateApp("com.cuesz.mobile");
        }
        
    
        WebElement Duringplusicon	= driver.findElement(mobileLocators.duringicon);
        Duringplusicon.click();
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone2	= driver.findElement(mobileLocators.doneclick);
        keypaddone2.click();
        
        // Locate and click on recommended Fuel button
        WebElement Recommendedfuel2 	= driver.findElement(mobileLocators.recommendedclick);
        Recommendedfuel2.click();
        
        WebElement duringheading	= driver.findElement(mobileLocators.during1heading);
        duringheading.click();
       
        
        WebElement preperformancetick1	= driver.findElement(mobileLocators.tickaction);
        preperformancetick1.click();
                
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addpoevent2");
        
        // Click on timer 
        WebElement Timerclick1 	= driver.findElement(mobileLocators.Time);
        Timerclick1.click();
        
        List<WebElement>values1 = driver.findElements(mobileLocators.pickerelement);

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
		
		driver.findElement(mobileLocators.Doneclick).click();
        
		  // Click on Done-breakfast button
        WebElement brekfastdone1 	= driver.findElement(mobileLocators.brekdone);
        brekfastdone1.click();
        
        
        WebElement Postplusicon	= driver.findElement(mobileLocators.posticon);
        Postplusicon.click();
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone3	= driver.findElement(mobileLocators.doneclick);
        keypaddone3.click();
        
        // Locate and click on recommended Fuel button
        WebElement Recommendedfuel3 	= driver.findElement(mobileLocators.recommendedclick);
        Recommendedfuel3.click();
        
        WebElement duringheading3	= driver.findElement(mobileLocators.postheading);
        duringheading3.click();
       
        
        WebElement preperformancetick3 = driver.findElement(mobileLocators.tickaction);
        preperformancetick3.click();
        
        
        // Click on Done-breakfast button
        WebElement brekfastdone3 	= driver.findElement(mobileLocators.brekdone);
        brekfastdone3.click();
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addpoevent4");
        
        // Add additional values in pre-performance plus icon 
        WebElement preplusicon1	= driver.findElement(mobileLocators.preicon);
        preplusicon1.click();
        
      //click on keypad Done button to hide keypad
        WebElement keypaddone1	= driver.findElement(mobileLocators.doneclick);
        keypaddone1.click();
        
        // Click on fuel search field 
        WebElement additionalfuel = driver.findElement(mobileLocators.additionalsearch);
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
      
        WebElement Keypaddone	= driver.findElement(mobileLocators.doneclick);
        Keypaddone.click();
        
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addpoevent5");
        
        WebElement fuelselection	= driver.findElement(mobileLocators.faggot);
        fuelselection.click();
        
        WebElement faggoticon		= driver.findElement(mobileLocators.fagoticon);
        faggoticon.click();
        
        WebElement backicon 		= driver.findElement(mobileLocators.backtap);
        backicon.click();
        
        Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject56 =new HashMap<>();
		scrollObject56.put("direction", "down");
		scrollObject56.put("fagotplus", "fagotplus");
		driver.executeScript("mobile:scroll", scrollObject56);
		Thread.sleep(2000);
        
        
        WebElement faggotplus		= driver.findElement(mobileLocators.fagotplus);
        int numberOfClicks = 3;
        for (int i = 0; i < numberOfClicks; i++) {   
        faggotplus.click();
        }
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addpoevent6");            
        
		WebElement submit = driver.findElement(mobileLocators.submitick);
		submit.click();
		 
        Thread.sleep(5500);
        WebElement duringupload = driver.findElement(mobileLocators.uploadicon1);
        duringupload.click();
        
        WebElement galleryclick	= driver.findElement(mobileLocators.gallery);
        galleryclick.click();
        
        WebElement firstPhoto = driver.findElement(AppiumBy.xpath("//XCUIElementTypeImage[3]"));
        firstPhoto.click();
        
        WebElement addclick = driver.findElement(AppiumBy.accessibilityId("Add"));
        addclick.click();
           
		WebElement Submittap = driver.findElement(mobileLocators.submittap);
		Submittap.click();
        
		//scroll to image upload
		By imaguploadlLocator = AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Image uploaded\"`]");
	        if(!isElementPresent(driver, imaguploadlLocator)){
	            // Scroll to "Basketball" if it's not present
	            HashMap<String,Object> scrollObject11 = new HashMap<>();
	            scrollObject11.put("direction", "down");
	            scrollObject11.put("Image uploaded", "Image uploaded");
	            driver.executeScript("mobile:scroll", scrollObject11);
	            Thread.sleep(2000);
	        }
        
	    // Locate and click on post performance Fuel button
	    WebElement postperformanceplus = driver.findElement(mobileLocators.postplusicon);
 		postperformanceplus.click();
	        
 		
 		//click on keypad Done button to hide keypad
        WebElement keypaddone4	= driver.findElement(mobileLocators.doneclick);
        keypaddone4.click();
        
        // Click on fuel search field 
        WebElement additionalfuel2 = driver.findElement(mobileLocators.additionalsearch);
        additionalfuel2.click();
        
        WebElement searchtext11	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"M\""));
        searchtext11.click();
        
        WebElement searchtext21	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"e\""));
        searchtext21.click();
        
        WebElement searchtext31	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"a\""));
        searchtext31.click();

        WebElement searchtext41	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"t\""));
        searchtext41.click();

      
        WebElement Keypaddone1	= driver.findElement(mobileLocators.doneclick);
        Keypaddone1.click();

     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addpoevent7"); 
        
        
        WebElement fuelselection1	= driver.findElement(mobileLocators.meat1);
        fuelselection1.click();
        
        Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject57 =new HashMap<>();
		scrollObject57.put("direction", "down");
		scrollObject57.put("meatplus", "meatplus");
		driver.executeScript("mobile:scroll", scrollObject57);
		Thread.sleep(2000);
           
        WebElement meatclickplus		= driver.findElement(mobileLocators.meatplus);
        int numberOfClicks21 = 1;
        for (int i = 0; i < numberOfClicks21; i++) {   
        	meatclickplus.click();
        }
        
        WebElement fuelsearch 	= driver.findElement(mobileLocators.serchclick);
        fuelsearch.click();
        
        WebElement fuelsearch2 	= driver.findElement(mobileLocators.serchclick);
        fuelsearch2.click();
       
        WebElement searchtext71	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"R\""));
        searchtext71.click();
        
        WebElement searchtext51	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"o\""));
        searchtext51.click();
        
        WebElement searchtext61	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"o\""));
        searchtext61.click();

        WebElement searchtext81	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"t\""));
        searchtext81.click();
        
        WebElement Keypaddone2	= driver.findElement(mobileLocators.doneclick);
        Keypaddone2.click();
        
        WebElement Showmore		= driver.findElement(mobileLocators.Showclick);
        Showmore.click();

        WebElement Fuelselection3	= driver.findElement(mobileLocators.Beetroot);
        Fuelselection3.click();
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addpoevent8"); 
        
        
        Thread.sleep(2500);
        WebElement submit1 = driver.findElement(mobileLocators.submitick);
		submit1.click();
		
		Thread.sleep(2500);
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addpoevent9"); 
        
        Thread.sleep(3500);
        
      } catch (Exception e) {
      	// If the arrowright element is not found, log an error message and terminate the app
          String errorMessage = "recommended Fuel not found, So its Skipping further steps.";
          System.out.println(errorMessage);
          Allure.addAttachment("Error", errorMessage);
          AllureUtils.captureScreenshot(driver, "ArrowRightNotFound");
          driver.terminateApp("com.cuesz.mobile");
      }
	        
        
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
	

