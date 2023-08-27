 package cuesz.schduletest.advocate;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import cuesz.logintest.AdvocateLogin;
import cuesz.schdule.Case01_createvent;
import cuesz.utils.ExtentManager;
import cuesz.utils.WebDriverManager;

public class Case01_createventtest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case01_createvent scheduleEventPage;
    
    private ExtentReports extent;
    private ExtentTest test;


    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialise the advocateLogin object
        scheduleEventPage = new Case01_createvent(driver);

        // Initialize Extent Reports
        extent = ExtentManager.getInstance();
        test = extent.createTest("Case01_createvent Test");
    }
    
    @Test
    public void advocateSchedulecreateeventTest() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();

        // Access the Schedule Event page
        scheduleEventPage.Schdulevent();
 
        // Log test steps and results
        test.log(Status.INFO, "Navigate to schedule master and create an event");
        // Add more logs and assertions as needed
       
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
        extent.flush(); // Flush Extent Reports to generate the report
    }
}
