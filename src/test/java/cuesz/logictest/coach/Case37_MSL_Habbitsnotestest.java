package cuesz.logictest.coach;

import java.text.ParseException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz.logicpage.Case37_MSL_Habbitsnotes;
import cuesz.logintest.CoachLogin;
import cuesz.utils.WebDriverManager;

public class Case37_MSL_Habbitsnotestest {
    private WebDriver driver;
    private CoachLogin CaochLogin;
    private Case37_MSL_Habbitsnotes memberlogicPage;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        CaochLogin = new CoachLogin(); // Initialize the CaochLogin object
        memberlogicPage = new Case37_MSL_Habbitsnotes(driver);
    }

    @Test
    public void advocatelogicmemberTest() throws InterruptedException, ParseException {
        CaochLogin.setUp(); // Call the setUp method of CaochLogin to initialize loginPage
        CaochLogin.testCoachLogin();
        
        // Access the Schedule Event page
        memberlogicPage.habbitsnotes();
    
        // Add actions to schedule an event (enter event details, date, etc.)
        // Add assertions or verifications for successful event scheduling
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
    }
}
