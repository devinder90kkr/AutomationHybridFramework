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

@Epic ("Fuel upload screen functionlaity ")
@Feature ("Verify Upload detail functionlaity for breakfast.")
public class Case25_Fuel_breakfast_uploadphotogallery extends AppiummobileBase {
	
	private By Homeclick 				= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By uploadbreakfastimage		=		AppiumBy.accessibilityId("BreakfastUploadIcon");
	private By gallery					=		AppiumBy.accessibilityId("GalleryClicked");
	private By Time						= 		AppiumBy.accessibilityId("SelectTime");
	private By pickerelement			= 		AppiumBy.xpath("//XCUIElementTypePickerWheel");
	private By Doneclick				= 		AppiumBy.accessibilityId("AlcohalTime");
	private By submittap				= 		AppiumBy.accessibilityId("SubmitImage");
	private By uploadphoto				= 		AppiumBy.accessibilityId("PhotoUpload");
	private By arrowclick				= 		AppiumBy.accessibilityId("RightArrow");
	private By Icondelete				= 		AppiumBy.accessibilityId("DeletePhoto");


	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Member check upload functionlaity verification")
    @Story("Scroll to Fuel card and upload image for breakfast.")	
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
        
        WebElement uploadicon	= driver.findElement(uploadbreakfastimage);
        uploadicon.click();
        
        WebElement galleryclick	= driver.findElement(gallery);
        galleryclick.click();
        
        WebElement firstPhoto = driver.findElement(AppiumBy.xpath("//XCUIElementTypeImage[2]"));
        firstPhoto.click();
        
        WebElement addclick = driver.findElement(AppiumBy.accessibilityId("Add"));
        addclick.click();
        
        
        // Click on timer 
        WebElement Timerclick 	= driver.findElement(Time);
        Timerclick.click();
        
        List<WebElement>values = driver.findElements(pickerelement);

		for (int i=0; i<values.size();i++)
		{		
		System.out.println(values.get(i).getText());
		}
		
		values.get(0).sendKeys("8");
		values.get(0).sendKeys(Keys.TAB);

		Thread.sleep(3500);
		values.get(1).sendKeys("13");
		values.get(1).sendKeys(Keys.TAB);
		
		Thread.sleep(3500);
		values.get(2).sendKeys("AM");

		driver.findElement(Doneclick).click();
        
		WebElement Submittap = driver.findElement(submittap);
		Submittap.click();
		
		Thread.sleep(4500);
		
		
		WebElement uploadicon1	= driver.findElement(uploadbreakfastimage);
	    uploadicon1.click();
	    
	    WebElement photoicon	= driver.findElement(uploadphoto);
	    photoicon.click();
	   
	    WebElement galleryclick2	= driver.findElement(gallery);
        galleryclick2.click();
	    
        WebElement firstPhoto2 = driver.findElement(AppiumBy.xpath("//XCUIElementTypeImage[3]"));
        firstPhoto2.click();
        
        WebElement addclick2 = driver.findElement(AppiumBy.accessibilityId("Add"));
        addclick2.click();
        
        
        // Click on timer 
        WebElement Timerclick2 	= driver.findElement(Time);
        Timerclick2.click();
        
        List<WebElement>values1 = driver.findElements(pickerelement);

		for (int i=0; i<values1.size();i++)
		{		
		System.out.println(values1.get(i).getText());
		}
		
		values1.get(0).sendKeys("9");
		values1.get(0).sendKeys(Keys.TAB);

		Thread.sleep(3500);
		values1.get(1).sendKeys("13");
		values1.get(1).sendKeys(Keys.TAB);
		
		Thread.sleep(3500);
		values1.get(2).sendKeys("AM");

		driver.findElement(Doneclick).click();
        
		WebElement Submittap1 = driver.findElement(submittap);
		Submittap1.click();
		
		Thread.sleep(4500);
	
		WebElement uploadicon2	= driver.findElement(uploadbreakfastimage);
	    uploadicon2.click();
        
	    //locate and click on toggel arrow 
	    WebElement arrowright	= driver.findElement(arrowclick);
	    arrowright.click();
	    
	    //Locate and click on delete icon
	    WebElement deleticon	= driver.findElement(Icondelete);
	    deleticon.click();
	    Thread.sleep(4500);
	    
        
		Thread.sleep(8500);
        driver.terminateApp("com.cuesz.mobile");
	}
}
	

