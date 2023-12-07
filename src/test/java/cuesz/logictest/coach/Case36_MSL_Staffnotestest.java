package cuesz.logictest.coach;

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

import cuesz.logicpage.Case36_MSL_Staffnotes;
import cuesz.logintest.CoachLogin;
import cuesz.utils.AllureUtils;
import cuesz.utils.WebDriverManager;

import io.qameta.allure.*;

@Epic ("Cuesz Staff on Logic Page perform Staff Notes Testing")
@Feature ("Member staff notes details Verification")

public class Case36_MSL_Staffnotestest {
    private WebDriver driver;
    private CoachLogin CaochLogin;
    private Case36_MSL_Staffnotes memberlogicPage;

    private ByteArrayOutputStream consoleOutput; // To capture console output


    @BeforeClass
    public void setUp() {
    	 // Read the browser information from the configuration file
        String browser = getBrowserFromConfigFile();
        // Set up WebDriverManager with the specified browser
        driver = WebDriverManager.getDriver(browser);
        driver.manage().window().maximize();
        CaochLogin = new CoachLogin(); // Initialize the CaochLogin object
        memberlogicPage = new Case36_MSL_Staffnotes(driver);
        
     // Redirect console output to capture it
        consoleOutput = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(consoleOutput);
        System.setOut(printStream);
    }

    @Test
    
    @Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify the functionality of the staff COACH logic page in displaying staff notes details.")
    @Story(" Successfully added staff notes for member")

    public void advocatelogicmemberTest() throws InterruptedException, ParseException {
        CaochLogin.setUp(); // Call the setUp method of CaochLogin to initialize loginPage
        CaochLogin.testCoachLogin();

        // Access the Schedule Event page
        memberlogicPage.staffnotes();
        
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
