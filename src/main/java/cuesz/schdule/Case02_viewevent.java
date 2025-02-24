package cuesz.schdule;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.date.functions.DateGenerator;
import cuesz.pages.BasePage;
import cuesz.web.resources.webTestdata;
import cuesz.web.resources.weblocators;

public class Case02_viewevent extends BasePage {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case02_viewevent.class);
	public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date
	
	public Case02_viewevent(WebDriver driver) {
		super(driver);
	
	}
	@Test
	 public void Viewevent() throws InterruptedException {
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		 		
		Thread.sleep(3500);
		driver.findElement(weblocators.scheduleIcon).click();
		
		LOGGER.info("Click on schdule feature");
        AllureUtils.logStep("Click on schdule feature");
		
	    Thread.sleep(3500);
	    driver.findElement(weblocators.monthview).click();   
	 
	    LOGGER.info("Click on monthly view option");
        AllureUtils.logStep("Click on monthly view option");
	    
	   
	    // Pass the event date from script one to script two
        eventDate = Case01_createvent.eventDate;
        // Extract the day portion from the eventDate
        String day = eventDate.split("-")[0];
        // Find the element to scroll to the sp	ecified date on the calendar (matching only the day)
        WebElement element = driver.findElement(By.xpath("//button[@role='cell'][normalize-space()='" + day + "']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
      
        LOGGER.info("Passed event date");
        AllureUtils.logStep("Passed event date");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case02_viewevent1");
        
        // Construct the XPath for the event dynamically
        String eventXPath = String.format("//div[@id='Schedule Master-LPS-%s-%s-%s']", day, webTestdata.membername, webTestdata.starTime);
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
            
            LOGGER.info("View event detail as per member & staff info");
            AllureUtils.logStep("View event detail as per member & staff info");
            
        } else {
            System.out.println("User text verification failed!");
        }
    
Thread.sleep(3500);
        	
		}
	}	