// /*https://chat.openai.com/share/fb99a8d3-9b88-4b49-8555-3f5eab0b24e5 */
//package cuesz.membersummary;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.Test;
//
//import cuesz.pages.BasePage;
//import cuesz.utils.SeleniumUtils;
//
//public class Case29_MS_Editnewgoal extends BasePage {
//
//	SeleniumUtils utils = new SeleniumUtils(driver);
//	private By teamLderNtesHeadng = (By.xpath("//h2[normalize-space()='Team Leader Coach Notes']"));
//	private By edt1bttn	=	(By.className("btn_edit"));
//	private By	inpu1field		= (By.xpath("//textarea[@id='editor']"));
//	private By saevbttn		= 	(By.xpath("(//img[@alt='save'])[1]"));
//	private By checbox		=	(By.xpath("(//input[@name='redFlag'])[1]"));
//	
//	private By edt2bttn	=	(By.xpath("(//img[@alt='save'])[2]"));
//	private By	inpu2field		= (By.xpath("(//textarea[@id='editor'])[1]"));
//	private By saev2bttn		= 	(By.xpath("(//img[@alt='save'])[2]"));
//	private By checbox2		=	(By.xpath("(//input[@name='redFlag'])[4]"));
//	
//	private By edt3bttn	=	(By.xpath("(//img[@alt='save'])[3]"));
//	private By	inpu3field		= (By.xpath("(//textarea[@id='editor'])[1]"));
//	private By saev3bttn		= 	(By.xpath("(//img[@alt='save'])[3]"));
//	private By checbox3		=	(By.xpath("(//input[@name='redFlag'])[5]"));
//	
//	private By edt4bttn	=	(By.xpath("(//img[@alt='save'])[4]"));
//	private By	inpu4field		= (By.xpath("(//textarea[@id='editor'])[1]"));
//	private By saev4bttn		= 	(By.xpath("(//img[@alt='save'])[4]"));
//	private By checbox4		=	(By.xpath("(//input[@name='redFlag'])[6]"));
//
//    public Case29_MS_Editnewgoal(WebDriver driver) {
//		super(driver);
//		// TODO Auto-generated constructor stub
//	}
//
//	@Test
//    public void editgoalclick() throws InterruptedException {
//		Thread.sleep(2000);
//        utils.clickMembersummary();
//        utils.waitForMilliseconds(2000);
//        utils.enterSearchText();
//        utils.clickMembername();
// 
//        // Scroll to the "Team Leader Coach Notes" heading
//        Thread.sleep(3000);
//        WebElement teamLeaderNotesHeading = driver.findElement(teamLderNtesHeadng);
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", teamLeaderNotesHeading);
//
//        /*Short Term Goals - 3 Months*/
//        Thread.sleep(2500);
//     // Locate and click the "Edit" button
//        driver.findElement(edt1bttn).click();
//        Thread.sleep(2000);
//     // Locate the input field and send keys (input values)
//        driver.findElement(inpu1field).sendKeys("Value 1\n update new file to text");  
//        Thread.sleep(2000);
//     // Locate and click the "Save" button
//        driver.findElement(saevbttn).click();
//        Thread.sleep(2000);
//        // Locate and click the "CHECKBOXES" button
//        driver.findElement(checbox).click();
//           
//        /*Long Term Goal*/
//        Thread.sleep(2500);
//     // Locate and click the "Edit" button
//        driver.findElement(edt2bttn).click();
//        Thread.sleep(2000);
//     // Locate the input field and send keys (input values)
//        driver.findElement(inpu2field).sendKeys("Value 1\n update new file to text");  
//        Thread.sleep(2000);
//     // Locate and click the "Save" button
//        driver.findElement(saev2bttn).click();
//         Thread.sleep(2000);
//     // Locate and click the "CHECKBOXES" button
//        driver.findElement(checbox2).click();
//        
//        /*Process Thinking*/
//        Thread.sleep(2500);
//      // Locate and click the "Edit" button
//        driver.findElement(edt3bttn).click();
//        Thread.sleep(2000);
//      // Locate the input field and send keys (input values)
//        driver.findElement(inpu3field).sendKeys("Value 1\n update new file to text");  
//        Thread.sleep(2000);
//     // Locate and click the "Save" button
//        driver.findElement(saev3bttn).click();
//        Thread.sleep(2000);
//     // Locate and click the "CHECKBOXES" button
//        driver.findElement(checbox3).click();
//        
//        
//        /*Process Thinking-2*/
//        Thread.sleep(2500);
//      // Locate and click the "Edit" button
//        driver.findElement(edt4bttn).click();
//        Thread.sleep(2000);
//      // Locate the input field and send keys (input values)
//        driver.findElement(inpu4field).sendKeys("Value 1\n update new file to text");  
//        Thread.sleep(2000);
//     // Locate and click the "Save" button
//        driver.findElement(saev4bttn).click();
//        Thread.sleep(2000);
//     // Locate and click the "CHECKBOXES" button 
//        driver.findElement(checbox4).click();
//    
//        
//        }    
//    }
//  
//    
//        
//       
//	    
//      
//    
//    
//  
//





 /*https://chat.openai.com/share/fb99a8d3-9b88-4b49-8555-3f5eab0b24e5 */
