package cuesz.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumUtils {
    private WebDriver driver;

    public SeleniumUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElement(By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }

    public void waitForMilliseconds(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    // Corrected method for entering text
    public void enterText(By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.sendKeys(text);
    }
    
    // Add more utility methods as needed

    
    // Click on schedule master 
    public void clickScheduleMaster() {
		By SchduleCalendarLocator = (By.xpath("//a[@href='/schedule-master']//span"));
        WebElement scheduleElement = driver.findElement(SchduleCalendarLocator);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", scheduleElement);
        clickElement(SchduleCalendarLocator);
    }
    
    // Click on Add new button *------->> Schdule master
    public void clickaddnewevent() {
        By addneeventLocator = By.xpath("//button[normalize-space()='Add New Event']");
        clickElement(addneeventLocator);
    }
    
    // Click on member call 
    public void clickMemberCalendar() {
        By memberCalendarLocator = By.xpath("//a[@href='/member-calls']//span");
        clickElement(memberCalendarLocator);
    }
    
    
 // Click on member call 
    public void clickMembersummary() {
        By memberSummaryLocator = By.xpath("//img[@alt='Member Summary']");
        clickElement(memberSummaryLocator);
    }
    
 // Enter text in the search field
    public void enterSearchText() {
        By searchFieldLocator = By.xpath("//input[@placeholder='Search Members']");
        String searchmember = "Kumar Devinder"; // Define the search text here
        enterText(searchFieldLocator, searchmember);
     //   enterSearchText("Sanjit QA");
    }
     
  // Click on member call 
        public void clickMembername() {
            By memberdetail = (By.xpath("//div[@class='member-items']"));
            clickElement(memberdetail);
    
        }
        
     // utility for week navigation   
       public void navigateToLastAndNextWeek() throws InterruptedException {
            WeekNavigationUtils.navigateToLastAndNextWeek(driver);
        }

   
    }
    


