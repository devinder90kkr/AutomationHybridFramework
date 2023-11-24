package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

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

@Epic ("Fuel screen detail ")
@Feature ("Verify Fuel detail functionlaity related to optimal fuel")
public class Case20_Fuel_optimalfuel extends AppiummobileBase {
	
	private By Homeclick = 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");

	private By fuellabel = 		AppiumBy.iOSNsPredicateString("name == 'Fuel'");
	private By Fuelmacroheading = 	AppiumBy.iOSNsPredicateString("name == 'FUEL MACROS BREAKDOWN'");
	private By arrowclick1 		= AppiumBy.accessibilityId("FuelCaloriesArrowLeft");
	private By arrowclick2		=  AppiumBy.accessibilityId("FuelCaloriesArrowRight");

	private By dayseven		= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"7 days\"])[2]");
	private By dayfourteen	= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"14 days\"])[2]");
//	private By Yestrday		= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"Yesterday\"])[2]");
	private By backfuel		= AppiumBy.accessibilityId("FuelCalorieBackPress");
	private By Protcard		= AppiumBy.accessibilityId("Protein");
	private By crossicon1	= AppiumBy.accessibilityId("FuelMacroNutrientCross");
	private By carbcard		= AppiumBy.accessibilityId("Carbs");
	private By fatcard		= AppiumBy.accessibilityId("Fat");
