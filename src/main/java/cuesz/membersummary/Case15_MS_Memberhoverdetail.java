package cuesz.membersummary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;

public class Case15_MS_Memberhoverdetail extends BasePage {
	SeleniumUtils utils = new SeleniumUtils(driver);
	
//	private By morningscn	= (By.cssSelector("img[src*='/static/media/morning_scan-red']"));
//	private By biofeedbck	= (By.cssSelector("img[src*='/static/media/bio_feedback-red']"));
//	private By fuel			= (By.cssSelector("img[src*='/static/media/fuel-red']"));
//	private By perform		= (By.cssSelector("img[src*='/static/media/perform.b6ea9f49.svg']"));
//	private By perbarrefitness	=	 (By.xpath("//span[text()='Barre fitness ']"));
//	private By preareboic	= (By.xpath("//span[text()='Aerobics ']"));
//	private By prebarfitness = (By.xpath("//span[text()='Barre fitness ']"));
//	private By restore		= (By.cssSelector("img[src*='/static/media/activity-red']"));
//	private By homeicon		= (By.cssSelector("img[src*='/static/media/home_green']"));
//	private By version		= (By.cssSelector("h4.px-5"));
	
	private By morningscn	= (By.id("MemberSummary-MemberDetails-MorningScan"));
	private By biofeedbck	= (By.id("MemberSummary-MemberDetails-AdaptiveBiofeedbackTest"));
	private By fuel			= (By.id("MemberSummary-MemberDetails-FuelDetails"));
	private By perform		= (By.id("MemberSummary-MemberDetails-PerformDetails"));
//	private By perbarrefitness	=	 (By.xpath("//span[text()='Barre fitness ']"));
//	private By preareboic	= (By.id(""));
//	private By prebarfitness = (By.id(""));
	private By restore		= (By.id("MemberSummary-MemberDetails-RestoreDetails"));
	
	private By version		= (By.id("MemberSummary-MemberDetails-Version"));
	
	
    
    public Case15_MS_Memberhoverdetail(WebDriver driver) {
		super(driver);
	}

	@Test
    public void MemberSummary() throws InterruptedException {
        Thread.sleep(2000);

        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        
        Thread.sleep(5000);
     // Locate the morningscan element to hover over
        WebElement moringscan = driver.findElement(morningscn);
        // Perform the hover action
        Actions actions = new Actions(driver);
        actions.moveToElement(moringscan).perform();
     // Find the <img> tag inside the element
        WebElement morningscanimg = moringscan.findElement(By.tagName("img"));
     // Hover over the <img> tag
        actions.moveToElement(morningscanimg).perform();
        
        
        Thread.sleep(2500);
        
        Thread.sleep(5000);
     // Locate the image element to hover over
        WebElement biofeedback = driver.findElement(biofeedbck);
        // Perform the hover action
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(biofeedback).perform();
     // Find the <img> tag inside the element
        WebElement biofeedbckscanimg = moringscan.findElement(By.tagName("img"));
     // Hover over the <img> tag
        actions.moveToElement(biofeedbckscanimg).perform();

        Thread.sleep(5000);
     // Hover action for fuel element
        WebElement fuelElement = driver.findElement(fuel);
     // Perform the hover action
        Actions actions3 = new Actions(driver);
        actions3.moveToElement(fuelElement).perform();  
        // Find the <img> tag inside the element
        WebElement fuelimg = moringscan.findElement(By.tagName("img"));
     // Hover over the <img> tag
        actions.moveToElement(fuelimg).perform();
        
       
        Thread.sleep(5000);
        // Get the perform element
        WebElement performElement = driver.findElement(perform);
        // Perform the hover action on the perform element
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(performElement).perform();
        
        
//        // Now, you can perform additional actions with the sub-elements if needed.
//        // For example, if you want to hover over the "Barre fitness" element:
//        WebElement barreFitnessElement = driver.findElement(perbarrefitness);
//        actions1.moveToElement(barreFitnessElement).perform();
//        // If you want to hover over the "Aerobics" element:
//        WebElement aerobicsElement = driver.findElement(preareboic);
//        actions1.moveToElement(aerobicsElement).perform();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Wait up to 10 seconds
//        WebElement barreFitnessElement1 = wait.until(ExpectedConditions.visibilityOfElementLocated(prebarfitness));
//        actions1.moveToElement(barreFitnessElement1).perform();

        
        Thread.sleep(5000);
        // Hover action for restore element
        WebElement restoreElement = driver.findElement(restore);
        // Perform the hover action
        Actions actions5 = new Actions(driver);
        actions5.moveToElement(restoreElement).perform();

//        Thread.sleep(5000);
//     // Locate the home icon element to hover over
//        WebElement homeIconElement = driver.findElement(homeicon);
//        // Perform the hover action
//        Actions actions6 = new Actions(driver);
//        actions6.moveToElement(homeIconElement).perform();

        Thread.sleep(5000);
     // Locate the element containing the app version
        WebElement versionElement = driver.findElement(version);
        // Get the app version text
        String appVersion = versionElement.getText();
        System.out.println("App Version: " + appVersion);
        
    }
}
