package cuesz.logictest.coach;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import cuesz.logicpage.Case35_MSL_MemberWilingnessLimitationScore;
import cuesz.logintest.CoachLogin;
import cuesz.utils.ExtentManager;
import cuesz.utils.WebDriverManager;

public class Case35_MSL_MemberWilingnessLimitationScoretest {
    private WebDriver driver;
    private CoachLogin CaochLogin;
    private Case35_MSL_MemberWilingnessLimitationScore memberlogicPage;
    
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        CaochLogin = new CoachLogin(); // Initialize the CaochLogin object
        memberlogicPage = new Case35_MSL_MemberWilingnessLimitationScore(driver);
        
        
        // Initialize Extent Reports
        extent = ExtentManager.getInstance();
        test = extent.createTest("Case35_MSL_MemberWilingnessLimitationScore Test");
    }

    @Test
    public void advocatelogicmemberTest() throws InterruptedException {
        CaochLogin.setUp(); // Call the setUp method of CaochLogin to initialize loginPage
        CaochLogin.testCoachLogin();

        // Access the Schedule Event page
        memberlogicPage.Basicinfo2();
    
        // Add actions to schedule an event (enter event details, date, etc.)
        // Add assertions or verifications for successful event scheduling
        
     // Log test steps and results
        test.log(Status.INFO, "Navigated to member willingness, Limitation, Performance Score");
        // Add more logs and assertions as needed
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
        extent.flush(); // Flush Extent Reports to generate the report
    }
}
