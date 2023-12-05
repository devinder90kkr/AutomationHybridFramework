package cuesz.schdule;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.AllureUtils;
import cuesz.utils.DateGenerator;

public class Case03_editevent extends BasePage {
	// public static String eventDate = Case01_createvent.eventDate; // Get event date from the first script
	 
	 public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date
//	 public static String editedEventDate;
	 
	 private By scheduleIcon 	= (By.xpath("//a[@href='/schedule-master']//span//img[@alt='icon']"));
	 private By monthview 		= (By.xpath("//span[normalize-space()='Month']"));
	 private By userlabel 	 	= (By.xpath("//div[@class='user_title']//label"));
	 private By editBttn 		= (By.id("editEventButton"));
	 private By edittime 		= (By.id("event_date"));
	 private By editIconstarttime 		= (By.xpath("//div[@id='eventStartTime']/following-sibling::button[contains(@class, 'btn-secondary')]"));
	 private By startime		= (By.xpath("//input[@id='startTime']"));
	 private By EndTime		= 	  (By.xpath("//input[@id='endTime']"));
	 
	 private By Topic		 = (By.id("eventTopics"));
	 private By Notes		 =  (By.xpath("//textarea[contains(@placeholder,'Enter Notes')]"));
	 private By updatebutton	= (By.xpath("//button[normalize-space()='Update Event']"));
//	 private By NextButton = (By.xpath("//span[normalize-space()='Next']"));
	
	
	public Case03_editevent(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@Test
	 public void Editevent() throws InterruptedException {
	

		Thread.sleep(3500);
		driver.findElement(scheduleIcon).click();
		
	    Thread.sleep(3500);
	    driver.findElement(monthview).click();
		
	    // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot"); 

        
	 // Pass the event date from script one to script two
        eventDate = Case01_createvent.eventDate;
        // Extract the day portion from the eventDate
        String day = eventDate.split("-")[0];


//     // Pass the event date from script one to script two
//        eventDate = DateGenerator.generateDateSevenDaysAhead();
//
//        // Extract the day and month portion from the eventDate
//        String day = eventDate.split("-")[0];
//        String month = eventDate.split("-")[1];
//
//        // Find the current month and year displayed on the calendar
//        String currentMonthAndYear = driver.findElement(By.xpath("//span[normalize-space()='Today']")).getText();
//
//        // Check if the current month and year match the month and year of the eventDate
//        if (!currentMonthAndYear.contains(month)) {
//            // Click the "Next" button to navigate to the next month
//            driver.findElement(NextButton).click();
//        }
        
        
        // Find the element to scroll to the specified date on the calendar (matching only the day)
        WebElement element = driver.findElement(By.xpath("//button[@role='cell'][normalize-space()='" + day + "']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	           
        Thread.sleep(3000);
        WebElement dateElement = driver.findElement(By.xpath("//div[@data-date='" + eventDate + "']"));
        dateElement.click();
       
        Thread.sleep(3500); 
     // Find the elements containing the user labels
        List<WebElement> userLabels = driver.findElements(userlabel);

        // Get the texts from the user labels
        List<String> userTexts = new ArrayList<>();
        for (WebElement userLabel : userLabels) {
            userTexts.add(userLabel.getText());
        }
        // Verify the texts
        if (userTexts.contains("Kumar Devinder") && userTexts.contains("Seakfreight") && userTexts.contains("SteveQA Adv")) {
            System.out.println("User text verification passed!");
        } else {
            System.out.println("User text verification failed!");
        }

   	 // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot"); 

        // Click on edit button
        WebElement editButton = driver.findElement(editBttn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", editButton);
        editButton.click();
        
     // Find the input field for the edit date and clear the existing value
        WebElement editTime1 = driver.findElement(edittime);
        Actions builder11 = new Actions(driver);
     // windows command
	   // editTime1.sendKeys(Keys.CONTROL + "a");
	    // mac command
        editTime1.sendKeys(Keys.COMMAND + "a");
        // Windows command
       // editTime1.sendKeys(Keys.CONTROL + "a");
        editTime1.sendKeys(Keys.DELETE);

        // Get the assigned event date from Script 1
        String assignedDate = Case01_createvent.eventDate;

        // Split the date to extract day, month, and year
        String[] dateParts = assignedDate.split("-");
        int day1 = Integer.parseInt(dateParts[0]);
        int month1 = Integer.parseInt(dateParts[1]);
        int year = Integer.parseInt(dateParts[2]);

        // Calculate the next day's date
        day1 += 1;
        if (day1 > 31) {
            day1 = 1;
            month1 += 1;
            if (month1 > 12) {
                month1 = 1;
                year += 1;
            }
        }

        // Format the next day's date
        String nextDayDate = String.format("%02d-%02d-%04d", day1, month1, year);
        
//     // Store the edited date in the variable
//        editedEventDate = nextDayDate;

        // Enter the updated date in the edit field
        builder11.moveToElement(editTime1).click().sendKeys(nextDayDate).sendKeys(Keys.ENTER).perform();

        Thread.sleep(3500);
     // Click on the start time edit icon
        driver.findElement(editIconstarttime).click(); 
        // Find the input field for start time and clear the existing value
        WebElement startTimeInput = driver.findElement(startime);
        
//        // window command
        // startTimeInput.sendKeys(Keys.CONTROL + "a");
//         //mac command
        startTimeInput.sendKeys(Keys.COMMAND + "a");
        startTimeInput.sendKeys(Keys.DELETE);
//        // Enter the new start time (09:00 AM)
        Actions builder1 = new Actions(driver);
        builder1.moveToElement(startTimeInput).sendKeys("10:00 AM");
        // Press Enter to confirm the new time
        builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        
        Thread.sleep(5500);
        
        
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000)); // Wait up to 10 seconds
//        WebElement editIconEndTime = wait.until(ExpectedConditions.presenceOfElementLocated(editIconendtime));
//        // Click on the end time edit icon
//        editIconEndTime.click();
      
        // Find the input field for start time and clear the existing value
        WebElement endTimeInput = driver.findElement(EndTime);
//       // window command
    //    endTimeInput.sendKeys(Keys.CONTROL + "a");
//         //mac command
        endTimeInput.sendKeys(Keys.COMMAND + "a");
        endTimeInput.sendKeys(Keys.DELETE);
        // Enter the new start time (09:00 AM)
        Actions builder2 = new Actions(driver);
        builder2.moveToElement(endTimeInput).sendKeys("11:00 AM");
        // Press Enter to confirm the new time
        builder2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

        
//        /*Select Event as as Live perform	*/
//	    Thread.sleep(3500);
//	    WebElement topicselection =driver.findElement(Topic);
//	    Actions builder3 = new Actions(driver);
//	    builder3.moveToElement(topicselection).click().sendKeys("Motion Evaluation Review").sendKeys(Keys.ENTER).perform();
        
        
//        /*Enter Notes in create event*/
//	    driver.findElement(Notes).sendKeys("We are excited to announce that there will be a live performance event. So please availble");
        
	    // Find the input element
	    WebElement notesElement = driver.findElement(Notes);

	    // Check if the input field has some text
	    if (!notesElement.getAttribute("value").isEmpty()) {
	        // Clear the input field
	        notesElement.clear();
	    }

	    // Input the new value
	    notesElement.sendKeys("this text is update during edit field values.");
	    
   
   	 	// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot"); 

                
        Thread.sleep(5000);
        driver.findElement(updatebutton).click();
        
        Thread.sleep(3000);
        
		
		
		
		
	}
	}