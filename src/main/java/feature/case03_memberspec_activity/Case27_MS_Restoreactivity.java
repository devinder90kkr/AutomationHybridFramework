 /*https://chat.openai.com/share/fb99a8d3-9b88-4b49-8555-3f5eab0b24e5 */
package feature.case03_memberspec_activity;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BasePage;
import utils.SeleniumUtils;

public class Case27_MS_Restoreactivity extends BasePage {
	
	
	SeleniumUtils utils = new SeleniumUtils(driver);
	private By restrhadng	= (By.xpath("//h2[contains(text(), 'Restore')]"));
	//private By dropThisWeek = (By.xpath("(//div[contains(text(),'This Week')])[4]"));
	private By drpdwnThWek = (By.id("MemberSummary-Restore-Activity"));
	private By slectOptnThWek = (By.xpath("(//div[contains(text(),'This Week')])[4]"));
	// private By drpdwn	= 	(By.xpath("(//div[contains(text(),'This Week')])[4]"));
	// private By drpdwn2	= 	(By.xpath("//div[contains(text(),'Last Week')]"));
	private By elemnt	= 	(By.xpath("//div[@class='DayPicker']"));
	// private By currntime	=	(By.xpath("//div[contains(@class, 'DayPicker-Day--today')]"));
	// private By drpdwn3	=	(By.xpath("//div[contains(text(),'7 - 13 Aug, 2023')]"));
	private By leftArowBttn	=	(By.xpath("//button[@class='btn btn-grey pre']//span"));
	private By rightArowBttn	= (By.xpath("//button[@class='btn btn-grey next']"));

    public Case27_MS_Restoreactivity(WebDriver driver) {
		super(driver);
		
	}

