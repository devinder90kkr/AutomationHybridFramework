package cuesz.membersummary.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



import cuesz.pages.BasePage;

public class Case16_MS_searchclick extends BasePage {

    public Case16_MS_searchclick(WebDriver driver) {
		super(driver);
		
	}
    @Test
    public void MemberSummary() throws InterruptedException {
        Thread.sleep(2000);

        // Click on the Member Summary button or link
        driver.findElement(By.xpath("//img[@alt='Member Summary']")).click();

        // Enter the name in the search field
        driver.findElement(By.xpath("//input[@placeholder='Search Members']"))
                .sendKeys("Kumar Devinder");
     
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='member-items']")).click();
          
   

    }
}	
