package cuesz.listeners;

import io.qameta.allure.Allure;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.ByteArrayInputStream;


public class AllureReportListener implements ITestListener {

    public synchronized void onStart(ITestContext context) {
        System.out.println("Test Suite started!");
    }

    public synchronized void onFinish(ITestContext context) {
        System.out.println(("Test Suite is ending!"));
    }

    public synchronized void onTestStart(ITestResult result) {
        String methodName = result.getMethod().getMethodName();
        System.out.println(methodName + " started!");

        Allure.step("Starting test: " + methodName);
    }

    public synchronized void onTestSuccess(ITestResult result) {
        System.out.println((result.getMethod().getMethodName() + " passed!"));
        Allure.step("Test passed: " + result.getMethod().getMethodName());
    }

    public synchronized void onTestFailure(ITestResult result) {
        System.out.println((result.getMethod().getMethodName() + " failed!"));
        Allure.addAttachment("Screenshot", new ByteArrayInputStream(getScreenshot()));
        Allure.step("Test failed: " + result.getMethod().getMethodName());
    }

    public synchronized void onTestSkipped(ITestResult result) {
        System.out.println((result.getMethod().getMethodName() + " skipped!"));
        Allure.step("Test skipped: " + result.getMethod().getMethodName());
    }

    public synchronized void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println(("onTestFailedButWithinSuccessPercentage for " + result.getMethod().getMethodName()));
    }

    private byte[] getScreenshot() {
        // Method to capture screenshot and return bytes
        return new byte[0];
    }
}