//	private By popup1		= AppiumBy.accessibilityId("FuelDrinkInfo");
	private By glas1		= AppiumBy.accessibilityId("WaterGlass1");
	private By glas2		= AppiumBy.accessibilityId("WaterGlass2");	
	private By glas3		= AppiumBy.accessibilityId("WaterGlass3");	
	private By glas4		= AppiumBy.accessibilityId("WaterGlass4");	
	private By caffeine		= AppiumBy.accessibilityId("CaffeineDeviation");
	private By cof1		= AppiumBy.accessibilityId("Coffee1");
	private By cof2		= AppiumBy.accessibilityId("Coffee2");	
	private By cof3		= AppiumBy.accessibilityId("Coffee3");	
	private By cof4		= AppiumBy.accessibilityId("Coffee4");	
	private By tea1		= AppiumBy.accessibilityId("Tea1");
	private By tea2		= AppiumBy.accessibilityId("Tea2");
	private By grentea1		= AppiumBy.accessibilityId("Green tea1");
	private By grentea2		= AppiumBy.accessibilityId("Green tea2");
	private By grentea3		= AppiumBy.accessibilityId("Green tea3");
	private By grentea4		= AppiumBy.accessibilityId("Green tea4");
	private By grentea5		= AppiumBy.accessibilityId("Green tea5");
	private By sugarbtn		= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"CaffineRadioButton\"])[2]");
	private By notesection	= AppiumBy.accessibilityId("CaffineDeviationNotes");
	private By Time				= 		AppiumBy.accessibilityId("SelectCaffineTime");
	private By pickerelement	= 		AppiumBy.xpath("//XCUIElementTypePickerWheel");
	private By Doneclick		= 		AppiumBy.accessibilityId("AlcohalTime");
	private By Caffientick		=		AppiumBy.accessibilityId("CaffineSubmit");
	private By alcholotap		= 		AppiumBy.accessibilityId("alcohalDeviation");
	private By Tequglass1		= 		AppiumBy.accessibilityId("Tequila1");
	private By Tequglass2		= 		AppiumBy.accessibilityId("Tequila2");
	private By Tequglass3		= 		AppiumBy.accessibilityId("Tequila3");
	private By Tequglass4		= 		AppiumBy.accessibilityId("Tequila4");
	private By moji1			= 		AppiumBy.accessibilityId("Mojito1");
	private By moji2			= 		AppiumBy.accessibilityId("Mojito2");
	private By lager1			= 		AppiumBy.accessibilityId("Lager1");
	private By lager2			= 		AppiumBy.accessibilityId("Lager2");
	private By lager3			= 		AppiumBy.accessibilityId("Lager3");
	private By lager4			= 		AppiumBy.accessibilityId("Lager4");
	private By lager5			= 		AppiumBy.accessibilityId("Lager5");
	private By Adalchol			= 		AppiumBy.accessibilityId("Add Alcohol Deviation");
	private By deviationnotes	= 		AppiumBy.accessibilityId("AlcohalDeviationNotes");
	private By sugarmixer		= 		AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"Sugar Mixer\"])[2]");
	private By Alcohaltick		= 		AppiumBy.accessibilityId("AlcohalSubmit");
	private By Electrolyte		= 		AppiumBy.accessibilityId("ElectrolyteDeviation");
	private By electro1			= 		AppiumBy.accessibilityId("ElectrolyteDeviation1");
	private By electro2			= 		AppiumBy.accessibilityId("ElectrolyteDeviation2");
	private By noteselectro		= 		AppiumBy.accessibilityId("ElectrolyteNotes");
	private By Submitelctro		= 		AppiumBy.accessibilityId("ElectrolyteSubmit");
	
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
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
		
        
        // Home button click
		WebElement Homeicon = driver.findElement(Homeclick);
		Homeicon.click();
		
		Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject =new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("Perform Fuel Mindful Restore", "Perform");
		driver.executeScript("mobile:scroll", scrollObject);
		Thread.sleep(2000);

		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel1");
     
        //Click on Fuel tab 
        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();
        	
		// Locate the element containing the perform
        WebElement Fuel1 = driver.findElement(fuellabel);
        // Extract text from the element
        String actualText = Fuel1.getText();
        // Define the expected text
        String expectedText = "Fuel";
        
        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText);
        System.out.println("Expected Text: " + expectedText);
        // Compare the actual and expected text
        Assert.assertEquals(actualText, expectedText);
		
		// click on Calories optimal fuel 
        driver.findElement(AppiumBy.accessibilityId("Calories")).click();
        
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel2");
        
        // Locate the element containing the perform
        WebElement Fuelmacro = driver.findElement(Fuelmacroheading);
        // Extract text from the element
        String actualText2 = Fuelmacro.getText();
        // Define the expected text
        String expectedText2 = "FUEL MACROS BREAKDOWN";
        
        // Print the actual and expected text to the console
        System.out.println("Actual Text: " + actualText2);
        System.out.println("Expected Text: " + expectedText2);
        // Compare the actual and expected text
        Assert.assertEquals(actualText2, expectedText2);
       
        {
        // Click on fuelBackArrow button 4 times
	    for (int i = 0; i < 3; i++) {
	        WebElement backarrow = driver.findElement(arrowclick1);
	        backarrow.click();
	      //  Thread.sleep(1000); // Optional delay to observe the action
	    }
        
      
        }
        // Click on fuelBackArrow button 4 times
	    for (int i = 0; i < 2; i++) {
	        WebElement forwardarrow = driver.findElement(arrowclick2);
	        forwardarrow.click();
	    }
       
        
		// Method to scroll to Food Senstivity card
		HashMap<String,Object>scrollObject2 =new HashMap<>();
		scrollObject2.put("direction", "down");
		scrollObject2.put("Today", "Today");
		driver.executeScript("mobile:scroll", scrollObject2);
      
		//Click on  7days from 
		WebElement day7 = driver.findElement(dayseven);
		day7.click();
  
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel3");
		
		//Click on  14days from 
		WebElement day14 = driver.findElement(dayfourteen);
		day14.click();
	
		//Click on backfuel from macrobreakdown screen
		WebElement backclick = driver.findElement(backfuel);
		backclick.click();
		
		//click on protein card
		WebElement protein = driver.findElement(Protcard);
		protein.click();	
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel4");
		
		//Click on protein cross icon
		WebElement proteincross = driver.findElement(crossicon1);
		proteincross.click();
		
		//click on carbs card
		WebElement carbs = driver.findElement(carbcard);
		carbs.click();	
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel5");
		//Click on protein cross icon
		WebElement carbscross = driver.findElement(crossicon1);
		carbscross.click();
		
		//click on fats card
		WebElement fats = driver.findElement(fatcard);
		fats.click();	
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel6");
		//Click on protein cross icon
		WebElement fatscross = driver.findElement(crossicon1);
		fatscross.click();
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel7");
		
		
		// Array of glass locators
        By[] glassLocators = {glas1, glas2, glas3, glas4};
        try {
         // Click on glasses using a loop
            for (By locator : glassLocators) {
                try {
                    WebElement glass = driver.findElement(locator);
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
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel8");
        
        // locate Caffeine deviation icon
        WebElement caffeineicon	= driver.findElement(caffeine);
        caffeineicon.click();      
     // Array of coffee glass locators
        By[] coffee = {cof1, cof2, cof3, cof4};
        try {     
            // Click on glasses using a loop
            for (By locator1 : coffee) {
                try {
                    WebElement glass = driver.findElement(locator1);
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
        
    	// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel9");
        
        // Array of tea glass locators
        By[] tea = {tea1, tea2};
        try {
       
            // Click on glasses using a loop
            for (By locator2 : tea) {
                try {
                    WebElement glass = driver.findElement(locator2);
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
        
    	// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel10");
        
        
     // Array of green tea glass locators
        By[] greentea = {grentea1, grentea2, grentea3, grentea4, grentea5};
        try {
       
            // Click on glasses using a loop
            for (By locator3 : greentea) {
                try {
                    WebElement glass = driver.findElement(locator3);
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
        
    	// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel11");
        
        // Locate and select radio button for sugar
        WebElement sugar1  = driver.findElement(sugarbtn);
        sugar1.click();
        
        // locate and add notes for field
        WebElement notesfield = driver.findElement(notesection);
        notesfield.sendKeys(" You're doing an amazing job, and I admire your determination and resilience. Keep pushing forward and remember that you are capable of achieving great things.");
        
    	// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel12");
        
       // Click on timer 
        WebElement Timerclick 	= driver.findElement(Time);
        Timerclick.click();
        // Click on timer 
        WebElement Timerclick1 	= driver.findElement(Time);
        Timerclick1.click();
        
        List<WebElement>values = driver.findElements(pickerelement);

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
		  
		driver.findElement(Doneclick).click();
		
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel13");
		
		
		WebElement caffiensubmit	= driver.findElement(Caffientick);
		caffiensubmit.click();
        
		/*************************/
		
		//locate and click on alcohol deviation popup 
		WebElement alcoholclick	= driver.findElement(alcholotap);
		alcoholclick.click();
		
	    // Array of Tequila glass locators
        By[] Tequila = {Tequglass1, Tequglass2, Tequglass3, Tequglass4};
        try {   
            // Click on glasses using a loop
            for (By locator3 : Tequila) {
                try {
                    WebElement glass = driver.findElement(locator3);
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
    	// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel14");
		
        
        // Array of Mojito glass locators
        By[] Mojito = {moji1, moji2};
        try {   
            // Click on glasses using a loop
            for (By locator4 : Mojito) {
                try {
                    WebElement glass = driver.findElement(locator4);
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
    	// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel15");
        
        
        // Array of Lager glass locators
        By[] Lager = {lager1, lager2, lager3, lager4, lager5};
        try {   
            // Click on glasses using a loop
            for (By locator5 : Lager) {
                try {
                    WebElement glass = driver.findElement(locator5);
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
    	// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel16");
        
        
        WebElement addalchol = driver.findElement(Adalchol);
        addalchol.click();
        
        WebElement alcholodeviation	= driver.findElement(deviationnotes);
        alcholodeviation.sendKeys("testing notes for Alcholo, ek glass vodka kaam mera roj ka");
        
        WebElement Sugarbttn 	= driver.findElement(sugarmixer);
        Sugarbttn.click();
        Sugarbttn.click();
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel17");
        
        WebElement alcholosubmit	= driver.findElement(Alcohaltick);
        alcholosubmit.click();
        
        
        /*********************************/
        
        WebElement Electrolyteicon	= driver.findElement(Electrolyte);
        Electrolyteicon.click();
        
        
        // Array of electrolyte glass locators
        By[] electrolyte = {electro1, electro2};
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
    	// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Optimalfuel18");
		
        WebElement elctronotes	= driver.findElement(noteselectro);
        elctronotes.sendKeys("Dont take any electrolyte consumtion");
        
        WebElement elctrosubmitclick =  driver.findElement(Submitelctro);
        elctrosubmitclick.click();
        elctrosubmitclick.click();
        
		
		Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
	}
}
	

