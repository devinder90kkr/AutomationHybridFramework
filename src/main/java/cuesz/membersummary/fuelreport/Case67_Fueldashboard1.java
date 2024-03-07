package cuesz.membersummary.fuelreport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.AllureUtils;
import cuesz.utils.SeleniumUtils;
import org.openqa.selenium.StaleElementReferenceException;

public class Case67_Fueldashboard1 extends BasePage{
				
	SeleniumUtils utils = new SeleniumUtils(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(10));
	
	private By fuelicon = (By.id("MemberSummary-FuelReport"));
		private By insulin = (By.id("FuelReport-Insulin"));
		private By hormones = (By.id("FuelReport-Hormone"));
		private By cardio = (By.id("FuelReport-Cardio"));
		private By gut = (By.id("FuelReport-Gut"));
		private By brain = (By.id("FuelReport-Brain"));
		private By adrenal = (By.id("FuelReport-Adrenal"));
		private By Detox = (By.id("FuelReport-Detox"));
		private By lipids = (By.id("FuelReport-Lipids"));
		
		
		private By guidelinesarea = (By.id("FuelReport-Insulin-Guidelines"));
		private By guidlinesavebtton= (By.id("FuelReport-Insulin-GuidelinesSave"));
		
		private By CardiotextArea = (By.id("FuelReport-Cardio-Guidelines"));
		private By cardiosavebtton = (By.id("FuelReport-Cardio-GuidelinesSave"));	
		
		
		private By GutArea = (By.id("FuelReport-Gut-Guidelines"));
		private By gutsaveButton = (By.id("FuelReport-Gut-GuidelinesSave"));
		
		private By BrainGuidelines = (By.id("FuelReport-Brain-Guidelines"));
		private By BGuidelinessaveButton = (By.id("FuelReport-Brain-GuidelinesSave"));
		
		private By DetoxAreaElement = (By.id("FuelReport-Detox-Guidelines"));
        private By DetoxsaveBttn = (By.id("FuelReport-Detox-GuidelinesSave"));
        
        private By LipidsArea = (By.id("FuelReport-Lipids-Guidelines"));
        private By lipidssaveBttn = (By.id("FuelReport-Lipids-GuidelinesSave"));
       
        private By DefaultGuidelineArea = (By.id("FuelReport-Default-Guidelines"));
        private By DefaultGuidesaveBttn = (By.id("FuelReport-Default-GuidelinesSave"));
		
		
		
		
		public Case67_Fueldashboard1(WebDriver driver) {
			super(driver);
		}
			
		 @Test
		    public void fuelreport()throws InterruptedException {
			 Thread.sleep(2000);
			
			        utils.clickMembersummary();
			        utils.waitForMilliseconds(2000);
			        utils.enterSearchText();
				    utils.clickMembername();
			
				 WebElement Fuelreporticon = driver.findElement(fuelicon);
				 Fuelreporticon.click();
				 
				 Thread.sleep(9000);
		 /************************Member target details**************************************************************************/		 
			try {
				
				WebElement Insulincard = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(insulin)));
				Insulincard.click();	
				
				 Thread.sleep(3500); 
				 WebElement hormonescard  = driver.findElement(hormones);
				 hormonescard.click();
				 
				 Thread.sleep(3500); 
				 WebElement cardiocard = driver.findElement(cardio);
				 cardiocard.click();
				 
				 Thread.sleep(3500); 
				 WebElement gutcard = driver.findElement(gut);
				 gutcard.click();
				 
				 Thread.sleep(3500); 
				 WebElement braincard = driver.findElement(brain);
				 braincard.click();
				
				 Thread.sleep(3500); 
				 WebElement adrenalcard = driver.findElement(adrenal);
				 adrenalcard.click();
		
				 Thread.sleep(3500); 
				 WebElement Detoxcard  = driver.findElement(Detox);
				 Detoxcard.click();
				 
				 
				 Thread.sleep(3500); 
				 WebElement lipidscard = driver.findElement(lipids);
				 lipidscard.click();
				 		 
				 
				// Capture a screenshot and attach it to Allure
			        AllureUtils.captureScreenshot(driver, "Case67_Fueldashboard1");
				 
				} catch (StaleElementReferenceException e) {
					    
			}
				
	 
			 Thread.sleep(3500);
			
			 
