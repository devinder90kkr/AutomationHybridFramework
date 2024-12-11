package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.mobile.resources.mobileLocators;
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
@Feature ("Verify Fuel detail functionlaity related to dinner addtional fuel.")
public class Case41_Fuel_Dinner_additionalfuel extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case41_Fuel_Dinner_additionalfuel.class);
		
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Member Fuel screen detail verification")
    @Story("Scroll to Fuel card and verify member able to add addtional dinner list")	
	public void Fuel_Dinner_additionalfuel() throws InterruptedException{
		try {
		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
//        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
		 appiumUtils.launchAppWithPackageId(mobileTestData.bundelID);
		 
		WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
		Homeicon.click();
		// Log console message to Allure
		LOGGER.info("Click on home menu from bottom");
        AllureUtils.logStep("Click on home menu from bottom");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "41_1");
		        		
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
        AllureUtils.captureScreenshot(driver,"41_2");
        
       
        Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject1 =new HashMap<>();
		scrollObject1.put("direction", "down");
		scrollObject1.put("Dinner", "Dinner");
		driver.executeScript("mobile:scroll", scrollObject1);
		Thread.sleep(2000);
        
        
        // Locate the element related to dinner + icon 
        WebElement latesnacksplus 	= driver.findElement(mobileLocators.dinnerplusicon);
        latesnacksplus.click();
        // Log console message to Allure
        LOGGER.info("Click on latesnacksplus");
        AllureUtils.logStep("Click on latesnacksplus");
        AllureUtils.captureScreenshot(driver,"41_3");
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone	= driver.findElement(mobileLocators.doneclick);
        keypaddone.click();
        // Log console message to Allure
        LOGGER.info("Click on keypaddone");
        AllureUtils.logStep("Click on keypaddone");
        AllureUtils.captureScreenshot(driver,"41_4");
        
        // Click on fuel search field 
        WebElement additionalfuel = driver.findElement(mobileLocators.additionalsearch);
        additionalfuel.click();
        // Log console message to Allure
        LOGGER.info("Click on additionalfuel");
        AllureUtils.logStep("Click on additionalfuel");
        AllureUtils.captureScreenshot(driver,"41_5");
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Dinner5");
        
//        WebElement searchtext1	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"J\""));
//        searchtext1.click();
//        
//        WebElement searchtext2	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"u\""));
//        searchtext2.click();
//        
//        WebElement searchtext3	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"i\""));
//        searchtext3.click();
//        
//        WebElement searchtext4	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"c\""));
//        searchtext4.click();
//        
//        WebElement searchtext5	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"e\""));
//        searchtext5.click();
        additionalfuel.sendKeys(mobileTestData.food15);
 
        WebElement Keypaddone	= driver.findElement(mobileLocators.doneclick);
        Keypaddone.click();
        // Log console message to Allure
        LOGGER.info("Enter values for search, Click on Done");
        AllureUtils.logStep("Enter values for search, Click on done");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case41_6");
        
        WebElement fuelselection	= driver.findElement(mobileLocators.juicefuelselection);
        fuelselection.click();
        // Log console message to Allure
        LOGGER.info("Click on fuelselection");
        AllureUtils.logStep("Click on fuelselection");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case41_7");
        
        Thread.sleep(4500);
        
        // Click on timer 
        WebElement Timerclick 	= driver.findElement(mobileLocators.Time);
        Timerclick.click();
        List<WebElement>values = driver.findElements(mobileLocators.pickerelement);
		for (int i=0; i<values.size();i++)
		{		
		System.out.println(values.get(i).getText());
		}
		values.get(0).sendKeys("9");
		values.get(0).sendKeys(Keys.TAB);
		Thread.sleep(3500);
		values.get(1).sendKeys("18");
		values.get(1).sendKeys(Keys.TAB);
		Thread.sleep(3500);
		values.get(2).sendKeys("PM");
		driver.findElement(mobileLocators.Doneclick).click();
		// Log console message to Allure
		LOGGER.info("enter time ");
		AllureUtils.logStep("Enter time");    
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "Case41_8");
		
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Dinner6");
        
    	WebElement submit = driver.findElement(mobileLocators.dinnerTickoption);
		submit.click();
		// Log console message to Allure
		LOGGER.info("click on submit ");
		AllureUtils.logStep("click on submit");    
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "Case41_9");
				
		// Method to scroll to early snack
		HashMap<String,Object>scrollObject2 =new HashMap<>();
		scrollObject2.put("direction", "down");
		scrollObject2.put("Dinner", "Dinner");
		driver.executeScript("mobile:scroll", scrollObject2);
		Thread.sleep(2000);
		
		  // Locate the element related to dinner + icon 
        WebElement dinnerplus2 	= driver.findElement(mobileLocators.dinnerplusicon);
        dinnerplus2.click();
        // Log console message to Allure
		LOGGER.info("click on dinnerplus2 ");
		AllureUtils.logStep("click on dinnerplus2");    
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "Case41_10");
     		
        //click on keypad Done button to hide keypad
        WebElement keypaddone2	= driver.findElement(mobileLocators.doneclick);
        keypaddone2.click();
        // Log console message to Allure
 		LOGGER.info("click on keypaddone2 ");
 		AllureUtils.logStep("click on keypaddone2");    
 		// Capture a screenshot and attach it to Allure
 		AllureUtils.captureScreenshot(driver, "Case41_11");
 		
        // Click on fuel search field 
        WebElement additionalfuel2 = driver.findElement(mobileLocators.additionalsearch);
        additionalfuel2.click();
        // Log console message to Allure
  		LOGGER.info("click on additionalfuel2 ");
  		AllureUtils.logStep("click on additionalfuel2");    
  		// Capture a screenshot and attach it to Allure
  		AllureUtils.captureScreenshot(driver, "Case41_12");
      		
        
