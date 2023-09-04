package cuesz.logicpage;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;

public class Case36_MSL_Staffnotes extends BasePage {
	
	SeleniumUtils utils = new SeleniumUtils(driver);
	private By logibttn = (By.xpath("//span[normalize-space()='Logic Page']"));
	private By logicElement = (By.xpath("//h3[text()='Logic Page']"));
	private By staNtsElement =	(By.xpath("//div[contains(text(), 'Staff Notes')]"));
	private By Stafplus = (By.xpath("(//button[@data-bs-target='#StaffNotes'])[1]"));
	private By mondayDate = (By.xpath("//h6[contains(text(), 'Monday')]"));
	private By compliance = (By.name("Compliance"));
	private By travlFild = (By.name("Travel"));
	private By memberFeedback = (By.name("Memberfeedback"));
	private By noteFild =(By.name("Notes"));
	private By outsdeBlok = (By.tagName("body"));
	private By tuesdayBlck = (By.xpath("//h6[contains(text(), 'Tuesday')]"));
	private By complancfeld = (By.xpath("(//textarea[@placeholder='Compliance'])[2]"));
	private By traelFeld1 = (By.xpath("(//textarea[@placeholder='Travel'])[2]"));
	private By memberfedbck = (By.xpath("(//textarea[@placeholder='Member feedback'])[2]"));
	private By noteFid1 = (By.xpath("(//textarea[@placeholder='Notes'])[2]"));
	//private By outsideBlck = (By.tagName("body"));
	

	private By wedBlock = (By.xpath("//h6[contains(text(), 'Wednesday')]"));
	private By compField11 = (By.xpath("(//textarea[@placeholder='Compliance'])[3]"));
	private By travFid11 = (By.xpath("(//textarea[@placeholder='Travel'])[3]"));
	private By memberFeedField11 = (By.xpath("(//textarea[@placeholder='Member feedback'])[3]"));
	private By notesFd11 = (By.xpath("(//textarea[@placeholder='Notes'])[3]"));
	//private By outsidlock11 = (By.tagName("body"));
	private By nextbttn = (By.xpath("//span[normalize-space()='Next Week']"));
    private By mondBlockElement = (By.xpath("//h6[contains(text(), 'Monday')]"));
    private By complTextarea = (By.xpath("//h6[contains(text(), 'Monday')]/following-sibling::div//textarea[@name='Compliance']"));
    private By travelarea = (By.xpath("//h6[contains(text(), 'Monday')]/following-sibling::div//textarea[@name='Travel']"));
    private By memberFeedarea = (By.xpath("//h6[contains(text(), 'Monday')]/following-sibling::div//textarea[@name='Memberfeedback']"));
    private By notesarea = (By.xpath("//h6[contains(text(), 'Monday')]/following-sibling::div//textarea[@name='Notes']"));
    private By lastButton = (By.xpath("//button[contains(.,'Last Week')]"));   
    
    
    private By selectBtton = (By.xpath("//h2[@id='StaffNotesCard']//span[contains(text(),'Select')]"));
    private By todayDaElement = (By.xpath("//div[contains(@class, 'DayPicker-Day--today')]"));	        
    private By Copybton = (By.xpath("//div[@id='StaffNotesCard']//div[@class='d-flex justify-content-end calender_drop']//button[1]"));
    
