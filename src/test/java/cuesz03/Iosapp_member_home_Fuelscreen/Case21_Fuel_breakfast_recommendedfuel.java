package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AllureUtils;
import cuesz.utils.AppiumappUtils;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("Fuel screen detail ")
@Feature("Verify Fuel detail functionality related to breakfast functionality.")
public class Case21_Fuel_breakfast_recommendedfuel extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case21_Fuel_breakfast_recommendedfuel.class);

    private By Homeclick = AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
    private By breakfastlabel = AppiumBy.iOSNsPredicateString("name == 'Breakfast'");
    private By iconbreakfast = AppiumBy.accessibilityId("BreakfastInfoIcon");
    private By backicon = AppiumBy.accessibilityId("BackPress");
    private By plusadd = AppiumBy.accessibilityId("BreakfastAddIcon");
    private By doneclick = AppiumBy.accessibilityId("Done");
    private By recommendedclick = AppiumBy.accessibilityId("AddRecommendedFuel");
    private By backicon1 = AppiumBy.accessibilityId("RecommendBackPress");
    private By rightarrow = AppiumBy.accessibilityId("FuelCaloriesArrowRight");
    private By Time = AppiumBy.accessibilityId("RecommendedFuelTime");
    private By pickerelement = AppiumBy.xpath("//XCUIElementTypePickerWheel");
    private By Doneclick = AppiumBy.accessibilityId("AlcohalTime");
    private By tickbreakfast = AppiumBy.accessibilityId("RecommendedFuelSubmit");
    private By brekdone = AppiumBy.accessibilityId("Done");

    @Test
    @Owner("QA")
    @Severity(SeverityLevel.NORMAL)
    @Description("Member Fuel screen detail verification")
    @Story("Scroll to Fuel card and verify breakfast assigned by staff ")
    public void Homescreen() throws InterruptedException {
        AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");

        WebElement Homeicon = driver.findElement(Homeclick);
        Homeicon.click();
        
        // Log console message to Allure
        LOGGER.info("Click on home menu from bottom");
        AllureUtils.logStep("Click on home menu from bottom");
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Case21_Fuel_breakfast_recommendedfuel1");
        Thread.sleep(3000);

        HashMap<String, Object> scrollObject = new HashMap<>();
        scrollObject.put("direction", "down");
        scrollObject.put("Perform Fuel Mindful Restore", "Perform");
        driver.executeScript("mobile:scroll", scrollObject);
        
        // Log console message to Allure
        LOGGER.info("Scroll down to Fuel");
        AllureUtils.logStep("Scroll down to Fuel");

        Thread.sleep(2000);
        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();
        // Log console message to Allure
        LOGGER.info("Click on fuel screen");
        AllureUtils.logStep("Click on fuel screenc");
        AllureUtils.captureScreenshot(driver, "Case21_Fuel_breakfast_recommendedfuel2");

        WebElement breakfast = driver.findElement(breakfastlabel);
        String actualText = breakfast.getText();
        String expectedText = "Breakfast";

        System.out.println("Actual Text: " + actualText);
        System.out.println("Expected Text: " + expectedText);
        Assert.assertEquals(actualText, expectedText);

        WebElement breakfasticon = driver.findElement(iconbreakfast);
        breakfasticon.click();
        WebElement backclick = driver.findElement(backicon);
        backclick.click();

        AllureUtils.captureScreenshot(driver, "Fuel11");

        WebElement breakfastplus = driver.findElement(plusadd);
        breakfastplus.click();
        // Log console message to Allure
        LOGGER.info("Click on fuel plus icon");
        AllureUtils.logStep("Click on fuel plus icon");
        AllureUtils.captureScreenshot(driver, "Case21_Fuel_breakfast_recommendedfuel3");
        
        
        WebElement keypaddone = driver.findElement(doneclick);
        keypaddone.click();
        // Log console message to Allure
        LOGGER.info("Click on Done");
        AllureUtils.logStep("Click on done");
       

        WebElement Recommendedfuel = driver.findElement(recommendedclick);
        Recommendedfuel.click();
        // Log console message to Allure
        LOGGER.info("Click on Recommended fuel");
        AllureUtils.logStep("Click on Recommended fuel");
        AllureUtils.captureScreenshot(driver, "Case21_Fuel_breakfast_recommendedfuel4");
        
        
        WebElement recommendebackclick = driver.findElement(backicon1);
        recommendebackclick.click();

        WebElement keypaddone1 = driver.findElement(doneclick);
        keypaddone1.click();

        WebElement Recommendedfuel1 = driver.findElement(recommendedclick);
        Recommendedfuel1.click();

        try {
            // Try to locate and click on the arrowright element
            WebElement arrowright = driver.findElement(rightarrow);
            arrowright.click();
            
            // If the arrowright element is clicked successfully, continue with the rest of the steps
            WebElement Timerclick = driver.findElement(Time);
            Timerclick.click();
            
            List<WebElement> values = driver.findElements(pickerelement);
            
            for (int i = 0; i < values.size(); i++) {
                System.out.println(values.get(i).getText());
            }
            
            values.get(0).sendKeys("6");
            values.get(0).sendKeys(Keys.TAB);
            
            Thread.sleep(3500);
            values.get(1).sendKeys("43");
            values.get(1).sendKeys(Keys.TAB);
            
            Thread.sleep(3500);
            values.get(2).sendKeys("AM");
            
            // Capture a screenshot and attach it to Allure
            AllureUtils.captureScreenshot(driver, "Fuel13");
            
            driver.findElement(Doneclick).click();
            
            // Click on breakfast-tick
            WebElement breakfasttick = driver.findElement(tickbreakfast);
            breakfasttick.click();
            
            // Click on Done-breakfast button
            WebElement brekfastdone = driver.findElement(brekdone);
            brekfastdone.click();
            
        } catch (Exception e) {
        	// If the arrowright element is not found, log an error message and terminate the app
            String errorMessage = "Arrowright element not found. Skipping further steps.";
            System.out.println(errorMessage);
            Allure.addAttachment("Error", errorMessage);
            AllureUtils.captureScreenshot(driver, "ArrowRightNotFound");
            driver.terminateApp("com.cuesz.mobile");
        }


        Thread.sleep(2500);
        driver.terminateApp("com.cuesz.mobile");
    }
}
