package cuesz02.Iosapp_member_home_PerformScreen;

import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AllureUtils;
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

@Epic ("Perform detail")
@Feature ("Verify Additional perform activity functionlaity")


public class Case12_Perform_additionalactivity_deleteprocess extends AppiummobileBase {

	mobileLocators locators = new mobileLocators();	
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify perform screen & check Additional activity functionlaity with delete process.")
    @Story("here, we need to verify member able to delete additional perform activity functionality")	
	
	public void perfom_additionaldeleteactivty() throws InterruptedException
	{	

		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");
		
		// CLick on home menu from bottom
		WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
		Homeicon.click();
		
		Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject =new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("Perform Fuel Mindful Restore", "Perform");
		driver.executeScript("mobile:scroll", scrollObject);
		Thread.sleep(2000);
			
		// CLick on Perform card
		WebElement performcard = driver.findElement(mobileLocators.performclick);
		performcard.click();
		Thread.sleep(3500);
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform_click1");
		
		WebElement perfomplusicon 	= driver.findElement(mobileLocators.perfomplus);
		perfomplusicon.click();
		
		WebElement startmyperformactivity 	= driver.findElement(mobileLocators.additionalperform);
		startmyperformactivity.click();
		
		WebElement startmyperfromactivitycross 	= driver.findElement(mobileLocators.cross_additionalpopup);
		startmyperfromactivitycross.click();
		
		// repeat steps again 
		WebElement perfomplusicon1 	= driver.findElement(mobileLocators.perfomplus);
		perfomplusicon1.click();
		
		WebElement startmyperformactivity2 	= driver.findElement(mobileLocators.additionalperform);
		startmyperformactivity2.click();
		
		// Enter text for Search field 
		WebElement Additonalperformsearch	= driver.findElement(mobileLocators.searcharea);
		Additonalperformsearch.click();	
		// Enter text for Search field 
		WebElement Additonalperformsearch1	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"B\""));
		Additonalperformsearch1.click();

		// Enter text for Search field 
		WebElement Additonalperformsearch2	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"a\""));
		Additonalperformsearch2.click();

		// Enter text for Search field 
		WebElement Additonalperformsearch3	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"s\""));
		Additonalperformsearch3.click();

		// Enter text for Search field 
		WebElement Additonalperformsearch4	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"e\""));
		Additonalperformsearch4.click();
		

		// Enter text for Search field 
		WebElement Additonalperformsearch5	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"b\""));
		Additonalperformsearch5.click();

		// Enter text for Search field 
		WebElement Additonalperformsearch6	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"a\""));
		Additonalperformsearch6.click();
		
		// Enter text for Search field 
		WebElement Additonalperformsearch7	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"l\""));
		Additonalperformsearch7.click();
		
		// Enter text for Search field 
		WebElement Additonalperformsearch8	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"l\""));
		Additonalperformsearch8.click();
		
		
		// Enter text for Search field 
		WebElement donekeypad	= driver.findElement(mobileLocators.doneclick);
		donekeypad.click();
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform_click2");
		
		
		// Select perform aditonal activity 
		WebElement selectbaseball 	= driver.findElement(mobileLocators.selectactivity);
		selectbaseball.click();
		
		WebElement backactivity 	= driver.findElement(mobileLocators.backclick);
		backactivity.click();
		
		
		WebElement deleteaddiotnal	= driver.findElement(mobileLocators.deletebaseball);
		deleteaddiotnal.click();
		
		WebElement nodeleteoption	= driver.findElement(mobileLocators.nodelete);
		nodeleteoption.click();
		
		WebElement deleteaddiotnal1	= driver.findElement(mobileLocators.deletebaseball);
		deleteaddiotnal1.click();
		
		WebElement yesdeleteoption	= driver.findElement(mobileLocators.yesdelete);
		yesdeleteoption.click();
		
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform_click3");
		
		Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
	
	
	
	}}
