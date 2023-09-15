package cuesz.utils;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.qameta.allure.Step;

public class WebDriverManager {
	
	 private static WebDriver driver;

	 @Step("Start the application")
	    public static WebDriver getDriver() {
	        if (driver == null) {
	        	
	        	// Setting up Google Chrome options for no notification popup
	            Map<String, Object> prefs = new HashMap<String, Object>();
	            prefs.put("profile.default_content_setting_values.notifications", 2);
	            ChromeOptions options = new ChromeOptions();
	            options.setExperimentalOption("prefs", prefs);
	            // Allow camera and microphone access
	            options.addArguments("--use-fake-ui-for-media-stream"); // Allow camera and microphone access

	            // Create a new private browsing session (Incognito mode)
	            options.addArguments("--incognito");

		            
	            System.setProperty("webdriver.chrome.driver", Configuration.CHROME_DRIVER_PATH);
	          
	      
	            
	            driver = new ChromeDriver(options);
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(800));
	        }
	        return driver;
	    }
	 
	 @Step("Stop the application")
	    public static void quitDriver() {
	        if (driver != null) {
	            driver.quit();
	            driver = null;
	        }
	    }
	}

