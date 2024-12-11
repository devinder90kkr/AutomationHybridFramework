package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.appium.date.functions.DateUtilsAppium;
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
@Feature ("Verify Fuel detail functionlaity related to Optimal fuel.")
public class Case45_Fuel_Pastday1_brekfastactivity extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case45_Fuel_Pastday1_brekfastactivity.class);
	
	mobileLocators locators = new mobileLocators();	

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
//        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
		 appiumUtils.launchAppWithPackageId(mobileTestData.bundelID);
		
		WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
		Homeicon.click();
		// Log console message to Allure
		LOGGER.info("Click on home menu from bottom");
        AllureUtils.logStep("Click on home menu from bottom");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "45_1");
		        
		// Use the utility method
		DateUtilsAppium.clickOnPreviousDay(driver);
		
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
        LOGGER.info("Click on FUEL_SCREEN");
        AllureUtils.logStep("Click on FUEL_SCREEN");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case22_Fuel_breakfast_additionalfuel2");
        
        // Locate the element related to breakfast + icon 
        WebElement breakfastplus     = driver.findElement(mobileLocators.plusadd);
        breakfastplus.click();
        // Log console message to Allure
        LOGGER.info("Click on breakfastplus icon");
        AllureUtils.logStep("Click on breakfastplus icon");
        AllureUtils.captureScreenshot(driver, "Case22_Fuel_breakfast_additionalfuel3");
        
        
       //click on keypad Done button to hide keypad
        WebElement keypaddone    = driver.findElement(mobileLocators.doneclick);
        keypaddone.click();
        // Log console message to Allure
        LOGGER.info("Click on Done");
        AllureUtils.logStep("Click on done");
        
        // Click on fuel search field 
        WebElement additionalfuel = driver.findElement(mobileLocators.additionalsearch);
        additionalfuel.click();
        // Log console message to Allure
        LOGGER.info("Click on additionalfuel");
        AllureUtils.logStep("Click on additionalfuel");
        AllureUtils.captureScreenshot(driver, "Case22_Fuel_breakfast_additionalfuel4");
        
        additionalfuel.sendKeys(mobileTestData.food1);
        
        WebElement fuelselection    = driver.findElement(mobileLocators.faggot);
        fuelselection.click();
        LOGGER.info("Click on  fuelselection ");
        AllureUtils.logStep("Click on  fuelselection ");
        AllureUtils.captureScreenshot(driver, "Case22_Fuel_breakfast_additionalfuel5");
        
        Thread.sleep(2500);        
        WebElement faggoticon        = driver.findElement(mobileLocators.fagoticon);
        faggoticon.click();
        LOGGER.info("Click on  faggoticon ");
        AllureUtils.logStep("Click on  faggoticon ");
        AllureUtils.captureScreenshot(driver, "Case22_Fuel_breakfast_additionalfuel6");
        
        
        WebElement backicon         = driver.findElement(mobileLocators.backtap);
        backicon.click();      
        LOGGER.info("click on backicon");
        AllureUtils.logStep("click on backicon");    
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "backicon");
        
        Thread.sleep(3000);
        // Method to scroll to perform screen
        HashMap<String,Object>scrollObject56 =new HashMap<>();
        scrollObject56.put("direction", "down");
        scrollObject56.put("fagotplus", "fagotplus");
        driver.executeScript("mobile:scroll", scrollObject56);
        Thread.sleep(2000);
         LOGGER.info("Scroll object");
         AllureUtils.logStep("Scroll object");  
        
        WebElement faggotplus        = driver.findElement(mobileLocators.fagotplus);
        int numberOfClicks = 3;
        for (int i = 0; i < numberOfClicks; i++) {   
        faggotplus.click();
        LOGGER.info("Click on  faggotplus icon");
        AllureUtils.logStep("Click on faggotplus icon");    
        }
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "additional2");
        

        WebElement submit = driver.findElement(mobileLocators.submitick);
        submit.click();
          // Log console message to Allure
        LOGGER.info("Click on submit");
        AllureUtils.logStep("Click on submit");
        AllureUtils.captureScreenshot(driver, "submit");
        
        /*****************************/
        
        // Locate the element related to breakfast + icon 
        WebElement breakfastplus2 	= driver.findElement(mobileLocators.earlysnacksplusadd);
        breakfastplus2.click();
        // Log console message to Allure
        LOGGER.info("Click on breakfastplus2");
        AllureUtils.logStep("Click on breakfastplus2");
        AllureUtils.captureScreenshot(driver, "breakfastplus_30");
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone2	= driver.findElement(mobileLocators.doneclick);
        keypaddone2.click();
        // Log console message to Allure
        LOGGER.info("Click on Doneclick ");
        AllureUtils.logStep("Click on Doneclick"); 
        
        // Click on fuel search field 
        WebElement additionalfuel2 = driver.findElement(mobileLocators.additionalsearch);
        additionalfuel2.click();
        // Log console message to Allure
        LOGGER.info("Click on additionalfuel2");
        AllureUtils.logStep("Click on additionalfuel2");
        AllureUtils.captureScreenshot(driver, "additionalfuel_30");
        
        additionalfuel2.sendKeys(mobileTestData.food9);
        // Log console message to Allure
        LOGGER.info("Click on earlysnackplus");
        AllureUtils.logStep("Click on earlysnackplus");
        AllureUtils.captureScreenshot(driver, "earlysnackplus_29");
        
        WebElement Keypaddone2	= driver.findElement(mobileLocators.doneclick);
        Keypaddone2.click();
        // Log console message to Allure
        LOGGER.info("Click on Doneclick ");
        AllureUtils.logStep("Click on Doneclick"); 
        
        
        WebElement showmorebranded	= driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Show More\"`][2]"));
        showmorebranded.click();
        // Log console message to Allure
        LOGGER.info("Click on brandedshow more button ");
        AllureUtils.logStep("Click on branded show more button"); 
        
