
package feature.case14_schedule;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import allureframework.reporting.AllureUtils;
import commonfunction.functions.DateGenerator;
import base.BasePage;
import web.resources.webTestdata;
import web.resources.weblocators;

public class Step10_MC_editevent extends BasePage {	
	public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date

	
    public Step10_MC_editevent(WebDriver driver) {
		super(driver);
		
	}	
	
	 @Test 
	public void Editevent() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		/*Click on Member calendar*/		
		WebElement Membercalendar= driver.findElement(weblocators.membercalicon);
		Membercalendar.click();
		Thread.sleep(2000);
 
		 // Pass the event date from script one to script two
        eventDate = Case01_createvent.eventDate;
        // Extract the day portion from the eventDate
        String day = eventDate.split("-")[0];
        
        // Find the element to scroll to the specified date on the calendar (matching only the day)
        WebElement element = driver.findElement(By.xpath("//button[@role='cell'][normalize-space()='" + day + "']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	           
       
        // Construct the XPath for the event dynamically
        String eventXPath = String.format("//div[@id='Member Call-LPS-%s-%s-%s']", day, webTestdata.membername, webTestdata.starTime);
        WebElement eventClick = driver.findElement(By.xpath(eventXPath));
        eventClick.click();
        
        
        Thread.sleep(3500); 
        // Find the elements containing the user labels
        List<WebElement> userLabels = driver.findElements(weblocators.userlabel);

        // Get the texts from the user labels
        List<String> userTexts = new ArrayList<>();
        for (WebElement userLabel : userLabels) {
            userTexts.add(userLabel.getText());
        }
        // Verify the texts
        if (userTexts.contains("Kumar Devinder") && userTexts.contains("Coach Seakfreight") && userTexts.contains("Devinder - Wellness Advocate")) {
            System.out.println("User text verification passed!");
        } else {
            System.out.println("User text verification failed!");
        }

        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case03_editevent2"); 

        // Click on edit button
        WebElement editButton = driver.findElement(weblocators.editBttn);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", editButton);
        editButton.click();
        
        // Find the input field for the edit date and clear the existing value
        WebElement editTime1 = driver.findElement(weblocators.edittime);
        Actions builder11 = new Actions(driver);
        // windows command
//	    editTime1.sendKeys(Keys.CONTROL + "a");
	    // mac command
        editTime1.sendKeys(Keys.COMMAND + "a");
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
        // Enter the updated date in the edit field
        builder11.moveToElement(editTime1).click().sendKeys(nextDayDate).sendKeys(Keys.ENTER).perform();

        Thread.sleep(3500);
        // Click on the start time edit icon
        driver.findElement(weblocators.editIconstarttime).click(); 
        // Find the input field for start time and clear the existing value
        WebElement startTimeInput = driver.findElement(weblocators.startime);
        
        // window command
//         startTimeInput.sendKeys(Keys.CONTROL + "a");
        //mac command
        startTimeInput.sendKeys(Keys.COMMAND + "a");
        startTimeInput.sendKeys(Keys.DELETE);
        // Enter the new start time (09:00 AM)
        Actions builder1 = new Actions(driver);
        builder1.moveToElement(startTimeInput).sendKeys(webTestdata.editstartTimeInput);
        // Press Enter to confirm the new time
        builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        
        Thread.sleep(5500); 
        // Find the input field for start time and clear the existing value
//        WebElement endTimeInput = driver.findElement(weblocators.EndTime);
        WebElement endTimeInput = wait.until(ExpectedConditions.elementToBeClickable(weblocators.editEndTime));
       // window command
//        endTimeInput.sendKeys(Keys.CONTROL + "a");
         //mac command
        endTimeInput.sendKeys(Keys.COMMAND + "a");
        endTimeInput.sendKeys(Keys.DELETE);
        // Enter the new start time (09:00 AM)
        Actions builder2 = new Actions(driver);
        builder2.moveToElement(endTimeInput).sendKeys(webTestdata.editendTimeInput);
        // Press Enter to confirm the new time
        builder2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        
	    // Find the input element
	    WebElement notesElement = driver.findElement(weblocators.Notes);
	    // Check if the input field has some text
        if (!notesElement.getDomProperty("value").isEmpty()) {
	        // Clear the input field
	        notesElement.clear();
	    }
	    // Input the new value
	    notesElement.sendKeys(webTestdata.edittopicvalues);
	    
   
   	 	// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case03_editevent3"); 

                
        Thread.sleep(5000);
        driver.findElement(weblocators.updatebutton).click();
        
        Thread.sleep(3000);
        
		}
	}	