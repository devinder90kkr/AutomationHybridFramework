package cuesz.membersummary.fuelreport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;

public class Case84_FuelRecommendationRecoveryProtocol extends BasePage{

	SeleniumUtils utils = new SeleniumUtils(driver);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(10));
	
	private By fuelicon = (By.id("MemberSummary-FuelReport"));
	
	private By inputField1	= (By.id("FuelReportProtocol-OptionFirst_1-Breakfast"));
	private By inputFeld1	= (By.xpath("(//div[@class='react-select__value-container react-select__value-container--is-multi css-1hwfws3'])[2]"));
	private By inputFeld2	= (By.id("FuelReportProtocol-OptionFirst_2-Breakfast"));
	private By inputFeld3	= (By.id("FuelReportProtocol-OptionFirst_1-Dinner"));
	private By inputFeld4	= (By.id("FuelReportProtocol-OptionFirst_2-Dinner"));
	private By hydTarget	= (By.xpath("//div[@class='field_block hyd_goal']"));
	private By inputFeld 	= (By.id("FuelReportProtocol-OptionFirst_1-Snack AM"));
	private By inputField2	= (By.id("FuelReportProtocol-OptionFirst_2-Snack AM"));
	private By inputField3 	= (By.id("FuelReportProtocol-OptionFirst_1-Lunch"));
	private By inputField4 	= (By.id("FuelReportProtocol-OptionFirst_2-Lunch"));
	private By inputField5 	= (By.id("FuelReportProtocol-OptionFirst_1-Snack PM"));
	private By inputField6 	= (By.id("FuelReportProtocol-OptionFirst_2-Snack PM"));
	private By glas4 		= (By.id("FuelReport-Protocol-Hydration-4"));
	private By glas8 		= (By.id("FuelReport-Protocol-Hydration-8"));
	private By glas6 		= (By.id("FuelReport-Protocol-Hydration-6"));
	private By elec1 		= (By.id("FuelReport-Protocol-Electrolyte-1"));
	private By elec2 		= (By.id("FuelReport-Protocol-Electrolyte-2"));
	private By elec3 		= (By.id("FuelReport-Protocol-Electrolyte-3"));
	private By Docnotes 	= (By.id("FuelReport-Protocol-EnterDoctorNotes"));
	private By Svbtn 		= (By.id("FuelReport-Protocol-HydrationGoal-Save"));
	private By Breakfast 	= (By.xpath("(//label[contains(text(),'Option 1')])[1]"));
	private By click1 		= (By.xpath("(//label[contains(text(),'Option 3')])[1]"));
	private By click2 		= (By.xpath("(//label[contains(text(),'Option 3')])[3]"));
	private By click3 		= (By.xpath("(//label[contains(text(),'Option 3')])[5]"));
//	private By scrol2 		= (By.id("FuelReportProtocol-OptionSecond_3-Dinner"));
//	private By scrol3 		= (By.id("FuelReportProtocol-OptionFirst_3-Lunch"));
	public Case84_FuelRecommendationRecoveryProtocol(WebDriver driver) {
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
				
				 Thread.sleep(11000);	

			/***********************************************Fuel Recommendation*********************************************************************/
				// Scroll to the element
				 WebElement Fuelreco = driver.findElement(By.xpath("(//div[@class='card_box row'])[1]"));
				 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Fuelreco);
				 Thread.sleep(8000);
				 
				 // Find the element with the id `FuelReport-Switch-MemberVisibility`
				 WebElement membvis = driver.findElement(By.id("FuelReport-Switch-MemberVisibility"));

				 // Click the element twice and wait for a different amount of time after each click
				 for (int a = 0; a < 2; a++) {

				 // Click the element
				   membvis.click();

				 // Wait for 4 seconds if it is the first click, or 3 seconds if it is the second click
				   if (a == 0) {
				     Thread.sleep(4000);
				   } else {
				     Thread.sleep(3000);
				   }
				 }
