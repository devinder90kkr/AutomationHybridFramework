package cuesz.logictest.advocate;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz.logicpage.Case34_MSL_MemberBasicinfo;
import cuesz.logintest.AdvocateLogin;
import cuesz.utils.AllureUtils;
import cuesz.utils.WebDriverManager;
import io.qameta.allure.*;

@Epic ("Member Basic page")
@Feature ("Update profile info")

public class Case34_MSL_MemberBasicinfotest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case34_MSL_MemberBasicinfo memberlogicPage;

    private ByteArrayOutputStream consoleOutput; // To capture console output

    @BeforeClass
    
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialise the advocateLogin object
        memberlogicPage = new Case34_MSL_MemberBasicinfo(driver);

     // Redirect console output to capture it
        consoleOutput = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(consoleOutput);
        System.setOut(printStream);
    }

    @Test
    @Description("navigation to logic page for member summary")
    @Story("Automate member basic detail such as popup related to gym, partner etc")
    public void advocatelogicmemberTest() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();	

        // Access the Schedule Event page
        memberlogicPage.Basicinfo();
    
     // Capture console logs
        String consoleLogs = consoleOutput.toString();
        System.out.println(consoleLogs); // Print console logs to console (optional)
        
        // Log console logs in Allure
        Allure.addAttachment("Console Output", "text/plain", consoleLogs);
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
        Allure.step("Step Details");
    
    }

    @AfterClass
    public void tearDown() {
    	WebDriverManager.quitDriver();
    }
}