    @Test
    public void restoreactivity() throws InterruptedException {
        Thread.sleep(2000);

        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();
       
       Thread.sleep(8500);
        // Find the element with the "Restore" heading
        WebElement restoreHeading = driver.findElement(restrhadng);
        // Scroll to the element using JavaScriptExecutor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", restoreHeading);

        Thread.sleep(5000);
        //  Find the dropdown element for "This Week"
        WebElement dropdownThisWeek = driver.findElement(drpdwnThWek);
        dropdownThisWeek.click();

        // Validate the selected option for "This Week" dropdown
        WebElement selectedOptionThisWeek = driver.findElement(slectOptnThWek);
        if (selectedOptionThisWeek.getText().trim().equals("This Week")) {
            System.out.println("Selected option 'This Week' is validated.");
        } else {
            System.out.println("Selected option 'This Week' is incorrect.");
            
        }
        Thread.sleep(4000);
        // Find the dropdown element for "Last Week" 
        Thread.sleep(3000);	     // Find the dropdown element
        
	        //WebElement dropdown1 = driver.findElement(drpdwn);
	        WebElement dropdown1 = driver.findElement(drpdwnThWek);
		    Actions builder1 = new Actions(driver);
		    builder1.moveToElement(dropdown1).click().sendKeys("Last Week").perform();
		    Thread.sleep(2000);
		    builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
           
		    Thread.sleep(3000);

		    // Find the dropdown element
  	      //  WebElement dropdown2 = driver.findElement(drpdwn2);
  	      WebElement dropdown2 = driver.findElement(drpdwnThWek);
  		    Actions builder2 = new Actions(driver);
  		    builder2.moveToElement(dropdown2).click().sendKeys("Select week").perform();
  		  Thread.sleep(2000);
		    builder2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
  		       Thread.sleep(3000);
  		       
  		       // Wait for the date picker to appear (you can use explicit wait here)
  		  		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  		  		wait.until(ExpectedConditions.visibilityOfElementLocated(elemnt));


//  		  		// Get the current date
//  		  		String currentDate = driver.findElement(currntime).getAttribute("aria-label");
//  		  		String previousWeekStartDate = "Sun Sep 03 2023";
//  		  		WebElement previousWeekDateElement = driver.findElement(By.xpath("//div[@aria-label='" + previousWeekStartDate + "']"));
//  		  		previousWeekDateElement.click();
  		  		
  		  		/**********************/
//  		  		// Calculate the date for the start of the previous week
//  		  	    LocalDate currentDate = LocalDate.now();
//  		  	    int daysToSubtract = currentDate.getDayOfWeek().getValue() + 7; // Ensure we go back to the start of the previous week
//  		  	    LocalDate previousWeekStartDate = currentDate.minusDays(daysToSubtract);
  	//
//  		  	    // Format the date to match the format used in the calendar
//  		  	    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("E MMM dd yyyy", Locale.ENGLISH);
//  		  	    String formattedDate = previousWeekStartDate.format(dateFormatter);
  	//
//  		  	    // Locate and click on the previous week's start date
//  		  	    WebElement previousWeekDateElement = driver.findElement(By.xpath("//div[@aria-label='" + formattedDate + "']"));
//  		  	    previousWeekDateElement.click();
  		  		
  		  		/************/
  		  		LocalDate currentDate = LocalDate.now();
  		  		int daysToSubtract = currentDate.getDayOfWeek().getValue() + 7; // Ensure we go back to the start of the previous week
  		  		LocalDate previousWeekStartDate = currentDate.minusDays(daysToSubtract);

  		  		// Check if previous week's start date is in the previous month
  		  		if (previousWeekStartDate.getMonthValue() < currentDate.getMonthValue()) {
  		  		    // Click on the 'Previous Month' button
  		  		    WebElement previousMonthButton = driver.findElement(By.xpath("//span[@aria-label='Previous Month']"));
  		  		    previousMonthButton.click();
  		  		}

  		  		// Format the date to match the format used in the calendar
  		  		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("E MMM dd yyyy", Locale.ENGLISH);
  		  		String formattedDate = previousWeekStartDate.format(dateFormatter);

  		  		// Locate and click on the previous week's start date
  		  		WebElement previousWeekDateElement = driver.findElement(By.xpath("//div[@aria-label='" + formattedDate + "']"));
  		  		previousWeekDateElement.click();

    
  				    Thread.sleep(3000);
  				     // Find the dropdown element
  				     //   WebElement dropdown3 = driver.findElement(drpdwn3);
  				      WebElement dropdown3 = driver.findElement(drpdwnThWek);
  					    Actions builder3 = new Actions(driver);
  					    builder3.moveToElement(dropdown3).click().sendKeys("Monthly View").perform();
  					    Thread.sleep(2000);
  					    builder3.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();   
  					    
  					    Thread.sleep(3500);

  					 // Find the left arrow button element
  					 WebElement leftArrowButton = driver.findElement(leftArowBttn);
  					 // Create an Actions object
  					 Actions builder = new Actions(driver);
  					 // First click on the left arrow button
  					 builder.moveToElement(leftArrowButton).click().perform();
  					 // Wait for a short time (you may adjust this sleep time if needed)
  					 Thread.sleep(1500);
  					 // Second click on the left arrow button
  					 builder.moveToElement(leftArrowButton).click().perform();
  					 // Wait for another short time (you may adjust this sleep time if needed)
  					 Thread.sleep(1500);


  					 // Find the left arrow button element
  					 WebElement rightArrowButton = driver.findElement(rightArowBttn);
  					 // Create an Actions object
  					 Actions builder11 = new Actions(driver);
  					 // First click on the left arrow button
  					 builder11.moveToElement(rightArrowButton).click().perform();
  					 // Wait for a short time (you may adjust this sleep time if needed)
  					 Thread.sleep(1500);
  					 // Second click on the left arrow button
  					 builder11.moveToElement(rightArrowButton).click().perform();
  					 // Wait for another short time (you may adjust this sleep time if needed)
  					 Thread.sleep(1500);
  					 Thread.sleep(1500);
		    
		    
		    
		    
    }
}           

  
    
        
       
	    
      
    
    
  

