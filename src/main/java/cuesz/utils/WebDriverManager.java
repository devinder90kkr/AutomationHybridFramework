package cuesz.utils;

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
                  
                    // Need to add --headless=new because if chrome version more than v109+
                    // If chrome version v91-108 thne need to use --headless=chrome
                    
               //     options.addArguments("--headless=new");
                  
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
                }else if (browser.equalsIgnoreCase("safari")) {
                    // Setting up Microsoft Edge options
                    SafariOptions options = new SafariOptions();
                    // Set Edge browser options as needed
                    System.setProperty("webdriver.safari.driver", Configuration.SAFARI_DRIVER_PATH);
                    driver = new SafariDriver(options);
                }else if (browser.equalsIgnoreCase("firefox")) {
                    // Setting up Microsoft Edge options
                    FirefoxOptions options = new FirefoxOptions();
                    // Set Edge browser options as needed
                    System.setProperty("webdriver.gecko.driver", Configuration.FIREFOX_DRIVER_PATH);       
                    driver = new FirefoxDriver(options);
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
