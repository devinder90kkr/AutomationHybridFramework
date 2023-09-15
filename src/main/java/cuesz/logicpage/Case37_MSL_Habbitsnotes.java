	package cuesz.logicpage;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;

public class Case37_MSL_Habbitsnotes extends BasePage {

	SeleniumUtils utils = new SeleniumUtils(driver);
	private By Logibttn =   (By.xpath("//span[normalize-space()='Logic Page']"));
	private By habitNtslement =(By.xpath("//div[contains(text(), 'Habit Notes')]"));
	private By habitNtslementplus = (By.xpath("(//button[@data-bs-target='#HabitNotes'])[1]"));
	private By habitstesNots = (By.xpath("(//h6[@class='g_title'][normalize-space()='Team Notes'])[2]"));
	private By mondayDaelment = (By.xpath("//h6[contains(text(), 'Monday')]"));
	private By notsfild = (By.xpath("(//textarea[@placeholder='Notes'])[8]"));
	private By outsdeBlck1 = (By.tagName("body"));
	private By notfild1 = (By.xpath("(//textarea[@placeholder='Notes'])[9]"));
	private By outdeBlck2 = (By.tagName("body"));
	private By notesfld2 = (By.xpath("(//textarea[@placeholder='Notes'])[10]"));
	private By outeBlck3 = (By.tagName("body"));
	
	private By netbttn = (By.xpath("//span[normalize-space()='Next Week']"));
	private By mndayBlcoklement = (By.xpath("//h6[contains(text(), 'Monday')]"));
	private By habtxtaea = (By.xpath("//h6[contains(text(), 'Monday')]/following-sibling::div[@class='logic_block_body']//textarea[@name='habitNotes']"));
	private By tudayBlcoklement = (By.xpath("//h6[contains(text(), 'Tuesday')]"));
	private By habtxtare1 = (By.xpath("//h6[contains(text(), 'Tuesday')]/following-sibling::div[@class='logic_block_body']//textarea[@name='habitNotes']"));
	private By latWekubttn = (By.xpath("//button[contains(.,'Last Week')]"));
	
	private By slctBttn =	(By.xpath("//h2[@id='HabitNotesCard']//span[contains(text(),'Select')]"));
	private By tdydtelement = (By.xpath("//div[contains(@class, 'DayPicker-Day--today')]"));
	private By Cpybttn =(By.xpath("//div[@id='HabitNotesCard']//button[2]"));
	
	private By poplement = (By.cssSelector(".file_upload_modal"));
	private By dtaFrmlement = (By.cssSelector(".date_field"));
	private By dtaTolement =	(By.cssSelector(".data_copy_list li span"));
	private By ysBttn = (By.cssSelector("button.btn-primary"));

	private By nxtbttn1 = (By.xpath("//span[normalize-space()='Next Week']"));
	private By mndayBlcklement1 = (By.xpath("//h6[contains(text(), 'Monday')]"));
	private By habttxtara1 = (By.xpath("//h6[contains(text(), 'Monday')]/following-sibling::div[@class='logic_block_body']//textarea[@name='habitNotes']"));
	private By tudayBlcklement1 = (By.xpath("//h6[contains(text(), 'Tuesday')]"));
	private By habttxtarea11 = (By.xpath("//h6[contains(text(), 'Tuesday')]/following-sibling::div[@class='logic_block_body']//textarea[@name='habitNotes']"));
    
    public Case37_MSL_Habbitsnotes(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	 @Test
	    public void habbitsnotes() throws InterruptedException, ParseException {
	        Thread.sleep(2000);

	        utils.clickMembersummary();
	        utils.waitForMilliseconds(2000);
	        utils.enterSearchText();
	        utils.clickMembername();
     /**********************************landed on Logic page ***************************************************************************************************/
	        Thread.sleep(2000);
   		   	WebElement Logicbutton =   driver.findElement(Logibttn);
   		   	Logicbutton.click();	       
	 /***************************************Click on Habbits notes and scroll******************************************************************************************/
   		   	Thread.sleep(5000);
   		   	// Find the "Habbits Notes" element
   		   	WebElement habbitsNotesElement = driver.findElement(habitNtslement);
   		   	// Scroll to the "Staff Notes" element using JavaScriptExecutor
   		   	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'center'});", habbitsNotesElement);
           
   		   	Thread.sleep(1000);  
   		   	WebElement Habbitsnoteplus = driver.findElement(habitNtslementplus);
   		   	Habbitsnoteplus.click();
	        
