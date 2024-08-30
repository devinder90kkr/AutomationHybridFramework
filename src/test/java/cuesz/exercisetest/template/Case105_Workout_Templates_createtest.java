 package cuesz.exercisetest.template;

import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureServeRunner;
import cuesz.allure.reporting.AllureUtils;
import cuesz.exercise.template.Case105_Workout_Templates_create;
import cuesz.factory.WebDriverManager;
import cuesz.logintest.CoachLogin;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import java.util.Properties;


@Epic ("Exercise Workout templates")
@Feature ("Workout Creation from coach panel")
public class Case105_Workout_Templates_createtest {
    private WebDriver driver;
    private CoachLogin coachLogin;
    private Case105_Workout_Templates_create WorkouttemplatePage;
    

    @BeforeClass
    public void setUp() {
    	// Read the browser information from the configuration file
        String browser = getBrowserFromConfigFile();
        // Set up WebDriverManager with the specified browser
        driver = WebDriverManager.getDriver(browser);
        
        driver.manage().window().maximize();
        coachLogin = new CoachLogin(); // Initialise the advocateLogin object
        WorkouttemplatePage = new Case105_Workout_Templates_create(driver);

    }
    
    @Test
    
    @Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)     
    @Description("Advocate schdules and creates an event")
    @Story("Schdule Events")
    public void workoutemplate() throws InterruptedException {
    	coachLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
    	coachLogin.testCoachLogin();
    	
    	
    	try {
            WorkouttemplatePage.Createworkout();
        } catch (SkipException e) {
            System.out.println(e.getMessage());
        }

        
        // Generate a dynamic link based on some runtime conditions or data
        String dynamicLink = generateDynamicLink();

        // Add the dynamic link to the Allure report
        Allure.link("Case01_createventtest", dynamicLink);
    
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case101_Workouttest_Templates_leadcoach");
        Allure.step("Step Details");
        
        // Retrieve OS information
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");

        // Include OS information in the test class description
        Allure.description("Operating System: " + osName + " (Version: " + osVersion + ")");
        
    }
   
 private String generateDynamicLink() {
        
        return "https://pre-staging.app.cuesz.com/templates"; // Replace with your actual dynamic link
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