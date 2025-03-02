package cuesz.logintest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
import java.util.Properties;

import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.devtools.v85.network.model.Request;
import org.openqa.selenium.devtools.v85.network.model.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz.factory.WebDriverManager;
import cuesz.pages.Loginpage;
import cuesz.utils.Config;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;

public class AdvocateLogin {
    private static final Logger logger = LoggerFactory.getLogger(AdvocateLogin.class);
    private WebDriver driver;
    private Loginpage loginPage;
    private String advocateEmail;
    private String advocatePassword;
    private DevTools devTools;
    private StringBuilder networkLogs;

    @BeforeClass
    public void setUp() {
        networkLogs = new StringBuilder();
        String browser = getBrowserFromConfigFile();
        driver = WebDriverManager.getDriver(browser);
        
        if (driver instanceof ChromeDriver) {
            devTools = ((ChromeDriver) driver).getDevTools();
            devTools.createSession();
            
            // Enable network tracking with all features
            devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
            
            String startLog = "=== Starting Network Capture ===\n\n";
            networkLogs.append(startLog);
            logger.info(startLog);

            // Track request initiation
            devTools.addListener(Network.requestWillBeSent(), request -> {
                Request req = request.getRequest();
                String type = request.getType() != null ? request.getType().toString() : "";
                
                if (isApiRequest(req.getUrl(), type, req.getHeaders().get("content-type").toString())) {
                    String requestInfo = String.format(
                        "=== Network Request ===\n" +
                        "Timestamp: %s\n" +
                        "Request ID: %s\n" +
                        "URL: %s\n" +
                        "Method: %s\n" +
                        "Headers: %s\n" +
                        "Post Data: %s\n",
                        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()),
                        request.getRequestId().toString(),
                        req.getUrl(),
                        req.getMethod(),
                        formatHeaders(req.getHeaders()),
                        req.getPostData().orElse("No post data")
                    );
                    networkLogs.append(requestInfo).append("\n");
                    System.out.println(requestInfo);
                }
            });

            // Track response headers received
            devTools.addListener(Network.responseReceived(), response -> {
                Response resp = response.getResponse();
                String responseUrl = resp.getUrl();
                String type = response.getType().toString();
                
                if (isApiRequest(responseUrl, type, resp.getMimeType())) {
                    String networkInfo = String.format(
                        "=== Network Response ===\n" +
                        "Timestamp: %s\n" +
                        "Request ID: %s\n" +
                        "URL: %s\n" +
                        "Status: %d\n" +
                        "Status Text: %s\n" +
                        "Type: %s\n" +
                        "MIME Type: %s\n" +
                        "Headers: %s\n",
                        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()),
                        response.getRequestId().toString(),
                        responseUrl,
                        resp.getStatus(),
                        resp.getStatusText(),
                        type,
                        resp.getMimeType(),
                        formatHeaders(resp.getHeaders())
                    );
                    
                    networkLogs.append(networkInfo);
                    System.out.println(networkInfo);

                    try {
                        String responseBody = devTools.send(Network.getResponseBody(response.getRequestId())).getBody();
                        String formattedBody = formatJsonBody(responseBody);
                        String bodyLog = "Response Body:\n" + formattedBody + "\n";
                        networkLogs.append(bodyLog);
                        System.out.println(bodyLog);
                        
                        Allure.addAttachment(
                            "API Traffic - " + responseUrl,
                            networkInfo + bodyLog
                        );
                    } catch (Exception e) {
                        String error = "Could not get response body: " + e.getMessage() + "\n";
                        networkLogs.append(error);
                        logger.error(error);
                    }
                    networkLogs.append("=====================\n\n");
                }
            });