//				 // Find the button with the id `FuelReport-FuelRecommendations-Calories-Increment`
//				 WebElement incrementButton = driver.findElement(By.id("FuelReport-FuelRecommendations-Calories-Increment"));
//
//				 // Click the button twice
//				 for (int i = 0; i < 2; i++) {
//				   incrementButton.click();
//				 }
//
//				 // Hold the button for 8 seconds
//				 Actions actions = new Actions(driver);
//				 actions.clickAndHold(incrementButton).perform();
//				 Thread.sleep(8000);
//				 actions.release().perform();

				 // Find the button with the id `FuelReport-FuelRecommendations-Carbs-Increment`
				 WebElement carbIncrementButton = driver.findElement(By.id("FuelReport-FuelRecommendations-Carbs-Increment"));
				 Thread.sleep(8000);

				 // Click the button twice
				 for (int j = 0; j < 2; j++) {
				   carbIncrementButton.click();
				 }

				// Capture a screenshot and attach it to Allure
			        AllureUtils.captureScreenshot(driver, "Case84_FuelRecommendationRecoveryProtocol1");
				 
				 // Hold the button for 5 seconds
				 Actions action1 = new Actions(driver);
				 action1.clickAndHold(carbIncrementButton).perform();
				 Thread.sleep(5000);
				 action1.release().perform();

				 // Find the button with the id `FuelReport-FuelRecommendations-Protein-Increment`
				 WebElement proteinIncrementButton = driver.findElement(By.id("FuelReport-FuelRecommendations-Protein-Increment"));
				 Thread.sleep(8000);

				 // Click the button twice
				 for (int k = 0; k < 2; k++) {
				   proteinIncrementButton.click();
				 }

				 
				// Capture a screenshot and attach it to Allure
			        AllureUtils.captureScreenshot(driver, "Case84_FuelRecommendationRecoveryProtocol2");
				 // Hold the button for 3 seconds
				 Actions action2 = new Actions(driver);
				 action2.clickAndHold(proteinIncrementButton).perform();
				 Thread.sleep(3000);
				 action2.release().perform();

				 // Find the button with the id `FuelReport-FuelRecommendations-Fat-Increment`
				 WebElement fatIncrementButton = driver.findElement(By.id("FuelReport-FuelRecommendations-Fat-Increment"));
				 Thread.sleep(8000);

				 // Click the button twice
				 for (int l = 0; l < 2; l++) {
				   fatIncrementButton.click();
				 }

				 
				// Capture a screenshot and attach it to Allure
			        AllureUtils.captureScreenshot(driver, "Case84_FuelRecommendationRecoveryProtocol3");
				 // Hold the button for 3 seconds
				 Actions action3 = new Actions(driver);
				 action3.clickAndHold(fatIncrementButton).perform();
				 Thread.sleep(3000);
				 action3.release().perform();
				 
				 Thread.sleep(3000);
				 
				 WebElement Defcal = driver.findElement(By.id("Recovery Days"));
					 // Click the element
						 Defcal.click();
						 Thread.sleep(3500);
						 Defcal.click();
						 Thread.sleep(3500);
				/*********************************Input values for option 1 primary  breakfast field**********************************************************/
						 WebElement Brkfst = driver.findElement(Breakfast);
				            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Brkfst);
						 
						 try {
					            // Locate the input field
					            WebElement inputField = driver.findElement(inputField1);
					            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", inputField);
					            inputField.click();

					            //Enter the value "mushrooms"
					            Actions actions = new Actions(driver);
					            actions.sendKeys(inputField, "mushrooms");
					            Thread.sleep(3500);
					            actions.perform();
					            Thread.sleep(6000);

					            // Find the element
					            WebElement elem1 = driver.findElement(By.xpath("//*[@id='FuelReportProtocol-OptionFirst_1-Breakfast']/div[2]/div/div"));
					            // Click on the element
					            elem1.click();
				       
					            WebElement outclick = driver.findElement(click1);
					            outclick.click();
					            
					         // Capture a screenshot and attach it to Allure
						        AllureUtils.captureScreenshot(driver, "Case84_FuelRecommendationRecoveryProtocol4");
					            
						   } catch (Exception e) {
							    e.printStackTrace();
							} finally {
							    // Your finally block code here (optional)
							}
					
						   Thread.sleep(3500);
				   /***********************************************Input values for option 1 Secondary breakfast field*****************************************/
