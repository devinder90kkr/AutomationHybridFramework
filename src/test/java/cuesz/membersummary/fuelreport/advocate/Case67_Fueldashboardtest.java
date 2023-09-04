package cuesz.membersummary.fuelreport.advocate;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import cuesz.logintest.AdvocateLogin;
import cuesz.membersummary.fuelreport.Case67_Fueldashboard;
import cuesz.utils.AllureUtils;
import cuesz.utils.WebDriverManager;
import io.qameta.allure.*;

@Epic ("Fuel report page")
@Feature ("Update fuel details")

public class Case67_Fueldashboardtest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case67_Fueldashboard  membersummarygraphPage;
    

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialize the advocateLogin object
        membersummarygraphPage = new Case67_Fueldashboard (driver); 
    }

    @Test
    @Description("navigation to fuel report")
    @Story("Cards update for member in fuels")
    
    public void advocateMemberhoverTest() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();

        // Access the graphs page
        membersummarygraphPage.fuelreport();
        
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
        Allure.step("Step Details");
    
    
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
       
    }
}
