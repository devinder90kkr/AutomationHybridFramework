//package liveperform;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.Test;
//
//import base.BasePage;
//import utils.AllureUtils;
//import utils.Currentdategenerator;
//import utils.SeleniumUtils;
//
//public class Case72_creatLiveperform extends BasePage {
//	
//	SeleniumUtils utils = new SeleniumUtils(driver);
//	public static String eventDate = Currentdategenerator.generateCurrentDate(); // Use the generated date
//	
//	private By Date 		 = (By.id("event_date"));	
//	private By StartTime 	 =	(By.id("eventStartTime"));	
//	private By EndTime		 = 	(By.id("eventEndTime"));
//	private By Topic		 = (By.id("eventTopics"));
//	private By Member 		= (By.id("eventMemberlist"));
//	private By Staff 		= (By.id("Helsenki"));	
//	private By Notes		 =  (By.name("note"));
//	private By Submitbutton  =	 (By.xpath("//button[normalize-space()='Create Event']"));
//	private By crossicon	= (By.id("DecisionPopupRejection"));
//	
//	public Case72_creatLiveperform(WebDriver driver) {
//		super(driver);
//		
//	}	
//	@Test
//	 public void Schdulevent() throws InterruptedException {
//		
//
//		 	/**********************Click on Schedule master*********************************/	
//			utils.clickScheduleMaster();
//			utils.clickaddnewevent();
//				        
//			/*Enter date values*/
//			Thread.sleep(2000);
//		    WebElement datefield = driver.findElement(Date);
//		    Actions builder1 = new Actions(driver);
//		    builder1.moveToElement(datefield).click().sendKeys(eventDate).sendKeys(Keys.ENTER).perform();
//		   
//		    /*Enter values for start time*/
//		    Thread.sleep(2000);
//		    WebElement startTime =driver.findElement(StartTime);
//		    Actions builder = new Actions(driver);
//		  //  builder.moveToElement(startTime).click().sendKeys("06:30 Pm").perform();
//		    Thread.sleep(2000);
//		    builder.moveToElement(startTime).click().sendKeys(Keys.TAB).perform();
//	       
//		    /*Enter values for end time	*/
//		    Thread.sleep(2000);
//		    WebElement endTime =driver.findElement(EndTime);
//		    Actions builder11 = new Actions(driver);
//		    builder11.moveToElement(endTime).click().sendKeys(Keys.TAB).perform();
//		    //builder11.moveToElement(endTime).click().sendKeys("07:30 PM").sendKeys(Keys.ENTER).perform();
//		 // Capture a screenshot and attach it to Allure
//	        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
//	        
//		    /*Select Event as as Live perform	*/
//		    Thread.sleep(2000);
//		    WebElement topicselection =driver.findElement(Topic);
//		    Actions builder2 = new Actions(driver);
//		    builder2.moveToElement(topicselection).click().sendKeys("Live perform session").sendKeys(Keys.ENTER).perform();
//		    
//		    /*Select Event as as member selection perform	*/
//		    Thread.sleep(2000);
//		    WebElement memberSelection =driver.findElement(Member);
//		    Actions builder3 = new Actions(driver);
//		  //  builder3.moveToElement(memberSelection).click().sendKeys(" Kumar Devinder").sendKeys(Keys.ENTER).perform();
//		    builder3.moveToElement(memberSelection).click().sendKeys(" Richard ").sendKeys(Keys.ENTER).perform();
//
//		    
//		    
//		    /*Select Coach & advocate from dropdown list*/
//		    Thread.sleep(2000);
//		    WebElement staffSelection =driver.findElement(Staff);
//		    Actions builder4 = new Actions(driver);
//		    builder4.moveToElement(staffSelection).click().sendKeys("seakfreight").sendKeys(Keys.ENTER).perform();
//		    builder4.moveToElement(staffSelection).click().sendKeys("steveQA Adv").sendKeys(Keys.ENTER).perform();
//
//		    /*Enter Notes in create event*/
//		    driver.findElement(Notes).sendKeys("We are excited to announce that there will be a live performance event. So please availble");
//		    
//		 // Capture a screenshot and attach it to Allure
//	        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
//		    
//		    /*Click on submit button*/
//		    driver.findElement(Submitbutton).click();
//		    // Capture a screenshot and attach it to Allure
//	        AllureUtils.captureScreenshot(driver, "Case72_creatLiveperform");
//		    
//	     // Check if the Crossclick element is displayed before clicking on it
//	     			WebElement Crossclick = null;
//	     			try {
//	     			    Crossclick = driver.findElement(crossicon);
//	     			    if (Crossclick.isDisplayed()) {
//	     			        Crossclick.click();
//	     			    } else {
//	     			        // Handle the case where the element is not displayed
//	     			        System.out.println("Crossclick element is not displayed.");
//	     			        // Perform some other action or throw an exception if needed
//	     			    }
//	     			} catch (NoSuchElementException e) {
//	     			    // Handle the case where the element is not found
//	     			    System.out.println("Crossclick element not found.");
//	     			    // Perform some other action or throw an exception if needed
//	     			}
//		    
//		    
//		    Thread.sleep(8000);
//		 	}
//		}	


