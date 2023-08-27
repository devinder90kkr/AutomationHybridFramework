package cuesz.logictest.coach;

import java.text.ParseException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import cuesz.logicpage.Case44_MSL_Mindful;
import cuesz.logintest.CoachLogin;
import cuesz.utils.ExtentManager;
import cuesz.utils.WebDriverManager;

public class Case44_MSL_Mindfultest {
    private WebDriver driver;
    private CoachLogin CaochLogin;
    private Case44_MSL_Mindful memberlogicPage;
    
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        CaochLogin = new CoachLogin(); // Initialize the CaochLogin object
        memberlogicPage = new Case44_MSL_Mindful(driver);
        
     // Initialize Extent Reports
        extent = ExtentManager.getInstance();
        test = extent.createTest("Case44_MSL_Mindful Test");
    }

    @Test
    public void advocatelogicmemberTest() throws InterruptedException, ParseException {
    	CaochLogin.setUp(); // Call the setUp method of CaochLogin to initialize loginPage
        CaochLogin.testCoachLogin();

        // Access the Schedule Event page
        memberlogicPage.mindful();
 
        // Log test steps and results
        test.log(Status.INFO, "Navigated to mindful page and added mindful data like duration");
        // Add more logs and assertions as needed
    
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
        extent.flush(); // Flush Extent Reports to generate the report
    }
}
