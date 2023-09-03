package cuesz.membersummarygraph.advocate;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import cuesz.logintest.AdvocateLogin;
import cuesz.membersummary.graphs.Case64_RestingPhysiology;
import cuesz.utils.ExtentManager;
import cuesz.utils.WebDriverManager;

public class Case64_RestingPhysiologytest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case64_RestingPhysiology  membersummarygraphPage;
    
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialize the advocateLogin object
        membersummarygraphPage = new Case64_RestingPhysiology (driver);
        
     // Initialize Extent Reports
        extent = ExtentManager.getInstance();
        test = extent.createTest("Case64_RestingPhysiology Test");
    }

    @Test
    public void advocateMemberhoverTest() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();

        // Access the graphs page
        membersummarygraphPage.RestingPhysiology();
        
     // Log test steps and results
        test.log(Status.INFO, "Navigated to Resting Physiology and review graphs as per selected options for member");
        // Add more logs and assertions as needed
    
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
        extent.flush(); // Flush Extent Reports to generate the report
    }
}
