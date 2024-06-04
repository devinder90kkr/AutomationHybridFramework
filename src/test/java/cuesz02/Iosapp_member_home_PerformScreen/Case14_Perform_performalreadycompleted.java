package cuesz02.Iosapp_member_home_PerformScreen;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import cuesz.utils.mobile.mobileLocators;
import cuesz.utils.mobile.mobileTestData;
import cuesz.utils.reporting.AllureUtils;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Perform detail")
@Feature ("Verify Additional perform activity functionlaity")


public class Case14_Perform_performalreadycompleted extends AppiummobileBase {
	
	mobileLocators locators = new mobileLocators();
	private static final Logger LOGGER = LoggerFactory.getLogger(Case14_Perform_performalreadycompleted.class);
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify perform screen & check Additional activity functionlaity.")
    @Story("here, we need to verify Additional perform activity functionality")	
	
	public void perfom_additonalactivtycompleted() throws InterruptedException
	{	

		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");
		
		// CLick on home menu from bottom
		WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
		Homeicon.click();
		
		 // Log console message to Allure
        LOGGER.info("Click on home menu from bottom");
        AllureUtils.logStep("Click on home menu from bottom");
		
		Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject =new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("Perform Fuel Mindful Restore", "Perform");
		driver.executeScript("mobile:scroll", scrollObject);
		Thread.sleep(2000);
		
		
		 // Log console message to Allure
        LOGGER.info("Scroll down to cards");
        AllureUtils.logStep("Scroll down to cards");
        
        
		// CLick on Perform card
		WebElement performcard = driver.findElement(mobileLocators.performclick);
		performcard.click();
	
		 // Log console message to Allure
        LOGGER.info("Click on perform card ");
        AllureUtils.logStep("Click on perform card");
		
		// Capture a screenshot and attach it to Allure
	    AllureUtils.captureScreenshot(driver, "perform_additional1");
		
		WebElement perfomplusicon 	= driver.findElement(mobileLocators.perfomplus);
		perfomplusicon.click();
		
		// Log console message to Allure
        LOGGER.info("Click on plus icon  for open popup related to Start my perform & Perfom activity completed");
        AllureUtils.logStep("Click on plus icon  for open popup related to Start my perform & Perfom activity completed");
		
		WebElement startmyperformactivity 	= driver.findElement(mobileLocators.additionalperform);
		startmyperformactivity.click();
		
		// Log console message to Allure
        LOGGER.info("Click on Start my perform button");
        AllureUtils.logStep("Click on Start my perform button");
		
		WebElement startmyperfromactivitycross 	= driver.findElement(mobileLocators.cross_additionalpopup);
		startmyperfromactivitycross.click();
		
		// Log console message to Allure
        LOGGER.info("Click on Cross button to close popup");
        AllureUtils.logStep("Click on Cross button to close popup");
		
		
		// repeat steps again 
		WebElement perfomplusicon1 	= driver.findElement(mobileLocators.perfomplus);
		perfomplusicon1.click();
		
		// Log console message to Allure
        LOGGER.info("Click again on to open Start my perform button");
        AllureUtils.logStep("Click again on to open Start my perform button");
		
		
		WebElement additionalperformcompleted = driver.findElement(mobileLocators.performcompleted);
		additionalperformcompleted.click();
		
		
		// Log console message to Allure
        LOGGER.info("Click again on popup and select perform already completed");
        AllureUtils.logStep("Click again on popup and select perform already completed");
		
		
		// Check if the Crossclick element is displayed before clicking on it
				WebElement Crossclick = null;
				try {
				    Crossclick = driver.findElement(mobileLocators.crossicon);
				    if (Crossclick.isDisplayed()) {
				        Crossclick.click();
				        
				        // Log console message to Allure
	     		        LOGGER.info("Cross click found and clickable");
	     			    AllureUtils.logStep("Cross click found and clickable");
	     			    
				    } else {
				        // Handle the case where the element is not displayed
				        System.out.println("Crossclick element is not displayed.");
				        // Perform some other action or throw an exception if needed
				        
				        // Log console message to Allure
	     		        LOGGER.info("Crossclick element is not displayed.");
	     			    AllureUtils.logStep("Crossclick element is not displayed.");
				    }
				} catch (NoSuchElementException e) {
				    // Handle the case where the element is not found
				    System.out.println("Crossclick element not found.");
				    // Perform some other action or throw an exception if needed
				    // Log console message to Allure
     		        LOGGER.info("Crossclick element is not displayed.");
     			    AllureUtils.logStep("Crossclick element is not displayed.");
				}
		
		WebElement Activityinput = driver.findElement(mobileLocators.activityfield);
		Activityinput.click();
		
		 // Log console message to Allure
	        LOGGER.info("Click on activity and landed on additonal perfom activity feedback screen");
		    AllureUtils.logStep("Click on activity and landed on additonal perfom activity feedback screen");
		
		WebElement Activityinput1 = driver.findElement(mobileLocators.activityfield1);
		Activityinput1.click();
		
		// Input boxing letter in field 
		WebElement Searchinput1 	= driver.findElement(mobileLocators.letter1);
		Searchinput1.click();
	
		WebElement Searchinput2 	= driver.findElement(mobileLocators.letter2);
		Searchinput2.click();
		
		WebElement Searchinput3 	= driver.findElement(mobileLocators.letter3);
		Searchinput3.click();
		
		WebElement Searchinput4 	= driver.findElement(mobileLocators.letter4);
		Searchinput4.click();
		
		WebElement Searchinput5 	= driver.findElement(mobileLocators.letter5);
		Searchinput5.click();
		
		WebElement Searchinput6 	= driver.findElement(mobileLocators.letter6);
		Searchinput6.click();
		// Log console message to Allure
			LOGGER.info("Enter activity name");
		    AllureUtils.logStep("Enter activity name");
		
		WebElement doneactivity 	= driver.findElement(AppiumBy.accessibilityId("Done"));
		doneactivity.click();	
		
		WebElement Selectactivity = driver.findElement(mobileLocators.Selectoption);
		Selectactivity.click();
		
		WebElement Startselect	= driver.findElement(mobileLocators.starttme);
		Startselect.click();
		
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
	
		driver.findElement(mobileLocators.Doneclick).click();
	
		WebElement Endselect	= driver.findElement(mobileLocators.Endtme);
		Endselect.click();
		
		
		
		List<WebElement>values1 = driver.findElements(mobileLocators.pickerelement);

		for (int i=0; i<values1.size();i++)
		{		
		System.out.println(values1.get(i).getText());
		}
		
		values1.get(0).sendKeys("7");
		values1.get(0).sendKeys(Keys.TAB);

		Thread.sleep(2500);
		values1.get(1).sendKeys("16");
		values1.get(1).sendKeys(Keys.TAB);
		
		Thread.sleep(2500);
		values1.get(2).sendKeys("AM");
		
		// Log console message to Allure
		LOGGER.info("Enter start time and endtime");
	    AllureUtils.logStep("Enter start and end time");

	
		driver.findElement(mobileLocators.Doneclick).click();
		
		
		// Slider handle for score your activity 
 		WebElement Score1 =driver.findElement(mobileLocators.Scro1);
 		Score1.click();
 		WebElement Score2 =driver.findElement(mobileLocators.Scro2);
 		Score2.click();
 		WebElement Score3 =driver.findElement(mobileLocators.Scro3);
 		Score3.click();
 		WebElement Score4 =driver.findElement(mobileLocators.Scro4);
 		Score4.click();
 		
 		
 		// Slider handle for enjoy your session
 		WebElement session1 =driver.findElement(mobileLocators.sesson1);
 		session1.click();
 		WebElement session2 =driver.findElement(mobileLocators.sesson2);
 		session2.click();
 		WebElement session3 =driver.findElement(mobileLocators.sesson3);
 		session3.click();
				
		WebElement tellusmore = driver.findElement(mobileLocators.noteclcik);
		tellusmore.sendKeys(mobileTestData.notefield);
		
		
		
		
		// Log console message to Allure
		LOGGER.info("Select score to activity and session rating");
	    AllureUtils.logStep("Select score to activity and session rating");
			    
			    
		Thread.sleep(3500);
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform4");
			
        WebElement telldone = driver.findElement(mobileLocators.donebttn);
 		telldone.click();
		
		
		WebElement tickbutton 	= driver.findElement(mobileLocators.Submitclick);
		tickbutton.click();
		Thread.sleep(3500);
		
		// Log console message to Allure
		LOGGER.info("Submit rating and activity");
	    AllureUtils.logStep("Submit rating and activity");

		
		By walkingperformlLocator = AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Boxing\"`]");
        if(!isElementPresent(driver, walkingperformlLocator)){
            // Scroll to "Basketball" if it's not present
            HashMap<String,Object> scrollObject1 = new HashMap<>();
            scrollObject1.put("direction", "down");
            scrollObject1.put("Baseball", "Baseball");
            driver.executeScript("mobile:scroll", scrollObject1);
            Thread.sleep(2000);
        }
			
