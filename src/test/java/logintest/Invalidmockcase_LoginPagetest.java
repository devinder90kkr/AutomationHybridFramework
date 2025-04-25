package logintest;

import allureframework.reporting.AllureUtils;
import factory.WebDriverManager;
import base.Loginpage;
import utils.Config;
// import utils.Configuration;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert.ThrowingRunnable;
// import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

public class Invalidmockcase_LoginPagetest {

    private WebDriver driver;
    private Loginpage loginpage;
    private ByteArrayOutputStream consoleOutput; // To capture console output

    @BeforeMethod
    public void setUp() {
    	 // Read the browser information from the configuration file
        String browser = getBrowserFromConfigFile();

        // Set up WebDriverManager with the specified browser
        driver = WebDriverManager.getDriver(browser);
        driver.manage().window().maximize();
        // driver.get(Configuration.BASE_URL);
        driver.get(Config.getProperty("BASE_URL"));
        
     // Redirect console output to capture it
        consoleOutput = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(consoleOutput);
        System.setOut(printStream);
           
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
    @Test(groups = "invalid")
    @Owner("Devinder Kumar") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.BLOCKER)
    @Epic ("Cuesz Staff Login page testing")
    @Description("Test Description : Login Test with invalid email and valid password")
    @Story("Unsuccessful Login to Application")
    public void testLoginWhenInvalidEmailProvidedThenThrowsException() throws InterruptedException {
        driver.findElement(By.name("email")).sendKeys("stevecuesz91@gmail.com");
        driver.findElement(By.name("password")).sendKeys("User!234");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).submit();

        assertThrows(RuntimeException.class, new ThrowingRunnable() {
			@Override
			public void run() throws Throwable {
				loginpage.login("invalid", "password");
			}
		});
        Thread.sleep(3000);
        
        
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

    @Test(groups = "valid")
    @Owner("Devinder Kumar") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Description : Login Test with valid email & password")
    @Story("Successful Login to Application")
    public void testLoginWhenValidEmailAndPasswordProvidedThenInteractsWithWebDriverCorrectly() throws InterruptedException {
        driver.findElement(By.name("email")).sendKeys("markcuesz90@gmail.com");
        driver.findElement(By.name("password")).sendKeys("User!234");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).submit();

        // Verify that the email and password fields were interacted with at least once.
        assert driver.findElement(By.name("email")).isDisplayed();
        assert driver.findElement(By.name("password")).isDisplayed();
        assert driver.findElement(By.xpath("//button[normalize-space()='Login']")).isDisplayed();

        // Verify that the email and password fields were not interacted with more than once.
        assert driver.findElement(By.name("email")).getDomAttribute("value").equals("markcuesz90@gmail.com");
        assert driver.findElement(By.name("password")).getDomProperty("value").equals("User!234");
        Thread.sleep(7000);
        // Click on the "Dashboard - Notification Settings" link.
        driver.findElement(By.id("Dashboard-Notification-Settings")).click();
        // Click on the "Logout" button.
        driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary']")).click();
        
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

    @Test(groups = "invalid")
    @Owner("Devinder Kumar") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test Description : Login Test with valid email &  Invalid password")
    @Story("Unsuccessful Login to Application")
    public void testLoginWhenInvalidPasswordProvidedThenThrowsException() throws InterruptedException {
        driver.findElement(By.name("email")).sendKeys("markcuesz90@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Invalid!23");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).submit();

        assertThrows(RuntimeException.class, new ThrowingRunnable() {
			@Override
			public void run() throws Throwable {
				loginpage.login("test@test.com", "invalid");
			}
		}
        );
        Thread.sleep(7000);
     // Capture console logs
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
   
    
    
    
    
}