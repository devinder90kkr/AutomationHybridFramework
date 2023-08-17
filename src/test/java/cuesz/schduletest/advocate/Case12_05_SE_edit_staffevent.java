package cuesz.schduletest.advocate;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import cuesz.logintest.AdvocateLogin;
import cuesz.schdule.Step12_04_SE_view_staffevent;
import cuesz.schdule.Step12_05_SE_edit_staffevent;
import cuesz.utils.WebDriverManager;

public class Case12_05_SE_edit_staffevent {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Step12_05_SE_edit_staffevent scheduleEventPage;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialize the advocateLogin object
        scheduleEventPage = new Step12_05_SE_edit_staffevent(driver);
    }

    @Test
     public void advocateScheduleEventTest() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialize loginPage
        advocateLogin.testAdvocateLogin();

        // Access the Schedule Event page
        scheduleEventPage.Editevent();
    
        // Add actions to schedule an event (enter event details, date, etc.)
        // Add assertions or verifications for successful event scheduling
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
    }
}
