package feature.case02_memberspec_basic;

// import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import allureframework.AllureUtils;
import base.BasePage;
import utils.SeleniumUtils;
import constant.weblocators;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

@Epic("Member Summary Profile Management")
@Feature("Member Profile Editing")
public class Case17_MS_profile extends BasePage {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Case17_MS_profile.class);
    SeleniumUtils utils = new SeleniumUtils(driver);

    public Case17_MS_profile(WebDriver driver) {
        super(driver);
    }

    @Test
    @Description("Edit and verify member profile details")
    @Story("Member Profile Update")
    public void MemberProfile() throws InterruptedException {
        LOGGER.info("Starting Member Profile test");
        Thread.sleep(2000);

        LOGGER.info("Navigating to Member Summary page");
        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();
        
        AllureUtils.captureScreenshot(driver, "member_profile_initial");
        LOGGER.info("Accessed member profile page");
 
        // Find the name element
        WebElement nameElement = driver.findElement(weblocators.usrname);
        String currentName = nameElement.getText();
        
        // Verify the current name value
        if (currentName.equals("Agusta porche")) {
            LOGGER.info("Name verification passed");
            AllureUtils.logStep("Name verification successful");
        } else {
            LOGGER.warn("Name verification failed. Expected: Agusta porche, Actual: {}", currentName);
            AllureUtils.logStep("Name verification failed");
        }

        // Find the age element
        WebElement ageElement = driver.findElement(weblocators.age);
        String currentAge = ageElement.getText();

        // Verify the current age value
        if (currentAge.equals("33")) {
            LOGGER.info("Age verification passed");
            AllureUtils.logStep("Age verification successful");
        } else {
            LOGGER.warn("Age verification failed. Expected: 33, Actual: {}", currentAge);
            AllureUtils.logStep("Age verification failed");
        }

        LOGGER.info("Starting profile edit process");
        // Find and click the edit button
        WebElement editButton = driver.findElement(weblocators.editbttn);
        editButton.click();
        AllureUtils.logStep("Clicked edit button to modify profile");
        
        Thread.sleep(3000);
        
        // Update Willingness
        LOGGER.info("Updating willingness field");
        WebElement Willingness = driver.findElement(weblocators.Wilingnes);
        Actions builder = new Actions(driver);
        builder.moveToElement(Willingness).click().sendKeys("Not Willing").perform();
        Thread.sleep(2000);
        builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        AllureUtils.logStep("Updated willingness field");

        // Update Goals
        LOGGER.info("Updating goals field");
        WebElement Goal = driver.findElement(weblocators.Gol);
        Goal.clear();
        Goal.sendKeys("Make your goal clear and detailed. For example, instead of saying \"I want to eat healthier\", say \"I want to eat five servings of fruits and vegetables every day\".");
        AllureUtils.logStep("Updated goals field");
        
        // Update Previous Milestone
        LOGGER.info("Updating previous milestone field");
        WebElement PreviousMilestone = driver.findElement(weblocators.PrevMilestone);
        PreviousMilestone.clear();
        PreviousMilestone.sendKeys(" think about why you want to eat more fruits and vegetables. Is it because you want to lower your risk of chronic diseases, boost your immune system");
        AllureUtils.logStep("Updated previous milestone field");
        
        // Update Limitations
        LOGGER.info("Updating limitations field");
        WebElement Limitations = driver.findElement(weblocators.Limitions);
        Limitations.clear();
        Limitations.sendKeys(" will meditate for 10 minutes every morning for the next four weeks to reduce my stress levels and improve my mental clarity.");
        AllureUtils.logStep("Updated limitations field");
        
        // Update Tendancy
        LOGGER.info("Updating tendancy field");
        WebElement Tendancy = driver.findElement(weblocators.Tendncy);
        Tendancy.clear();
        Tendancy.sendKeys("tendancy need to update as per automation field");
        AllureUtils.logStep("Updated tendancy field");

        // Update Likes
        LOGGER.info("Updating likes field");
        WebElement Likes = driver.findElement(weblocators.likse);
        Likes.clear();
        Likes.sendKeys("Travelling, internetsurfring like include in this field");
        AllureUtils.logStep("Updated likes field");
        
        // Update Dislikes
        LOGGER.info("Updating dislikes field");
        WebElement Dislikes = driver.findElement(weblocators.Dislikse);
        Dislikes.clear();
        Dislikes.sendKeys("reading, Smoking dislike in this field");
        AllureUtils.logStep("Updated dislikes field");
        
        WebElement selement = driver.findElement(weblocators.selment);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", selement);
        
        // Capture screenshot before saving
        AllureUtils.captureScreenshot(driver, "profile_before_save");
        
        Thread.sleep(2000);
        LOGGER.info("Saving profile changes");
        WebElement Save = driver.findElement(weblocators.Savebttn);
        Actions builder25 = new Actions(driver);
        builder25.moveToElement(Save).click().perform();
        AllureUtils.logStep("Profile changes saved successfully");
        
        // Capture final screenshot
        AllureUtils.captureScreenshot(driver, "profile_after_save");
        LOGGER.info("Member Profile test completed successfully");
    }
}
