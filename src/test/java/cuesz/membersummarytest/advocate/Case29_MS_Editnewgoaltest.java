package cuesz.membersummarytest.advocate;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz.logintest.AdvocateLogin;
import cuesz.membersummary.Case29_MS_Editnewgoal;
import cuesz.utils.AllureUtils;
import cuesz.utils.WebDriverManager;

import io.qameta.allure.*;

@Epic ("Cuesz Staff on member Summary page for Edit new goal")
@Feature ("Verify on member summary page staff  able to Edit new goal.")

public class Case29_MS_Editnewgoaltest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case29_MS_Editnewgoal membersummaryPage;

    
    private ByteArrayOutputStream consoleOutput; // To capture console output

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialise the advocateLogin object
        membersummaryPage = new Case29_MS_Editnewgoal(driver);
        
        // Redirect console output to capture it
        consoleOutput = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(consoleOutput);
        System.setOut(printStream); 
    }

    @Test
    @Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)    
    @Description("Verify the Edit new goal features functionlaity .")
    @Story("Successfuly able to Edit values for add new goal features")
    
    public void advocateeditgoaltTest() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();

        // Access the Schedule Event page
        membersummaryPage.editgoalclick();
     
        // Generate a dynamic link based on some runtime conditions or data
        String dynamicLink = generateDynamicLink();

        // Add the dynamic link to the Allure report
        Allure.link("Logic page link", dynamicLink);
    
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
    
 private String generateDynamicLink() {
        
        return "https://app.cuesz.com/member-specs/627d168e40231fb0ba6a057a"; // Replace with your actual dynamic link
    }
    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
       
    }
}