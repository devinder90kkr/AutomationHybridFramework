package cuesz.logicpage;

import java.text.ParseException;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;
import cuesz.utils.date.DatePickerUtility_logicpage;
import cuesz.utils.web.weblocators;

public class Case36_MSL_Staffnotes extends BasePage {
	
	SeleniumUtils utils = new SeleniumUtils(driver);

		public Case36_MSL_Staffnotes(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	 @Test
	    public void staffnotes() throws InterruptedException, ParseException {
		 
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	        Thread.sleep(2000);

	        utils.clickMembersummary();
	        utils.waitForMilliseconds(2000);
	        utils.enterSearchText();
	        utils.clickMembername();

   		   /***********************************landed on Logic page ***************************************************************************************************/
	        Thread.sleep(2000);
	        WebElement Logicbutton = driver.findElement(weblocators.logibttn);
	        Logicbutton.click();
	        
	        Thread.sleep(2000);
	     // Locate the element that contains the heading "Logic Page"
	        WebElement logicHeadingElement = driver.findElement(weblocators.logicElement);

	        // Check if the element is displayed or not
	        if (logicHeadingElement.isDisplayed()) {
	            System.out.println("Logic page heading is displayed.");
	        } else {
	            System.out.println("Logic page heading is not displayed.");
	        }
	        
	        Thread.sleep(2000);
	    
	    /***************************************Click on Staff notes and scroll******************************************************************************************/
	      
	        	     // Find the "Staff Notes" element
        WebElement staffNotesElement = driver.findElement(weblocators.staNtsElement);
        // Scroll to the "Staff Notes" element using JavaScriptExecutor
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'center'});", staffNotesElement);
	      
	        Thread.sleep(1000);
	        
	        WebElement Staffnoteplus = driver.findElement(weblocators.Stafplus);
	        Staffnoteplus.click();

	 /****************************************Click on next & previous button and get week*****************************************************************************************************/     
	     // Use the next&	previous utility method
	        utils.navigateToLastAndNextWeek();
	        
	        Thread.sleep(2000);
	    /****************************************Input data as per next week selected and populate data in three days***************************************************************************************************/
	       	        
	     // Find the Monday date element
	        WebElement mondayDateElement = driver.findElement(weblocators.mondayDate);

	        // Get the Monday date text
	        String mondayDate = mondayDateElement.getText();
	        System.out.println("Monday date: " + mondayDate);

	        
	        /**********************************************************Populate data for monday *************************************************************************************/
	        
	        // Find and fill in the text fields
	        WebElement complianceField = driver.findElement(weblocators.compliance);
	        complianceField.clear();
	        complianceField.sendKeys("Compliance is a word that has different meanings depending on the context. In general, it means the act or process of obeying a law, rule, demand, or request");

	        Thread.sleep(500);
	        WebElement travelField = driver.findElement(weblocators.travlFild);
	        travelField.clear();
	        travelField.sendKeys("Travel is a word that has different meanings depending on the context. In general, it means to go from one place to another, usually over a long distance, or the activity of doing this");

	        Thread.sleep(500);
	        WebElement memberFeedbackField = driver.findElement(weblocators.memberFeedback);
	        memberFeedbackField.clear();
	        memberFeedbackField.sendKeys("Member feedback is a term that can have different meanings depending on the context.");

	        Thread.sleep(500);
	        WebElement notesField = driver.findElement(weblocators.noteFild);
	        notesField.clear();
	        notesField.sendKeys("Feedback Thank you for putting in the extra effort during this busy time. T");

	        Thread.sleep(500);
	        // Click outside of the block to save data
	        WebElement outsideBlock = driver.findElement(weblocators.outsdeBlok);
	        outsideBlock.click();
	        Thread.sleep(2000);
	        
	        /****************************************************************Populate data for Tuesday week*******************************************/
	        
	        // Find the "Tuesday" logic block element
	        WebElement tuesdayBlock = driver.findElement(weblocators.tuesdayBlck);

	        // Extract the "Tuesday" text from the "g_title" element
	        String tuesdayText = tuesdayBlock.getText();
	        System.out.println("Tuesday: " + tuesdayText);

	        // Find the "Compliance" text area in Tuesday's block and fill in the data after clearing any existing data
	        WebElement complianceField1 = tuesdayBlock.findElement(weblocators.complancfeld);
	        complianceField1.clear();
	        complianceField1.sendKeys("Tuesday's Compliance data");

