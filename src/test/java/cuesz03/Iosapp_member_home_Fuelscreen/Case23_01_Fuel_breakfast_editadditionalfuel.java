package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

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
public class Case23_01_Fuel_breakfast_editadditionalfuel extends AppiummobileBase {
	
	private By Homeclick 		= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By editbeetroot		= 		AppiumBy.accessibilityId("Beetroot");
	private By editclick1		= 		AppiumBy.accessibilityId("BeetrootPlus");
	private By earlyclick		= 		AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"Early Snacks\"])[2]");
	private By breakfastclick	=		AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"Breakfast\"])[2]");
	private By noteclick		= 		AppiumBy.accessibilityId("Notes");
	private By submittick		= 		AppiumBy.accessibilityId("Submit");
	private By meatfuel			= 		AppiumBy.accessibilityId("Meat");
	private By editbreakfastime	= 		AppiumBy.accessibilityId("BreakfastTimeEdit");
	private By pickerelement	= 		AppiumBy.xpath("//XCUIElementTypePickerWheel");
	private By Doneclick		= 		AppiumBy.accessibilityId("AlcohalTime");
	


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
        
        
        // Edit feature testing
        WebElement Editbeetroot		= driver.findElement(editbeetroot);
        Editbeetroot.click();
        
        WebElement plusclick	= driver.findElement(editclick1);
        int numberOfClicks = 3;
        for (int i = 0; i < numberOfClicks; i++) {   
        	plusclick.click();
        }
        
        //Click on early snacks 
        WebElement whenclick	= driver.findElement(earlyclick);
        whenclick.click();
        
        //Click on breakfast snacks 
        WebElement whenclick1	= driver.findElement(breakfastclick);
        whenclick1.click();
        
        //Click on notes and enter values in field. 
        WebElement noteedit1 = driver.findElement(noteclick);
        noteedit1.sendKeys("hello this notes is update by automation to verifiy edit field values");
        
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"DONE\"]")).click();

        Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject11 =new HashMap<>();
		scrollObject11.put("direction", "down");
		scrollObject11.put("Source", "Source");
		driver.executeScript("mobile:scroll", scrollObject11);
		Thread.sleep(2000);
        
		
		WebElement editsubmit 	= driver.findElement(submittick);
		editsubmit.click();
		
		Thread.sleep(5000);
		
		/***************edit meat fuel*****************/
		
		WebElement meatedit		= driver.findElement(meatfuel);
		meatedit.click();
		
		
		//Click on notes and enter values in field. 
        WebElement noteedit2 = driver.findElement(noteclick);
        noteedit2.sendKeys("hello this notes is update by automation to verifiy edit field values");
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"DONE\"]")).click();
       
        
        //Click on early snacks 
        WebElement whenclick3	= driver.findElement(earlyclick);
        whenclick3.click();
		
        WebElement editsubmit2 	= driver.findElement(submittick);
		editsubmit2.click();
        
		Thread.sleep(4000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject111 =new HashMap<>();
		scrollObject111.put("direction", "down");
		scrollObject111.put("Meat", "Meat");
		driver.executeScript("mobile:scroll", scrollObject111);
		
		Thread.sleep(3000);
		
		
		WebElement meatedit1		= driver.findElement(meatfuel);
		meatedit1.click();
		 //Click on early snacks 
        WebElement whenclick4	= driver.findElement(breakfastclick);
        whenclick4.click();
		
        WebElement editsubmit3 	= driver.findElement(submittick);
		editsubmit3.click();
		
		Thread.sleep(2500);
		
		  // Method to scroll to perform screen
		HashMap<String,Object>scrollObject3 =new HashMap<>();
		scrollObject3.put("direction", "up");
		scrollObject3.put("Breakfast", "Breakfast");
		driver.executeScript("mobile:scroll", scrollObject3);

		 // Click on timer 
        WebElement breakfastedittime 	= driver.findElement(editbreakfastime);
        breakfastedittime.click();
        
        List<WebElement>values = driver.findElements(pickerelement);
		for (int i=0; i<values.size();i++)
		{		
		System.out.println(values.get(i).getText());
		}
		values.get(0).sendKeys("9");
		values.get(0).sendKeys(Keys.TAB);
		Thread.sleep(3500);
		values.get(1).sendKeys("08");
		values.get(1).sendKeys(Keys.TAB);
		Thread.sleep(3500);
		values.get(2).sendKeys("AM");
		driver.findElement(Doneclick).click();
		
		
		
		
		
		Thread.sleep(4500);
        driver.terminateApp("com.cuesz.mobile");
	}
}
	

