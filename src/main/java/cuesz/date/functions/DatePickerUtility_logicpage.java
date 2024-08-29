package cuesz.date.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatePickerUtility_logicpage {

//    public static void selectDesiredDate(WebDriver driver) {
//        String currentDateStr = Currentdategenerator.generateCurrentDate();
//        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        LocalDate currentDate = LocalDate.parse(currentDateStr, dateFormatter);
//
//        WebElement todayDateElement = driver.findElement(By.xpath("//div[contains(@class, 'DayPicker-Day--today')]"));
//        String todayDateText = todayDateElement.getText();
//        int today = Integer.parseInt(todayDateText);
//        int twoWeeksAhead = today + 3;
//
//        LocalDate desiredDate = currentDate.plusDays(twoWeeksAhead);
//
//        if (desiredDate.getMonthValue() != currentDate.getMonthValue()) {
//            WebElement nextMonthButton = driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"));
//            nextMonthButton.click();
//        }
//
//        String desiredDateLocator = String.format("//div[@aria-label='%s']", desiredDate.format(DateTimeFormatter.ofPattern("EEE MMM d yyyy")));
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement desiredDateElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(desiredDateLocator)));
//        desiredDateElement.click();
//
//        System.out.println("Clicked on date: " + desiredDateElement.getText());
//    }
//}

	
	/***2nd function****/
	
	
//public static void selectDesiredDate(WebDriver driver) {
//    // Get the current date
//    String currentDateStr = Currentdategenerator.generateCurrentDate();
//    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//    LocalDate currentDate = LocalDate.parse(currentDateStr, dateFormatter);
//
//    // Calculate the desired date, which is two weeks ahead from the day after tomorrow
//    LocalDate desiredDate = currentDate.plusDays(16);
//
//    // Convert desiredDate to the desired format
//    String desiredDateLocator = String.format("//div[@aria-label='%s']", desiredDate.format(DateTimeFormatter.ofPattern("EEE MMM d yyyy")));
//
//    // Check if the desired date is in a different month and adjust the month if needed
//    if (desiredDate.getMonthValue() != currentDate.getMonthValue()) {
//        WebElement nextMonthButton = driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"));
//        nextMonthButton.click();
//    }
//
//    // Wait for and click on the desired date
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    WebElement desiredDateElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(desiredDateLocator)));
//    desiredDateElement.click();
//
//    System.out.println("Clicked on date: " + desiredDateElement.getText());
//}
//}
	
	
	/***3rf function****/
	
	    public static void selectDesiredDate(WebDriver driver) {
	        // Get the current date
	        LocalDate currentDate = LocalDate.now();

	        // Calculate the desired date, which is two weeks ahead from the day after tomorrow
	        LocalDate desiredDate = currentDate.plusDays(1).plusWeeks(2);

//	        // Convert desiredDate to the desired format
	        String desiredDateLocator = String.format("//div[@aria-label='%s']", desiredDate.format(DateTimeFormatter.ofPattern("EEE MMM d yyyy")));
	        
	        // Check if the desired date is in a different month and adjust the month if needed
	        if (desiredDate.getMonthValue() != currentDate.getMonthValue()) {
	            WebElement nextMonthButton = driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"));
	            nextMonthButton.click();
	            
	        }
	            
	    // Wait for and click on the desired date
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            WebElement desiredDateElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(desiredDateLocator)));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", desiredDateElement);
            desiredDateElement.click();
            System.out.println("Clicked on date: " + desiredDateElement.getText());
        } catch (Exception e) {
          // System.out.println("Could not click on the date: " + desiredDateFormatted);
            e.printStackTrace();
        }	
	    }
	}

