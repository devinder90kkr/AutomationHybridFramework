package feature.case02_windowhandel;
import base.BasePage;
import constant.weblocators;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import allureframework.AllureUtils;

public class case01_flipkartwindow extends BasePage{
    private static final Logger LOGGER = LoggerFactory.getLogger(case01_flipkartwindow.class);
    public case01_flipkartwindow(WebDriver driver) {
          super(driver);
    }
    
@Test
    public void flipkartwindow() throws InterruptedException {

        LOGGER.info("Clicking on flipkart login");
        WebElement login = driver.findElement(weblocators.flipkartlogin);
        login.click();
        AllureUtils.logStep("Click on flipkart login");

        LOGGER.info("clicking on terms of use");
        // Store the current window handle
        String mainWindowHandle = driver.getWindowHandle();
        
        WebElement termclick = driver.findElement(weblocators.fliptermofuse);
        termclick.click();
        AllureUtils.logStep("Click on terms of use from Login screen");
        
        // Switch to the new window
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(mainWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        
        // Perform operations in the new window
        LOGGER.info("Performing operations in terms of use window");
        
        // Store the initial page content
        String initialContent = driver.getPageSource();
        LOGGER.info("Stored initial page content");
        
        // Scroll to the bottom of the page
        LOGGER.info("Scrolling to the bottom of the page");
        long lastHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");
        
        while (true) {
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
            Thread.sleep(2000); // Wait for page to load
            
            long newHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");
            if (newHeight == lastHeight) {
                break;
            }
            lastHeight = newHeight;
        }
        
        // Store the final page content after scrolling
        String finalContent = driver.getPageSource();
        LOGGER.info("Stored final page content after scrolling");
        
        // Compare the content
        if (!initialContent.equals(finalContent)) {
            LOGGER.info("Page content changed after scrolling - verification successful");
            AllureUtils.logStep("Verified page content changes after scrolling");
        } else {
            LOGGER.warn("Page content remained the same after scrolling");
            AllureUtils.logStep("Warning: Page content did not change after scrolling");
        }
        
        // Scroll back to top
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
        LOGGER.info("Scrolled back to top of the page");
        
        // Close the new window
        driver.close();
        
        // Switch back to the main window
        driver.switchTo().window(mainWindowHandle);
        LOGGER.info("Switched back to main window");
    }
}