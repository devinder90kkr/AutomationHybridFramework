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

public class Case23_MS_performactivity extends Step01_Login {

    @BeforeClass
    public void setUpChildClass() {
        setUp();
    }

    @Test(dependsOnMethods = "Login")
    public void performactivity() throws InterruptedException {
        Thread.sleep(2000);

        // Click on the Member Summary button or link
        driver.findElement(By.xpath("//img[@alt='Member Summary']")).click();

        // Enter the name in the search field
        driver.findElement(By.xpath("//input[@placeholder='Search Members']"))
                .sendKeys("Kumar Devinder");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='member-items']")).click();
        // Scroll to the "Team Leader Coach Notes" heading
       
        Thread.sleep(5000);
        String headingText = "Perform Activity Feedback";
        String xpathExpression = "//h2[contains(text(), '" + headingText + "')]";
        By headingLocator = By.xpath(xpathExpression);
        // Scroll to the heading using JavaScriptExecutor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(headingLocator));        
        
        Thread.sleep(2500);
     // Find the element for the perform heading
        WebElement performHeading = driver.findElement(By.xpath("//h2[contains(text(), 'Perform Activity Feedback')]"));

        // Validate the heading for perform
        if (performHeading.isDisplayed()) {
            System.out.println("Heading for Perform Activity Feedback is verified.");
        } else {
            System.out.println("Heading for Perform Activity Feedback is not found.");
        }
        
     // Find the dropdown element for "This Week"
        WebElement dropdownThisWeek = driver.findElement(By.xpath("//div[contains(text(), 'This Week')]"));
        dropdownThisWeek.click();

        // Select "This Week" from the dropdown
        WebElement optionThisWeek = driver.findElement(By.xpath("//div[contains(text(), 'This Week')]/parent::div"));
        optionThisWeek.click();

        // Validate the selected option for "This Week" dropdown
        WebElement selectedOptionThisWeek = driver.findElement(By.xpath("//div[contains(text(), 'This Week')]"));
        if (selectedOptionThisWeek.getText().trim().equals("This Week")) {
            System.out.println("Selected option 'This Week' is validated.");
        } else {
            System.out.println("Selected option 'This Week' is incorrect.");
            
        }
   
        Thread.sleep(4000);
        // Find the dropdown element for "Last Week" 
        Thread.sleep(3000);
	     // Find the dropdown element
	        WebElement dropdown1 = driver.findElement(By.xpath("//div[contains(text(), 'This Week')]/parent::div"));
		    Actions builder1 = new Actions(driver);
		    builder1.moveToElement(dropdown1).click().sendKeys("Last Week").perform();
		    Thread.sleep(2000);
		    builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        
        // Validate the selected option for "Last Week" dropdown
        WebElement selectedOptionLastWeek = driver.findElement(By.xpath("//div[contains(text(), 'Last Week')]"));
        if (selectedOptionLastWeek.getText().trim().equals("Last Week")) {
            System.out.println("Selected option 'Last Week' is validated.");
        } else {
            System.out.println("Selected option 'Last Week' is incorrect.");
        }
 
           Thread.sleep(3000);
  	     // Find the dropdown element
  	        WebElement dropdown2 = driver.findElement(By.xpath("//div[contains(text(), 'Last Week')]/parent::div"));
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

  		// Wait for the date picker to close (you can use explicit wait here)
  	//	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='DayPicker']")));
		//    Thread.sleep(500);
           
		    
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
    
  
    
        
       
	    
      
    
    
  

