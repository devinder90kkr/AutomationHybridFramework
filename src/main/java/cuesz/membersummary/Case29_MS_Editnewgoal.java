 /*https://chat.openai.com/share/fb99a8d3-9b88-4b49-8555-3f5eab0b24e5 */
package cuesz.membersummary;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz01schdulemaster.Step01_Login;

public class Case29_MS_Editnewgoal extends Step01_Login {

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

        /*Short Term Goals - 3 Months*/
        Thread.sleep(2500);
     // Locate and click the "Edit" button
        driver.findElement(By.className("btn_edit")).click();
        Thread.sleep(2000);
     // Locate the input field and send keys (input values)
        driver.findElement(By.xpath("//textarea[@id='editor']")).sendKeys("Value 1\n update new file to text");  
        Thread.sleep(2000);
     // Locate and click the "Save" button
        driver.findElement(By.xpath("(//img[@alt='save'])[1]")).click();
        Thread.sleep(2000);
        // Locate and click the "CHECKBOXES" button
        driver.findElement(By.xpath("(//input[@name='redFlag'])[1]")).click();
           
        /*Long Term Goal*/
        Thread.sleep(2500);
     // Locate and click the "Edit" button
        driver.findElement(By.xpath("(//img[@alt='save'])[2]")).click();
        Thread.sleep(2000);
     // Locate the input field and send keys (input values)
        driver.findElement(By.xpath("(//textarea[@id='editor'])[1]")).sendKeys("Value 1\n update new file to text");  
        Thread.sleep(2000);
     // Locate and click the "Save" button
        driver.findElement(By.xpath("(//img[@alt='save'])[2]")).click();
         Thread.sleep(2000);
     // Locate and click the "CHECKBOXES" button
        driver.findElement(By.xpath("(//input[@name='redFlag'])[4]")).click();
        
        /*Process Thinking*/
        Thread.sleep(2500);
      // Locate and click the "Edit" button
        driver.findElement(By.xpath("(//img[@alt='save'])[3]")).click();
        Thread.sleep(2000);
      // Locate the input field and send keys (input values)
        driver.findElement(By.xpath("(//textarea[@id='editor'])[1]")).sendKeys("Value 1\n update new file to text");  
        Thread.sleep(2000);
     // Locate and click the "Save" button
        driver.findElement(By.xpath("(//img[@alt='save'])[3]")).click();
        Thread.sleep(2000);
     // Locate and click the "CHECKBOXES" button
        driver.findElement(By.xpath("(//input[@name='redFlag'])[5]")).click();
        
        
        /*Process Thinking-2*/
        Thread.sleep(2500);
      // Locate and click the "Edit" button
        driver.findElement(By.xpath("(//img[@alt='save'])[4]")).click();
        Thread.sleep(2000);
      // Locate the input field and send keys (input values)
        driver.findElement(By.xpath("(//textarea[@id='editor'])[1]")).sendKeys("Value 1\n update new file to text");  
        Thread.sleep(2000);
     // Locate and click the "Save" button
        driver.findElement(By.xpath("(//img[@alt='save'])[4]")).click();
        Thread.sleep(2000);
     // Locate and click the "CHECKBOXES" button 
        driver.findElement(By.xpath("(//input[@name='redFlag'])[6]")).click();
    
        
        }    
    }
  
    
        
       
	    
      
    
    
  

