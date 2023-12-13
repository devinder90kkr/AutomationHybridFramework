package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

@Epic ("Member Add an event screen detail ")
@Feature ("Verify member able to add functionlaity related to add an event for post-performance functionlaity.")
public class Case49_Fuel_Addandevent_Postperformance_additionalcase extends AppiummobileBase {
	
	private By Homeclick 		= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By postplusicon	=		AppiumBy.accessibilityId("Post PerformancePlueIcon");
	private By doneclick		= 		AppiumBy.accessibilityId("Done");
	private By SanXian			= 		AppiumBy.iOSNsPredicateString("name == \"Di San Xian\"");
	private By fernfuel			= 		AppiumBy.accessibilityId("Fern");
	private By additionalsearch	= 		AppiumBy.accessibilityId("AdditionalFuelSearch");
	private By submitclick		=		AppiumBy.accessibilityId("ItemSubmit");
	private By infoclick		=		AppiumBy.accessibilityId("Post PerformanceInfoIcon");	
	private By backbttn			=		AppiumBy.accessibilityId("BackPress");
	private By showclikc		=		AppiumBy.accessibilityId("Show More");
	private By vodkafuel		=		AppiumBy.accessibilityId("Vodka");
	private By additionalsearch1=		AppiumBy.iOSNsPredicateString("label == \"Search Fuel to log\" AND name == \"AdditionalFuelSearch\"");
	private By Uploadimage		=		AppiumBy.accessibilityId("Post PerformanceUploadIcon");
	private By gallery			=		AppiumBy.accessibilityId("GalleryClicked");
	private By Time				= 		AppiumBy.accessibilityId("SelectTime");
	private By submittap		= 		AppiumBy.accessibilityId("SubmitImage");
	private By pickerelement	= 		AppiumBy.xpath("//XCUIElementTypePickerWheel");
	private By Doneclick		= 		AppiumBy.accessibilityId("AlcohalTime");
	
	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
	@Description("Member scroll to add an Event screen for post-perfoemnace detail verification")
    @Story("Scroll to post-performance detail and add its related values")
	public void Fuel_addaneventadditionalcasewithpostperformance() throws InterruptedException {	

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
        
        // Method to scroll to perform screen
  		HashMap<String,Object>scrollObject3 =new HashMap<>();
  		scrollObject3.put("direction", "down");
  		scrollObject3.put("Post Performance", "Post Performance");
  		driver.executeScript("mobile:scroll", scrollObject3);
  		Thread.sleep(2000);

  		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addpostevent1");
  			
     	// Add fuel data for pre-performance 
     	WebElement postperformance	= driver.findElement(postplusicon);
     	postperformance.click();
        
     	//click on keypad Done button to hide keypad
        WebElement keypaddone	= driver.findElement(doneclick);
        keypaddone.click();
        
        // Click on fuel search field 
        WebElement additionalfuel = driver.findElement(additionalsearch);
        additionalfuel.click();
        
        WebElement searchtext1	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"X\""));
        searchtext1.click();
        
        WebElement searchtext2	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"i\""));
        searchtext2.click();
        
        WebElement searchtext3	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"o\""));
        searchtext3.click();

        WebElement Keypaddone	= driver.findElement(doneclick);
        Keypaddone.click();

        WebElement Showmoreclick	= driver.findElement(showclikc);
        Showmoreclick.click();

        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addpostevent2");
   
        WebElement fuelselection	= driver.findElement(SanXian);
        fuelselection.click();
        
        Thread.sleep(2500);
        WebElement submititems	= driver.findElement(submitclick);
        submititems.click();

        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addpostevent3");
        
        Thread.sleep(5500);
     // Add fuel data for pre-performance 
     	WebElement duringpreperformance2	= driver.findElement(postplusicon);
     	duringpreperformance2.click();
        
        // Click on fuel search field 
        WebElement additionalfuel2 = driver.findElement(additionalsearch);
        additionalfuel2.click();
        
        WebElement searchtext11	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"F\""));
        searchtext11.click();
        
        WebElement searchtext21	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"e\""));
        searchtext21.click();
        
        WebElement searchtext31	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"r\""));
        searchtext31.click();
        
        WebElement Keypaddone1	= driver.findElement(doneclick);
        Keypaddone1.click();
        
		
		WebElement fuelselection1	= driver.findElement(fernfuel);
        fuelselection1.click();
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addpostevent3");
        
        // Click on fuel search field 
        WebElement additionalfuel4 = driver.findElement(additionalsearch1);
        additionalfuel4.click();
        
        WebElement searchtext15	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"V\""));
        searchtext15.click();
        
        WebElement searchtext16	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"o\""));
        searchtext16.click();
        
        WebElement searchtext17	= driver.findElement(AppiumBy.iOSNsPredicateString("label == \"t\""));
        searchtext17.click();
        
        WebElement Keypaddone2	= driver.findElement(doneclick);
        Keypaddone2.click();      
		
		WebElement fuelselection3	= driver.findElement(vodkafuel);
        fuelselection3.click();
         
        Thread.sleep(2500);
        WebElement submititems2	= driver.findElement(submitclick);
        submititems2.click();

        Thread.sleep(4500);
        
        WebElement uploadpreimage	= driver.findElement(Uploadimage);
        uploadpreimage.click();
                
        WebElement galleryclick	= driver.findElement(gallery);
        galleryclick.click();
        
        WebElement firstPhoto = driver.findElement(AppiumBy.xpath("//XCUIElementTypeImage[3]"));
        firstPhoto.click();
        
        WebElement addclick = driver.findElement(AppiumBy.accessibilityId("Add"));
        addclick.click();
        
        // Click on timer 
        WebElement Timerclick 	= driver.findElement(Time);
        Timerclick.click();
        
        List<WebElement>values2 = driver.findElements(pickerelement);

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

		driver.findElement(Doneclick).click();
		
		 // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addevent8");
		
        
		WebElement Submittap = driver.findElement(submittap);
		Submittap.click();
        
					
		Thread.sleep(3500);
		WebElement infoicon		= driver.findElement(infoclick);
		infoicon.click();
		
		Thread.sleep(3000); 
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject4 =new HashMap<>();
		scrollObject4.put("direction", "down");
		scrollObject4.put("Source", "Source");
		driver.executeScript("mobile:scroll", scrollObject4);
		Thread.sleep(2000);

		WebElement 	backincon	= driver.findElement(backbttn);
		backincon.click();
		
		 // Method to scroll to perform screen
  		HashMap<String,Object>scrollObject5 =new HashMap<>();
  		scrollObject5.put("direction", "down");
  		scrollObject5.put("During Performance", "During Performance");
  		driver.executeScript("mobile:scroll", scrollObject5);
  		Thread.sleep(2000);
		
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "addpostevent4");
        

       	Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
	}
}
	

