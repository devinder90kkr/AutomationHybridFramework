package cuesz.membersummarygraph.advocate;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import cuesz.logintest.AdvocateLogin;
import cuesz.membersummary.graphs.Case63_CorrelationAnalysis2extende;
import cuesz.utils.ExtentManager;
import cuesz.utils.WebDriverManager;

public class Case63_CorrelationAnalysis2extende3test {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case63_CorrelationAnalysis2extende  membersummarygraphPage;
    
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialize the advocateLogin object
        membersummarygraphPage = new Case63_CorrelationAnalysis2extende (driver);
        
     // Initialize Extent Reports
        extent = ExtentManager.getInstance();
        test = extent.createTest("Case63_CorrelationAnalysis Test");
    }

    @Test
    public void advocateMemberhoverTest() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();

        // Access the graphs page
        membersummarygraphPage.corelation();
        
     // Log test steps and results
        test.log(Status.INFO, "Navigated to Correlation Analysis and review graphs as per selected options for member");
        // Add more logs and assertions as needed
    
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
        extent.flush(); // Flush Extent Reports to generate the report
    }
}
