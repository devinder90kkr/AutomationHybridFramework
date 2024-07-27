/*https://chat.openai.com/share/c262f25b-bab9-4b0a-ae68-6065478296aa*/
package cuesz.membersummary;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import cuesz.date.functions.Currentdategenerator;
import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;

public class Case78_MS_uplaodperformancesummary extends BasePage {
	 public static String eventDate = Currentdategenerator.generateCurrentDate(); // Use the generated date
	
	SeleniumUtils utils = new SeleniumUtils(driver);
	private By uplodBttn = (By.id("MemberSummary-Avatar-PerformanceSummary"));
	private By Date = (By.id("MemberSummary-Avatar-PerformanceSummaryModal-DatePicker"));
	private By frntUploadBttn = (By.id("MemberSummary-Avatar-PerformanceSummaryModal-PerformanceSummary"));
	private By submit			= (By.id("MemberSummary-Avatar-PerformanceSummaryModal-Submit"));
	
	
  

    public Case78_MS_uplaodperformancesummary(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Test
    public void uplaodtonnage_Physiological() throws InterruptedException {
        Thread.sleep(2000);

        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();
       
     // Find and click on the "Upload Posture" button
        WebElement uploadButton = driver.findElement(uplodBttn);
        uploadButton.click();

        
       
        Thread.sleep(2000);
	    WebElement datefield = driver.findElement(Date);
	    Actions builder1 = new Actions(driver);
	    builder1.moveToElement(datefield).click().sendKeys(eventDate).sendKeys(Keys.ENTER).perform();
        
        Thread.sleep(3000);
        // Find and upload the front posture
        WebElement frontUploadButton = driver.findElement(frntUploadBttn);
        frontUploadButton.sendKeys("/Users/chicmic/git/Cuesz_AutomationTests/Uploadtonnage-Physiologicaldata/Tonnage.png"); // Replace with the actual file path

    

        
        Thread.sleep(8000);
        WebElement Submitbutton = driver.findElement(submit);
        Submitbutton.click();
                 
        Thread.sleep(4500);
        }    
    }
  
    
        
       
	    
      
    
    
  

