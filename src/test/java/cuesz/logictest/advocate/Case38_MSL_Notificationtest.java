package cuesz.logictest.advocate;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.ParseException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz.logicpage.Case38_MSL_Notification;
import cuesz.logintest.AdvocateLogin;
import cuesz.utils.WebDriverManager;
import cuesz.utils.reporting.AllureUtils;
import io.qameta.allure.*;

@Epic ("Cuesz Staff on Logic Page perform habbits Notes Testing")
@Feature ("Member habbits notes details Verification")


public class Case38_MSL_Notificationtest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case38_MSL_Notification memberlogicPage;

    private ByteArrayOutputStream consoleOutput; // To capture console output
    
    @BeforeClass
    public void setUp() {
    	// Read the browser information from the configuration file
        String browser = getBrowserFromConfigFile();

        // Set up WebDriverManager with the specified browser
        driver = WebDriverManager.getDriver(browser);
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialise the advocateLogin object
        memberlogicPage = new Case38_MSL_Notification(driver);
        
        // Redirect console output to capture it
        consoleOutput = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(consoleOutput);
        System.setOut(printStream);
    }

    @Test
    
    @Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify the functionality of the staff advocate's logic page in displaying habbits notes details.")
    @Story(" Successfully added habbits notes for member")
    
    public void advocatelogicmemberTest() throws InterruptedException, ParseException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();

        // Access the page
        memberlogicPage.Notificationnotes();
        
      // Generate a dynamic link based on some runtime conditions or data
        String dynamicLink = generateDynamicLink();

        // Add the dynamic link to the Allure report
        Allure.link("Notification", dynamicLink);
    
        // Capture console logs
        String consoleLogs = consoleOutput.toString();
        System.out.println(consoleLogs); // Print console logs to console (optional)
        
        // Log console logs in Allure
        Allure.addAttachment("Console Output", "text/plain", consoleLogs);
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Notification");
        Allure.step("Step Details");
        
        // Retrieve OS information
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");

        // Include OS information in the test class description
        Allure.description("Operating System: " + osName + " (Version: " + osVersion + ")");
        
    }
    
 private String generateDynamicLink() {
        
        return "https://pre-staging.app.cuesz.com/logic-page/627d168e40231fb0ba6a057a"; // Replace with your actual dynamic link
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
