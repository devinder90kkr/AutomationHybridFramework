/*https://chat.openai.com/share/c262f25b-bab9-4b0a-ae68-6065478296aa*/
package feature.case02_memberspec_basic;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
@Feature("Sleep Data Management")
public class Case81_MS_Sleeptime extends BasePage {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Case81_MS_Sleeptime.class);
    SeleniumUtils utils = new SeleniumUtils(driver);
    private WebDriverWait wait;
    public Case81_MS_Sleeptime(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private void selectDurationOption(String option) throws InterruptedException {
        WebElement dropdownElement = wait.until(ExpectedConditions.elementToBeClickable(weblocators.durationDropdown));
        dropdownElement.click();
        LOGGER.info("Opened duration dropdown");
        Thread.sleep(1000);

        String optionXPath = String.format("//div[@id='MemberSummary-SleepData-Duration']//div[contains(text(), '%s')]", option);
        WebElement optionElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(optionXPath)));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", optionElement);
        optionElement.click();
        
        LOGGER.info("Selected duration option: {}", option);
        AllureUtils.logStep("Selected duration: " + option);
        Thread.sleep(1000);
    }

    @Test
    @Description("Manage Sleep Data duration settings")
    @Story("Sleep Data Configuration")
    public void sleepTime() throws InterruptedException {
        LOGGER.info("Starting Sleep Data configuration process");
        
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

        Thread.sleep(5000);
        WebElement elementToScrollTo = wait.until(ExpectedConditions.elementToBeClickable(weblocators.sleeptime));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);
        LOGGER.info("Scrolled to sleeptime section");
        AllureUtils.logStep("Scrolled to sleeptime section");

        // Select different duration options
        String[] durations = {"7 Days", "14 Days", "30 Days", "60 Days"};
        for (String duration : durations) {
            selectDurationOption(duration);
            AllureUtils.captureScreenshot(driver, "sleep_data_duration_" + duration.replace(" ", "_"));
            Thread.sleep(1000);
        }

        LOGGER.info("Sleep Data configuration completed successfully");
        AllureUtils.logStep("Completed Sleep Data configuration");
        Thread.sleep(2000);
    }
}
  
    
        
       
	    
      
    
    
  

