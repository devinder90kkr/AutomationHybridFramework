package cuesz.schduletest.advocate;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import cuesz.logintest.AdvocateLogin;
import cuesz.schdule.Step12_07_SE_create_eventwithoutopic;
import cuesz.utils.WebDriverManager;

public class Case12_07_SE_create_eventwithoutopic {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Step12_07_SE_create_eventwithoutopic scheduleEventPage;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialize the advocateLogin object
        scheduleEventPage = new Step12_07_SE_create_eventwithoutopic(driver);
    }

    @Test
     public void advocateScheduleEventTest() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialize loginPage
        advocateLogin.testAdvocateLogin();

        // Access the Schedule Event page
        scheduleEventPage.Schdulevent();
    
        // Add actions to schedule an event (enter event details, date, etc.)
        // Add assertions or verifications for successful event scheduling
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
    }
}
