package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@Feature ("Verify Fuel detail functionlaity related to early snacks fuel.")
public class Case30_Fuel_Earlysnacks_additionalfuel extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case30_Fuel_Earlysnacks_additionalfuel.class);
	
	private By Homeclick 		= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By plusadd			= 		AppiumBy.accessibilityId("Early SnacksAddIcon");
	private By doneclick		= 		AppiumBy.accessibilityId("Done");
	private By additionalsearch	= 		AppiumBy.accessibilityId("AdditionalFuelSearch");
	private By cinamonfuelselection	=	AppiumBy.accessibilityId("Spiced Cider With Cinamon & Clove, Cold Pressed Fuji Apple, Organic");
	private By submitick		= 		AppiumBy.accessibilityId("ItemSubmit");
	private By Time				= 		AppiumBy.accessibilityId("AdditionalItemTime");
	private By pickerelement	= 		AppiumBy.xpath("//XCUIElementTypePickerWheel");
	private By Doneclick		= 		AppiumBy.accessibilityId("AlcohalTime");
	private By ginfuelselectionc	=	AppiumBy.accessibilityId("Organic Ginger Spread");
	
	
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Member Fuel screen detail verification")
    @Story("Scroll to Fuel card and verify early snacks ")	
	public void Fuel_Earlysnacks_additionalfuel() throws InterruptedException
	{	
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
 		AllureUtils.captureScreenshot(driver, "Case30_1");	
		 		
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
        AllureUtils.captureScreenshot(driver, "Case30_2");
        Thread.sleep(3500);
        
        // Method to scroll to perform screen
     		HashMap<String,Object>scrollObject1 =new HashMap<>();
     		scrollObject1.put("direction", "down");
     		scrollObject1.put("Breakfast", "Breakfast");
     		driver.executeScript("mobile:scroll", scrollObject1);
     		Thread.sleep(2000);
             
         
             // Method to scroll to perform screen
      		HashMap<String,Object>scrollObject12 =new HashMap<>();
      		scrollObject12.put("direction", "down");
      		scrollObject12.put("Early Snacks", "Early Snacks");
      		driver.executeScript("mobile:scroll", scrollObject12);
      		Thread.sleep(2000);
             
             Thread.sleep(5500);
        
        
        // Locate the element related to breakfast + icon 
        WebElement breakfastplus 	= driver.findElement(plusadd);
        breakfastplus.click();
        // Log console message to Allure
        LOGGER.info("Click on breakfastplus");
        AllureUtils.logStep("Click on breakfastplus");
        AllureUtils.captureScreenshot(driver, "breakfastplus_30");
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone	= driver.findElement(doneclick);
        keypaddone.click();
        // Log console message to Allure
        LOGGER.info("Click on Doneclick ");
        AllureUtils.logStep("Click on Doneclick"); 
        
        // Click on fuel search field 
        WebElement additionalfuel = driver.findElement(additionalsearch);
        additionalfuel.click();
        // Log console message to Allure
        LOGGER.info("Click on additionalfuel");
        AllureUtils.logStep("Click on additionalfuel");
        AllureUtils.captureScreenshot(driver, "additionalfuel_30");
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "earlysnack5");
        
        
        WebElement searchtext1	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"C\""));
        searchtext1.click();
        
        WebElement searchtext2	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"i\""));
        searchtext2.click();
        
        WebElement searchtext3	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"n\""));
        searchtext3.click();
        
        WebElement searchtext4	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"a\""));
        searchtext4.click();
        
        WebElement searchtext5	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"m\""));
        searchtext5.click();
        
        WebElement searchtext6	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"o\""));
        searchtext6.click();
        
        WebElement searchtext7	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"n\""));
        searchtext7.click();
 
        WebElement Keypaddone	= driver.findElement(doneclick);
        Keypaddone.click();
        
     // Log console message to Allure
        LOGGER.info("Enter value for search,Click on Done");
        AllureUtils.logStep("Enter value for search,Click on Done");       
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "additional1");
        
        WebElement fuelselection	= driver.findElement(cinamonfuelselection);
        fuelselection.click();
        // Log console message to Allure
        LOGGER.info("Click on fuelselection");
        AllureUtils.logStep("Click on fuelselection");
        AllureUtils.captureScreenshot(driver, "fuelselection_30");

        Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject15 =new HashMap<>();
		scrollObject15.put("direction", "down");
		scrollObject15.put("cinamonfuelselection", "cinamonfuelselection");
		driver.executeScript("mobile:scroll", scrollObject15);
        
        
        Thread.sleep(4500);
       
        
        driver.findElement(AppiumBy.iOSNsPredicateString("name == 'Early Snacks'")).click();
        Thread.sleep(4500);
          
        // Click on timer 
        WebElement Timerclick 	= driver.findElement(Time);
        Timerclick.click();
        List<WebElement>values = driver.findElements(pickerelement);
		for (int i=0; i<values.size();i++)
		{		
		System.out.println(values.get(i).getText());
		}
		values.get(0).sendKeys("11");
		values.get(0).sendKeys(Keys.TAB);
		Thread.sleep(3500);
		values.get(1).sendKeys("18");
		values.get(1).sendKeys(Keys.TAB);
		Thread.sleep(3500);
		values.get(2).sendKeys("AM");
		
		driver.findElement(Doneclick).click();
        
    	WebElement submit = driver.findElement(submitick);
		submit.click();
		// Log console message to Allure
        LOGGER.info("Click on submit");
        AllureUtils.logStep("Click on submit");
        AllureUtils.captureScreenshot(driver, "submit_30");
		
		Thread.sleep(3500);

