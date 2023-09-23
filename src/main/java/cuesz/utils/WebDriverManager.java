package cuesz.utils;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v114.network.Network;
import org.openqa.selenium.devtools.v114.network.model.Request;
import org.openqa.selenium.devtools.v114.network.model.Response;




public class WebDriverManager {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            try {
                // Setting up Google Chrome options for no notification popup
                Map<String, Object> prefs = new HashMap<String, Object>();
                prefs.put("profile.default_content_setting_values.notifications", 2);
                ChromeOptions options = new ChromeOptions();
                options.setExperimentalOption("prefs", prefs);
                // Allow camera and microphone access
                options.addArguments("--use-fake-ui-for-media-stream");
//                // Create a new private browsing session (Incognito mode)
//                options.addArguments("--incognito");

                System.setProperty("webdriver.chrome.driver", Configuration.CHROME_DRIVER_PATH);

                // Create a ChromeDriver instance
                driver = new ChromeDriver(options);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(800));

//                // Initialize DevTools
//                DevTools devTools = ((ChromeDriver) driver).getDevTools();
//                devTools.createSession();
//                devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
//                 
//                
//        		List<Integer> statusCodes = new ArrayList<>();
//
//                devTools.addListener(Network.responseReceived(), response -> {
//                    Response res = response.getResponse();
//                    System.out.println("Response URL: " + res.getUrl());
//                    System.out.println("Response Status: " + res.getStatus());
//                    statusCodes.add(res.getStatus());
//                    if (res.getStatus() >= 400) {
//                        System.out.println(res.getUrl() + " is failing with status code " + res.getStatus());
//                    }
//                });
//
//                // Store the status codes for later retrieval
//                devTools.addListener(Network.loadingFinished(), loadingFinished -> {
//                    System.out.println("All Status Codes Captured: " + statusCodes);
//                });

            } catch (Exception e) {
                e.printStackTrace();
                // Handle any exceptions that may occur during initialization
//                driver.quit();
//                driver = null;
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


/*****/

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