//						   
//						   try {
//					            // Locate the input field
//					            WebElement inputField = driver.findElement(inputFeld1);
//					            inputField.click();
//					          //Enter the value "Pizza"
//					            Actions actions = new Actions(driver);
//					            actions.sendKeys(inputField, "Pizza");
//					            Thread.sleep(3500);
//					            actions.perform();
//					            Thread.sleep(6000);
//					            WebElement elem1 = driver.findElement(By.xpath("//*[@id=\"FuelReportProtocol-OptionSecond_1-Breakfast\"]/div[2]/div/div"));
//					            // Click on the element
//					            elem1.click();
//					            Thread.sleep(2500);
//					            
//					            WebElement outclick = driver.findElement(click);
//					            outclick.click();
//					            
//						   } catch (Exception e) {
//							    e.printStackTrace();
//							} finally {
//							    // Your finally block code here (optional)
//							}
//					 
//						   Thread.sleep(3500);
				   /******************************Input values for option 2 primary breakfast field*****************************************/
						   
						   try {
					            // Locate the input field
					            WebElement inputField = driver.findElement(inputFeld2);
					            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", inputField);
					            inputField.click();
					            // Enter values into the input field
					            Actions actions = new Actions(driver);
					            actions.sendKeys(inputField, "Walnuts");
					            Thread.sleep(3500);
					            actions.perform();
					            Thread.sleep(6000);
					            WebElement elem1 = driver.findElement(By.xpath("//*[@id=\"FuelReportProtocol-OptionFirst_2-Breakfast\"]/div[2]/div/div"));
					            // Click on the element
					            elem1.click();
					            Thread.sleep(2500);
					            
					            WebElement outclick = driver.findElement(click1);
					            outclick.click();
					            
					         // Capture a screenshot and attach it to Allure
						        AllureUtils.captureScreenshot(driver, "Case84_FuelRecommendationRecoveryProtocol5");
			          	    
						   } catch (Exception e) {
							    e.printStackTrace();
							} finally {
							    // Your finally block code here (optional)
							}
						   Thread.sleep(3500);
						   
						   AllureUtils.captureScreenshot(driver, "breakfastend");
						   
				 /******************************Input values for option 1 primary  Early Snacks field*****************************************/
						   
						   try {
					            // Locate the input field
					            WebElement inputField = driver.findElement(inputFeld);
					            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", inputField);
					            inputField.click();
					            // Enter values into the input field
					            Actions actions = new Actions(driver);
					            actions.sendKeys(inputField, "Gluten Free Bread");
					            Thread.sleep(3500);
					            actions.perform();
					            Thread.sleep(6000);
					            // Click on the element
					            WebElement elem1 = driver.findElement(By.xpath("//*[@id=\"FuelReportProtocol-OptionFirst_1-Snack AM\"]/div[2]/div/div"));
					            // Click on the element
					            elem1.click();   
					            
					            WebElement outclick = driver.findElement(click1);
					            outclick.click();
					            
					         // Capture a screenshot and attach it to Allure
						        AllureUtils.captureScreenshot(driver, "Case84_FuelRecommendationRecoveryProtocol6");

						   } catch (Exception e) {
							    e.printStackTrace();
							} finally {
							    // Your finally block code here (optional)
							}   

			    /******************************Input values for option 2 EarlySnacks field**********************************************************/
						     Thread.sleep(3000);
						   try {
					            // Locate the input field
					            WebElement inputField = driver.findElement(inputField2);
					            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", inputField);
					            inputField.click();
					            // Enter values into the input field
					            Actions actions = new Actions(driver);
					            actions.sendKeys(inputField, "Boiled Egg");
					            Thread.sleep(3500);
					            actions.perform();
					            Thread.sleep(6000);
					            // Click on the element
					            WebElement elem1 = driver.findElement(By.xpath("//*[@id=\"FuelReportProtocol-OptionFirst_2-Snack AM\"]/div[2]/div/div"));
					            // Click on the element
					            elem1.click();
					            Thread.sleep(2500);
					            
					            WebElement outclick = driver.findElement(click1);
					            outclick.click();
					            
					         // Capture a screenshot and attach it to Allure
						        AllureUtils.captureScreenshot(driver, "Case84_FuelRecommendationRecoveryProtocol7");
			          	    
						   } catch (Exception e) {
							    e.printStackTrace();
							} finally {
							    // Your finally block code here (optional)
							}
						    Thread.sleep(3000);
						   
					 /******************************Input values for option 1 primary Lunch field*****************************************/
						    WebElement scroll = driver.findElement(inputField3);
						    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll);
