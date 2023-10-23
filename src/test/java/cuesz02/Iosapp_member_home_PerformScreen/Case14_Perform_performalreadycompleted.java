package cuesz02.Iosapp_member_home_PerformScreen;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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


public class Case14_Perform_performalreadycompleted extends AppiummobileBase {

	private By Homeclick = 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By performclick	= AppiumBy.accessibilityId("PERFORM_SCREEN");
	private By perfomplus	=	 AppiumBy.accessibilityId("AddEvent");
	private By additionalperform	= AppiumBy.accessibilityId("Start My Perform Activity");
	private By cross_additionalpopup 	= AppiumBy.accessibilityId("CrossClicked");
	private By performcompleted			= AppiumBy.accessibilityId("Perform Activity Already Completed");
	private By crossicon				= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"CrossClicked\"])[6]");
	private By activityfield			= AppiumBy.accessibilityId("Type Here");
	private By activityfield1			= AppiumBy.accessibilityId("EnterActivityName");
//	private By input1					= AppiumBy.accessibilityId("EnterActivityName");
	private By Selectoption				= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Baseball \"`][3]");
	private By starttme					= AppiumBy.accessibilityId("Start");
	private By pickerelement			= AppiumBy.xpath("//XCUIElementTypePickerWheel");
	private By Doneclick				= AppiumBy.iOSNsPredicateString("label == \"Done\"");
	
	private By Endtme					= AppiumBy.accessibilityId("End");
	
	
	private By Scro1					= AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"4\"`][1]");
	private By Scro2					= AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"6\"`][1]");
	private By Scro3					= AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"2\"`][1]");
	private By Scro4					= AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"8\"`][1]");
	
	private By sesson1					= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"2\"`][6]");
	private By sesson2					= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"3\"`][6]");
	private By sesson3					= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"5\"`][6]");
	
	
	private By noteclcik				= AppiumBy.accessibilityId("Notes");
	private By donebttn 				= AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"DONE\"`]");
	private By Submitclick				= AppiumBy.accessibilityId("Submit");
	private By importicon				= AppiumBy.accessibilityId("Baseball ImportIcon");
	private By importlatericon			= AppiumBy.accessibilityId("Import later");
	
	private By graphclick				= AppiumBy.accessibilityId("Baseball GraphIcon");
	private By graphclse				= AppiumBy.accessibilityId("CrossClicked");
	
	private By deletebaseball		= AppiumBy.accessibilityId("Baseball DeleteIcon");
	private By nodelete 			= AppiumBy.accessibilityId("No");
	private By yesdelete 			= AppiumBy.accessibilityId("Yes");
	
	
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
		
		WebElement additionalperformcompleted = driver.findElement(performcompleted);
		additionalperformcompleted.click();
		
		
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
		
		WebElement Activityinput = driver.findElement(activityfield);
		Activityinput.click();
		
		WebElement Activityinput1 = driver.findElement(activityfield1);
		Activityinput1.click();
		
		WebElement Searchinput1 	= driver.findElement(AppiumBy.accessibilityId("B"));
		Searchinput1.click();
	
		WebElement Searchinput2 	= driver.findElement(AppiumBy.accessibilityId("a"));
		Searchinput2.click();
		
		WebElement Searchinput3 	= driver.findElement(AppiumBy.accessibilityId("s"));
		Searchinput3.click();
		
		WebElement Searchinput4 	= driver.findElement(AppiumBy.accessibilityId("e"));
		Searchinput4.click();
		
		WebElement Searchinput5 	= driver.findElement(AppiumBy.accessibilityId("b"));
		Searchinput5.click();
		
		WebElement Searchinput6 	= driver.findElement(AppiumBy.accessibilityId("a"));
		Searchinput6.click();

		WebElement Searchinput7 	= driver.findElement(AppiumBy.accessibilityId("l"));
		Searchinput7.click();
		
		WebElement Searchinput8 	= driver.findElement(AppiumBy.accessibilityId("l"));
		Searchinput8.click();
		
		WebElement doneactivity 	= driver.findElement(AppiumBy.accessibilityId("Done"));
		doneactivity.click();	
		
		WebElement Selectactivity = driver.findElement(Selectoption);
		Selectactivity.click();
		
		WebElement Startselect	= driver.findElement(starttme);
		Startselect.click();
		
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
	
		driver.findElement(Doneclick).click();
	
		WebElement Endselect	= driver.findElement(Endtme);
		Endselect.click();
		
		List<WebElement>values1 = driver.findElements(pickerelement);

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
	
		driver.findElement(Doneclick).click();
		
		
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
		
		
		WebElement tickbutton 	= driver.findElement(Submitclick);
		tickbutton.click();
		Thread.sleep(3500);

		Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject1 =new HashMap<>();
		scrollObject1.put("direction", "down");
		scrollObject1.put("Baseball", "Baseball");
		driver.executeScript("mobile:scroll", scrollObject1);
		Thread.sleep(2000);
		
		// Click on Import icon
        WebElement importnow	= driver.findElement(importicon);
        importnow.click();
        
        Thread.sleep(3500);
      		// Capture a screenshot and attach it to Allure
              AllureUtils.captureScreenshot(driver, "perform6");
        
        WebElement importlater	= driver.findElement(importlatericon);
        importlater.click();
        
        
        // Click on graph icon
        WebElement graphicon	= driver.findElement(graphclick);
		graphicon.click();
		
		
		Thread.sleep(3500);
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "perform8");
        
		WebElement graphclose	= driver.findElement(graphclse);
		graphclose.click();
		
		WebElement deleteaddiotnal	= driver.findElement(deletebaseball);
		deleteaddiotnal.click();
		
		WebElement nodeleteoption	= driver.findElement(nodelete);
		nodeleteoption.click();
		
		WebElement deleteaddiotnal1	= driver.findElement(deletebaseball);
		deleteaddiotnal1.click();
		
		WebElement yesdeleteoption	= driver.findElement(yesdelete);
		yesdeleteoption.click();
		
		
		Thread.sleep(3500);
        driver.terminateApp("com.cuesz.mobile");
	
	
	
	}}
