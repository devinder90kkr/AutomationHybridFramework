/*https://chat.openai.com/share/780888bc-02e7-4970-81eb-9dfd2f5b22d6*/

package cuesz.membersummary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz01schdulemaster.Step01_Login;

public class Case31_MS_Avtarclick extends Step01_Login {

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

        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='member-items']")).click();
      
        // Find the avatar element and click on it
        WebElement avatar = driver.findElement(By.xpath("//img[@alt='human-avatar']"));
        avatar.click();

        // Wait for the popup to appear
        // Add an appropriate wait here if needed

        // Verify popup data
        WebElement popupData = driver.findElement(By.xpath("//div[@class='member_sum_upload']"));
        System.out.println(popupData.getText());

                 
        }    
    }
  
    
        
       
	    
      
    
    
  

