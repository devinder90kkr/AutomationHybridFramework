 package cuesz.liveperform.advocate;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz.liveperform.Case72_creatLiveperform;
import cuesz.logintest.AdvocateLogin;
import cuesz.utils.WebDriverManager;
import cuesz.utils.reporting.AllureUtils;
import io.qameta.allure.*;


@Epic ("Advocate Scheduling")
@Feature ("Event Creation")
public class Case72_creatLiveperformtest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case72_creatLiveperform scheduleEventPage;
    
    private ByteArrayOutputStream consoleOutput; // To capture console output

    @BeforeClass
    public void setUp() {
    	 // Read the browser information from the configuration file
        String browser = getBrowserFromConfigFile();

        // Set up WebDriverManager with the specified browser
        driver = WebDriverManager.getDriver(browser);
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialise the advocateLogin object
        scheduleEventPage = new Case72_creatLiveperform(driver);

     // Redirect console output to capture it
        consoleOutput = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(consoleOutput);
        System.setOut(printStream); 
    }
    
    @Test
    
    @Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)     
    @Description("Advocate schdules and creates an event")
    @Story("Schdule Events")
    public void advocateSchedulecreateeventTest() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();

        // Access the Schedule Event page
        scheduleEventPage.Schdulevent();
 
        // Generate a dynamic link based on some runtime conditions or data
        String dynamicLink = generateDynamicLink();

        // Add the dynamic link to the Allure report
        Allure.link("Case72_creatLiveperformtest", dynamicLink);
    
        // Capture console logs
        String consoleLogs = consoleOutput.toString();
        System.out.println(consoleLogs); // Print console logs to console (optional)
        
        // Log console logs in Allure
        Allure.addAttachment("Console Output", "text/plain", consoleLogs);
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case72_creatLiveperformtest");
        Allure.step("Step Details");
        
        // Retrieve OS information
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");

        // Include OS information in the test class description
        Allure.description("Operating System: " + osName + " (Version: " + osVersion + ")");
        
    }
    
 private String generateDynamicLink() {
        
        return "https://pre-staging.app.cuesz.com/schedule-master"; // Replace with your actual dynamic link
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