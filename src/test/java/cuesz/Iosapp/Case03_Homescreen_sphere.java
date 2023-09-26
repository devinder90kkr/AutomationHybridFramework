package cuesz.Iosapp;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
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

@Epic ("Home screen detail ")
@Feature ("Verify spheres separtors detail for Perform, Fuel, Mindful & Restore.")


public class Case03_Homescreen_sphere extends AppiummobileBase {

	 private ByteArrayOutputStream consoleOutput; // To capture console output
	   
		@BeforeClass
		 public void setUp() {
		      
		 // Redirect console output to capture it
		 consoleOutput = new ByteArrayOutputStream();
		 PrintStream printStream = new PrintStream(consoleOutput);
		 System.setOut(printStream);
		        
		  }

	@Test

	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify home screen & check spheres separtors.")
    @Story("Click on spheres and verify bounces spehere activity.")	
	
	public void Homescreensperators() throws InterruptedException
	{	

		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");
		
		
		WebElement Homeicon = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]"));
		Homeicon.click();
		
		 // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "ios_Homescreen_spehereseparators1");
		
		// Click on sphere sperators to check spheres activity.
        WebElement separtor =driver.findElement(AppiumBy.iOSNsPredicateString("name == 'SeparateSphere'"));
        separtor.click();
        
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "ios_Homescreen_spehereseparators2");
        
        
	
		Thread.sleep(5500);
	}
	
}

