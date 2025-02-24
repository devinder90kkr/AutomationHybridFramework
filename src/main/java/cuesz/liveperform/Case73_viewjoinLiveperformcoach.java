package cuesz.liveperform;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.date.functions.Currentdategenerator;
import cuesz.pages.BasePage;

public class Case73_viewjoinLiveperformcoach extends BasePage {
	
	//private String eventDate; // Date parameter from script one
	
	public static String eventDate = Currentdategenerator.generateCurrentDate(); // Use the generated date
	
	private By scheduleIcon 	= (By.xpath("//a[@href='/schedule-master']//span//img[@alt='icon']"));
	private By monthview 		= (By.xpath("//span[normalize-space()='Month']"));
	private By userlabel 	 	= (By.xpath("//div[@class='user_title']//label"));
	private By datedrpmdwn 		= (By.id("videoLiveNow-Selectdateoftheliveperformsession"));
	
	
	
	public Case73_viewjoinLiveperformcoach(WebDriver driver) {
		super(driver);
		
	}
	@Test
	 public void Viewevent() throws InterruptedException {
		 		
		Thread.sleep(2000);
		driver.findElement(scheduleIcon).click();
		
	    Thread.sleep(2000);
	    driver.findElement(monthview).click();   
	   
	    // Pass the event date from script one to script two
        eventDate = Case72_creatLiveperform.eventDate;
        // Extract the day portion from the eventDate
        String day = eventDate.split("-")[0];
        // Find the element to scroll to the sp	ecified date on the calendar (matching only the day)
        WebElement element = driver.findElement(By.xpath("//button[@role='cell'][normalize-space()='" + day + "']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
      
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
        
        Thread.sleep(3000);
//        WebElement dateElement = driver.findElement(By.xpath("//div[@data-date='" + eventDate + "']"));
//        dateElement.click();		
     
      WebElement dateElement = driver.findElement(By.cssSelector("[data-iseventlive='true']"));
      dateElement.click();	
        
        
     // Find the elements containing the user labels
        List<WebElement> userLabels = driver.findElements(userlabel);

        // Get the texts from the user labels
        List<String> userTexts = new ArrayList<>();
        for (WebElement userLabel : userLabels) {
            userTexts.add(userLabel.getText());
        }

        // Verify the texts
        if (userTexts.contains("Kumar Devinder") && userTexts.contains("Seakfreight") && userTexts.contains("SteveQA Adv")) {
            System.out.println("User text verification passed!");
        } else {
            System.out.println("User text verification failed!");
        }
  
		
//		driver.findElement(By.xpath("//div[@class='btn_small']//button[@class='btn btn-sm btn-primary']")).click();
		
		

        // Find the button element by its XPath
        WebElement button = driver.findElement(By.xpath("(//button[@class='btn-transparent flash'])[2]"));
        // Click the button
        button.click();
        
		
        
        // Find the view sessionoutcome button element by its id
        WebElement viewsessionoutcome = driver.findElement(By.id("videoLiveNow-ViewSessionOutcome"));
        // Click the button
        viewsessionoutcome.click();
        
      
        WebElement datedropdown = driver.findElement(datedrpmdwn);
        Actions builder1 = new Actions(driver);
	    builder1.moveToElement(datedropdown).click().sendKeys("03-07-2023").perform();
	    Thread.sleep(2000);
	    builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	   
	 // Find the label element with the text "Any concerns or Action needed"
        WebElement labelElement = driver.findElement(By.xpath("//label[text()='Any concerns or Action needed']"));

        // Use JavascriptExecutor to scroll to the label element
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth' });", labelElement);

	    
	    WebElement datedropdown2 = driver.findElement(datedrpmdwn);
        Actions builder2 = new Actions(driver);
	    builder2.moveToElement(datedropdown2).click().sendKeys("05-06-2023").perform();
	    Thread.sleep(2000);
	    builder2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        

	 // Find the label element with the text "Any concerns or Action needed"
        WebElement labelElement1 = driver.findElement(By.xpath("//label[text()='Any concerns or Action needed']"));
        // Use JavascriptExecutor to scroll to the label element
        JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
        jsExecutor1.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth' });", labelElement1);


        Thread.sleep(2500);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	    
	    Thread.sleep(6500);
	    
	    WebElement screnshot = driver.findElement(By.id("screenShot"));
	    screnshot.isEnabled();
	    screnshot.click();
	    
	    /*******/
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
	    WebElement audioButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("videoCall-audio")));
	    // Scroll to the element using JavascriptExecutor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", audioButton);
        // Use a loop to retry clicking
        for (int i = 0; i < 2; i++) {
            try {
                audioButton.click();
                break;  // Exit the loop if the click succeeds
            } catch (Exception e) {
                // Handle any exceptions or errors here
                e.printStackTrace();
            }
        }
        
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(1000));
	    WebElement videoButton = wait2.until(ExpectedConditions.elementToBeClickable(By.id("videoCall-video")));
	    // Scroll to the element using JavascriptExecutor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", videoButton);
        // Use a loop to retry clicking
        for (int i = 0; i < 2; i++) {
            try {
            	videoButton.click();
                break;  // Exit the loop if the click succeeds
            } catch (Exception e) {
                // Handle any exceptions or errors here
                e.printStackTrace();
            }
        }
	    
	    
        
        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(1000));
	    WebElement blurbutton = wait3.until(ExpectedConditions.elementToBeClickable(By.id("videoCall-Blur")));
	    // Scroll to the element using JavascriptExecutor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", blurbutton);
        // Use a loop to retry clicking
        for (int i = 0; i < 2; i++) {
            try {
            	blurbutton.click();
                break;  // Exit the loop if the click succeeds
            } catch (Exception e) {
                // Handle any exceptions or errors here
                e.printStackTrace();
            }
        }
        
        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(1000));
	    WebElement enciocn = wait4.until(ExpectedConditions.elementToBeClickable(By.id("videoCall-EndCall")));
	    // Scroll to the element using JavascriptExecutor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", enciocn);
         enciocn.click();
             

        
        
        Thread.sleep(9000);
        
	
		}
	}
	
	