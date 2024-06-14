/*https://chat.openai.com/share/7ae0306a-bd96-4e0e-9b38-fcf2b6c4c1c8*/

package cuesz.membersummary;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;
import cuesz.utils.reporting.AllureUtils;

public class Case22_MS_speheres_Override extends BasePage {

	SeleniumUtils utils = new SeleniumUtils(driver);
	private By spheHeadng =	(By.cssSelector(".title_h4 h4"));
	private By perfmSwch = (By.name("defaultPerformPerEnable"));
	private By prfrmIput = (By.name("defaultPerformPer"));
	private By fuelSwch	= (By.name("defaultFuelPerEnable"));
	private By fuelInpt = (By.name("defaultFuelPer"));
	private By rsttSwtch	= (By.name("defaultRestorePerEnable"));
	private By rstorInput	= (By.name("defaultRestorePer"));
	private By minflSwich	=	(By.name("defaultMindfulPerEnable"));
	private By mindflinpt	= (By.name("defaultMindfulPer"));
	
	
	public Case22_MS_speheres_Override(WebDriver driver) {
		super(driver);
	}

    @Test
    public void Overridefeature() throws InterruptedException {
        Thread.sleep(2000);
    	
    	utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();

              
        // Find the heading elements for the four spheres
        WebElement sphereHeading = driver.findElement(spheHeadng);
        
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
        if (headingText.equals("4 Spheres")) {
            System.out.println("Heading verification successful!");
        } else {
            System.out.println("Heading verification failed!");
        }
        
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
        
        Thread.sleep(3000);
     // Find and click the switch for the "Perform" element
        WebElement performSwitch = driver.findElement(perfmSwch);
        performSwitch.click();

        Thread.sleep(3000);
        // Find the input field for the "Perform" element and set its value to 30
        WebElement performInput = driver.findElement(prfrmIput);
        performInput.clear();
        performInput.sendKeys("30");
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot"); 
        
        Thread.sleep(3000);
        // Find and click the switch for the "Fuel" element
        WebElement fuelSwitch = driver.findElement(fuelSwch);
        fuelSwitch.click();

        Thread.sleep(3000);
        // Find the input field for the "Fuel" element and set its value to 50
        WebElement fuelInput = driver.findElement(fuelInpt);
        fuelInput.clear();
        fuelInput.sendKeys("50");
        
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");

        Thread.sleep(3000);
        // Find and click the switch for the "Restore" element
        WebElement restoreSwitch = driver.findElement(rsttSwtch);
        restoreSwitch.click();

        Thread.sleep(3000);
        // Find the input field for the "Restore" element and set its value to 60
        WebElement restoreInput = driver.findElement(rstorInput);
        restoreInput.clear();
        restoreInput.sendKeys("60");
        
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");

        Thread.sleep(3000);
        // Find and click the switch for the "Mindful" element
        WebElement mindfulSwitch = driver.findElement(minflSwich);
        mindfulSwitch.click();

        Thread.sleep(3000);
        // Find the input field for the "Mindful" element and set its value to 100
        WebElement mindfulInput = driver.findElement(mindflinpt);
        mindfulInput.clear();
        mindfulInput.sendKeys("100");
        
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");

        Thread.sleep(3000);
        // Find and click the switch for the "Perform" element to toggle it off
        performSwitch.click();

        Thread.sleep(3000);
        // Find and click the switch for the "Fuel" element to toggle it off
        fuelSwitch.click();

        Thread.sleep(3000);
        // Find and click the switch for the "Restore" element to toggle it off
        restoreSwitch.click();

        Thread.sleep(3000);
        // Find and click the switch for the "Mindful" element to toggle it off
        mindfulSwitch.click();

     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
        
        Thread.sleep(2500);
        
        
	    }
    }  
    
    
  

