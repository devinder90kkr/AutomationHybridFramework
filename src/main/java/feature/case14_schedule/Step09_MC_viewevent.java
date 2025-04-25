
package feature.case14_schedule;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commonfunction.DateGenerator;
import base.BasePage;
import constant.webTestdata;
import constant.weblocators;

public class Step09_MC_viewevent extends BasePage {
	
	public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date 


	public Step09_MC_viewevent(WebDriver driver) {
		super(driver);
		
	}
	
	@Test
	public void Viewevent() throws InterruptedException {

		/*Click on Member calendar*/		
		WebElement Membercalendar= driver.findElement(weblocators.membrcall);
		Membercalendar.click();
		Thread.sleep(2000);
	    
	    
		// Pass the event date from script one to script two
        eventDate = Step07_MC_createevent.eventDate;

        // Extract the day portion from the eventDate
        String day = eventDate.split("-")[0];

        // Find the element to scroll to the specified date on the calendar (matching only the day)
        WebElement element = driver.findElement(By.xpath("//button[@role='cell'][normalize-space()='" + day + "']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
      
        
        // Construct the XPath for the event dynamically
        String eventXPath = String.format("//div[@id='Member Call-LPS-%s-%s-%s']", day, webTestdata.membername, webTestdata.starTime);
        WebElement eventClick = driver.findElement(By.xpath(eventXPath));
        eventClick.click();
        

        
        
        Thread.sleep(3000); 
        // Find the elements containing the user labels
        List<WebElement> userLabels = driver.findElements(weblocators.userlabel);

        // Get the texts from the user labels
        List<String> userTexts = new ArrayList<>();
        for (WebElement userLabel : userLabels) {
            userTexts.add(userLabel.getText());
        }

        // Verify the texts
        if (userTexts.contains(webTestdata.membername) && userTexts.contains(webTestdata.staff1) && userTexts.contains(webTestdata.staff2)) {
            System.out.println("User text verification passed!");
            
           
        } else {
            System.out.println("User text verification failed!");
        }
        
Thread.sleep(2000);
        
	
		}
	}	