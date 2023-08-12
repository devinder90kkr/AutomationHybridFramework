package cuesz.logintest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz.pages.Loginpage;
import cuesz.utils.Configuration;
import cuesz.utils.WebDriverManager;

public class CoachLogin {
	private WebDriver driver;
    private Loginpage loginPage;

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        driver.get(Configuration.BASE_URL);
        loginPage = new Loginpage(driver); // Initialize the loginPage object
    }

    @Test
    public void testCoachLogin() {
        loginPage.login("seak@mailinator.com", "User!234");
        
        
    }
 
}