package cuesz.membersummary;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;
import cuesz.utils.YearUtil;

public class Case29_MS_Editnewgoal extends BasePage {

	SeleniumUtils utils = new SeleniumUtils(driver);
	private By teamLderNtesHeadng = (By.xpath("//h2[normalize-space()='Team Leader Coach Notes']"));
	private By notedatepicker = By.id("MemberSummary-TeamLeaderCoachNotes-DatePicker");
	private By edt1bttn	=	(By.className("btn_edit"));
	private By	inpu1field		= (By.xpath("//textarea[@id='editor']"));
	private By saevbttn		= 	(By.xpath("(//img[@alt='save'])[1]"));
	private By checbox		=	(By.xpath("(//input[@name='redFlag'])[1]"));
	
	private By edt2bttn	=	(By.xpath("(//img[@alt='save'])[2]"));
	private By	inpu2field		= (By.xpath("(//textarea[@id='editor'])[1]"));
	private By saev2bttn		= 	(By.xpath("(//img[@alt='save'])[2]"));
	private By checbox2		=	(By.xpath("(//input[@name='redFlag'])[4]"));
	
	private By edt3bttn	=	(By.xpath("(//img[@alt='save'])[3]"));
	private By	inpu3field		= (By.xpath("(//textarea[@id='editor'])[1]"));
	private By saev3bttn		= 	(By.xpath("(//img[@alt='save'])[3]"));
	private By checbox3		=	(By.xpath("(//input[@name='redFlag'])[5]"));
	
	private By edt4bttn	=	(By.xpath("(//img[@alt='save'])[4]"));
	private By	inpu4field		= (By.xpath("(//textarea[@id='editor'])[1]"));
	private By saev4bttn		= 	(By.xpath("(//img[@alt='save'])[4]"));
	private By checbox4		=	(By.xpath("(//input[@name='redFlag'])[6]"));

    public Case29_MS_Editnewgoal(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Test
    public void editgoalclick() throws InterruptedException {
		Thread.sleep(2000);
        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();
 
        // Scroll to the "Team Leader Coach Notes" heading
        Thread.sleep(3000);
        WebElement teamLeaderNotesHeading = driver.findElement(teamLderNtesHeadng);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", teamLeaderNotesHeading);
        
        // Call the private void editGoals
        editGoals();
        
        // Find the date picker
        WebElement notedate = driver.findElement(notedatepicker);
        
        // Click on the date picker
        notedate.click();
        
        Thread.sleep(2000);
        
        int nextYear = Calendar.getInstance().get(Calendar.YEAR) + 1;
        String nextYearName = YearUtil.getYearName(nextYear);
        WebElement nextYearElement = driver.findElement(By.xpath("//div[normalize-space()='" + nextYearName + "']"));
        nextYearElement.click();
        Thread.sleep(2000);
        
        // Call the private void editGoals again
        editGoals();
	}
        private void editGoals() throws InterruptedException {
        /*Short Term Goals - 3 Months*/
        Thread.sleep(2500);
     // Locate and click the "Edit" button
        driver.findElement(edt1bttn).click();
        Thread.sleep(2000);
     // Locate the input field and send keys (input values)
        driver.findElement(inpu1field).sendKeys("Value 1\n update new file to text");  
        Thread.sleep(2000);
     // Locate and click the "Save" button
        driver.findElement(saevbttn).click();
        Thread.sleep(2000);
        // Locate and click the "CHECKBOXES" button
        driver.findElement(checbox).click();
           
        /*Long Term Goal*/
        Thread.sleep(2500);
     // Locate and click the "Edit" button
        driver.findElement(edt2bttn).click();
        Thread.sleep(2000);
     // Locate the input field and send keys (input values)
        driver.findElement(inpu2field).sendKeys("Value 1\n update new file to text");  
        Thread.sleep(2000);
     // Locate and click the "Save" button
        driver.findElement(saev2bttn).click();
         Thread.sleep(2000);
     // Locate and click the "CHECKBOXES" button
        driver.findElement(checbox2).click();
        
        /*Process Thinking*/
        Thread.sleep(2500);
      // Locate and click the "Edit" button
        driver.findElement(edt3bttn).click();
        Thread.sleep(2000);
      // Locate the input field and send keys (input values)
        driver.findElement(inpu3field).sendKeys("Value 1\n update new file to text");  
        Thread.sleep(2000);
     // Locate and click the "Save" button
        driver.findElement(saev3bttn).click();
        Thread.sleep(2000);
     // Locate and click the "CHECKBOXES" button
        driver.findElement(checbox3).click();
        
        
        /*Process Thinking-2*/
        Thread.sleep(2500);
      // Locate and click the "Edit" button
        driver.findElement(edt4bttn).click();
        Thread.sleep(2000);
      // Locate the input field and send keys (input values)
        driver.findElement(inpu4field).sendKeys("Value 1\n update new file to text");  
        Thread.sleep(2000);
     // Locate and click the "Save" button
        driver.findElement(saev4bttn).click();
        Thread.sleep(2000);
     // Locate and click the "CHECKBOXES" button 
        driver.findElement(checbox4).click();
    
        
        }    
    }
  
    
        
       
	    
      
    
    
  
