package cuesz.membercommunication.advocate;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import cuesz.logintest.AdvocateLogin;
import cuesz.membercommunication.Case47_Membersearchcommunication;
import cuesz.utils.ExtentManager;
import cuesz.utils.WebDriverManager;

public class Case47_Membersearchcommunicatetest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case47_Membersearchcommunication memberlogicPage;

    private ExtentReports extent;
    private ExtentTest test;
    
    
    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialise the advocateLogin object
        memberlogicPage = new Case47_Membersearchcommunication(driver);
        
     // Initialize Extent Reports
        extent = ExtentManager.getInstance();
        test = extent.createTest("Case47_Membersearchcommunication Test");
    }

    @Test
    public void advocatecmembercommunictaeTest() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();	

        // Access the Schedule Event page
        memberlogicPage.Membercommunicate();
    
        // Log test steps and results
        test.log(Status.INFO, "Navigated to Member Communication and validate heading");
        // Add more logs and assertions as needed
        
    }

    @AfterClass
    public void tearDown() {
          extent.flush(); // Flush Extent Reports to generate the report
    }
}
