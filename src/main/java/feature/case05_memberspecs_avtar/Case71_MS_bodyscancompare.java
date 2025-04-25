/*https://chat.openai.com/share/780888bc-02e7-4970-81eb-9dfd2f5b22d6*/

package feature.case05_memberspecs_avtar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BasePage;
import utils.SeleniumUtils;

public class Case71_MS_bodyscancompare extends BasePage {
	
	SeleniumUtils utils = new SeleniumUtils(driver);
	private By compre = (By.id("MemberSummary-Avatar-Compare"));
	private By comparPopup = (By.xpath("//div[@class='compare_popup comparison_modal text-center']"));
	private By avtardropdwn1 = (By.id("MemberSummary-Avatar-Comparison-p1-Dropdown"));
	private By avtardropdn2 = (By.id("MemberSummary-Avatar-Comparison-p2-Dropdown"));
	

    public Case71_MS_bodyscancompare(WebDriver driver) {
		super(driver);
	}

    @Test
    public void Avatarclick() throws InterruptedException {
        Thread.sleep(2000);

        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();
      
        // Find the Compare element and click on it
        WebElement compare = driver.findElement(compre);
        compare.click();
        Thread.sleep(1500);
        driver.navigate().refresh();
        Thread.sleep(8500);
        
        WebElement compare1 = driver.findElement(compre);
        compare1.click();
        
        // Define the XPath for the Comparison popup (you may need to adjust this)
        By comparisonPopupLocator = comparPopup;
        // Wait for the Comparison popup to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(500));
        WebElement comparisonPopup = wait.until(ExpectedConditions.presenceOfElementLocated(comparisonPopupLocator));

        // Check if the Comparison popup is displayed
        if (comparisonPopup.isDisplayed()) {
            System.out.println("Comparison popup is open.");
            // You can perform additional actions on the popup here
        } else {
            System.out.println("Comparison popup is not open.");
        }
        
        Thread.sleep(5500);
	    WebElement selecttype1 = driver.findElement(avtardropdwn1);
        Actions builder2 = new Actions(driver);
	    builder2.moveToElement(selecttype1).click().sendKeys("24-08-2023").perform();
	    Thread.sleep(2000);
	    builder2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

       Thread.sleep(2500);          
	    
	    WebElement selecttype2 = driver.findElement(avtardropdn2);
        Actions builder3 = new Actions(driver);
	    builder3.moveToElement(selecttype2).click().sendKeys("24-08-2023").perform();
	    Thread.sleep(2000);
	    builder3.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	    
	    Thread.sleep(1000);
	    
        }    
    }
  
    
        
       
	    
      
    
    
  

