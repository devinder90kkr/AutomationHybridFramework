package cuesz.schdule;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.DateGenerator;

public class Step07_MC_createevent extends BasePage {
	public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date
	
//	public static String eventDate = "28-09-2023"; // Date to be passed to script two
	private By membercalicon 	=  (By.xpath("//a[@href='/member-calls']//span"));
	private By Addnewevent 		=  (By.xpath("//button[normalize-space()='Add New Event']"));
	private By startdate 		=  (By.xpath("//input[@placeholder='DD-MM-YYYY']"));
	private By starttime		=  (By.xpath("//div[contains(text(),'Start Time')]"));
	private By endtime 			=  (By.xpath("//div[contains(text(),'End Time')]"));
	private By eventselect		=  (By.xpath("//div[@class='react-select__value-container css-1hwfws3']"));
	private By memberselect		=  (By.xpath("//div[contains(@class,'react-select__value-container css-1hwfws3')]"));
	private By staffSelect		=  (By.xpath("//div[@class='react-select__value-container react-select__value-container--is-multi css-1hwfws3']"));
	private By notes			=  (By.xpath("//textarea[@placeholder='Enter Notes']"));
	private By createeven		=  (By.xpath("//button[normalize-space()='Create Event']"));


 public Step07_MC_createevent(WebDriver driver) {
	super(driver);
	// TODO Auto-generated constructor stub

}
@Test
	public void Schdulevent() throws InterruptedException {	
	
		 /*Click on Member calendar*/		
		WebElement Membercalendar= driver.findElement(membercalicon);
		Membercalendar.click();
	    
		/*Click on Add New Event*/		
	    Thread.sleep(2000);
	    driver.findElement(Addnewevent).click();
	   
	    /*Enter date and then click*/
	    Thread.sleep(2000);
	    WebElement datepicker =driver.findElement(startdate);
	    Actions builder1 = new Actions(driver);
	    builder1.moveToElement(datepicker).click().sendKeys(eventDate).sendKeys(Keys.ENTER).perform();;
	    
	   
	    /*Enter values for start time*/
	    Thread.sleep(2000);
	    WebElement startTime =driver.findElement(starttime);
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
	    WebElement eventSelection =driver.findElement(eventselect);
	    Actions builder2 = new Actions(driver);
	    builder2.moveToElement(eventSelection).click().sendKeys("Live perform session").sendKeys(Keys.ENTER).perform();
	    
	    /*Select Event as as member selection perform	*/
	    Thread.sleep(2000);
	    WebElement memberSelection =driver.findElement(memberselect);
	    Actions builder3 = new Actions(driver);
	    builder3.moveToElement(memberSelection).click().sendKeys(" Kumar Devinder").sendKeys(Keys.ENTER).perform();

	    /*Select Coach & advocate from dropdown list*/
	    Thread.sleep(2000);
	    WebElement staffSelection =driver.findElement(staffSelect);
	    Actions builder4 = new Actions(driver);
	    builder4.moveToElement(staffSelection).click().sendKeys("seakfreight").sendKeys(Keys.ENTER).perform();
	    builder4.moveToElement(staffSelection).click().sendKeys("steveQA Adv").sendKeys(Keys.ENTER).perform();

	    /*Enter Notes in create event*/
	    driver.findElement(notes).sendKeys("We are excited to announce that there will be a live performance event. So please availble");
	    
	    /*Click on submit button*/
	    driver.findElement(createeven).click();
	    
	    Thread.sleep(5000);
	 	}
	}	