//package cuesz.utils;
//
//import java.util.Map;
//import java.util.Optional;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.DevTools;
//import org.openqa.selenium.devtools.v115.network.Network;
//import org.openqa.selenium.devtools.v115.network.model.ResponseReceived;
//
//public class XHRResponseCaptureUtils {
//    public static void captureXHRResponses(WebDriver driver) {
//        if (!(driver instanceof ChromeDriver)) {
//            throw new IllegalArgumentException("The provided WebDriver instance is not a ChromeDriver.");
//        }
//        ChromeDriver chromeDriver = (ChromeDriver) driver;
//        DevTools devTools = chromeDriver.getDevTools();
//        devTools.createSession();
//        // Enable the Network domain to capture network events with the XHR filter
//        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
//        // Add listener for XHR responses
//        devTools.addListener(Network.responseReceived(), response -> {
//            ResponseReceived responseReceived = (ResponseReceived) response;
//            // Extract relevant information from the XHR response
//            String requestId = responseReceived.getRequestId().toString();
//            String url = responseReceived.getResponse().getUrl();
//            int status = responseReceived.getResponse().getStatus();
//            Map<String, Object> headers = responseReceived.getResponse().getHeaders();
//            // Exclude specific file types from being captured
//            if (!url.endsWith(".css") && !url.endsWith(".png") && !url.endsWith(".jpg") && !url.endsWith(".min.js")) {
//                // Print or process the captured XHR response
//                System.out.println("XHR Response Captured:");
//                System.out.println("Request ID: " + requestId);
//                System.out.println("URL: " + url);
//                System.out.println("Status: " + status);
//                System.out.println("Headers: " + headers);
//            }
//        });
//    }
//}

/**********************************second instance ********************/

//package cuesz.utils;
//
//import java.util.Map;
//import java.util.Optional;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.DevTools;
//import org.openqa.selenium.devtools.v115.network.Network;
//import org.openqa.selenium.devtools.v115.network.model.ResponseReceived;
//
//import io.qameta.allure.Allure;
//
//
//
//public class XHRResponseCaptureUtils {
//
//    public static void captureXHRResponses(WebDriver driver) {
//        if (!(driver instanceof ChromeDriver)) {
//            throw new IllegalArgumentException("The provided WebDriver instance is not a ChromeDriver.");
//        }
//
//        ChromeDriver chromeDriver = (ChromeDriver) driver;
//
//        // Ensure compatible versions (check https://www.selenium.dev/documentation/webdriver/browsers/)
//        System.out.println("Selenium version: " + System.getProperty("webdriver.selenium.version"));
//        String chromeDriverVersion = System.getProperty("webdriver.chrome.version");
//        System.out.println("ChromeDriver version: " + chromeDriverVersion);
//
//
//        try {
//            DevTools devTools = chromeDriver.getDevTools();
//            devTools.createSession();
//
//            // Enable Network domain first (avoid potential exceptions)
//            devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
//            devTools.addListener(Network.responseReceived(), response -> {
//                ResponseReceived responseReceived = (ResponseReceived) response;
//                Allure.addAttachment("XHR Response: " + responseReceived.getRequestId(), "text/plain", responseReceived.getResponse().toString());
//                // ...	            
//                // Extract relevant information
//                String requestId = responseReceived.getRequestId().toString();
//                String url = responseReceived.getResponse().getUrl();
//                int status = responseReceived.getResponse().getStatus();
//                Map<String, Object> headers = responseReceived.getResponse().getHeaders();
//
//                // Exclude specific file types
//                if (!url.endsWith(".css") && !url.endsWith(".png") && !url.endsWith(".jpg") && !url.endsWith(".min.js")) {
//                    System.out.println("XHR Response Captured:");
//                    System.out.println("Request ID: " + requestId);
//                    System.out.println("URL: " + url);
//                    System.out.println("Status: " + status);
//                    System.out.println("Headers: " + headers);
//                }
//            });
//        } catch (org.openqa.selenium.WebDriverException e) {
//            // Handle potential DevTools exceptions here
//            System.err.println("Error creating DevTools connection: " + e.getMessage());
//            // Consider retrying or providing alternative solutions
//        }
//    }
//}


package cuesz.utils;

import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v115.network.Network;
import org.openqa.selenium.devtools.v115.network.model.ResponseReceived;

import io.qameta.allure.Allure;

public class XHRResponseCaptureUtils {

  public static void captureXHRResponses(WebDriver driver) {
    if (!(driver instanceof ChromeDriver)) {
      throw new IllegalArgumentException("The provided WebDriver instance is not a ChromeDriver.");
    }

    ChromeDriver chromeDriver = (ChromeDriver) driver;

    // Ensure compatible versions (check https://www.selenium.dev/documentation/webdriver/browsers/)
    System.out.println("Selenium version: " + System.getProperty("webdriver.selenium.version"));
    String chromeDriverVersion = System.getProperty("webdriver.chrome.version");
    System.out.println("ChromeDriver version: " + chromeDriverVersion);

    try {
      DevTools devTools = chromeDriver.getDevTools();
      devTools.createSession();

      // Enable Network domain first (avoid potential exceptions)
      devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
      devTools.addListener(Network.responseReceived(), response -> {
        ResponseReceived responseReceived = (ResponseReceived) response;

        // Attach full response object (including headers and body)
        Allure.addAttachment("XHR Response: " + responseReceived.getRequestId(), "text/plain", responseReceived.getResponse().toString());

        // Extract relevant information (optional)
        String requestId = responseReceived.getRequestId().toString();
        String url = responseReceived.getResponse().getUrl();
        int status = responseReceived.getResponse().getStatus();
        Map<String, Object> headers = responseReceived.getResponse().getHeaders();

        // Exclude specific file types (optional)
        if (!url.endsWith(".css") && !url.endsWith(".png") && !url.endsWith(".jpg") && !url.endsWith(".min.js")) {
          System.out.println("XHR Response Captured:");
          System.out.println("Request ID: " + requestId);
          System.out.println("URL: " + url);
          System.out.println("Status: " + status);
          System.out.println("Headers: " + headers);
        }
      });
    } catch (org.openqa.selenium.WebDriverException e) {
      // Handle potential DevTools exceptions here
      System.err.println("Error creating DevTools connection: " + e.getMessage());
      // Consider retrying or providing alternative solutions
    }
  }
}
