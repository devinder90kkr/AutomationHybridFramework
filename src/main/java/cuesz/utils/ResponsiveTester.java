package cuesz.utils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class ResponsiveTester {
    private static Dimension[] viewports = {
//        new Dimension(320, 480),  // Mobile portrait
//        new Dimension(480, 800),  // Mobile landscape
       // new Dimension(768, 1024), // Tablet portrait
//        new Dimension(1024, 768), // Tablet landscape
//        new Dimension(1366, 768)  // Desktop
    		 new Dimension(430, 932), // Tablet landscape
    };

    public static Dimension[] getViewports() {
        return viewports;
    }

    public static void testResponsive(WebDriver driver) throws InterruptedException {
        for (Dimension viewport : viewports) {
            driver.manage().window().setSize(viewport);
            // Put your testing logic here
            // For example:
            Thread.sleep(2000);
            // Perform navigation, element checks, interactions, etc.
        }
    }
}