//						    scroll.click();
						    Thread.sleep(3000);
						   try {
					            
					            // Locate the input field
					            WebElement inputField = driver.findElement(inputField3);
					            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", inputField);
					            inputField.click();
					            // Enter values into the input field
					            Actions actions = new Actions(driver);
					            actions.sendKeys(inputField, "Cauliflower");
					            Thread.sleep(3500);
					            actions.perform();
					            Thread.sleep(6000);
					            // Click on the element
					            WebElement elem1 = driver.findElement(By.xpath("//*[@id=\"FuelReportProtocol-OptionFirst_1-Lunch\"]/div[2]/div/div"));
					            // Click on the element
					            elem1.click();
					            Thread.sleep(2500);    
					            
					            WebElement outclick = driver.findElement(click2);
					            outclick.click();
					            
					         // Capture a screenshot and attach it to Allure
						        AllureUtils.captureScreenshot(driver, "Case84_FuelRecommendationRecoveryProtocol8");
					            
						   } catch (Exception e) {
							    e.printStackTrace();
							} finally {
							    // Your finally block code here (optional)
							}   

			    /******************************Input values for option 2 Lunch field**********************************************************/
						     Thread.sleep(3000);
						   try {
					            // Locate the input field
					            WebElement inputField = driver.findElement(inputField4);
					            inputField.click();
					            // Enter values into the input field
					            Actions actions = new Actions(driver);
					            actions.sendKeys(inputField, "Avocado");
					            Thread.sleep(3500);
					            actions.perform();
					            Thread.sleep(6000);	    
					            WebElement elem1 = driver.findElement(By.xpath("//*[@id=\"FuelReportProtocol-OptionFirst_2-Lunch\"]/div[2]/div/div"));
					            // Click on the element
					            elem1.click();
					            
					            WebElement outclick = driver.findElement(click2);
					            outclick.click();
			          	    
					         // Capture a screenshot and attach it to Allure
						        AllureUtils.captureScreenshot(driver, "Case84_FuelRecommendationRecoveryProtocol9");
					            
						   } catch (Exception e) {
							    e.printStackTrace();
							} finally {
							    // Your finally block code here (optional)
							}
						    Thread.sleep(3000);

				 /******************************Input values for option 1 primary LateSnacks field*****************************************/
						   
						   try {
					            // Locate the input field
					            WebElement inputField = driver.findElement(inputField5);
					            inputField.click();
					            // Enter values into the input field
					            Actions actions = new Actions(driver);
					            actions.sendKeys(inputField, "Swordfish");
					            Thread.sleep(3500);
					            actions.perform();
					            Thread.sleep(6000);
					            
					            WebElement elem1 = driver.findElement(By.xpath("//*[@id=\"FuelReportProtocol-OptionFirst_1-Snack PM\"]/div[2]/div/div"));
					            // Click on the element
					            elem1.click();
					         					            
					            Thread.sleep(1000);   	 
					            
					            WebElement outclick = driver.findElement(click2);
					            outclick.click();
					            
					         // Capture a screenshot and attach it to Allure
						        AllureUtils.captureScreenshot(driver, "Case84_FuelRecommendationRecoveryProtocol10");
					         
						   } catch (Exception e) {
							    e.printStackTrace();
							} finally {
							    // Your finally block code here (optional)
							}   

			    /******************************Input values for option 2 LateSnacks field**********************************************************/
						     Thread.sleep(3000);
						   try {
					            // Locate the input field
					            WebElement inputField = driver.findElement(inputField6);
					            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", inputField);
					            inputField.click();
					            // Enter values into the input field
					            Actions actions = new Actions(driver);
					            actions.sendKeys(inputField, "Peanuts");
					            Thread.sleep(3500);
					            actions.perform();
					            Thread.sleep(6000);
					            WebElement elem1 = driver.findElement(By.xpath("//*[@id=\"FuelReportProtocol-OptionFirst_2-Snack PM\"]/div[2]/div/div"));
					            // Click on the element
					            elem1.click();
					            
					            WebElement outclick = driver.findElement(click2);
					            outclick.click();
			          	    
					         // Capture a screenshot and attach it to Allure
						        AllureUtils.captureScreenshot(driver, "Case84_FuelRecommendationRecoveryProtocol11");
					            
						   } catch (Exception e) {
							    e.printStackTrace();
							} finally {
							    // Your finally block code here (optional)
							}
						    Thread.sleep(3000);

				/******************************Input values for option 1 primary Dinner field*****************************************/
						    WebElement scroll2 = driver.findElement(inputFeld3);
						    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scroll2);