            // Track loading failures for API calls
            devTools.addListener(Network.loadingFailed(), loadingFailed -> {
                String type = loadingFailed.getType().toString();
                if (isApiRequest(loadingFailed.getRequestId().toString(), type, "")) {
                    String errorLog = String.format(
                        "=== Network Error ===\n" +
                        "Timestamp: %s\n" +
                        "Request ID: %s\n" +
                        "Type: %s\n" +
                        "Error: %s\n",
                        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()),
                        loadingFailed.getRequestId().toString(),
                        type,
                        loadingFailed.getErrorText()
                    );
                    networkLogs.append(errorLog).append("=====================\n\n");
                    logger.error(errorLog);
                }
            });
        } else {
            logger.warn("Network capture is only available when using Chrome browser");
        }

        driver.manage().window().maximize();
        driver.get(Config.getProperty("BASE_URL"));
        loginPage = new Loginpage(driver);
        advocateEmail = Config.getProperty("advocatemail");
        advocatePassword = Config.getProperty("advocatepassword");
    }

    @Test
    @Step("Login as Advocate")
    public void testAdvocateLogin() {
        networkLogs.append("=== Starting Login Test ===\n\n");
        
        loginPage.login(advocateEmail, advocatePassword);
        logger.info("Logged in with email: {}", advocateEmail);
        
        // Wait longer for network calls to complete
        try {
            Thread.sleep(5000); // Increased wait time to 5 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        // Save network logs to file and attach to Allure
        try {
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String fileName = "network_logs_" + timestamp + ".txt";
            File networkLogsFile = new File("allure-results/" + fileName);
            networkLogsFile.getParentFile().mkdirs();
            
            // Add final log entry
            networkLogs.append("\n=== End of Network Capture ===\n");
            
            try (FileWriter writer = new FileWriter(networkLogsFile)) {
                writer.write(networkLogs.toString());
            }
            
            // Attach file to Allure report
            try (FileInputStream fis = new FileInputStream(networkLogsFile)) {
                Allure.addAttachment("Complete Network Logs", "text/plain", fis, ".txt");
            }
            
            logger.info("Network logs saved to: {}", networkLogsFile.getAbsolutePath());
        } catch (IOException e) {
            logger.error("Failed to save network logs: {}", e.getMessage());
        }
        
        // Add login details to Allure
        Allure.attachment("Login Details", "Username: " + advocateEmail + "\nPassword: " + advocatePassword);
    }

    private String getBrowserFromConfigFile() {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            properties.load(fis);
        } catch (IOException e) {
            String error = "Error reading config file: " + e.getMessage();
            System.err.println(error);
            logger.error(error);
            return "chrome";
        }
        return properties.getProperty("browser", "chrome");
    }

    private boolean isApiRequest(String url, String type, String mimeType) {
        // First, exclude common static resource types
        if (mimeType != null && (
            mimeType.contains("css") ||
            mimeType.contains("javascript") ||
            mimeType.contains("font") ||
            mimeType.contains("image") ||
            mimeType.contains("text/html")
        )) {
            return false;
        }

        // Exclude specific URLs and tracking/analytics services
        if (url.contains("cloudflare") ||
            url.contains(".css") ||
            url.contains(".js") ||
            url.contains(".png") ||
            url.contains(".svg") ||
            url.contains(".woff") ||
            url.contains(".ttf") ||
            url.contains("fonts.googleapis.com") ||
            url.contains("sentry.io") ||
            url.contains("mixpanel.com") ||
            url.contains("/api/sentry") ||
            url.contains("/api/mixpanel")) {
            return false;
        }

        // Include only API and GraphQL endpoints
        return url.contains("/api/") || 
               url.contains("/graphql") || 
               type.equalsIgnoreCase("XHR") ||
               type.equalsIgnoreCase("Fetch");
    }

    private String formatHeaders(Object headersObj) {
        try {
            JSONObject headers = new JSONObject(headersObj.toString());
            return headers.toString(2); // Pretty print with 2 space indentation
        } catch (JSONException e) {
            return headersObj.toString();
        }
    }

    private String formatJsonBody(String body) {
        try {
            JSONObject json = new JSONObject(body);
            return json.toString(2); // Pretty print with 2 space indentation
        } catch (JSONException e) {
            return body; // Return original if not valid JSON
        }
    }
}
