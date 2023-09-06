package cuesz.membersummary.fuelreport.advocate;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import cuesz.logintest.AdvocateLogin;
import cuesz.membersummary.fuelreport.Case67_Fueldashboard;
import cuesz.utils.AllureUtils;
import cuesz.utils.WebDriverManager;

import io.qameta.allure.*;

@Epic ("Cuesz Staff on Fuel report page")
@Feature ("Assign recomended fuel details to member")

public class Case67_Fueldashboardtest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case67_Fueldashboard  membersummarygraphPage;
    
    private ByteArrayOutputStream consoleOutput; // To capture console output
    

    @BeforeClass
    public void setUp() {
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialize the advocateLogin object
        membersummarygraphPage = new Case67_Fueldashboard (driver); 
        
        // Redirect console output to capture it
        consoleOutput = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(consoleOutput);
        System.setOut(printStream);  
               
    }

    @Test
    
    @Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)    
    @Description("Verify the functionality is staff able to access cards selection")
    @Story("Successfuly Cards update for member in fuels")
    
    public void advocateMemberhoverTest() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();

        // Access the graphs page
        membersummarygraphPage.fuelreport();
        
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
        
        return "https://pre-staging.app.cuesz.com/member-specs/627d168e40231fb0ba6a057a/fuel"; // Replace with your actual dynamic link
    }
    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
       
    }
}
