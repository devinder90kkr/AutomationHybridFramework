package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AllureUtils;
import cuesz.utils.AppiumappUtils;
import cuesz.utils.DateUtilsAppium;
import cuesz.utils.mobileLocators;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Fuel screen detail ")
@Feature ("Verify Fuel detail functionlaity related to Optimal fuel.")
public class Case45_Fuel_Pastday1_brekfastactivity extends AppiummobileBase {
	
	mobileLocators locators = new mobileLocators();	

	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Member Fuel screen detail verification")
    @Story("Scroll to Fuel card and verify breakfast assigned by staff ")	
	public void Homescreen() throws InterruptedException
	{	
		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
		
		WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
		Homeicon.click();
		
		// Use the utility method
		DateUtilsAppium.clickOnPreviousDay(driver);
		
		Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject =new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("Perform Fuel Mindful Restore", "Perform");
		driver.executeScript("mobile:scroll", scrollObject);
		Thread.sleep(2000);

        //Click on Fuel tab 
        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();
        
        
        // Locate the element related to breakfast + icon 
        WebElement breakfastplus 	= driver.findElement(mobileLocators.plusadd);
        breakfastplus.click();
        
       //click on keypad Done button to hide keypad
        WebElement keypaddone	= driver.findElement(mobileLocators.doneclick);
        keypaddone.click();
        
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
        AllureUtils.captureScreenshot(driver, "additional1");
        
        WebElement fuelselection	= driver.findElement(mobileLocators.faggot);
        fuelselection.click();
        
        WebElement faggoticon		= driver.findElement(mobileLocators.fagoticon);
        faggoticon.click();
        
        WebElement backicon 		= driver.findElement(mobileLocators.backtap);
        backicon.click();
        
        Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject1 =new HashMap<>();
		scrollObject1.put("direction", "down");
		scrollObject1.put("fagotplus", "fagotplus");
		driver.executeScript("mobile:scroll", scrollObject1);
		Thread.sleep(2000);
        
        WebElement faggotplus		= driver.findElement(mobileLocators.fagotplus);
        int numberOfClicks = 3;
        for (int i = 0; i < numberOfClicks; i++) {   
        faggotplus.click();
        }
        
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "additional2");
        
        // Click on timer 
        WebElement Timerclick 	= driver.findElement(mobileLocators.Time);
        Timerclick.click();
        List<WebElement>values = driver.findElements(mobileLocators.pickerelement);
		for (int i=0; i<values.size();i++)
		{		
		System.out.println(values.get(i).getText());
		}
		values.get(0).sendKeys("8");
		values.get(0).sendKeys(Keys.TAB);
		Thread.sleep(3500);
		values.get(1).sendKeys("08");
		values.get(1).sendKeys(Keys.TAB);
		Thread.sleep(3500);
		values.get(2).sendKeys("AM");
		driver.findElement(mobileLocators.Doneclick).click();
        
		WebElement submit = driver.findElement(mobileLocators.submitick);
		submit.click();
		
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "additional3");
		/*****************************/
		
		
		 // Locate the element related to breakfast + icon 
        WebElement breakfastplus2 	= driver.findElement(mobileLocators.plusadd);
        breakfastplus2.click();
        
       //click on keypad Done button to hide keypad
        WebElement keypaddone3	= driver.findElement(mobileLocators.doneclick);
        keypaddone3.click();
        
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
        AllureUtils.captureScreenshot(driver, "additional4");
        
        
        WebElement fuelselection1	= driver.findElement(mobileLocators.meat);
        fuelselection1.click();
           
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
        AllureUtils.captureScreenshot(driver, "additional5");
        
        
        Thread.sleep(2500);
        WebElement submit1 = driver.findElement(mobileLocators.submitick);
		submit1.click();
//		
		Thread.sleep(2500);
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "additional6");
        
        WebElement backdaybuttonfuel	= driver.findElement(mobileLocators.backpress);
        backdaybuttonfuel.click();

        Thread.sleep(4500);
        
        Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject11 =new HashMap<>();
		scrollObject11.put("direction", "up");
		scrollObject11.put("Current 7 days", "Current 7 days");
		driver.executeScript("mobile:scroll", scrollObject11);
		Thread.sleep(2000);
        
        // Use the utility method
		DateUtilsAppium.clickOnPreviousDay(driver);
			
        //Click on Fuel tab 
        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();
        
        Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject111 =new HashMap<>();
		scrollObject111.put("direction", "down");
		scrollObject111.put("plusadd", "plusadd");
		driver.executeScript("mobile:scroll", scrollObject111);
		Thread.sleep(2000);
    
		
		
		
        
		Thread.sleep(4500);
        driver.terminateApp("com.cuesz.mobile");
	}
}
	

