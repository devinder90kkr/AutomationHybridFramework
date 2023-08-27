package cuesz.com.testcomponents;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import cuesz.utils.ExtentManager;

public class Listeners implements ITestListener {

    private ExtentTest test; // Declare an ExtentTest instance

    @Override
    public void onStart(ITestContext context) {
        // This method runs before the test suite starts
        System.out.println("Test suite started: " + context.getSuite().getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        // This method runs after the test suite finishes
        System.out.println("Test suite finished: " + context.getSuite().getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        // This method runs when a test method starts
        System.out.println("Test method started: " + result.getName());

        // Create a new ExtentTest instance for the current test method
        test = ExtentManager.getInstance().createTest(result.getMethod().getMethodName());

        // Log environment information here
        logEnvironmentInfo();
    }

    private void logEnvironmentInfo() {
        // Log environment information with color-coded status
        test.log(Status.INFO, "<b>Browser:</b> " + getBrowserInfo());
        test.log(Status.INFO, "<b>Operating System:</b> " + getOperatingSystemInfo());
        // Add more environment details as needed
    }

    private String getBrowserInfo() {
        // Logic to retrieve the browser information (e.g., from WebDriver)
        return "Chrome 91"; // Example value
    }

    private String getOperatingSystemInfo() {
        // Logic to retrieve the operating system information (e.g., from Java properties)
        return System.getProperty("os.name") + " " + System.getProperty("os.version");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // This method runs when a test method succeeds
        System.out.println("Test method passed: " + result.getName());

        // Log test status and messages using the ExtentTest instance with color-coded status
        test.log(Status.PASS, "<font color=\"green\"><b>Test Passed:</b></font> " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // This method runs when a test method fails
        System.out.println("Test method failed: " + result.getName());

        // Log test status and messages using the ExtentTest instance with color-coded status
        test.log(Status.FAIL, "<font color=\"red\"><b>Test Failed:</b></font> " + result.getName());

        // Capture and attach a screenshot here if needed
    }

    // Implement other methods like onTestSkipped, onTestFinish, etc. as needed
}
