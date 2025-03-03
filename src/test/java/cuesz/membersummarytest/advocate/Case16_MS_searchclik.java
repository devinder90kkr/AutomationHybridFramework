package cuesz.membersummarytest.advocate;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.base.BaseTest;
import cuesz.logintest.AdvocateLogin;
import cuesz.membersummary.basic.Case16_MS_searchclick;
import io.qameta.allure.*;

@Epic("Cuesz Staff on member Summary page")
@Feature("Verify on member summary page search working as per keyword.")

public class Case16_MS_searchclik extends BaseTest {
    private AdvocateLogin advocateLogin;
    private Case16_MS_searchclick membersummaryPage;
    private ByteArrayOutputStream consoleOutput;
    private List<Integer> statusCodes;

    @BeforeClass
    @Override
    public void setUp() {
        super.setUp();
        advocateLogin = new AdvocateLogin();
        membersummaryPage = new Case16_MS_searchclick(driver);
        
        // Initialize network tracking
        consoleOutput = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(consoleOutput);
        System.setOut(printStream);
        
        // Initialize the list to store status codes
        statusCodes = new ArrayList<>();
    }

    @Test
    @Owner("QA")
    @Severity(SeverityLevel.NORMAL)    
    @Description("Verify the search feature functionlaity as per member keyword name.")
    @Story("Successfuly able to search as per member name")
    public void advocatemembersearchTest() throws InterruptedException {
        networkLogs.append("=== Starting Complete Test Flow ===\n\n");
        
        advocateLogin.setUp();
        advocateLogin.testAdvocateLogin();

        // Access the Schedule Event page
        membersummaryPage.MemberSummary();
        
        // Capture the HTTP status code
        int statusCode = captureHttpStatusCode();
        
        // Log the status code in Allure
        statusCodes.add(statusCode);
        
        // Generate a dynamic link based on some runtime conditions or data
        String dynamicLink = generateDynamicLink();

        // Add the dynamic link to the Allure report
        Allure.link("Case16_MS_searchclik", dynamicLink);
    
        // Capture console logs
        String consoleLogs = consoleOutput.toString();
        System.out.println(consoleLogs);
        
        // Log console logs in Allure
        Allure.addAttachment("Console Output", "text/plain", consoleLogs);
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case16_MS_searchclik");
        Allure.step("Step Details");
        
        // Retrieve OS information
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");

        // Include OS information in the test class description
        Allure.description("Operating System: " + osName + " (Version: " + osVersion + ")");
    }
    
    private int captureHttpStatusCode() {
        // Implement code to capture the HTTP status code from your application
        return 200; // Replace with the actual code to capture the status code
    }
    
    private String generateDynamicLink() {
        return "https://pre-staging.app.cuesz.com/member-summary";
    }

    @AfterClass
    @Override
    public void tearDown() {
        // Log all captured status codes in Allure
        Allure.step("All HTTP Status Codes: " + statusCodes);
        super.tearDown();
    }
}