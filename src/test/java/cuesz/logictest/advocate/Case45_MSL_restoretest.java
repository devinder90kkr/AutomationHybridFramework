package cuesz.logictest.advocate;

import java.text.ParseException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import cuesz.logicpage.Case45_MSL_restore;
import cuesz.logintest.AdvocateLogin;
import cuesz.utils.ExtentManager;
import cuesz.utils.WebDriverManager;

public class Case45_MSL_restoretest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case45_MSL_restore memberlogicPage;
 
    private ExtentReports extent;
    private ExtentTest test;
    
    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialise the advocateLogin object
        memberlogicPage = new Case45_MSL_restore(driver);
        
        // Initialize Extent Reports
        extent = ExtentManager.getInstance();
        test = extent.createTest("Case45_MSL_restore Test");
    }

    @Test
    public void advocatelogicmemberTest() throws InterruptedException, ParseException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();

        // Access the Schedule Event page
        memberlogicPage.restore();
        
     // Log test steps and results
        test.log(Status.INFO, "Navigated to restore page and added restore data for categories such as Before Sleep Time & sleep time & ");
        // Add more logs and assertions as needed
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
   
        extent.flush(); // Flush Extent Reports to generate the report
    
    }
}
