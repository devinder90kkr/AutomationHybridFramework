 package cuesz.membersummary.userstatstest;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.factory.WebDriverManager;
import cuesz.logintest.AdvocateLogin;
import cuesz.membersummary.userstats.Case85memberstats;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import java.util.Properties;


@Epic ("user-stats")
@Feature ("Review member stats page")
public class Case85memberstatstest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case85memberstats userstatsPage;
    
    private ByteArrayOutputStream consoleOutput; // To capture console output

    @BeforeClass
    public void setUp() {
    	// Read the browser information from the configuration file
        String browser = getBrowserFromConfigFile();
        // Set up WebDriverManager with the specified browser
        driver = WebDriverManager.getDriver(browser);
        
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialise the advocateLogin object
        userstatsPage = new Case85memberstats(driver);

     // Redirect console output to capture it
        consoleOutput = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(consoleOutput);
        System.setOut(printStream); 
        
    }
    
    @Test
    
    @Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)     
    @Description("Advocate review memberstats for the members")
    @Story("Members stats page review for the advocate")
    public void advcoatememberstats() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();

        // Access the Schedule Event page
        userstatsPage.memberstats();
         
        // Generate a dynamic link based on some runtime conditions or data
        String dynamicLink = generateDynamicLink();

        // Add the dynamic link to the Allure report
        Allure.link("Case01_createventtest", dynamicLink);
    
        // Capture console logs
        String consoleLogs = consoleOutput.toString();
        System.out.println(consoleLogs); // Print console logs to console (optional)
        
        // Log console logs in Allure
        Allure.addAttachment("Console Output", "text/plain", consoleLogs);
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case01_createventtest");
        Allure.step("Step Details");
        
        // Retrieve OS information
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");

        // Include OS information in the test class description
        Allure.description("Operating System: " + osName + " (Version: " + osVersion + ")");
        
    }
   
 private String generateDynamicLink() {
        
        return "https://pre-staging.app.cuesz.com/user-stats/627d168e40231fb0ba6a057a"; // Replace with your actual dynamic link
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
          // Quit the driver
    	WebDriverManager.quitDriver();
       
    }
}