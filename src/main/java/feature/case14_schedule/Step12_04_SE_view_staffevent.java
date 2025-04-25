
package feature.case14_schedule;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commonfunction.functions.DateGenerator;
import base.BasePage;
import web.resources.weblocators;

public class Step12_04_SE_view_staffevent extends BasePage {
	
	public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date 
	public Step12_04_SE_view_staffevent(WebDriver driver) {
		super(driver);
	
	}
	
	 @Test 
	public void Viewevent() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(weblocators.scdedulemastr).click();
		
	    Thread.sleep(2000);
	    driver.findElement(weblocators.monthvew).click();
	    
	    // Pass the event date from script one to script two
        eventDate = Step12_03_SE_create_staffevent.eventDate;

        // Extract the day portion from the eventDate
        String day = eventDate.split("-")[0];

        // Find the element to scroll to the specified date on the calendar (matching only the day)
        WebElement element = driver.findElement(By.xpath("//button[@role='cell'][normalize-space()='" + day + "']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
     
        
        WebElement dateElement = driver.findElement(By.xpath("//div[@data-date='" + eventDate + "']"));
        dateElement.click();

        
        // Find the elements containing the user labels
        List<WebElement> userLabels = driver.findElements(weblocators.usrlabel);

        // Get the texts from the user labels
        List<String> userTexts = new ArrayList<>();
        for (WebElement userLabel : userLabels) {
            userTexts.add(userLabel.getText());
        }

        // Verify the texts
        if (userTexts.contains("Kumar Devinder") && userTexts.contains("Coach Seakfreight") && userTexts.contains("Devinder - Wellness Advocate")) {
        // if (userTexts.contains("Kumar Devinder") && userTexts.contains("Seakfreight") && userTexts.contains("SteveQA Adv")) {
            System.out.println("User text verification passed!");
        } else {
            System.out.println("User text verification failed!");
        }
Thread.sleep(2000);
        
	
		}
	}	