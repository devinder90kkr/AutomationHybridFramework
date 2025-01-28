package cuesz.admin.pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.date.functions.DateGenerator;
import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;
import cuesz.web.resources.weblocators;

public class Case01_create_advocate extends BasePage {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Case01_create_advocate.class);
	public static String eventDate = DateGenerator.generateFixedDate(); // Use the generated date
	
	SeleniumUtils utils = new SeleniumUtils(driver);
	public Case01_create_advocate(WebDriver driver) {
		super(driver);
		
	}
	@Test 
	 public void Schdulevent() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		
		
		/*Enter date values*/
		WebElement datefield = wait.until(ExpectedConditions.elementToBeClickable(weblocators.advocateclick));
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(datefield).click().sendKeys(eventDate).sendKeys(Keys.ENTER).perform();
        // Log message to console and Allure report
        LOGGER.info("Click on date field and enter event date");
        AllureUtils.logStep("Click on date field and enter event date");
		
		
		
	}
}