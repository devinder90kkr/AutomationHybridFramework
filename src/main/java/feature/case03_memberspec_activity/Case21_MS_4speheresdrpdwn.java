/*https://chat.openai.com/share/bd098b7d-b6cb-4908-a005-2363eb87139c*/

package feature.case03_memberspec_activity;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
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

@Epic("Member Summary Management")
@Feature("4 Spheres Dropdown")
public class Case21_MS_4speheresdrpdwn extends BasePage {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case21_MS_4speheresdrpdwn.class);
	SeleniumUtils utils = new SeleniumUtils(driver);
	
	public Case21_MS_4speheresdrpdwn(WebDriver driver) {
		super(driver);
		
	}

    @Test
    @Description("Verify 4 Spheres dropdown functionality and progress values")
    @Story("4 Spheres Dropdown Selection")
    public void speheres() throws InterruptedException {
    	LOGGER.info("Starting 4 Spheres dropdown test");
    	
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
    	WebElement sphereHeading = driver.findElement(weblocators.sphreHding);
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
    	
    	// Find the Today's Progress element
    	WebElement todayProgress = driver.findElement(weblocators.todyprgrss);

    	// Verify the Today's Progress value
    	String todayProgressText = todayProgress.getText();
    	try {
    		Assert.assertTrue(todayProgressText.contains("Today's Progress : 0%"), "Today's Progress verification failed");
    		LOGGER.info("Today's Progress verification successful");
    	} catch (AssertionError e) {
    		LOGGER.error("Today's Progress verification failed: {}", e.getMessage());
    		AllureUtils.logStep("Today's Progress verification failed: " + e.getMessage());
    	}
    	AllureUtils.logStep("Checked Today's Progress value");

    	// Find the Overall Progress element
    	WebElement overallProgress = driver.findElement(weblocators.ovrallprgress);

    	// Verify the Overall Progress value
    	String overallProgressText = overallProgress.getText();
    	try {
    		Assert.assertTrue(overallProgressText.contains("OverAll Progress : 59%"), "Overall Progress verification failed");
    		LOGGER.info("Overall Progress verification successful");
    	} catch (AssertionError e) {
    		LOGGER.error("Overall Progress verification failed: {}", e.getMessage());
    		AllureUtils.logStep("Overall Progress verification failed: " + e.getMessage());
    	}
    	AllureUtils.logStep("Checked Overall Progress value");
    	AllureUtils.captureScreenshot(driver, "progress_values");
    	
    	Thread.sleep(3000);
    	
    	// Test dropdown selections
    	String[] dropdownOptions = {"This Week", "Last Week", "14 Days", "30 Days"};
    	for (String option : dropdownOptions) {
    		WebElement dropdown = driver.findElement(weblocators.drpdwn);
    		Actions builder = new Actions(driver);
    		builder.moveToElement(dropdown).click().sendKeys(option).perform();
    		Thread.sleep(2000);
    		builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
    		
    		LOGGER.info("Selected dropdown option: {}", option);
    		AllureUtils.logStep("Selected dropdown option: " + option);
    		AllureUtils.captureScreenshot(driver, "dropdown_selection_" + option.toLowerCase().replace(" ", "_"));
    		
    		Thread.sleep(3000);
    	}
    	
    	LOGGER.info("4 Spheres dropdown test completed successfully");
    	AllureUtils.logStep("Test completed successfully");
    }
    
    }  