/***v************************************************************************************************************/

		 try {
		// Find the <guidelinesarea> element by its ID
		
		// Find the heading element you want to scroll to (e.g., by text)
       WebElement headingElement = driver.findElement(By.xpath("//h4[text()='Insulin Guidelines']"));

       // Create a JavascriptExecutor object
       JavascriptExecutor js = (JavascriptExecutor) driver;

       // Scroll to the heading element
       js.executeScript("arguments[0].scrollIntoView();", headingElement);

       // Optionally, you can add a delay to let the scrolling animation finish
       try {
           Thread.sleep(1000); // Adjust the sleep time as needed
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
	
			WebElement GuidelinesAreaElement = driver.findElement(guidelinesarea);
			
			// Scroll to the heading element
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth' });", GuidelinesAreaElement);
			// Clear any existing text in the <textarea> field (optional)
			GuidelinesAreaElement.clear();
			// Input a longer text into the <textarea> field
			GuidelinesAreaElement.sendKeys("New insulin guidelines: Administer 10 units of insulin before each meal. Monitor blood glucose levels regularly. Adjust insulin dosage as needed based on blood glucose readings. Consult with the healthcare provider for further guidance on insulin management and dietary recommendations.");
			 
	        WebElement guidlinessavebttn = driver.findElement(guidlinesavebtton);
	        guidlinessavebttn.click();
	        
	        // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "Case67_Fueldashboard2");
		 
	        
	        
	 } catch (StaleElementReferenceException e) {
		    
		}
		
	        Thread.sleep(9500);
					        
			/****************************************************************************************************/
			 // Find the <CardiotextArea> element by its ID
			WebElement CardiotextAreaElement = driver.findElement(CardiotextArea);
			 Thread.sleep(3500); 
			// Scroll to the heading element
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth' });", CardiotextAreaElement);
	
			// Clear any existing text in the <textarea> field (optional)
			CardiotextAreaElement.clear();
			// Input your desired text into the <textarea> field
			CardiotextAreaElement.sendKeys("Cardiovascular Guidelines: Maintain a heart-healthy diet rich in fruits, vegetables, and whole grains. Engage in regular aerobic exercise for at least 30 minutes a day. Monitor blood pressure and cholesterol levels. Take prescribed medications as directed by your healthcare provider. Schedule regular check-ups for cardiovascular health.");
				
			WebElement cardiosave = driver.findElement(cardiosavebtton);
			cardiosave.click();
			
			 // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "Case67_Fueldashboard3");
			
			Thread.sleep(2500);
			
			/***************************************************************************************/
			
			// Find the <GutArea> element by its ID
	        WebElement GutAreaElement = driver.findElement(GutArea);
	        // Clear any existing text in the <textarea> field (optional)
	        GutAreaElement.clear();
	        // Input your desired text into the <textarea> field
	        GutAreaElement.sendKeys("Gut Guidelines: Maintain a diet rich in fiber and probiotics for gut health. Avoid excessive consumption of processed foods. Stay hydrated and incorporate fermented foods into your diet for a healthy gut microbiome.");
	        // Find and click the "Save" button by its ID
	       
	        WebElement saveButton = driver.findElement(gutsaveButton);
	        saveButton.click();

	        // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "Case67_Fueldashboard4");
	        
	        Thread.sleep(2500);
	        
	        
	        /********************************************************************************************************/

	        // Find the <Brain-Guidelines> element by its ID
	        WebElement BrainGuidelinesAreaElement = driver.findElement(BrainGuidelines);	        
	        // Scroll to the heading element
	     	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", BrainGuidelinesAreaElement);
	        // Clear any existing text in the <textarea> field (optional)
	        BrainGuidelinesAreaElement.clear();
	        // Input your desired text into the <textarea> field
	        BrainGuidelinesAreaElement.sendKeys("Brain Guidelines: Ensure regular mental exercise to keep the brain sharp. Eat a diet rich in antioxidants and omega-3 fatty acids for brain health. Stay hydrated and get adequate sleep for cognitive function.");

	        // Find and click the "Save" button by its ID
	        WebElement BrainGuidelinessaveButton = driver.findElement(BGuidelinessaveButton);
	        BrainGuidelinessaveButton.click();
	        
	        // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "Case67_Fueldashboard5");
	        Thread.sleep(2500);
	        
	       /******************************************************************************************************/ 
	        // Find the <Detox> element by its ID
	        WebElement DetoxtextAreaElement = driver.findElement(DetoxAreaElement);
	        // Clear any existing text in the <textarea> field (optional)
	        DetoxtextAreaElement.clear();
	        // Input your desired text into the <textarea> field
	        DetoxtextAreaElement.sendKeys("Detox Guidelines: Follow a plant-based diet rich in fruits and vegetables. Drink plenty of water to flush out toxins. Avoid processed foods and alcohol. Consider a detox cleanse under the guidance of a healthcare professional.");

	        // Find and click the "Save" button by its ID
	        WebElement DetoxsaveButton = driver.findElement(DetoxsaveBttn);
	        DetoxsaveButton.click();
	        
	     // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "Case67_Fueldashboard6");
	        
	        Thread.sleep(2500);
	        
	   /*********************************************************************************************************/     
	        // Find the <Lipids> element by its ID
	        WebElement LipidstextAreaElement = driver.findElement(LipidsArea);
	        // Clear any existing text in the <textarea> field (optional)
	        LipidstextAreaElement.clear();
	        // Input your desired text into the <textarea> field
	        LipidstextAreaElement.sendKeys("Lipids Guidelines: Maintain a low-fat diet to manage cholesterol levels. Increase consumption of healthy fats like avocados and nuts. Exercise regularly to promote cardiovascular health. Discuss lipid-lowering medications with your healthcare provider if necessary.");

	        // Find and click the "Save" button by its ID
	        WebElement lipidssaveButton = driver.findElement(lipidssaveBttn);
	        lipidssaveButton.click();
	        
	        // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "Case67_Fueldashboard7");
	        
	        Thread.sleep(2500);
	   
	   /***************************************************************************************************************/     
	        // Find the <DefaultGuideline> element by its ID
	        WebElement DefaultGuidelineAreaElement = driver.findElement(DefaultGuidelineArea);
	        // Clear any existing text in the <textarea> field (optional)
	        DefaultGuidelineAreaElement.clear();
	        // Input your desired text into the <textarea> field
	        DefaultGuidelineAreaElement.sendKeys("Default Guidelines: Follow a balanced diet and regular exercise for overall health. Stay hydrated and get adequate sleep. Monitor and manage stress levels. Consult with your healthcare provider for personalized recommendations.");

	        // Find and click the "Save" button by its ID
	        WebElement DefaultGuidesaveButton = driver.findElement(DefaultGuidesaveBttn);
	        DefaultGuidesaveButton.click(); 
			 
	     // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "Case67_Fueldashboard8");
			  
			 
			 Thread.sleep(5500);
	/*********************************************************************/		 
			 
			 try {
			
				 WebElement Insulin = driver.findElement(insulin);
				 // Create a WebDriverWait with a specified timeout
				 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));

				 // Wait for the element to be clickable
				 wait.until(ExpectedConditions.elementToBeClickable(Insulin));

				 // Scroll to the element using JavaScriptExecutor
				 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Insulin);
				 
				 Thread.sleep(9500);
					WebElement Insulincard = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(insulin)));
					Insulincard.click();	
					
					 Thread.sleep(3500); 
					 WebElement hormonescard  = driver.findElement(hormones);
					 hormonescard.click();
					 
					 Thread.sleep(3500); 
					 WebElement cardiocard = driver.findElement(cardio);
					 cardiocard.click();
					 
					 Thread.sleep(3500); 
					 WebElement gutcard = driver.findElement(gut);
					 gutcard.click();
					 
					 Thread.sleep(3500); 
					 WebElement braincard = driver.findElement(brain);
					 braincard.click();
					
					 Thread.sleep(3500); 
					 WebElement adrenalcard = driver.findElement(adrenal);
					 adrenalcard.click();
			
					 Thread.sleep(3500); 
					 WebElement Detoxcard  = driver.findElement(Detox);
					 Detoxcard.click();
					 
					 
					 Thread.sleep(3500); 
					 WebElement lipidscard = driver.findElement(lipids);
					 lipidscard.click();
					 
					 	// Capture a screenshot and attach it to Allure
				        AllureUtils.captureScreenshot(driver, "Case67_Fueldashboard9");
					 
					 
					} catch (StaleElementReferenceException e) {
						    
				}
			 
				        
				 }
			
			}
