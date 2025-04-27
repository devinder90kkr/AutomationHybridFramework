package testscripts.case02_flipkartwindowtest;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import logintest.AdvocateLogin;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import allureframework.AllureServeRunner;
import allureframework.AllureUtils;
import base.BaseTest;
import feature.case02_windowhandel.case01_flipkartwindow;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

@Epic("Advocate dashboard cases")
@Feature("Verify navigation for dashboard.")
public class case01_flipkarwindowtest extends BaseTest {
    private AdvocateLogin advocateLogin;
    private case01_flipkartwindow dashboardPage;
    

    @BeforeClass
    public void setUp() {
        super.setUp();
        advocateLogin = new AdvocateLogin();
        dashboardPage = new case01_flipkartwindow(driver);
        
    }

    @Test
    @Owner("QA")
    @Severity(SeverityLevel.NORMAL)
    @Description("flipkar window test")
    @Story("flipkar window test")
    public void flipkartwindowtest() throws InterruptedException, IOException, ExecutionException {
        networkLogs.append("=== Starting Complete Test Flow ===\n\n");
        
        advocateLogin.setUp();
        // advocateLogin.testAdvocateLogin();

        // Access the Schedule Event page
        dashboardPage.flipkartwindow();

        // Generate a dynamic link based on some runtime conditions or data
        String dynamicLink = generateDynamicLink();

        // Add the dynamic link to the Allure report
        Allure.link("page link", dynamicLink);

        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "screenshot01");
        Allure.step("Step Details");

        // Retrieve OS information
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");

        // Include OS information in the test class description
        Allure.description("Operating System: " + osName + " (Version: " + osVersion + ")");
    }

    private String generateDynamicLink() {
        // Get the current URL from the WebDriver instance
        String currentUrl = driver.getCurrentUrl();
        return currentUrl;
    }

    @AfterClass
    public void tearDown() {
        super.tearDown();

        // Run the Allure serve command
        AllureServeRunner.runAllureServe();
    }
}
