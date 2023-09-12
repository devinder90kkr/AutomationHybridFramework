package cuesz.dashboard.coach;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz.dashboard.Step15_DB_navlinkcoach;
import cuesz.logintest.CoachLogin;
import cuesz.utils.WebDriverManager;

public class Step15_DB_navlinkcoachtest {
    private WebDriver driver;
    private CoachLogin CaochLogin;
    private Step15_DB_navlinkcoach dashboardPage;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        CaochLogin = new CoachLogin(); // Initialize the CaochLogin object
        dashboardPage = new Step15_DB_navlinkcoach(driver);
    }

    @Test
    public void coachdashbaordTest() throws InterruptedException {
    	CaochLogin.setUp(); // Call the setUp method of CaochLogin to initialize loginPage
        CaochLogin.testCoachLogin();

        // Access the Schedule Event page
        dashboardPage.Navigationfunctionality();
    
        // Add actions to schedule an event (enter event details, date, etc.)
        // Add assertions or verifications for successful event scheduling
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
    }
}
