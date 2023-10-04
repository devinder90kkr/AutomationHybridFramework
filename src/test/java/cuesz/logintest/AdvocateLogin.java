package cuesz.logintest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz.pages.Loginpage;
import cuesz.utils.Configuration;
import cuesz.utils.WebDriverManager;
import io.qameta.allure.Allure;

public class AdvocateLogin {    
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
    
    
    public void testAdvocateLogin() {
    	
        loginPage.login("stevecuesz90@gmail.com", "User!234");
        
     // Capture and add login details to Allure report
        String username = "stevecuesz90@gmail.com";
        String password = "User!234";
        Allure.attachment("Login Details", "Username: " + username + "\nPassword: " + password);
        
        
        
    }
}
