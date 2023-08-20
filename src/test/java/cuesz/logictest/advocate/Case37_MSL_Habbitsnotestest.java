package cuesz.logictest.advocate;

import java.text.ParseException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz.logicpage.Case37_MSL_Habbitsnotes;
import cuesz.logintest.AdvocateLogin;
import cuesz.utils.WebDriverManager;

public class Case37_MSL_Habbitsnotestest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case37_MSL_Habbitsnotes memberlogicPage;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialise the advocateLogin object
        memberlogicPage = new Case37_MSL_Habbitsnotes(driver);
    }

    @Test
    public void advocatelogicmemberTest() throws InterruptedException, ParseException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();

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
