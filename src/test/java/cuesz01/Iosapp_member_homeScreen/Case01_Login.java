package cuesz01.Iosapp_member_homeScreen;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import cuesz.utils.WebDriverManager;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
@Epic ("Home screen detail ")
@Feature ("Verify spheres separtors detail for Perform, Fuel, Mindful & Restore.")
public class Case01_Login extends AppiummobileBase {

	@BeforeClass
	 public void setUp() {
	     
	  }

@Test

@Owner("QA") // Add the @Owner annotation to specify the executor
@Severity(SeverityLevel.NORMAL)      
@Description("Verify home screen & check spheres separtors.")
@Story("Click on spheres and verify bounces spehere activity.")	

	public void login() throws InterruptedException
	{
	// Create an instance of AppiumUtils and pass the driver
			AppiumappUtils appiumUtils = new AppiumappUtils(driver);
	        // Launch the app using the utility method
	        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
	
		WebElement countryvalues = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"🇺🇸\"])[2]"));
		countryvalues.click();
		
		WebElement countryname = driver.findElement(AppiumBy.accessibilityId("text-input-country-filter"));
		countryname.sendKeys("India");
		
		WebElement indiaselection = driver.findElement(AppiumBy.accessibilityId("country-selector-IN"));
		indiaselection.click();
		
		WebElement mobilefield	= driver.findElement(AppiumBy.xpath("//XCUIElementTypeOther[@name=\"Mobile Number\"]/XCUIElementTypeTextField"));
		mobilefield.sendKeys("9671114235");
		
		WebElement Loginbutton	= driver.findElement(AppiumBy.accessibilityId("LoginButton"));
		Loginbutton.click();
	
		WebElement Otp1 = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeTextField[@name=\"OTPTextInput\"])[1]"));
		Otp1.sendKeys("2");
		WebElement Otp2 = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeTextField[@name=\"OTPTextInput\"])[2]"));
		Otp2.sendKeys("1");
		WebElement Otp3 = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeTextField[@name=\"OTPTextInput\"])[3]"));
		Otp3.sendKeys("0");
		WebElement Otp4 = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeTextField[@name=\"OTPTextInput\"])[4]"));
		Otp4.sendKeys("9");
		WebElement Otp5 = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeTextField[@name=\"OTPTextInput\"])[5]"));
		Otp5.sendKeys("9");
		WebElement Otp6 = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeTextField[@name=\"OTPTextInput\"])[6]"));
		Otp6.sendKeys("9");
		
		WebElement submitnbutton	= driver.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"Submit\"])[3]"));
		submitnbutton.click();
		
		
		Thread.sleep(5500);
		
		
	}
	

@AfterClass
public void tearDown() {
	// Log all captured status codes in Allure
    WebDriverManager.quitDriver();
   
}
}
