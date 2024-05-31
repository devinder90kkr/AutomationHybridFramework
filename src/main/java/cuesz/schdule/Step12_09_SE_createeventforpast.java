package cuesz.schdule;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;

public class Step12_09_SE_createeventforpast extends BasePage {
	
	SeleniumUtils utils = new SeleniumUtils(driver);

	public Step12_09_SE_createeventforpast(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@Test
	 public void Schdulevent() throws InterruptedException {
		
		utils.clickScheduleMaster();		
				
		WebElement calendarcontainer = driver.findElement(By.xpath("//span[normalize-space()='Day']"));
		calendarcontainer.click();
		
		Thread.sleep(4500);
		// Find the element with the text "1:00 AM IST"
        WebElement element = driver.findElement(By.xpath("//span[@class='rbc-label' and text()='1:00 AM IST']"));
        
        // Scroll to the element using JavascriptExecutor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		
		
		Thread.sleep(5500);
		// Assuming you want to scroll to an element with the class name 'rbc-events-container'
        WebElement dateElement = driver.findElement(By.className("rbc-events-container"));

        // Scroll to the element using JavaScript
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dateElement);

        // Move to the element before clicking it (optional)
        Actions actions = new Actions(driver);
        actions.moveToElement(dateElement).click().perform();
                
        // Find the snackbar element by its aria-describedby attribute
        WebElement snackbar = driver.findElement(By.cssSelector("div[aria-describedby='notistack-snackbar']"));
        // Get the text of the snackbar
        String snackbarText = snackbar.getText();
        // Print the snackbar text
        System.out.println("Snackbar Text: " + snackbarText);
	
  
	

	}
}