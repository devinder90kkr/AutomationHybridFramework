package cuesz04.Iosapp_member_home_Fuelscreen.Uploadphotocases.perform.pending;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.mobile.resources.mobileLocators;
import cuesz.mobile.resources.mobileTestData;
import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
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
@Feature ("Verify member able to add functionlaity related to add an event for Pre-performance functionlaity.")
public class Case47_Fuel_Addandevent_preperformance_additionalcase extends AppiummobileBase {
	
	mobileLocators locators = new mobileLocators();	
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
	@Description("Member scroll to add an Event screen for pre-perfoemnace detail verification")
    @Story("Scroll to Pre-performance detail and add its related values")
	public void Fuel_addaneventadditionalcasewithpreperformance() throws InterruptedException {	

		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
//        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
		 appiumUtils.launchAppWithPackageId(mobileTestData.bundelID);
		
		WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
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
    //    Thread.sleep(3500);
     // Wait for the "Add An Event" text to appear on the screen
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.presenceOfElementLocated(mobileLocators.addeventlabel));
        
        Thread.sleep(3500);
		 By addeventlocator = AppiumBy.accessibilityId("AddEvent");
	        if(!isElementPresent(driver, addeventlocator)){
	            // Scroll to "Basketball" if it's not present
	            HashMap<String,Object> scrollObject2 = new HashMap<>();
	            scrollObject2.put("direction", "down");
	            scrollObject2.put("During Performance", "During Performance");
	            driver.executeScript("mobile:scroll", scrollObject2);
	            Thread.sleep(2000);
	        }
         
        
//        // Method to scroll to perform screen
// 		HashMap<String,Object>scrollObject2 =new HashMap<>();
// 		scrollObject2.put("direction", "down");
// 		scrollObject2.put("Add An Event", "Add An Event");
// 		driver.executeScript("mobile:scroll", scrollObject2);
// 		Thread.sleep(2000);
        
		
        // Locate the element containing the perform
        WebElement eventadd = driver.findElement(mobileLocators.addeventlabel);
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
        WebElement addaneventbutton 	= driver.findElement(mobileLocators.eventbttn);
        addaneventbutton.click();
              
        // Locate the element related to cross icon
        WebElement eventcrossbutton 	= driver.findElement(mobileLocators.eventcross);
        eventcrossbutton.click();
        
        // again click on add an event button 
        addaneventbutton.click();
        
        // Locate Select activity field 
        WebElement selectacticity 	= driver.findElement(mobileLocators.selectactivityfield);
        selectacticity.click();
                
//        WebElement Activityname		= driver.findElement(Enteractivityname);   
//        Activityname.sendKeys("Walking");
        
        WebElement Activityname		= driver.findElement(mobileLocators.Enteractivityname);   
        Activityname.click();
   
