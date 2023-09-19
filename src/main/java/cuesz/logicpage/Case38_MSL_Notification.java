	package cuesz.logicpage;

import java.text.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;

public class Case38_MSL_Notification extends BasePage {
	
	public Case38_MSL_Notification(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	 @Test
	    public void Notificationnotes() throws InterruptedException, ParseException {
	        Thread.sleep(2000);

	        // Click on the Member Summary button or link
	       WebElement Membersummary = driver.findElement(By.xpath("//img[@alt='Member Summary']"));
	       Membersummary.click();

	       // Enter the name in the search field
	       WebElement Membersearch =   driver.findElement(By.xpath("//input[@placeholder='Search Members']"));
	       Membersearch.sendKeys("Kumar Devinder");
   		   
   		   Thread.sleep(2000);
   		   driver.findElement(By.xpath("//div[@class='member-items']")).click();

   		   /***********************************landed on Logic page ***************************************************************************************************/
   		   Thread.sleep(2000);
   		   WebElement Logicbutton =   driver.findElement(By.xpath("//span[normalize-space()='Logic Page']"));
   		   Logicbutton.click();
	        
	   
	    /***************************************Click on Notification notes and scroll******************************************************************************************/
   		   
   		   Thread.sleep(5000);
   		   // Find the "Notification Notes" element
   		   WebElement NotificationNotesElement = driver.findElement(By.xpath("//div[contains(text(), 'Notification')]"));
   		   // Scroll to the "Staff Notes" element using JavaScriptExecutor
   		   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'center'});", NotificationNotesElement);
           
   		   Thread.sleep(1000);  
   		   WebElement Notificationnoteplus = driver.findElement(By.xpath("//h2[@id='Notification']//button[1]"));
   		   Notificationnoteplus.click();
	        

	    /****************************************Click on next & previous button and get week*****************************************************************************************************/        
	     // Find the current week element
	      WebElement currentWeekElement = driver.findElement(By.xpath("//h4[@class='orange' and text()='Current Week']"));

	    // Get the week name from the current week element
	      String weekName = currentWeekElement.getText();
	      System.out.println("Current week name: " + weekName);

	      Thread.sleep(2000);
	   // If the current week is visible, perform the actions as described
	      if (currentWeekElement.isDisplayed()) {
	   // Click on "Last Week" button twice
	      WebElement lastWeekButton = driver.findElement(By.xpath("//button[contains(.,'Last Week')]"));
	        for (int i = 0; i < 2; i++) {
	           lastWeekButton.click();
	        Thread.sleep(2000); // Add a small delay between clicks
	         }

	   // Print the name of the "Last Week" after clicking the button twice
	        String lastWeekName = currentWeekElement.getText();
	        System.out.println("Last week name: " + lastWeekName);

	            // Click on "Next Week" button four times
	            WebElement nextWeekButton = driver.findElement(By.xpath("//button[contains(.,'Next Week')]"));
	            for (int i = 0; i < 3; i++) {
	                nextWeekButton.click();
	                Thread.sleep(2000); // Add a small delay between clicks
	            }

	            // Print the name of the "Next Week" after clicking the button four times
	            String nextWeekName = currentWeekElement.getText();
	            System.out.println("Next week name: " + nextWeekName);
	        }
	        
	        Thread.sleep(2000);
	    /************************************************Input data as per next week selected and populate data in three days***************************************************************************************************/
	      
	        WebElement selecttype = driver.findElement(By.id("NotificationType-Monday"));
	        Actions builder1 = new Actions(driver);
		    builder1.moveToElement(selecttype).click().sendKeys("Training day").perform();
		    Thread.sleep(2000);
		    builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	        
		    WebElement selecthours = driver.findElement(By.id("NotificationHours-Monday"));
	        Actions builder2 = new Actions(driver);
	        builder2.moveToElement(selecthours).click().sendKeys("20").perform();
		    Thread.sleep(2000);
		    builder2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		        
		    WebElement selectmins = driver.findElement(By.id("NotificationMins-Monday"));
	        Actions builder3 = new Actions(driver);
	        builder3.moveToElement(selectmins).click().sendKeys("25").perform();
		    Thread.sleep(2000);
		    builder3.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		    
		    WebElement notificationtiltle = driver.findElement(By.id("NotificationTitle-Monday"));
		    notificationtiltle.sendKeys("Exciting Upcoming Event");
		    
		    WebElement notifimessage = driver.findElement(By.id("NotificationMessage-Monday"));
		    notifimessage.sendKeys("We're thrilled to announce an exciting event coming up! Mark your calendars and get ready to join us for Activity");
		    Thread.sleep(2000);
	        WebElement button = driver.findElement(By.id("NotificationSubmit-Monday"));
	        button.click();
		    
	        
	     // Locate the element you want to scroll to
	        WebElement element = driver.findElement(By.xpath("//div[@class='post_wrap']"));
	        
	        // Create a JavascriptExecutor object
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        
	        // Use JavaScript to scroll to the element
	        js.executeScript("arguments[0].scrollIntoView();", element);
	        
	        
	        
	        
	        
	      
	        
	        Thread.sleep(2500);
	     
	        
	 }
}
 

