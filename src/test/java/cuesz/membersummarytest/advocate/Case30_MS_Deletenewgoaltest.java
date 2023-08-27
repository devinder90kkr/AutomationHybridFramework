package cuesz.membersummarytest.advocate;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import cuesz.logintest.AdvocateLogin;
import cuesz.membersummary.Case30_MS_Deletenewgoal;
import cuesz.utils.ExtentManager;
import cuesz.utils.WebDriverManager;

public class Case30_MS_Deletenewgoaltest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case30_MS_Deletenewgoal membersummaryPage;
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialise the advocateLogin object
        membersummaryPage = new Case30_MS_Deletenewgoal(driver);

        // Initialize Extent Reports
        extent = ExtentManager.getInstance();
        test = extent.createTest("Case30_MS_Deletenewgoal Test");
    }

    @Test
    public void advocatdeletegoaltTest() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();

        // Access the Schedule Event page
        membersummaryPage.deletegoal();
    
        // Log test steps and results
        test.log(Status.INFO, "Verify the delete new goal for member");
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
        extent.flush(); // Flush Extent Reports to generate the report
     }
 }