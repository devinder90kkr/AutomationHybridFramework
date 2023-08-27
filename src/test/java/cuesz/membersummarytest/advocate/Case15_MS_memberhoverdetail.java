package cuesz.membersummarytest.advocate;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import cuesz.logintest.AdvocateLogin;
import cuesz.membersummary.Case15_MS_Memberhoverdetail;
import cuesz.utils.ExtentManager;
import cuesz.utils.WebDriverManager;

public class Case15_MS_memberhoverdetail {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case15_MS_Memberhoverdetail membersummaryPage;
    
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialise the advocateLogin object
        membersummaryPage = new Case15_MS_Memberhoverdetail(driver);
        
     // Initialize Extent Reports
        extent = ExtentManager.getInstance();
        test = extent.createTest("Case15_MS_Memberhoverdetail Test");
    }

    @Test
    public void advocateMemberhoverTest() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();

        // Access the Schedule Event page
        membersummaryPage.MemberSummary();
        
     // Log test steps and results
        test.log(Status.INFO, "Navigated to membersummary page and hover detail for perform, mindful, restore and fuel detail");
        // Add more logs and assertions as needed
    
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
        extent.flush(); // Flush Extent Reports to generate the report
    }
}
