	package feature.case11_logicpage;

import java.text.ParseException;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import commonfunction.DatePickerUtility_logicpage;
import base.BasePage;
import utils.SeleniumUtils;
import constant.weblocators;

public class Case37_MSL_Habbitsnotes extends BasePage {

	SeleniumUtils utils = new SeleniumUtils(driver);    
    public Case37_MSL_Habbitsnotes(WebDriver driver) {
		super(driver);
		
	}
	
	 @Test
	    public void habbitsnotes() throws InterruptedException, ParseException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	        Thread.sleep(2000);

	        utils.clickMembersummary();
	        utils.waitForMilliseconds(2000);
	        utils.enterSearchText();
	        utils.clickMembername();
     /**********************************landed on Logic page ***************************************************************************************************/
	        Thread.sleep(2000);
   		   	WebElement Logicbutton =   driver.findElement(weblocators.Logibttn);
   		   	Logicbutton.click();	       
	 /***************************************Click on Habbits notes and scroll******************************************************************************************/
   		   	Thread.sleep(5000);
   		   	// Find the "Habbits Notes" element
   		   	WebElement habbitsNotesElement = driver.findElement(weblocators.habitNtslement);
   		   	// Scroll to the "Staff Notes" element using JavaScriptExecutor
   		   	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'center'});", habbitsNotesElement);
           
   		   	Thread.sleep(1000);  
   		   	WebElement Habbitsnoteplus = driver.findElement(weblocators.habitNtslementplus);
   		   	Habbitsnoteplus.click();
	        
   		   	WebElement habbitsteamsNotes = driver.findElement(weblocators.habitstesNots);
   		   	// Scroll to the "Staff Notes" element using JavaScriptExecutor
   		   	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'center'});", habbitsteamsNotes);
	      

	    /****************************************Click on next & previous button and get week*****************************************************************************************************/        
   		 // Use the next&	previous utility method
	        utils.navigateToLastAndNextWeek();
	        
	        Thread.sleep(2000);

	    /************************************************Input data as per next week selected and populate data in three days***************************************************************************************************/
	        	        
	     // Find the Monday date element
	        WebElement mondayDateElement = driver.findElement(weblocators.mondayDaelment);

	        // Get the Monday date text
	        String mondayDate = mondayDateElement.getText();
	        System.out.println("Monday date: " + mondayDate);

	        
	        /********************************************************************Populate data for monday *************************************************************************************/
	        Thread.sleep(2000);
	        // Find and fill in the text fields
	        WebElement notesfield = driver.findElement(weblocators.notsfild);
	        notesfield.clear();
	        notesfield.sendKeys("Compliance is a word that has different meanings depending on the context. In general, it means the act or process of obeying a law, rule, demand, or request");
	        
	        
	        // Click outside of the block to save data
	        WebElement outsideBlock1 = driver.findElement(weblocators.outsdeBlck1);
	        outsideBlock1.click();
	        
	        Thread.sleep(1000);
	        
	        /****************************************************************Populate data for Tuesday week*******************************************/      
	        
	        // Find and fill in the text fields
	        WebElement notesfield1 = driver.findElement(weblocators.notfild1);
	        notesfield1.clear();
	        notesfield1.sendKeys("Habits notes are a type of journaling where you track your daily habits and routines in order to monitor your progress and make positive changes");
	        
	        
	        Thread.sleep(2000);
	        // Click outside of the block to save data
	        WebElement outsideBlock2 = driver.findElement(weblocators.outdeBlck2);
	        outsideBlock2.click();
	        
	        Thread.sleep(1000);
	        /**************************** Select week and copy data*****************************************************************************************/    
	        WebElement Copybuttonclick = wait.until(ExpectedConditions.elementToBeClickable(weblocators.copybutton1));
	        Thread.sleep(2500);
	        Copybuttonclick.click();
	        // Call the utility method to select the desired date as per above scripts 
	        DatePickerUtility_logicpage.selectDesiredDate(driver);
	        

	        WebElement Copybutton = driver.findElement(weblocators.Cpybttn);
	        Copybutton.click();
	        
	        /**************************** Validate copied data *****************************************************************************************/    
        
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
 

