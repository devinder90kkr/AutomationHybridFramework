package cuesz.membersummary.fuelreport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.AllureUtils;
import cuesz.utils.SeleniumUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;

public class Case68_Fueldashboardconditionnput extends BasePage{
				
		SeleniumUtils utils = new SeleniumUtils(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(10));
		
		private By fuelicon = (By.id("MemberSummary-FuelReport"));
		
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
		
        	
		public Case68_Fueldashboardconditionnput(WebDriver driver) {
			super(driver);
		}
			
		 @Test
		    public void fuelreport()throws InterruptedException {
		
			        utils.clickMembersummary();
			        utils.waitForMilliseconds(2000);
			        utils.enterSearchText();
				    utils.clickMembername();
			
				 WebElement Fuelreporticon = driver.findElement(fuelicon);
				 Fuelreporticon.click();
				 
				 Thread.sleep(3000);
				 try {
					 WebElement KetoDietcard = driver.findElement(KetoDiet);
					 KetoDietcard.click();
					 
					 WebElement LowCarbcard = driver.findElement(LowCarb);
					 LowCarbcard.click();
					 
					 WebElement valuescard  = driver.findElement(values);
					 valuescard.click();
					 
					 WebElement Fast186card = driver.findElement(Fast186);
					 Fast186card.click();
					 
					 
						// Capture a screenshot and attach it to Allure
				        AllureUtils.captureScreenshot(driver, "Case68_Fueldashboardconditionnput1");
					 
					 } catch (StaleElementReferenceException e) {
						    
						}
					
					 Thread.sleep(3500);
					   /************************Member Preferred foods details**************************************************************************/
				try {	 
					 WebElement vegancard = driver.findElement(vegan);
					 vegancard.click();
					 
					 WebElement MeatEatercard = driver.findElement(MeatEater);
					 MeatEatercard.click();
					 
					 WebElement Vegetariancard  = driver.findElement(Vegetarian);
					 Vegetariancard.click();
					 
					 WebElement Pescatariancard = driver.findElement(Pescatarian);
					 Pescatariancard.click();	
					 
						// Capture a screenshot and attach it to Allure
				        AllureUtils.captureScreenshot(driver, "Case68_Fueldashboardconditionnput2");
					 
					 
				} catch (StaleElementReferenceException e) {
				    
				}
					 
					 Thread.sleep(5500);
						        
		 /****************************Current Condition***************************************************************************************/
				 try {	
					 Thread.sleep(2500);
				 // Find the heading element by its class name
				WebElement CurrentConditionheading = driver.findElement(Currentheading);
				// Scroll to the heading element
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth' });", CurrentConditionheading);
				 Thread.sleep(2500);
				// Get the text of the heading element
				String headingText = CurrentConditionheading.getText();
				
				// Verify if the heading text is "Current Condition"
				if (headingText.equals("Current Condition")) {
				System.out.println("Heading is 'Current Condition'.");
				} else {
				    System.out.println("Heading is not 'Current Condition'.");
				    }
				 Thread.sleep(2500);
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
				
				// Capture a screenshot and attach it to Allure
		        AllureUtils.captureScreenshot(driver, "Case68_Fueldashboardconditionnput3");
				
				 } catch (StaleElementReferenceException e) {
					    
					}
						
				Thread.sleep(5500);
			
			/*******************************Medication fields************************************************************************************/
				 try {	 		 // Find the heading element by its class name
					 Thread.sleep(2500);
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
					 Thread.sleep(2500);
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
					
					// Capture a screenshot and attach it to Allure
			        AllureUtils.captureScreenshot(driver, "Case68_Fueldashboardconditionnput4");
					
				
				 } catch (StaleElementReferenceException e) {
					    
					}
					
				
				Thread.sleep(5500);
			
			/************************************************************************************/
		try {	   
			 Thread.sleep(2500);
			 // Find the heading element by its text
			//WebElement SupplementRecommendationsheading = driver.findElement(By.xpath("//h4[text()='Supplement Recommendations']"));
			WebElement SupplementRecommendationsheading = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//h4[text()='Supplement Recommendations']"))));
			// Scroll to the heading element
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth' });", SupplementRecommendationsheading);
			Thread.sleep(3500);	
			// Verify if the heading text is "Supplement Recommendations"
			if (SupplementRecommendationsheading.getText().equals("Supplement Recommendations")) {
			System.out.println("Heading is 'Supplement Recommendations'.");
			} else {
			    System.out.println("Heading is not 'Supplement Recommendations'.");
			}
			
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
			   
			// Capture a screenshot and attach it to Allure
		        AllureUtils.captureScreenshot(driver, "Case68_Fueldashboardconditionnput5");
			   
			
		 } catch (StaleElementReferenceException e) {
			    
			}
			
			    Thread.sleep(2500);
			    
			/********************************************************************************************************************/	        
		try {	    
			 // Verify the heading "DNA Recommendations"
			WebElement headingElement = driver.findElement(By.xpath("//h4[text()='DNA Recommendations']"));
			Thread.sleep(3500);	
			// Scroll to the heading element
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", headingElement);
			
			Thread.sleep(3500);	
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
	        
	        
	     // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "Case68_Fueldashboardconditionnput6");
	        
		 } catch (StaleElementReferenceException e) {
			    
			}
			    
	        Thread.sleep(2500);
			 
			       
			/********************************************************************************************************************/	         

	        

				        
				 }
			
			}
