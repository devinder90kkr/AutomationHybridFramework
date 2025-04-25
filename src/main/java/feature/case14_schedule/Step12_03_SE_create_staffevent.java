
package feature.case14_schedule;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import commonfunction.functions.DateGenerator;	
import base.BasePage;
import constant.webTestdata;
import constant.weblocators;

public class Step12_03_SE_create_staffevent extends BasePage {	
	public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date 
	
	 public Step12_03_SE_create_staffevent(WebDriver driver) {
		super(driver);
		
	}

	@Test
	public void Schdulevent() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		 /*Click on Schedule master*/		
		WebElement Schdulemaster= driver.findElement(weblocators.Schdulemaste);
		Schdulemaster.click();
	    
		/*Click on Add New Event*/		
	    Thread.sleep(2000);
	    driver.findElement(weblocators.Addnewbuttn).click();
	    
	    /*Enter date values*/
		WebElement datefield = wait.until(ExpectedConditions.elementToBeClickable(weblocators.Date));
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(datefield).click().sendKeys(eventDate).sendKeys(Keys.ENTER).perform();
        
        
        /*Enter start Time values*/
		WebElement startTime = wait.until(ExpectedConditions.elementToBeClickable(weblocators.StartTime));
	    Actions builder = new Actions(driver);
	    builder.moveToElement(startTime).click().sendKeys(webTestdata.startime).perform();
	    Thread.sleep(3500);
	    builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();	    
       
	    /*Enter values for end time	*/
	    WebElement endTime = wait.until(ExpectedConditions.elementToBeClickable(weblocators.EndTime));
	    Actions builder11 = new Actions(driver);
	    builder11.moveToElement(endTime).click().sendKeys(webTestdata.endtime).sendKeys(Keys.ENTER).perform();

	    /*Select Event as as Live perform	*/
	    Thread.sleep(2000);
	    WebElement eventSelection =driver.findElement(weblocators.eventSelectn);
	    Actions builder2 = new Actions(driver);
	    builder2.moveToElement(eventSelection).click().sendKeys(webTestdata.topic2).sendKeys(Keys.ENTER).perform();
	    
	    /*Select Coach & advocate from dropdown list*/
	    Thread.sleep(2000);
	    WebElement staffSelection =driver.findElement(weblocators.Staff);
	    Actions builder4 = new Actions(driver);
	    builder4.moveToElement(staffSelection).click().sendKeys(webTestdata.staff1).sendKeys(Keys.ENTER).perform();
	    builder4.moveToElement(staffSelection).click().sendKeys(webTestdata.staff2).sendKeys(Keys.ENTER).perform();

	     /*Enter Notes in create event*/
		    driver.findElement(weblocators.Notes).sendKeys(webTestdata.notes);
	    
	    /*Click on submit button*/
	    driver.findElement(weblocators.Submitbutton).click();
	    
	    Thread.sleep(5000);
	 	}
	}	