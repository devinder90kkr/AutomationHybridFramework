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
@Feature ("Verify Fuel detail functionlaity related to early snacks edit additional fuel.")
public class Case31_Fuel_EarlySnacks_editadditionalfuel extends AppiummobileBase {
	
	private By Homeclick 		= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By editbeetroot		= 		AppiumBy.accessibilityId("Organic ginger spread");
	private By editclick1		= 		AppiumBy.accessibilityId("Organic ginger spreadPlus");
	private By earlyclick		= 		AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"Early Snacks\"])[2]");
	private By breakfastclick	=		AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"Breakfast\"])[2]");
	private By noteclick		= 		AppiumBy.accessibilityId("Notes");
	private By submittick		= 		AppiumBy.accessibilityId("Submit");
	
	


	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Member Fuel screen detail verification")
    @Story("Scroll to Fuel card and verify early snacks for edit addtional ")	
	public void Fuel_EarlySnacks_editadditionalfuel() throws InterruptedException
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
        
        Thread.sleep(4500);        
        
//		// Method to scroll to perform screen
//		HashMap<String,Object>scrollObject1 =new HashMap<>();
//		scrollObject1.put("direction", "down");
//		scrollObject1.put("Breakfast", "Breakfast");
//		driver.executeScript("mobile:scroll", scrollObject1);
//		Thread.sleep(2000);
        
    
        // Method to scroll to perform screen
 		HashMap<String,Object>scrollObject12 =new HashMap<>();
 		scrollObject12.put("direction", "down");
 		scrollObject12.put("Early Snacks", "Early Snacks");
 		driver.executeScript("mobile:scroll", scrollObject12);
 		Thread.sleep(2000);
        
        Thread.sleep(5500);
         
//     // Replace "com.example.app:id/targetElementId" with the actual ID or accessibility ID of your target element
//        String targetElementId = "com.cuesz.mobile:ios class chain /**/XCUIElementTypeStaticText[`label == \"Early Snacks\"`][1]";
//        HashMap<String, Object> scrollObject11 = new HashMap<>();
//        scrollObject11.put("direction", "down");
//        scrollObject11.put("element", targetElementId);
//
//        driver.executeScript("mobile:scroll", scrollObject11);
//        Thread.sleep(2000);

        
        // Edit feature testing
        WebElement Editbeetroot		= driver.findElement(editbeetroot);
        Editbeetroot.click();
        
        WebElement plusclick	= driver.findElement(editclick1);
        int numberOfClicks = 2;
        for (int i = 0; i < numberOfClicks; i++) {   
        	plusclick.click();
        }      
        
        
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "earlysnack5");
      //Click on breakfast snacks 
        WebElement whenclick1	= driver.findElement(breakfastclick);
        whenclick1.click();
        
        //Click on early snacks 
        WebElement whenclick	= driver.findElement(earlyclick);
        whenclick.click();
            
        //Click on notes and enter values in field. 
        WebElement noteedit1 = driver.findElement(noteclick);
        noteedit1.sendKeys("hello this notes is add for early snack additional fuel");
        
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"DONE\"]")).click();

        Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject111 =new HashMap<>();
		scrollObject111.put("direction", "down");
		scrollObject111.put("Source", "Source");
		driver.executeScript("mobile:scroll", scrollObject111);
		Thread.sleep(2000);
        
		
		WebElement editsubmit 	= driver.findElement(submittick);
		editsubmit.click();
		
		Thread.sleep(5000);
		

		
		Thread.sleep(4500);
        driver.terminateApp("com.cuesz.mobile");
	}
}
	