//        WebElement searchtext11	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"L\""));
//        searchtext11.click();
//        
//        WebElement searchtext12	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"e\""));
//        searchtext12.click();
//        
//        WebElement searchtext13	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"n\""));
//        searchtext13.click();
//        
//        WebElement searchtext14	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"t\""));
//        searchtext14.click();
//        
//        WebElement searchtext15	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"i\""));
//        searchtext15.click();
        
	     // Capture a screenshot and attach it to Allure
	      AllureUtils.captureScreenshot(driver, "Dinner7");
	      additionalfuel2.sendKeys(mobileTestData.food16);
        
        WebElement Keypaddone2	= driver.findElement(mobileLocators.doneclick);
        Keypaddone2.click();
        // Log console message to Allure
        LOGGER.info("Enter values for search, Click on Done");
        AllureUtils.logStep("Enter values for search, Click on Done");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case41_13");
        Thread.sleep(2500);		
        
        WebElement showmorebranded	= driver.findElement(AppiumBy.xpath("(//XCUIElementTypeStaticText[@name=\"Show More\"])[2]"));
        showmorebranded.click();
        
        
        WebElement fuelselection2	= driver.findElement(mobileLocators.lentifuelselectionc);
        fuelselection2.click();
        // Log console message to Allure
        LOGGER.info("Click on fuelselection2");
        AllureUtils.logStep("Click on fuelselection2");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case41_14");
        
        // Click on fuel search field 
        WebElement additionalfuel3 = driver.findElement(mobileLocators.serchclick);
        additionalfuel3.click();
        // Log console message to Allure
        LOGGER.info("Click on additionalfuel3");
        AllureUtils.logStep("Click on additionalfuel3");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case41_15");
        
//        WebElement searchtext21	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"B\""));
//        searchtext21.click();
//        
//        WebElement searchtext22	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"o\""));
//        searchtext22.click();
//        
//        WebElement searchtext23	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"i\""));
//        searchtext23.click();
        additionalfuel2.sendKeys(mobileTestData.food17);
        
        WebElement Keypaddone3	= driver.findElement(mobileLocators.doneclick);
        Keypaddone3.click();
        // Log console message to Allure
        LOGGER.info("Enter values for search, Click on Done");
        AllureUtils.logStep("Enter values for search, Click on Done");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case41_16");
        
        WebElement fuelselection3	= driver.findElement(mobileLocators.bopfuelselection);
        fuelselection3.click();
        // Log console message to Allure
        LOGGER.info("Click on additionalfuel3");
        AllureUtils.logStep("Click on additionalfuel3");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case41_17");
        
        
     // Capture a screenshot and attach it to Allure
	      AllureUtils.captureScreenshot(driver, "Dinner8");
        
