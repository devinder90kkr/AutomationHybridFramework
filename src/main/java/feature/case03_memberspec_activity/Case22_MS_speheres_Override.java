/*https://chat.openai.com/share/7ae0306a-bd96-4e0e-9b38-fcf2b6c4c1c8*/

package feature.case03_memberspec_activity;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import allureframework.reporting.AllureUtils;
import base.BasePage;
import utils.SeleniumUtils;
import web.resources.weblocators;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

@Epic("Member Summary Management")
@Feature("4 Spheres Override")
public class Case22_MS_speheres_Override extends BasePage {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case22_MS_speheres_Override.class);
	SeleniumUtils utils = new SeleniumUtils(driver);
	
	
	public Case22_MS_speheres_Override(WebDriver driver) {
		super(driver);
	}

    @Test
    @Description("Verify 4 Spheres override functionality and input values")
    @Story("4 Spheres Override Configuration")
    public void Overridefeature() throws InterruptedException {
        LOGGER.info("Starting 4 Spheres override test");
        
        utils.clickMembersummary();
        LOGGER.info("Clicked on Member Summary");
        AllureUtils.logStep("Navigated to Member Summary");
        
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        LOGGER.info("Entered search text");
        
        utils.clickMembername();
        LOGGER.info("Selected member from search results");
        AllureUtils.logStep("Selected member profile");

        Thread.sleep(3000);
        WebElement elementToScrolTO4spherElement = driver.findElement(weblocators.elementScrollTo4sphere);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementToScrolTO4spherElement);
        LOGGER.info("Scrolled to 4 Spheres section");
        AllureUtils.logStep("Scrolled to 4 Spheres section");
        
        Thread.sleep(3000);
        // Find the heading elements for the four spheres
        WebElement sphereHeading = driver.findElement(weblocators.spheHeadng);
        
        // Scroll to the "4 Spheres" feature
        Actions actions = new Actions(driver);
        actions.moveToElement(sphereHeading);
        actions.perform();

        // Alternatively, you can use JavaScript Executor to scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", sphereHeading);
           
        Thread.sleep(3000);
        // Verify the heading for 4 Spheres
        String headingText = sphereHeading.getText();
        Assert.assertEquals(headingText, "4 Spheres", "4 Spheres heading verification failed");
        LOGGER.info("4 Spheres heading verification successful");
        AllureUtils.logStep("Verified 4 Spheres heading");
        AllureUtils.captureScreenshot(driver, "4_spheres_heading");
        
        Thread.sleep(3000);
        
        // Configure Perform settings
        WebElement performSwitch = driver.findElement(weblocators.perfmSwch);
        performSwitch.click();
        LOGGER.info("Clicked Perform switch");
        AllureUtils.logStep("Enabled Perform override");

        Thread.sleep(3000);
        WebElement performInput = driver.findElement(weblocators.prfrmIput);
        performInput.clear();
        performInput.sendKeys("30");
        LOGGER.info("Set Perform value to 30");
        AllureUtils.logStep("Set Perform value to 30");
        AllureUtils.captureScreenshot(driver, "perform_settings");
        
        Thread.sleep(3000);
        
        // Configure Fuel settings
        WebElement fuelSwitch = driver.findElement(weblocators.fuelSwch);
        fuelSwitch.click();
        LOGGER.info("Clicked Fuel switch");
        AllureUtils.logStep("Enabled Fuel override");

        Thread.sleep(3000);
        WebElement fuelInput = driver.findElement(weblocators.fuelInpt);
        fuelInput.clear();
        fuelInput.sendKeys("50");
        LOGGER.info("Set Fuel value to 50");
        AllureUtils.logStep("Set Fuel value to 50");
        AllureUtils.captureScreenshot(driver, "fuel_settings");

        Thread.sleep(3000);
        
        // Configure Restore settings
        WebElement restoreSwitch = driver.findElement(weblocators.rsttSwtch);
        restoreSwitch.click();
        LOGGER.info("Clicked Restore switch");
        AllureUtils.logStep("Enabled Restore override");

        Thread.sleep(3000);
        WebElement restoreInput = driver.findElement(weblocators.rstorInput);
        restoreInput.clear();
        restoreInput.sendKeys("60");
        LOGGER.info("Set Restore value to 60");
        AllureUtils.logStep("Set Restore value to 60");
        AllureUtils.captureScreenshot(driver, "restore_settings");

        Thread.sleep(3000);
        
        // Configure Mindful settings
        WebElement mindfulSwitch = driver.findElement(weblocators.minflSwich);
        mindfulSwitch.click();
        LOGGER.info("Clicked Mindful switch");
        AllureUtils.logStep("Enabled Mindful override");

        Thread.sleep(3000);
        WebElement mindfulInput = driver.findElement(weblocators.mindflinpt);
        mindfulInput.clear();
        mindfulInput.sendKeys("100");
        LOGGER.info("Set Mindful value to 100");
        AllureUtils.logStep("Set Mindful value to 100");
        AllureUtils.captureScreenshot(driver, "mindful_settings");

        Thread.sleep(3000);
        
        // Disable all overrides
        LOGGER.info("Starting to disable all overrides");
        AllureUtils.logStep("Disabling all overrides");
        
        performSwitch.click();
        LOGGER.info("Disabled Perform override");
        AllureUtils.logStep("Disabled Perform override");

        Thread.sleep(3000);
        fuelSwitch.click();
        LOGGER.info("Disabled Fuel override");
        AllureUtils.logStep("Disabled Fuel override");

        Thread.sleep(3000);
        restoreSwitch.click();
        LOGGER.info("Disabled Restore override");
        AllureUtils.logStep("Disabled Restore override");

        Thread.sleep(3000);
        mindfulSwitch.click();
        LOGGER.info("Disabled Mindful override");
        AllureUtils.logStep("Disabled Mindful override");

        AllureUtils.captureScreenshot(driver, "all_overrides_disabled");
        
        Thread.sleep(2500);
        
        LOGGER.info("4 Spheres override test completed successfully");
        AllureUtils.logStep("Test completed successfully");
    }
}  
    
    
  

