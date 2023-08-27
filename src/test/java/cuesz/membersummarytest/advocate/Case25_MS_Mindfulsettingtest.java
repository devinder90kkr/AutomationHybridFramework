package cuesz.membersummarytest.advocate;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import cuesz.logintest.AdvocateLogin;
import cuesz.membersummary.Case25_MS_Mindfulsetting;
import cuesz.utils.ExtentManager;
import cuesz.utils.WebDriverManager;

public class Case25_MS_Mindfulsettingtest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case25_MS_Mindfulsetting membersummaryPage;
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialise the advocateLogin object
        membersummaryPage = new Case25_MS_Mindfulsetting(driver);

        // Initialize Extent Reports
        extent = ExtentManager.getInstance();
        test = extent.createTest("Case25_MS_Mindfulsetting Test");
    }

    @Test
    public void advocatemindfulsettingTest() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();

        // Access the Schedule Event page
        membersummaryPage.mindfulactivity();

        // Log test steps and results
        test.log(Status.INFO, "Verify the mindful setting features");
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
        extent.flush(); // Flush Extent Reports to generate the report
     }
 }