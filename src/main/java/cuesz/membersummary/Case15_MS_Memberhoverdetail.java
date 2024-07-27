package cuesz.membersummary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;

public class Case15_MS_Memberhoverdetail extends BasePage {
	SeleniumUtils utils = new SeleniumUtils(driver);
	

	private By homeicon		= (By.cssSelector("img[src*='/static/media/home_green']"));
	private By morningscn 	=  (By.xpath("//div[@id=\"MemberSummary-MemberDetails-MorningScan\"]//img"));
	private By biofeedbck	= (By.xpath("//div[@id=\"MemberSummary-MemberDetails-AdaptiveBiofeedbackTest\"]//img"));
	private By fuel			= (By.xpath("//div[@id=\"MemberSummary-MemberDetails-FuelDetails\"]//img"));
	private By perform		= (By.xpath("//div[@id=\"MemberSummary-MemberDetails-PerformDetails\"]//img"));
	private By restore		= (By.xpath("//div[@id=\"MemberSummary-MemberDetails-RestoreDetails\"]//img"));
	private By version		= (By.id("MemberSummary-MemberDetails-Version"));
	private By memberflag	= (By.id("MemberSummary-MemberDetails-Flag"));
	private By flagbox		= (By.xpath("//div[@class='flag_modal']//div[1]//div[1]//div[1]//div[1]//input[1]"));
	private By closebutton	= (By.xpath("//button[@class='close_btn']//span"));
	
	
    public Case15_MS_Memberhoverdetail(WebDriver driver) {
		super(driver);
	}

	@Test
    public void MemberSummary() throws InterruptedException {
        Thread.sleep(2000);

        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        
        
        Thread.sleep(2000);
        // Locate the Redflag element to hover over to click and perform desired activity
           WebElement membrflag = driver.findElement(memberflag);
           Actions actions1 = new Actions(driver);
           actions1.moveToElement(membrflag).perform();
           Thread.sleep(2000);
           membrflag.click();
           Thread.sleep(2000);
           WebElement flagModalElement = driver.findElement(flagbox);
           flagModalElement.click();
           Thread.sleep(2000);
           WebElement Closebtn = driver.findElement(closebutton);
           Closebtn.click();
        
        Thread.sleep(2000);
     // Locate the morningscan element to hover over
        WebElement moringscan = driver.findElement(morningscn);
        // Perform the hover action
        Actions actions = new Actions(driver);
        actions.moveToElement(moringscan).perform();
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
        
        Thread.sleep(2000);
     // Locate the image element to hover over
        WebElement biofeedback = driver.findElement(biofeedbck);
        // Perform the hover action
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(biofeedback).perform();
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");

        Thread.sleep(2000);
     // Hover action for fuel element
        WebElement fuelElement = driver.findElement(fuel);
     // Perform the hover action
        Actions actions3 = new Actions(driver);
        actions3.moveToElement(fuelElement).perform();  
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
        
        Thread.sleep(2000);
        // Get the perform element
        WebElement performElement = driver.findElement(perform);
        // Perform the hover action on the perform element
        Actions actions11 = new Actions(driver);
        actions11.moveToElement(performElement).perform();
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
        
        Thread.sleep(2000);
        // Hover action for restore element
        WebElement restoreElement = driver.findElement(restore);
        // Perform the hover action
        Actions actions5 = new Actions(driver);
        actions5.moveToElement(restoreElement).perform();
        
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");

        Thread.sleep(2000);
     // Locate the home icon element to hover over
        WebElement homeIconElement = driver.findElement(homeicon);
        // Perform the hover action
        Actions actions6 = new Actions(driver);
        actions6.moveToElement(homeIconElement).perform();
        
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");

        Thread.sleep(2000);
     // Locate the element containing the app version
        WebElement versionElement = driver.findElement(version);
        // Get the app version text
        String appVersion = versionElement.getText();
        System.out.println("App Version: " + appVersion);
  
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
        Thread.sleep(2000);
	}
}
