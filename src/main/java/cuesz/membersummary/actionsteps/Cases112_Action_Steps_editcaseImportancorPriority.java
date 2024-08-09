package cuesz.membersummary.actionsteps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.date.functions.DateGenerator;
import cuesz.date.functions.Nextdategeneratorfunction;
import cuesz.pages.BasePage;
import cuesz.schdule.Case01_createvent;
import cuesz.web.resources.ElementActions;
import cuesz.web.resources.webTestdata;
import cuesz.web.resources.weblocators;

public class Cases112_Action_Steps_editcaseImportancorPriority extends BasePage {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Cases112_Action_Steps_editcaseImportancorPriority.class);
    private ElementActions elementActions;
    public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date
    public static String eventDate1 = Nextdategeneratorfunction.generateTomorrowDate(); // Use the generated date
    
    public Cases112_Action_Steps_editcaseImportancorPriority(WebDriver driver) {
        super(driver);
        this.elementActions = new ElementActions(driver);
    }

    @Test
    public void editactionsteps() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(35)); // Adjusted to 35 seconds for practicality

        // Click on plus icon for action steps 
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.importancesection));
        elementActions.clickElement(weblocators.importancesection);
        // Log message to console and Allure report
        LOGGER.info("Clicked on importancesection");
        AllureUtils.logStep("Clicked on importancesection");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Cases112_Action_Steps_editcaseImportancorPriority1");
        Thread.sleep(2500);

        /*Enter value for importance date field*/
        WebElement importancedatefield = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.importancedatefield));
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(importancedatefield).click().sendKeys(eventDate).sendKeys(Keys.ENTER).perform();
		 // Log message to console and Allure report
        LOGGER.info("Enter values for importance date field: " +  eventDate);
        AllureUtils.logStep("Enter values for importance date field; " +  eventDate);
        
        /*Enter Time values for importance date field*/
		WebElement importanceTime = wait.until(ExpectedConditions.elementToBeClickable(weblocators.importancetimefield));
	    Actions builder = new Actions(driver);
	    builder.moveToElement(importanceTime).click().sendKeys(webTestdata.startime).perform();
	    Thread.sleep(3500);
	    builder.click();
	    // Log message to console and Allure report
        LOGGER.info("Enter values for importance time field :" +  webTestdata.startime);
        AllureUtils.logStep("Enter values for importance time field :" +  webTestdata.startime);
       
        // Click on plus icon for action steps 
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.submtimportance));
        elementActions.clickElement(weblocators.submtimportance);
        // Log message to console and Allure report
        LOGGER.info("Clicked on submtimportance");
        AllureUtils.logStep("Clicked on submtimportance");
        
        // Verify the presence of the "Important" label and get the date text
        WebElement importantLabelElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='priority_seg active_note_step']")));
        
        // Ensure the element is displayed
        if (importantLabelElement.isDisplayed()) {
            LOGGER.info("Important label is displayed.");
            AllureUtils.logStep("Important label is displayed.");
        } else {
            LOGGER.error("Important label is not displayed.");
            AllureUtils.logStep("Important label is not displayed.");
            return; // Exit the test if the label is not displayed
        }
        
        // Get and log the date text
        String displayedDate = importantLabelElement.getText();
        LOGGER.info("Displayed date under Important label: " + displayedDate);
        AllureUtils.logStep("Displayed date under Important label: " + displayedDate);
       
        Thread.sleep(2500);
        
        // Click on important active detail
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.importancesection1));
        elementActions.clickElement(weblocators.importancesection1);
        // Log message to console and Allure report
        LOGGER.info("Clicked on importancesection");
        AllureUtils.logStep("Clicked on importancesection");
       
       Thread.sleep(2500);  
        // Click on remove for important 
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.removeimportant));
        elementActions.clickElement(weblocators.removeimportant);
        // Log message to console and Allure report
        LOGGER.info("Clicked on removeimportant");
        AllureUtils.logStep("Clicked on removeimportant");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Cases112_Action_Steps_editcaseImportancorPriority1");
        
        // Click on Confirm button
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.confirmbttn));
        elementActions.clickElement(weblocators.confirmbttn);
        // Log message to console and Allure report
        LOGGER.info("Clicked on confirmbttn");
        AllureUtils.logStep("Clicked on confirmbttn");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Cases112_Action_Steps_editcaseImportancorPriority2");
        
        
											    Thread.sleep(3500);
											    //Click on priority icon for action steps
											    wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.prioritydatefield));
											    elementActions.clickElement(weblocators.prioritydatefield);
											    // Log message to console and Allure report
											    LOGGER.info("Clicked on importancesection");
											    AllureUtils.logStep("Clicked on importancesection");
											    // Capture a screenshot and attach it to Allure
											    AllureUtils.captureScreenshot(driver, "Cases112_Action_Steps_editcaseImportancorPriority1");
											    Thread.sleep(3500);
											   
											    /*Enter value for priority date field*/
											    WebElement importancedatefield1 = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.importancedatefield));
												Actions builder11 = new Actions(driver);
												builder11.moveToElement(importancedatefield1).click().sendKeys(eventDate).sendKeys(Keys.ENTER).perform();
												 // Log message to console and Allure report
											    LOGGER.info("Enter values for importance date field: " +  eventDate);
											    AllureUtils.logStep("Enter values for importance date field; " +  eventDate);
											    
											    /*Enter Time values for priority time field*/
												WebElement importanceTime1 = wait.until(ExpectedConditions.elementToBeClickable(weblocators.importancetimefield));
											    Actions builder2 = new Actions(driver);
											    builder2.moveToElement(importanceTime1).click().sendKeys(webTestdata.startime).perform();
											    Thread.sleep(3500);
											    builder2.click();
											    // Log message to console and Allure report
											    LOGGER.info("Enter values for importance time field :" +  webTestdata.startime);
											    AllureUtils.logStep("Enter values for importance time field :" +  webTestdata.startime);
											   
											    // Click on plus icon for action steps 
											    wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.submtimportance));
											    elementActions.clickElement(weblocators.submtimportance);
											    // Log message to console and Allure report
											    LOGGER.info("Clicked on submtimportance");
											    AllureUtils.logStep("Clicked on submtimportance");
											    
											 // Verify the presence of the "Important" label and get the date text
											    WebElement importantLabelElement1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='priority_seg active_note_step']")));
											    
											    // Ensure the element is displayed
											    if (importantLabelElement1.isDisplayed()) {
											        LOGGER.info("Important label is displayed.");
											        AllureUtils.logStep("Important label is displayed.");
											    } else {
											        LOGGER.error("Important label is not displayed.");
											        AllureUtils.logStep("Important label is not displayed.");
											        return; // Exit the test if the label is not displayed
											    }
											    
											    // Get and log the date text
											    String displayedDate1 = importantLabelElement1.getText();
											    LOGGER.info("Displayed date under Important label: " + displayedDate1);
											    AllureUtils.logStep("Displayed date under Important label: " + displayedDate1);
											    
        // Click on plus icon for action steps 
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.importancesection));
        elementActions.clickElement(weblocators.importancesection);
        // Log message to console and Allure report
        LOGGER.info("Clicked on importancesection");
        AllureUtils.logStep("Clicked on importancesection");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Cases112_Action_Steps_editcaseImportancorPriority1");
        Thread.sleep(2500);
        
        // Click on plus icon for action steps 
        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.submtimportance));
        elementActions.clickElement(weblocators.submtimportance);
        // Log message to console and Allure report
        LOGGER.info("Clicked on submtimportance");
        AllureUtils.logStep("Clicked on submtimportance");
           
        // Get the text from completetab and log it
        String completetabText3 = driver.findElement(By.xpath("//span[@class='blinked']")).getText();
        LOGGER.info("Text from label: " + completetabText3);
        AllureUtils.logStep("Text from label: " + completetabText3);
        Thread.sleep(2500);
        										
        
									        // Click on important active detail
									        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.importancesection1));
									        elementActions.clickElement(weblocators.importancesection1);
									        // Log message to console and Allure report
									        LOGGER.info("Clicked on importancesection");
									        AllureUtils.logStep("Clicked on importancesection");
									        
									        Thread.sleep(2500);  
									        // Click on remove for important 
									        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.removeimportant));
									        elementActions.clickElement(weblocators.removeimportant);
									        // Log message to console and Allure report
									        LOGGER.info("Clicked on removeimportant");
									        AllureUtils.logStep("Clicked on removeimportant");
									        // Capture a screenshot and attach it to Allure
									        AllureUtils.captureScreenshot(driver, "Cases112_Action_Steps_editcaseImportancorPriority1");
									        
									        // Click on Confirm button
									        wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.confirmbttn));
									        elementActions.clickElement(weblocators.confirmbttn);
									        // Log message to console and Allure report
									        LOGGER.info("Clicked on confirmbttn");
									        AllureUtils.logStep("Clicked on confirmbttn");
									        // Capture a screenshot and attach it to Allure
									        AllureUtils.captureScreenshot(driver, "Cases112_Action_Steps_editcaseImportancorPriority2");
        
       
		        Thread.sleep(3500);
			    //Click on priority icon for action steps
			    wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.prioritydatefield));
			    elementActions.clickElement(weblocators.prioritydatefield);
			    // Log message to console and Allure report
			    LOGGER.info("Clicked on importancesection");
			    AllureUtils.logStep("Clicked on importancesection");
			    // Capture a screenshot and attach it to Allure
			    AllureUtils.captureScreenshot(driver, "Cases112_Action_Steps_editcaseImportancorPriority1");
			    
			    Thread.sleep(3500);
			    //Click on priority icon for action steps
			    wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.editdattimepriority));
			    elementActions.clickElement(weblocators.editdattimepriority);
			    // Log message to console and Allure report
			    LOGGER.info("Clicked on editdattimepriority");
			    AllureUtils.logStep("Clicked on editdattimepriority");
			    // Capture a screenshot and attach it to Allure
			    AllureUtils.captureScreenshot(driver, "Cases112_Action_Steps_editcaseImportancorPriority1");
			    Thread.sleep(3500);

			   			    
			    // Find the input field for the edit date and clear the existing value
		        WebElement importancedatefield2 = driver.findElement(weblocators.importancedatefield);
		        Actions builder111 = new Actions(driver);
		        // windows command
