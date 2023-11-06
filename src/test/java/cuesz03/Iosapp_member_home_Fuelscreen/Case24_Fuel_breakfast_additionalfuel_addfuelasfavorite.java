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
@Feature ("Verify Fuel detail functionlaity related to Optimal fuel.")
public class Case24_Fuel_breakfast_additionalfuel_addfuelasfavorite extends AppiummobileBase {
	
	private By Homeclick 		= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By plusadd			= 		AppiumBy.accessibilityId("BreakfastAddIcon");
	private By doneclick		= 		AppiumBy.accessibilityId("Done");
	private By additionalsearch	= 		AppiumBy.accessibilityId("AdditionalFuelSearch");
	private By submitick		= 		AppiumBy.accessibilityId("ItemSubmit");
	private By melo				= 		AppiumBy.accessibilityId("Melonpan");
	private By meloplus			= 		AppiumBy.accessibilityId("MelonpanPlus");
	private By serchclick		= 		AppiumBy.accessibilityId("AdditionalFuelSearch");
	private By Showclick		= 		AppiumBy.xpath("(//XCUIElementTypeStaticText[@name=\"Show More\"])[1]");
	private By favoriteclick	= 		AppiumBy.accessibilityId("BreakfastFavoriteFuel");
	private By favoriteinput	= 		AppiumBy.iOSNsPredicateString("value == \"Enter Fuel name\"");
	private By submitfavoriteclick	= 	AppiumBy.accessibilityId("Submit");
	private By bicolclick		=		AppiumBy.accessibilityId("Bicol Express");
	private By favoritefoodclick	=	AppiumBy.iOSNsPredicateString("name == \"Rogger-breakfast\"");
	private By Fueladded	=		AppiumBy.accessibilityId("EditFuel");


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
        
        
        WebElement searchtext11	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"M\""));
        searchtext11.click();
        
        WebElement searchtext21	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"e\""));
        searchtext21.click();
        
        WebElement searchtext31	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"l\""));
        searchtext31.click();

        WebElement searchtext41	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"o\""));
        searchtext41.click();

      
        WebElement Keypaddone1	= driver.findElement(doneclick);
        Keypaddone1.click();

		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "additional4");
        
        
        WebElement fuelselection1	= driver.findElement(melo);
        fuelselection1.click();
           
        WebElement meloclickplus		= driver.findElement(meloplus);
        int numberOfClicks21 = 1;
        for (int i = 0; i < numberOfClicks21; i++) {   
        	meloclickplus.click();
        }
        
        WebElement fuelsearch 	= driver.findElement(serchclick);
        fuelsearch.click();
        
        WebElement fuelsearch2 	= driver.findElement(serchclick);
        fuelsearch2.click();
       
        WebElement searchtext71	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"B\""));
        searchtext71.click();
        
        WebElement searchtext51	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"i\""));
        searchtext51.click();
        
        WebElement searchtext61	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"c\""));
        searchtext61.click();

        WebElement searchtext81	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"e\""));
        searchtext81.click();
        
        WebElement Keypaddone2	= driver.findElement(doneclick);
        Keypaddone2.click();
        
        WebElement Showmore		= driver.findElement(Showclick);
        Showmore.click();

        WebElement Fuelselection3	= driver.findElement(bicolclick);
        Fuelselection3.click();
           
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "additional5");
        
        
        WebElement submit1 = driver.findElement(submitick);
		submit1.click();
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "additional6");
        
     // Method to scroll to perform screen
 		HashMap<String,Object>scrollObject3 =new HashMap<>();
 		scrollObject3.put("direction", "down");
 		scrollObject3.put("Favorite", "Favorite");
 		driver.executeScript("mobile:scroll", scrollObject3);
    
        WebElement addfavorite 	= driver.findElement(favoriteclick);
        addfavorite.click();
        
        WebElement favoritefield	= driver.findElement(favoriteinput); 
        favoritefield.clear();
        favoritefield.sendKeys("Rogger-breakfast");
        

        WebElement submitaddfavorite 	= driver.findElement(submitfavoriteclick);
        submitaddfavorite.click();
        submitaddfavorite.click();
        
        // Locate the element related to breakfast + icon 
        WebElement breakfastplus2 	= driver.findElement(plusadd);
        breakfastplus2.click();
       
        //click on keypad Done button to hide keypad
        WebElement keypaddone2	= driver.findElement(doneclick);
        keypaddone2.click();
        
        // Click on fuel search field 
        WebElement additionalfuel2 = driver.findElement(additionalsearch);
        additionalfuel2.sendKeys("Rogger-breakfast");
        
        WebElement Keypaddone3	= driver.findElement(doneclick);
        Keypaddone3.click();
        
        WebElement favoritefood	= driver.findElement(favoritefoodclick);
        favoritefood.click();
   
        WebElement editadd = driver.findElement(Fueladded);
        editadd.clear();
        editadd.sendKeys("Breakfast1");
        
        WebElement submitaddfavorite2 	= driver.findElement(submitfavoriteclick);
        submitaddfavorite2.click();
        submitaddfavorite2.click();
        
        
       
        
		Thread.sleep(4500);
        driver.terminateApp("com.cuesz.mobile");
	}
}
	

