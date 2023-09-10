	package cuesz.logicpage;
	
import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;
	
	public class Case44_MSL_Mindful extends BasePage {
		
		SeleniumUtils utils = new SeleniumUtils(driver);
		private By Logicbttn =   (By.xpath("//span[normalize-space()='Logic Page']"));
		private By mindfulhdng = (By.id("Mindfull"));
		private By mindflnopls = (By.xpath("//div[normalize-space()='Mindful']//button[@type='button']"));
		private By slctbttn = (By.xpath("//div[@id='Mindfull']//div[@class='d-flex justify-content-end calender_drop']//button[1]"));
		private By heainelment = (By.xpath("(//h6[contains(text(),'Biofeedback')])[1]"));
		private By labeelment = (By.xpath("(//label[contains(text(),'Training Day/Non Training Day')])[1]"));
		private By selectLPInput =	(By.id("MindfulDay-Monday"));
		private By slecttmin =	(By.id("MindfulMins-Monday"));
		private By outsBlcok1 = (By.tagName("body"));
	    private By selectLPinpt1  =(By.id("MindfulDay-Tuesday"));
	    private By Selectmininpt2 =(By.id("MindfulMins-Tuesday"));
	    private By outsideBlck2 = (By.tagName("body"));
	    private By slctbtt11 = (By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[12]/div[1]/div[1]/h2[1]/div[2]/button[1]"));
	    private By slctBttn = (By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[12]/div[1]/div[1]/h2[1]/div[2]/button[1]"));
	    private By tdaydatelemnt = (By.xpath("//div[contains(@class, 'DayPicker-Day--today')]"));
	    private By Coybttn = (By.xpath("(//button[@class='btn btn-sm btn-primary m-1'])[10]"));
	    private By Savesbttn = (By.xpath("(//button[normalize-space()='Yes'])[1]"));
	    private By Nxtwk34 = (By.xpath("//button[contains(.,'Next Week')]"));
	    private By nxtWkButton = (By.xpath("//button[contains(.,'Next Week')]"));
	    private By mindflhedng2 = (By.xpath("(//div[normalize-space()='Mindful'])[1]"));
	    private By slctbttn2 = (By.xpath("//div[@id='Mindfull']//div[@class='d-flex justify-content-end calender_drop']//button[1]"));
	    private By elemntinpt = (By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[12]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"));
	    private By elemntinp2 = (By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[12]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"));
		
		 public Case44_MSL_Mindful(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}

		@Test
		    public void mindful() throws InterruptedException, ParseException {
		        Thread.sleep(2000);
	
		        utils.clickMembersummary();
		        utils.waitForMilliseconds(2000);
		        utils.enterSearchText();
		        utils.clickMembername();
	
	   		   /***********************************landed on Logic page ***************************************************************************************************/
	   		   Thread.sleep(2000);
	   		   WebElement Logicbutton =   driver.findElement(Logicbttn);
	   		   Logicbutton.click();

	   		  /****************************************Click on next & previous button and get week*****************************************************************************************************/        

	   		// Use the next&	previous utility method
		        utils.navigateToLastAndNextWeek();
		        
		        Thread.sleep(2000);
		  	        
	   		   
	        /***************************************Click on mindful and scroll******************************************************************************************/
		  	   Thread.sleep(5500);
		  	   WebElement mindfulheading = driver.findElement(mindfulhdng);
		       // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);;", mindfulheading);
			     		
			   Thread.sleep(5500);				// Wait for the element to be clickable
			   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); // Adjust the timeout as needed
			   WebElement mindfulnoteplus = wait.until(ExpectedConditions.elementToBeClickable(mindflnopls));
			   mindfulnoteplus.click();
			   		
			   Thread.sleep(5500);
			   // Example usage:
			   WebElement selectbutton = driver.findElement(slctbttn);
			   // Scroll to the "Staff Notes" element using JavaScriptExecutor
			   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", selectbutton);

		
    
		        

     /********************************************************************Populate data for monday first activity *************************************************************************************/
			   Thread.sleep(2500);
			   // Locate the heading element
		       WebElement headingElement = driver.findElement(heainelment);
		       // Get the text of the heading
		       String actualHeading = headingElement.getText();
		       // Expected heading value
		       String expectedHeading = "Biofeedback";
		       // Perform the assertion
		       if (actualHeading.equals(expectedHeading)) {
		           System.out.println("Assertion Passed: Heading is 'Biofeedback'");
		       } else {
		           System.out.println("Assertion Failed: Heading is not 'Biofeedback'");
		       }

			  
		       // Locate the label element
		        WebElement labelElement = driver.findElement(labeelment);

		        // Get the text of the label
		        String actualLabelText = labelElement.getText();

		        // Expected label text
		        String expectedLabelText = "Training Day/Non Training Day";

		        // Perform the assertion
		        if (actualLabelText.equals(expectedLabelText)) {
		            System.out.println("Assertion Passed: Label text is 'Training Day/Non Training Day'");
		        } else {
		            System.out.println("Assertion Failed: Label text is not 'Training Day/Non Training Day'");
		        }
		       
		       
			   
			   Thread.sleep(2000);
			   WebElement selectLP =driver.findElement(selectLPInput);
			   Actions builder = new Actions(driver);
			   builder.moveToElement(selectLP).click().sendKeys("Training Day").perform();
			   Thread.sleep(2000);
			   builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			   
			 

			   Thread.sleep(2000);
			   WebElement Selectmin =driver.findElement(slecttmin);
			   Actions builder1 = new Actions(driver);
			   builder1.moveToElement(Selectmin).click().sendKeys("18 Minutes").perform();
			   Thread.sleep(2000);
			   builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			   
			   Thread.sleep(2500);
			// Click outside of the block to save data
		        WebElement outsideBlock1 = driver.findElement(outsBlcok1);
		        outsideBlock1.click();
			   
			   
			   /********************************************************************Populate data for tuesday first activity *************************************************************************************/		      
		     // Locate the element using XPath
		        WebElement element = driver.findElement(By.xpath("//h6[@class='g_title']"));
		        // Extract the text from the element
		        String extractedText = element.getText();
		        // Print the extracted text
		        System.out.println("Extracted Text: " + extractedText);
		        
			   Thread.sleep(2000);
			   WebElement selectLP1 =driver.findElement(selectLPinpt1);
			   Actions builder2 = new Actions(driver);
			   builder2.moveToElement(selectLP1).click().sendKeys("Non Training Day").perform();
			   Thread.sleep(2000);
			   builder2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			   
			   Thread.sleep(2000);
			   WebElement Selectmin2 =driver.findElement(Selectmininpt2);
			   Actions builder3 = new Actions(driver);
			   builder3.moveToElement(Selectmin2).click().sendKeys("16 Minutes").perform();
			   Thread.sleep(2000);
			   builder3.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			   
			   Thread.sleep(2500);
			   
			// Click outside of the block to save data
		        WebElement outsideBlock2 = driver.findElement(outsideBlck2);
		        outsideBlock2.click();
			   /************************************ Select week and copy data******************************************************************/    
		        
		        Thread.sleep(5500);
				// Example usage:
				WebElement selectbutton11 = driver.findElement(slctbtt11);
			    // Scroll to the "Staff Notes" element using JavaScriptExecutor
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", selectbutton11);
		        
		        
		        Thread.sleep(2500);
		        // Find and click on the "Select" button
			    WebElement selectButton = driver.findElement(slctBttn);
			    selectButton.click();

			    // Find today's date element
			    WebElement todayDateElement = driver.findElement(tdaydatelemnt);

			    // Get the text of today's date (e.g., "3")
			    String todayDateText = todayDateElement.getText();

			    // Extract the day value from today's date
			    int today = Integer.parseInt(todayDateText);

			    // Calculate the date for two weeks ahead (adding 14 days)
			     int twoWeeksAhead = today + 8;

			    // Calculate the desired date
			     LocalDate currentDate = LocalDate.now();
			     LocalDate desiredDate = currentDate.plusDays(twoWeeksAhead);

			     // Check if the desired date is in the next month
			     if (desiredDate.getMonthValue() != currentDate.getMonthValue()) {
			         // Click on the "Next Month" arrow button
			         WebElement nextMonthButton = driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']"));
			         nextMonthButton.click();
			     }
			     	     
			    // Find the date element for two weeks ahead and click on it
			    // Note: This assumes that the date picker uses the format "Thu Aug 3 2023"
    		    String desiredDateLocator = String.format("//div[@aria-label='%s']", LocalDate.now().plusDays(twoWeeksAhead).format(DateTimeFormatter.ofPattern("EEE MMM d yyyy")));
		        WebElement desiredDateElement = driver.findElement(By.xpath(desiredDateLocator));
		        desiredDateElement.click();

		        Thread.sleep(2500);
		        // Print the value of the clicked date
		        System.out.println("Clicked on date: " + desiredDateElement.getText());
		        
		        Thread.sleep(2500);
			    WebElement Copybutton = driver.findElement(Coybttn);
			    Copybutton.click();
		        Thread.sleep(2500);		
		        
		        // Locate an element within the pop-up
		        By popupElementLocator = By.xpath("//h3[contains(text(), 'Are you sure you want to copy the data for 1 weeks.')]");
		        WebElement popupElement = driver.findElement(popupElementLocator);

		        // Check if the pop-up element is displayed
		        if (popupElement.isDisplayed()) {
		            System.out.println("Pop-up is open.");
		        } else {
		            System.out.println("Pop-up is not open.");
		        }
		        Thread.sleep(500);
		     // Locate elements within the pop-up
		        By dataFromElementLocator = By.xpath("//span[contains(@class, 'date_field')]");
		        By dataToElementLocator = By.xpath("//ul[contains(@class, 'data_copy_list')]//span");

		        WebElement dataFromElement = driver.findElement(dataFromElementLocator);
		        WebElement dataToElement = driver.findElement(dataToElementLocator);

		        // Extract and print the values
		        String dataFromValue = dataFromElement.getText();
		        String dataToValue = dataToElement.getText();

		        System.out.println("Data to be copied from: " + dataFromValue);
		        System.out.println("Data will be copied to: " + dataToValue);
		        
		        
		        WebElement saveyesbutton = driver.findElement(Savesbttn);
		        saveyesbutton.click();
		        Thread.sleep(2500); 
		       

		
			        
			        
			   
		 }
	}
	 
	
