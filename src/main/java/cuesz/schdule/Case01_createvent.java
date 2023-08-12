package cuesz.schdule;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;

public class Case01_createvent extends BasePage {
	
	public static String eventDate = "26-08-2023"; // Date to be passed to script two
	private By Schdulemaster = 	(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[2]/div/div[1]/div/div[2]"));
	private By Addnewbutton  = 	(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div/button"));
	private By Date 		 = 	(By.xpath("//input[@placeholder='DD-MM-YYYY']"));
	private By StartTime 	 =	(By.xpath("//div[contains(text(),'Start Time')]"));
	private By EndTime		 = 	(By.xpath("//div[contains(text(),'End Time')]"));
	private By Topic		 =  (By.xpath("//div[@class='react-select__value-container css-1hwfws3']")); 
	private By Member		 = 	(By.xpath("//div[contains(@class,'react-select__value-container css-1hwfws3')]"));
	private By Staff		 =	(By.xpath("//div[@class='react-select__value-container react-select__value-container--is-multi css-1hwfws3']"));
	private By Notes		 =  (By.xpath("//textarea[@placeholder='Enter Notes']"));
	private By Submitbutton  =	 (By.xpath("//button[normalize-space()='Create Event']"));
	
	public Case01_createvent(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@Test
	 public void Schdulevent() throws InterruptedException {
		 	/**********************Click on Schedule master*********************************/	
			WebElement schdulebutton = driver.findElement(Schdulemaster);
			schdulebutton.click();
			Thread.sleep(2000);
			/**********************Click add new Event*********************************/	
			driver.findElement(Addnewbutton).click();
			
			/*Enter date values*/
			Thread.sleep(2000);
		    WebElement datefield = driver.findElement(Date);
		    Actions builder1 = new Actions(driver);
		    builder1.moveToElement(datefield).click().sendKeys(eventDate).sendKeys(Keys.ENTER).perform();
		   
		    /*Enter values for start time*/
		    Thread.sleep(2000);
		    WebElement startTime =driver.findElement(StartTime);
		    Actions builder = new Actions(driver);
		    builder.moveToElement(startTime).click().sendKeys("06:30 Pm").perform();
		    Thread.sleep(2000);
		    builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	       
		    /*Enter values for end time	*/
		    Thread.sleep(2000);
		    WebElement endTime =driver.findElement(EndTime);
		    Actions builder11 = new Actions(driver);
		    builder11.moveToElement(endTime).click().sendKeys("07:30 PM").sendKeys(Keys.ENTER).perform();

		    /*Select Event as as Live perform	*/
		    Thread.sleep(2000);
		    WebElement topicselection =driver.findElement(Topic);
		    Actions builder2 = new Actions(driver);
		    builder2.moveToElement(topicselection).click().sendKeys("Live perform session").sendKeys(Keys.ENTER).perform();
		    
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
		    builder4.moveToElement(staffSelection).click().sendKeys("steveQA Adv").sendKeys(Keys.ENTER).perform();

		    /*Enter Notes in create event*/
		    driver.findElement(Notes).sendKeys("We are excited to announce that there will be a live performance event. So please availble");
		    
		    /*Click on submit button*/
		    driver.findElement(Submitbutton).click();
		    
		    Thread.sleep(5000);
		 	}
		}	