Thread.sleep(2500);
        WebElement fuelselection2	= driver.findElement(mobileLocators.ginfuelselectionc);
        fuelselection2.click();
        // Log console message to Allure
        LOGGER.info("Click on fuelselection2");
        AllureUtils.logStep("Click on fuelselection2");
        AllureUtils.captureScreenshot(driver, "fuelselection2_30");
        
        Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject16 =new HashMap<>();
		scrollObject16.put("direction", "down");
		scrollObject16.put("ginfuelselectionc", "ginfuelselectionc");
		driver.executeScript("mobile:scroll", scrollObject16);
        
        
        
//        driver.findElement(AppiumBy.iOSNsPredicateString("name == 'Early Snacks'")).click();
  
        WebElement submit2 = driver.findElement(mobileLocators.earlysnacksubmitick);
		submit2.click();
		// Log console message to Allure
        LOGGER.info("Click on submit2");
        AllureUtils.logStep("Click on submit2");
        AllureUtils.captureScreenshot(driver, "submit2_30");
		Thread.sleep(4500);
		
		
		
		
		 // Locate the element related to breakfast + icon 
        WebElement lunchplus 	= driver.findElement(mobileLocators.lunchplusicon);
        lunchplus.click();
        // Log console message to Allure
        LOGGER.info("Click on lunchplus");
        AllureUtils.logStep("Click on lunchplus");
        AllureUtils.captureScreenshot(driver, "Case34_3");
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone11	= driver.findElement(mobileLocators.doneclick);
        keypaddone11.click();
        // Log console message to Allure
        LOGGER.info("Click on keypaddone");
        AllureUtils.logStep("Click on keypaddone");
        AllureUtils.captureScreenshot(driver, "Case34_4");
        
        // Click on fuel search field 
        WebElement additionalfuel11 = driver.findElement(mobileLocators.additionalsearch);
        additionalfuel11.click();
        // Log console message to Allure
        LOGGER.info("Click on additionalfuel");
        AllureUtils.logStep("Click on additionalfuel");
        AllureUtils.captureScreenshot(driver, "Case34_5");
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "lunchadd1");
          
        additionalfuel11.sendKeys(mobileTestData.food10);
        
 
        WebElement Keypaddone1	= driver.findElement(mobileLocators.doneclick);
        Keypaddone1.click();
        // Log console message to Allure
        LOGGER.info("Enter values for search, Click on Done");
        AllureUtils.logStep("Enter values for search, Click on done");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case34_7");
        
        Thread.sleep(2500);
        WebElement brandedshowmore	= driver.findElement(mobileLocators.showmorebutton);
        brandedshowmore.click();
        // Log console message to Allure
        LOGGER.info("Click on brandedshowmore");
        AllureUtils.logStep("Click on brandedshowmore");
        AllureUtils.captureScreenshot(driver, "Case34_8");
        Thread.sleep(2500);
        
        WebElement fuelselection11	= driver.findElement(mobileLocators.stewmeat);
        fuelselection11.click();
        // Log console message to Allure
        LOGGER.info("Click on fuelselection");
        AllureUtils.logStep("Click on fuelselection");
        AllureUtils.captureScreenshot(driver, "Case34_9");
        
        Thread.sleep(4500);
        
        // Click on timer 
        WebElement Timerclick1 	= driver.findElement(mobileLocators.Time);
        Timerclick1.click();
        List<WebElement>values1 = driver.findElements(mobileLocators.pickerelement);
		for (int i=0; i<values1.size();i++)
		{		
		System.out.println(values1.get(i).getText());
		}
		values1.get(0).sendKeys("01");
		values1.get(0).sendKeys(Keys.TAB);
		Thread.sleep(3500);
		values1.get(1).sendKeys("03");
		values1.get(1).sendKeys(Keys.TAB);
		Thread.sleep(3500);
		values1.get(2).sendKeys("PM");
		driver.findElement(mobileLocators.Doneclick).click();
		// Log console message to Allure
		LOGGER.info("enter time ");
		AllureUtils.logStep("Enter time");    
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "Case34_10");
        
    	WebElement submit11 = driver.findElement(mobileLocators.lunchsubmittick);
		submit11.click();
		// Log console message to Allure
        LOGGER.info("Click on submit");
        AllureUtils.logStep("Click on submit");
        AllureUtils.captureScreenshot(driver, "Case34_11");
		
    
        Thread.sleep(2500);
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "additional6");
        // Locate the element related to breakfast + icon 
        WebElement latesnacksplus 	= driver.findElement(mobileLocators.lateSnackplus);
        latesnacksplus.click();
        // Log console message to Allure
        LOGGER.info("Click on latesnacksplus");
        AllureUtils.logStep("Click on latesnacksplus");
        AllureUtils.captureScreenshot(driver, "Case37_3");
        	
        //click on keypad Done button to hide keypad
        WebElement keypaddone111	= driver.findElement(mobileLocators.doneclick);
        keypaddone111.click();
        // Log console message to Allure
        LOGGER.info("Click on keypaddone");
        AllureUtils.logStep("Click on keypaddone");
        AllureUtils.captureScreenshot(driver, "Case37_4");
        
        // Click on fuel search field 
        WebElement additionalfuel111 = driver.findElement(mobileLocators.additionalsearch);
        additionalfuel111.click();
        // Log console message to Allure
        LOGGER.info("Click on additionalfuel");
        AllureUtils.logStep("Click on additionalfuel");
        AllureUtils.captureScreenshot(driver, "Case37_5");
         
        
        additionalfuel111.sendKeys(mobileTestData.food12);
        Thread.sleep(2500);
 
        WebElement Keypaddone11	= driver.findElement(mobileLocators.doneclick);
        Keypaddone11.click();
        // Log console message to Allure
        LOGGER.info("Enter values for search, Click on Done");
        AllureUtils.logStep("Enter values for search, Click on done");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case37_6");
        Thread.sleep(2500);
        WebElement fuelselection111	= driver.findElement(mobileLocators.Venisonfuelselection);
        fuelselection111.click();
        // Log console message to Allure
        LOGGER.info(" Click on fuelselection");
        AllureUtils.logStep("Click on fuelselection");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case36_7");
        
        
        // Capture a screenshot and attach it to Allure
	    AllureUtils.captureScreenshot(driver, "latesnacks1");
        Thread.sleep(4500);
        
        
        // Click on timer 
        WebElement Timerclick11 	= driver.findElement(mobileLocators.Time);
        Timerclick11.click();
        List<WebElement>values11 = driver.findElements(mobileLocators.pickerelement);
		for (int i=0; i<values11.size();i++)
		{		
		System.out.println(values11.get(i).getText());
		}
		values11.get(0).sendKeys("5");
		values11.get(0).sendKeys(Keys.TAB);
		Thread.sleep(3500);
		values11.get(1).sendKeys("18");
		values11.get(1).sendKeys(Keys.TAB);
		Thread.sleep(3500);
		values11.get(2).sendKeys("PM");
		driver.findElement(mobileLocators.Doneclick).click();
		// Log console message to Allure
        LOGGER.info(" Click on done");
        AllureUtils.logStep("Click on done");
		
		 // Capture a screenshot and attach it to Allure
	    AllureUtils.captureScreenshot(driver, "latesnacks2");
	    Thread.sleep(2500);
    	WebElement submit111 = driver.findElement(mobileLocators.latesncaktick);
		submit111.click();
		// Log console message to Allure
        LOGGER.info(" Click on submit");
        AllureUtils.logStep("Click on submit");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case37_8");
        Thread.sleep(3500);
        
        // Locate the element related to dinner + icon 
        WebElement latesnacksplus1 	= driver.findElement(mobileLocators.dinnerplusicon);
        latesnacksplus1.click();
        // Log console message to Allure
        LOGGER.info("Click on latesnacksplus");
        AllureUtils.logStep("Click on latesnacksplus");
        AllureUtils.captureScreenshot(driver,"41_3");
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone1111	= driver.findElement(mobileLocators.doneclick);
        keypaddone1111.click();
        // Log console message to Allure
        LOGGER.info("Click on keypaddone");
        AllureUtils.logStep("Click on keypaddone");
        AllureUtils.captureScreenshot(driver,"41_4");
        
        // Click on fuel search field 
        WebElement additionalfuel1111 = driver.findElement(mobileLocators.additionalsearch);
        additionalfuel1111.click();
        // Log console message to Allure
        LOGGER.info("Click on additionalfuel");
        AllureUtils.logStep("Click on additionalfuel");
        AllureUtils.captureScreenshot(driver,"41_5");
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Dinner5");
        
        additionalfuel1111.sendKeys(mobileTestData.food15);
        Thread.sleep(2500);
 
        WebElement Keypaddone111	= driver.findElement(mobileLocators.doneclick);
        Keypaddone111.click();
        // Log console message to Allure
        LOGGER.info("Enter values for search, Click on Done");
        AllureUtils.logStep("Enter values for search, Click on done");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case41_6");
        
        WebElement fuelselection1111	= driver.findElement(mobileLocators.juicefuelselection);
        fuelselection1111.click();
        // Log console message to Allure
        LOGGER.info("Click on fuelselection");
        AllureUtils.logStep("Click on fuelselection");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case41_7");
        
        Thread.sleep(4500);
        
        // Click on timer 
        WebElement Timerclick111 	= driver.findElement(mobileLocators.Time);
        Timerclick111.click();
        List<WebElement>values111 = driver.findElements(mobileLocators.pickerelement);
		for (int i=0; i<values111.size();i++)
		{		
		System.out.println(values111.get(i).getText());
		}
		values111.get(0).sendKeys("9");
		values111.get(0).sendKeys(Keys.TAB);
		Thread.sleep(3500);
		values111.get(1).sendKeys("18");
		values111.get(1).sendKeys(Keys.TAB);
		Thread.sleep(3500);
		values111.get(2).sendKeys("PM");
		driver.findElement(mobileLocators.Doneclick).click();
		// Log console message to Allure
		LOGGER.info("enter time ");
		AllureUtils.logStep("Enter time");    
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "Case41_8");
		
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Dinner6");
        
    	WebElement submit1111 = driver.findElement(mobileLocators.dinnerTickoption);
		submit1111.click();
		// Log console message to Allure
		LOGGER.info("click on submit ");
		AllureUtils.logStep("click on submit");    
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "Case41_9");

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
//                driver.terminateApp("com.cuesz.mobile");
                driver.terminateApp(mobileTestData.bundelID);
            }
        }
    }