package cuesz.membersummarytest.advocate;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import cuesz.logintest.AdvocateLogin;
import cuesz.membersummary.Case24_MS_Mindfulactivity;
import cuesz.utils.ExtentManager;
import cuesz.utils.WebDriverManager;

public class Case24_MS_Mindfulactivitytest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case24_MS_Mindfulactivity membersummaryPage;
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialise the advocateLogin object
        membersummaryPage = new Case24_MS_Mindfulactivity(driver);
 
        // Initialize Extent Reports
        extent = ExtentManager.getInstance();
        test = extent.createTest("Case24_MS_Mindfulactivity Test");
    }

    @Test
    public void advocatemindfuldataTest() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();

        // Access the Schedule Event page
        membersummaryPage.mindfulactivity();
        // Log test steps and results
        test.log(Status.INFO, "Verify the mindful activity data by its dropdown");
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
        extent.flush(); // Flush Extent Reports to generate the report
     }
 }