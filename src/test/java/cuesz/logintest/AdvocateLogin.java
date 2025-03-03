package cuesz.logintest;

// import java.io.IOException;
// import java.util.Properties;
// import java.io.FileInputStream;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz.base.BaseTest;
import cuesz.pages.Loginpage;
import cuesz.utils.Config;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;

public class AdvocateLogin extends BaseTest {
    private Loginpage loginPage;
    private String advocateEmail;
    private String advocatePassword;

    @BeforeClass
    public void setUp() {
        super.setUp();
        driver.get(Config.getProperty("BASE_URL"));
        loginPage = new Loginpage(driver);
        advocateEmail = Config.getProperty("advocatemail");
        advocatePassword = Config.getProperty("advocatepassword");
    }

    @Test
    @Step("Login as Advocate")
    public void testAdvocateLogin() {
        networkLogs.append("=== Starting Login Test ===\n\n");
        
        loginPage.login(advocateEmail, advocatePassword);
        logger.info("Logged in with email: {}", advocateEmail);
            
        // Wait longer for network calls to complete
        try {
            Thread.sleep(5000); // Increased wait time to 5 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        // Add login details to Allure
        Allure.attachment("Login Details", "Username: " + advocateEmail + "\nPassword: " + advocatePassword);
    }
}
