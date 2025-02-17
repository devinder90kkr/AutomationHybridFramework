package cuesz.membersummary.userstats;

import java.time.Duration;
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
		// TODO Auto-generated constructor stub
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
            
            
            
        }

            
    }
    
    