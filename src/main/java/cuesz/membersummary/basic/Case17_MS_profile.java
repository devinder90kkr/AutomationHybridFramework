package cuesz.membersummary.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;
import cuesz.web.resources.weblocators;

public class Case17_MS_profile extends BasePage {
	
	SeleniumUtils utils = new SeleniumUtils(driver);
	
	

    public Case17_MS_profile(WebDriver driver) {
		super(driver);
		
	}
    @Test
    public void MemberProfile() throws InterruptedException {
        Thread.sleep(2000);

        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();
        
 
     // Find the name element
        WebElement nameElement = driver.findElement(weblocators.usrname);

        // Get the current name value
        String currentName = nameElement.getText();
        // Verify the current name value
        if (currentName.equals("Agusta porche")) {
            System.out.println("Name verification passed.");
        } else {
            System.out.println("Name verification failed.");
        }

        // Find the age element
        WebElement ageElement = driver.findElement(weblocators.age);
        // Get the current age value
        String currentAge = ageElement.getText();

        // Verify the current age value
        if (currentAge.equals("33")) {
            System.out.println("Age verification passed.");
        } else {
            System.out.println("Age verification failed.");
        }

        // Find the edit button
        WebElement editButton = driver.findElement(weblocators.editbttn);
        // Click on the edit button to edit the profile
        editButton.click();
        
        Thread.sleep(3000);
        WebElement Willingness = driver.findElement(weblocators.Wilingnes);
        Actions builder = new Actions(driver);
	    builder.moveToElement(Willingness).click().sendKeys("Not Willing").perform();
	    Thread.sleep(2000);
	    builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

	    WebElement Goal = driver.findElement(weblocators.Gol);
	    Goal.clear();
	    Goal.sendKeys("Make your goal clear and detailed. For example, instead of saying \"I want to eat healthier\", say \"I want to eat five servings of fruits and vegetables every day\".");
	    
	    WebElement PreviousMilestone = driver.findElement(weblocators.PrevMilestone);
	    PreviousMilestone.clear();
	    PreviousMilestone.sendKeys(" think about why you want to eat more fruits and vegetables. Is it because you want to lower your risk of chronic diseases, boost your immune system");
	    
	    WebElement Limitations = driver.findElement(weblocators.Limitions);
	    Limitations.clear();
	    Limitations.sendKeys(" will meditate for 10 minutes every morning for the next four weeks to reduce my stress levels and improve my mental clarity.");
	    
	    WebElement Tendancy = driver.findElement(weblocators.Tendncy);
	    Tendancy.clear();
	    Tendancy.sendKeys("tendancy need to update as per automation field");

	    WebElement Likes = driver.findElement(weblocators.likse);
	    Likes.clear();
	    Likes.sendKeys("Travelling, internetsurfring like include in this field");
	    
	    WebElement Dislikes = driver.findElement(weblocators.Dislikse);
	    Dislikes.clear();
	    Dislikes.sendKeys("reading, Smoking dislike in this field");
		
	    WebElement selement = driver.findElement(weblocators.selment);
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView();",selement);
	 // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
	    
	    Thread.sleep(2000);
	    WebElement Save= driver.findElement(weblocators.Savebttn);
	    Actions builder25 = new Actions(driver);
	    builder25.moveToElement(Save).click().perform();;

	    
    }
}
