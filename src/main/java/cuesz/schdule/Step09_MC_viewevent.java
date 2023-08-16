
package cuesz.schdule;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;

public class Step09_MC_viewevent extends BasePage {
	
	private String eventDate; // Date parameter from script one
	private By scheduleIcon 	=  (By.xpath("//a[@href='/member-calls']//span"));
	private By usertitle=  (By.xpath("//div[@class='user_title']//label"));
		
	public Step09_MC_viewevent(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void Viewevent() throws InterruptedException {

	 /*Click on Member calendar*/		
		WebElement Membercalendar= driver.findElement(scheduleIcon);
		Membercalendar.click();
		Thread.sleep(2000);
	    
		
//		driver.findElement(By.xpath("//span[normalize-space()='Month']")).click();
	    
	 // Pass the event date from script one to script two
        eventDate = Step07_MC_createevent.eventDate;

     // Extract the day portion from the eventDate
        String day = eventDate.split("-")[0];

        // Find the element to scroll to the specified date on the calendar (matching only the day)
        WebElement element = driver.findElement(By.xpath("//button[@role='cell'][normalize-space()='" + day + "']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
      
        Thread.sleep(3000);
//        WebElement dateElement = driver.findElement(By.xpath("//div[@data-date='27-07-2023']"));
     //   dateElement.click();
        
        WebElement dateElement = driver.findElement(By.xpath("//div[@data-date='" + eventDate + "']"));
        dateElement.click();


        Thread.sleep(3000);
        //driver.findElement(By.xpath("(//span[contains(text(),'Kumar Devinder,')])[15]")).click();
        //Thread.sleep(2000);
        
     // Find the elements containing the user labels
        List<WebElement> userLabels = driver.findElements(usertitle);

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
Thread.sleep(2000);
        
	
		}
	}	