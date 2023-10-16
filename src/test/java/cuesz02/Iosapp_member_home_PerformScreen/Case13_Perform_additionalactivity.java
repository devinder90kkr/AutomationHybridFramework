package cuesz02.Iosapp_member_home_PerformScreen;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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

@Epic ("Perform detail")
@Feature ("Verify Additional perform activity functionlaity")


public class Case13_Perform_additionalactivity extends AppiummobileBase {

	private By Homeclick = 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By performclick	= AppiumBy.accessibilityId("PERFORM_SCREEN");
	private By perfomplus	=	 AppiumBy.accessibilityId("AddEvent");
	private By additionalperform	= AppiumBy.accessibilityId("Start My Perform Activity");
	private By cross_additionalpopup 	= AppiumBy.accessibilityId("CrossClicked");
	private By searcharea			= AppiumBy.accessibilityId("EnterActivityName");
	private By doneclick			= AppiumBy.accessibilityId("Done");
	private By selectactivity		= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"Walking\"])[3]");

	
	private By Syncclick	= AppiumBy.accessibilityId("SyncDevice");
	private By Enabletick	= AppiumBy.accessibilityId("EnableBluetooth");
	private By deviation	= AppiumBy.accessibilityId("AddDeviation");
	private By Crossclick	= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"CrossClicked\"`][2]");
	private By lessthanprecribeclick	= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Less Than Prescribed\"`][3]");
	private By morethanprecribeclick	= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"More Than Prescribed\"`][3]");
	private By Injury					= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"ItemPressed\"])[4]");
	private By Noteclick				= AppiumBy.accessibilityId("Notes");
	private By tickclick				= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"Submit\"])[2]");
	private By Donetap					= AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"DONE\"`]");
	private By tickbttn					= AppiumBy.accessibilityId("Submit");
	private By nobttn					= AppiumBy.accessibilityId("No");
	private By yesbttn					= AppiumBy.accessibilityId("Yes");
	private By submiticon				= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"Submit\"])[2]");
	private By crossicon				= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"CrossClicked\"`][4]");	
	private By Scro1					= AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"4\"`][1]");
	private By Scro2					= AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"6\"`][1]");
	private By Scro3					= AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"2\"`][1]");
	private By Scro4					= AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"8\"`][1]");
	private By sesson1					= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"2\"`][6]");
	private By sesson2					= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"3\"`][6]");
	private By sesson3					= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"5\"`][6]");
	private By noteclcik				= AppiumBy.accessibilityId("Notes");
	private By donebttn 				= AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"DONE\"`]");
	private By tick 					= AppiumBy.accessibilityId("Submit");
	private By graphclick				= AppiumBy.accessibilityId("WalkingGraphIcon");
	private By graphclse				= AppiumBy.accessibilityId("CrossClicked");
	private By importicon				= AppiumBy.accessibilityId("WalkingImportIcon");
	private By importlatericon			= AppiumBy.accessibilityId("Import later");
	private By deviationicon			= AppiumBy.accessibilityId("WalkingDeviationIcon");
	private By crossicondeviation				= AppiumBy.accessibilityId("CrossClicked");
	
	
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify perform screen & check Additional activity functionlaity.")
    @Story("here, we need to verify Additional perform activity functionality")	
	
	public void perfom_recommendedactivty() throws InterruptedException
	{	

		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");
		
		// CLick on home menu from bottom
		WebElement Homeicon = driver.findElement(Homeclick);
		Homeicon.click();
		
		Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject =new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("Perform Fuel Mindful Restore", "Perform");
		driver.executeScript("mobile:scroll", scrollObject);
		Thread.sleep(2000);
		
		
		// CLick on Perform card
		WebElement performcard = driver.findElement(performclick);
		performcard.click();

		
		WebElement perfomplusicon 	= driver.findElement(perfomplus);
		perfomplusicon.click();
		
		WebElement startmyperformactivity 	= driver.findElement(additionalperform);
		startmyperformactivity.click();
		
		WebElement startmyperfromactivitycross 	= driver.findElement(cross_additionalpopup);
		startmyperfromactivitycross.click();
		
		// repeat steps again 
		WebElement perfomplusicon1 	= driver.findElement(perfomplus);
		perfomplusicon1.click();
		
		WebElement startmyperformactivity2 	= driver.findElement(additionalperform);
		startmyperformactivity2.click();
		
		// Enter text for Search field 
		WebElement Additonalperformsearch	= driver.findElement(searcharea);
		Additonalperformsearch.sendKeys("Walking");
		
		// Enter text for Search field 
		WebElement donekeypad	= driver.findElement(doneclick);
		donekeypad.click();
		
		// Select perform aditonal activity 
		WebElement selectbaseball 	= driver.findElement(selectactivity);
		selectbaseball.click();
	
		
		
		// CLick on Walking  card
				WebElement syncdevice = driver.findElement(Syncclick);
				syncdevice.click();	
				
				
				WebElement bluetoothtick = driver.findElement(Enabletick);
				bluetoothtick.click();
		     
				// Capture a screenshot and attach it to Allure
		        AllureUtils.captureScreenshot(driver, "perform2");
						
				// Click on deviation 
				WebElement adddeviation = driver.findElement(deviation);
				adddeviation.click();
				
				// Click on deviation 
				WebElement deviationcrossclick = driver.findElement(Crossclick);
				deviationcrossclick.click();
				
				// Click on deviation 
				WebElement adddeviation2 = driver.findElement(deviation);
				adddeviation2.click();
				
				// Click on deviation option-1
				WebElement lessprecribed = driver.findElement(lessthanprecribeclick);
				lessprecribed.click();
						
				// Click on deviation option-2
				WebElement moreprecribed = driver.findElement(morethanprecribeclick);
				moreprecribed.click();
				
				// Click on deviation option-1
				WebElement lessprecribed1 = driver.findElement(lessthanprecribeclick);
				lessprecribed1.click();
				
				// Click on deviation option-1
				WebElement injuryoption = driver.findElement(Injury);
				injuryoption.click();
				

				WebElement notes = driver.findElement(Noteclick);
				notes.sendKeys("verify field accept automate values in Notes field");
				
				Thread.sleep(3500);
				// Capture a screenshot and attach it to Allure
		        AllureUtils.captureScreenshot(driver, "perform3");
				
				WebElement Donebutton = driver.findElement(Donetap);
				Donebutton.click();
				

				WebElement tickicon = driver.findElement(tickclick);
				tickicon.click();

				
				WebElement walkingtick = driver.findElement(tickbttn);
				walkingtick.click();
				
				WebElement noption = driver.findElement(nobttn);
				noption.click();
				
				WebElement walkingtick1 = driver.findElement(tickbttn);
				walkingtick1.click();
				
				WebElement yesption = driver.findElement(yesbttn);
				yesption.click();
				
				
				WebElement submitclick = driver.findElement(submiticon);
				submitclick.click();
				
				// Check if the Crossclick element is displayed before clicking on it
				WebElement Crossclick = null;
				try {
				    Crossclick = driver.findElement(crossicon);
				    if (Crossclick.isDisplayed()) {
				        Crossclick.click();
				    } else {
				        // Handle the case where the element is not displayed
				        System.out.println("Crossclick element is not displayed.");
				        // Perform some other action or throw an exception if needed
				    }
				} catch (NoSuchElementException e) {
				    // Handle the case where the element is not found
				    System.out.println("Crossclick element not found.");
				    // Perform some other action or throw an exception if needed
				}
				
			
				// Slider handle for score your activity 
				WebElement Score1 =driver.findElement(Scro1);
				Score1.click();
				WebElement Score2 =driver.findElement(Scro2);
				Score2.click();
				WebElement Score3 =driver.findElement(Scro3);
				Score3.click();
				WebElement Score4 =driver.findElement(Scro4);
				Score4.click();
				
				
				// Slider handle for enjoy your session
				WebElement session1 =driver.findElement(sesson1);
				session1.click();
				WebElement session2 =driver.findElement(sesson2);
				session2.click();
				WebElement session3 =driver.findElement(sesson3);
				session3.click();
				
				
				WebElement tellusmore = driver.findElement(noteclcik);
				tellusmore.sendKeys("Are you looking for feedback for a job performance review, a presentation, a project, or something else");
				
				
				Thread.sleep(3500);
				// Capture a screenshot and attach it to Allure
		        AllureUtils.captureScreenshot(driver, "perform4");
					
				WebElement telldone = driver.findElement(donebttn);
				telldone.click();
				
				WebElement feedbacktick = driver.findElement(tick);
				feedbacktick.click();
				
					
				Thread.sleep(3500);
				// Capture a screenshot and attach it to Allure
		        AllureUtils.captureScreenshot(driver, "perform5");
		        
//		        // Click on Import icon
//		        WebElement importnow	= driver.findElement(importicon);
//		        importnow.click();
//		        
//		        Thread.sleep(3500);
//		      		// Capture a screenshot and attach it to Allure
//		              AllureUtils.captureScreenshot(driver, "perform6");
//		        
//		        WebElement importlater	= driver.findElement(importlatericon);
//		        importlater.click();
		        
		      
		 
		        // Click on deviation icon
		        WebElement deviation	= driver.findElement(deviationicon);
		        deviation.click();
		        
		        Thread.sleep(3500);
				// Capture a screenshot and attach it to Allure
		        AllureUtils.captureScreenshot(driver, "perform7");
		        
		        WebElement deviationcross 	= driver.findElement(crossicondeviation);
		        deviationcross.click();  
		        
		        
		        
		        // Click on graph icon
		        WebElement graphicon	= driver.findElement(graphclick);
				graphicon.click();
				
				
				Thread.sleep(3500);
				// Capture a screenshot and attach it to Allure
		        AllureUtils.captureScreenshot(driver, "perform8");
		        
				WebElement graphclose	= driver.findElement(graphclse);
				graphclose.click();
				
				
		
		
		Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
	
	
	
	}}
