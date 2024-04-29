package cuesz.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class reminderCalendarUtils {

    public static void selectDate(WebDriver driver, String dateToSelect) {
        // Format the date string to match the date format displayed on the calendar
        DateFormat inputFormat = new SimpleDateFormat("MMMM d, yyyy");
        DateFormat outputFormat = new SimpleDateFormat("d");
        String formattedDate;
        try {
            Date date = inputFormat.parse(dateToSelect);
            formattedDate = outputFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }

////        // Wait for the calendar to load
////        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
////        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='calendar']")));
//
//        // Find the date element and check if it's disabled
//        WebElement dateElement = driver.findElement(By.xpath("//abbr[text()='" + formattedDate + "']"));
//        boolean isDisabled = dateElement.getAttribute("class").contains("disabled");
//
//        // If the selected date is disabled, select the current date instead
//        if (isDisabled) {
//            // Get the current date
//            Date currentDate = new Date();
//            String currentFormattedDate = outputFormat.format(currentDate);
//
//            // Find the current date element and click on it
//            WebElement currentDateElement = driver.findElement(By.xpath("//abbr[text()='" + currentFormattedDate + "']"));
//            currentDateElement.click();
//        } else {
//            // Click on the selected date
//            dateElement.click();
//        }
//
//        // Add further actions as needed after clicking the date
//    }
//}
//        // Wait for the calendar to load
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='calendar']")));

        // Get the current month and year
        WebElement monthYearElement = driver.findElement(By.xpath("//div[@class='month-year']"));
        String currentMonthYear = monthYearElement.getText();

        // Check if the desired date is in the current month
        if (currentMonthYear.contains(dateToSelect.split(",")[0])) {
            // Find the date element and click on it
            WebElement dateElement = driver.findElement(By.xpath("//abbr[text()='" + formattedDate + "']"));
            dateElement.click();
        } else {
            // Navigate to the next month
            WebElement nextMonthButton = driver.findElement(By.xpath("//button[@aria-label='Next month']"));
            nextMonthButton.click();

//            // Wait for the calendar to load
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='calendar']")));

            // Find the date element and click on it
            WebElement dateElement = driver.findElement(By.xpath("//abbr[text()='" + formattedDate + "']"));
            dateElement.click();
        }

        // Add further actions as needed after clicking the date
    }
}