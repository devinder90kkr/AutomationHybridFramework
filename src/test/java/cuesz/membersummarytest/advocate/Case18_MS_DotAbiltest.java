package cuesz.membersummarytest.advocate;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import cuesz.logintest.AdvocateLogin;
import cuesz.membersummary.Case18_MS_DotAbiltyPM;
import cuesz.utils.ExtentManager;
import cuesz.utils.WebDriverManager;

public class Case18_MS_DotAbiltest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case18_MS_DotAbiltyPM membersummaryPage;
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialise the advocateLogin object
        membersummaryPage = new Case18_MS_DotAbiltyPM(driver);
        
        // Initialize Extent Reports
        extent = ExtentManager.getInstance();
        test = extent.createTest("Case18_MS_DotAbiltyPM Test");      
    }

    @Test
    public void advocatememberdotsTest() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();

        // Access the Schedule Event page
        membersummaryPage.Dotstatus_Abilityperform();
    
        // Log test steps and results
        test.log(Status.INFO, "Navigated to membersummary page & dots ability features");

    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
        extent.flush(); // Flush Extent Reports to generate the report
    }
}
