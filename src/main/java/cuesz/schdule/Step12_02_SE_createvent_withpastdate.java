
package cuesz.schdule;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.web.resources.webTestdata;
import cuesz.web.resources.weblocators;

public class Step12_02_SE_createvent_withpastdate extends BasePage {
	
	 public static String eventDate = "01-09-2023"; // Date to be passed to script two

	 public Step12_02_SE_createvent_withpastdate(WebDriver driver) {
		super(driver);
		
	}

	 @Test 
	public void Schdulevent() throws InterruptedException {
		 /*Click on Schedule master*/		
		WebElement Schdulemaster= driver.findElement(weblocators.Schdulemaste);
		Schdulemaster.click();
	    
		/*Click on Add New Event*/		
	    Thread.sleep(2000);
	    driver.findElement(weblocators.Addnewbuttn).click();
	   
	    /*Enter date and then click*/
	    Thread.sleep(2000);
	    WebElement endTime1 =driver.findElement(weblocators.Date);
	    Actions builder1 = new Actions(driver);
	    builder1.moveToElement(endTime1).click().sendKeys(eventDate).sendKeys(Keys.ENTER).perform();;
	    
	    /*Select Event as as Live perform	*/
	    Thread.sleep(2000);
	    WebElement eventSelection =driver.findElement(weblocators.labeltxt);
	    Actions builder2 = new Actions(driver);
	    builder2.moveToElement(eventSelection).click().sendKeys(webTestdata.topic).sendKeys(Keys.ENTER).perform();
	    
	    /*Enter Notes in create event*/
	    driver.findElement(weblocators.Notes).sendKeys(webTestdata.notes);
	    
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