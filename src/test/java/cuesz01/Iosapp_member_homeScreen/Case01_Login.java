//package cuesz01.Iosapp_member_homeScreen;
//
//import java.time.Duration;
//
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import cuesz.pages.AppiummobileBase;
//import cuesz.utils.AllureUtils;
//import cuesz.utils.AppiumappUtils;
//import io.appium.java_client.AppiumBy;
//import io.qameta.allure.Description;
//import io.qameta.allure.Epic;
//import io.qameta.allure.Feature;
//import io.qameta.allure.Owner;
//import io.qameta.allure.Severity;
//import io.qameta.allure.SeverityLevel;
//import io.qameta.allure.Story;
//@Epic ("Login detail Screen")
//@Feature ("Verify functionlaity for Login screen")
//public class Case01_Login extends AppiummobileBase {
//	private static final Logger LOGGER = LoggerFactory.getLogger(Case01_Login.class);
//	@BeforeClass
//	 public void setUp() {
//	  }
//@Test
//@Owner("QA") // Add the @Owner annotation to specify the executor
//@Severity(SeverityLevel.NORMAL)      
//@Description("Verify login functionlaity with OTP verification")
//@Story("Click on mobile field and input values and than redirect to OTp screen & click on login button")	
//
//	public void login() throws InterruptedException
//	{
//	// Create an instance of AppiumUtils and pass the driver
//			AppiumappUtils appiumUtils = new AppiumappUtils(driver);
//	        // Launch the app using the utility method
//	        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
//	        
//	     // Check if the Crossclick element is displayed before clicking on it
//			WebElement allowclick = null;
//			try {
//				allowclick = driver.findElement(AppiumBy.accessibilityId("Allow"));
//			    if (allowclick.isDisplayed()) {
//			    	allowclick.click();
//			    	// Log message to console and Allure report
//			        LOGGER.info("Click on allow notification alert for permission");
//			        AllureUtils.logStep("Click on allow notifcation");  	
//			    } else {
//			        // Handle the case where the element is not displayed
//			        System.out.println("OK allow element is not displayed.");
//			    	// Log message to console and Allure report
//			        LOGGER.info("OK allow element is not displayed.");
//			        AllureUtils.logStep("OK allow element is not displayed.");  	
//			        
//			        // Perform some other action or throw an exception if needed
//			    }
//			} catch (NoSuchElementException e) {
//			    // Handle the case where the element is not found
//			    System.out.println("Crossclick element not found.");
//			    // Log message to console and Allure report
//			    LOGGER.info("Crossclick element not found.");
//		        AllureUtils.logStep("Crossclick element not found.");  	
//			    // Perform some other action or throw an exception if needed
//			}
//		WebElement countryvalues = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"🇮🇳\"])[2]"));
//		countryvalues.click();
//		// Log message to console and Allure report
//		LOGGER.info("Click on country values icon");
//        AllureUtils.logStep("Click on country values icon");  
//		
//		WebElement countryname = driver.findElement(AppiumBy.accessibilityId("text-input-country-filter"));
//		countryname.sendKeys("India");
//		// Log message to console and Allure report
//		LOGGER.info("Enter India values in field");
//        AllureUtils.logStep("input India values in field");  
//		
//		WebElement indiaselection = driver.findElement(AppiumBy.accessibilityId("country-selector-IN"));
//		indiaselection.click();
//				// Log message to console and Allure report
//				LOGGER.info("Select India values from list");
//		        AllureUtils.logStep("Select India values from list"); 
//		        
//		// Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "Country selection"); 
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
//		WebElement mobilefield = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.iOSNsPredicateString("name == \"SignInTextInput\"")));
//		mobilefield.click();
//		
//		// Log message to console and Allure report
//		LOGGER.info("Click on phone number field");
//        AllureUtils.logStep("Click on phone number field"); 
//		
////		driver.findElement(AppiumBy.iOSNsPredicateString("name == \"SignInTextInput\"")).sendKeys(" 9671114235");
//		
//		Thread.sleep(5000);
//		WebElement mobfield1 = driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"7\"]"));
//		mobfield1.click();
//		
//		WebElement mobfield2 = driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"9\"]"));
//		mobfield2.click();
//		
//		WebElement mobfield3 = driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"8\"]"));
//		mobfield3.click();	
//		
//		WebElement mobfield4 = driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"8\"]"));
//		mobfield4.click();
//		
//		WebElement mobfield5 = driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"5\"]"));
//		mobfield5.click();
//		
//		WebElement mobfield6 = driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"5\"]"));
//		mobfield6.click();
//		
//		WebElement mobfield7 = driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"0\"]"));
//		mobfield7.click();
//		
//		WebElement mobfield8 = driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"1\"]"));
//		mobfield8.click();
//		
//		WebElement mobfield9 = driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"3\"]"));
//		mobfield9.click();
//		
//		WebElement mobfield10 = driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"0\"]"));
//		mobfield10.click();
//
//		// Log message to console and Allure report
//		LOGGER.info("Member phone number input in app");
//        AllureUtils.logStep("Phone number inpt in phone number field"); 		
//
//		// Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "Mobile number input before login tap"); 
//		
//		Thread.sleep(2000);
//		WebElement Loginbutton	= driver.findElement(AppiumBy.accessibilityId("LoginButton"));
//		Loginbutton.click();
//		
//		// Log message to console and Allure report
//		LOGGER.info("Click on Login button");
//        AllureUtils.logStep("Click on Login button"); 
//	
//		WebElement Otp1 = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeTextField[@name=\"OTPTextInput\"])[1]"));
//		Otp1.sendKeys("2");
//		WebElement Otp2 = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeTextField[@name=\"OTPTextInput\"])[2]"));
//		Otp2.sendKeys("1");
//		WebElement Otp3 = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeTextField[@name=\"OTPTextInput\"])[3]"));
//		Otp3.sendKeys("0");
//		WebElement Otp4 = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeTextField[@name=\"OTPTextInput\"])[4]"));
//		Otp4.sendKeys("9");
//		WebElement Otp5 = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeTextField[@name=\"OTPTextInput\"])[5]"));
//		Otp5.sendKeys("9");
//		WebElement Otp6 = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeTextField[@name=\"OTPTextInput\"])[6]"));
//		Otp6.sendKeys("9");
//		
//			// Log message to console and Allure report
//				LOGGER.info("Input OTP values in field");
//		        AllureUtils.logStep("OTP values inserted in field"); 
//		
//		WebElement submitnbutton	= driver.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"Submit\"])[3]"));
//		submitnbutton.click();
//		
//		// Log message to console and Allure report
//				LOGGER.info("Click on submit button");
//		        AllureUtils.logStep("Click on submit button"); 
//		
//		// Check if the Crossclick element is displayed before clicking on it
//		WebElement notificationclick1 = null;
//		try {
//			notificationclick1 = driver.findElement(AppiumBy.accessibilityId("Allow"));
//		    if (notificationclick1.isDisplayed()) {
//		    	notificationclick1.click();
//		    	// Log message to console and Allure report
//				LOGGER.info("Click on notification button");
//		        AllureUtils.logStep("Click on notification button"); 
//		    	
//		    } else {
//		        // Handle the case where the element is not displayed
//		        System.out.println(" notfication element is not displayed.");
//		        // Log message to console and Allure report
//				LOGGER.info("notfication element is not displayed.");
//		        AllureUtils.logStep("notfication element is not displayed."); 
//		        // Perform some other action or throw an exception if needed
//		    }
//		} catch (NoSuchElementException e) {
//		    // Handle the case where the element is not found
//		    System.out.println("Crossclick element not found.");
//		    // Perform some other action or throw an exception if needed
//		    // Log message to console and Allure report
//			LOGGER.info("Crossclick element not found.");
//	        AllureUtils.logStep("Crossclick element not found."); 
//		}
//		
//		
//		// Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "landed on home screen");  
//	
//		Thread.sleep(3500);
//		driver.terminateApp("com.cuesz.mobile");
//	
//		
//	}
//}
//


