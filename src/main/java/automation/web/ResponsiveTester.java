package automation.web;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ResponsiveTester {
    private static Dimension[] viewports = {
        // Define your viewports here
//        new Dimension(320, 480),  // Mobile portrait
//        new Dimension(480, 800),  // Mobile landscape
        new Dimension(768, 1024), // Tablet portrait
//        new Dimension(1024, 768), // Tablet landscape
//        new Dimension(1366, 768)  // Desktop
    };

    public static Dimension[] getViewports() {
        return viewports;
    }

    public static void testResponsive(WebDriver driver) throws InterruptedException, IOException {
        Properties properties = new Properties();
        FileInputStream inputStream = new FileInputStream("config.properties");
        properties.load(inputStream);
        inputStream.close();

        boolean responsiveTestingEnabled = Boolean.parseBoolean(properties.getProperty("responsiveTesting"));

        if (responsiveTestingEnabled) {
            for (Dimension viewport : viewports) {
                driver.manage().window().setSize(viewport);
                // Put your testing logic here
                // For example:
                Thread.sleep(2000);
                // Perform navigation, element checks, interactions, etc.
            }
        } else {
            // Responsive testing is disabled, perform other tasks or nothing
            // For example:
            System.out.println("Responsive testing is disabled.");
        }
    }
}
