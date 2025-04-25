package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonfunction.functions.WeekNavigationUtils;

public class SeleniumUtils {
    private WebDriver driver;

    public SeleniumUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElement(By locator) {
        WebElement element = driver. findElement(locator);
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
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement element = driver.findElement(locator);
        element.clear();
        element.sendKeys(text);
    }
    
    // Add more utility methods as needed

    
    // Click on schedule master 
    public void clickScheduleMaster() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		By SchduleCalendarLocator = (By.xpath("//a[@href='/schedule-master']//span"));
        WebElement scheduleElement = driver.findElement(SchduleCalendarLocator);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", scheduleElement);
        clickElement(SchduleCalendarLocator);
    }
    
    // Click on Add new button *------->> Schdule master
    public void clickaddnewevent() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        By addneeventLocator = By.xpath("//button[normalize-space()='Add New Event']");
        clickElement(addneeventLocator);
    }
    
    // Click on member call 
    public void clickMemberCalendar() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        By memberCalendarLocator = By.xpath("//a[@href='/member-calls']//span");
        clickElement(memberCalendarLocator);
    }
    
    
 // Click on member call 
    public void clickMembersummary() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        By memberSummaryLocator = By.xpath("//img[@alt='Member Summary']");
//    	 By memberSummaryLocator = By.xpath("//img[@alt='Member Summary'] | //img[@alt='Member Specs']");
//    	 By memberSummaryLocator = By.id("Dashboard-MemberSummary");
    	 By memberSummaryLocator = By.xpath("//h6[normalize-space()='Member Summary']");
    	clickElement(memberSummaryLocator);
//        driver.navigate().refresh();
//        clickElement(memberSummaryLocator);
    }
    
    public void enterSearchText() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        By searchFieldLocator = By.xpath("//input[@placeholder='Search Members']");
        String searchMember = Config.getProperty("search.text");
        enterText(searchFieldLocator, searchMember);
    }

    
    
    
  // Click on member call 
        public void clickMembername() throws InterruptedException {
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            By memberdetail = (By.xpath("//div[@class='member-items']"));
            By memberdetail = (By.xpath("//div[@class='user_inf']"));  
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clickElement(memberdetail);
    
        }
        
     // utility for week navigation   
       public void navigateToLastAndNextWeek() throws InterruptedException {
            WeekNavigationUtils.navigateToLastAndNextWeek(driver);
        }

   
    }
    