    private By netbttn1 = (By.xpath("//span[normalize-space()='Next Week']"));
    private By mndayBlokEment1 = (By.xpath("//h6[contains(text(), 'Monday')]"));
    private By compeTtarea1 = (By.xpath("//h6[contains(text(), 'Monday')]/following-sibling::div//textarea[@name='Compliance']"));
    private By trelTxtaea1 = (By.xpath("//h6[contains(text(), 'Monday')]/following-sibling::div//textarea[@name='Travel']"));
    private By memdbackTextarea1 = (By.xpath("//h6[contains(text(), 'Monday')]/following-sibling::div//textarea[@name='Memberfeedback']"));
    private By no2sxarea1 = (By.xpath("//h6[contains(text(), 'Monday')]/following-sibling::div//textarea[@name='Notes']"));
	

	
	public Case36_MSL_Staffnotes(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	 @Test
	    public void staffnotes() throws InterruptedException, ParseException {
	        Thread.sleep(2000);

	        utils.clickMembersummary();
	        utils.waitForMilliseconds(2000);
	        utils.enterSearchText();
	        utils.clickMembername();

   		   /***********************************landed on Logic page ***************************************************************************************************/
	        Thread.sleep(2000);
	        WebElement Logicbutton = driver.findElement(logibttn);
	        Logicbutton.click();
	        
	        Thread.sleep(2000);
	     // Locate the element that contains the heading "Logic Page"
	        WebElement logicHeadingElement = driver.findElement(logicElement);

	        // Check if the element is displayed or not
	        if (logicHeadingElement.isDisplayed()) {
	            System.out.println("Logic page heading is displayed.");
	        } else {
	            System.out.println("Logic page heading is not displayed.");
	        }
	        
	        Thread.sleep(2000);
	    
	    /***************************************Click on Staff notes and scroll******************************************************************************************/
	      
	        	     // Find the "Staff Notes" element
        WebElement staffNotesElement = driver.findElement(staNtsElement);
        // Scroll to the "Staff Notes" element using JavaScriptExecutor
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'center'});", staffNotesElement);
	      
	        Thread.sleep(1000);
	        
	        WebElement Staffnoteplus = driver.findElement(Stafplus);
	        Staffnoteplus.click();

	 /****************************************Click on next & previous button and get week*****************************************************************************************************/     
	     // Use the next&	previous utility method
	        utils.navigateToLastAndNextWeek();
	        
	        Thread.sleep(2000);
	    /****************************************Input data as per next week selected and populate data in three days***************************************************************************************************/
	       	        
	     // Find the Monday date element
	        WebElement mondayDateElement = driver.findElement(mondayDate);

	        // Get the Monday date text
	        String mondayDate = mondayDateElement.getText();
	        System.out.println("Monday date: " + mondayDate);

	        
	        /**********************************************************Populate data for monday *************************************************************************************/
	        
	        // Find and fill in the text fields
	        WebElement complianceField = driver.findElement(compliance);
	        complianceField.clear();
	        complianceField.sendKeys("Compliance is a word that has different meanings depending on the context. In general, it means the act or process of obeying a law, rule, demand, or request");

	        Thread.sleep(500);
	        WebElement travelField = driver.findElement(travlFild);
	        travelField.clear();
	        travelField.sendKeys("Travel is a word that has different meanings depending on the context. In general, it means to go from one place to another, usually over a long distance, or the activity of doing this");

	        Thread.sleep(500);
	        WebElement memberFeedbackField = driver.findElement(memberFeedback);
	        memberFeedbackField.clear();
	        memberFeedbackField.sendKeys("Member feedback is a term that can have different meanings depending on the context.");

	        Thread.sleep(500);
	        WebElement notesField = driver.findElement(noteFild);
	        notesField.clear();
	        notesField.sendKeys("Feedback Thank you for putting in the extra effort during this busy time. T");

	        Thread.sleep(500);
	        // Click outside of the block to save data
	        WebElement outsideBlock = driver.findElement(outsdeBlok);
	        outsideBlock.click();
	        Thread.sleep(2000);
	        
	        /****************************************************************Populate data for Tuesday week*******************************************/
	        
	        // Find the "Tuesday" logic block element
	        WebElement tuesdayBlock = driver.findElement(tuesdayBlck);

	        // Extract the "Tuesday" text from the "g_title" element
	        String tuesdayText = tuesdayBlock.getText();
	        System.out.println("Tuesday: " + tuesdayText);

