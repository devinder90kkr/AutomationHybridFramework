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
public class Case34_Fuel_Lunch_additionalfuel extends AppiummobileBase {
	
	private By Homeclick 		= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By plusadd			= 		AppiumBy.accessibilityId("LunchAddIcon");
	private By doneclick		= 		AppiumBy.accessibilityId("Done");
	private By additionalsearch	= 		AppiumBy.accessibilityId("AdditionalFuelSearch");
	private By showmorebutton	=		AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Show More\"`][2]");
	private By stewmeat			=		AppiumBy.accessibilityId("Stew Meat");
	private By submitick		= 		AppiumBy.accessibilityId("ItemSubmit");
	private By Time				= 		AppiumBy.accessibilityId("AdditionalItemTime");
	private By pickerelement	= 		AppiumBy.xpath("//XCUIElementTypePickerWheel");
	private By Doneclick		= 		AppiumBy.accessibilityId("AlcohalTime");
	private By kiwifuelselection	=	AppiumBy.accessibilityId("Delicious Kiwifruit");
	private By editstewmeat		=		AppiumBy.accessibilityId("Stew meat");
	private By editclick1		=		AppiumBy.accessibilityId("Stew meatPlus");
	private By noteclick		= 		AppiumBy.accessibilityId("Notes");
	private By submittick		=		AppiumBy.accessibilityId("Submit");
	
	
	
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
		
		scroll("down", "Perform");
//		// Method to scroll to perform screen
//		HashMap<String,Object>scrollObject =new HashMap<>();
//		scrollObject.put("direction", "down");
//		scrollObject.put("Perform Fuel Mindful Restore", "Perform");
//		driver.executeScript("mobile:scroll", scrollObject);
		Thread.sleep(2000);

        //Click on Fuel tab 
        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();
        
        Thread.sleep(3500);
        
        
        // Locate the element related to breakfast + icon 
        WebElement breakfastplus 	= driver.findElement(plusadd);
        breakfastplus.click();
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone	= driver.findElement(doneclick);
        keypaddone.click();
        
        // Click on fuel search field 
        WebElement additionalfuel = driver.findElement(additionalsearch);
        additionalfuel.click();
       
        
        
        WebElement searchtext1	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"M\""));
        searchtext1.click();
        
        WebElement searchtext2	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"e\""));
        searchtext2.click();
        
        WebElement searchtext3	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"a\""));
        searchtext3.click();
        
        WebElement searchtext4	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"t\""));
        searchtext4.click();
        
 
        WebElement Keypaddone	= driver.findElement(doneclick);
        Keypaddone.click();
        
        WebElement brandedshowmore	= driver.findElement(showmorebutton);
        brandedshowmore.click();
        
        WebElement fuelselection	= driver.findElement(stewmeat);
        fuelselection.click();
      
        Thread.sleep(4500);
        
        // Click on timer 
        WebElement Timerclick 	= driver.findElement(Time);
        Timerclick.click();
        List<WebElement>values = driver.findElements(pickerelement);
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
		values.get(2).sendKeys("AM");
		driver.findElement(Doneclick).click();
        
    	WebElement submit = driver.findElement(submitick);
		submit.click();

		scroll("down", "Lunch");
		Thread.sleep(2000);
		
		  // Locate the element related to breakfast + icon 
        WebElement breakfastplus2 	= driver.findElement(plusadd);
        breakfastplus2.click();
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone2	= driver.findElement(doneclick);
        keypaddone2.click();
        
        // Click on fuel search field 
        WebElement additionalfuel2 = driver.findElement(additionalsearch);
        additionalfuel2.click();
        
        WebElement searchtext11	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"K\""));
        searchtext11.click();
        
        WebElement searchtext12	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"i\""));
        searchtext12.click();
        
        WebElement searchtext13	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"w\""));
        searchtext13.click();
        
        WebElement searchtext14	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"i\""));
        searchtext14.click();
        
        WebElement Keypaddone2	= driver.findElement(doneclick);
        Keypaddone2.click();

        WebElement fuelselection2	= driver.findElement(kiwifuelselection);
        fuelselection2.click();
        
        
        Thread.sleep(3500);
        WebElement submit2 = driver.findElement(submitick);
		submit2.click();
		
		Thread.sleep(4500);

		scroll("down", "Lunch");
		
		 // Edit feature testing
        WebElement Editmeat		= driver.findElement(editstewmeat);
        Editmeat.click();
        
        WebElement plusclick	= driver.findElement(editclick1);
        int numberOfClicks = 2;
        for (int i = 0; i < numberOfClicks; i++) {   
        	plusclick.click();
        }
        
        
        //Click on notes and enter values in field. 
        WebElement noteedit1 = driver.findElement(noteclick);
        noteedit1.sendKeys("hello this notes is update by automation to verifiy edit field values");
        
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"DONE\"]")).click();

        Thread.sleep(3000);
		
        scroll("down", "Source");
        // Method to scroll to perform screen
		Thread.sleep(2000);
        
		
		WebElement editsubmit 	= driver.findElement(submittick);
		editsubmit.click();
		

		Thread.sleep(4500);
        driver.terminateApp("com.cuesz.mobile");
	}
	
	private void scroll(String direction, String elementName) {
        HashMap<String, Object> scrollObject = new HashMap<>();
        scrollObject.put("direction", direction);
        scrollObject.put(elementName, elementName);
        driver.executeScript("mobile:scroll", scrollObject);
    }

}
	

	

