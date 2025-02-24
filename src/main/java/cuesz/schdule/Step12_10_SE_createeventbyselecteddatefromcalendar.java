package cuesz.schdule;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;

public class Step12_10_SE_createeventbyselecteddatefromcalendar extends BasePage {
	
	SeleniumUtils utils = new SeleniumUtils(driver);
	private By Topic		 = (By.id("eventTopics"));
	private By Member 		= (By.id("eventMemberlist"));
	private By Staff 		= (By.id("Helsenki"));	
	private By Notes		 =  (By.name("note"));
	private By Submitbutton  =	 (By.xpath("//button[normalize-space()='Create Event']"));

	public Step12_10_SE_createeventbyselecteddatefromcalendar(WebDriver driver) {
		super(driver);
	}
	@Test
	 public void Schdulevent() throws InterruptedException {
		
		utils.clickScheduleMaster();		
		
		
		WebElement arrowicon = driver.findElement(By.cssSelector(".react-calendar__navigation__arrow.react-calendar__navigation__next-button"));
		arrowicon.click();
		
		// Locate and click the element for the desired date (e.g., "21 October 2023")
        WebElement desiredDate = driver.findElement(By.xpath("//abbr[text()='21']"));
        desiredDate.click();
				
		WebElement calendarcontainer = driver.findElement(By.xpath("//span[normalize-space()='Day']"));
		calendarcontainer.click();
		
		
		// Assuming you want to scroll to an element with the class name 'rbc-events-container'
        WebElement dateElement = driver.findElement(By.className("rbc-events-container"));

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

	    /*Enter Notes in create event*/
	    driver.findElement(Notes).sendKeys("We are excited to announce that there will be a live performance event. So please availble");
	    
	    /*Click on submit button*/
	    driver.findElement(Submitbutton).click();
	
  
	

	}
}