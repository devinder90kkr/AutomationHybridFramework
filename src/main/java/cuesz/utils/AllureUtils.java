package cuesz.utils;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class AllureUtils {
    public static void captureScreenshot(WebDriver driver, String screenshotName) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            // for mac 
       //     File destination = new File("/Users/chicmicmac/Desktop/allurescreenshots/" + screenshotName + ".svg"); // Specify the path to save the screenshot
         
            //for window
            File destination = new File("C:\\Users\\ASUS\\OneDrive\\Documents\\eclipseallurescreenshot" + screenshotName + ".svg"); // Specify the path to save the screenshot
            
            FileUtils.copyFile(source, destination);
            Allure.addAttachment("Screenshot", FileUtils.openInputStream(destination));
        } catch (IOException e) {
            System.out.println("Failed to capture screenshot: " + e.getMessage());
        }
    }
}
