package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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

@Epic ("Fuel screen detail")
@Feature ("Verify Fuel detail functionlaity related to EarlySnacks functionlaity.")
public class Case29_Fuel_EarlySnacks_recommendedfuel extends AppiummobileBase {
	
	private By Homeclick = 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");

	private By earlysnacklabel	= 		AppiumBy.iOSNsPredicateString("name == 'Early Snacks'");
	private By iconearlysnacks	= 		AppiumBy.accessibilityId("Early SnacksInfoIcon");
	private By backicon			= 		AppiumBy.accessibilityId("BackPress");
	private By plusadd			= 		AppiumBy.accessibilityId("Early SnacksAddIcon");
	private By doneclick		= 		AppiumBy.accessibilityId("Done");
	private By recommendedclick	= 		AppiumBy.accessibilityId("AddRecommendedFuel");
	private By backicon1		= 		AppiumBy.accessibilityId("RecommendBackPress");
	private By rightarrow		= 		AppiumBy.accessibilityId("FuelCaloriesArrowRight");
	private By Time				= 		AppiumBy.accessibilityId("RecommendedFuelTime");
	private By pickerelement	= 		AppiumBy.xpath("//XCUIElementTypePickerWheel");
	private By Doneclick		= 		AppiumBy.accessibilityId("AlcohalTime");
	private By tickbreakfast	= 		AppiumBy.accessibilityId("RecommendedFuelSubmit");
	private By brekdone			= 		AppiumBy.accessibilityId("Done");
	private By Protcard			= 		AppiumBy.accessibilityId("Protein");
	private By crossicon1		= 		AppiumBy.accessibilityId("FuelMacroNutrientCross");
	private By carbcard			= 		AppiumBy.accessibilityId("Carbs");
	private By fatcard			= 		AppiumBy.accessibilityId("Fat");
	

	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Member Fuel screen detail verification")
    @Story("Scroll to Fuel card and verify EarlySnacks assigned by staff ")	
	public void Homescreen() throws InterruptedException
	{	
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
        
        
        
        // Method to scroll to perform screen
 		HashMap<String,Object>scrollObject1 =new HashMap<>();
 		scrollObject1.put("direction", "down");
 		scrollObject1.put("Early Snacks", "Early Snacks");
 		driver.executeScript("mobile:scroll", scrollObject1);
 		Thread.sleep(2000);
        
		
        // Locate the element containing the perform
        WebElement earlysnack = driver.findElement(earlysnacklabel);
        // Extract text from the element
        String actualText = earlysnack.getText();
        // Define the expected text
        String expectedText = "Early Snacks";
        
        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText);
        System.out.println("Expected Text: " + expectedText);
        // Compare the actual and expected text
        Assert.assertEquals(actualText, expectedText);
		
        
        // Locate and click on breakfasticon for cal related info
        WebElement earlysnackicon	= driver.findElement(iconearlysnacks);
        earlysnackicon.click();
        WebElement backclick	= driver.findElement(backicon);
        backclick.click();
        
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "earlysnack1");
        
        // Locate the element related to breakfast + icon 
        WebElement earlysnackplus 	= driver.findElement(plusadd);
        earlysnackplus.click();
        
       //click on keypad Done button to hide keypad
        WebElement keypaddone	= driver.findElement(doneclick);
        keypaddone.click();
        
        // Locate and click on recommended Fuel button
        WebElement Recommendedfuel 	= driver.findElement(recommendedclick);
        Recommendedfuel.click();
        WebElement recommendebackclick	= driver.findElement(backicon1);
        recommendebackclick.click();
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone1	= driver.findElement(doneclick);
        keypaddone1.click();
        // Locate and click on recommended Fuel button
        WebElement Recommendedfuel1 	= driver.findElement(recommendedclick);
        Recommendedfuel1.click();

       
        WebElement arrowright = driver.findElement(rightarrow);
        arrowright.click();
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "earlysnack2");

        
        // Click on timer 
        WebElement Timerclick 	= driver.findElement(Time);
        Timerclick.click();
        
        List<WebElement>values = driver.findElements(pickerelement);

		for (int i=0; i<values.size();i++)
		{		
		System.out.println(values.get(i).getText());
		}
		
		values.get(0).sendKeys("9");
		values.get(0).sendKeys(Keys.TAB);

		Thread.sleep(3500);
		values.get(1).sendKeys("03");
		values.get(1).sendKeys(Keys.TAB);
		
		Thread.sleep(3500);
		values.get(2).sendKeys("AM");
	
		   // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "earlysnack3");

		
		
		driver.findElement(Doneclick).click();
        
		// Click on breakfast-tick 
        WebElement breakfasttick	= driver.findElement(tickbreakfast);
        breakfasttick.click();
    		   
        // Click on Done-breakfast button
        WebElement brekfastdone 	= driver.findElement(brekdone);
        brekfastdone.click();
           
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "earlysnack4");
        
        Thread.sleep(4500);
  
        
     // Method to scroll to perform screen
  		HashMap<String,Object>scrollObject5 =new HashMap<>();
  		scrollObject5.put("direction", "up");
  		scrollObject5.put("DRINK MORE WATER", "DRINK MORE WATER");
  		driver.executeScript("mobile:scroll", scrollObject5);
  		Thread.sleep(2000);
        
    	// Method to scroll to perform screen
  		HashMap<String,Object>scrollObject3 =new HashMap<>();
  		scrollObject3.put("direction", "up");
  		scrollObject3.put("OPTIMAL FUEL TARGET ACHIEVED", "OPTIMAL FUEL TARGET ACHIEVED");
  		driver.executeScript("mobile:scroll", scrollObject3);
  		Thread.sleep(2000);
  		
  		
  		HashMap<String,Object>scrollObject4 =new HashMap<>();
  		scrollObject4.put("direction", "up");
  		scrollObject4.put("Carbs", "Carbs");
  		driver.executeScript("mobile:scroll", scrollObject4);
  		Thread.sleep(2000);
    
  		//click on protein card
  		WebElement protein = driver.findElement(Protcard);
  		protein.click();	
  		// Scroll to element Early Snacks
  		HashMap<String,Object>scrollObject6 =new HashMap<>();
  		scrollObject6.put("direction", "down");
  		scrollObject6.put("Early Snacks", "Early Snacks");
  		driver.executeScript("mobile:scroll", scrollObject6);
  		Thread.sleep(2000);
  		// Capture a screenshot and attach it to Allure
          AllureUtils.captureScreenshot(driver, "earlysnack5");	
  		//Click on protein cross icon
  		WebElement proteincross = driver.findElement(crossicon1);
  		proteincross.click();
  		
  		//click on carbs card
  		WebElement carbs = driver.findElement(carbcard);
  		carbs.click();	
  		// Scroll to element Early Snacks
  		HashMap<String,Object>scrollObject7 =new HashMap<>();
  		scrollObject7.put("direction", "down");
  		scrollObject7.put("Early Snacks", "Early Snacks");
  		driver.executeScript("mobile:scroll", scrollObject7);
  		Thread.sleep(2000); 		
  		// Capture a screenshot and attach it to Allure
          AllureUtils.captureScreenshot(driver, "earlysnack6");
  		//Click on protein cross icon
  		WebElement carbscross = driver.findElement(crossicon1);
  		carbscross.click();
  		
  		//click on fats card
  		WebElement fats = driver.findElement(fatcard);
  		fats.click();	
  		// Scroll to element Early Snacks
  		HashMap<String,Object>scrollObject8 =new HashMap<>();
  		scrollObject8.put("direction", "down");
  		scrollObject8.put("Early Snacks", "Early Snacks");
  		driver.executeScript("mobile:scroll", scrollObject8);
  		Thread.sleep(2000); 
  		// Capture a screenshot and attach it to Allure
          AllureUtils.captureScreenshot(driver, "earlysnack7");
  		//Click on protein cross icon
  		WebElement fatscross = driver.findElement(crossicon1);
  		fatscross.click();
        
        
		Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
	}
}

//}
	