        WebElement Activityname1	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"W\""));
        Activityname1.click();
        
        WebElement Activityname2	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"a\""));
        Activityname2.click();
        
        WebElement Activityname3	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"l\""));
        Activityname3.click();

        WebElement Activityname4	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"k\""));
        Activityname4.click();
        
        WebElement Activityname5	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"i\""));
        Activityname5.click();
        
        WebElement Activityname6	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"n\""));
        Activityname6.click();

        // Enter text for Search field 
        WebElement donekeypad	= driver.findElement(mobileLocators.doneclick);
     	donekeypad.click();
     	
     	 // Locate Select activity field 	
        WebElement selectwalking 	= driver.findElement(mobileLocators.walkingclikc);
        selectwalking.click();

        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addevent3"); 
      
     	// Select starttime	for add an event
        WebElement startTimerclick 	= driver.findElement(mobileLocators.startTime);
        startTimerclick.click();
        
        List<WebElement>values = driver.findElements(mobileLocators.pickerelement);

		for (int i=0; i<values.size();i++)
		{		
		System.out.println(values.get(i).getText());
		}
		
		values.get(0).sendKeys("8");
		values.get(0).sendKeys(Keys.TAB);

		Thread.sleep(3500);
		values.get(1).sendKeys("03");
		values.get(1).sendKeys(Keys.TAB);
		
		Thread.sleep(3500);
		values.get(2).sendKeys("AM");
		driver.findElement(mobileLocators.Doneclick).click();
       
		
		 // Click on start time 
        WebElement endTimerclick 	= driver.findElement(mobileLocators.endtime);
        endTimerclick.click();
        
        List<WebElement>values1 = driver.findElements(mobileLocators.pickerelement);

		for (int i=0; i<values1.size();i++)
		{		
		System.out.println(values1.get(i).getText());
		}
		
		values1.get(0).sendKeys("11");
		values1.get(0).sendKeys(Keys.TAB);

		Thread.sleep(3500);
		values1.get(1).sendKeys("33");
		values1.get(1).sendKeys(Keys.TAB);
		
		Thread.sleep(3500);
		values1.get(2).sendKeys("AM");
		driver.findElement(mobileLocators.Doneclick).click();
		
		// Click on plus icon from hydration
		WebElement hydrationclick = driver.findElement(mobileLocators.hydration);
		for (int i = 0; i < 4; i++) {
		    hydrationclick.click();
		}

		
		// Click on Electrolyte glasses
        By[] electrolyte = {mobileLocators.electro1, mobileLocators.electro2};
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
		
		WebElement tellusmre	= driver.findElement(mobileLocators.notesevent);
		tellusmre.sendKeys("Add values by automation tools");
		
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addevent4"); 
	
        Thread.sleep(2500);
		WebElement walkingtick = driver.findElement(mobileLocators.tickbttn);
		walkingtick.click();
		walkingtick.click();
	        
		Thread.sleep(5500);
		WebElement succeskip	= driver.findElement(mobileLocators.Skipclick);
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
        WebElement walkinghydration	= driver.findElement(mobileLocators.hydration1click);
        walkinghydration.click();
        
        // Click on plus icon from hydration
     	WebElement hydrationpopclick = driver.findElement(mobileLocators.hydrationplus);
     	for (int i = 0; i < 2; i++) {
     	hydrationpopclick.click();
     	}
        
     	// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addevent5");
        
     	WebElement hydrationsubmit	= driver.findElement(mobileLocators.submithydration);
     	hydrationsubmit.click();

     	// Add fuel data for pre-performance 
     	WebElement pluspreperformance	= driver.findElement(mobileLocators.preplusicon);
     	pluspreperformance.click();
        
     	//click on keypad Done button to hide keypad
        WebElement keypaddone	= driver.findElement(mobileLocators.doneclick);
        keypaddone.click();
        
        // Click on fuel search field 
        WebElement additionalfuel = driver.findElement(mobileLocators.additionalsearch);
        additionalfuel.click();
        
        WebElement searchtext1	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"F\""));
        searchtext1.click();
        
        WebElement searchtext2	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"i\""));
        searchtext2.click();
        
        WebElement searchtext3	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"s\""));
        searchtext3.click();

        WebElement searchtext4	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"h\""));
        searchtext4.click();

        WebElement Keypaddone	= driver.findElement(mobileLocators.doneclick);
        Keypaddone.click();
        
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addevent6");
        
        Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject57 =new HashMap<>();
		scrollObject57.put("direction", "down");
		scrollObject57.put("fish", "fish");
		driver.executeScript("mobile:scroll", scrollObject57);
		Thread.sleep(2000);
        
        
        WebElement fuelselection	= driver.findElement(mobileLocators.fish);
        fuelselection.click();
		
        WebElement fueldelete	= driver.findElement(mobileLocators.fishRemove);
        fueldelete.click();
        
        // Click on fuel search field 
        WebElement additionalfuel2 = driver.findElement(mobileLocators.additionalsearch);
        additionalfuel2.click();
        
        WebElement searchtext11	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"G\""));
        searchtext11.click();
        
        WebElement searchtext21	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"o\""));
        searchtext21.click();
        
        WebElement searchtext31	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"a\""));
        searchtext31.click();
        
        WebElement Keypaddone1	= driver.findElement(mobileLocators.doneclick);
        Keypaddone1.click();
        
        WebElement brandedShowmore	= driver.findElement(mobileLocators.Showclick);
        brandedShowmore.click();
                
        Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject1 =new HashMap<>();
		scrollObject1.put("direction", "down");
		scrollObject1.put("Goat Cheese", "Goat Cheese");
		driver.executeScript("mobile:scroll", scrollObject1);
		
		WebElement fuelselection1	= driver.findElement(mobileLocators.Cheesegoat);
        fuelselection1.click();
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addevent7");
        
        Thread.sleep(2500);
        WebElement submititems	= driver.findElement(mobileLocators.submitclick);
        submititems.click();
        
        Thread.sleep(4500);
        
        WebElement uploadpreimage	= driver.findElement(mobileLocators.Uploadimage);
        uploadpreimage.click();
                
        WebElement galleryclick	= driver.findElement(mobileLocators.gallery);
        galleryclick.click();
        
        WebElement firstPhoto = driver.findElement(AppiumBy.xpath("//XCUIElementTypeImage[2]"));
        firstPhoto.click();
        
        WebElement addclick = driver.findElement(AppiumBy.accessibilityId("Add"));
        addclick.click();
        
        // Click on timer 
        WebElement Timerclick 	= driver.findElement(mobileLocators.Time);
        Timerclick.click();
        
        List<WebElement>values2 = driver.findElements(mobileLocators.pickerelement);

		for (int i=0; i<values2.size();i++)
		{		
		System.out.println(values2.get(i).getText());
		}
		
		values2.get(0).sendKeys("8");
		values2.get(0).sendKeys(Keys.TAB);

		Thread.sleep(3500);
		values2.get(1).sendKeys("13");
		values2.get(1).sendKeys(Keys.TAB);
		
		Thread.sleep(3500);
		values2.get(2).sendKeys("AM");

		driver.findElement(mobileLocators.Doneclick).click();
		
		 // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addevent8");
		
        
		WebElement Submittap = driver.findElement(mobileLocators.submittap);
		Submittap.click();

						
		Thread.sleep(3500);
		WebElement infoicon		= driver.findElement(mobileLocators.infoclick);
		infoicon.click();
		
		Thread.sleep(3000); 
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject3 =new HashMap<>();
		scrollObject3.put("direction", "down");
		scrollObject3.put("Source", "Source");
		driver.executeScript("mobile:scroll", scrollObject3);
		Thread.sleep(2000);

		WebElement 	backincon	= driver.findElement(mobileLocators.backbttn);
		backincon.click();
		
		// Wait for the "Add An Event" text to appear on the screen
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait1.until(ExpectedConditions.presenceOfElementLocated(mobileLocators.performancetime));
		
		WebElement perperformanceetime	= driver.findElement(mobileLocators.performancetime);
		perperformanceetime.click();
		
		 // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addevent9");
		
		
		  List<WebElement>values5 = driver.findElements(mobileLocators.pickerelement);

			for (int i=0; i<values5.size();i++)
			{		
			System.out.println(values5.get(i).getText());
			}
			
			values5.get(0).sendKeys("6");
			values5.get(0).sendKeys(Keys.TAB);

			Thread.sleep(3500);
			values5.get(1).sendKeys("43");
			values5.get(1).sendKeys(Keys.TAB);
			
			Thread.sleep(3500);
			values5.get(2).sendKeys("AM");
			
			
			driver.findElement(mobileLocators.Doneclick).click();
		 // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addevent10");
        
       	Thread.sleep(2500);
//        driver.terminateApp("com.cuesz.mobile");
        driver.terminateApp(mobileTestData.bundelID);
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
	

