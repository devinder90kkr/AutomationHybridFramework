
package cuesz.schdule;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;

public class Step12_02_SE_createvent_withpastdate extends BasePage {
	
	 public static String eventDate = "01-09-2023"; // Date to be passed to script two
	 private By Schdulemaste = 	(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[2]/div/div[1]/div/div[2]"));
	 private By Addnewbuttn  = 	(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div/button"));
	 private By Date 		= 	(By.id("event_date"));	
	 private By labeltxt	=	(By.id("eventTopics"));
	 private By Member		 = 	(By.id("eventMemberlist"));
	 private By Staff		 =	(By.id("Helsenki"));
	 private By Notes		 =  (By.name("note"));
	 private By Submitbutton  =	 (By.xpath("//button[normalize-space()='Create Event']"));
		

	 public Step12_02_SE_createvent_withpastdate(WebDriver driver) {
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
	    
	    /*Select Event as as Live perform	*/
	    Thread.sleep(2000);
	    WebElement eventSelection =driver.findElement(labeltxt);
	    Actions builder2 = new Actions(driver);
	    builder2.moveToElement(eventSelection).click().sendKeys("Live perform session").sendKeys(Keys.ENTER).perform();
	    
//	    /*Select Event as as member selection perform	*/
//	    Thread.sleep(2000);
//	    WebElement memberSelection =driver.findElement(Member);
//	    Actions builder3 = new Actions(driver);
//	    builder3.moveToElement(memberSelection).click().sendKeys(" Kumar Devinder").sendKeys(Keys.ENTER).perform();
//
//	    /*Select Coach & advocate from dropdown list*/
//	    Thread.sleep(2000);
//	    WebElement staffSelection =driver.findElement(Staff);
//	    Actions builder4 = new Actions(driver);
//	    builder4.moveToElement(staffSelection).click().sendKeys("seakfreight").sendKeys(Keys.ENTER).perform();
//	    builder4.moveToElement(staffSelection).click().sendKeys("steveQA Adv").sendKeys(Keys.ENTER).perform();

	    /*Enter Notes in create event*/
	    driver.findElement(Notes).sendKeys("We are excited to announce that there will be a live performance event. So please availble");
	    
	 // Locate the button element
        WebElement buttonElement = driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary w-100']"));

        // Get the background property
        String buttonBackground = buttonElement.getCssValue("background");

        // Check if the button is enabled
        boolean isEnabled = buttonElement.isEnabled();

        // Check button color and disabled state
        if (isEnabled) {
            if (buttonBackground.contains("linear-gradient")) {
                System.out.println("The button is enabled and has a gradient background.");
            } else {
                System.out.println("The button is enabled and has a solid background color.");
            }
        } else {
            System.out.println("The button is disabled.");
            
            Thread.sleep(2500);
	    
	    Thread.sleep(5000);
	 	}
	}
}