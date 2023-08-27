package cuesz.membersummarytest.advocate;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import cuesz.logintest.AdvocateLogin;
import cuesz.membersummary.Case31_MS_Avtarclick;
import cuesz.utils.ExtentManager;
import cuesz.utils.WebDriverManager;

public class Case31_MS_Avtarclicktest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case31_MS_Avtarclick membersummaryPage;
    private ExtentReports extent;
    private ExtentTest test;


    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialise the advocateLogin object
        membersummaryPage = new Case31_MS_Avtarclick(driver);
        
        // Initialize Extent Reports
        extent = ExtentManager.getInstance();
        test = extent.createTest("Case31_MS_Avtarclick Test");
    }

    @Test
    public void advocateAvtarclcikTest() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();

        // Access the Schedule Event page
        membersummaryPage.Avatarclick();
    
        // Log test steps and results
        test.log(Status.INFO, "Verify the avtar clickable or not and view values");
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
        extent.flush(); // Flush Extent Reports to generate the report
     }
 }