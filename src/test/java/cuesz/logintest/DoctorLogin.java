package cuesz.logintest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz.pages.Loginpage;
import cuesz.utils.Configuration;
import cuesz.utils.WebDriverManager;

public class DoctorLogin {
	private WebDriver driver;
    private Loginpage loginPage;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        driver.get(Configuration.BASE_URL);
        loginPage = new Loginpage(driver);
    }

    @Test
    public void testDoctorLogin() {
        loginPage.login("manan@yopmail.com", "User!234");
        
        // Add assertions or verifications for the Doctor role
    }
    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
    }
}


