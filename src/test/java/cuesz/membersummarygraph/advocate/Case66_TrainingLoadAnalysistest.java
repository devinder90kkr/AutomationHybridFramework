package cuesz.membersummarygraph.advocate;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import cuesz.logintest.AdvocateLogin;
import cuesz.membersummary.graphs.Case66_TrainingLoadAnalysis;
import cuesz.utils.ExtentManager;
import cuesz.utils.WebDriverManager;

public class Case66_TrainingLoadAnalysistest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case66_TrainingLoadAnalysis  membersummarygraphPage;
    
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialize the advocateLogin object
        membersummarygraphPage = new Case66_TrainingLoadAnalysis (driver);
        
     // Initialize Extent Reports
        extent = ExtentManager.getInstance();
        test = extent.createTest("Case66_TrainingLoadAnalysis Test");
    }

    @Test
    public void advocateMemberhoverTest() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();

        // Access the graphs page
        membersummarygraphPage.TrainingLoadAnalysis();
        
     // Log test steps and results
        test.log(Status.INFO, "Navigated to Load Training Analysis and review graphs as per selected options for member");
        // Add more logs and assertions as needed
    
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
        extent.flush(); // Flush Extent Reports to generate the report
    }
}
