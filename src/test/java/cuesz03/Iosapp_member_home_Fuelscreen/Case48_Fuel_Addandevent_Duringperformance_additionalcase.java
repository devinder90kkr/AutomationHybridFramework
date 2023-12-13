package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import org.openqa.selenium.By;
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

@Epic ("Member Add an event screen detail ")
@Feature ("Verify member able to add functionlaity related to add an event for During-performance functionlaity.")
public class Case48_Fuel_Addandevent_Duringperformance_additionalcase extends AppiummobileBase {
	
	private By Homeclick 		= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By duringplusicon	=		AppiumBy.accessibilityId("During PerformancePlueIcon");
	private By doneclick		= 		AppiumBy.accessibilityId("Done");
	private By jimmie			= 		AppiumBy.iOSNsPredicateString("name == \"Jimmies\"");
	private By Showclick		= 		AppiumBy.iOSNsPredicateString("name == \"Show More\"");
	private By cognpate			= 		AppiumBy.accessibilityId("Cognac Pate");
	private By additionalsearch	= 		AppiumBy.accessibilityId("AdditionalFuelSearch");
	private By submitclick		=		AppiumBy.accessibilityId("ItemSubmit");
	private By infoclick		=		AppiumBy.accessibilityId("During PerformanceInfoIcon");	
	private By backbttn			=		AppiumBy.accessibilityId("BackPress");
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
	@Description("Member scroll to add an Event screen for during-perfoemnace detail verification")
    @Story("Scroll to during-performance detail and add its related values")
	public void Fuel_addaneventadditionalcasewithduringperformance() throws InterruptedException {	

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
  		HashMap<String,Object>scrollObject3 =new HashMap<>();
  		scrollObject3.put("direction", "down");
  		scrollObject3.put("During Performance", "During Performance");
  		driver.executeScript("mobile:scroll", scrollObject3);
  		Thread.sleep(2000);

  		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addduringevent1");
  		
  		
     	// Add fuel data for pre-performance 
     	WebElement duringpreperformance	= driver.findElement(duringplusicon);
     	duringpreperformance.click();
        
     	//click on keypad Done button to hide keypad
        WebElement keypaddone	= driver.findElement(doneclick);
        keypaddone.click();
        
        // Click on fuel search field 
        WebElement additionalfuel = driver.findElement(additionalsearch);
        additionalfuel.click();
        
        WebElement searchtext1	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"J\""));
        searchtext1.click();
        
        WebElement searchtext2	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"i\""));
        searchtext2.click();
        
        WebElement searchtext3	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"m\""));
        searchtext3.click();

        WebElement Keypaddone	= driver.findElement(doneclick);
        Keypaddone.click();
       
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addduringevent2");

        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addevent6");
   
        WebElement fuelselection	= driver.findElement(jimmie);
        fuelselection.click();
        
        Thread.sleep(2500);
        WebElement submititems	= driver.findElement(submitclick);
        submititems.click();

        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addduringevent3");
        
        Thread.sleep(5500);
     // Add fuel data for pre-performance 
     	WebElement duringpreperformance2	= driver.findElement(duringplusicon);
     	duringpreperformance2.click();
        
        // Click on fuel search field 
        WebElement additionalfuel2 = driver.findElement(additionalsearch);
        additionalfuel2.click();
        
        WebElement searchtext11	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"C\""));
        searchtext11.click();
        
        WebElement searchtext21	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"o\""));
        searchtext21.click();
        
        WebElement searchtext31	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"g\""));
        searchtext31.click();
        
        WebElement Keypaddone1	= driver.findElement(doneclick);
        Keypaddone1.click();
        
        WebElement brandedShowmore	= driver.findElement(Showclick);
        brandedShowmore.click();
                
        Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject1 =new HashMap<>();
		scrollObject1.put("direction", "down");
		scrollObject1.put("Cognac Pate", "Cognac Pate");
		driver.executeScript("mobile:scroll", scrollObject1);
		
		WebElement fuelselection1	= driver.findElement(cognpate);
        fuelselection1.click();
        
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addduringevent3");
        
        
        Thread.sleep(2500);
        WebElement submititems2	= driver.findElement(submitclick);
        submititems2.click();

					
		Thread.sleep(3500);
		WebElement infoicon		= driver.findElement(infoclick);
		infoicon.click();
		
		Thread.sleep(3000); 
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject4 =new HashMap<>();
		scrollObject4.put("direction", "down");
		scrollObject4.put("Source", "Source");
		driver.executeScript("mobile:scroll", scrollObject4);
		Thread.sleep(2000);

		WebElement 	backincon	= driver.findElement(backbttn);
		backincon.click();
		
		 // Method to scroll to perform screen
  		HashMap<String,Object>scrollObject5 =new HashMap<>();
  		scrollObject5.put("direction", "down");
  		scrollObject5.put("During Performance", "During Performance");
  		driver.executeScript("mobile:scroll", scrollObject5);
  		Thread.sleep(2000);
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addduringevent4");
        
       	Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
	}
}
	

