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

import cuesz.allure.reporting.AllureUtils;
import cuesz.date.functions.DateGenerator;
import cuesz.pages.BasePage;
import cuesz.web.resources.webTestdata;
import cuesz.web.resources.weblocators;

public class Case04_deletevent extends BasePage {
	
	 public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date
	

	public Case04_deletevent(WebDriver driver) {
		super(driver);
	}
	@Test
	 public void Deletevent() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
		Thread.sleep(3500);
		driver.findElement(weblocators.scheduleIcon).click();
		
	    Thread.sleep(3500);
	    driver.findElement(weblocators.monthview).click();
	    
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
 		// Extract the day portion from the eventDate
        String day = nextDayDate.split("-")[0];

 		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case04_deletevent1"); 
	 		
	      
	 	// Find the element to scroll to the next day's date on the calendar (matching only the day)
	 	WebElement element = driver.findElement(By.xpath("//button[normalize-space()='" + nextDay.getDayOfMonth() + "']"));
	 	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	 	// Construct the XPath for the event dynamically
        String eventXPath = String.format("//div[@id='Schedule Master-LPS-%s-%s-%s']", day, webTestdata.membername, webTestdata.editstartInput);
        WebElement eventClick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(eventXPath)));
        eventClick.click();
        	
	    Thread.sleep(3000);
	    // Find the elements containing the user labels
        List<WebElement> userLabels1 = driver.findElements(weblocators.userlabel);
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
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case04_deletevent2");         
        Thread.sleep(3500);  
        //find delete button and then delete event
        driver.findElement(weblocators.deletebutton).click();
        
        Thread.sleep(3000);
        driver.findElement(weblocators.confirmbutton).click();
        
        Thread.sleep(3500);
			
			// Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "Case04_deletevent3"); 
		}
	}