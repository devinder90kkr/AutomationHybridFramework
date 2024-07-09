package cuesz.schdule;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.date.DateGenerator;
import cuesz.utils.reporting.AllureUtils;

public class Case04_deletevent extends BasePage {
	
	 public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date
	 
	 private By scheduleIcon 	= (By.xpath("//a[@href='/schedule-master']//span//img[@alt='icon']"));
	 private By monthview 		= (By.xpath("//span[normalize-space()='Month']"));
	 private By userlabel		= (By.xpath("//div[@class='user_title']//label"));
	 private By deletebutton	= (By.xpath("//button[@class='btn btn-sm del_btn']//em"));
	 private By confirmbutton 	= (By.xpath("//span[normalize-space()='Confirm']"));
//	 private By NextButton = (By.xpath("//span[normalize-space()='Next']")); // XPath for the "Next Month" button

	 
	
	public Case04_deletevent(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@Test
	 public void Deletevent() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
		Thread.sleep(3500);
		driver.findElement(scheduleIcon).click();
		
	    Thread.sleep(3500);
	    driver.findElement(monthview).click();
	    
	 // Pass the event date from script one to script three
	 		String eventDate = Case01_createvent.eventDate;

	 		// Split the date to extract day, month, and year
	 		String[] dateParts = eventDate.split("-");
	 		int day1 = Integer.parseInt(dateParts[0]);
	 		int month1 = Integer.parseInt(dateParts[1]);
	 		int year = Integer.parseInt(dateParts[2]);

	 		// Calculate the next day's date
	 		LocalDate currentDate = LocalDate.of(year, month1, day1);
	 		LocalDate nextDay = currentDate.plusDays(1);

	 		// Format the next day's date
	 		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	 		String nextDayDate = nextDay.format(formatter);

	 		// Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "Case04_deletevent1"); 
	 		
	        // //button[normalize-space()='07']
	        
	      
	 		// Find the element to scroll to the next day's date on the calendar (matching only the day)
//	 	WebElement element = driver.findElement(By.xpath("//button[@role='cell'][normalize-space()='" + nextDay.getDayOfMonth() + "']"));
	 	WebElement element = driver.findElement(By.xpath("//button[normalize-space()='" + nextDay.getDayOfMonth() + "']"));
	 	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	 		Thread.sleep(3000);
	 		driver.findElement(By.xpath("//div[@data-date='" + nextDayDate + "']")).click();
   
	    Thread.sleep(3000);



     // Find the elements containing the user labels
        List<WebElement> userLabels1 = driver.findElements(userlabel);

        // Get the texts from the user labels
        List<String> userTexts1 = new ArrayList<>();
        for (WebElement userLabel : userLabels1) {
            userTexts1.add(userLabel.getText());
        }

        // Verify the texts
//        if (userTexts1.contains("Kumar Devinder") && userTexts1.contains("Seakfreight") && userTexts1.contains("SteveQA Adv")) {
        if (userTexts1.contains("Kumar Devinder") && userTexts1.contains("Coach Seakfreight") && userTexts1.contains("Devinder - Wellness Advocate")) {
            System.out.println("User text verification passed!");
        } else {
            System.out.println("User text verification failed!");
        }
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case04_deletevent2"); 
        
	       
	        
        Thread.sleep(3500);  
        //find delete button and then delete event
        driver.findElement(deletebutton).click();
        
        Thread.sleep(3000);
        driver.findElement(confirmbutton).click();
        
        Thread.sleep(3500);
			
			// Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "Case04_deletevent3"); 
		}
	}