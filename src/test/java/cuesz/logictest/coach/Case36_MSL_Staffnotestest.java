package cuesz.logictest.coach;

import java.text.ParseException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz.logicpage.Case36_MSL_Staffnotes;
import cuesz.logintest.CoachLogin;
import cuesz.utils.WebDriverManager;

public class Case36_MSL_Staffnotestest {
    private WebDriver driver;
    private CoachLogin CaochLogin;
    private Case36_MSL_Staffnotes memberlogicPage;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        CaochLogin = new CoachLogin(); // Initialize the CaochLogin object
        memberlogicPage = new Case36_MSL_Staffnotes(driver);
    }

    @Test
    public void advocatelogicmemberTest() throws InterruptedException, ParseException {
        CaochLogin.setUp(); // Call the setUp method of CaochLogin to initialize loginPage
        CaochLogin.testCoachLogin();

        // Access the Schedule Event page
        memberlogicPage.staffnotes();
    
        // Add actions to schedule an event (enter event details, date, etc.)
        // Add assertions or verifications for successful event scheduling
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
    }
}