	        // Find the "Compliance" text area in Tuesday's block and fill in the data after clearing any existing data
	        WebElement complianceField1 = tuesdayBlock.findElement(complancfeld);
	        complianceField1.clear();
	        complianceField1.sendKeys("Tuesday's Compliance data");

	        // Find the "Travel" text area in Tuesday's block and fill in the data after clearing any existing data
	        WebElement travelField1 = tuesdayBlock.findElement(traelFeld1);
	        travelField1.clear();
	        travelField1.sendKeys("Tuesday's Travel data");

	        // Find the "Member Feedback" text area in Tuesday's block and fill in the data after clearing any existing data
	        WebElement memberFeedbackField1 = tuesdayBlock.findElement(memberfedbck);
	        memberFeedbackField1.clear();
	        memberFeedbackField1.sendKeys("Tuesday's Member feedback data");

	        // Find the "Notes" text area in Tuesday's block and fill in the data after clearing any existing data
	        WebElement notesField1 = tuesdayBlock.findElement(noteFid1);
	        notesField1.clear();
	        notesField1.sendKeys("Tuesday's Notes data");

	        Thread.sleep(500);
	        // Click outside of the block to save data
	        WebElement outsideBlock1 = driver.findElement(outsdeBlok);
	        outsideBlock1.click();
	        
	        Thread.sleep(1000);
	        
	        /****************************************************************Populate data for Wednesday week*******************************************/
	        
	        // Find the "Wednesday" logic block element
	        WebElement wednesdayBlock = driver.findElement(wedBlock);

	        // Extract the week for Wednesday from the "g_title" element
	   //     WebElement gTitleElement = wednesdayBlock.findElement(By.className("g_title"));
	        String weekText = wednesdayBlock.getText();
	        System.out.println("Week for Wednesday: " + weekText);

	        // Find the "Compliance" text area in Wednesday's block and fill in the data after clearing any existing data
	        WebElement complianceField11 = wednesdayBlock.findElement(compField11);
	        complianceField11.clear();
	        complianceField11.sendKeys("Wednesday's Compliance data");

	        // Find the "Travel" text area in Wednesday's block and fill in the data after clearing any existing data
	        WebElement travelField11 = wednesdayBlock.findElement(travFid11);
	        travelField11.clear();
	        travelField11.sendKeys("Wednesday's Travel data");

	        // Find the "Member Feedback" text area in Wednesday's block and fill in the data after clearing any existing data
	        WebElement memberFeedbackField11 = wednesdayBlock.findElement(memberFeedField11);
	        memberFeedbackField11.clear();
	        memberFeedbackField11.sendKeys("Wednesday's Member feedback data");

	        // Find the "Notes" text area in Wednesday's block and fill in the data after clearing any existing data
	        WebElement notesField11 = wednesdayBlock.findElement(notesFd11);
	        notesField11.clear();
	        notesField11.sendKeys("Wednesday's Notes data");
	        
	        WebElement outsideBlock11 = driver.findElement(outsdeBlok);
	        outsideBlock11.click();
	        Thread.sleep(1500);
	    
	        
	        /**************************** Compares data for next week before copy ***************************************************************************/          
	        Thread.sleep(2500);
	        WebElement nextbutton = driver.findElement(nextbttn);
	        nextbutton.click();
	  
	     // Find the <div> element for Monday
	        WebElement mondayBlockElement = driver.findElement(mondBlockElement);

	        // Extract the text from the <div> element for Monday
	        String mondayText = mondayBlockElement.getText();
	        System.out.println("Monday Date: " + mondayText);

	        // Find the <textarea> element for Compliance within Monday block
	        WebElement complianceTextarea = driver.findElement(complTextarea);
	        String complianceValue = complianceTextarea.getAttribute("value");
	        System.out.println("Compliance: " + complianceValue);

