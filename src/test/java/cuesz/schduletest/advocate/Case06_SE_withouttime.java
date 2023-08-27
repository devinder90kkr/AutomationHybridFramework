package cuesz.schduletest.advocate;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import cuesz.logintest.AdvocateLogin;
import cuesz.schdule.Step06_SE_withouttime;
import cuesz.utils.ExtentManager;
import cuesz.utils.WebDriverManager;

public class Case06_SE_withouttime {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Step06_SE_withouttime scheduleEventPage;
    
    private ExtentReports extent;
    private ExtentTest test;


    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialize the advocateLogin object
        scheduleEventPage = new Step06_SE_withouttime(driver);
        
        // Initialize Extent Reports
        extent = ExtentManager.getInstance();
        test = extent.createTest("Step06_SE_withouttime Test");
    }

    @Test
    public void advocateSchedulewithoutimeTest() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialize loginPage
        advocateLogin.testAdvocateLogin();

        // Access the Schedule Event page
        scheduleEventPage.withouttime();
    
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