//						    scroll2.click();
						    Thread.sleep(3000);
						   try {
							   
					            // Locate the input field
					            WebElement inputField = driver.findElement(inputFeld3);
					            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", inputField);
					            inputField.click();
					            // Enter values into the input field
					            Actions actions = new Actions(driver);
					            actions.sendKeys(inputField, "Cauliflower");
					            Thread.sleep(3500);
					            actions.perform();
					            Thread.sleep(6000);
					            WebElement elem1 = driver.findElement(By.xpath("//*[@id=\"FuelReportProtocol-OptionFirst_1-Dinner\"]/div[2]/div/div"));
					            // Click on the element
					            elem1.click();
					            
					            WebElement outclick = driver.findElement(click3);
					            outclick.click();
					            
					         // Capture a screenshot and attach it to Allure
						        AllureUtils.captureScreenshot(driver, "Case84_FuelRecommendationRecoveryProtocol12");

						   } catch (Exception e) {
							    e.printStackTrace();
							} finally {
							    // Your finally block code here (optional)
							}   

			    /******************************Input values for option 2 Dinner field**********************************************************/
						     Thread.sleep(3000);
						   try {
					            // Locate the input field
					            WebElement inputField = driver.findElement(inputFeld4);
					            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", inputField);
					            inputField.click();
					            // Enter values into the input field
					            Actions actions = new Actions(driver);
					            actions.sendKeys(inputField, "Avocado");
					            Thread.sleep(3500);
					            actions.perform();
					            Thread.sleep(6000);
					            WebElement elem1 = driver.findElement(By.xpath("//*[@id=\"FuelReportProtocol-OptionFirst_2-Dinner\"]/div[2]/div/div"));
					            // Click on the element
					            elem1.click();
					            
					            WebElement outclick = driver.findElement(click3);
					            outclick.click();
			          	    
					         // Capture a screenshot and attach it to Allure
						        AllureUtils.captureScreenshot(driver, "Case84_FuelRecommendationRecoveryProtocol13");
					            
						   } catch (Exception e) {
							    e.printStackTrace();
							} finally {
							    // Your finally block code here (optional)
							}
						    Thread.sleep(3000);	   
						   
						   AllureUtils.captureScreenshot(driver, "Dinnerend");
						   /******************************Input values Hydration Target**********************************************************/
						   /*Enter values for HydrationTarget*/
						    Thread.sleep(2000);
						    
						    // Scroll to the HydrationTarget element
						    WebElement HydrationTarget = driver.findElement(hydTarget);
						    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", HydrationTarget);
						    Thread.sleep(2000);
						    WebElement glass4 = driver.findElement(glas4);
						    glass4.click();
						    Thread.sleep(3000);
						    
						    WebElement glass8 = driver.findElement(glas8);
						    glass8.click();
						    Thread.sleep(3000);
						    
						    WebElement glass6 = driver.findElement(glas6);
						    glass6.click();
						    Thread.sleep(3000);
						    
						    WebElement Electr1 = driver.findElement(elec1);
						    Electr1.click();
						    Thread.sleep(3000);
						    
						    WebElement Electr3 = driver.findElement(elec3);
						    Electr3.click();
						    Thread.sleep(3000);
						    
						    WebElement Electr2 = driver.findElement(elec2);
						    Electr2.click();
						    Thread.sleep(3000);
						    
						    WebElement Docprotnotes = driver.findElement(Docnotes);
						    Docprotnotes.click();
						    Docprotnotes.sendKeys("Test Random Notes for Automation testing");
						    Thread.sleep(3000);
						    
						 // Capture a screenshot and attach it to Allure
					        AllureUtils.captureScreenshot(driver, "Case84_FuelRecommendationRecoveryProtocol14");
						    
						    
						    WebElement SaveButn = driver.findElement(Svbtn);
						    SaveButn.click();
						    Thread.sleep(4000);
		 }
}

