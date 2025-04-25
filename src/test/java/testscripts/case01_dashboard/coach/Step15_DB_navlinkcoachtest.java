package testscripts.case01_dashboard.coach;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import feature.case01_dashboard.Step15_DB_navlinkcoach;
import factory.WebDriverManager;
import logintest.CoachLogin;

public class Step15_DB_navlinkcoachtest {
    private WebDriver driver;
    private CoachLogin CaochLogin;
    private Step15_DB_navlinkcoach dashboardPage;

    @BeforeClass
    public void setUp() {
    	  // Read the browser information from the configuration file
        String browser = getBrowserFromConfigFile();

        // Set up WebDriverManager with the specified browser
        driver = WebDriverManager.getDriver(browser);
        driver.manage().window().maximize();
        CaochLogin = new CoachLogin(); // Initialize the CaochLogin object
        dashboardPage = new Step15_DB_navlinkcoach(driver);
    }

    @Test
    public void coachdashbaordTest() throws InterruptedException {
    	CaochLogin.setUp(); // Call the setUp method of CaochLogin to initialize loginPage
        CaochLogin.testCoachLogin();

        // Access the Schedule Event page
        dashboardPage.Navigationfunctionality();
    
        // Add actions to schedule an event (enter event details, date, etc.)
        // Add assertions or verifications for successful event scheduling
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
    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
    }
}
