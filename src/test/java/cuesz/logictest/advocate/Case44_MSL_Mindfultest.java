package cuesz.logictest.advocate;

import java.text.ParseException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import cuesz.logicpage.Case44_MSL_Mindful;
import cuesz.logintest.AdvocateLogin;
import cuesz.utils.ExtentManager;
import cuesz.utils.WebDriverManager;

public class Case44_MSL_Mindfultest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case44_MSL_Mindful memberlogicPage;
    
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialise the advocateLogin object
        memberlogicPage = new Case44_MSL_Mindful(driver);
        
     // Initialize Extent Reports
        extent = ExtentManager.getInstance();
        test = extent.createTest("Case43_MSL_Fuel Test");
    }

    @Test
    public void advocatelogicmemberTest() throws InterruptedException, ParseException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();

        // Access the Schedule Event page
        memberlogicPage.mindful();
    
        // Add actions to schedule an event (enter event details, date, etc.)
        // Add assertions or verifications for successful event scheduling
   
        // Log test steps and results
        test.log(Status.INFO, "Navigated to mindful page and added mindful data like duration");
        // Add more logs and assertions as needed
    
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
        extent.flush(); // Flush Extent Reports to generate the report
    }
}
