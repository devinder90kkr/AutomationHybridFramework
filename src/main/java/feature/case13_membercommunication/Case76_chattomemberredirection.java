package feature.case13_membercommunication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BasePage;

public class Case76_chattomemberredirection extends BasePage {
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1000)); 	
	private By membercomunicate = (By.id("Dashboard-MemberCommunication"));
	private By membersummry	= (By.id("MemberCommunication-MemberSummary"));

	
	
	
	
	public Case76_chattomemberredirection(WebDriver driver) {
		super(driver);
	}
	
	 @Test
	    public void Membercommunicate() throws InterruptedException {
	       
		 WebElement Chatclick = driver.findElement(membercomunicate);
	     Chatclick.click();
	     Thread.sleep(1000); 
	    WebElement membersummary = driver.findElement(membersummry);
	    membersummary.click();
	    Thread.sleep(1000);    
	    driver.navigate().back();
	    Thread.sleep(1000);
	            
	    }
	
	       
	 }