package cuesz.schdule;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.AllureUtils;

public class Step06_SE_withouttime extends BasePage {
		
	private By scheduleIcon 	=  (By.xpath("//a[@href='/member-calls']//span"));
	private By Addnewevent 		=  (By.xpath("//button[normalize-space()='Add New Event']"));
//	private By startdate 		=  (By.xpath("//input[@placeholder='DD-MM-YYYY']"));
//	private By starttime		=  (By.xpath("//div[contains(text(),'Start Time')]"));
//	private By endtime 			=  (By.xpath("//div[contains(text(),'End Time')]"));
//	private By eventselect		=  (By.xpath("//div[@class='react-select__value-container css-1hwfws3']"));
//	private By memberselect		=  (By.xpath("//div[contains(@class,'react-select__value-container css-1hwfws3')]"));
//	private By staffSelect		=  (By.xpath("//div[@class='react-select__value-container react-select__value-container--is-multi css-1hwfws3']"));
//	private By notes			=  (By.xpath("//textarea[@placeholder='Enter Notes']"));
//	private By submitbuttn		=  (By.xpath("//div[@class='mt-3']/button"));
	
	private By Date 		 = (By.id("event_date"));	
//	private By StartTime 	 =	(By.id("eventStartTime"));	
//	private By EndTime		 = 	(By.id("eventEndTime"));
	private By Topic		 = (By.id("eventTopics"));
	private By Member 		= (By.id("eventMemberlist"));
	private By Staff 		= (By.id("Helsenki"));	
	private By Notes		 =  (By.name("note"));
	private By Submitbutton  =	 (By.xpath("//button[normalize-space()='Create Event']"));
	
	
	
	 public Step06_SE_withouttime(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub

	}
	@Test
	public void withouttime() throws InterruptedException {
		/* Click on Schedule master */
		driver.findElement(scheduleIcon).click();

		/* Click on Add New Event */
		Thread.sleep(2000);
		driver.findElement(Addnewevent).click();

		/*Enter date and then click*/
	    Thread.sleep(2000);
	    WebElement date =driver.findElement(Date);
	    Actions builder1 = new Actions(driver);
	    builder1.moveToElement(date).click().sendKeys("30-07-2023").sendKeys(Keys.ENTER).perform();;
	    
	    // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
        
//	    /* Skip start time and end time fields */
//        Thread.sleep(2000);
//        WebElement startTime = driver.findElement(starttime);
//        WebElement endTime11 = driver.findElement(endtime);
//        Actions builder = new Actions(driver);
//        builder.moveToElement(startTime).click().sendKeys(Keys.TAB).sendKeys(Keys.CONTROL + "a").sendKeys(Keys.DELETE).perform();
//        builder.moveToElement(endTime11).click().sendKeys(Keys.TAB).sendKeys(Keys.CONTROL + "a").sendKeys(Keys.DELETE).perform();
   
        
	    /*Select Event as as Live perform	*/
	    Thread.sleep(2000);
	    WebElement eventSelection =driver.findElement(Topic);
	    Actions builder2 = new Actions(driver);
	    builder2.moveToElement(eventSelection).click().sendKeys("Live perform session").sendKeys(Keys.ENTER).perform();
	    
	    /*Select Event as as member selection perform	*/
	    Thread.sleep(5000);
	    WebElement memberSelection =driver.findElement(Member);
	    Actions builder3 = new Actions(driver);
	    builder3.moveToElement(memberSelection).click().sendKeys(" Kumar Devinder").sendKeys(Keys.ENTER).perform();

	    /*Select Coach & advocate from dropdown list*/
	    Thread.sleep(5000);
	    WebElement staffSelection =driver.findElement(Staff);
	    Actions builder4 = new Actions(driver);
	    builder4.moveToElement(staffSelection).click().sendKeys("seakfreight").sendKeys(Keys.ENTER).perform();
	    builder4.moveToElement(staffSelection).click().sendKeys("steveQA Adv").sendKeys(Keys.ENTER).perform();
	    
	    /*Enter Notes in create event*/
	    driver.findElement(Notes).sendKeys("We are excited to announce that there will be a live performance event. So please availble");

	    // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");

		/* Click on submit button */
		WebElement submitButton = driver.findElement(Submitbutton);
		String isDisabled = submitButton.getAttribute("disabled");

		// Verify the button state
		if (isDisabled != null && isDisabled.equals("true")) {
			System.out.println("Submit button is disabled");
		} else {
			System.out.println("Submit button is active");
		}
	}
}
