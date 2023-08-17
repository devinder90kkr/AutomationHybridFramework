 /*https://chat.openai.com/share/fb99a8d3-9b88-4b49-8555-3f5eab0b24e5 */
package cuesz.membersummary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz01schdulemaster.Step01_Login;

public class Case27_MS_Restoreactivity extends Step01_Login {

    @BeforeClass
    public void setUpChildClass() {
        setUp();
    }

    @Test(dependsOnMethods = "Login")
    public void restoreactivity() throws InterruptedException {
        Thread.sleep(2000);

        // Click on the Member Summary button or link
        driver.findElement(By.xpath("//img[@alt='Member Summary']")).click();

        // Enter the name in the search field
        driver.findElement(By.xpath("//input[@placeholder='Search Members']"))
                .sendKeys("Kumar Devinder");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='member-items']")).click();
       
       Thread.sleep(8500);
        // Find the element with the "Restore" heading
        WebElement restoreHeading = driver.findElement(By.xpath("//h2[contains(text(), 'Restore')]"));
        // Scroll to the element using JavaScriptExecutor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", restoreHeading);

        Thread.sleep(5000);
        //  Find the dropdown element for "This Week"
        WebElement dropdownThisWeek = driver.findElement(By.xpath("(//div[contains(text(),'This Week')])[4]"));
        dropdownThisWeek.click();
//
//        // Select "This Week" from the dropdown
////        WebElement optionThisWeek = driver.findElement(By.xpath("//div[contains(text(), 'This Week')]/parent::div"));
////        optionThisWeek.click();
//
//        // Validate the selected option for "This Week" dropdown
        WebElement selectedOptionThisWeek = driver.findElement(By.xpath("(//div[contains(text(),'This Week')])[4]"));
        if (selectedOptionThisWeek.getText().trim().equals("This Week")) {
            System.out.println("Selected option 'This Week' is validated.");
        } else {
            System.out.println("Selected option 'This Week' is incorrect.");
            
        }
        Thread.sleep(4000);
        // Find the dropdown element for "Last Week" 
        Thread.sleep(3000);	     // Find the dropdown element
        
	        WebElement dropdown1 = driver.findElement(By.xpath("(//div[contains(text(),'This Week')])[4]"));
		    Actions builder1 = new Actions(driver);
		    builder1.moveToElement(dropdown1).click().sendKeys("Last Week").perform();
		    Thread.sleep(2000);
		    builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
           
		    Thread.sleep(3000);

		    // Find the dropdown element
  	        WebElement dropdown2 = driver.findElement(By.xpath("//div[contains(text(),'Last Week')]"));
  		    Actions builder2 = new Actions(driver);
  		    builder2.moveToElement(dropdown2).click().sendKeys("Select week").perform();
  		  Thread.sleep(2000);
		    builder2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
  		       Thread.sleep(3000);
  		       
  		       // Wait for the date picker to appear (you can use explicit wait here)
  		  		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  		  		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='DayPicker']")));

  		  		// Get the current date
  		  		String currentDate = driver.findElement(By.xpath("//div[contains(@class, 'DayPicker-Day--today')]")).getAttribute("aria-label");

  		  		// Assuming currentDate is in the format "Sun Jul 23 2023"
  		  		// You can parse it and find the previous week's start date

  		  		// ... parsing logic to find previous week's start date ...
  		  		// Let's say the previous week's start date is "Mon Jul 17 2023"

  		  		// Now, locate and click on the previous week's start date
  		  		String previousWeekStartDate = "Mon Jul 17 2023";
  		  		WebElement previousWeekDateElement = driver.findElement(By.xpath("//div[@aria-label='" + previousWeekStartDate + "']"));
  		  		previousWeekDateElement.click();

    
  				    Thread.sleep(3000);
  				     // Find the dropdown element
  				        WebElement dropdown3 = driver.findElement(By.xpath("//div[contains(text(),'17 - 23 Jul, 2023')]"));
  					    Actions builder3 = new Actions(driver);
  					    builder3.moveToElement(dropdown3).click().sendKeys("Monthly View").perform();
  					    Thread.sleep(2000);
  					    builder3.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();   
  					    
  					    Thread.sleep(3500);

  					 // Find the left arrow button element
  					 WebElement leftArrowButton = driver.findElement(By.xpath("//button[@class='btn btn-grey pre']//span"));
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
  					 WebElement rightArrowButton = driver.findElement(By.xpath("//button[@class='btn btn-grey next']"));
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

  
    
        
       
	    
      
    
    
  

