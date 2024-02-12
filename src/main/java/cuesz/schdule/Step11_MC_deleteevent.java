
package cuesz.schdule;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.DateGenerator;

public class Step11_MC_deleteevent extends BasePage {
	
	public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date 
	
	private By Membercalenda = (By.xpath("//a[@href='/member-calls']//span"));
	private By usrlabl		 = (By.xpath("//div[@class='user_title']//label"));
	private By deletbttn	 = (By.xpath("//button[@class='btn btn-sm del_btn']//em"));
	private By confirmbttn	 = (By.xpath("//span[normalize-space()='Confirm']"));
	
	
	 public Step11_MC_deleteevent(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	 @Test
	public void Deleteevent() throws InterruptedException {

		 /*Click on Member calendar*/		
			WebElement Membercalendar= driver.findElement(Membercalenda);
			Membercalendar.click();
			Thread.sleep(2000);
		
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//span[normalize-space()='Month']")).click();
	    
	 // Pass the event date from script one to script three
	 		String eventDate = Step07_MC_createevent.eventDate;

	 		// Split the date to extract day, month, and year
	 		String[] dateParts = eventDate.split("-");
	 		int day = Integer.parseInt(dateParts[0]);
	 		int month = Integer.parseInt(dateParts[1]);
	 		int year = Integer.parseInt(dateParts[2]);

	 		// Calculate the next day's date
	 		LocalDate currentDate = LocalDate.of(year, month, day);
	 		LocalDate nextDay = currentDate.plusDays(1);

	 		// Format the next day's date
	 		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	 		String nextDayDate = nextDay.format(formatter);

	 		// Find the element to scroll to the next day's date on the calendar (matching only the day)
	 		WebElement element = driver.findElement(By.xpath("//button[@role='cell'][normalize-space()='" + nextDay.getDayOfMonth() + "']"));
	 		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	 		Thread.sleep(3000);
	 		driver.findElement(By.xpath("//div[@data-date='" + nextDayDate + "']")).click();
	    
	    Thread.sleep(3000);
        //driver.findElement(By.xpath("(//span[contains(text(),'Kumar Devinder,')])[15]")).click();
        
     // Find the elements containing the user labels
        List<WebElement> userLabels1 = driver.findElements(usrlabl);

        // Get the texts from the user labels
        List<String> userTexts1 = new ArrayList<>();
        for (WebElement userLabel : userLabels1) {
            userTexts1.add(userLabel.getText());
        }

        // Verify the texts
        if (userTexts1.contains("Kumar Devinder") && userTexts1.contains("Coach Seakfreight") && userTexts1.contains("Devinder - Wellness Advocate")) {
     //   if (userTexts1.contains("Kumar Devinder") && userTexts1.contains("Seakfreight") && userTexts1.contains("SteveQA Adv")) {
            System.out.println("User text verification passed!");
        } else {
            System.out.println("User text verification failed!");
        }
        
        Thread.sleep(2000);  
        //find delete button and then delete event
        driver.findElement(deletbttn).click();
        
        
        Thread.sleep(3000);
        driver.findElement(confirmbttn).click();
        
        Thread.sleep(2000);

		// Verify that the event is deleted
		WebElement deletedEvent = driver.findElement(By.xpath("//div[@data-date='" + nextDayDate + "']"));
		if (deletedEvent.getAttribute("class").contains("event_dot")) {
			System.out.println("Event deletion verification failed!");
		} else {
			System.out.println("Event deletion verification passed!");
        
		}
	}
	 }	