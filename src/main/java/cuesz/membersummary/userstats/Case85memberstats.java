package cuesz.membersummary.userstats;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.pages.BasePage;
import cuesz.schdule.Case01_createvent;
import cuesz.utils.SeleniumUtils;
import cuesz.web.resources.weblocators;

public class Case85memberstats extends BasePage {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Case01_createvent.class);
	
	SeleniumUtils utils = new SeleniumUtils(driver);
	

	public Case85memberstats(WebDriver driver) {
		super(driver);

	}

    @Test
    public void memberstats() throws InterruptedException {
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		
	 	/**********************Click on Schedule master*********************************/	
    	
    	utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();
        // Log message to console and Allure report
        LOGGER.info("Click on member name");
        AllureUtils.logStep("Click on member name");
      
        // Click on memberstats icon
		WebElement memberstats = wait.until(ExpectedConditions.elementToBeClickable(weblocators.memberstats));
		memberstats.click();
        // Log message to console and Allure report
        LOGGER.info("Click on memberstats");
        AllureUtils.logStep("Click on memberstats");
        
        // Click on the first card
        WebElement card1Element = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.bodyscancard));
        Thread.sleep(2000);
        // Fetch the heading (first h5)
        String headingText = card1Element.findElement(weblocators.cardheadingText1).getText();
        // Fetch the date (second h5, after the heading)
        String dateText = card1Element.findElement(weblocators.carddateText1).getText();
        // Log extracted values
        LOGGER.info("Heading: " + headingText);
        LOGGER.info("Date: " + dateText);
        AllureUtils.logStep("Extracted Heading: " + headingText);
        AllureUtils.logStep("Extracted Date: " + dateText);
      

        
													        // Wait for the card containing "Last VO2 Scan"
													        WebElement vo2Card = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.vo2Card));
													        // Extract Heading
													        String headingText1 = vo2Card.findElement(weblocators.cardheadingText2).getText();
													        // Extract Date (second h5 element)
													        String dateText1 = vo2Card.findElement(weblocators.carddateText2).getText();
													        // Log extracted values
													        LOGGER.info("VO2 Scan Heading: " + headingText1);
													        LOGGER.info("VO2 Scan Date: " + dateText1);
													        AllureUtils.logStep("Extracted VO2 Scan Heading: " + headingText1);
													        AllureUtils.logStep("Extracted VO2 Scan Date: " + dateText1);
													        // Capture a screenshot and attach it to Allure
													        AllureUtils.captureScreenshot(driver, "vo2Card");

        
        // Wait for the card containing "Last Resonant Scan"
        WebElement resonantCard = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.resonantcard));
        // Extract Heading
        String headingText2 = resonantCard.findElement(weblocators.resonantheading).getText();

        // Extract Date (second h5 element)
        String dateText2 = resonantCard.findElement(weblocators.resonantdatetext).getText();
        // Log extracted values
        LOGGER.info("Resonant Scan Heading: " + headingText2);
        LOGGER.info("Resonant Scan Date: " + dateText2);

        AllureUtils.logStep("Extracted Resonant Scan Heading: " + headingText2);
        AllureUtils.logStep("Extracted Resonant Scan Date: " + dateText2);
        
        //Wait for the card containing "MEMBERS_SPHERES_HEADING"
        WebElement heading = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.MEMBERS_SPHERES_HEADING));
        // Verify the heading is displayed
        Assert.assertTrue(heading.isDisplayed(), "Members Spheres heading is not displayed");
        // Verify the text content
        String actualText = heading.getText().trim();
        String expectedText = "Members Spheres";
        Assert.assertEquals(actualText, expectedText, "Heading text mismatch!");
        LOGGER.info("Verified Members Spheres heading successfully.");
        AllureUtils.logStep("Verified Members Spheres heading successfully.");
        
        
        // Define the items to select from the dropdown
        String[] options = {"This Week", "Last Week"};

        // Find the dropdown element outside the loop, so it stays focused
        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.dropdownmemberstats));

        // Loop through the options
        for (String option : options) {
            // Initialize the Actions class
            Actions builder = new Actions(driver);
            
            // Open the dropdown and send the option text
            builder.moveToElement(dropdown).click().sendKeys(option).perform();
            
            // Wait for a short time to ensure the dropdown updates
            Thread.sleep(2000);
            
            // Navigate down and select the option
            builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
            
            // Wait before the loop repeats
            Thread.sleep(3000);
        }

        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "heading");
        
        // Scroll to the element before waiting
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", driver.findElement(weblocators.caloriesheading));

        
          	//Wait for the card containing "MEMBERS_SPHERES_HEADING"
            WebElement caloriesheading = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.caloriesheading));
            // Verify the heading is displayed
            Assert.assertTrue(caloriesheading.isDisplayed(), "Calories heading is not displayed");
            // Verify the text content
            String actualText1 = caloriesheading.getText().trim();
            String expectedText1 = "Calories";
            Assert.assertEquals(actualText1, expectedText1, "Heading text mismatch!");
            LOGGER.info("Verified Calories heading successfully.");
            AllureUtils.logStep("Verified Calories heading successfully.");
            
            // Define the items to select from the dropdown, including "Select Week"
            //      String[] options = {"This Week", "Last Week", "Select Week"};
          String[] options2 = {"This Week", "Last Week"};
          // Find the dropdown element outside the loop, so it stays focused
          WebElement dropdown2 = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.caloriesdropdownmemberstats));

          // Loop through the options
          for (String option1 : options2) {
              // Initialize the Actions class
              Actions builder1 = new Actions(driver);
              
              // Open the dropdown and send the option text
              builder1.moveToElement(dropdown2).click().sendKeys(option1).perform();
              
              // Wait for a short time to ensure the dropdown updates
              Thread.sleep(2000);
              
              // Navigate down and select the option
              builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
              
              // Wait for the next step before repeating the loop
              Thread.sleep(3000);
          }
          
          // Capture a screenshot and attach it to Allure
          AllureUtils.captureScreenshot(driver, "caloriesheading");
													          
		  													// Scroll to the element before waiting
													          JavascriptExecutor js1 = (JavascriptExecutor) driver;
													          js1.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", driver.findElement(weblocators.nutritionalheading));
												
												          
												            	//Wait for the card containing "MEMBERS_SPHERES_HEADING"
												              WebElement Nutritionalheading = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.nutritionalheading));
												              // Verify the heading is displayed
												              Assert.assertTrue(Nutritionalheading.isDisplayed(), "Nutritional heading is not displayed");
												              // Verify the text content
												              String NutritionalactualText = Nutritionalheading.getText().trim();
												              String NutritionalexpectedText = "Nutritional Information";
												              Assert.assertEquals(NutritionalactualText, NutritionalexpectedText, "Heading text mismatch!");
												              LOGGER.info("Verified Nutritional Information heading successfully.");
												              AllureUtils.logStep("Verified Nutritional Information heading successfully.");
												              
												              // Define the items to select from the dropdown, including "Select Week"
												              //      String[] options = {"This Week", "Last Week", "Select Week"};
												            String[] options3 = {"This Week", "Last Week"};
												            // Find the dropdown element outside the loop, so it stays focused
												            WebElement dropdown3 = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.nutrinonaldropdown));
												
												            // Loop through the options
												            for (String option4 : options3) {
												                // Initialize the Actions class
												                Actions builder1 = new Actions(driver);
												                
												                // Open the dropdown and send the option text
												                builder1.moveToElement(dropdown3).click().sendKeys(option4).perform();
												                
												                // Wait for a short time to ensure the dropdown updates
												                Thread.sleep(2000);
												                
												                // Navigate down and select the option
												                builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
												                
												                // Wait for the next step before repeating the loop
												                Thread.sleep(3000);
												            }
				          
												         // List of weekdays to scroll and click
												            By[] weekdays = {weblocators.fridayweek, weblocators.mondayweek};
				
												            for (By weekday : weekdays) {
												                try {
												                    // Scroll to the element
												                    WebElement element = driver.findElement(weekday);
												                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", element);
				
												                    // Wait for visibility and click
												                    WebElement visibleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(weekday));
												                    visibleElement.click();
				
												                    // Logging success
												                    String day = visibleElement.getText().trim();
												                    LOGGER.info("Clicked on weekday: " + day);
												                    AllureUtils.logStep("Clicked on weekday: " + day);
												                    
												                } catch (Exception e) {
												                    // Logging failure
												                    LOGGER.error("Failed to click on weekday: " + weekday, e);
												                    AllureUtils.logStep("Failed to click on weekday: " + weekday);
												                    throw e; // Re-throw the exception to fail the test if necessary
												                }
												            }
												            
												            // Capture a screenshot and attach it to Allure
												            AllureUtils.captureScreenshot(driver, "Nutritionalheading");
								            
			          
			             //Wait for the card containing "MEMBERS_SPHERES_HEADING"
			              WebElement performheading = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.performheading));
			             // Scroll to the "Staff Notes" element using JavaScriptExecutor
						  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);;", performheading);
			              
			              // Verify the heading is displayed
			              Assert.assertTrue(performheading.isDisplayed(), "Perform heading is not displayed");
			              // Verify the text content
			              String performactualText = performheading.getText().trim();
			              String performexpectedText = "Perform Activities";
			              Assert.assertEquals(performactualText, performexpectedText, "Heading text mismatch!");
			              LOGGER.info("Verified Perform Activities heading successfully.");
			              AllureUtils.logStep("Verified Perform Activities heading successfully.");
			              
			              // Define the items to select from the dropdown, including "Select Week"
			              //      String[] options = {"This Week", "Last Week", "Select Week"};
			            String[] options4 = {"This Week", "Last Week"};
			            // Find the dropdown element outside the loop, so it stays focused
			            WebElement dropdown4 = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.performdropwdown));
			
			            // Loop through the options
			            for (String option4 : options4) {
			                // Initialize the Actions class
			                Actions builder1 = new Actions(driver);
			                
			                // Open the dropdown and send the option text
			                builder1.moveToElement(dropdown4).click().sendKeys(option4).perform();
			                
			                // Wait for a short time to ensure the dropdown updates
			                Thread.sleep(2000);
			                
			                // Navigate down and select the option
			                builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			                
			                // Wait for the next step before repeating the loop
			                Thread.sleep(3000);
			            }
			            // Capture a screenshot and attach it to Allure
			            AllureUtils.captureScreenshot(driver, "performheading");
								            
															            //Wait for the card containing "MEMBERS_SPHERES_HEADING"
															              WebElement missedActivitiesheading = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.topmissedactivity));
															             // Scroll to the "Staff Notes" element using JavaScriptExecutor
																		  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);;", missedActivitiesheading);
															              
															              // Verify the heading is displayed
															              Assert.assertTrue(missedActivitiesheading.isDisplayed(), "Missed Activities heading is not displayed");
															              // Verify the text content
															              String missedActivitieactualText = missedActivitiesheading.getText().trim();
															              String missedactivityexpectedText = "Top Missed Activities";
															              Assert.assertEquals(missedActivitieactualText, missedactivityexpectedText, "Heading text mismatch!");
															              LOGGER.info("Verified Top Missed Activities heading successfully.");
															              AllureUtils.logStep("Verified Top Missed Activities heading successfully.");
															              
															              // Define the items to select from the dropdown, including "Select Week"
															              //      String[] options = {"This Week", "Last Week", "Select Week"};
															            String[] options5 = {"This Week"};
															            // Find the dropdown element outside the loop, so it stays focused
															            WebElement dropdown5 = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.missedactivitydropdown));
															
															            // Loop through the options
															            for (String option4 : options5) {
															                // Initialize the Actions class
															                Actions builder1 = new Actions(driver);
															                
															                // Open the dropdown and send the option text
															                builder1.moveToElement(dropdown5).click().sendKeys(option4).perform();
															                
															                // Wait for a short time to ensure the dropdown updates
															                Thread.sleep(2000);
															                
															                // Navigate down and select the option
															                builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
															                
															                // Wait for the next step before repeating the loop
															                Thread.sleep(3000);
															            }
								            
															            // Capture a screenshot and attach it to Allure
															            AllureUtils.captureScreenshot(driver, "missedActivitiesheading");
								            
			            //Wait for the card containing "MEMBERS_SPHERES_HEADING"
			              WebElement activitiesafterLPheading = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.performacitiydayLP));
			             // Scroll to the "Staff Notes" element using JavaScriptExecutor
						  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);;", missedActivitiesheading);
			              
			              // Verify the heading is displayed
			              Assert.assertTrue(activitiesafterLPheading.isDisplayed(), "Activities Day After LP heading is not displayed");
			              // Verify the text content
			              String activitiesafterLPactualText = activitiesafterLPheading.getText().trim();
			              String activitiesafterLPexpectedText = "Perform Activities Day After LP";
			              Assert.assertEquals(activitiesafterLPactualText, activitiesafterLPexpectedText, "Heading text mismatch!");
			              LOGGER.info("Verified Perform Activities Day After LP heading successfully.");
			              AllureUtils.logStep("Verified Perform Activities Day After LP heading successfully.");
			              
			              
			              
			              																	 //Wait for the card containing "Timeline"
																				              WebElement timelineheading = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.timelineheading));
																				             // Scroll to the "Staff Notes" element using JavaScriptExecutor
																							  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);;", missedActivitiesheading);
																				              
																				              // Verify the heading is displayed
																				              Assert.assertTrue(timelineheading.isDisplayed(), "Timeline heading is not displayed");
																				              // Verify the text content
																				              String timelineactualText = timelineheading.getText().trim();
																				              String timelineexpectedText = "Timeline";
																				              Assert.assertEquals(timelineactualText, timelineexpectedText, "Heading text mismatch!");
																				              LOGGER.info("Verified Timeline heading successfully.");
																				              AllureUtils.logStep("Verified Timeline heading successfully.");
																				              
																				              // Define the items to select from the dropdown, including "Select Week"
																				              //      String[] options = {"This Week", "Last Week", "Select Week"};
																				            String[] options6 = {"This Week", "Last Week"};
																				            // Find the dropdown element outside the loop, so it stays focused
																				            WebElement dropdown6 = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.timelinedropdown));
																				
																				            // Loop through the options
																				            for (String option4 : options6) {
																				                // Initialize the Actions class
																				                Actions builder1 = new Actions(driver);
																				                
																				                // Open the dropdown and send the option text
																				                builder1.moveToElement(dropdown6).click().sendKeys(option4).perform();
																				                
																				                // Wait for a short time to ensure the dropdown updates
																				                Thread.sleep(2000);
																				                
																				                // Navigate down and select the option
																				                builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
																				                
																				                // Wait for the next step before repeating the loop
																				                Thread.sleep(3000);
																				            }
																				            
																				            // Capture a screenshot and attach it to Allure
																				            AllureUtils.captureScreenshot(driver, "timelineheading");
			          //Wait for the card containing "Timeline"
			          WebElement tonnageheading = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.tonnageheading));
			          // Scroll to the "Staff Notes" element using JavaScriptExecutor
					  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);;", tonnageheading);
		              
		              // Verify the heading is displayed
		              Assert.assertTrue(tonnageheading.isDisplayed(), "Tonnage heading is not displayed");
		              // Verify the text content
		              String tonnageactualText = tonnageheading.getText().trim();
		              String tonnageexpectedText = "Tonnage";
		              Assert.assertEquals(tonnageactualText, tonnageexpectedText, "Heading text mismatch!");
		              LOGGER.info("Verified Tonnage heading successfully.");
		              AllureUtils.logStep("Verified Tonnage heading successfully.");

		              // Define the items to select from the dropdown, including "Select Week"
		              //      String[] options = {"This Week", "Last Week", "Select Week"};
		              String[] options7 = {"This Week", "Last Week"};
			          // Find the dropdown element outside the loop, so it stays focused
			          WebElement dropdown7 = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.tonnagedropdown));
		
		              // Loop through the options
		              for (String option4 : options7) {
		                // Initialize the Actions class
		                Actions builder1 = new Actions(driver);
		                
		                // Open the dropdown and send the option text
		                builder1.moveToElement(dropdown7).click().sendKeys(option4).perform();
		                
		                // Wait for a short time to ensure the dropdown updates
		                Thread.sleep(2000);
		                
		                // Navigate down and select the option
		                builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		                
		                // Wait for the next step before repeating the loop
		                Thread.sleep(3000);
		            }
		           // Capture a screenshot and attach it to Allure
			            AllureUtils.captureScreenshot(driver, "tonnageheading");
		              
		              
		              												  //Wait for the card containing "Timeline"
															          WebElement mostScreensheading = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.mostscreenheading));
															          // Scroll to the "Staff Notes" element using JavaScriptExecutor
																	  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);;", mostScreensheading);
														              
														              // Verify the heading is displayed
														              Assert.assertTrue(mostScreensheading.isDisplayed(), "Tonnage heading is not displayed");
														              // Verify the text content
														              String mostScreenactualText = mostScreensheading.getText().trim();
														              String mostScreenexpectedText = "Most Used Screens";
														              Assert.assertEquals(mostScreenactualText, mostScreenexpectedText, "Heading text mismatch!");
														              LOGGER.info("Verified Most Used Screens heading successfully.");
														              AllureUtils.logStep("Verified Most Used Screens heading successfully.");
														              
														              
														              // Define the items to select from the dropdown, including "Select Week"
														              //      String[] options = {"This Week", "Last Week", "Select Week"};
														              String[] options8 = {"This Week", "Last Week"};
															          // Find the dropdown element outside the loop, so it stays focused
															          WebElement dropdown8 = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.mostscreendropdown));
														
														              // Loop through the options
														              for (String option4 : options8) {
														                // Initialize the Actions class
														                Actions builder1 = new Actions(driver);
														                
														                // Open the dropdown and send the option text
														                builder1.moveToElement(dropdown8).click().sendKeys(option4).perform();
														                
														                // Wait for a short time to ensure the dropdown updates
														                Thread.sleep(2000);
														                
														                // Navigate down and select the option
														                builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
														                
														                // Wait for the next step before repeating the loop
														                Thread.sleep(3000);
														            }
														              
														              // Capture a screenshot and attach it to Allure
															            AllureUtils.captureScreenshot(driver, "mostScreensheading");
														              
														              
						//Wait for the card containing "Timeline"
						WebElement screentime = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.screentime));
						// Scroll to the "Staff Notes" element using JavaScriptExecutor
						((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);;", screentime);
						
						// Verify the heading is displayed
						Assert.assertTrue(screentime.isDisplayed(), "Tonnage heading is not displayed");
						// Verify the text content
						String screenactualText = screentime.getText().trim();
						String screenexpectedText = "Screen Time";
						Assert.assertEquals(screenactualText, screenexpectedText, "Heading text mismatch!");
						LOGGER.info("Verified Screen Time heading successfully.");
						AllureUtils.logStep("Verified Screen Time heading successfully.");
						
						
						// Define the items to select from the dropdown, including "Select Week"
						//      String[] options = {"This Week", "Last Week", "Select Week"};
						String[] options9 = {"This Week", "Last Week"};
						// Find the dropdown element outside the loop, so it stays focused
						WebElement dropdown9 = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.screendropdowntime));
		  
						// Loop through the options
						for (String option5 : options9) {
						  // Initialize the Actions class
						  Actions builder1 = new Actions(driver);
						  
						  // Open the dropdown and send the option text
						  builder1.moveToElement(dropdown9).click().sendKeys(option5).perform();
						  
						  // Wait for a short time to ensure the dropdown updates
						  Thread.sleep(2000);
						  
						  // Navigate down and select the option
						  builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
						  
						  // Wait for the next step before repeating the loop
						  Thread.sleep(3000);
					  }
						
						// Capture a screenshot and attach it to Allure
						  AllureUtils.captureScreenshot(driver, "screentime");								              
														              
																		//Wait for the card containing "Timeline"
																		WebElement Frequencyheading = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.frequencyheading));
																		// Scroll to the "Staff Notes" element using JavaScriptExecutor
																		//   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);;", Frequencyheading);
																		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center', inline: 'center'});", Frequencyheading);
																		// Verify the heading is displayed
																		Assert.assertTrue(Frequencyheading.isDisplayed(), "Frequency heading is not displayed");
																		// Verify the text content
																		String frequencyactualText = Frequencyheading.getText().trim();
																		String frequencyexpectedText = "Frequency Of Checking Future Activities";
																		Assert.assertEquals(frequencyactualText, frequencyexpectedText, "Heading text mismatch!");
																		LOGGER.info("Verified Frequency Of Checking Future Activities heading successfully.");
																		AllureUtils.logStep("Verified Frequency Of Checking Future Activities heading successfully.");
																		
																		
																		// Define the items to select from the dropdown, including "Select Week"
																		//      String[] options = {"This Week", "Last Week", "Select Week"};
																		String[] options10 = {"This Week", "Last Week"};
																		// Find the dropdown element outside the loop, so it stays focused
																		WebElement dropdown10 = wait.until(ExpectedConditions.visibilityOfElementLocated(weblocators.frequencydropdown));
															
																		// Loop through the options
																		for (String option6 : options10) {
																			// Initialize the Actions class
																			Actions builder1 = new Actions(driver);
																			
																			// Open the dropdown and send the option text
																			builder1.moveToElement(dropdown10).click().sendKeys(option6).perform();
																			
																			// Wait for a short time to ensure the dropdown updates
																			Thread.sleep(2000);
																			
																			// Navigate down and select the option
																			builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
																			
																			// Wait for the next step before repeating the loop
																			Thread.sleep(3000);
																		}
																												
																		// Capture a screenshot and attach it to Allure
																			AllureUtils.captureScreenshot(driver, "Frequencyheading");
            
            
        }

            
    }
    
    