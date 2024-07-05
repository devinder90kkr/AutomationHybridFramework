package cuesz.schdule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;
import cuesz.utils.date.DateGenerator;
import cuesz.utils.reporting.AllureUtils;

public class Case01_createvent extends BasePage {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Case01_createvent.class);
	
	SeleniumUtils utils = new SeleniumUtils(driver);
	public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date
	
	private By Date 		 = (By.id("event_date"));	
	private By StartTime 	 =	(By.id("eventStartTime"));	
	private By EndTime		 = 	(By.id("eventEndTime"));
	private By Topic		 = (By.id("eventTopics"));
	private By Member 		= (By.id("eventMemberlist"));
	private By Staff 		= (By.id("Helsenki"));	
	private By Notes		 =  (By.name("note"));
	private By Submitbutton  =	 (By.xpath("//button[normalize-space()='Create Event']"));
//	private By NextMonthButton = (By.xpath("//button[@aria-label='Next Month']"));
	//private By crossicon	= (By.id("DecisionPopupRejection"));
	
	public Case01_createvent(WebDriver driver) {
		super(driver);
		
	}
	@Test
	 public void Schdulevent() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		
		 	/**********************Click on Schedule master*********************************/	
			utils.clickScheduleMaster();
			utils.clickaddnewevent();
			Thread.sleep(3500);
			 // Log message to console and Allure report
	        LOGGER.info("Click on Add new event button");
	        AllureUtils.logStep("Click on Add new event button from schdule master");
				        
//			/*Enter date values*/
//			Thread.sleep(4500);
//		    WebElement datefield = driver.findElement(Date);
//		    Actions builder1 = new Actions(driver);
//		    builder1.moveToElement(datefield).click().sendKeys(eventDate).sendKeys(Keys.ENTER).perform();
//		    
			
	        /*Enter date values*/
			WebElement datefield = wait.until(ExpectedConditions.elementToBeClickable(Date));
			Actions builder1 = new Actions(driver);
			builder1.moveToElement(datefield).click().sendKeys(eventDate).sendKeys(Keys.ENTER).perform();
	        // Log message to console and Allure report
	        LOGGER.info("Click on date field and enter event date");
	        AllureUtils.logStep("Click on date field and enter event date");
	       

		   
		    /*Enter values for start time*/
		  //  Thread.sleep(3500);
		  //  WebElement startTime =driver.findElement(StartTime);
			WebElement startTime = wait.until(ExpectedConditions.elementToBeClickable(StartTime));
		    Actions builder = new Actions(driver);
		    builder.moveToElement(startTime).click().sendKeys("06:30 Pm").perform();
		    Thread.sleep(3500);
		    builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		    
			 // Log message to console and Allure report
	        LOGGER.info("Click on start time and input values for same");
	        AllureUtils.logStep("Click on start time and input values for same");
	       
	       
		    /*Enter values for end time	*/
		  //  Thread.sleep(3500);
		    //WebElement endTime =driver.findElement(EndTime);
		    WebElement endTime = wait.until(ExpectedConditions.elementToBeClickable(EndTime));
		    Actions builder11 = new Actions(driver);
		    builder11.moveToElement(endTime).click().sendKeys("07:30 PM").sendKeys(Keys.ENTER).perform();

			 // Log message to console and Allure report
	        LOGGER.info("Click on end time and input value.");
	        AllureUtils.logStep("Click on end time and input value.");
		    // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
	        
		    /*Select Event as as Live perform	*/
		 //   Thread.sleep(3500);
		    //WebElement topicselection =driver.findElement(Topic);
		    WebElement topicselection = wait.until(ExpectedConditions.elementToBeClickable(Topic));
		    Actions builder2 = new Actions(driver);
		    builder2.moveToElement(topicselection).click().sendKeys("Live perform session").sendKeys(Keys.ENTER).perform();
		    
			 // Log message to console and Allure report
	        LOGGER.info("Click on Topic time and select Live perform session.");
	        AllureUtils.logStep("Click on Topic time and select Live perform session.");
		    
		    /*Select Event as as member selection perform	*/
		  //  Thread.sleep(3500);
		    WebElement memberSelection =driver.findElement(Member);
		    Actions builder3 = new Actions(driver);
		    builder3.moveToElement(memberSelection).click().sendKeys(" Kumar Devinder").sendKeys(Keys.ENTER).perform();
		    
		    // Log message to console and Allure report
	        LOGGER.info("Click on member list and select member");
	        AllureUtils.logStep("Click on member list and select member");
		    

		    /*Select Coach & advocate from dropdown list*/
		   // Thread.sleep(3500);
		    WebElement staffSelection =driver.findElement(Staff);
		    Actions builder4 = new Actions(driver);
		    builder4.moveToElement(staffSelection).click().sendKeys("seakfreight").sendKeys(Keys.ENTER).perform();
		    builder4.moveToElement(staffSelection).click().sendKeys("Devinder").sendKeys(Keys.ENTER).perform();
		    
		    
		    // Log message to console and Allure report
	        LOGGER.info("Click on staff list and select staff");
	        AllureUtils.logStep("Click on staff list and select staff");

		   
		    /*Enter Notes in create event*/
		    driver.findElement(Notes).sendKeys("We are excited to announce that there will be a live performance event. So please availble");
		    
		    // Log message to console and Allure report
	        LOGGER.info("Click on Notes list and input values");
	        AllureUtils.logStep("Click on Notes list and input values");
		    
		 // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
		    
		    /*Click on submit button*/
		    driver.findElement(Submitbutton).click();
		    // Log message to console and Allure report
	        LOGGER.info("Click on Submit button");
	        AllureUtils.logStep("Click on submit button");
		    
		    Thread.sleep(2500);
		    
//		    // Check if the Crossclick element is displayed before clicking on it
//					WebElement allowclick = null;
//					try {
//						allowclick = driver.findElement(By.id("DecisionPopupRejection"));
//								if (allowclick.isDisplayed()) {
//					    	allowclick.click();
//					    } else {
//					        // Handle the case where the element is not displayed
//					        System.out.println("OK element is not displayed.");
//					        // Perform some other action or throw an exception if needed
//					    }
//					} catch (NoSuchElementException e) {
//					    // Handle the case where the element is not found
//					    System.out.println("Crossclick element not found.");
//					    // Perform some other action or throw an exception if needed
//					}
//		    
		    
		    Thread.sleep(5000);
		 	}
		}	