// package testscripts.case16_exercisetest.template;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import org.openqa.selenium.WebDriver;
//import org.testng.SkipException;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import allureframework.AllureUtils;
//import exercise.template.Case101_Workout_Templates;
//import factory.WebDriverManager;
//import logintest.NonleadCoachLogin;
//import io.qameta.allure.Allure;
//import io.qameta.allure.Description;
//import io.qameta.allure.Epic;
//import io.qameta.allure.Feature;
//import io.qameta.allure.Owner;
//import io.qameta.allure.Severity;
//import io.qameta.allure.SeverityLevel;
//import io.qameta.allure.Story;
//import java.util.Properties;
//
//
//@Epic ("Exercise Workout templates")
//@Feature ("Workout Creation from coach panel")
//public class Case102_Workouttest_Templates_nonleadcoach {
//    private WebDriver driver;
//    private NonleadCoachLogin nonleadCoachLogin;
//    private Case101_Workout_Templates WorkouttemplatePage;
//    
//
//    @BeforeClass
//    public void setUp() {
//    	// Read the browser information from the configuration file
//        String browser = getBrowserFromConfigFile();
//        // Set up WebDriverManager with the specified browser
//        driver = WebDriverManager.getDriver(browser);
//        
//        driver.manage().window().maximize();
//        nonleadCoachLogin = new NonleadCoachLogin(); // Initialise the advocateLogin object
//        WorkouttemplatePage = new Case101_Workout_Templates(driver);
//
//    }
//    
//    @Test
//    
//    @Owner("QA") // Add the @Owner annotation to specify the executor
//    @Severity(SeverityLevel.NORMAL)     
//    @Description("Advocate schdules and creates an event")
//    @Story("Schdule Events")
//    public void workoutemplate() throws InterruptedException {
//    	nonleadCoachLogin.setUp(); // Call the setUp method of AdvocateLogin to initialise loginPage
//    	nonleadCoachLogin.testnonCoachLogin();
//    	
//    	
//    	try {
//            WorkouttemplatePage.Workouttemplate();
//        } catch (SkipException e) {
//            System.out.println(e.getMessage());
//        }
//
//        
//        // Generate a dynamic link based on some runtime conditions or data
//        String dynamicLink = generateDynamicLink();
//
//        // Add the dynamic link to the Allure report
//        Allure.link("Case01_createventtest", dynamicLink);
//    
//        // Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "Case102_Workouttest_Templates_nonleadcoach");
//        Allure.step("Step Details");
//        
//        // Retrieve OS information
//        String osName = System.getProperty("os.name");
//        String osVersion = System.getProperty("os.version");
//
//        // Include OS information in the test class description
//        Allure.description("Operating System: " + osName + " (Version: " + osVersion + ")");
//        
//    }
//   
// private String generateDynamicLink() {
//        
//        return "https://pre-staging.app.com/templates"; // Replace with your actual dynamic link
//    }
// private String getBrowserFromConfigFile() {
//     Properties properties = new Properties();
//     try (FileInputStream fis = new FileInputStream("config.properties")) {
//         properties.load(fis);
//     } catch (IOException e) {
//         e.printStackTrace();
//     }
//     return properties.getProperty("browser", "chrome");
// }
// 
//    @AfterClass
//    public void tearDown() {
//    	 if (driver != null) {
//             driver.quit();
//    	WebDriverManager.quitDriver();
//    	 // Run the Allure serve command
////        AllureServeRunner.runAllureServe();
//       
//    }
//}}

package testscripts.case16_exercisetest.template;

import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import allureframework.AllureUtils;
import feature.case16_exercisetemplate.Case101_Workout_Templates;
import factory.WebDriverManager;
import logintest.NonleadCoachLogin;
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
public class Case102_Workouttest_Templates_nonleadcoach {
    private WebDriver driver;
    private NonleadCoachLogin nonleadCoachLogin;
    private Case101_Workout_Templates WorkouttemplatePage;

    @BeforeClass
    public void setUp() {
        String browser = getBrowserFromConfigFile();
        driver = WebDriverManager.getDriver(browser);
        driver.manage().window().maximize();
        nonleadCoachLogin = new NonleadCoachLogin();
        WorkouttemplatePage = new Case101_Workout_Templates(driver);
    }

    @Test
    @Owner("QA")
    @Severity(SeverityLevel.NORMAL)
    @Description("Advocate schedules and creates an event")
    @Story("Schedule Events")
    public void workoutemplate() throws InterruptedException {
        nonleadCoachLogin.setUp();
        nonleadCoachLogin.testnonCoachLogin();

        try {
            WorkouttemplatePage.Workouttemplate();
        } catch (SkipException e) {
            System.out.println(e.getMessage());
        }

        String dynamicLink = generateDynamicLink();
        Allure.link("Case01_createventtest", dynamicLink);
        AllureUtils.captureScreenshot(driver, "Case102_Workouttest_Templates_nonleadcoach");
        Allure.step("Step Details");

        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        Allure.description("Operating System: " + osName + " (Version: " + osVersion + ")");
    }

    private String generateDynamicLink() {
        return "https://pre-staging.app.com/templates";
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
        }
    }
}
