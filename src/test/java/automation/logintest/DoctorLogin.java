package automation.logintest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
// import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automation.factory.WebDriverManager;
import automation.pages.Loginpage;
import automation.utils.Config;
// import cuesz.utils.Configuration;
import io.qameta.allure.Allure;

public class DoctorLogin {
	private WebDriver driver;
    private Loginpage loginPage;
    private String doctoremail;
    private String doctorpassword;

    @BeforeClass
    public void setUp() { // Read the browser information from the configuration file
        String browser = getBrowserFromConfigFile();

        // Set up WebDriverManager with the specified browser
        driver = WebDriverManager.getDriver(browser);
        driver.manage().window().maximize();
        // driver.get(Configuration.BASE_URL);
        driver.get(Config.getProperty("BASE_URL"));
        loginPage = new Loginpage(driver);
        // Read doctor email and password from config file
        doctoremail = Config.getProperty("doctoremail");
        doctorpassword = Config.getProperty("doctorpassword");
    }

    @Test
    public void testDoctorLogin() {
//        loginPage.login("manan@yopmail.com", "User!234");
    	 loginPage.login(doctoremail, doctorpassword);
     // Capture and add login details to Allure report
        String username = "manan@yopmail.com";
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
//    @AfterClass
//    public void tearDown() {
//        WebDriverManager.quitDriver();
//    }
}


