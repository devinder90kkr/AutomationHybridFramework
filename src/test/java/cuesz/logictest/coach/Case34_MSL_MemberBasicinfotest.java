package cuesz.logictest.coach;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz.logicpage.Case34_MSL_MemberBasicinfo;
import cuesz.logintest.CoachLogin;
import cuesz.utils.WebDriverManager;

public class Case34_MSL_MemberBasicinfotest {
    private WebDriver driver;
    private CoachLogin CaochLogin;
    private Case34_MSL_MemberBasicinfo memberlogicPage;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        CaochLogin = new CoachLogin(); // Initialize the CaochLogin object
        memberlogicPage = new Case34_MSL_MemberBasicinfo(driver);
    }

    @Test
    public void CoachlogicmemberTest() throws InterruptedException {
        CaochLogin.setUp(); // Call the setUp method of CaochLogin to initialize loginPage
        CaochLogin.testCoachLogin();

        // Access the Schedule Event page
        memberlogicPage.Basicinfo();
    
        // Add actions to schedule an event (enter event details, date, etc.)
        // Add assertions or verifications for successful event scheduling
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
    }
}
