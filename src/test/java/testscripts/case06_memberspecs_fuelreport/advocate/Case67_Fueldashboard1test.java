
package testscripts.case06_memberspecs_fuelreport.advocate;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import allureframework.reporting.AllureUtils;
import factory.WebDriverManager;
import logintest.AdvocateLogin;
import feature.case06_memberspecs_fuelreport.Case67_Fueldashboard1;
import io.qameta.allure.*;

@Epic ("Cuesz Staff on Fuel target cards with its related input field")
@Feature ("Verify staff able to access selected cards and inpput fields for member")


public class Case67_Fueldashboard1test {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case67_Fueldashboard1  membersummarygraphPage;
    
    private ByteArrayOutputStream consoleOutput; // To capture console output

    @BeforeClass
    public void setUp() {
    	// Read the browser information from the configuration file
        String browser = getBrowserFromConfigFile();
        // Set up WebDriverManager with the specified browser
        driver = WebDriverManager.getDriver(browser);
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialize the advocateLogin object
        membersummarygraphPage = new Case67_Fueldashboard1 (driver);
        
     // Redirect console output to capture it
        consoleOutput = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(consoleOutput);
        System.setOut(printStream); 
    }

    @Test
    @Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)    
    @Description("Verify the functionality that staff able to access fuel report page.")
    @Story("Successfuly select targets cards and its related input fields for member on fuels report page.")
    
    public void advocateMemberhoverTest() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();

        // Access the graphs page
        membersummarygraphPage.fuelreport();
        
        // Generate a dynamic link based on some runtime conditions or data
        String dynamicLink = generateDynamicLink();

        // Add the dynamic link to the Allure report
        Allure.link("Case67_Fueldashboard1test", dynamicLink);
    
        // Capture console logs
        String consoleLogs = consoleOutput.toString();
        System.out.println(consoleLogs); // Print console logs to console (optional)
        
        // Log console logs in Allure
        Allure.addAttachment("Console Output", "text/plain", consoleLogs);
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case67_Fueldashboard1test");
        Allure.step("Step Details");
        
        // Retrieve OS information
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");

        // Include OS information in the test class description
        Allure.description("Operating System: " + osName + " (Version: " + osVersion + ")");
        
    }
    
 private String generateDynamicLink() {
        
        return "https://pre-staging.app.com/member-specs/627d168e40231fb0ba6a057a/fuel"; // Replace with your actual dynamic link
    }
 private String getBrowserFromConfigFile() {
     Properties properties = new Properties();
     try (FileInputStream fis = new FileInputStream("config.properties")) {
         properties.load(fis);
     } catch (IOException e) {
         e.printStackTrace();
     }
     return properties.getProperty("browser", "chrome");
 }
    @AfterClass
    public void tearDown() {
        WebDriverManager.quitDriver();
       
    }
}