//	    //Click on dinner  
//	     WebElement dinnerClick = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"Dinner\"`][2]"));
//	     dinnerClick.click();
//	     // Log console message to Allure
//        LOGGER.info("Click on dinnerClick");
//        AllureUtils.logStep("Click on dinnerClick");
	      
	      
        Thread.sleep(4500);
        WebElement submit2 = driver.findElement(mobileLocators.dinnerTickoption);
		submit2.click();
		// Log console message to Allure
        LOGGER.info("Click on submit2");
        AllureUtils.logStep("Click on submit2");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case41_18");
        
		Thread.sleep(4500);
		
		// Method to scroll to early snack
		HashMap<String,Object>scrollObject53 =new HashMap<>();
		scrollObject53.put("direction", "up");
		scrollObject53.put("Late Snacks", "Late Snacks");
		driver.executeScript("mobile:scroll", scrollObject53);
		Thread.sleep(2000);
		
		
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
  		WebElement protein = driver.findElement(mobileLocators.Protcard);
  		protein.click();	
  		// Scroll to element Early Snacks
  		HashMap<String,Object>scrollObject6 =new HashMap<>();
  		scrollObject6.put("direction", "down");
  		scrollObject6.put("Late Snacks", "Late Snacks");
  		driver.executeScript("mobile:scroll", scrollObject6);
  		Thread.sleep(2000);
  		// Scroll to element Early Snacks
  		HashMap<String,Object>scrollObject61 =new HashMap<>();
  		scrollObject61.put("direction", "down");
  		scrollObject61.put("Dinner", "Dinner");
  		driver.executeScript("mobile:scroll", scrollObject61);
  		
  		// Capture a screenshot and attach it to Allure
          AllureUtils.captureScreenshot(driver, "earlysnack5");	
  		//Click on protein cross icon
  		WebElement proteincross = driver.findElement(mobileLocators.crossicon1);
  		proteincross.click();
  		// Log console message to Allure
        LOGGER.info("Click on proteincross");
        AllureUtils.logStep("Click on proteincross");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case41_19");
        
  		//click on carbs card
  		WebElement carbs = driver.findElement(mobileLocators.carbcard);
  		carbs.click();	
  		// Log console message to Allure
        LOGGER.info("Click on carbs");
        AllureUtils.logStep("Click on carbs");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case41_20");
        
  		// Scroll to element Early Snacks
  		HashMap<String,Object>scrollObject7 =new HashMap<>();
  		scrollObject7.put("direction", "down");
  		scrollObject7.put("Late Snacks", "Late Snacks");
  		driver.executeScript("mobile:scroll", scrollObject7);
  		Thread.sleep(2000); 	
  		
  		// Scroll to element Early Snacks
  		HashMap<String,Object>scrollObject611 =new HashMap<>();
  		scrollObject611.put("direction", "down");
  		scrollObject611.put("Dinner", "Dinner");
  		driver.executeScript("mobile:scroll", scrollObject611);
  		//Click on protein cross icon
  		WebElement carbscross = driver.findElement(mobileLocators.crossicon1);
  		carbscross.click();
  		// Log console message to Allure
        LOGGER.info("Click on additionalfuel3");
        AllureUtils.logStep("Click on additionalfuel3");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case41_21");
        
  		//click on fats card
  		WebElement fats = driver.findElement(mobileLocators.fatcard);
  		fats.click();	
  		// Log console message to Allure
        LOGGER.info("Click on fats");
        AllureUtils.logStep("Click on fats");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case41_22");
        
  		// Scroll to element Early Snacks
  		HashMap<String,Object>scrollObject8 =new HashMap<>();
  		scrollObject8.put("direction", "down");
  		scrollObject8.put("Late Snacks", "Late Snacks");
  		driver.executeScript("mobile:scroll", scrollObject8);
  		Thread.sleep(2000); 
  		
  	// Scroll to element Early Snacks
  		HashMap<String,Object>scrollObject67 =new HashMap<>();
  		scrollObject67.put("direction", "down");
  		scrollObject67.put("Dinner", "Dinner");
  		driver.executeScript("mobile:scroll", scrollObject67);
  		
  		//Click on protein cross icon
  		WebElement fatscross = driver.findElement(mobileLocators.crossicon1);
  		fatscross.click();
  		// Log console message to Allure
        LOGGER.info("Click on fatscross");
        AllureUtils.logStep("Click on fatscross");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case41_23");
        
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