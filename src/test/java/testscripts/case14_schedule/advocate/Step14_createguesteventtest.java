 package testscripts.case14_schedule.advocate;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import allureframework.AllureUtils;
import factory.WebDriverManager;
import logintest.AdvocateLogin;
import feature.case14_schedule.Step14_creatguestevent;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


@Epic ("Advocate guest Scheduling")
@Feature ("Event guest Creation")
public class Step14_createguesteventtest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Step14_creatguestevent scheduleEventPage;
    
    private ByteArrayOutputStream consoleOutput; // To capture console output
    private List<Integer> statusCodes; // To store HTTP status codes

    @BeforeClass
    public void setUp() {
    	// Read the browser information from the configuration file
        String browser = getBrowserFromConfigFile();
        // Set up WebDriverManager with the specified browser
        driver = WebDriverManager.getDriver(browser);
        
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialise the advocateLogin object
        scheduleEventPage = new Step14_creatguestevent(driver);

     // Redirect console output to capture it
        consoleOutput = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(consoleOutput);
        System.setOut(printStream); 
        
        // Initialize the list to store status codes
        statusCodes = new ArrayList<>();
    }
    
    @Test
    
    @Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)     
    @Description("Advocate schdules guest event for member")
    @Story("Schdule guest Events")
    public void advocateSchedulecreateeventTest() throws InterruptedException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();

        // Access the Schedule Event page
        scheduleEventPage.Schdulguestevent();
        
        // Capture the HTTP status code
        int statusCode = captureHttpStatusCode();

     // Log the status code in Allure
        statusCodes.add(statusCode);
 
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
    private int captureHttpStatusCode() {
        // Implement code to capture the HTTP status code from your application
        // For example, you can extract it from a response object or using Selenium WebDriver
        // Replace the following line with your actual code
        return 200; // Replace with the actual code to capture the status code
    }
 private String generateDynamicLink() {
        
        return "https://pre-staging.app.com/schedule-master"; // Replace with your actual dynamic link
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
    	// Log all captured status codes in Allure
        Allure.step("All HTTP Status Codes: " + statusCodes);
        WebDriverManager.quitDriver();
       
    }
}