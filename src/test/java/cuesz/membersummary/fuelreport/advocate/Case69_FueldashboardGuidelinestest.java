package cuesz.membersummary.fuelreport.advocate;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import cuesz.logintest.AdvocateLogin;
import cuesz.membersummary.fuelreport.Case69_FueldashboardGuidelines;
import cuesz.utils.ExtentManager;
import cuesz.utils.WebDriverManager;
import io.qameta.allure.*;


@Epic ("Fuel report page")
@Feature ("Update fuel details")

public class Case69_FueldashboardGuidelinestest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case69_FueldashboardGuidelines  membersummarygraphPage;
    
    private ExtentReports extent;
    private ExtentTest test;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialize the advocateLogin object
        membersummarygraphPage = new Case69_FueldashboardGuidelines (driver);
        
     // Initialize Extent Reports
        extent = ExtentManager.getInstance();
        test = extent.createTest("Case69_FueldashboardGuidelines Test");
    }

    @Test
    @Description("navigation to fuel report")
    @Story("Cards update for member in fuels")
    
    public void advocateMemberhoverTest() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();

        // Access the graphs page
        membersummarygraphPage.fuelreport();
        
     // Log test steps and results
        test.log(Status.INFO, "Navigated to fuel report and click on various cards");
     
     // Capture a screenshot and attach it to Allure
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            File destination = new File("/Users/chicmicmac/Desktop/allurescreenshots.svg"); // Specify the path to save the screenshot
            FileUtils.copyFile(source, destination);
            Allure.addAttachment("Screenshot", FileUtils.openInputStream(destination));
        } catch (Exception e) {
            System.out.println("Failed to capture screenshot: " + e.getMessage());
            
        }
        
        Allure.step("Step Details");
        
    
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
        extent.flush(); // Flush Extent Reports to generate the report
    }
}