package cuesz01.Iosapp_member_homeScreen;

import java.time.Duration;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
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

@Epic("Login detail Screen")
@Feature("Verify functionality for Login screen")
public class Case01_Login extends AppiummobileBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(Case01_Login.class);

    @BeforeClass
    public void setUp() {
        // Any setup actions before tests run
    }

    @Test
    @Owner("QA")
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify login functionality with OTP verification")
    @Story("Click on mobile field and input values and then redirect to OTP screen & click on login button")
    public void login() throws InterruptedException {
        // Create an instance of AppiumUtils and pass the driver
        AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");

        // Check if user is already logged in
        try {
            WebElement homeScreenElement = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]")); // Replace with an actual element id that is only present when the user is logged in
            if (homeScreenElement.isDisplayed()) {
                // Log message to console and Allure report
                LOGGER.info("Member already logged in the app.");
                AllureUtils.logStep("Member already logged in the app.");
                return; // Skip the rest of the login steps
            }
        } catch (NoSuchElementException e) {
            LOGGER.info("User is not logged in, proceeding with login steps.");
            AllureUtils.logStep("User is not logged in, proceeding with login steps.");
        }

        // Proceed with the login steps if the user is not already logged in
        WebElement allowClick = null;
        try {
            allowClick = driver.findElement(AppiumBy.accessibilityId("Allow"));
            if (allowClick.isDisplayed()) {
                allowClick.click();
                // Log message to console and Allure report
                LOGGER.info("Click on allow notification alert for permission");
                AllureUtils.logStep("Click on allow notification");
            } else {
                LOGGER.info("OK allow element is not displayed.");
                AllureUtils.logStep("OK allow element is not displayed.");
            }
        } catch (NoSuchElementException e) {
            LOGGER.info("Crossclick element not found.");
            AllureUtils.logStep("Crossclick element not found.");
        }

        try {
            WebElement countryValues = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"🇮🇳\"])[2]"));
            countryValues.click();
            LOGGER.info("Click on country values icon");
            AllureUtils.logStep("Click on country values icon");

            WebElement countryName = driver.findElement(AppiumBy.accessibilityId("text-input-country-filter"));
            countryName.sendKeys("India");
            LOGGER.info("Enter India values in field");
            AllureUtils.logStep("Input India values in field");

            WebElement indiaSelection = driver.findElement(AppiumBy.accessibilityId("country-selector-IN"));
            indiaSelection.click();
            LOGGER.info("Select India values from list");
            AllureUtils.logStep("Select India values from list");

            AllureUtils.captureScreenshot(driver, "Country selection");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
            WebElement mobileField = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.iOSNsPredicateString("name == \"SignInTextInput\"")));
            mobileField.click();
            LOGGER.info("Click on phone number field");
            AllureUtils.logStep("Click on phone number field");

            Thread.sleep(5000);
            driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"7\"]")).click();
            driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"9\"]")).click();
            driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"8\"]")).click();
            driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"8\"]")).click();
            driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"5\"]")).click();
            driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"5\"]")).click();
            driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"0\"]")).click();
            driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"1\"]")).click();
            driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"3\"]")).click();
            driver.findElement(AppiumBy.xpath("//XCUIElementTypeKey[@name=\"0\"]")).click();

            LOGGER.info("Member phone number input in app");
            AllureUtils.logStep("Phone number input in phone number field");

            AllureUtils.captureScreenshot(driver, "Mobile number input before login tap");

            Thread.sleep(2000);
            WebElement loginButton = driver.findElement(AppiumBy.accessibilityId("LoginButton"));
            loginButton.click();
            LOGGER.info("Click on Login button");
            AllureUtils.logStep("Click on Login button");

            WebElement otp1 = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeTextField[@name=\"OTPTextInput\"])[1]"));
            otp1.sendKeys("2");
            WebElement otp2 = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeTextField[@name=\"OTPTextInput\"])[2]"));
            otp2.sendKeys("1");
            WebElement otp3 = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeTextField[@name=\"OTPTextInput\"])[3]"));
            otp3.sendKeys("0");
            WebElement otp4 = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeTextField[@name=\"OTPTextInput\"])[4]"));
            otp4.sendKeys("9");
            WebElement otp5 = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeTextField[@name=\"OTPTextInput\"])[5]"));
            otp5.sendKeys("9");
            WebElement otp6 = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeTextField[@name=\"OTPTextInput\"])[6]"));
            otp6.sendKeys("9");

            LOGGER.info("Input OTP values in field");
            AllureUtils.logStep("OTP values inserted in field");

            WebElement submitButton = driver.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"Submit\"])[3]"));
            submitButton.click();
            LOGGER.info("Click on submit button");
            AllureUtils.logStep("Click on submit button");

            WebElement notificationClick1 = null;
            try {
                notificationClick1 = driver.findElement(AppiumBy.accessibilityId("Allow"));
                if (notificationClick1.isDisplayed()) {
                    notificationClick1.click();
                    LOGGER.info("Click on notification button");
                    AllureUtils.logStep("Click on notification button");
                } else {
                    LOGGER.info("Notification element is not displayed.");
                    AllureUtils.logStep("Notification element is not displayed.");
                }
            } catch (NoSuchElementException e) {
                LOGGER.info("Crossclick element not found.");
                AllureUtils.logStep("Crossclick element not found.");
            }

            AllureUtils.captureScreenshot(driver, "Landed on home screen");

            Thread.sleep(3500);
            driver.terminateApp("com.cuesz.mobile");
        } catch (NoSuchElementException e) {
            LOGGER.error("An element could not be located on the page using the given search parameters.", e);
            AllureUtils.logStep("An element could not be located on the page using the given search parameters: " + e.getMessage());
            // Optionally, take a screenshot on failure
            AllureUtils.captureScreenshot(driver, "Error_Screenshot");
        }
    }
}
