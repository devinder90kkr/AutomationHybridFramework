//package utils.api;
//
//import java.util.Optional;
//import java.util.concurrent.ExecutionException;
//
//import org.json.JSONObject;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.DevTools;
//import org.openqa.selenium.devtools.v116.network.Network;
//import org.openqa.selenium.devtools.v116.network.model.RequestId;
//import org.openqa.selenium.devtools.v116.network.model.Response;
//
//public class NetworkResponse {
//
//    private WebDriver driver;
//
//    public NetworkResponse(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    public void getNetworkTabData(WebElement verificationCode) throws InterruptedException, ExecutionException {
//        if (!(driver instanceof ChromeDriver)) {
//            throw new IllegalArgumentException("Driver must be an instance of ChromeDriver");
//        }
//
//        ChromeDriver chromeDriver = (ChromeDriver) driver;
//        DevTools devTools = chromeDriver.getDevTools();
//        devTools.createSession();
//        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
//        final RequestId[] requestId = new RequestId[1];
//
//        // Add listener for response received
//        devTools.addListener(Network.responseReceived(), responseConsumer -> {
//            Response response = responseConsumer.getResponse();
//            requestId[0] = responseConsumer.getRequestId();
//            if (response.getUrl().contains("/authenticate")) {
//                System.out.println(response.getStatus() + " " + response.getUrl());
//                try {
//                    String responseBody = devTools.send(Network.getResponseBody(requestId[0])).getBody();
//                    JSONObject jsonObject = new JSONObject(responseBody);
//                    String code = jsonObject.getString("code");
//                    verificationCode.sendKeys(code);
//                } catch (Exception e) {
//                    System.err.println("Error retrieving response body: " + e.getMessage());
//                }
//            }
//        });
//
//        Thread.sleep(5000);
//    }
//}



/************* dated 24th feb below one is the updated script *************/

//package utils.api;
//
//import java.util.Optional;
//import java.util.concurrent.ExecutionException;
//
//import org.json.JSONObject;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.DevTools;
//import org.openqa.selenium.devtools.v116.network.Network;
//import org.openqa.selenium.devtools.v116.network.model.RequestId;
//import org.openqa.selenium.devtools.v116.network.model.Response;
//
//public class NetworkResponse {
//
//    private WebDriver driver;
//
//    public NetworkResponse(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    public void getNetworkTabData(WebElement verificationCode) throws InterruptedException, ExecutionException {
//        if (!(driver instanceof ChromeDriver)) {
//            throw new IllegalArgumentException("Driver must be an instance of ChromeDriver");
//        }
//
//        ChromeDriver chromeDriver = (ChromeDriver) driver;
//        DevTools devTools = chromeDriver.getDevTools();
//
//        // Create a DevTools session
//        devTools.createSession();
//
//        try {
//            // Enable network domain to listen to network events
//            devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
//        } catch (Exception e) {
//            System.err.println("Failed to enable Network domain: " + e.getMessage());
//            return;
//        }
//
//        final RequestId[] requestId = new RequestId[1];
//
//        // Add listener for response received
//        devTools.addListener(Network.responseReceived(), responseConsumer -> {
//            Response response = responseConsumer.getResponse();
//            requestId[0] = responseConsumer.getRequestId();
//            if (response.getUrl().contains("/authenticate")) {
//                System.out.println(response.getStatus() + " " + response.getUrl());
//                try {
//                    // Fetch the response body
//                    String responseBody = devTools.send(Network.getResponseBody(requestId[0])).getBody();
//                    JSONObject jsonObject = new JSONObject(responseBody);
//                    String code = jsonObject.getString("code");
//                    verificationCode.sendKeys(code);
//                } catch (Exception e) {
//                    System.err.println("Error retrieving response body: " + e.getMessage());
//                }
//            }
//        });
//
//        // Allow time for network events to be processed
//        Thread.sleep(5000);
//    }
//}
