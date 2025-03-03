package cuesz.base;

import io.qameta.allure.Allure;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.devtools.v85.network.model.Request;
import org.openqa.selenium.devtools.v85.network.model.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import cuesz.factory.WebDriverManager;

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

public class BaseTest {
    protected static final Logger logger = LoggerFactory.getLogger(BaseTest.class);
    protected WebDriver driver;
    protected DevTools devTools;
    protected StringBuilder networkLogs;
    protected String lastPreviewInfo;
    protected String lastPayloadInfo;
    protected String testName;

    @BeforeClass
    public void setUp() {
        // Get test name from the class
        testName = this.getClass().getSimpleName();
        
        // Initialize network capture
        networkLogs = new StringBuilder();
        lastPreviewInfo = "";
        lastPayloadInfo = "";
        
        // Set up WebDriver
        String browser = getBrowserFromConfigFile();
        driver = WebDriverManager.getDriver(browser);
        driver.manage().window().maximize();
        
        // Set up network capture if using Chrome
        if (driver instanceof ChromeDriver) {
            setupNetworkCapture();
        } else {
            logger.warn("Network capture is only available when using Chrome browser");
        }
    }

    protected void setupNetworkCapture() {
        devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();
        
        // Enable network tracking
        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
        
        String startLog = String.format("=== Starting Network Capture for %s ===\n\n", testName);
        networkLogs.append(startLog);
        logger.info(startLog);

        setupNetworkListeners();
    }

    protected void setupNetworkListeners() {
        // Track request initiation
        devTools.addListener(Network.requestWillBeSent(), request -> {
            Request req = request.getRequest();
            String type = request.getType() != null ? request.getType().toString() : "";
            
            if (isApiRequest(req.getUrl(), type, req.getHeaders().get("content-type").toString())) {
                lastPreviewInfo = String.format(
                    "=== API Request Preview ===\n" +
                    "Test: %s\n" +
                    "Timestamp: %s\n" +
                    "Request ID: %s\n" +
                    "URL: %s\n" +
                    "Method: %s\n",
                    testName,
                    new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()),
                    request.getRequestId().toString(),
                    req.getUrl(),
                    req.getMethod()
                );

                lastPayloadInfo = String.format(
                    "=== Request Payload ===\n" +
                    "Content-Type: %s\n" +
                    "Request Headers: %s\n" +
                    "Request Body: %s\n" +
                    "Request Query Parameters: %s\n",
                    req.getHeaders().get("content-type"),
                    formatHeaders(req.getHeaders()),
                    req.getPostData().orElse("No request body"),
                    req.getUrl().contains("?") ? req.getUrl().split("\\?")[1] : "No query parameters"
                );

                networkLogs.append(lastPreviewInfo).append("\n")
                          .append(lastPayloadInfo).append("\n");
                System.out.println(lastPreviewInfo);
                System.out.println(lastPayloadInfo);
            }
        });

        // Track response headers received
        devTools.addListener(Network.responseReceived(), response -> {
            Response resp = response.getResponse();
            String responseUrl = resp.getUrl();
            String type = response.getType().toString();
            
            if (isApiRequest(responseUrl, type, resp.getMimeType())) {
                String responseInfo = String.format(
                    "=== Response Details ===\n" +
                    "Test: %s\n" +
                    "Timestamp: %s\n" +
                    "Request ID: %s\n" +
                    "URL: %s\n" +
                    "Status: %d\n" +
                    "Status Text: %s\n" +
                    "Type: %s\n" +
                    "MIME Type: %s\n" +
                    "Response Headers: %s\n",
                    testName,
                    new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()),
                    response.getRequestId().toString(),
                    responseUrl,
                    resp.getStatus(),
                    resp.getStatusText(),
                    type,
                    resp.getMimeType(),
                    formatHeaders(resp.getHeaders())
                );
                
                networkLogs.append(responseInfo);
                System.out.println(responseInfo);

                try {
                    String responseBody = devTools.send(Network.getResponseBody(response.getRequestId())).getBody();
                    String formattedBody = formatJsonBody(responseBody);
                    String bodyLog = "=== Response Body ===\n" + formattedBody + "\n";
                    networkLogs.append(bodyLog);
                    System.out.println(bodyLog);
                    
                    Allure.addAttachment(
                        String.format("%s API Traffic - %s", testName, responseUrl),
                        "=== Complete API Call ===\n\n" +
                        "Request Preview:\n" + lastPreviewInfo + "\n" +
                        "Request Payload:\n" + lastPayloadInfo + "\n" +
                        "Response Details:\n" + responseInfo + "\n" +
                        "Response Body:\n" + bodyLog
                    );
                } catch (Exception e) {
                    String error = "Could not get response body: " + e.getMessage() + "\n";
                    networkLogs.append(error);
                    logger.error(error);
                }
                networkLogs.append("=====================\n\n");
            }
        });

        // Track loading failures
        devTools.addListener(Network.loadingFailed(), loadingFailed -> {
            String type = loadingFailed.getType().toString();
            if (isApiRequest(loadingFailed.getRequestId().toString(), type, "")) {
                String errorLog = String.format(
                    "=== Network Error ===\n" +
                    "Test: %s\n" +
                    "Timestamp: %s\n" +
                    "Request ID: %s\n" +
                    "Type: %s\n" +
                    "Error: %s\n",
                    testName,
                    new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()),
                    loadingFailed.getRequestId().toString(),
                    type,
                    loadingFailed.getErrorText()
                );
                networkLogs.append(errorLog).append("=====================\n\n");
                logger.error(errorLog);
            }
        });
    }

    protected void saveNetworkLogs() {
        try {
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String fileName = String.format("%s_network_logs_%s.txt", testName.toLowerCase(), timestamp);
            File networkLogsFile = new File("allure-results/" + fileName);
            networkLogsFile.getParentFile().mkdirs();
            
            networkLogs.append(String.format("\n=== End of Network Capture for %s ===\n", testName));
            
            try (FileWriter writer = new FileWriter(networkLogsFile)) {
                writer.write(networkLogs.toString());
            }
            
            try (FileInputStream fis = new FileInputStream(networkLogsFile)) {
                Allure.addAttachment(String.format("%s Network Logs", testName), "text/plain", fis, ".txt");
            }
            
            logger.info("Network logs saved to: {}", networkLogsFile.getAbsolutePath());
        } catch (IOException e) {
            logger.error("Failed to save network logs: {}", e.getMessage());
        }
    }

    protected boolean isApiRequest(String url, String type, String mimeType) {
        if (mimeType != null && (
            mimeType.contains("css") ||
            mimeType.contains("javascript") ||
            mimeType.contains("font") ||
            mimeType.contains("image") ||
            mimeType.contains("text/html")
        )) {
            return false;
        }

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

        return url.contains("/api/") || 
               url.contains("/graphql") || 
               type.equalsIgnoreCase("XHR") ||
               type.equalsIgnoreCase("Fetch");
    }

    protected String formatHeaders(Object headersObj) {
        try {
            JSONObject headers = new JSONObject(headersObj.toString());
            return headers.toString(2);
        } catch (JSONException e) {
            return headersObj.toString();
        }
    }

    protected String formatJsonBody(String body) {
        try {
            JSONObject json = new JSONObject(body);
            return json.toString(2);
        } catch (JSONException e) {
            return body;
        }
    }

    protected String getBrowserFromConfigFile() {
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

    @AfterClass
    public void tearDown() {
        saveNetworkLogs();
        WebDriverManager.quitDriver();
    }
} 