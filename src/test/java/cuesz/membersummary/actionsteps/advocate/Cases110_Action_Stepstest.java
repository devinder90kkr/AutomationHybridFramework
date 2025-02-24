 package cuesz.membersummary.actionsteps.advocate;

import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

// import cuesz.allure.reporting.AllureServeRunner;
import cuesz.allure.reporting.AllureUtils;
import cuesz.factory.WebDriverManager;
import cuesz.logintest.AdvocateLogin;
import cuesz.membersummary.actionsteps.Cases110_Action_Steps_delete;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import java.util.Properties;


@Epic ("Action steps advocate themselves")
@Feature ("Action steps functionality")
public class Cases110_Action_Stepstest {
    private WebDriver driver;
    private AdvocateLogin advocateLogin;
    private Cases110_Action_Steps_delete actionstep;
    

    @BeforeClass
    public void setUp() {
    	// Read the browser information from the configuration file
        String browser = getBrowserFromConfigFile();
        // Set up WebDriverManager with the specified browser
        driver = WebDriverManager.getDriver(browser);
        
        driver.manage().window().maximize();
        advocateLogin = new AdvocateLogin(); // Initialise the advocateLogin object
        actionstep = new Cases110_Action_Steps_delete(driver);

    }
    
    @Test
    
    @Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)     
    @Description("Advocate verify action steps functionlaity")
    @Story("Action Steps")
    public void Actionsteps() throws InterruptedException {
    	advocateLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
        advocateLogin.testAdvocateLogin();
    	
        actionstep.actionsteps();
          
        // Generate a dynamic link based on some runtime conditions or data
        String dynamicLink = generateDynamicLink();

        // Add the dynamic link to the Allure report
        Allure.link("Case01_createventtest", dynamicLink);
    
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Cases110_Action_Stepstest");
        Allure.step("Step Details");
        
        // Retrieve OS information
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");

        // Include OS information in the test class description
        Allure.description("Operating System: " + osName + " (Version: " + osVersion + ")");
        
    }
   
 private String generateDynamicLink() {
        
        return "https://ddzyg3vutpr4b.cloudfront.net/dashboard"; // Replace with your actual dynamic link
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
    	 if (driver != null) {
             driver.quit();
    	WebDriverManager.quitDriver();
    	 // Run the Allure serve command
//        AllureServeRunner.runAllureServe();
       
    }
}}