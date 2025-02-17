package cuesz.membersummary.userstats;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

        
        
			    
        Thread.sleep(2000);
    }
    
    }  