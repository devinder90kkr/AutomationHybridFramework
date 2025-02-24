
package cuesz.schdule;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import cuesz.date.functions.DateGenerator;
import cuesz.pages.BasePage;

public class Step12_07_SE_create_eventwithoutopic extends BasePage {
	public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date
//	public static String eventDate = "26-09-2023"; // Date to be passed to script two
	
	private By Schdulemaste = 	(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[2]/div/div[1]/div/div[2]"));
	private By Addnewbuttn  = 	(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div/button"));
	private By Date 		= 	(By.id("event_date"));	
//	private By startime		=	(By.xpath("//div[contains(text(),'Start Time')]"));
//	private By endtime		= (By.xpath("//div[contains(text(),'End Time')]"));
//	private By Notes		 =  (By.xpath("//textarea[@placeholder='Enter Notes']"));
//	private By Submitbutton  =	 (By.xpath("//button[normalize-space()='Create Event']"));
//	

	private By startime 	 =	(By.id("eventStartTime"));	
	private By endtime		 = 	(By.id("eventEndTime"));
	private By Notes		 =  (By.name("note"));
	private By Submitbutton  =	 (By.xpath("//button[normalize-space()='Create Event']"));
	
	

	 public Step12_07_SE_create_eventwithoutopic(WebDriver driver) {
		super(driver);
	}

	@Test
	public void Schdulevent() throws InterruptedException {
		 /*Click on Schedule master*/		
		WebElement Schdulemaster= driver.findElement(Schdulemaste);
		Schdulemaster.click();
	    
		/*Click on Add New Event*/		
	    Thread.sleep(2000);
	    driver.findElement(Addnewbuttn).click();
	   
	    /*Enter date and then click*/
	    Thread.sleep(2000);
	    WebElement endTime1 =driver.findElement(Date);
	    Actions builder1 = new Actions(driver);
	    builder1.moveToElement(endTime1).click().sendKeys(eventDate).sendKeys(Keys.ENTER).perform();;
	    
	   
	    /*Enter values for start time*/
	    Thread.sleep(2000);
	    WebElement startTime =driver.findElement(startime);
	    Actions builder = new Actions(driver);
	    builder.moveToElement(startTime).click().sendKeys("06:30 Pm").perform();
	    Thread.sleep(2000);
	    builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
       
	    /*Enter values for end time	*/
	    Thread.sleep(2000);
	    WebElement endTime11 =driver.findElement(endtime);
	    Actions builder11 = new Actions(driver);
	    builder11.moveToElement(endTime11).click().sendKeys("07:30 PM").sendKeys(Keys.ENTER).perform();
	    
//	    /*Enter Notes in create event*/
//	    driver.findElement(By.xpath("//label[text()=\"Notes\"]/following-sibling::textarea[@name=\"note\"]")).sendKeys("We are excited to announce that there will be a live performance event. So please availble");
//	    
	    
	    /*Enter Notes in create event*/
	    driver.findElement(Notes).sendKeys("We are excited to announce that there will be a live performance event. So please availble");
	    
	    /*Click on submit button*/
	    driver.findElement(Submitbutton).click();
	    
	    Thread.sleep(5000);
	 	}
	}	