package feature.case12_liveperform;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import allureframework.reporting.AllureUtils;
import commonfunction.functions.Currentdategenerator;
import base.BasePage;
import utils.SeleniumUtils;

public class Case72_creatLiveperform extends BasePage {
	
	SeleniumUtils utils = new SeleniumUtils(driver);
	public static String eventDate = Currentdategenerator.generateCurrentDate(); // Use the generated date
	
	private By Date 		 = (By.id("event_date"));	
	private By StartTime 	 =	(By.id("eventStartTime"));	
	private By EndTime		 = 	(By.id("eventEndTime"));
	private By Topic		 = (By.id("eventTopics"));
	private By Member 		= (By.id("eventMemberlist"));
	private By Staff 		= (By.id("Helsenki"));	
	private By Notes		 =  (By.name("note"));
	private By Submitbutton  =	 (By.xpath("//button[normalize-space()='Create Event']"));
	private By crossicon    = (By.id("DecisionPopupRejection"));
	
	public Case72_creatLiveperform(WebDriver driver) {
		super(driver);
		
	}	
	@Test
	 public void Schdulevent() throws InterruptedException {
		

		 	/**********************Click on Schedule master*********************************/	
			utils.clickScheduleMaster();
			utils.clickaddnewevent();
				        
			/*Enter date values*/
			Thread.sleep(2000);
		    WebElement datefield = driver.findElement(Date);
		    Actions builder1 = new Actions(driver);
		    builder1.moveToElement(datefield).click().sendKeys(eventDate).sendKeys(Keys.ENTER).perform();
		   
		    /*Enter values for start time*/
		    Thread.sleep(2000);
		    WebElement startTime =driver.findElement(StartTime);
		    Actions builder = new Actions(driver);
		  //  builder.moveToElement(startTime).click().sendKeys("06:30 Pm").perform();
		    Thread.sleep(2000);
		    builder.moveToElement(startTime).click().sendKeys(Keys.TAB).perform();
	       
		    /*Enter values for end time	*/
		    Thread.sleep(2000);
		    WebElement endTime =driver.findElement(EndTime);
		    Actions builder11 = new Actions(driver);
		    builder11.moveToElement(endTime).click().sendKeys(Keys.TAB).perform();
		    //builder11.moveToElement(endTime).click().sendKeys("07:30 PM").sendKeys(Keys.ENTER).perform();
		 // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
	        
		    /*Select Event as as Live perform	*/
		    Thread.sleep(2000);
		    WebElement topicselection =driver.findElement(Topic);
		    Actions builder2 = new Actions(driver);
		    builder2.moveToElement(topicselection).click().sendKeys("Live perform session").sendKeys(Keys.ENTER).perform();
		    
		    /*Select Event as as member selection perform	*/
		    Thread.sleep(2000);
		    WebElement memberSelection =driver.findElement(Member);
		    Actions builder3 = new Actions(driver);
		    builder3.moveToElement(memberSelection).click().sendKeys("Kumar Devinder").sendKeys(Keys.ENTER).perform();

		    /*Select Coach & advocate from dropdown list*/
		    Thread.sleep(2000);
		    WebElement staffSelection =driver.findElement(Staff);
		    Actions builder4 = new Actions(driver);
		    builder4.moveToElement(staffSelection).click().sendKeys("steveQA").sendKeys(Keys.ENTER).perform();
		    builder4.moveToElement(staffSelection).click().sendKeys("seak").sendKeys(Keys.ENTER).perform();

		    /*Enter Notes in create event*/
		    driver.findElement(Notes).sendKeys("We are excited to announce that there will be a live performance event. So please be available");
		    
		 // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
		    
		    /*Click on submit button*/
		    driver.findElement(Submitbutton).click();
		    // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "Case72_creatLiveperform");
	       
	        // Check if the Crossclick element is displayed before clicking on it
	        WebElement Crossclick = null;
	        try {
	            Crossclick = driver.findElement(crossicon);
	            if (Crossclick.isDisplayed()) {
	                Crossclick.click();
	            } else {
	                // Handle the case where the element is not displayed
	                System.out.println("Crossclick element is not displayed.");
	                // Perform some other action or throw an exception if needed
	            }
	        } catch (NoSuchElementException e) {
	            // Handle the case where the element is not found
	            System.out.println("Crossclick element not found.");
	            // Perform some other action or throw an exception if needed
	        }
            
	        
		    Thread.sleep(8000);
		 	}
		}	

