
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

public class Step10_MC_editevent extends BasePage {

	public static String eventDate = Step07_MC_createevent.eventDate; // Get event date from the first script
	
	private By membercalicon 	=  (By.xpath("//a[@href='/member-calls']//span"));
	private By usrtitle			=  (By.xpath("//div[@class='user_title']//label"));
	private By editicon			=  (By.xpath("//button[@class='btn btn-sm edit_btn']"));
	private By edittim1			=  (By.xpath("(//input[@placeholder='DD-MM-YYYY'])[1]"));
	private By editicon2		=  (By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/button[1]"));
	private By starttime		=  (By.xpath("//input[@id='startTime']"));
	private By updateeventbtn	=  (By.xpath("//button[normalize-space()='Update Event']"));
	
	
    public Step10_MC_editevent(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}	
	
	 @Test 
	public void Editevent() throws InterruptedException {

		 /*Click on Member calendar*/		
			WebElement Membercalendar= driver.findElement(membercalicon);
			Membercalendar.click();
			Thread.sleep(2000);
		
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//span[normalize-space()='Month']")).click();
	    
	 // Pass the event date from script one to script two
        eventDate = Step07_MC_createevent.eventDate;

        // Extract the day portion from the eventDate
        String day = eventDate.split("-")[0];

        // Find the element to scroll to the specified date on the calendar (matching only the day)
        WebElement element = driver.findElement(By.xpath("//button[@role='cell'][normalize-space()='" + day + "']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	    
	    
	   // Find the element to scroll to 12th date of calendar as per line 27 
//        WebElement element = driver.findElement(By.xpath("(//button[@role='cell'][normalize-space()='27'])[2]"));
        // Scroll to the element
  //      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        
        Thread.sleep(3000);
        WebElement dateElement = driver.findElement(By.xpath("//div[@data-date='" + eventDate + "']"));
        dateElement.click();

	   
       
        Thread.sleep(2000); 
     // Find the elements containing the user labels
        List<WebElement> userLabels = driver.findElements(usrtitle);

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

        // Click on edit button
        WebElement editButton = driver.findElement(editicon);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", editButton);
        editButton.click();
        
        /*      
        WebElement editTime1 =driver.findElement(By.xpath("(//input[@placeholder='DD-MM-YYYY'])[1]"));
	    Actions builder11 = new Actions(driver);
	    editTime1.sendKeys(Keys.COMMAND + "a");
	    // windows command
	    editTime1.sendKeys(Keys.CONTROL + "a");
	    editTime1.sendKeys(Keys.DELETE);
	    builder11.moveToElement(editTime1).click().sendKeys("28-07-2023").sendKeys(Keys.ENTER).perform();;  
	 // Click on the edit icon
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/button[1]")).click();
        */
        
     // Find the input field for the edit date and clear the existing value
        WebElement editTime1 = driver.findElement(edittim1);
        Actions builder11 = new Actions(driver);
     // windows command
	  //  editTime1.sendKeys(Keys.CONTROL + "a");
	    // mac command
        editTime1.sendKeys(Keys.COMMAND + "a");
        // Windows command
       // editTime1.sendKeys(Keys.CONTROL + "a");
        editTime1.sendKeys(Keys.COMMAND + "a");
        editTime1.sendKeys(Keys.DELETE);

        // Get the assigned event date from Script 1
        String assignedDate = Step07_MC_createevent.eventDate;

        // Split the date to extract day, month, and year
        String[] dateParts = assignedDate.split("-");
        int day1 = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int year = Integer.parseInt(dateParts[2]);

        // Calculate the next day's date
        day1 += 1;
        if (day1 > 31) {
            day1 = 1;
            month += 1;
            if (month > 12) {
                month = 1;
                year += 1;
            }
        }

        // Format the next day's date
        String nextDayDate = String.format("%02d-%02d-%04d", day1, month, year);

        // Enter the updated date in the edit field
        builder11.moveToElement(editTime1).click().sendKeys(nextDayDate).sendKeys(Keys.ENTER).perform();

        Thread.sleep(3500);
     // Click on the edit icon
        driver.findElement(editicon2).click();
     // Find the input field for start time and clear the existing value
        WebElement startTimeInput = driver.findElement(starttime);
       // window command
       //  startTimeInput.sendKeys(Keys.CONTROL + "a");
        
         //mac command
         startTimeInput.sendKeys(Keys.COMMAND + "a");
        startTimeInput.sendKeys(Keys.DELETE);
        // Enter the new start time (09:00 AM)
        Actions builder1 = new Actions(driver);
        builder1.moveToElement(startTimeInput).sendKeys("09:00 AM");
        // Press Enter to confirm the new time
        builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        
        Thread.sleep(5000);
        driver.findElement(updateeventbtn).click();
        
        Thread.sleep(3000);
        
      
        
		}
	}	