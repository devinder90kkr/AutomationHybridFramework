 /*https://chat.openai.com/share/fb99a8d3-9b88-4b49-8555-3f5eab0b24e5 */
package cuesz.membersummary;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v112.page.model.NavigatedWithinDocument;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz01schdulemaster.Step01_Login;

public class Case30_MS_Deletenewgoal extends Step01_Login {

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
        WebElement teamLeaderNotesHeading = driver.findElement(By.xpath("//h2[normalize-space()='Team Leader Coach Notes']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", teamLeaderNotesHeading);
        Thread.sleep(2000);
        WebElement goalbutton = driver.findElement(By.xpath("//img[@alt='Goal Logo']"));
        goalbutton.click();
        
        Thread.sleep(2500);
        WebElement editbutton = driver.findElement(By.xpath("//div[@class='mid_sec']//button[1]"));
        editbutton.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='row']//div[2]//div[1]//textarea[1]")).sendKeys("this is new edited values for text area");
   
        Thread.sleep(2500);
        driver.findElement(By.xpath("(//textarea[@id='editor'])[2]")).sendKeys("hello all this new edit field");
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@alt='save']")).click();
        
        Thread.sleep(2500);
        driver.findElement(By.xpath("//img[@alt='edit']")).click();
        
        Thread.sleep(2500);
        driver.findElement(By.xpath("//span[normalize-space()='Confirm']")).click();
        
        Thread.sleep(2500);
        
        driver.navigate().back();
        
        Thread.sleep(3000);
        WebElement teamLeaderNotesHeading1 = driver.findElement(By.xpath("//h2[normalize-space()='Team Leader Coach Notes']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", teamLeaderNotesHeading1);
        Thread.sleep(2000);
        
       
        
        }    
    }
  
    
        
       
	    
      
    
    
  

