 /*https://chat.openai.com/share/fb99a8d3-9b88-4b49-8555-3f5eab0b24e5 */
package cuesz.membersummary.TeamLeaderNotes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;

public class Case30_MS_Deletenewgoal extends BasePage {

	SeleniumUtils utils = new SeleniumUtils(driver);
	private By teamLderNotesHadng = (By.xpath("//h2[normalize-space()='Team Leader Coach Notes']"));
	private By goalbttn		=	(By.xpath("//img[@alt='Goal Logo']"));
	private By editbttn		=	(By.xpath("//div[@class='mid_sec']//button[1]"));
	private By inptfild1	=	(By.xpath("//div[@class='row']//div[2]//div[1]//textarea[1]"));
	private By inptfield2	=	(By.xpath("(//textarea[@id='editor'])[2]"));
	private By savebttn		= 	(By.xpath("//img[@alt='save']"));	
	private By edtcon		=	(By.xpath("//img[@alt='edit']"));
	private By confrmbttn 	=	(By.xpath("//span[normalize-space()='Confirm']"));
	private By teamleaotesheading=	 (By.xpath("//h2[normalize-space()='Team Leader Coach Notes']"));
	

    public Case30_MS_Deletenewgoal(WebDriver driver) {
		super(driver);
		
	}

	@Test
    public void deletegoal() throws InterruptedException {
        Thread.sleep(2000);
        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();
        
        // Scroll to the "Team Leader Coach Notes" heading
        Thread.sleep(3000);
        WebElement teamLeaderNotesHeading = driver.findElement(teamLderNotesHadng);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", teamLeaderNotesHeading);
        Thread.sleep(2000);
        WebElement goalbutton = driver.findElement(goalbttn);
        goalbutton.click();
        
        Thread.sleep(2500);
        WebElement editbutton = driver.findElement(editbttn);
        editbutton.click();
        Thread.sleep(2000);
        driver.findElement(inptfild1).sendKeys("this is new edited values for text area");
   
        Thread.sleep(2500);
        driver.findElement(inptfield2).sendKeys("hello all this new edit field");
        
        Thread.sleep(2000);
        driver.findElement(savebttn).click();
        
        Thread.sleep(2500);
        driver.findElement(edtcon).click();
        
        Thread.sleep(2500);
        driver.findElement(confrmbttn).click();
        
        Thread.sleep(2500);
        
        driver.navigate().back();
        
        Thread.sleep(3000);
        WebElement teamLeaderNotesHeading1 = driver.findElement(teamleaotesheading);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", teamLeaderNotesHeading1);
        Thread.sleep(2000);
        
       
        
        }    
    }
  
    
        
       
	    
      
    
    
  

// /*https://chat.openai.com/share/fb99a8d3-9b88-4b49-8555-3f5eab0b24e5 */
//package cuesz.membersummary;
//
//import java.util.Calendar;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.Test;
//
//import cuesz.pages.BasePage;
//import cuesz.utils.SeleniumUtils;
//import cuesz.utils.YearUtil;
//
//public class Case30_MS_Deletenewgoal extends BasePage {
//
//	SeleniumUtils utils = new SeleniumUtils(driver);
//	private By teamLderNotesHadng = (By.xpath("//h2[normalize-space()='Team Leader Coach Notes']"));
//	private By goalbttn		=	(By.id("MemberSummary-TeamLeaderCoachNotes-/goals"));
//	private By editbttn		=	(By.xpath("//div[@class='mid_sec']//button[1]"));
//	private By inptfild1	=	(By.xpath("//div[@class='row']//div[2]//div[1]//textarea[1]"));
//	private By inptfield2	=	(By.xpath("(//textarea[@id='editor'])[2]"));
//	private By savebttn		= 	(By.xpath("//img[@alt='save']"));	
//	private By edtcon		=	(By.xpath("//img[@alt='edit']"));
//	private By confrmbttn 	=	(By.xpath("//span[normalize-space()='Confirm']"));
//	private By teamleaotesheading=	 (By.xpath("//h2[normalize-space()='Team Leader Coach Notes']"));
//	private By notedatepicker = By.id("MemberSummary-TeamLeaderCoachNotes-DatePicker");
//
//    public Case30_MS_Deletenewgoal(WebDriver driver) {
//		super(driver);
//		
//	}
//
//	@Test
//    public void deletegoal() throws InterruptedException {
//        Thread.sleep(2000);
//        utils.clickMembersummary();
//        utils.waitForMilliseconds(2000);
//        utils.enterSearchText();
//        utils.clickMembername();
//        
//        // Scroll to the "Team Leader Coach Notes" heading
//        Thread.sleep(3000);
//        WebElement teamLeaderNotesHeading = driver.findElement(teamLderNotesHadng);
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", teamLeaderNotesHeading);
//        Thread.sleep(2000);
//     // Call the private void editGoals
//        deleteGoals();
//        
//        // Find the date picker
//        WebElement notedate = driver.findElement(notedatepicker);
//        
//        // Click on the date picker
//        notedate.click();
//        
//        Thread.sleep(2000);
//        
//        int nextYear = Calendar.getInstance().get(Calendar.YEAR) + 1;
//        String nextYearName = YearUtil.getYearName(nextYear);
//        WebElement nextYearElement = driver.findElement(By.xpath("//div[normalize-space()='" + nextYearName + "']"));
//        nextYearElement.click();
//        Thread.sleep(2000);
//        
//        // Call the private void editGoals again
//        deleteGoals();
//	}
//        private void deleteGoals() throws InterruptedException {
//        WebElement goalbutton = driver.findElement(goalbttn);
//        goalbutton.click();
//        
//        Thread.sleep(2500);
//        WebElement editbutton = driver.findElement(editbttn);
//        editbutton.click();
//        Thread.sleep(2000);
//        driver.findElement(inptfild1).sendKeys("this is new edited values for text area");
//   
//        Thread.sleep(2500);
//        driver.findElement(inptfield2).sendKeys("hello all this new edit field");
//        
//        Thread.sleep(2000);
//        driver.findElement(savebttn).click();
//        
//        Thread.sleep(2500);
//        driver.findElement(edtcon).click();
//        
//        Thread.sleep(2500);
//        driver.findElement(confrmbttn).click();
//        
//        Thread.sleep(2500);
//        
//        driver.navigate().back();
//        
//        Thread.sleep(3000);
//        WebElement teamLeaderNotesHeading1 = driver.findElement(teamleaotesheading);
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", teamLeaderNotesHeading1);
//        Thread.sleep(2000);
//        
//       
//        
//        }    
//    }
//  
    
        
       
	    
      
    
    
  
