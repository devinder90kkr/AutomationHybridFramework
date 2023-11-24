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

@Epic ("Fuel screen detail ")
@Feature ("Verify Fuel detail functionlaity related to additional fuel.")
public class Case44_Fuel_Dinner_additionalfueldeletecase extends AppiummobileBase {
	
	private By Homeclick 		= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By plusadd			= 		AppiumBy.accessibilityId("DinnerAddIcon");
	private By doneclick		= 		AppiumBy.accessibilityId("Done");
	private By additionalsearch	= 		AppiumBy.accessibilityId("AdditionalFuelSearch");
	private By fish				= 		AppiumBy.iOSNsPredicateString("name == \"Fish\"");
	private By fishRemove		=		AppiumBy.accessibilityId("FishFuelItemDelete");
	private By Showclick		= 		AppiumBy.iOSNsPredicateString("name == \"Show More\"");
	private By Cheesegoat		= 		AppiumBy.accessibilityId("Goat Cheese");
	private By submitick		= 		AppiumBy.accessibilityId("ItemSubmit");
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Member Fuel screen detail verification for addtional")
    @Story("Scroll to Fuel card and check additional fuel for Dinner.")	
	public void Fuel_Dinner_additional() throws InterruptedException
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
        
        // Locate the element related to breakfast + icon 
        WebElement breakfastplus 	= driver.findElement(plusadd);
        breakfastplus.click();
        
       //click on keypad Done button to hide keypad
        WebElement keypaddone	= driver.findElement(doneclick);
        keypaddone.click();
        
        // Click on fuel search field 
        WebElement additionalfuel = driver.findElement(additionalsearch);
        additionalfuel.click();
        
        WebElement searchtext1	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"F\""));
        searchtext1.click();
        
        WebElement searchtext2	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"i\""));
        searchtext2.click();
        
        WebElement searchtext3	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"s\""));
        searchtext3.click();

        WebElement searchtext4	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"h\""));
        searchtext4.click();

        WebElement Keypaddone	= driver.findElement(doneclick);
        Keypaddone.click();
        
        // Capture a screenshot and attach it to Allure
	    AllureUtils.captureScreenshot(driver, "Dinner14");
        
        
        WebElement fuelselection	= driver.findElement(fish);
        fuelselection.click();
		
        WebElement fueldelete	= driver.findElement(fishRemove);
        fueldelete.click();
        
        // Click on fuel search field 
        WebElement additionalfuel2 = driver.findElement(additionalsearch);
        additionalfuel2.click();
        
        WebElement searchtext11	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"G\""));
        searchtext11.click();
        
        WebElement searchtext21	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"o\""));
        searchtext21.click();
        
        WebElement searchtext31	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"a\""));
        searchtext31.click();
        
        WebElement Keypaddone1	= driver.findElement(doneclick);
        Keypaddone1.click();
        
        WebElement brandedShowmore	= driver.findElement(Showclick);
        brandedShowmore.click();
        
        
     // Capture a screenshot and attach it to Allure
	    AllureUtils.captureScreenshot(driver, "Dinner15");
        
        
        Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject1 =new HashMap<>();
		scrollObject1.put("direction", "down");
		scrollObject1.put("Goat Cheese", "Goat Cheese");
		driver.executeScript("mobile:scroll", scrollObject1);
		
		WebElement fuelselection1	= driver.findElement(Cheesegoat);
        fuelselection1.click();
        
        WebElement submit1 = driver.findElement(submitick);
		submit1.click();
		
		Thread.sleep(4500);
		
		Thread.sleep(3500);
		// Method to scroll to early snack
		HashMap<String,Object>scrollObject53 =new HashMap<>();
		scrollObject53.put("direction", "down");
		scrollObject53.put("Dinner", "Dinner");
		driver.executeScript("mobile:scroll", scrollObject53);
		Thread.sleep(2000);

		
		Thread.sleep(4500);
        driver.terminateApp("com.cuesz.mobile");
	}
}
	

