package cuesz.schdule;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;

public class Step06_SE_withoutdate extends BasePage {
		
	private By scheduleIcon 	=  (By.xpath("//a[@href='/member-calls']//span"));
	private By Addnewevent 		=  (By.xpath("//button[normalize-space()='Add New Event']"));
	private By startdate 		=  (By.xpath("//input[@placeholder='DD-MM-YYYY']"));
	private By starttime		=  (By.xpath("//div[contains(text(),'Start Time')]"));
	private By endtime 			=  (By.xpath("//div[contains(text(),'End Time')]"));
	private By eventselect		=  (By.xpath("//div[@class='react-select__value-container css-1hwfws3']"));
	private By memberselect		=  (By.xpath("//div[contains(@class,'react-select__value-container css-1hwfws3')]"));
	private By staffSelect		=  (By.xpath("//div[@class='react-select__value-container react-select__value-container--is-multi css-1hwfws3']"));
	private By notes			=  (By.xpath("//textarea[@placeholder='Enter Notes']"));
	private By submitbuttn		=  (By.xpath("//div[@class='mt-3']/button"));
	
	
	 public Step06_SE_withoutdate(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub

	}
	@Test
	public void withoutdate() throws InterruptedException {
		/* Click on Schedule master */
		driver.findElement(scheduleIcon).click();

		/* Click on Add New Event */
		Thread.sleep(2000);
		driver.findElement(Addnewevent).click();

		/*Enter date and then click*/
	    Thread.sleep(2000);
	    WebElement date =driver.findElement(startdate);
	    Actions builder1 = new Actions(driver);
	    builder1.moveToElement(date).click().sendKeys("30-07-2023").sendKeys(Keys.ENTER).perform();;
	    
	    
	    /* Skip start time and end time fields */
        Thread.sleep(2000);
        WebElement startTime = driver.findElement(starttime);
        WebElement endTime11 = driver.findElement(endtime);
        Actions builder = new Actions(driver);
        builder.moveToElement(startTime).click().sendKeys(Keys.TAB).sendKeys(Keys.CONTROL + "a").sendKeys(Keys.DELETE).perform();
        builder.moveToElement(endTime11).click().sendKeys(Keys.TAB).sendKeys(Keys.CONTROL + "a").sendKeys(Keys.DELETE).perform();
   
        
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


		/* Click on submit button */
		WebElement submitButton = driver.findElement(submitbuttn);
		String isDisabled = submitButton.getAttribute("disabled");

		// Verify the button state
		if (isDisabled != null && isDisabled.equals("true")) {
			System.out.println("Submit button is disabled");
		} else {
			System.out.println("Submit button is active");
		}
	}
}
