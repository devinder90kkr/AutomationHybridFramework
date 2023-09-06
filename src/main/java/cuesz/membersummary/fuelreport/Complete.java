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
import cuesz.utils.SeleniumUtils;
import org.openqa.selenium.StaleElementReferenceException;

public class Complete extends BasePage{
				
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
		
		private By KetoDiet = (By.id("FuelReport-FuelRecommendations-KetoDiet"));
		private By LowCarb = (By.id("FuelReport-FuelRecommendations-LowCarb"));
		private By values = (By.id("FuelReport-FuelRecommendations-40/30/30"));
		private By Fast186 = (By.id("FuelReport-FuelRecommendations-Fast18:6"));
		
		private By vegan = (By.id("FuelReport-Preferredfoods-Vegan"));
		private By MeatEater = (By.id("FuelReport-Preferredfoods-MeatEater"));
		private By Vegetarian = (By.id("FuelReport-Preferredfoods-Vegetarian"));
		private By Pescatarian = (By.id("FuelReport-Preferredfoods-Pescatarian"));
		
		
		private By Currentheading = (By.xpath("//h4[normalize-space()='Current Condition']"));
		private By inptfield1 = (By.id("FuelReport-CurrentCondition-01"));
		private By inptfield2 = (By.id("FuelReport-CurrentCondition-02"));
		private By inptfield3 = (By.id("FuelReport-CurrentCondition-03"));
		private By inptfield4 = (By.id("FuelReport-CurrentCondition-04"));
		private By CurrentConditionSavebttn = (By.id("FuelReport-CurrentCondition-Save"));
		
		
		private By medicationfield1 = (By.id("FuelReport-Medication-01"));
		private By medicationfield2 = (By.id("FuelReport-Medication-02"));
		private By medicationfield3 = (By.id("FuelReport-Medication-03"));
		private By medicationfield4 = (By.id("FuelReport-Medication-04"));
		private By medicationsavebttn = (By.id("FuelReport-Medication-Save"));
		
		// Input valid data into all four input fields
		private By Suplemnt1 = (By.id("FuelReport-SupplementRecommendations-01"));
		private By Suplemnt2 = (By.id("FuelReport-SupplementRecommendations-02"));
		private By Suplemnt3 = (By.id("FuelReport-SupplementRecommendations-03"));
		private By Suplemnt4 = (By.id("FuelReport-SupplementRecommendations-04"));
		private By supplementsave =(By.id("FuelReport-SupplementRecommendations-Save"));
		  
		private By DNAR1 = (By.id("FuelReport-DNARecommendations-01"));
		private By DNAR2 = (By.id("FuelReport-DNARecommendations-02"));
		private By DNAR3 = (By.id("FuelReport-DNARecommendations-03"));
		private By DNAR4 = (By.id("FuelReport-DNARecommendations-04"));
		private By dnasavebttn = (By.id("FuelReport-DNARecommendations-Save"));
		
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
		
		
		
		
		public Complete(WebDriver driver) {
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
				
				 Thread.sleep(1500); 
				 WebElement hormonescard  = driver.findElement(hormones);
				 hormonescard.click();
				 
				 Thread.sleep(1500); 
				 WebElement cardiocard = driver.findElement(cardio);
				 cardiocard.click();
				 
				 Thread.sleep(1500); 
				 WebElement gutcard = driver.findElement(gut);
				 gutcard.click();
				 
				 Thread.sleep(1500); 
				 WebElement braincard = driver.findElement(brain);
				 braincard.click();
				
				 Thread.sleep(1500); 
				 WebElement adrenalcard = driver.findElement(adrenal);
				 adrenalcard.click();
		
				 Thread.sleep(1500); 
				 WebElement Detoxcard  = driver.findElement(Detox);
				 Detoxcard.click();
				 
				 
				 Thread.sleep(1500); 
				 WebElement lipidscard = driver.findElement(lipids);
				 lipidscard.click();
				 
				} catch (StaleElementReferenceException e) {
					    
			}
				
	 
			 Thread.sleep(3500);
	   /************************Member Fuel Recommendations details********************************************************************/
			 try {
				 Thread.sleep(1500); 
			 WebElement KetoDietcard = driver.findElement(KetoDiet);
			 KetoDietcard.click();
			 
			 Thread.sleep(1500); 
			 WebElement LowCarbcard = driver.findElement(LowCarb);
			 LowCarbcard.click();
			 
			 Thread.sleep(1500); 
			 WebElement valuescard  = driver.findElement(values);
			 valuescard.click();
			 
			 Thread.sleep(1500); 
			 WebElement Fast186card = driver.findElement(Fast186);
			 Fast186card.click();
			 } catch (StaleElementReferenceException e) {
				    
				}
			
