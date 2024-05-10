//package cuesz.logintest;
//
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import cuesz.pages.Loginpage;
//import cuesz.utils.Configuration;
//import cuesz.utils.WebDriverManager;
//import io.qameta.allure.Allure;
//
//public class AdvocateLogin {    
//	private WebDriver driver;
//    private Loginpage loginPage; 
//   
//    @BeforeClass
//    public void setUp() {
//
//        driver = WebDriverManager.getDriver();
//        driver.manage().window().maximize();
//        driver.get(Configuration.BASE_URL);
//        loginPage = new Loginpage(driver); // Initialize the loginPage object
//    }
//
//    @Test
//    
//    
//    public void testAdvocateLogin() {
//    	
//        loginPage.login("stevecuesz90@gmail.com", "User!234");
//        
//     // Capture and add login details to Allure report
//        String username = "stevecuesz90@gmail.com";
//        String password = "User!234";
//        Allure.attachment("Login Details", "Username: " + username + "\nPassword: " + password);
//        
//        
//        
//    }
//}
package cuesz.logintest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz.pages.Loginpage;
import cuesz.utils.Config;
import cuesz.utils.Configuration;
import cuesz.utils.WebDriverManager;
import io.qameta.allure.Allure;

public class AdvocateLogin {
    private WebDriver driver;
    private Loginpage loginPage; 

    @BeforeClass
    public void setUp() {
        // Read the browser information from the configuration file
        String browser = getBrowserFromConfigFile();

        // Set up WebDriverManager with the specified browser
        driver = WebDriverManager.getDriver(browser);
        driver.manage().window().maximize();
       // driver.get(Configuration.BASE_URL);
        driver.get(Config.getProperty("BASE_URL"));
        loginPage = new Loginpage(driver);
    }

    @Test
    public void testAdvocateLogin() {
        loginPage.login("markcuesz90@yopmail.com", "User!234");

        // Capture and add login details to Allure report
        String username = "markcuesz90@yopmail.com";
        String password = "User!234";
        Allure.attachment("Login Details", "Username: " + username + "\nPassword: " + password);
    }

    private String getBrowserFromConfigFile() {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty("browser", "chrome");
    }


}
