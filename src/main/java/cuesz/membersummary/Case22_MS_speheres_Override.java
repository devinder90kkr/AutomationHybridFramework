/*https://chat.openai.com/share/7ae0306a-bd96-4e0e-9b38-fcf2b6c4c1c8*/

package cuesz.membersummary;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz01schdulemaster.Step01_Login;

public class Case22_MS_speheres_Override extends Step01_Login {

    @BeforeClass
    public void setUpChildClass() {
        setUp();
    }

    @Test(dependsOnMethods = "Login")
    public void Overridefeature() throws InterruptedException {
        Thread.sleep(2000);

        // Click on the Member Summary button or link
        driver.findElement(By.xpath("//img[@alt='Member Summary']")).click();

        // Enter the name in the search field
        driver.findElement(By.xpath("//input[@placeholder='Search Members']"))
                .sendKeys("Kumar Devinder");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='member-items']")).click();
      
        // Find the heading elements for the four spheres
        WebElement sphereHeading = driver.findElement(By.cssSelector(".title_h4 h4"));
        
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
        
        Thread.sleep(3000);
     // Find and click the switch for the "Perform" element
        WebElement performSwitch = driver.findElement(By.name("defaultPerformPerEnable"));
        performSwitch.click();

        Thread.sleep(3000);
        // Find the input field for the "Perform" element and set its value to 30
        WebElement performInput = driver.findElement(By.name("defaultPerformPer"));
        performInput.clear();
        performInput.sendKeys("30");

        Thread.sleep(3000);
        // Find and click the switch for the "Fuel" element
        WebElement fuelSwitch = driver.findElement(By.name("defaultFuelPerEnable"));
        fuelSwitch.click();

        Thread.sleep(3000);
        // Find the input field for the "Fuel" element and set its value to 50
        WebElement fuelInput = driver.findElement(By.name("defaultFuelPer"));
        fuelInput.clear();
        fuelInput.sendKeys("50");

        Thread.sleep(3000);
        // Find and click the switch for the "Restore" element
        WebElement restoreSwitch = driver.findElement(By.name("defaultRestorePerEnable"));
        restoreSwitch.click();

        Thread.sleep(3000);
        // Find the input field for the "Restore" element and set its value to 60
        WebElement restoreInput = driver.findElement(By.name("defaultRestorePer"));
        restoreInput.clear();
        restoreInput.sendKeys("60");

        Thread.sleep(3000);
        // Find and click the switch for the "Mindful" element
        WebElement mindfulSwitch = driver.findElement(By.name("defaultMindfulPerEnable"));
        mindfulSwitch.click();

        Thread.sleep(3000);
        // Find the input field for the "Mindful" element and set its value to 100
        WebElement mindfulInput = driver.findElement(By.name("defaultMindfulPer"));
        mindfulInput.clear();
        mindfulInput.sendKeys("100");

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

        
	    }
    }  
    
    
  