//			    editTime1.sendKeys(Keys.CONTROL + "a");
			    // mac command
		        importancedatefield2.sendKeys(Keys.COMMAND + "a");
		        importancedatefield2.sendKeys(Keys.DELETE);

		        // Get the assigned event date from Script 1
		        String assignedDate = Case01_createvent.eventDate;
		        // Split the date to extract day, month, and year
		        String[] dateParts = assignedDate.split("-");
		        int day1 = Integer.parseInt(dateParts[0]);
		        int month1 = Integer.parseInt(dateParts[1]);
		        int year = Integer.parseInt(dateParts[2]);

		        // Calculate the next day's date
		        day1 += 1;
		        if (day1 > 31) {
		            day1 = 1;
		            month1 += 1;
		            if (month1 > 12) {
		                month1 = 1;
		                year += 1;
		            }
		        }

		        // Format the next day's date
		        String nextDayDate = String.format("%02d-%02d-%04d", day1, month1, year);        
		        // Enter the updated date in the edit field
		        builder111.moveToElement(importancedatefield2).click().sendKeys(nextDayDate).sendKeys(Keys.ENTER).perform();			    
			    
    	 
		        WebElement importanceTime3 = wait.until(ExpectedConditions.elementToBeClickable(weblocators.importancetimefield));
		       // window command
//		        endTimeInput.sendKeys(Keys.CONTROL + "a");
		         //mac command
		        importanceTime3.sendKeys(Keys.COMMAND + "a");
		        importanceTime3.sendKeys(Keys.DELETE);
		        // Enter the new start time (09:00 AM)
		        Actions builder23 = new Actions(driver);
		        builder23.moveToElement(importanceTime3).sendKeys(webTestdata.endtime);
		        // Press Enter to confirm the new time
		        builder23.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
  
			   
			    // Click on plus icon for action steps 
			    wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.submtimportance));
			    elementActions.clickElement(weblocators.submtimportance);
			    // Log message to console and Allure report
			    LOGGER.info("Clicked on submtimportance");
			    AllureUtils.logStep("Clicked on submtimportance");
//			   
			    // Get the text from completetab and log it
		        String label2 = driver.findElement(By.xpath("(//div[contains(@class,'priority_seg active_note_step')])[1]")).getText();
		        LOGGER.info("Text from label: " + label2);
		        AllureUtils.logStep("Text from label: " + label2);
		        Thread.sleep(2500);
    }}

