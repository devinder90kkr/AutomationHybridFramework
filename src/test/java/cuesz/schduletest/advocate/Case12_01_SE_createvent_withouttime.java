package cuesz.schduletest.advocate;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import cuesz.logintest.AdvocateLogin;
import cuesz.schdule.Step12_01_SE_createvent_withouttime;
import cuesz.utils.ExtentManager;
import cuesz.utils.WebDriverManager;

public class Case12_01_SE_createvent_withouttime {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Step12_01_SE_createvent_withouttime scheduleEventPage;
    
    private ExtentReports extent;
    private ExtentTest test;


    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialize the advocateLogin object
        scheduleEventPage = new Step12_01_SE_createvent_withouttime(driver);
        
        // Initialize Extent Reports
        extent = ExtentManager.getInstance();
        test = extent.createTest("Step11_MC_deleteevent Test");
    }

    @Test
    public void advocatecreateEventwithouttimeTest() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialize loginPage
        advocateLogin.testAdvocateLogin();

        // Access the Schedule Event page
        scheduleEventPage.Schdulevent();

        // Log test steps and results
        test.log(Status.INFO, "Create an event without time");
        // Add more logs and assertions as needed
    
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
        extent.flush(); // Flush Extent Reports to generate the report
    }
}