//		// Method to scroll to early snack
//		HashMap<String,Object>scrollObject2 =new HashMap<>();
//		scrollObject2.put("direction", "down");
//		scrollObject2.put("Early Snacks", "Early Snacks");
//		driver.executeScript("mobile:scroll", scrollObject2);
//		Thread.sleep(2000);
		
		  // Locate the element related to breakfast + icon 
        WebElement breakfastplus2 	= driver.findElement(plusadd);
        breakfastplus2.click();
        // Log console message to Allure
        LOGGER.info("Click on breakfastplus2");
        AllureUtils.logStep("Click on breakfastplus2");
        AllureUtils.captureScreenshot(driver, "breakfastplus_30");
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone2	= driver.findElement(doneclick);
        keypaddone2.click();
        // Log console message to Allure
        LOGGER.info("Click on Doneclick ");
        AllureUtils.logStep("Click on Doneclick"); 
        
        // Click on fuel search field 
        WebElement additionalfuel2 = driver.findElement(additionalsearch);
        additionalfuel2.click();
        // Log console message to Allure
        LOGGER.info("Click on additionalfuel2");
        AllureUtils.logStep("Click on additionalfuel2");
        AllureUtils.captureScreenshot(driver, "additionalfuel_30");
        
        WebElement searchtext11	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"G\""));
        searchtext11.click();
        
        WebElement searchtext12	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"i\""));
        searchtext12.click();
        
        WebElement searchtext13	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"n\""));
        searchtext13.click();
        
        // Log console message to Allure
        LOGGER.info("Click on earlysnackplus");
        AllureUtils.logStep("Click on earlysnackplus");
        AllureUtils.captureScreenshot(driver, "earlysnackplus_29");
        
        WebElement Keypaddone2	= driver.findElement(doneclick);
        Keypaddone2.click();
        // Log console message to Allure
        LOGGER.info("Click on Doneclick ");
        AllureUtils.logStep("Click on Doneclick"); 
        
        
        WebElement showmorebranded	= driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Show More\"`][2]"));
        showmorebranded.click();
        // Log console message to Allure
        LOGGER.info("Click on brandedshow more button ");
        AllureUtils.logStep("Click on branded show more button"); 
        

        WebElement fuelselection2	= driver.findElement(ginfuelselectionc);
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
        
        
        
        driver.findElement(AppiumBy.iOSNsPredicateString("name == 'Early Snacks'")).click();
  
        WebElement submit2 = driver.findElement(submitick);
		submit2.click();
		// Log console message to Allure
        LOGGER.info("Click on submit2");
        AllureUtils.logStep("Click on submit2");
        AllureUtils.captureScreenshot(driver, "submit2_30");
		Thread.sleep(4500);
		
		// Method to scroll to early snack
		HashMap<String,Object>scrollObject3 =new HashMap<>();
		scrollObject3.put("direction", "down");
		scrollObject3.put("ginfuelselectionc", "ginfuelselectionc");
		driver.executeScript("mobile:scroll", scrollObject3);
		Thread.sleep(2000);
		
		
		Thread.sleep(4500);
        driver.terminateApp("com.cuesz.mobile");
	}
}
	
