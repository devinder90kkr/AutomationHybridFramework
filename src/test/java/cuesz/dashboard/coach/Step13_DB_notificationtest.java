package cuesz.dashboard.coach;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz.dashboard.Step13_DB_notification;
import cuesz.logintest.CoachLogin;
import cuesz.utils.WebDriverManager;

public class Step13_DB_notificationtest {
    private WebDriver driver;
    private CoachLogin CaochLogin;
    private Step13_DB_notification dashboardPage;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        CaochLogin = new CoachLogin(); // Initialize the CaochLogin object
        dashboardPage = new Step13_DB_notification(driver);
    }

    @Test
    public void advocateScheduleEventTest() throws InterruptedException {
    	CaochLogin.setUp(); // Call the setUp method of CaochLogin to initialize loginPage
        CaochLogin.testCoachLogin();

        // Access the Schedule Event page
        dashboardPage.Notification();
    
        // Add actions to schedule an event (enter event details, date, etc.)
        // Add assertions or verifications for successful event scheduling
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
    }
}
