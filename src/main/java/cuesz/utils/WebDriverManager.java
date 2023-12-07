package cuesz.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import io.qameta.allure.Step;

public class WebDriverManager {
    private static WebDriver driver;

    @Step("Start the application")
    public static WebDriver getDriver(String browser) {
        if (driver == null) {
            try {
                if (browser.equalsIgnoreCase("chrome")) {
                    // Setting up Google Chrome options
                    Map<String, Object> prefs = new HashMap<>();
                    prefs.put("profile.default_content_setting_values.notifications", 2);
                    ChromeOptions options = new ChromeOptions();
                    options.setExperimentalOption("prefs", prefs);
                    options.addArguments("--use-fake-ui-for-media-stream");
                    System.setProperty("webdriver.chrome.driver", Configuration.CHROME_DRIVER_PATH);
                    driver = new ChromeDriver(options);
                } else if (browser.equalsIgnoreCase("edge")) {
                    // Setting up Microsoft Edge options
                    EdgeOptions options = new EdgeOptions();
                    // Set Edge browser options as needed
                    System.setProperty("webdriver.edge.driver", Configuration.EDGE_DRIVER_PATH);
                    driver = new EdgeDriver(options);
                }

                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(800));
            } catch (Exception e) {
                e.printStackTrace();
            }
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


//package cuesz.utils;
//
//import java.time.Duration;
//import java.util.HashMap;
//import java.util.Map;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import io.qameta.allure.Step;
//
//
//
//
//public class WebDriverManager {
//
//    private static WebDriver driver;
//    @Step("Start the application")
//    public static WebDriver getDriver() {
//        if (driver == null) {
//            try {
//                // Setting up Google Chrome options for no notification popup
//                Map<String, Object> prefs = new HashMap<String, Object>();
//                prefs.put("profile.default_content_setting_values.notifications", 2);
//                ChromeOptions options = new ChromeOptions();
//                options.setExperimentalOption("prefs", prefs);
//                // Allow camera and microphone access
//                options.addArguments("--use-fake-ui-for-media-stream");
////                // Create a new private browsing session (Incognito mode)
////                options.addArguments("--incognito");
//
//                System.setProperty("webdriver.chrome.driver", Configuration.CHROME_DRIVER_PATH);
//
//                // Create a ChromeDriver instance
//                driver = new ChromeDriver(options);
//                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(800));
//
//            } catch (Exception e) {
//                e.printStackTrace();
//
//            }
//        }
//        return driver;
//    }
//    @Step("Stop the application")
//    public static void quitDriver() {
//        if (driver != null) {
//            driver.quit();
//            driver = null;
//        }
//    }
//}





/******************/

//package cuesz.utils;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.qameta.allure.Step;
//
//public class WebDriverManager {
//	
//	 private static WebDriver driver;
//
//	 @Step("Start the application")
//	    public static WebDriver getDriver() {
//	        if (driver == null) {
//	            System.setProperty("webdriver.chrome.driver", Configuration.CHROME_DRIVER_PATH);
//	            driver = new ChromeDriver();
//	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
//	        }
//	        return driver;
//	    }
//	 
//	 @Step("Stop the application")
//	    public static void quitDriver() {
//	        if (driver != null) {
//	            driver.quit();
//	            driver = null;
//	        }
//	    }
//	}
//


/*********************************************************/
//package cuesz.utils;
//
//import java.time.Duration;
//import java.util.HashMap;
//import java.util.Map;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//
//
//
//public class WebDriverManager {
//
//    private static WebDriver driver;
//
//    public static WebDriver getDriver() {
//        if (driver == null) {
//            try {
//                // Setting up Google Chrome options for no notification popup
//                Map<String, Object> prefs = new HashMap<String, Object>();
//                prefs.put("profile.default_content_setting_values.notifications", 2);
//                ChromeOptions options = new ChromeOptions();
//                options.setExperimentalOption("prefs", prefs);
//                // Allow camera and microphone access
//                options.addArguments("--use-fake-ui-for-media-stream");
////                // Create a new private browsing session (Incognito mode)
////                options.addArguments("--incognito");
//
//                System.setProperty("webdriver.chrome.driver", Configuration.CHROME_DRIVER_PATH);
//
//                // Create a ChromeDriver instance
//                driver = new ChromeDriver(options);
//                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(800));
//
//            } catch (Exception e) {
//                e.printStackTrace();
//
//            }
//        }
//        return driver;
//    }
//
//    public static void quitDriver() {
//        if (driver != null) {
//            driver.quit();
//            driver = null;
//        }
//    }
//}


/***********************************************************/

//package cuesz.utils;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.qameta.allure.Step;
//
//public class WebDriverManager {
//	
//	 private static WebDriver driver;
//
//	 @Step("Start the application")
//	    public static WebDriver getDriver() {
//	        if (driver == null) {
//	            System.setProperty("webdriver.chrome.driver", Configuration.CHROME_DRIVER_PATH);
//	            driver = new ChromeDriver();
//	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
//	        }
//	        return driver;
//	    }
//	 
//	 @Step("Stop the application")
//	    public static void quitDriver() {
//	        if (driver != null) {
//	            driver.quit();
//	            driver = null;
//	        }
//	    }
//	}




/***************/


