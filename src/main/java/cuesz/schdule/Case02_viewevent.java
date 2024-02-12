package cuesz.schdule;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.AllureUtils;
import cuesz.utils.DateGenerator;

public class Case02_viewevent extends BasePage {
	
	//private String eventDate; // Date parameter from script one
	
	public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date
	
	private By scheduleIcon 	= (By.xpath("//a[@href='/schedule-master']//span//img[@alt='icon']"));
	private By monthview 		= (By.xpath("//span[normalize-space()='Month']"));
	private By userlabel 	 	= (By.xpath("//div[@class='user_title']//label"));
//	private By NextButton = (By.xpath("//span[normalize-space()='Next']"));

	
	public Case02_viewevent(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@Test
	 public void Viewevent() throws InterruptedException {
		 		
		Thread.sleep(3500);
		driver.findElement(scheduleIcon).click();
		
	    Thread.sleep(3500);
	    driver.findElement(monthview).click();   
	   
	    // Pass the event date from script one to script two
        eventDate = Case01_createvent.eventDate;
        // Extract the day portion from the eventDate
        String day = eventDate.split("-")[0];
        // Find the element to scroll to the sp	ecified date on the calendar (matching only the day)
        WebElement element = driver.findElement(By.xpath("//button[@role='cell'][normalize-space()='" + day + "']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
      
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
        
        Thread.sleep(3000);
        WebElement dateElement = driver.findElement(By.xpath("//div[@data-date='" + eventDate + "']"));
        dateElement.click();

        
        Thread.sleep(3000); 
        // Find the elements containing the user labels
        List<WebElement> userLabels = driver.findElements(userlabel);

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
  
        
Thread.sleep(3500);
        
	
		}
	}	