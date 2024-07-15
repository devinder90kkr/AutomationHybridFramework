package cuesz.utils; 								//Package and Import Statements
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.safari.SafariDriver;
//import org.openqa.selenium.safari.SafariOptions;
//
//import java.time.Duration;
//import java.util.HashMap;
//import java.util.Map;
//import org.openqa.selenium.Dimension;
//
//import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
//import io.qameta.allure.Step;
//
////Class Declaration and Variables:
//public class WebDriverManager {						//The WebDriverManager class is located in the cuesz.utils package.
//    private static WebDriver driver;				// declares a private static variable driver of type 
//    												// WebDriver to hold the WebDriver instance.
//    	
//    @Step("Start the application")					// This method is annotated with @Step("Start the application"), which is likely used for reporting purposes with Allure.
//    public static WebDriver getDriver(String browser) {
//        if (driver == null) {								// It checks if driver is null (i.e., WebDriver is not yet initialized).
//            try {
//                if (browser.equalsIgnoreCase("chrome")) {
//                    // Setting up Google Chrome options
//                    Map<String, Object> prefs = new HashMap<>();
//                    prefs.put("profile.default_content_setting_values.notifications", 2);
//                    ChromeDriverManager.chromedriver().setup();
//                    ChromeOptions options = new ChromeOptions();
//                  
//                    // Need to add --headless=new because if chrome version more than v109+
//                    // If chrome version v91-108 thne need to use --headless=chrome
//                    
////                    options.addArguments("--headless=new");
////                	options.addArguments("addArguments");
////        			options.addArguments("--window-size=1920,1080");
////        			// options.addArguments("start-maximized");
////        			options.addArguments("disable-infobars");
////        			// options.addArguments("--disable-extensions");
////        			options.addArguments("--disable-dev-shm-usage");
////        			options.addArguments("--disable-browser-side-navigation");
////        			options.addArguments("--disable-gpu");
////        			options.addArguments("--no-sandbox");
////        			options.addArguments("--disable-gpu");
//                              
//                    options.setExperimentalOption("prefs", prefs);	
//                    options.addArguments("--use-fake-ui-for-media-stream");
//                    System.setProperty("webdriver.chrome.driver", Configuration.CHROME_DRIVER_PATH);
//                    driver = new ChromeDriver(options);
//                } else if (browser.equalsIgnoreCase("edge")) {
//                    // Setting up Microsoft Edge options
//                    EdgeOptions options = new EdgeOptions();
//                    // Set Edge browser options as needed
//                    System.setProperty("webdriver.edge.driver", Configuration.EDGE_DRIVER_PATH);
//                    driver = new EdgeDriver(options);
//                }else if (browser.equalsIgnoreCase("safari")) {
//                    // Setting up Microsoft Edge options
//                    SafariOptions options = new SafariOptions();
//                    // Set Edge browser options as needed
//                    System.setProperty("webdriver.safari.driver", Configuration.SAFARI_DRIVER_PATH);
//                    driver = new SafariDriver(options);
//                }else if (browser.equalsIgnoreCase("firefox")) {
//                    // Setting up Microsoft Edge options
//                    FirefoxOptions options = new FirefoxOptions();
//                    // Set Edge browser options as needed
//                    System.setProperty("webdriver.gecko.driver", Configuration.FIREFOX_DRIVER_PATH);       
//                    driver = new FirefoxDriver(options);
//                }
//
//                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(800));
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        return driver;
//    }
//
//    @Step("Stop the application")							//This method is annotated with @Step("Stop the application"), possibly for reporting.
//    public static void quitDriver() {
//        if (driver != null) {
//            driver.quit();
//            driver = null;
//        }
//    }
//    }
//    


import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class WebDriverManager {
    private static WebDriver driver;

    public static WebDriver getDriver(String browser) {
        if (driver == null) {
            try {
                if (browser.equalsIgnoreCase("chrome")) {
                    // Setting up Google Chrome options
                    Map<String, Object> prefs = new HashMap<>();
                    prefs.put("profile.default_content_setting_values.notifications", 2);
                    
                    ChromeDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    
                    
                    // Need to add --headless=new because if chrome version more than v109+
                    // If chrome version v91-108 thne need to use --headless=chrome              
//                    options.addArguments("--headless=new");
                    
                    
                    // Set Chrome options as needed
                    options.setExperimentalOption("prefs", prefs);	
                    options.addArguments("--use-fake-ui-for-media-stream");
                    driver = new ChromeDriver(options);
                } else if (browser.equalsIgnoreCase("edge")) {
                    EdgeDriverManager.edgedriver().setup();
                    EdgeOptions options = new EdgeOptions();
                    // Set Edge options as needed
                    driver = new EdgeDriver(options);
                } else if (browser.equalsIgnoreCase("safari")) {
                	 // Setting up Microsoft Edge options
                  SafariOptions options = new SafariOptions();
                  // Set Edge browser options as needed
                  System.setProperty("webdriver.safari.driver", Configuration.SAFARI_DRIVER_PATH);
                  driver = new SafariDriver(options);
                } else if (browser.equalsIgnoreCase("firefox")) {
                    FirefoxDriverManager.firefoxdriver().setup();
                    FirefoxOptions options = new FirefoxOptions();
                    // Set Firefox options as needed
                    driver = new FirefoxDriver(options);
                }

                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(800));
            } catch (Exception e) {
                e.printStackTrace();
            }
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
