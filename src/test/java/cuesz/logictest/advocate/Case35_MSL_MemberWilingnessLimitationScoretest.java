package cuesz.logictest.advocate;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz.logicpage.Case35_MSL_MemberWilingnessLimitationScore;
import cuesz.logintest.AdvocateLogin;
import cuesz.utils.AllureUtils;
import cuesz.utils.WebDriverManager;
import io.qameta.allure.*;
import io.qameta.allure.Owner;

@Epic ("Logic page member basic detail for willingness, limitations, performance score")
@Feature ("Member basic detail for willingness, limitations, performance score")
public class Case35_MSL_MemberWilingnessLimitationScoretest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case35_MSL_MemberWilingnessLimitationScore memberlogicPage;
    private ByteArrayOutputStream consoleOutput; // To capture console output

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialise the advocateLogin object
        memberlogicPage = new Case35_MSL_MemberWilingnessLimitationScore(driver);
        
     // Redirect console output to capture it
        consoleOutput = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(consoleOutput);
        System.setOut(printStream);
        
    }

    @Test
    @Owner("Devinder Kumar") // Add the @Owner annotation to specify the executor
    public void advocatelogicmemberTest() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();

        // Access the Schedule Event page
        memberlogicPage.Basicinfo2();
     // Capture console logs
        String consoleLogs = consoleOutput.toString();
        System.out.println(consoleLogs); // Print console logs to console (optional)
        
        // Log console logs in Allure
        Allure.addAttachment("Console Output", "text/plain", consoleLogs);
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
        Allure.step("Step Details");
        
        // Retrieve OS information
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");

        // Include OS information in the test class description
        Allure.description("Operating System: " + osName + " (Version: " + osVersion + ")");
        
    }

    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
        
    }
}
