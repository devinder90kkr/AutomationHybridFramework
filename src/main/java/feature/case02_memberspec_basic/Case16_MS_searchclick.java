package feature.case02_memberspec_basic;    

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import base.BasePage;
import utils.SeleniumUtils;

public class Case16_MS_searchclick extends BasePage {
    SeleniumUtils utils = new SeleniumUtils(driver);

    public Case16_MS_searchclick(WebDriver driver) {
		super(driver);
		
	}
    @Test
    public void MemberSummary() throws InterruptedException {
        Thread.sleep(2000);

        // Click on the Member Summary button or link
        driver.findElement(By.xpath("//img[@alt='Member Summary']")).click();
        utils.enterSearchText();
        utils.clickMembername();
          
   

    }
}	
