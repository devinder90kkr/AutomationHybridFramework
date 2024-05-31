
package cuesz.schdule;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.DateGenerator;

public class Step12_03_SE_create_staffevent extends BasePage {	
//	public static String eventDate = "26-09-2023"; // Date to be passed to script two
	public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date 
	
	private By Schdulemaste = 	(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[2]/div/div[1]/div/div[2]"));
	private By Addnewbuttn  = 	(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div/button"));
	private By Date 		= 	(By.id("event_date"));	
	//private By startime		=	(By.xpath("//div[contains(text(),'Start Time')]"));
	//private By endtime		=   (By.xpath("//div[contains(text(),'End Time')]"));
	//private By eventSelectn =	(By.xpath("//div[@class='react-select__value-container css-1hwfws3']"));
	//private By Staff		 =	(By.xpath("//div[@class='react-select__value-container react-select__value-container--is-multi css-1hwfws3']"));
	//private By Notes		 =  (By.xpath("//textarea[@placeholder='Enter Notes']"));
//	private By Submitbutton  =	 (By.xpath("//button[normalize-space()='Create Event']"));
	
	

	private By startime 	 =	(By.id("eventStartTime"));	
	private By endtime		 = 	(By.id("eventEndTime"));
	private By eventSelectn		 = (By.id("eventTopics"));
	private By Staff 		= (By.id("Helsenki"));	
	private By Notes		 =  (By.name("note"));
	private By Submitbutton  =	 (By.xpath("//button[normalize-space()='Create Event']"));
	
	
	
	 public Step12_03_SE_create_staffevent(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
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

	    /*Select Event as as Live perform	*/
	    Thread.sleep(2000);
	    WebElement eventSelection =driver.findElement(eventSelectn);
	    Actions builder2 = new Actions(driver);
	    builder2.moveToElement(eventSelection).click().sendKeys("Staff Meeting").sendKeys(Keys.ENTER).perform();
	    
	    /*Select Coach & advocate from dropdown list*/
	    Thread.sleep(2000);
	    WebElement staffSelection =driver.findElement(Staff);
	    Actions builder4 = new Actions(driver);
	    builder4.moveToElement(staffSelection).click().sendKeys("seakfreight").sendKeys(Keys.ENTER).perform();
	    builder4.moveToElement(staffSelection).click().sendKeys("devinder").sendKeys(Keys.ENTER).perform();

	    /*Enter Notes in create event*/
	    driver.findElement(Notes).sendKeys("We are excited to announce that there will be a live performance event. So please availble");
	    
	    /*Click on submit button*/
	    driver.findElement(Submitbutton).click();
	    
	    Thread.sleep(5000);
	 	}
	}	