	        // Find the <textarea> element for Travel within Monday block
	        WebElement travelTextarea = driver.findElement(travelarea);
	        String travelValue = travelTextarea.getAttribute("value");
	        System.out.println("Travel: " + travelValue);

	        // Find the <textarea> element for Member feedback within Monday block
	        WebElement memberFeedbackTextarea = driver.findElement(memberFeedarea);
	        String memberFeedbackValue = memberFeedbackTextarea.getAttribute("value");
	        System.out.println("Member Feedback: " + memberFeedbackValue);

	        // Find the <textarea> element for Notes within Monday block
	        WebElement notesTextarea = driver.findElement(notesarea);
	        String notesValue = notesTextarea.getAttribute("value");
	        System.out.println("Notes: " + notesValue);
	        
	        WebElement lastWeekButton = driver.findElement(lastButton);   
            lastWeekButton.click();
            
	        Thread.sleep(2500);
	        
	        /**************************** Select week and copy data*****************************************************************************************/    
		     
		     // Find and click on the "Select" button
		        WebElement selectButton = driver.findElement(selectBtton);
		        selectButton.click();

		        // Find today's date element
		        WebElement todayDateElement = driver.findElement(todayDaElement);

		        // Get the text of today's date (e.g., "3")
		        String todayDateText = todayDateElement.getText();

		        // Extract the day value from today's date
		        int today = Integer.parseInt(todayDateText);

		        // Calculate the date for two weeks ahead (adding 14 days)
		        int twoWeeksAhead = today + 6;

		        // Find the date element for two weeks ahead and click on it
		        // Note: This assumes that the date picker uses the format "Thu Aug 3 2023"
		        String desiredDateLocator = String.format("//div[@aria-label='%s']", LocalDate.now().plusDays(twoWeeksAhead).format(DateTimeFormatter.ofPattern("EEE MMM d yyyy")));
		        WebElement desiredDateElement = driver.findElement(By.xpath(desiredDateLocator));
		        desiredDateElement.click();

		        Thread.sleep(2500);

		        // Print the value of the clicked date
		        System.out.println("Clicked on date: " + desiredDateElement.getText());

		        
		        Thread.sleep(1000);
		        
		        WebElement Copybutton = driver.findElement(Copybton);
		        Copybutton.click();
	        
	        
		        /**************************** Need to compares again copied data After copy ***********************************************************************************/          
		        Thread.sleep(2500);
		        WebElement nextbutton1 = driver.findElement(netbttn1);
		        nextbutton1.click();
		  
		     // Find the <div> element for Monday
		        WebElement mondayBlockElement1 = driver.findElement(mndayBlokEment1);

		        // Extract the text from the <div> element for Monday
		        String mondayText1 = mondayBlockElement1.getText();
		        System.out.println("Monday Date: " + mondayText1);

		        // Find the <textarea> element for Compliance within Monday block
		        WebElement complianceTextarea1 = driver.findElement(compeTtarea1);
		        String complianceValue1 = complianceTextarea1.getAttribute("value");
		        System.out.println("Compliance: " + complianceValue1);

		        // Find the <textarea> element for Travel within Monday block
		        WebElement travelTextarea1 = driver.findElement(trelTxtaea1);
		        String travelValue1 = travelTextarea1.getAttribute("value");
		        System.out.println("Travel: " + travelValue1);

		        // Find the <textarea> element for Member feedback within Monday block
		        WebElement memberFeedbackTextarea1 = driver.findElement(memdbackTextarea1);
		        String memberFeedbackValue1 = memberFeedbackTextarea1.getAttribute("value");
		        System.out.println("Member Feedback: " + memberFeedbackValue1);

		        // Find the <textarea> element for Notes within Monday block
		        WebElement notesTextarea1 = driver.findElement(no2sxarea1);
		        String notesValue1 = notesTextarea1.getAttribute("value");
		        System.out.println("Notes: " + notesValue1);   
		        
		        
		        Thread.sleep(2500);
		        
		        
		 }
	}
	 
