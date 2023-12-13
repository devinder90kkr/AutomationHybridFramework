package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AllureUtils;
import cuesz.utils.AppiumappUtils;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Member Add an event screen detail ")
@Feature ("Verify member able to functionlaity related to add an event functionlaity.")
public class Case46_Fuel_Addandevent_additionalwithdelete extends AppiummobileBase {
	
	private By Homeclick 		= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By addeventlabel	= 		AppiumBy.iOSNsPredicateString("label == \"Add An Event\"");
	private By eventbttn		=		AppiumBy.accessibilityId("AddEvent");
	private By eventcross		=		AppiumBy.accessibilityId("CrossClicked");
	private By selectactivityfield		=	AppiumBy.accessibilityId("SelectActivity");
	private By doneclick		= 		AppiumBy.accessibilityId("Done");
	private By walkingclikc		=		AppiumBy.iOSNsPredicateString("label == \"Walking\"");
	private By Enteractivityname	=	AppiumBy.accessibilityId("EnterActivityName");
	private By startTime		=		AppiumBy.accessibilityId("FuelPerformStartTime");
	private By pickerelement	= 		AppiumBy.xpath("//XCUIElementTypePickerWheel");
	private By Doneclick		= 		AppiumBy.accessibilityId("AlcohalTime");
	private By endtime			=		AppiumBy.accessibilityId("FuelPerformEndTime");
	private By hydration		= 		AppiumBy.accessibilityId("FuelDrinkPlusIcon");
	private By electro1			= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"ElectrolyteDeviation\"`][2]");
	private By electro2			= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"ElectrolyteDeviation\"`][3]");
	private By notesevent		= 		AppiumBy.accessibilityId("EventNotes");
	private By tickbttn			= 		AppiumBy.iOSNsPredicateString("name == \"EventSubmit\"");
	private By Skipclick		= 		AppiumBy.accessibilityId("Skip");
	private By hydration1click	=		AppiumBy.accessibilityId("Walking-Hydration");
	private By hydrationplus	=		AppiumBy.accessibilityId("PlusHydrationGlass");
	private By submithydration	=		AppiumBy.accessibilityId("Submit");
	private By deleticon		=		AppiumBy.accessibilityId("Walking-Delete");
	private By yesdeleticon		=		AppiumBy.accessibilityId("Yes");
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Member add an Event screen detail verification")
    @Story("Scroll to add an event & verify its related fuel added")	
	public void Fuel_addaneventadditionalcasewithdelete() throws InterruptedException
	{	
		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
		
		WebElement Homeicon = driver.findElement(Homeclick);
		Homeicon.click();
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addevent1");
		
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
        Thread.sleep(3500);
        
        
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
        AllureUtils.captureScreenshot(driver, "addevent2"); 
        
        // Locate the element related to add event button 
        WebElement addaneventbutton 	= driver.findElement(eventbttn);
        addaneventbutton.click();
              
        // Locate the element related to cross icon
        WebElement eventcrossbutton 	= driver.findElement(eventcross);
        eventcrossbutton.click();
        
        // again click on add an event button 
        addaneventbutton.click();
        
        // Locate Select activity field 
        WebElement selectacticity 	= driver.findElement(selectactivityfield);
        selectacticity.click();
                
        WebElement Activityname		= driver.findElement(Enteractivityname);   
        Activityname.sendKeys("Walking");
        
        // Enter text for Search field 
        WebElement donekeypad	= driver.findElement(doneclick);
     	donekeypad.click();
     	
     	 // Locate Select activity field 	
        WebElement selectwalking 	= driver.findElement(walkingclikc);
        selectwalking.click();

        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addevent3"); 
      
     	// Select starttime	for add an event
        WebElement startTimerclick 	= driver.findElement(startTime);
        startTimerclick.click();
        
        List<WebElement>values = driver.findElements(pickerelement);

		for (int i=0; i<values.size();i++)
		{		
		System.out.println(values.get(i).getText());
		}
		
		values.get(0).sendKeys("10");
		values.get(0).sendKeys(Keys.TAB);

		Thread.sleep(3500);
		values.get(1).sendKeys("03");
		values.get(1).sendKeys(Keys.TAB);
		
		Thread.sleep(3500);
		values.get(2).sendKeys("AM");
		driver.findElement(Doneclick).click();
       
		
		 // Click on start time 
        WebElement endTimerclick 	= driver.findElement(endtime);
        endTimerclick.click();
        
        List<WebElement>values1 = driver.findElements(pickerelement);

		for (int i=0; i<values1.size();i++)
		{		
		System.out.println(values1.get(i).getText());
		}
		
		values1.get(0).sendKeys("10");
		values1.get(0).sendKeys(Keys.TAB);

		Thread.sleep(3500);
		values1.get(1).sendKeys("33");
		values1.get(1).sendKeys(Keys.TAB);
		
		Thread.sleep(3500);
		values1.get(2).sendKeys("AM");
		driver.findElement(Doneclick).click();
		
		// Click on plus icon from hydration
		WebElement hydrationclick = driver.findElement(hydration);
		for (int i = 0; i < 4; i++) {
		    hydrationclick.click();
		}

		
		// Click on Electrolyte glasses
        By[] electrolyte = {electro1, electro2};
        try {   
            // Click on glasses using a loop
            for (By locator6 : electrolyte) {
                try {
                    WebElement glass = driver.findElement(locator6);
                    glass.click();
                    // Add logic for validation or other actions if necessary
                } catch (NoSuchElementException e) {
                    System.out.println("Element not found: " + e.getMessage());
                    // Handle the exception (e.g., log, retry, or terminate the loop)
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }       
		
		WebElement tellusmre	= driver.findElement(notesevent);
		tellusmre.sendKeys("Add values by automation tools");
		
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addevent4"); 
	
        Thread.sleep(2500);
		WebElement walkingtick = driver.findElement(tickbttn);
		walkingtick.click();
		walkingtick.click();
	        
		Thread.sleep(5500);
		WebElement succeskip	= driver.findElement(Skipclick);
		succeskip.click();
	
		Thread.sleep(2500);
		WebElement headingverifiy	= driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Walking\"`][1]"));
		
		String expectedLabel = "Walking";
		String actualLabel = headingverifiy.getText();

		// Use TestNG assertion to compare the expected and actual labels
		Assert.assertEquals(actualLabel, expectedLabel, "Label verification failed!");

		// Log the expected and actual labels to Allure report
        Allure.addAttachment("Expected Label", expectedLabel);
        Allure.addAttachment("Actual Label", actualLabel);
		
        // Click on walking- hydration icon	
        WebElement walkinghydration	= driver.findElement(hydration1click);
        walkinghydration.click();
        
        // Click on plus icon from hydration
     	WebElement hydrationpopclick = driver.findElement(hydrationplus);
     	for (int i = 0; i < 2; i++) {
     	hydrationpopclick.click();
     	}
        
     	WebElement hydrationsubmit	= driver.findElement(submithydration);
     	hydrationsubmit.click();

     	// Click on delte icon for walking event
     	WebElement deletehydration	= driver.findElement(deleticon);
     	deletehydration.click();
     	
     // Click on delte icon for walking event
     	WebElement yesdeletehydration	= driver.findElement(yesdeleticon);
     	yesdeletehydration.click();
     	
     	
		Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
	}
}
	

