package cuesz.schdule;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.pages.BasePage;
import cuesz.web.resources.webTestdata;
import cuesz.web.resources.weblocators;

public class Step06_SE_withouttime extends BasePage {

	 public Step06_SE_withouttime(WebDriver driver) {
		super(driver);
		

	}
	@Test
	public void withouttime() throws InterruptedException {
		/* Click on Schedule master */
		driver.findElement(weblocators.scheduleIcon).click();

		/* Click on Add New Event */
		Thread.sleep(2000);
		driver.findElement(weblocators.Addnewevent).click();

		/*Enter date and then click*/
	    Thread.sleep(3500);
	    WebElement date =driver.findElement(weblocators.Date);
	    Actions builder1 = new Actions(driver);
	    builder1.moveToElement(date).click().sendKeys(webTestdata.eventDate).sendKeys(Keys.ENTER).perform();;
	    
	    // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Step06_SE_withouttime");
   
  
	    /*Select Event as as Live perform	*/
        Thread.sleep(3500);
	    WebElement eventSelection =driver.findElement(weblocators.Topic);
	    Actions builder2 = new Actions(driver);
	    builder2.moveToElement(eventSelection).click().sendKeys("Live perform session").sendKeys(Keys.ENTER).perform();
	    
	    /*Select Event as as member selection perform	*/
	    Thread.sleep(3500);
	    WebElement memberSelection =driver.findElement(weblocators.Member);
	    Actions builder3 = new Actions(driver);
	    builder3.moveToElement(memberSelection).click().sendKeys(webTestdata.membername).sendKeys(Keys.ENTER).perform();

	    /*Select Coach & advocate from dropdown list*/
	    Thread.sleep(5000);
	    WebElement staffSelection =driver.findElement(weblocators.Staff);
	    Actions builder4 = new Actions(driver);
	    builder4.moveToElement(staffSelection).click().sendKeys(webTestdata.staff1).sendKeys(Keys.ENTER).perform();
	    builder4.moveToElement(staffSelection).click().sendKeys(webTestdata.staff2).sendKeys(Keys.ENTER).perform();
	    
	    /*Enter Notes in create event*/
	    driver.findElement(weblocators.Notes).sendKeys(webTestdata.notes);

	    // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Step06_SE_withouttime2");

		/* Click on submit button */
		WebElement submitButton = driver.findElement(weblocators.Submitbutton);
		boolean isDisabled = !submitButton.isEnabled();

		// Verify the button state
		if (isDisabled) {
			System.out.println("Submit button is disabled");
		} else {
			System.out.println("Submit button is active");
		}
	}
}
