package cuesz.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
	
	 private static WebDriver driver;

	    public static WebDriver getDriver() {
	        if (driver == null) {
	            System.setProperty("webdriver.chrome.driver", Configuration.CHROME_DRIVER_PATH);
	            driver = new ChromeDriver();
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	        }
	        return driver;
	    }

	    public static void quitDriver() {
	        if (driver != null) {
	            driver.quit();
	            driver = null;
	        }
	    }
	}


