package cuesz01.Iosapp_member_homeScreen;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
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

@Epic ("Home screen detail ")
@Feature ("Verify spheres separtors detail for Perform, Fuel, Mindful & Restore.")


public class Case07_Homescreen_scroller extends AppiummobileBase {

	private By Homeclick = 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By HomeScrollDown=	AppiumBy.accessibilityId("HomeScrollDown");	
	private By HomeScrollup=	AppiumBy.accessibilityId("HomeScrollUp");	
	
	
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
		
		// CLick on home menu from bottom
		WebElement Homeicon = driver.findElement(Homeclick);
		Homeicon.click();
		
		WebElement scrolldown = driver.findElement(HomeScrollDown);
		scrolldown.click();

		WebElement scrollup = driver.findElement(HomeScrollup);
		scrollup.click();
		
	
		Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
	
	
	
	}
	
}
