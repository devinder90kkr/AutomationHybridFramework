package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import cuesz.utils.reporting.AllureUtils;
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
	private static final Logger LOGGER = LoggerFactory.getLogger(Case24_Fuel_breakfast_additionalfuel_addfuelasfavorite.class);
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
	public void Homescreen() throws InterruptedException{
		try {
		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
		
		WebElement Homeicon = driver.findElement(Homeclick);
		Homeicon.click();
		 // Log console message to Allure
        LOGGER.info("Click on Homeicon");
        AllureUtils.logStep("Click on Homeicon");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case24_1");
		
        Thread.sleep(3000);
		
        // Method to scroll to perform screen
		HashMap<String,Object>scrollObject =new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("Perform Fuel Mindful Restore", "Perform");
		driver.executeScript("mobile:scroll", scrollObject);
		  // Log console message to Allure
        LOGGER.info("Scroll to Fuel");
        AllureUtils.logStep("Scroll to Fuel");

		Thread.sleep(2000);

        //Click on Fuel tab 
        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();
        // Log console message to Allure
        LOGGER.info("Click on fuel screen");
        AllureUtils.logStep("Click on fuel screen");
        AllureUtils.captureScreenshot(driver, "Case24_2");
        
        // Locate the element related to breakfast + icon 
        WebElement breakfastplus 	= driver.findElement(plusadd);
        breakfastplus.click();
        // Log console message to Allure
        LOGGER.info("Click on breakfastplus");
        AllureUtils.logStep("Click on breakfastplus");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case24_3");
        
       //click on keypad Done button to hide keypad
        WebElement keypaddone	= driver.findElement(doneclick);
        keypaddone.click();
        // Log console message to Allure
        LOGGER.info("Click on Done");
        AllureUtils.logStep("Click on done");
        
        // Click on fuel search field 
        WebElement additionalfuel = driver.findElement(additionalsearch);
        additionalfuel.click();
        // Log console message to Allure
        LOGGER.info("Click on additionalfuel");
        AllureUtils.logStep("Click on additionalfuel");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case24_4");
        
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
        // Log console message to Allure
        LOGGER.info("Enter values for search, Click on Done");
        AllureUtils.logStep("Enter values for search, Click on done");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "additional4");
        
        
        WebElement fuelselection1	= driver.findElement(melo);
        fuelselection1.click();
        // Log console message to Allure
        LOGGER.info("Click on fuelselection1");
        AllureUtils.logStep("Click on fuelselection1");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case24_8");
        
        WebElement meloclickplus		= driver.findElement(meloplus);
        int numberOfClicks21 = 1;
        for (int i = 0; i < numberOfClicks21; i++) {   
        	meloclickplus.click();
        	// Log console message to Allure
            LOGGER.info("Click on item click");
            AllureUtils.logStep("Click on item click");
        }
        
        WebElement fuelsearch 	= driver.findElement(serchclick);
        fuelsearch.click();
        // Log console message to Allure
        LOGGER.info("Click on fuelsearch");
        AllureUtils.logStep("Click on fuelsearch");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case24_9");
        
        WebElement fuelsearch2 	= driver.findElement(serchclick);
        fuelsearch2.click();
        // Log console message to Allure
        LOGGER.info("Click on fuelsearch2");
        AllureUtils.logStep("Click on fuelsearch2");
      
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
        // Log console message to Allure
        LOGGER.info("Enter values for search, Click on Done");
        AllureUtils.logStep("Enter values for search, Click on done");
        
        WebElement Showmore		= driver.findElement(Showclick);
        Showmore.click();
        LOGGER.info("Click on Showmore");
        AllureUtils.logStep("Click on Showmore");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case24_13");
        
        WebElement Fuelselection3	= driver.findElement(bicolclick);
        Fuelselection3.click();
        LOGGER.info("Click on Fuelselection3");
        AllureUtils.logStep("Click on Fuelselection3");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case24_14");
          
        WebElement submit1 = driver.findElement(submitick);
		submit1.click();
		 LOGGER.info("Click on submit1");
        AllureUtils.logStep("Click on submit1");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case24_15");
		
	
        
     // Method to scroll to perform screen
 		HashMap<String,Object>scrollObject3 =new HashMap<>();
 		scrollObject3.put("direction", "down");
 		scrollObject3.put("Favorite", "Favorite");
 		driver.executeScript("mobile:scroll", scrollObject3);
    
        WebElement addfavorite 	= driver.findElement(favoriteclick);
        addfavorite.click();
        LOGGER.info("Click on addfavorite");
        AllureUtils.logStep("Click on addfavorite");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case24_16");
        
        WebElement favoritefield	= driver.findElement(favoriteinput); 
        favoritefield.clear();
        favoritefield.sendKeys("Rogger-breakfast");
        //logs
        LOGGER.info("Enter values for favoritefield");
        AllureUtils.logStep("Enter values for favoritefield");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case24_16");

        WebElement submitaddfavorite 	= driver.findElement(submitfavoriteclick);
        submitaddfavorite.click();
        submitaddfavorite.click();
        LOGGER.info("Click on submitaddfavorite");
        AllureUtils.logStep("Click on submitaddfavorite");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case24_17");
        
        
        // Locate the element related to breakfast + icon 
        WebElement breakfastplus2 	= driver.findElement(plusadd);
        breakfastplus2.click();
        LOGGER.info("Click on breakfastplus2");
        AllureUtils.logStep("Click on breakfastplus2");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case24_18");
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone2	= driver.findElement(doneclick);
        keypaddone2.click();
        LOGGER.info("Click on keypaddone2");
        AllureUtils.logStep("Click on keypaddone2");
        
        // Click on fuel search field 
        WebElement additionalfuel2 = driver.findElement(additionalsearch);
        additionalfuel2.sendKeys("Rogger-breakfast");
        LOGGER.info("Click on additionalfuel2");
        AllureUtils.logStep("Click on additionalfuel2");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case24_20");
        
        WebElement Keypaddone3	= driver.findElement(doneclick);
        Keypaddone3.click();
        LOGGER.info("Click on Keypaddone3");
        AllureUtils.logStep("Click on Keypaddone3");
 
        WebElement favoritefood	= driver.findElement(favoritefoodclick);
        favoritefood.click();
        LOGGER.info("Click on favoritefood");
        AllureUtils.logStep("Click on favoritefood");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case24_22");
        
        
        WebElement editadd = driver.findElement(Fueladded);
        editadd.clear();
        editadd.sendKeys("Breakfast1");
        LOGGER.info("enter values in editadd");
        AllureUtils.logStep("enter values in editadd");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case24_22");
        
        
        WebElement submitaddfavorite2 	= driver.findElement(submitfavoriteclick);
        submitaddfavorite2.click();
        submitaddfavorite2.click();
        //logs click event 
        LOGGER.info("Click on submitfavorite");
        AllureUtils.logStep("Click on submitfavorite");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case24_22");
        
       
        
		 } catch (Exception e) {
	            LOGGER.error("An error occurred during the mindful screen test", e);
	            AllureUtils.logStep("An error occurred: " + e.getMessage());
	        } finally {
	            // Terminate the app whether the test passed or failed
	            try {
	                Thread.sleep(8500);
	            } catch (InterruptedException e) {
	                LOGGER.error("Thread interrupted during final sleep", e);
	                Thread.currentThread().interrupt();
	            }
	            driver.terminateApp("com.cuesz.mobile");
	        }
	    }
	}
