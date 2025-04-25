package feature.case14_schedule;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import allureframework.reporting.AllureUtils;
import commonfunction.functions.DateGenerator;
import base.BasePage;
import utils.SeleniumUtils;

public class Step14_creatguestevent extends BasePage {
	
	SeleniumUtils utils = new SeleniumUtils(driver);
	public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date
	
	private By Date 		 = (By.id("event_date"));	
	private By StartTime 	 =	(By.id("eventStartTime"));	
	private By EndTime		 = 	(By.id("eventEndTime"));
	private By Topic		 = (By.id("eventTopics"));
//	private By Member 		= (By.id("eventMemberlist"));
	private By Staff 		= (By.id("Helsenki"));	
	private By Notes		 =  (By.name("note"));
	private By Submitbutton  =	 (By.xpath("//button[normalize-space()='Create Event']"));
	private By guest		=	(By.xpath("//label[normalize-space()='Guest']"));
	private By guestname	=	(By.xpath("//input[@placeholder='Enter Name']"));
	private By guestemail	=	(By.xpath("//input[@placeholder='Email']"));

	
	public Step14_creatguestevent(WebDriver driver) {
		super(driver);
		
	}
	@Test
	 public void Schdulguestevent() throws InterruptedException {
		
		
		 	/**********************Click on Schedule master*********************************/	
			utils.clickScheduleMaster();
			utils.clickaddnewevent();
				        
			/*Enter date values*/
			Thread.sleep(4500);
		    WebElement datefield = driver.findElement(Date);
		    Actions builder1 = new Actions(driver);
		    builder1.moveToElement(datefield).click().sendKeys(eventDate).sendKeys(Keys.ENTER).perform();
		   
		    /*Enter values for start time*/
		    Thread.sleep(3500);
		    WebElement startTime =driver.findElement(StartTime);
		    Actions builder = new Actions(driver);
		    builder.moveToElement(startTime).click().sendKeys("06:30 Pm").perform();
		    Thread.sleep(3500);
		    builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	       
		    /*Enter values for end time	*/
		    Thread.sleep(3500);
		    WebElement endTime =driver.findElement(EndTime);
		    Actions builder11 = new Actions(driver);
		    builder11.moveToElement(endTime).click().sendKeys("07:30 PM").sendKeys(Keys.ENTER).perform();
		 // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
	        
		    /*Select Event as as Live perform	*/
		    Thread.sleep(3500);
		    WebElement topicselection =driver.findElement(Topic);
		    Actions builder2 = new Actions(driver);
		    builder2.moveToElement(topicselection).click().sendKeys("Mindful Consult").sendKeys(Keys.ENTER).perform();
		    
		    
		    
		    /*Select Event as as Live perform	*/
		    Thread.sleep(3500);
		    WebElement participantsselection =driver.findElement(guest);
		    Actions builder25 = new Actions(driver);
		    builder25.moveToElement(participantsselection).click().sendKeys("Mindful Consult").sendKeys(Keys.ENTER).perform();
		    

		    /*Select Event as as member selection perform	*/
		    Thread.sleep(3500);
		    WebElement guestSelection =driver.findElement(guestname);
		    Actions builder3 = new Actions(driver);
		    builder3.moveToElement(guestSelection).click().sendKeys("Kumar Devinder").perform();

		    
		    /*Select Event as as member selection perform	*/
		    Thread.sleep(3500);
		    WebElement guestemailSelection =driver.findElement(guestemail);
		    Actions builder35 = new Actions(driver);
		    builder35.moveToElement(guestemailSelection).click().sendKeys("devinder.kumar@yopmail.com").perform();
		    
		        
		    
		    /*Select Coach & advocate from dropdown list*/
		    Thread.sleep(3500);
		    WebElement staffSelection =driver.findElement(Staff);
		    Actions builder4 = new Actions(driver);
		    builder4.moveToElement(staffSelection).click().sendKeys("seakfreight").sendKeys(Keys.ENTER).perform();
		    builder4.moveToElement(staffSelection).click().sendKeys("Devinder").sendKeys(Keys.ENTER).perform();

		    /*Enter Notes in create event*/
		    driver.findElement(Notes).sendKeys("We are excited to announce that there will be a live performance event. So please availble");
		    
		 // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
		    
		    /*Click on submit button*/
		    driver.findElement(Submitbutton).click();
		    
		    Thread.sleep(5000);
		 	}
		}	