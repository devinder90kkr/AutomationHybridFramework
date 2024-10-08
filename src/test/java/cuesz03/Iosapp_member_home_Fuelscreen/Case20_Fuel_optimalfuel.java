package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
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
@Feature ("Verify Fuel detail functionlaity related to optimal fuel")
public class Case20_Fuel_optimalfuel extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case20_Fuel_optimalfuel.class);
	mobileLocators locators = new mobileLocators();
	
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Member Fuel screen detail verification")
    @Story("Scroll to Fuel card and verify optimal fuel assigned by staff ")		
	public void Fuel_optimalfuel() throws InterruptedException
	{	
		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
//        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
		 appiumUtils.launchAppWithPackageId(mobileTestData.bundelID);
		
        
        // Home button click
		WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
		Homeicon.click();		
		 // Log console message to Allure
        LOGGER.info("Click on home menu from bottom");
        AllureUtils.logStep("Click on home menu from bottom");
		
		
		Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject =new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("Perform Fuel Mindful Restore", "Perform");
		driver.executeScript("mobile:scroll", scrollObject);
		Thread.sleep(2000);

		 // Log console message to Allure
        LOGGER.info("scroll down to fuel card");
        AllureUtils.logStep("scroll down to fuel card");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel1");
     
        //Click on Fuel tab 
        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();
        
        // Log console message to Allure
        LOGGER.info("Click on FUEL_SCREEN");
        AllureUtils.logStep("Click on FUEL_SCREEN");
        	
		// Locate the element containing the perform
        WebElement Fuel1 = driver.findElement(mobileLocators.fuellabel);
        // Extract text from the element
        String actualText = Fuel1.getText();
        // Define the expected text
        String expectedText = "Fuel";
        
        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText);
        System.out.println("Expected Text: " + expectedText);
        // Compare the actual and expected text
        Assert.assertEquals(actualText, expectedText);

        AllureUtils.logStep(actualText);
        AllureUtils.logStep(expectedText);
		
		// click on Calories optimal fuel 
        driver.findElement(AppiumBy.accessibilityId("Calories")).click(); 
        // Log console message to Allure
        LOGGER.info("Click on Calories");
        AllureUtils.logStep("Click on Calories");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel2");
        
        // Locate the element containing the perform
        WebElement Fuelmacro = driver.findElement(mobileLocators.Fuelmacroheading);
        // Extract text from the element
        String actualText2 = Fuelmacro.getText();
        // Define the expected text
        String expectedText2 = "FUEL MACROS BREAKDOWN";
        
        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText2);
        System.out.println("Expected Text: " + expectedText2);
        // Compare the actual and expected text
        Assert.assertEquals(actualText2, expectedText2);
        
        AllureUtils.logStep(actualText2);
        AllureUtils.logStep(expectedText2);
       
        {
        // Click on fuelBackArrow button 4 times
	    for (int i = 0; i < 3; i++) {
	        WebElement backarrow = driver.findElement(mobileLocators.arrowclick1);
	        backarrow.click();
	        // Log console message to Allure
	        LOGGER.info("Click on backarrow");
	        AllureUtils.logStep("Click on backarrow");	        
	      //  Thread.sleep(1000); // Optional delay to observe the action
	    }
        
      
        }
        // Click on fuelBackArrow button 4 times
	    for (int i = 0; i < 2; i++) {
	        WebElement forwardarrow = driver.findElement(mobileLocators.arrowclick2);
	        forwardarrow.click();
	        // Log console message to Allure
	        LOGGER.info("Click on forwardarrow");
	        AllureUtils.logStep("Click on forwardarrow");   
	    }
       
        
		// Method to scroll to Food Senstivity card
		HashMap<String,Object>scrollObject2 =new HashMap<>();
		scrollObject2.put("direction", "down");
		scrollObject2.put("Today", "Today");
		driver.executeScript("mobile:scroll", scrollObject2);
      
		//Click on  7days from 
		WebElement day7 = driver.findElement(mobileLocators.dayseven);
		day7.click();
		 // Log console message to Allure
        LOGGER.info("Click on day click");
        AllureUtils.logStep("Click on day click");
  
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel3");
		
		//Click on  14days from 
		WebElement day14 = driver.findElement(mobileLocators.dayfourteen);
		day14.click();
		 // Log console message to Allure
        LOGGER.info("Click on dayfourteen ");
        AllureUtils.logStep("Click on dayfourteen");
	
		//Click on backfuel from macrobreakdown screen
		WebElement backclick = driver.findElement(mobileLocators.backfuel);
		backclick.click();
		// Log console message to Allure
        LOGGER.info("Click on backclick ");
        AllureUtils.logStep("Click on backclick");
		
		//click on protein card
		WebElement protein = driver.findElement(mobileLocators.Protcard);
		protein.click();	
		// Log console message to Allure
        LOGGER.info("Click on protein ");
        AllureUtils.logStep("Click on protein");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel4");
		
		//Click on protein cross icon
		WebElement proteincross = driver.findElement(mobileLocators.crossicon1);
		proteincross.click();
		// Log console message to Allure
        LOGGER.info("Click on proteincross ");
        AllureUtils.logStep("Click on proteincross");
			
		//click on carbs card
		WebElement carbs = driver.findElement(mobileLocators.carbcard);
		carbs.click();	
		// Log console message to Allure
        LOGGER.info("Click on carbs");
        AllureUtils.logStep("Click on carbs");
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel5");
		
        //Click on protein cross icon
		WebElement carbscross = driver.findElement(mobileLocators.crossicon1);
		carbscross.click();
		// Log console message to Allure
        LOGGER.info("Click on carbscross");
        AllureUtils.logStep("Click on carbscross");
		
        //click on fats card
		WebElement fats = driver.findElement(mobileLocators.fatcard);
		fats.click();	
		// Log console message to Allure
        LOGGER.info("Click on fats");
        AllureUtils.logStep("Click on fats");
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel6");
		
        //Click on protein cross icon
		WebElement fatscross = driver.findElement(mobileLocators.crossicon1);
		fatscross.click();
		// Log console message to Allure
        LOGGER.info("Click on fatscross");
        AllureUtils.logStep("Click on fatscross");
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel7");
		
		
		// Array of glass locators
        By[] glassLocators = {mobileLocators.glas1, mobileLocators.glas2, mobileLocators.glas3, mobileLocators.glas4};
        try {
         // Click on glasses using a loop
            for (By locator : glassLocators) {
                try {
                    WebElement glass = driver.findElement(locator);
                    glass.click();
                    LOGGER.info("Clicked on glass: " + locator);
                    AllureUtils.logStep("Clicked on glass: " + locator);
                    // Add logic for validation or other actions if necessary
                } catch (NoSuchElementException e) {
                    System.out.println("Element not found: " + e.getMessage());
                    LOGGER.error("Element not found: " + e.getMessage());
                    // Handle the exception (e.g., log, retry, or terminate the loop)
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel8");
        
        // locate Caffeine deviation icon
        WebElement caffeineicon	= driver.findElement(mobileLocators.caffeine);
        caffeineicon.click();      
        LOGGER.info("Clicked on caffeine icon");
        AllureUtils.logStep("Clicked on caffeine icon");
     // Array of coffee glass locators
        By[] coffee = {mobileLocators.cof1, mobileLocators.cof2, mobileLocators.cof3, mobileLocators.cof4};
        try {     
            // Click on glasses using a loop
            for (By locator1 : coffee) {
                try {
                    WebElement glass = driver.findElement(locator1);
                    glass.click();
                    LOGGER.info("Clicked on coffee glass: " + locator1);
                    AllureUtils.logStep("Clicked on coffee glass: " + locator1);
                    // Add logic for validation or other actions if necessary
                } catch (NoSuchElementException e) {
                    System.out.println("Element not found: " + e.getMessage());
                    LOGGER.error("Element not found: " + e.getMessage());
                    // Handle the exception (e.g., log, retry, or terminate the loop)
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    	// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel9");
        
        // Array of tea glass locators
        By[] tea = {mobileLocators.tea1, mobileLocators.tea2};
        try {
       
            // Click on glasses using a loop
            for (By locator2 : tea) {
                try {
                    WebElement glass = driver.findElement(locator2);
                    glass.click();
                    LOGGER.info("Clicked on coffee glass: " + locator2);
                    AllureUtils.logStep("Clicked on coffee glass: " + locator2);
                    // Add logic for validation or other actions if necessary
                } catch (NoSuchElementException e) {
                    System.out.println("Element not found: " + e.getMessage());
                    LOGGER.error("Element not found: " + e.getMessage());
                    // Handle the exception (e.g., log, retry, or terminate the loop)
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    	// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel10");
        
        
     // Array of green tea glass locators
        By[] greentea = {mobileLocators.grentea1, mobileLocators.grentea2, mobileLocators.grentea3, mobileLocators.grentea4, mobileLocators.grentea5};
        try {
       
            // Click on glasses using a loop
            for (By locator3 : greentea) {
                try {
                    WebElement glass = driver.findElement(locator3);
                    glass.click();
                    LOGGER.info("Clicked on coffee glass: " + locator3);
                    AllureUtils.logStep("Clicked on coffee glass: " + locator3);
                    // Add logic for validation or other actions if necessary
                } catch (NoSuchElementException e) {
                    System.out.println("Element not found: " + e.getMessage());
                    LOGGER.error("Element not found: " + e.getMessage());
                    // Handle the exception (e.g., log, retry, or terminate the loop)
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    	// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel11");
        
        // Locate and select radio button for sugar
        WebElement sugar1  = driver.findElement(mobileLocators.sugarbtn);
        sugar1.click();
        //logs logger 
        LOGGER.info("Clicked on sugar1");
        AllureUtils.logStep("Clicked on sugar1");
        
        // locate and add notes for field
        WebElement notesfield = driver.findElement(mobileLocators.notesection);
        notesfield.sendKeys(mobileTestData.notefield);
        //logs logger 
        LOGGER.info("enter values in note field");
        AllureUtils.logStep("enter values in note field");
        
    	// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel12");
        
       
        
        // Click on timer 
        WebElement Timerclick 	= driver.findElement(mobileLocators.Time1);
        Timerclick.click();
        //logs logger 
        LOGGER.info("Clicked on Timerclick");
        AllureUtils.logStep("Clicked on Timerclick");
        
        // Click on timer 
        WebElement Timerclick1 	= driver.findElement(mobileLocators.Time1);
        Timerclick1.click();
        //logs logger 
        LOGGER.info("Clicked on Timerclick1");
        AllureUtils.logStep("Clicked on Timerclick1");
        
        
        
        List<WebElement>values = driver.findElements(mobileLocators.pickerelement);

		for (int i=0; i<values.size();i++)
		{		
		System.out.println(values.get(i).getText());
		}
		
		Thread.sleep(3500);
		values.get(2).sendKeys("AM");
		
		Thread.sleep(3500);
		values.get(0).sendKeys("6");
		values.get(0).sendKeys(Keys.TAB);

		Thread.sleep(3500);
		values.get(1).sendKeys("43");
		values.get(1).sendKeys(Keys.TAB);
		  
		driver.findElement(mobileLocators.Doneclick).click();
		 //logs logger 
        LOGGER.info("Clicked on Doneclick");
        AllureUtils.logStep("Clicked on Doneclick");
		
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel13");
		
		
		WebElement caffiensubmit	= driver.findElement(mobileLocators.Caffientick);
		caffiensubmit.click();
		 //logs logger 
        LOGGER.info("Clicked on caffiensubmit");
        AllureUtils.logStep("Clicked on caffiensubmit");
		
		/*************************/
		
		//locate and click on alcohol deviation popup 
		WebElement alcoholclick	= driver.findElement(mobileLocators.alcholotap);
		alcoholclick.click();
		//logs logger 
        LOGGER.info("Clicked on alcoholclick");
        AllureUtils.logStep("Clicked on alcoholclick");
		
		
	    // Array of Tequila glass locators
        By[] Tequila = {mobileLocators.Tequglass1, mobileLocators.Tequglass2, mobileLocators.Tequglass3, mobileLocators.Tequglass4};
        try {   
            // Click on glasses using a loop
            for (By locator31 : Tequila) {
                try {
                    WebElement glass = driver.findElement(locator31);
                    glass.click();
                    LOGGER.info("Clicked on coffee glass: " + locator31);
                    AllureUtils.logStep("Clicked on coffee glass: " + locator31);
                    
                    // Add logic for validation or other actions if necessary
                } catch (NoSuchElementException e) {
                    System.out.println("Element not found: " + e.getMessage());
                    LOGGER.error("Element not found: " + e.getMessage());
                    // Handle the exception (e.g., log, retry, or terminate the loop)
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }       
    	// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel14");
		
        
        // Array of Mojito glass locators
        By[] Mojito = {mobileLocators.moji1, mobileLocators.moji2};
        try {   
            // Click on glasses using a loop
            for (By locator4 : Mojito) {
                try {
                    WebElement glass = driver.findElement(locator4);
                    glass.click();
                    LOGGER.info("Clicked on coffee glass: " + locator4);
                    AllureUtils.logStep("Clicked on coffee glass: " + locator4);
                    // Add logic for validation or other actions if necessary
                } catch (NoSuchElementException e) {
                    System.out.println("Element not found: " + e.getMessage());
                    LOGGER.error("Element not found: " + e.getMessage());
                    // Handle the exception (e.g., log, retry, or terminate the loop)
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }       
    	// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel15");
        
        
        // Array of Lager glass locators
        By[] Lager = {mobileLocators.lager1, mobileLocators.lager2, mobileLocators.lager3, mobileLocators.lager4, mobileLocators.lager5};
        try {   
            // Click on glasses using a loop
            for (By locator5 : Lager) {
                try {
                    WebElement glass = driver.findElement(locator5);
                    glass.click();
                    LOGGER.info("Clicked on coffee glass: " + locator5);
                    AllureUtils.logStep("Clicked on coffee glass: " + locator5);
                    // Add logic for validation or other actions if necessary
                } catch (NoSuchElementException e) {
                    System.out.println("Element not found: " + e.getMessage());
                    LOGGER.error("Element not found: " + e.getMessage());
                    // Handle the exception (e.g., log, retry, or terminate the loop)
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }       
    	// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel16");
        
        
        WebElement addalchol = driver.findElement(mobileLocators.Adalchol);
        addalchol.click();
        //logs logger 
        LOGGER.info("Clicked on addalchol");
        AllureUtils.logStep("Clicked on addalchol");
        
        WebElement alcholodeviation	= driver.findElement(mobileLocators.deviationnotes);
        alcholodeviation.sendKeys(mobileTestData.notefield);
        //logs logger 
        LOGGER.info("enter values for alcholodeviation");
        AllureUtils.logStep("enter values for alcholodeviation");
        
        WebElement Sugarbttn 	= driver.findElement(mobileLocators.sugarmixer);
        Sugarbttn.click();
        Sugarbttn.click();
        //logs logger 
        LOGGER.info("Clicked on Sugarbttn");
        AllureUtils.logStep("Clicked on Sugarbttn");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel17");
        
        WebElement alcholosubmit	= driver.findElement(mobileLocators.Alcohaltick);
        alcholosubmit.click();
        //logs logger 
        LOGGER.info("Clicked on alcholosubmit");
        AllureUtils.logStep("Clicked on alcholosubmit");
        
        /*********************************/
        try {
        WebElement Electrolyteicon	= driver.findElement(mobileLocators.Electrolyte);
        Electrolyteicon.click();
        //logs logger 
        LOGGER.info("Clicked on Electrolyteicon");
        AllureUtils.logStep("Clicked on Electrolyteicon");
        
        
        // Array of electrolyte glass locators
        By[] electrolyte = {mobileLocators.electro1optimal, mobileLocators.electro2optimal};
        try {   
            // Click on glasses using a loop
            for (By locator6 : electrolyte) {
                try {
                    WebElement glass = driver.findElement(locator6);
                    glass.click();
                    LOGGER.info("Clicked on coffee glass: " + locator6);
                    AllureUtils.logStep("Clicked on coffee glass: " + locator6);
                    // Add logic for validation or other actions if necessary
                } catch (NoSuchElementException e) {
                    System.out.println("Element not found: " + e.getMessage());
                    LOGGER.error("Element not found: " + e.getMessage());
                    // Handle the exception (e.g., log, retry, or terminate the loop)
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }       
    	// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel18");
		
        WebElement elctronotes	= driver.findElement(mobileLocators.noteselectro);
        elctronotes.sendKeys(mobileTestData.notefield);
        //logs logger 
        LOGGER.info("Entered values for elctronotes");
        AllureUtils.logStep("Clicked on elctronotes");
		

        WebElement elctrosubmitclick =  driver.findElement(mobileLocators.Submitelctro);
        elctrosubmitclick.click();
        elctrosubmitclick.click();
        //logs logger 
        LOGGER.info("Clicked on elctrosubmitclick");
        AllureUtils.logStep("Clicked on elctrosubmitclick");
		
		Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
        } catch (NoSuchElementException e) {
            LOGGER.error("Electrolyte icon not found: " + e.getMessage());
            AllureUtils.logStep("Electrolyte icon not found: " + e.getMessage());
        } catch (Exception e) {
            LOGGER.error("Exception occurred: " + e.getMessage());
        } finally {
            // Always terminate the app after test execution
//            driver.terminateApp("com.cuesz.mobile");
        	 driver.terminateApp(mobileTestData.bundelID);
        }
    }
}