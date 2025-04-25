package commonfunction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WeekNavigationUtils {

    public static void navigateToLastAndNextWeek(WebDriver driver) throws InterruptedException {
        // Find the current week element
        WebElement currentWeekElement = driver.findElement(currentWeek);

        // Get the week name from the current week element
        String weekName = currentWeekElement.getText();
        System.out.println("Current week name: " + weekName);

        Thread.sleep(2000);
        // If the current week is visible, perform the actions as described
        if (currentWeekElement.isDisplayed()) {
            // Click on "Last Week" button twice
            WebElement lastWeekButton = driver.findElement(By.xpath("//button[contains(.,'Last Week')]"));
            for (int i = 0; i < 2; i++) {
                lastWeekButton.click();
                Thread.sleep(2000); // Add a small delay between clicks
            }

            // Print the name of the "Last Week" after clicking the button twice
            String lastWeekName = currentWeekElement.getText();
            System.out.println("Last week name: " + lastWeekName);

            // Click on "Next Week" button four times
            WebElement nextWeekButton = driver.findElement(By.xpath("//button[contains(.,'Next Week')]"));
            for (int i = 0; i < 3; i++) {
                nextWeekButton.click();
                Thread.sleep(2000); // Add a small delay between clicks
            }

            // Print the name of the "Next Week" after clicking the button four times
            String nextWeekName = currentWeekElement.getText();
            System.out.println("Next week name: " + nextWeekName);
        }
    }

    // Define your locators here
    private static By currentWeek = By.id("currentWeekId");
}
