package cuesz03.Iosapp_member_home_Fuelscreen.copy;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.mobile.resources.mobileTestData;
import cuesz.pages.AppiummobileBase;
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
@Feature ("Verify Fuel detail functionlaity related to Late snacks for additional fuel.")
public class Case37_Fuel_Latesnacks_additionalfuel extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case37_Fuel_Latesnacks_additionalfuel .class);
	
	private By Homeclick 		= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By plusadd			= 		AppiumBy.accessibilityId("Late SnacksAddIcon");
	private By doneclick		= 		AppiumBy.accessibilityId("Done");
	private By additionalsearch	= 		AppiumBy.accessibilityId("AdditionalFuelSearch");
	private By Venisonfuelselection	=	AppiumBy.accessibilityId("Venison");
	private By submitick		= 		AppiumBy.accessibilityId("ItemSubmit");
	private By Time				= 		AppiumBy.accessibilityId("AdditionalItemTime");
	private By pickerelement	= 		AppiumBy.xpath("//XCUIElementTypePickerWheel");
	private By Doneclick		= 		AppiumBy.accessibilityId("AlcohalTime");
	private By koftafuelselectionc	=	AppiumBy.accessibilityId("Kofta Kebab");
	private By additionalsearch1	=	AppiumBy.iOSNsPredicateString("label == \"Search Fuel to log\" AND name == \"AdditionalFuelSearch\"");
	private By mustardfuelselection	=	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"Mustard\"`][1]");
	private By Protcard			= 		AppiumBy.accessibilityId("Protein");
	private By crossicon1		= 		AppiumBy.accessibilityId("FuelMacroNutrientCross");
	private By carbcard			= 		AppiumBy.accessibilityId("Carbs");
	private By fatcard			= 		AppiumBy.accessibilityId("Fat");
	private By latesnack		= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"Late Snacks\"`][2]");
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Member Fuel screen detail verification")
    @Story("Scroll to Fuel card and verify latesnacks assigned by staff ")	
	public void Latesnacks_additionalfuel() throws InterruptedException{
		try {
		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
//        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
		 appiumUtils.launchAppWithPackageId(mobileTestData.bundelID);
		
		WebElement Homeicon = driver.findElement(Homeclick);
		Homeicon.click();
		// Log console message to Allure
		LOGGER.info("Click on home menu from bottom");
        AllureUtils.logStep("Click on home menu from bottom");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "37_1");

        		
		Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject =new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("Perform Fuel Mindful Restore", "Perform");
		driver.executeScript("mobile:scroll", scrollObject);
		Thread.sleep(2000);

        //Click on Fuel tab 
        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();
        // Log console message to Allure
        LOGGER.info("Click on fuel screen");
        AllureUtils.logStep("Click on fuel screen");
        AllureUtils.captureScreenshot(driver,"37_2");
        	
        Thread.sleep(3500);
        
        
        // Locate the element related to breakfast + icon 
        WebElement latesnacksplus 	= driver.findElement(plusadd);
        latesnacksplus.click();
        // Log console message to Allure
        LOGGER.info("Click on latesnacksplus");
        AllureUtils.logStep("Click on latesnacksplus");
        AllureUtils.captureScreenshot(driver, "Case37_3");
        	
        //click on keypad Done button to hide keypad
        WebElement keypaddone	= driver.findElement(doneclick);
        keypaddone.click();
        // Log console message to Allure
        LOGGER.info("Click on keypaddone");
        AllureUtils.logStep("Click on keypaddone");
        AllureUtils.captureScreenshot(driver, "Case37_4");
        
        // Click on fuel search field 
        WebElement additionalfuel = driver.findElement(additionalsearch);
        additionalfuel.click();
        // Log console message to Allure
        LOGGER.info("Click on additionalfuel");
        AllureUtils.logStep("Click on additionalfuel");
        AllureUtils.captureScreenshot(driver, "Case37_5");
        
        
        WebElement searchtext1	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"V\""));
        searchtext1.click();
        
        WebElement searchtext2	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"e\""));
        searchtext2.click();
        
        WebElement searchtext3	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"n\""));
        searchtext3.click();
        
        WebElement searchtext4	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"s\""));
        searchtext4.click();
        
        WebElement searchtext5	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"i\""));
        searchtext5.click();
        
        WebElement searchtext6	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"o\""));
        searchtext6.click();
        
        WebElement searchtext7	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"n\""));
        searchtext7.click();
 
        WebElement Keypaddone	= driver.findElement(doneclick);
        Keypaddone.click();
        // Log console message to Allure
        LOGGER.info("Enter values for search, Click on Done");
        AllureUtils.logStep("Enter values for search, Click on done");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case37_6");
        
        WebElement fuelselection	= driver.findElement(Venisonfuelselection);
        fuelselection.click();
        // Log console message to Allure
        LOGGER.info(" Click on fuelselection");
        AllureUtils.logStep("Click on fuelselection");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case36_7");
        
        
        // Capture a screenshot and attach it to Allure
	    AllureUtils.captureScreenshot(driver, "latesnacks1");
        Thread.sleep(4500);
        
        
        // Click on timer 
        WebElement Timerclick 	= driver.findElement(Time);
        Timerclick.click();
        List<WebElement>values = driver.findElements(pickerelement);
		for (int i=0; i<values.size();i++)
		{		
		System.out.println(values.get(i).getText());
		}
		values.get(0).sendKeys("5");
		values.get(0).sendKeys(Keys.TAB);
		Thread.sleep(3500);
		values.get(1).sendKeys("18");
		values.get(1).sendKeys(Keys.TAB);
		Thread.sleep(3500);
		values.get(2).sendKeys("PM");
		driver.findElement(Doneclick).click();
		// Log console message to Allure
        LOGGER.info(" Click on done");
        AllureUtils.logStep("Click on done");
		
		 // Capture a screenshot and attach it to Allure
	    AllureUtils.captureScreenshot(driver, "latesnacks2");
        
    	WebElement submit = driver.findElement(submitick);
		submit.click();
		// Log console message to Allure
        LOGGER.info(" Click on submit");
        AllureUtils.logStep("Click on submit");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case37_8");
        
		// Method to scroll to early snack
		HashMap<String,Object>scrollObject2 =new HashMap<>();
		scrollObject2.put("direction", "down");
		scrollObject2.put("Early Snacks", "Early Snacks");
		driver.executeScript("mobile:scroll", scrollObject2);
		Thread.sleep(2000);
		
		  // Locate the element related to breakfast + icon 
        WebElement breakfastplus2 	= driver.findElement(plusadd);
        breakfastplus2.click();
        // Log console message to Allure
        LOGGER.info(" Click on breakfastplus2");
        AllureUtils.logStep("Click on breakfastplus2");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case37_9");
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone2	= driver.findElement(doneclick);
        keypaddone2.click();
        // Log console message to Allure
        LOGGER.info(" Click on keypaddone2");
        AllureUtils.logStep("Click on keypaddone2");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case37_10");
        
        // Click on fuel search field 
        WebElement additionalfuel2 = driver.findElement(additionalsearch);
        additionalfuel2.click();
        // Log console message to Allure
        LOGGER.info(" Click on additionalfuel2");
        AllureUtils.logStep("Click on additionalfuel2");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case37_11");
        
        WebElement searchtext11	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"K\""));
        searchtext11.click();
        
        WebElement searchtext12	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"o\""));
        searchtext12.click();
        
        WebElement searchtext13	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"f\""));
        searchtext13.click();
        
        WebElement searchtext14	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"t\""));
        searchtext14.click();
        
        WebElement searchtext15	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"a\""));
        searchtext15.click();
        
        WebElement Keypaddone2	= driver.findElement(doneclick);
        Keypaddone2.click();
        // Log console message to Allure
        LOGGER.info("Enter values for search, Click on Done");
        AllureUtils.logStep("Enter values for search, Click on done");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case37_12");


        WebElement showmorebranded	= driver.findElement(AppiumBy.xpath("(//XCUIElementTypeStaticText[@name=\"Show More\"])[2]"));
        showmorebranded.click();
        
        
        WebElement fuelselection2	= driver.findElement(koftafuelselectionc);
        fuelselection2.click();
        // Log console message to Allure
        LOGGER.info(" Click on fuelselection2");
        AllureUtils.logStep("Click on fuelselection2");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case37_13");
        
        // Capture a screenshot and attach it to Allure
	    AllureUtils.captureScreenshot(driver, "latesnacks3");
        
        
        // Click on fuel search field 
        WebElement additionalfuel3 = driver.findElement(additionalsearch1);
        additionalfuel3.click();
        // Log console message to Allure
        LOGGER.info(" Click on additionalfuel3");
        AllureUtils.logStep("Click on additionalfuel3");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case37_14");
        
        WebElement searchtext21	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"M\""));
        searchtext21.click();
        
        WebElement searchtext22	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"u\""));
        searchtext22.click();
        
        WebElement searchtext23	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"s\""));
        searchtext23.click();
        
        WebElement searchtext24	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"t\""));
        searchtext24.click();
        
        WebElement searchtext25	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"a\""));
        searchtext25.click();
        
        WebElement searchtext26	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"r\""));
        searchtext26.click();

        WebElement searchtext27	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"d\""));
        searchtext27.click();
        
        WebElement Keypaddone3	= driver.findElement(doneclick);
        Keypaddone3.click();

        // Log console message to Allure
        LOGGER.info("Enter values for search, Click on Done");
        AllureUtils.logStep("Enter values for search, Click on done");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case37_15");
        
        WebElement fuelselection3	= driver.findElement(mustardfuelselection);
        fuelselection3.click();
        // Log console message to Allure
        LOGGER.info(" Click on fuelselection3");
        AllureUtils.logStep("Click on fuelselection3");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case37_144");
        
        // Capture a screenshot and attach it to Allure
	    AllureUtils.captureScreenshot(driver, "latesnacks4");
        Thread.sleep(4500);
                
        WebElement Latesnack	= driver.findElement(latesnack);
        Latesnack.click();
        // Log console message to Allure
        LOGGER.info(" Click on Latesnack");
        AllureUtils.logStep("Click on fuelLatesnackselection3");
        
        WebElement submit2 = driver.findElement(submitick);
		submit2.click();
		// Log console message to Allure
        LOGGER.info(" Click on submit2");
        AllureUtils.logStep("Click on submit2");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case37_16");
		
		
		Thread.sleep(4500);
		
		// Method to scroll to early snack
		HashMap<String,Object>scrollObject3 =new HashMap<>();
		scrollObject3.put("direction", "up");
		scrollObject3.put("Lunch", "Lunch");
		driver.executeScript("mobile:scroll", scrollObject3);
		Thread.sleep(2000);
		
		// Method to scroll to early snack
		HashMap<String,Object>scrollObject31 =new HashMap<>();
		scrollObject31.put("direction", "up");
		scrollObject31.put("Early Snacks", "Early Snacks");
		driver.executeScript("mobile:scroll", scrollObject31);
		Thread.sleep(2000);
		
		HashMap<String,Object>scrollObject311 =new HashMap<>();
		scrollObject311.put("direction", "up");
		scrollObject311.put("Breakfast", "Breakfast");
		driver.executeScript("mobile:scroll", scrollObject311);
		Thread.sleep(2000);
		

		 // Method to scroll to perform screen
  		HashMap<String,Object>scrollObject5 =new HashMap<>();
  		scrollObject5.put("direction", "up");
  		scrollObject5.put("DRINK MORE WATER", "DRINK MORE WATER");
  		driver.executeScript("mobile:scroll", scrollObject5);
  		Thread.sleep(2000);
        
    	// Method to scroll to perform screen
  		HashMap<String,Object>scrollObject3111 =new HashMap<>();
  		scrollObject3111.put("direction", "up");
  		scrollObject3111.put("OPTIMAL FUEL TARGET ACHIEVED", "OPTIMAL FUEL TARGET ACHIEVED");
  		driver.executeScript("mobile:scroll", scrollObject3111);
  		Thread.sleep(2000);
  		
  		
  		HashMap<String,Object>scrollObject4 =new HashMap<>();
  		scrollObject4.put("direction", "up");
  		scrollObject4.put("Carbs", "Carbs");
  		driver.executeScript("mobile:scroll", scrollObject4);
  		Thread.sleep(2000);
    
  		//click on protein card
  		WebElement protein = driver.findElement(Protcard);
  		protein.click();	
  		// Log console message to Allure
        LOGGER.info(" Click on protein");
        AllureUtils.logStep("Click on protein");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case37_161");
        
  		// Scroll to element Early Snacks
  		HashMap<String,Object>scrollObject6 =new HashMap<>();
  		scrollObject6.put("direction", "down");
  		scrollObject6.put("Late Snacks", "Late Snacks");
  		driver.executeScript("mobile:scroll", scrollObject6);
  		Thread.sleep(2000);
  		// Capture a screenshot and attach it to Allure
          AllureUtils.captureScreenshot(driver, "earlysnack5");	
  		//Click on protein cross icon
  		WebElement proteincross = driver.findElement(crossicon1);
  		proteincross.click();
  		// Log console message to Allure
        LOGGER.info(" Click on proteincross");
        AllureUtils.logStep("Click on proteincross");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case37_162");
        
  		//click on carbs card
  		WebElement carbs = driver.findElement(carbcard);
  		carbs.click();	
  		// Log console message to Allure
        LOGGER.info(" Click on carbs");
        AllureUtils.logStep("Click on carbs");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case37_14");
        
  		// Scroll to element Early Snacks
  		HashMap<String,Object>scrollObject7 =new HashMap<>();
  		scrollObject7.put("direction", "down");
  		scrollObject7.put("Late Snacks", "Late Snacks");
  		driver.executeScript("mobile:scroll", scrollObject7);
  		Thread.sleep(2000); 		
  		// Capture a screenshot and attach it to Allure
          AllureUtils.captureScreenshot(driver, "earlysnack6");
  		//Click on protein cross icon
  		WebElement carbscross = driver.findElement(crossicon1);
  		carbscross.click();
  		// Log console message to Allure
  		LOGGER.info(" Click on carbscross");
        AllureUtils.logStep("Click on carbscross");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case37_carbscross");
        
  		//click on fats card
  		WebElement fats = driver.findElement(fatcard);
  		fats.click();	
  		// Log console message to Allure
  		LOGGER.info(" Click on fats");
        AllureUtils.logStep("Click on fats");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case37_fats");
        
  		// Scroll to element Early Snacks
  		HashMap<String,Object>scrollObject8 =new HashMap<>();
  		scrollObject8.put("direction", "down");
  		scrollObject8.put("Late Snacks", "Late Snacks");
  		driver.executeScript("mobile:scroll", scrollObject8);
  		Thread.sleep(2000); 
  		// Capture a screenshot and attach it to Allure
          AllureUtils.captureScreenshot(driver, "earlysnack7");
  		//Click on protein cross icon
  		WebElement fatscross = driver.findElement(crossicon1);
  		fatscross.click();
  		// Log console message to Allure
        LOGGER.info(" Click on fatscross");
        AllureUtils.logStep("Click on fatscross");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case37_fatscross");
		
		
		
        Thread.sleep(3500);
		 } catch (Exception e) {
	            LOGGER.error("An error occurred during the cases ", e);
	            AllureUtils.logStep("An error occurred: " + e.getMessage());
	        } finally {
	            // Terminate the app whether the test passed or failed
	            try {
	                Thread.sleep(8500);
	            } catch (InterruptedException e) {
	                LOGGER.error("Thread interrupted during final sleep", e);
	                Thread.currentThread().interrupt();
	            }
//	            driver.terminateApp("com.cuesz.mobile");
	            driver.terminateApp(mobileTestData.bundelID);
	        }
	    }
}
	
