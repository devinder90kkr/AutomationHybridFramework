package dashboard.coach;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz.dashboard.Step14_DB_MessgNotification;
import cuesz.logintest.CoachLogin;
import cuesz.utils.WebDriverManager;

public class Step14_DB_MessgNotificationtest {
    private WebDriver driver;
    private CoachLogin CaochLogin;
    private Step14_DB_MessgNotification dashboardPage;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        CaochLogin = new CoachLogin(); // Initialize the CaochLogin object
        dashboardPage = new Step14_DB_MessgNotification(driver);
    }

    @Test
    public void advocateScheduleEventTest() throws InterruptedException {
    	CaochLogin.setUp(); // Call the setUp method of CaochLogin to initialize loginPage
        CaochLogin.testCoachLogin();

        // Access the Schedule Event page
        dashboardPage.MessageNotification();
    
        // Add actions to schedule an event (enter event details, date, etc.)
        // Add assertions or verifications for successful event scheduling
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
    }
}