   		   	WebElement habbitsteamsNotes = driver.findElement(habitstesNots);
   		   	// Scroll to the "Staff Notes" element using JavaScriptExecutor
   		   	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'center'});", habbitsteamsNotes);
	      

	    /****************************************Click on next & previous button and get week*****************************************************************************************************/        
   		 // Use the next&	previous utility method
	        utils.navigateToLastAndNextWeek();
	        
	        Thread.sleep(2000);

	    /************************************************Input data as per next week selected and populate data in three days***************************************************************************************************/
	        	        
	     // Find the Monday date element
	        WebElement mondayDateElement = driver.findElement(mondayDaelment);

	        // Get the Monday date text
	        String mondayDate = mondayDateElement.getText();
	        System.out.println("Monday date: " + mondayDate);

	        
	        /********************************************************************Populate data for monday *************************************************************************************/
	        Thread.sleep(2000);
	        // Find and fill in the text fields
	        WebElement notesfield = driver.findElement(notsfild);
	        notesfield.clear();
	        notesfield.sendKeys("Compliance is a word that has different meanings depending on the context. In general, it means the act or process of obeying a law, rule, demand, or request");
	        
	        
	        // Click outside of the block to save data
	        WebElement outsideBlock1 = driver.findElement(outsdeBlck1);
	        outsideBlock1.click();
	        
	        Thread.sleep(1000);
	        
	        /****************************************************************Populate data for Tuesday week*******************************************/      
	        
	        // Find and fill in the text fields
	        WebElement notesfield1 = driver.findElement(notfild1);
	        notesfield1.clear();
	        notesfield1.sendKeys("Habits notes are a type of journaling where you track your daily habits and routines in order to monitor your progress and make positive changes");
	        
	        
	        Thread.sleep(2000);
	        // Click outside of the block to save data
	        WebElement outsideBlock2 = driver.findElement(outdeBlck2);
	        outsideBlock2.click();
	        
	        Thread.sleep(1000);
	        
	        /****************************************************************Populate data for Wednesday week*******************************************/

	        Thread.sleep(2000);
	        // Find and fill in the text fields
	        WebElement notesfield2 = driver.findElement(notesfld2);
	        notesfield2.clear();
	        notesfield2.sendKeys("Habits notes are written records of one's daily habits and routines. They can be used to track progress, identify patterns, and make adjustments to improve overall productivity and well-being");
	        
	        
	        Thread.sleep(1500);
	        // Click outside of the block to save data
	        WebElement outsideBlock3 = driver.findElement(outeBlck3);
	        outsideBlock3.click();
	        
	        /**************************** Compares data for next week before copy ***************************************************************************/          
	        Thread.sleep(2500);
	        WebElement nextbutton = driver.findElement(netbttn);
	        nextbutton.click();
	        Thread.sleep(2000);
	     
	        // Find the <div> element for Monday
	        WebElement mondayBlockElement = driver.findElement(mndayBlcoklement);
	        String mondayText = mondayBlockElement.getText();
	        System.out.println("Monday Date: " + mondayText);
	        
	        Thread.sleep(2000);
	        // Wait for the textarea element to be present
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        WebElement habitstxtarea = wait.until(ExpectedConditions.presenceOfElementLocated(habtxtaea));
	        String habbitsValue = habitstxtarea.getAttribute("value");
	        System.out.println("Habbits: " + habbitsValue);
	        
	        Thread.sleep(2000);
	        // Find the <div> element for Tuesday
	        WebElement tuesdayBlockElement = driver.findElement(tudayBlcoklement);
	        String tuesdayText = tuesdayBlockElement.getText();
	        System.out.println("Tuesday Date: " + tuesdayText);
	        
	        Thread.sleep(2000);
	        // Wait for the textarea element to be present for Tuesday
	        WebElement habitstxtarea1 = wait.until(ExpectedConditions.presenceOfElementLocated(habtxtare1));
	        String habbitsValue1 = habitstxtarea1.getAttribute("value");
	        System.out.println("Habbits: " + habbitsValue1);
	        
	        Thread.sleep(2000);
	        WebElement lastWeekButton = driver.findElement(latWekubttn);
	        lastWeekButton.click();
	        
	        /**************************** Select week and copy data*****************************************************************************************/    
	     // Find and click on the "Select" button
	        WebElement selectButton = driver.findElement(slctBttn);
	        selectButton.click();

