
package feature.case14_schedule;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import allureframework.AllureUtils;
import commonfunction.DateGenerator;
import base.BasePage;
import constant.webTestdata;
import constant.weblocators;

public class Step11_MC_deleteevent extends BasePage {
	
	public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date 
	
	 public Step11_MC_deleteevent(WebDriver driver) {
		super(driver);
		
	}
	
	 @Test
	public void Deleteevent() throws InterruptedException {

	 /*Click on Member calendar*/		
		WebElement Membercalendar= driver.findElement(weblocators.Membercalenda);
		Membercalendar.click();
		Thread.sleep(2000);
	

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
 		// Extract the day portion from the eventDate
        String day1 = nextDayDate.split("-")[0];
 		
 		
 		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Step11_MC_deleteevent1"); 

 		// Find the element to scroll to the next day's date on the calendar (matching only the day)
 		WebElement element = driver.findElement(By.xpath("//button[@role='cell'][normalize-space()='" + nextDay.getDayOfMonth() + "']"));
 		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
 		
 		 // Construct the XPath for the event dynamically
        String eventXPath = String.format("//div[@id='Member Call-LPS-%s-%s-%s']", day1, webTestdata.membername, webTestdata.editstartInput);
        WebElement eventClick = driver.findElement(By.xpath(eventXPath));
        eventClick.click();
	 		

     // Find the elements containing the user labels
        List<WebElement> userLabels1 = driver.findElements(weblocators.usrlabl);

        // Get the texts from the user labels
        List<String> userTexts1 = new ArrayList<>();
        for (WebElement userLabel : userLabels1) {
            userTexts1.add(userLabel.getText());
        }

        // Verify the texts
       	 if (userTexts1.contains(webTestdata.membername) && userTexts1.contains(webTestdata.staff1) && userTexts1.contains(webTestdata.staff2)) {
            System.out.println("User text verification passed!");
        } else {
            System.out.println("User text verification failed!");
        }
        
        Thread.sleep(2000);  
        //find delete button and then delete event
        driver.findElement(weblocators.deletbttn).click();
        
        
        Thread.sleep(3000);
        driver.findElement(weblocators.confirmbttn).click();
        
        Thread.sleep(2000);

		// Verify that the event is deleted
		WebElement deletedEvent = driver.findElement(By.xpath("//div[@data-date='" + nextDayDate + "']"));
		if (deletedEvent.getDomAttribute("class").contains("event_dot")) {
			System.out.println("Event deletion verification failed!");
		} else {
			System.out.println("Event deletion verification passed!");
        
		}
	}
	 }	