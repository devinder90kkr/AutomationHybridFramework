package cuesz.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static ExtentReports extent;
    private static String reportFileName = "ExtentReport.html";
    private static String fileSeparator = System.getProperty("file.separator");
    private static String reportFilepath = System.getProperty("user.dir") + fileSeparator + "test-output" + fileSeparator + "extentReports";

    public static ExtentReports getInstance() {
        if (extent == null)
            createInstance();
        return extent;
    }

    // Create an ExtentReports instance
    private static ExtentReports createInstance() {
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(reportFilepath + fileSeparator + reportFileName);
        htmlReporter.config().setDocumentTitle("Cuesz Test result");
        htmlReporter.config().setReportName("Cuesz Automation Result");

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        return extent;
    }
}