			 Thread.sleep(2500);
			   /************************Member Preferred foods details**************************************************************************/
		try {	 
			
			Thread.sleep(2500); 
			 WebElement vegancard = driver.findElement(vegan);
			 vegancard.click();
			 
			 Thread.sleep(1500); 
			 WebElement MeatEatercard = driver.findElement(MeatEater);
			 MeatEatercard.click();
			 
			 Thread.sleep(1500); 
			 WebElement Vegetariancard  = driver.findElement(Vegetarian);
			 Vegetariancard.click();
			 
			 Thread.sleep(1500); 
			 WebElement Pescatariancard = driver.findElement(Pescatarian);
			 Pescatariancard.click();	
			 
		} catch (StaleElementReferenceException e) {
		    
		}
			 
			 Thread.sleep(8500);
			 
			 /****************************Current Condition***************************************************************************************/
			 try {	
				 Thread.sleep(1500); 
			 // Find the heading element by its class name
			WebElement CurrentConditionheading = driver.findElement(Currentheading);
			// Scroll to the heading element
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth' });", CurrentConditionheading);

			// Get the text of the heading element
			String headingText = CurrentConditionheading.getText();
			
			// Verify if the heading text is "Current Condition"
			if (headingText.equals("Current Condition")) {
			System.out.println("Heading is 'Current Condition'.");
			} else {
			    System.out.println("Heading is not 'Current Condition'.");
			    }
			 
			 Thread.sleep(1500); 
			 // Find and clear the existing values in each input field
		//	WebElement inputField1 = driver.findElement(inptfield1);
			WebElement inputField1 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(inptfield1)));
			inputField1.clear();
			inputField1.sendKeys("Fuel Level: 75%");
			
			WebElement inputField2 = driver.findElement(inptfield2);
			inputField2.clear();
			inputField2.sendKeys("Tank Capacity: 50 gallons");
			
			WebElement inputField3 = driver.findElement(inptfield3);
			inputField3.clear();
			inputField3.sendKeys("Fuel Type: Diesel");
			
			WebElement inputField4 = driver.findElement(inptfield4);
			inputField4.clear();
			inputField4.sendKeys("Mileage: 20 miles per gallon");
			
			WebElement CurrentSavebttn = driver.findElement(CurrentConditionSavebttn);
			CurrentSavebttn.click();
			 } catch (StaleElementReferenceException e) {
				    
				}
					
			Thread.sleep(9500);
			
			/*******************************Medication fields************************************************************************************/
			 try {	 		 // Find the heading element by its class name
				 Thread.sleep(1500); 
			 // Input values into all four input fields
			//WebElement mediacationField1 = driver.findElement(medicationfield1);
			WebElement mediacationField1 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(medicationfield1)));
			// Scroll to the heading element
			//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth' });", mediacationField1);
			System.out.println("Is element displayed: " + mediacationField1.isDisplayed());
			System.out.println("Is element enabled: " + mediacationField1.isEnabled());
			Thread.sleep(2500);
			mediacationField1.clear();
			mediacationField1.sendKeys("Aspirin 100mg");
			
			WebElement mediacationField2 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(medicationfield2)));
			// Scroll to the heading element
						((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth' });", mediacationField2);
			mediacationField2.clear();
			mediacationField2.sendKeys("Ibuprofen 200mg");
			
			WebElement mediacationField3 = driver.findElement(medicationfield3);
			mediacationField3.clear();
			mediacationField3.sendKeys("Lisinopril 10mg");
			
			WebElement mediacationField4 = driver.findElement(medicationfield4);
			mediacationField4.clear();
			mediacationField4.sendKeys("Metformin 500mg");
			
			WebElement Medicationdsavebttn = driver.findElement(medicationsavebttn);
			Medicationdsavebttn.click();
			
			 } catch (StaleElementReferenceException e) {
				    
				}
				
			
			Thread.sleep(9500);
			
			/************************************************************************************/
		try {	  
			 Thread.sleep(1500); 
			 // Find the heading element by its text
			//WebElement SupplementRecommendationsheading = driver.findElement(By.xpath("//h4[text()='Supplement Recommendations']"));
			WebElement SupplementRecommendationsheading = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//h4[text()='Supplement Recommendations']"))));
			// Scroll to the heading element
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth' });", SupplementRecommendationsheading);
	
		
			// Verify if the heading text is "Supplement Recommendations"
			if (SupplementRecommendationsheading.getText().equals("Supplement Recommendations")) {
			System.out.println("Heading is 'Supplement Recommendations'.");
			} else {
			    System.out.println("Heading is not 'Supplement Recommendations'.");
			}
			 Thread.sleep(1500); 
			// Input valid data into all four input fields
			WebElement SupplementRecommendations1 = driver.findElement(Suplemnt1);
			// Scroll to the heading element
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth' });", SupplementRecommendations1);
			Thread.sleep(2500);
			SupplementRecommendations1.clear(); // Clear any existing text (optional)
			SupplementRecommendations1.sendKeys("Recommended daily dose: 1000 IU of Vitamin D");
			
			WebElement SupplementRecommendations2 = driver.findElement(Suplemnt2);
			SupplementRecommendations2.clear();
			SupplementRecommendations2.sendKeys("Take 1 capsule of Omega-3 fish oil daily");
			
			WebElement SupplementRecommendations3 = driver.findElement(Suplemnt3);
			SupplementRecommendations3.clear();
			SupplementRecommendations3.sendKeys("Consider adding a calcium supplement");
			
			WebElement SupplementRecommendations4 = driver.findElement(Suplemnt4);
			SupplementRecommendations4.clear();
			SupplementRecommendations4.sendKeys("Discuss magnesium supplement with your healthcare provider");
			    
			    WebElement Supplementsavebttn = driver.findElement(supplementsave);
			   Supplementsavebttn.click(); 		
			
		 } catch (StaleElementReferenceException e) {
			    
			}
			
			    Thread.sleep(8500);
			    
			/********************************************************************************************************************/	        
		try {	    
			
			 Thread.sleep(1500); 
			 // Verify the heading "DNA Recommendations"
			WebElement headingElement = driver.findElement(By.xpath("//h4[text()='DNA Recommendations']"));
			
			// Scroll to the heading element
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", headingElement);
			
			
			if (headingElement.getText().equals("DNA Recommendations")) {
			System.out.println("Heading is 'DNA Recommendations'.");
			} else {
			    System.out.println("Heading is not 'DNA Recommendations'.");
			}
			
			// Input valid data into all four input fields
			WebElement DNARecommendations1 = driver.findElement(DNAR1);
			DNARecommendations1.clear(); // Clear any existing text (optional)
			DNARecommendations1.sendKeys("Recommendation 1: Eat a balanced diet.");
			
			WebElement DNARecommendations2 = driver.findElement(DNAR2);
			DNARecommendations2.clear();
			DNARecommendations2.sendKeys("Recommendation 2: Exercise regularly.");
			
			WebElement DNARecommendations3 = driver.findElement(DNAR3);
			DNARecommendations3.clear();
			DNARecommendations3.sendKeys("Recommendation 3: Get enough sleep.");
			
			WebElement DNARecommendations4 = driver.findElement(DNAR4);
			DNARecommendations4.clear();
			DNARecommendations4.sendKeys("Recommendation 4: Manage stress effectively.");
			      
	        WebElement DnaSavebttn = driver.findElement(dnasavebttn);
	        DnaSavebttn.click();	
	        
		 } catch (StaleElementReferenceException e) {
			    
			}

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
	        
	 } catch (StaleElementReferenceException e) {
		    
		}
		
	        Thread.sleep(9500);
					        
			/****************************************************************************************************/
			 // Find the <CardiotextArea> element by its ID
			WebElement CardiotextAreaElement = driver.findElement(CardiotextArea);
			 Thread.sleep(1500); 
			// Scroll to the heading element
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth' });", CardiotextAreaElement);
	
			// Clear any existing text in the <textarea> field (optional)
			CardiotextAreaElement.clear();
			// Input your desired text into the <textarea> field
			CardiotextAreaElement.sendKeys("Cardiovascular Guidelines: Maintain a heart-healthy diet rich in fruits, vegetables, and whole grains. Engage in regular aerobic exercise for at least 30 minutes a day. Monitor blood pressure and cholesterol levels. Take prescribed medications as directed by your healthcare provider. Schedule regular check-ups for cardiovascular health.");
				
			WebElement cardiosave = driver.findElement(cardiosavebtton);
			cardiosave.click();
			
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
					
					 Thread.sleep(1500); 
					 WebElement hormonescard  = driver.findElement(hormones);
					 hormonescard.click();
					 
					 Thread.sleep(1500); 
					 WebElement cardiocard = driver.findElement(cardio);
					 cardiocard.click();
					 
					 Thread.sleep(1500); 
					 WebElement gutcard = driver.findElement(gut);
					 gutcard.click();
					 
					 Thread.sleep(1500); 
					 WebElement braincard = driver.findElement(brain);
					 braincard.click();
					
					 Thread.sleep(1500); 
					 WebElement adrenalcard = driver.findElement(adrenal);
					 adrenalcard.click();
			
					 Thread.sleep(1500); 
					 WebElement Detoxcard  = driver.findElement(Detox);
					 Detoxcard.click();
					 
					 
					 Thread.sleep(1500); 
					 WebElement lipidscard = driver.findElement(lipids);
					 lipidscard.click();
					 
					} catch (StaleElementReferenceException e) {
						    
				}
			 
				        
				 }
			
			}
