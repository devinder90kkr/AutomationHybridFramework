 /*https://chat.openai.com/share/fb99a8d3-9b88-4b49-8555-3f5eab0b24e5 */
package cuesz.membersummary;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz01schdulemaster.Step01_Login;

public class Case32_MS_Bodyscanresult extends Step01_Login {

	 public static String eventDate = "26-08-2023"; // Date to be passed to script two
	
    @BeforeClass
    public void setUpChildClass() {
        setUp();
    }

    @Test(dependsOnMethods = "Login")
    public void Avatarclick() throws InterruptedException {
        Thread.sleep(2000);

        // Click on the Member Summary button or link
        driver.findElement(By.xpath("//img[@alt='Member Summary']")).click();

        // Enter the name in the search field
        driver.findElement(By.xpath("//input[@placeholder='Search Members']"))
                .sendKeys("Kumar Devinder");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='member-items']")).click();
        // Scroll to the "Team Leader Coach Notes" heading
        
        Thread.sleep(3000);
        // Replace this with the actual locator for your element
        WebElement elementToScrollTo = driver.findElement(By.xpath("//h4[contains(text(), 'Body Scan Result')]"));

        // Scroll to the element using JavaScript Executor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementToScrollTo);

        Thread.sleep(3000);
       
        WebElement selecttype = driver.findElement(By.xpath("//div[text()='01-08-2023']"));
        Actions builder1 = new Actions(driver);
	    builder1.moveToElement(selecttype).click().sendKeys("01-08-2023").perform();
	    Thread.sleep(2000);
	    builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
  
	 // Find the elements for the specific details
        String[] details = {
            "Total Body Fat",
            "Visceral Fat",
            "Waist To Hip Ratio",
            "Waist To Height Ratio",
            "Waist Circumference",
            "Hip Circumference",
            "Body Scan Risk Indicator",
            "bviNumber",
            "Weight"
        };

        for (String detail : details) {
            WebElement element = driver.findElement(By.xpath("//span[contains(text(), '" + detail + "')]/ancestor::div[contains(@class, 'bmi_col')]//h4"));
            String value = element.getText();

            System.out.println(detail + ": " + value);
        }
        
        Thread.sleep(2500);
	    WebElement selecttype1 = driver.findElement(By.xpath("(//div[contains(text(),'01-08-2023 IST')])[1]"));
        Actions builder2 = new Actions(driver);
	    builder2.moveToElement(selecttype1).click().sendKeys("24-07-2023").perform();
	    Thread.sleep(2000);
	    builder2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        
	 // Find the elements for the specific details
        String[] details1 = {
            "Total Body Fat",
            "Visceral Fat",
            "Waist To Hip Ratio",
            "Waist To Height Ratio",
            "Waist Circumference",
            "Hip Circumference",
            "Body Scan Risk Indicator",
            "bviNumber",
            "Weight"
        };

        for (String detail : details1) {
            WebElement element = driver.findElement(By.xpath("//span[contains(text(), '" + detail + "')]/ancestor::div[contains(@class, 'bmi_col')]//h4"));
            String value = element.getText();
            System.out.println(detail + ": " + value);
        }
        
        Thread.sleep(2500);
	    WebElement selecttype3 = driver.findElement(By.xpath("(//div[contains(text(),'24-07-2023 IST')])[1]"));
        Actions builder3 = new Actions(driver);
	    builder3.moveToElement(selecttype3).click().sendKeys("21-07-2023").perform();
	    Thread.sleep(2000);
	    builder3.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        
	 // Find the elements for the specific details
        String[] details2 = {
            "Total Body Fat",
            "Visceral Fat",
            "Waist To Hip Ratio",
            "Waist To Height Ratio",
            "Waist Circumference",
            "Hip Circumference",
            "Body Scan Risk Indicator",
            "bviNumber",
            "Weight"
        };

        for (String detail : details2) {
            WebElement element = driver.findElement(By.xpath("//span[contains(text(), '" + detail + "')]/ancestor::div[contains(@class, 'bmi_col')]//h4"));
            String value = element.getText();
            System.out.println(detail + ": " + value);
        }
        
        
        Thread.sleep(2500);
	    WebElement selecttype31 = driver.findElement(By.xpath("(//div[contains(text(),'21-07-2023 IST')])[1]"));
        Actions builder31 = new Actions(driver);
	    builder31.moveToElement(selecttype31).click().sendKeys("06-07-2023").perform();
	    Thread.sleep(2000);
	    builder31.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        
	 // Find the elements for the specific details
        String[] details21 = {
            "Total Body Fat",
            "Visceral Fat",
            "Waist To Hip Ratio",
            "Waist To Height Ratio",
            "Waist Circumference",
            "Hip Circumference",
            "Body Scan Risk Indicator",
            "bviNumber",
            "Weight"
        };

        for (String detail : details21) {
            WebElement element = driver.findElement(By.xpath("//span[contains(text(), '" + detail + "')]/ancestor::div[contains(@class, 'bmi_col')]//h4"));
            String value = element.getText();
            System.out.println(detail + ": " + value);
        }
        
        
        
        /*Enter date and then click*/
	    Thread.sleep(2000);
	    WebElement nextscandate =driver.findElement(By.xpath("(//input[@value='04-08-2023'])[1]"));
	    Actions builder112 = new Actions(driver);
	    builder112.moveToElement(nextscandate).click().sendKeys(eventDate).sendKeys(Keys.ENTER).perform();;
        
	    
	    Thread.sleep(5000);
        
        }    
    
    
    }
  
    
        
       
	    
      
    
    
  

