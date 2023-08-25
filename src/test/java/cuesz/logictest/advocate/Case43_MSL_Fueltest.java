package cuesz.logictest.advocate;

import java.text.ParseException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import cuesz.logicpage.Case43_MSL_Fuel;
import cuesz.logintest.AdvocateLogin;
import cuesz.utils.ExtentManager;
import cuesz.utils.WebDriverManager;

public class Case43_MSL_Fueltest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case43_MSL_Fuel memberlogicPage;
    
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialise the advocateLogin object
        memberlogicPage = new Case43_MSL_Fuel(driver);
        
     // Initialize Extent Reports
        extent = ExtentManager.getInstance();
        test = extent.createTest("Case43_MSL_Fuel Test");
        
    }

    @Test
    public void advocatelogicmemberTest() throws InterruptedException, ParseException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();

        // Access the Schedule Event page
        memberlogicPage.Fuel();
    
        // Add actions to schedule an event (enter event details, date, etc.)
        // Add assertions or verifications for successful event scheduling
        
     // Log test steps and results
        test.log(Status.INFO, "Navigated to fuel page and added fuel data for categories such as breakfast, early snack, lunch etc");
        // Add more logs and assertions as needed
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
        
        extent.flush(); // Flush Extent Reports to generate the report
    }
}