		// Click on Import icon
        WebElement importnow	= driver.findElement(mobileLocators.importicon1);
        importnow.click();
        
        Thread.sleep(3500);
      		// Capture a screenshot and attach it to Allure
              AllureUtils.captureScreenshot(driver, "perform6");
        
        WebElement importlater	= driver.findElement(mobileLocators.importlatericon);
        importlater.click();
        
    	// Log console message to Allure
		LOGGER.info("Select import icon");
	    AllureUtils.logStep("Select import icon");
        
        
        // Click on graph icon
        WebElement graphicon	= driver.findElement(mobileLocators.graphclick1);
		graphicon.click();
		
		
		Thread.sleep(3500);
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform8");
        
		WebElement graphclose	= driver.findElement(mobileLocators.graphclse);
		graphclose.click();
		
		// Log console message to Allure
				LOGGER.info("Select graph icon");
			    AllureUtils.logStep("Select graph icon");
		
		WebElement deleteaddiotnal	= driver.findElement(mobileLocators.deleteboxing);
		deleteaddiotnal.click();
		
		WebElement nodeleteoption	= driver.findElement(mobileLocators.nodelete);
		nodeleteoption.click();
		
		WebElement deleteaddiotnal1	= driver.findElement(mobileLocators.deleteboxing);
		deleteaddiotnal1.click();
		
		WebElement yesdeleteoption	= driver.findElement(mobileLocators.yesdelete);
		yesdeleteoption.click();
		// Log console message to Allure
		LOGGER.info("Select delete and its feature ");
	    AllureUtils.logStep("Select delete and its feature ");
		
		Thread.sleep(3500);
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
