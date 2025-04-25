package testscripts.case11_memberspecs_logictest.advocate;

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

import allureframework.reporting.AllureUtils;
import factory.WebDriverManager;
import feature.case11_logicpage.Case42_01_MSL_Perform_currentday;
import logintest.AdvocateLogin;
import io.qameta.allure.*;

@Epic ("Cuesz Staff on Logic Page for perform Testing")
@Feature ("Assign recomended perform activity to Member")

public class Case42_01_MSL_Perform_currentdaytest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Case42_01_MSL_Perform_currentday memberlogicPage;
    
    private ByteArrayOutputStream consoleOutput; // To capture console output

    @BeforeClass
    public void setUp() {
    	// Read the browser information from the configuration file
        String browser = getBrowserFromConfigFile();

        // Set up WebDriverManager with the specified browser
        driver = WebDriverManager.getDriver(browser);
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialise the advocateLogin object
        memberlogicPage = new Case42_01_MSL_Perform_currentday(driver);
        
      // Redirect console output to capture it
     consoleOutput = new ByteArrayOutputStream();
     PrintStream printStream = new PrintStream(consoleOutput);
     System.setOut(printStream);
    }

    @Test
    
    @Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify the functionality of the staff advocate's logic page in displaying assign perform activity.")
    @Story(" Successfully assign perform activity for member")
    
    public void advocatelogicmemberTest() throws InterruptedException, ParseException {
        advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();

        // Access the page
        memberlogicPage.Perform();
    
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
        
        return "https://pre-staging.app.com/logic-page/627d168e40231fb0ba6a057a"; // Replace with your actual dynamic link
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
