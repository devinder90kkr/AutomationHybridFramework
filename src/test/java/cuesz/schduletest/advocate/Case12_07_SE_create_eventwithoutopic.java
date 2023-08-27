package cuesz.schduletest.advocate;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import cuesz.logintest.AdvocateLogin;
import cuesz.schdule.Step12_07_SE_create_eventwithoutopic;
import cuesz.utils.ExtentManager;
import cuesz.utils.WebDriverManager;

public class Case12_07_SE_create_eventwithoutopic {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Step12_07_SE_create_eventwithoutopic scheduleEventPage;
    
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialize the advocateLogin object
        scheduleEventPage = new Step12_07_SE_create_eventwithoutopic(driver);
   
        // Initialize Extent Reports
        extent = ExtentManager.getInstance();
        test = extent.createTest("Step12_07_SE_create_eventwithoutopic Test");
    }

    @Test
     public void advocatecreateEventwithoutpicTest() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialize loginPage
        advocateLogin.testAdvocateLogin();

        // Access the Schedule Event page
        scheduleEventPage.Schdulevent();
    
        // Log test steps and results
        test.log(Status.INFO, "Deleted an event for staff meeting");
        // Add more logs and assertions as needed
    
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
        extent.flush(); // Flush Extent Reports to generate the report
    }
}
