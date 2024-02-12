package cuesz.schdule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.AllureUtils;
import cuesz.utils.SeleniumUtils;

public class Step12_08_SE_createvent extends BasePage {
	
	SeleniumUtils utils = new SeleniumUtils(driver);
	
//	public static String eventDate = "26-08-2023"; // Date to be passed to script two
//	private By Date 		 = (By.id("event_date"));	
//	private By StartTime 	 =	(By.id("eventStartTime"));	
//	private By EndTime		 = 	(By.id("eventEndTime"));
	private By Topic		 = (By.id("eventTopics"));
	private By Member 		= (By.id("eventMemberlist"));
	private By Staff 		= (By.id("Helsenki"));	
	private By Notes		 =  (By.name("note"));
	private By Submitbutton  =	 (By.xpath("//button[normalize-space()='Create Event']"));
	
	public Step12_08_SE_createvent(WebDriver driver) {
		super(driver);
		
	}
	@Test
	 public void Schdulevent() throws InterruptedException {
		 	/**********************Click on Schedule master*********************************/	
			utils.clickScheduleMaster();		
			
			
			// Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "Step12_08_SE_createvent1");
			Thread.sleep(3500);	
			WebElement dayview = driver.findElement(By.xpath("//span[normalize-space()='Next']"));
			dayview.click();
			
			
			// Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "Step12_08_SE_createvent2");
			
			Thread.sleep(3500);
			WebElement calendarcontainer = driver.findElement(By.xpath("//span[normalize-space()='Day']"));
			calendarcontainer.click();
			
			// Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "Step12_08_SE_createvent3");
			
			Thread.sleep(2500);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50) );
			WebElement dateElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("rbc-events-container")));
			
	        // Scroll to the element using JavaScript
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dateElement);

	        // Move to the element before clicking it (optional)
	        Actions actions = new Actions(driver);
	        actions.moveToElement(dateElement).click().perform();
			
		    /*Select Event as as Live perform	*/
		    Thread.sleep(2000);
		    WebElement topicselection =driver.findElement(Topic);
		    Actions builder2 = new Actions(driver);
		    builder2.moveToElement(topicselection).click().sendKeys("Live perform session").sendKeys(Keys.ENTER).perform();
		    
		    
		 // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "Step12_08_SE_createvent4");
		    /*Select Event as as member selection perform	*/
		    Thread.sleep(2000);
		    WebElement memberSelection =driver.findElement(Member);
		    Actions builder3 = new Actions(driver);
		    builder3.moveToElement(memberSelection).click().sendKeys(" Kumar Devinder").sendKeys(Keys.ENTER).perform();

		    /*Select Coach & advocate from dropdown list*/
		    Thread.sleep(2000);
		    WebElement staffSelection =driver.findElement(Staff);
		    Actions builder4 = new Actions(driver);
		    builder4.moveToElement(staffSelection).click().sendKeys("seakfreight").sendKeys(Keys.ENTER).perform();
		    builder4.moveToElement(staffSelection).click().sendKeys("devinder").sendKeys(Keys.ENTER).perform();

		    
		 // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "Step12_08_SE_createvent5");
		    
		    /*Enter Notes in create event*/
		    driver.findElement(Notes).sendKeys("We are excited to announce that there will be a live performance event. So please availble");
		    
		    /*Click on submit button*/
		    driver.findElement(Submitbutton).click();
		    
  
		    
		    Thread.sleep(5000);
		 	}
		}	