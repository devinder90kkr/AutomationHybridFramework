/*https://chat.openai.com/share/780888bc-02e7-4970-81eb-9dfd2f5b22d6*/

package cuesz.membersummary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;

public class Case31_MS_Avtarclick extends BasePage {
	
	SeleniumUtils utils = new SeleniumUtils(driver);
	private By avtar = (By.id("MemberSummary-Avatar"));
	private By popData = (By.xpath("//div[@class='member_sum_upload']"));
	

    public Case31_MS_Avtarclick(WebDriver driver) {
		super(driver);
	}

    @Test
    public void Avatarclick() throws InterruptedException {
        Thread.sleep(2000);

        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();
      
        // Find the avatar element and click on it
        WebElement avatar = driver.findElement(avtar);
        avatar.click();

        // Wait for the popup to appear
        // Add an appropriate wait here if needed

        // Verify popup data
        WebElement popupData = driver.findElement(popData);
        System.out.println(popupData.getText());
        
        WebElement dropdown = driver.findElement(By.id("-Dropdown"));
        dropdown.click();
        

                 
        }    
    }
  
    
        
       
	    
      
    
    
  

