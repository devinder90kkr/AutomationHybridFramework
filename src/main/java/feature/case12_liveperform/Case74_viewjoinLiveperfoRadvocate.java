package feature.case12_liveperform;

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

import allureframework.AllureUtils;
import commonfunction.Currentdategenerator;
import base.BasePage;




public class Case74_viewjoinLiveperfoRadvocate extends BasePage {
	
	//private String eventDate; // Date parameter from script one
	
	public static String eventDate = Currentdategenerator.generateCurrentDate(); // Use the generated date
	
	private By scheduleIcon 	= (By.xpath("//a[@href='/schedule-master']//span//img[@alt='icon']"));
	private By monthview 		= (By.xpath("//span[normalize-space()='Month']"));
	private By userlabel 	 	= (By.xpath("//div[@class='user_title']//label"));
	private By drpdwnThWek 		= (By.id("MemberSummary-Sphere-Duration"));
	private By talkingpt1		= (By.id("videoLiveNow-TalkingPoints1"));
	private By talkingpt3		= (By.id("videoLiveNow-TalkingPoints3"));
	private By notesadv			= (By.id("videoLiveNow-TextArea"));
	private By submtbttn 		= (By.id("videoLiveNow-Submit"));
	
	
	
	public Case74_viewjoinLiveperfoRadvocate(WebDriver driver) {
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
        
        Thread.sleep(3500);
        // Find the "dropdown"  element
        WebElement dropdwn = driver.findElement(drpdwnThWek);
        // Use JavascriptExecutor to scroll to the "Submit" button
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth' });", dropdwn);
        
 
		Thread.sleep(2000);
        WebElement dropdown1 = driver.findElement(drpdwnThWek);
	    Actions builder1 = new Actions(driver);
	    builder1.moveToElement(dropdown1).click().sendKeys("This Week").perform();
	    Thread.sleep(2000);
	    builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	    
	    WebElement dropdown2 = driver.findElement(drpdwnThWek);
	    Actions builder2 = new Actions(driver);
	    builder2.moveToElement(dropdown2).click().sendKeys("Last Week").perform();
	    Thread.sleep(2000);
	    builder2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        
        
	    WebElement dropdown3 = driver.findElement(drpdwnThWek);
	    Actions builder3 = new Actions(driver);
	    builder3.moveToElement(dropdown3).click().sendKeys("14 Days").perform();
	    Thread.sleep(2000);
	    builder3.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        
	    WebElement dropdown4 = driver.findElement(drpdwnThWek);
	    Actions builder4 = new Actions(driver);
	    builder4.moveToElement(dropdown4).click().sendKeys("60 Days").perform();
	    Thread.sleep(2000);
	    builder4.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	    Thread.sleep(2000);
	    
	    WebElement points1 = driver.findElement(talkingpt1);
	    points1.click();
        
	    WebElement points2 = driver.findElement(talkingpt3);
	    points2.click();
        	
	    
	 // Locate the WebElement with the class "doc_rate_card"
	    WebElement docRateCard = driver.findElement(By.className("doc_rate_card"));
	    // Get the text inside the WebElement
	    String text = docRateCard.getText();
	    // Print or use the extracted text as needed
	    System.out.println("Extracted Text: " + text);

	    
	    WebElement Advocatenotes = driver.findElement(notesadv);
	    Advocatenotes.sendKeys("This is just for testing purpose this is simple testing prupose");
	    
	    // Find the "Submit" button element
        WebElement submitButton = driver.findElement(By.id("videoLiveNow-Submit"));
        // Use JavascriptExecutor to scroll to the "Submit" button
        JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
        jsExecutor1.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth' });", submitButton);
        
       Thread.sleep(2500);
       
	    WebElement submit= driver.findElement(submtbttn);
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);
	    submit.click(); 
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
	
	