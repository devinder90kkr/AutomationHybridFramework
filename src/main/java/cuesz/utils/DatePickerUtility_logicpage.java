package cuesz.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class DatePickerUtility_logicpage {

    public static void selectDesiredDate(WebDriver driver) {
        String currentDateStr = Currentdategenerator.generateCurrentDate();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate currentDate = LocalDate.parse(currentDateStr, dateFormatter);

        WebElement todayDateElement = driver.findElement(By.xpath("//div[contains(@class, 'DayPicker-Day--today')]"));
        String todayDateText = todayDateElement.getText();
        int today = Integer.parseInt(todayDateText);
        int twoWeeksAhead = today + 9;

        LocalDate desiredDate = currentDate.plusDays(twoWeeksAhead);

        if (desiredDate.getMonthValue() != currentDate.getMonthValue()) {
            WebElement nextMonthButton = driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"));
            nextMonthButton.click();
        }

        String desiredDateLocator = String.format("//div[@aria-label='%s']", desiredDate.format(DateTimeFormatter.ofPattern("EEE MMM d yyyy")));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement desiredDateElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(desiredDateLocator)));
        desiredDateElement.click();

        System.out.println("Clicked on date: " + desiredDateElement.getText());
    }
}
