package cuesz04.Iosapp_member_home_Fuelscreen.Uploadphotocases.perform.pending;

import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.mobile.resources.mobileLocators;
import cuesz.mobile.resources.mobileTestData;
import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Member Add an event screen detail ")
@Feature ("Verify member able to add functionlaity related to add an event for post-performance functionlaity.")
public class Case49_Fuel_Addandevent_Postperformance_additionalcase extends AppiummobileBase {
	
	mobileLocators locators = new mobileLocators();	
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
	@Description("Member scroll to add an Event screen for post-perfoemnace detail verification")
    @Story("Scroll to post-performance detail and add its related values")
	public void Fuel_addaneventadditionalcasewithpostperformance() throws InterruptedException {	

		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
//        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");
		 appiumUtils.launchAppWithPackageId(mobileTestData.bundelID);
		
		WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
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

        By postperformanceLocator = AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Post Performance\"`][2]");
        if(!isElementPresent(driver, postperformanceLocator)){
            // Scroll to "Basketball" if it's not present
            HashMap<String,Object> scrollObject1 = new HashMap<>();
            scrollObject1.put("direction", "down");
            scrollObject1.put("Post Performance", "Post Performance");
            driver.executeScript("mobile:scroll", scrollObject1);
            Thread.sleep(2000);
        }
          

  		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addpostevent1");
  			
     	// Add fuel data for pre-performance 
     	WebElement postperformance	= driver.findElement(mobileLocators.postplusicon);
     	postperformance.click();
        
     	//click on keypad Done button to hide keypad
        WebElement keypaddone	= driver.findElement(mobileLocators.doneclick);
        keypaddone.click();
        
        // Click on fuel search field 
        WebElement additionalfuel = driver.findElement(mobileLocators.additionalsearch);
        additionalfuel.click();
        
        WebElement searchtext1	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"X\""));
        searchtext1.click();
        
        WebElement searchtext2	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"i\""));
        searchtext2.click();
        
        WebElement searchtext3	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"o\""));
        searchtext3.click();

        WebElement Keypaddone	= driver.findElement(mobileLocators.doneclick);
        Keypaddone.click();

        WebElement Showmoreclick	= driver.findElement(mobileLocators.showclikc);
        Showmoreclick.click();

        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addpostevent2");
   
        WebElement fuelselection	= driver.findElement(mobileLocators.SanXian);
        fuelselection.click();
        
        Thread.sleep(2500);
        WebElement submititems	= driver.findElement(mobileLocators.submitclick);
        submititems.click();

        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addpostevent3");
        
        Thread.sleep(5500);
     // Add fuel data for pre-performance 
     	WebElement duringpreperformance2	= driver.findElement(mobileLocators.postplusicon);
     	duringpreperformance2.click();
        
        // Click on fuel search field 
        WebElement additionalfuel2 = driver.findElement(mobileLocators.additionalsearch);
        additionalfuel2.click();
        
        WebElement searchtext11	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"F\""));
        searchtext11.click();
        
        WebElement searchtext21	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"e\""));
        searchtext21.click();
        
        WebElement searchtext31	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"r\""));
        searchtext31.click();
        
        WebElement Keypaddone1	= driver.findElement(mobileLocators.doneclick);
        Keypaddone1.click();
        
		
		WebElement fuelselection1	= driver.findElement(mobileLocators.fernfuel);
        fuelselection1.click();
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addpostevent3");
        
        // Click on fuel search field 
        WebElement additionalfuel4 = driver.findElement(mobileLocators.additionalsearch1);
        additionalfuel4.click();
        
        WebElement searchtext15	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"V\""));
        searchtext15.click();
        
        WebElement searchtext16	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"o\""));
        searchtext16.click();
        
        WebElement searchtext17	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"t\""));
        searchtext17.click();
        
        WebElement Keypaddone2	= driver.findElement(mobileLocators.doneclick);
        Keypaddone2.click();      
		
		WebElement fuelselection3	= driver.findElement(mobileLocators.vodkafuel);
        fuelselection3.click();
         
        Thread.sleep(2500);
        WebElement submititems2	= driver.findElement(mobileLocators.submitclick);
        submititems2.click();

        Thread.sleep(4500);
        
        WebElement uploadpreimage	= driver.findElement(mobileLocators.Uploadimage);
        uploadpreimage.click();
                
        WebElement galleryclick	= driver.findElement(mobileLocators.gallery);
        galleryclick.click();
        
        WebElement firstPhoto = driver.findElement(AppiumBy.xpath("//XCUIElementTypeImage[3]"));
        firstPhoto.click();
        
        WebElement addclick = driver.findElement(AppiumBy.accessibilityId("Add"));
        addclick.click();
        
        // Click on timer 
        WebElement Timerclick 	= driver.findElement(mobileLocators.Time);
        Timerclick.click();
        
        List<WebElement>values2 = driver.findElements(mobileLocators.pickerelement);

		for (int i=0; i<values2.size();i++)
		{		
		System.out.println(values2.get(i).getText());
		}
		
		values2.get(0).sendKeys("11");
		values2.get(0).sendKeys(Keys.TAB);

		Thread.sleep(3500);
		values2.get(1).sendKeys("13");
		values2.get(1).sendKeys(Keys.TAB);
		
		Thread.sleep(3500);
		values2.get(2).sendKeys("AM");

		driver.findElement(mobileLocators.Doneclick).click();
		
		 // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addevent8");
		
        
		WebElement Submittap = driver.findElement(mobileLocators.submittap);
		Submittap.click();
        
					
		Thread.sleep(3500);
		WebElement infoicon		= driver.findElement(mobileLocators.infoclick);
		infoicon.click();
		
		Thread.sleep(3000); 
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject4 =new HashMap<>();
		scrollObject4.put("direction", "down");
		scrollObject4.put("Source", "Source");
		driver.executeScript("mobile:scroll", scrollObject4);
		Thread.sleep(2000);

		WebElement 	backincon	= driver.findElement(mobileLocators.backbttn);
		backincon.click();
		
		By postperformanceLocator1 = AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Post Performance\"`][2]");
        if(!isElementPresent(driver, postperformanceLocator1)){
            // Scroll to "Basketball" if it's not present
            HashMap<String,Object> scrollObject1 = new HashMap<>();
            scrollObject1.put("direction", "down");
            scrollObject1.put("Post Performance", "Post Performance");
            driver.executeScript("mobile:scroll", scrollObject1);
            Thread.sleep(2000);
        }
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addpostevent4");
        

       	Thread.sleep(2500);
//        driver.terminateApp("com.cuesz.mobile");
       	driver.terminateApp(mobileTestData.bundelID);
	}
	
	// Function to check if an element is present on the screen
		public boolean isElementPresent(AppiumDriver driver, By by){
		    try{
		        driver.findElement(by);
		        return true;
		    } catch (NoSuchElementException e){
		        return false;
		    }
		}
		
}
	

