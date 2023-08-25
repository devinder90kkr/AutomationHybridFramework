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
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // This method runs when a test method succeeds
        System.out.println("Test method passed: " + result.getName());

        // Log test status and messages using the ExtentTest instance
        test.log(Status.PASS, "Test Passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // This method runs when a test method fails
        System.out.println("Test method failed: " + result.getName());

        // Log test status and messages using the ExtentTest instance
        test.log(Status.FAIL, "Test Failed: " + result.getName());

        // Capture and attach a screenshot here if needed
    }

    // Implement other methods like onTestSkipped, onTestFinish, etc. as needed
}
