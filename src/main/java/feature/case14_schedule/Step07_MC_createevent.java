package feature.case14_schedule;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import allureframework.reporting.AllureUtils;
import commonfunction.DateGenerator;
import base.BasePage;
import constant.webTestdata;
import constant.weblocators;

public class Step07_MC_createevent extends BasePage {
	private static final Logger LOGGER = LoggerFactory.getLogger(Step07_MC_createevent.class);
	public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date

 public Step07_MC_createevent(WebDriver driver) {
	super(driver);
	

}
@Test
	public void Schdulevent() throws InterruptedException {	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	
		 /*Click on Member calendar*/		
		WebElement Membercalendar= driver.findElement(weblocators.membercalicon);
		Membercalendar.click();
	    
		/*Click on Add New Event*/		
	    Thread.sleep(2000);
	    driver.findElement(weblocators.Addnewevent).click();
	    // Log message to console and Allure report
        LOGGER.info("Click on Add new event button");
        AllureUtils.logStep("Click on Add new event button from schdule master");
			        			
        /*Enter date values*/
		WebElement datefield = wait.until(ExpectedConditions.elementToBeClickable(weblocators.Date));
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(datefield).click().sendKeys(eventDate).sendKeys(Keys.ENTER).perform();
        // Log message to console and Allure report
        LOGGER.info("Click on date field and enter event date");
        AllureUtils.logStep("Click on date field and enter event date");
        
        /*Enter start Time values*/
		WebElement startTime = wait.until(ExpectedConditions.elementToBeClickable(weblocators.StartTime));
	    Actions builder = new Actions(driver);
	    builder.moveToElement(startTime).click().sendKeys(webTestdata.startime).perform();
	    Thread.sleep(3500);
	    builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();	    
		 // Log message to console and Allure report
        LOGGER.info("Click on start time and input values for same");
        AllureUtils.logStep("Click on start time and input values for same");
       
	    /*Enter values for end time	*/
	    WebElement endTime = wait.until(ExpectedConditions.elementToBeClickable(weblocators.EndTime));
	    Actions builder11 = new Actions(driver);
	    builder11.moveToElement(endTime).click().sendKeys(webTestdata.endtime).sendKeys(Keys.ENTER).perform();

		 // Log message to console and Allure report
        LOGGER.info("Click on end time and input value.");
        AllureUtils.logStep("Click on end time and input value.");
	    // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Step07_MC_createevent");
        
	    /*Select Event as as Live perform	*/
	    WebElement topicselection = wait.until(ExpectedConditions.elementToBeClickable(weblocators.Topic));
	    Actions builder2 = new Actions(driver);
	    builder2.moveToElement(topicselection).click().sendKeys(webTestdata.topic).sendKeys(Keys.ENTER).perform();
	    
		 // Log message to console and Allure report
        LOGGER.info("Click on Topic time and select Live perform session.");
        AllureUtils.logStep("Click on Topic time and select Live perform session.");
	    
	    /*Select Event as as member selection perform	*/
	  //  Thread.sleep(3500);
	    WebElement memberSelection =driver.findElement(weblocators.Member);
	    Actions builder3 = new Actions(driver);
	    builder3.moveToElement(memberSelection).click().sendKeys(webTestdata.membername).sendKeys(Keys.ENTER).perform();
	    // Log message to console and Allure report
        LOGGER.info("Click on member list and select member");
        AllureUtils.logStep("Click on member list and select member");
	    

	    /*Select Coach & advocate from dropdown list*/
	   // Thread.sleep(3500);
	    WebElement staffSelection =driver.findElement(weblocators.Staff);
	    Actions builder4 = new Actions(driver);
	    builder4.moveToElement(staffSelection).click().sendKeys(webTestdata.staff1).sendKeys(Keys.ENTER).perform();
	    builder4.moveToElement(staffSelection).click().sendKeys(webTestdata.staff2).sendKeys(Keys.ENTER).perform();
	    
	    // Log message to console and Allure report
        LOGGER.info("Click on staff list and select staff");
        AllureUtils.logStep("Click on staff list and select staff");

	   
	    /*Enter Notes in create event*/
	    driver.findElement(weblocators.Notes).sendKeys(webTestdata.notes);
	    
	    // Log message to console and Allure report
        LOGGER.info("Click on Notes list and input values");
        AllureUtils.logStep("Click on Notes list and input values");
	    
	 // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Step07_MC_createevent2");
	    
	    /*Click on submit button*/
	    driver.findElement(weblocators.Submitbutton).click();
	    // Log message to console and Allure report
        LOGGER.info("Click on Submit button");
        AllureUtils.logStep("Click on submit button");
	    
	    Thread.sleep(5000);
	 	}
	}	