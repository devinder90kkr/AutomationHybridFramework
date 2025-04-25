package logintest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import factory.WebDriverManager;
import base.Loginpage;
import utils.Config;
// import utils.Configuration;
import io.qameta.allure.Allure;

public class CoachLogin {
	private WebDriver driver;
    private Loginpage loginPage;
    private String coachEmail;
    private String coachPassword;


    @BeforeClass
    public void setUp() {
        // Read the browser information from the configuration file
        String browser = getBrowserFromConfigFile();

        // Set up WebDriverManager with the specified browser
        driver = WebDriverManager.getDriver(browser);
        driver.manage().window().maximize();
        // driver.get(Configuration.BASE_URL);
        driver.get(Config.getProperty("BASE_URL"));
        loginPage = new Loginpage(driver); // Initialize the loginPage object
        // Read coach email and password from config file
        coachEmail = Config.getProperty("coachemail");
        coachPassword = Config.getProperty("coachpassword");
    }

    @Test
    public void testCoachLogin() {
//        loginPage.login("seak@mailinator.com", "User!234");
    	 loginPage.login(coachEmail, coachPassword);
     // Capture and add login details to Allure report
        String username = "seak@mailinator.com";
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