	        // Find the "Travel" text area in Tuesday's block and fill in the data after clearing any existing data
	        WebElement travelField1 = tuesdayBlock.findElement(weblocators.traelFeld1);
	        travelField1.clear();
	        travelField1.sendKeys("Tuesday's Travel data");

	        // Find the "Member Feedback" text area in Tuesday's block and fill in the data after clearing any existing data
	        WebElement memberFeedbackField1 = tuesdayBlock.findElement(weblocators.memberfedbck);
	        memberFeedbackField1.clear();
	        memberFeedbackField1.sendKeys("Tuesday's Member feedback data");

	        // Find the "Notes" text area in Tuesday's block and fill in the data after clearing any existing data
	        WebElement notesField1 = tuesdayBlock.findElement(weblocators.noteFid1);
	        notesField1.clear();
	        notesField1.sendKeys("Tuesday's Notes data");

	        Thread.sleep(500);
	        // Click outside of the block to save data
//	        WebElement outsideBlock1 = driver.findElement(outsdeBlok);
	        WebElement outsideBlock1 = wait.until(ExpectedConditions.elementToBeClickable(weblocators.outsdeBlok));
	        outsideBlock1.click();
	        
	        /****************************************************************Populate data for Wednesday week*******************************************/
	        
	        // Find the "Wednesday" logic block element
	        WebElement wednesdayBlock = driver.findElement(weblocators.wedBlock);

	        // Extract the week for Wednesday from the "g_title" element
	   //     WebElement gTitleElement = wednesdayBlock.findElement(By.className("g_title"));
	        String weekText = wednesdayBlock.getText();
	        System.out.println("Week for Wednesday: " + weekText);

	        // Find the "Compliance" text area in Wednesday's block and fill in the data after clearing any existing data
	        WebElement complianceField11 = wednesdayBlock.findElement(weblocators.compField11);
	        complianceField11.clear();
	        complianceField11.sendKeys("Wednesday's Compliance data");

	        // Find the "Travel" text area in Wednesday's block and fill in the data after clearing any existing data
	        WebElement travelField11 = wednesdayBlock.findElement(weblocators.travFid11);
	        travelField11.clear();
	        travelField11.sendKeys("Wednesday's Travel data");

	        // Find the "Member Feedback" text area in Wednesday's block and fill in the data after clearing any existing data
	        WebElement memberFeedbackField11 = wednesdayBlock.findElement(weblocators.memberFeedField11);
	        memberFeedbackField11.clear();
	        memberFeedbackField11.sendKeys("Wednesday's Member feedback data");

	        // Find the "Notes" text area in Wednesday's block and fill in the data after clearing any existing data
	        WebElement notesField11 = wednesdayBlock.findElement(weblocators.notesFd11);
	        notesField11.clear();
	        notesField11.sendKeys("Wednesday's Notes data");
	        
//	        WebElement outsideBlock11 = driver.findElement(outsdeBlok);
	        WebElement outsideBlock11 = wait.until(ExpectedConditions.elementToBeClickable(weblocators.outsdeBlok));
	        outsideBlock11.click();
	        Thread.sleep(1500);
	    

	        Thread.sleep(2500);
	        
	        WebElement Copybuttonclick = wait.until(ExpectedConditions.elementToBeClickable(weblocators.copybutton1));
	        Thread.sleep(2500);
	        Copybuttonclick.click();
	        
	        
			  // Call the utility method to select the desired date as per above scripts 
			  DatePickerUtility_logicpage.selectDesiredDate(driver);

		        
		        Thread.sleep(1000);
		        
		        WebElement Copybutton = driver.findElement(weblocators.Copybton);
		        Copybutton.click();
		        
		      Thread.sleep(2500); 
		        // Find the popup element
		        WebElement popupElement = driver.findElement(weblocators.poplement);

		        // Check if the popup is open
		        if (popupElement.isDisplayed()) {
		            // Extract values from the popup
		            WebElement dataFromElement = popupElement.findElement(weblocators.dtaFrmlement);
		            WebElement dataToElement = popupElement.findElement(weblocators.dtaTolement);
		            
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
		        WebElement yesButton = popupElement.findElement(weblocators.ysBttn);
		        yesButton.click();
	        
		        Thread.sleep(2500);
		        
		        
		 }
	}
	 
