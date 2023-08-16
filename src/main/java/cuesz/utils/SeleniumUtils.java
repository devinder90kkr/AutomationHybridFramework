package cuesz.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    // Add more utility methods as needed

    public void clickScheduleMaster() {
		By SchduleCalendarLocator = (By.xpath("//a[@href='/schedule-master']//span"));
        WebElement scheduleElement = driver.findElement(SchduleCalendarLocator);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", scheduleElement);
        clickElement(SchduleCalendarLocator);
    }
    
    
    public void clickaddnewevent() {
        By addneeventLocator = By.xpath("//button[normalize-space()='Add New Event']");
        clickElement(addneeventLocator);
    }
    
    
    public void clickMemberCalendar() {
        By memberCalendarLocator = By.xpath("//a[@href='/member-calls']//span");
        clickElement(memberCalendarLocator);
    }

   
    }

