package cuesz.schduletest.advocate;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import cuesz.logintest.AdvocateLogin;
import cuesz.schdule.Case03_editevent;
import cuesz.utils.ExtentManager;
import cuesz.utils.WebDriverManager;
import io.qameta.allure.*;


@Epic ("Advocate Scheduling")
@Feature ("Event Creation")

public class Case03_editeventtest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case03_editevent scheduleEventPage;
    
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialize the advocateLogin object
        scheduleEventPage = new Case03_editevent(driver);
        
        // Initialize Extent Reports
        extent = ExtentManager.getInstance();
        test = extent.createTest("Case03_editevent Test");
    }

    @Test
    @Description("Advocate schdules and edit an event")
    @Story("Schdule Events")
    public void advocateScheduleeditEventTest() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialize loginPage
        advocateLogin.testAdvocateLogin();

        // Access the Schedule Event page
        scheduleEventPage.Editevent();

        // Log test steps and results
        test.log(Status.INFO, "Navigate to calendar and edit an created event");
        // Add more logs and assertions as needed
    
        Allure.step("Step Details");
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
        extent.flush(); // Flush Extent Reports to generate the report
    }
}