//	     // Find today's date element
//	        WebElement todayDateElement = driver.findElement(tdydtelement);
//
//	        // Get the text of today's date (e.g., "3")
//	        String todayDateText = todayDateElement.getText();
//
//	        // Extract the day value from today's date
//	        int today = Integer.parseInt(todayDateText);
//
//	        // Calculate the date for two weeks ahead (adding 14 days)
//	        int twoWeeksAhead = today + 6;
//
//	        // Find the date element for two weeks ahead and click on it
//	        // Note: This assumes that the date picker uses the format "Thu Aug 3 2023"
//	        String desiredDateLocator = String.format("//div[@aria-label='%s']", LocalDate.now().plusDays(twoWeeksAhead).format(DateTimeFormatter.ofPattern("EEE MMM d yyyy")));
//	        WebElement desiredDateElement = driver.findElement(By.xpath(desiredDateLocator));
//	        desiredDateElement.click();

	     // Calculate the desired date for two weeks ahead
		     LocalDate currentDate = LocalDate.now();
		     LocalDate desiredDate = currentDate.plusWeeks(2); // Change 2 to the desired number of weeks ahead

		     // Check if the desired date is in the next month
		     if (desiredDate.getMonthValue() != currentDate.getMonthValue()) {
		         // Click on the "Next Month" arrow button
		         WebElement nextMonthButton = driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"));
		         nextMonthButton.click();
		     }

		     // Find the date element for the desired date and click on it
		     String desiredDateLocator = String.format("//div[@aria-label='%s']", desiredDate.format(DateTimeFormatter.ofPattern("EEE MMM d yyyy")));
		     WebElement desiredDateElement = driver.findElement(By.xpath(desiredDateLocator));
		     desiredDateElement.click();

		     Thread.sleep(2500);

	        
	        
	        Thread.sleep(2500);
	        // Print the value of the clicked date
	        System.out.println("Clicked on date: " + desiredDateElement.getText());
	        

	        WebElement Copybutton = driver.findElement(Cpybttn);
	        Copybutton.click();
	        
	        /**************************** Validate copied data *****************************************************************************************/    
        
	     // Find the popup element
	        WebElement popupElement = driver.findElement(poplement);

	        // Check if the popup is open
	        if (popupElement.isDisplayed()) {
	            // Extract values from the popup
	            WebElement dataFromElement = popupElement.findElement(dtaFrmlement);
	            WebElement dataToElement = popupElement.findElement(dtaTolement);
	            
	            // Get the text values
	            String dataFrom = dataFromElement.getText();
	            String dataTo = dataToElement.getText();
	            
	            System.out.println("Data to be copied from: " + dataFrom);
	            System.out.println("Data will be copied to: " + dataTo);
	            
	            // Perform actions as needed (click Yes/No buttons, etc.)
	        } else {
	            System.out.println("Popup is not open.");
	        }

	     // Find the "Yes" button and click on it
	        WebElement yesButton = popupElement.findElement(ysBttn);
	        yesButton.click();

	        
	        /**************************** Need to compares again copied data After copy ***********************************************************************************/          
	      
	        Thread.sleep(2500);
	        WebElement nextbutton1 = driver.findElement(nxtbttn1);
	        nextbutton1.click();
	        Thread.sleep(2000);
	     
	        // Find the <div> element for Monday
	        WebElement mondayBlockElement1 = driver.findElement(mndayBlcklement1);
	        String mondayText1 = mondayBlockElement1.getText();
	        System.out.println("Monday Date: " + mondayText1);
	        
	        Thread.sleep(2000);
	        // Wait for the textarea element to be present
	        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
	        WebElement habitstxtarea11 = wait1.until(ExpectedConditions.presenceOfElementLocated(habttxtara1));
	        String habbitsValue11 = habitstxtarea11.getAttribute("value");
	        System.out.println("Habbits: " + habbitsValue11);
	        
	        Thread.sleep(2000);
	        // Find the <div> element for Tuesday
	        WebElement tuesdayBlockElement1 = driver.findElement(tudayBlcklement1);
	        String tuesdayText1 = tuesdayBlockElement1.getText();
	        System.out.println("Tuesday Date: " + tuesdayText1);
	        
	        Thread.sleep(2000);
	        // Wait for the textarea element to be present for Tuesday
	        WebElement habitstxtarea111 = wait1.until(ExpectedConditions.presenceOfElementLocated(habttxtarea11));
	        String habbitsValue111 = habitstxtarea111.getAttribute("value");
	        System.out.println("Habbits: " + habbitsValue111);
	        
	        Thread.sleep(2500);
	        
	 }
}
 

