/*https://chat.openai.com/share/c262f25b-bab9-4b0a-ae68-6065478296aa*/
package feature.case05_memberspecs_avtar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BasePage;
import utils.SeleniumUtils;

public class Case77_MS_uplaodtonnage_Physiological extends BasePage {
	
	SeleniumUtils utils = new SeleniumUtils(driver);
	private By uplodBttn = (By.id("MemberSummary-Avatar-UploadTonnage/PhysiologicalData"));

	private By frntUploadBttn = (By.id("MemberSummary-Avatar-TonnagePhysiological-tonnage"));
	private By sidLftUpladBttn = (By.id("MemberSummary-Avatar-TonnagePhysiological-physiological"));
	private By submit			= (By.id("MemberSummary-Avatar-TonnagePhysiological-Submit"));
	
  

    public Case77_MS_uplaodtonnage_Physiological(WebDriver driver) {
		super(driver);
		
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

        
        Thread.sleep(3000);
        // Find and upload the front posture
        WebElement frontUploadButton = driver.findElement(frntUploadBttn);
        frontUploadButton.sendKeys("/Users/chicmic/git/Cuesz_AutomationTests/Uploadtonnage-Physiologicaldata/Tonnage.png"); // Replace with the actual file path

     // Upload the side left posture
        WebElement sideLeftUploadButton = driver.findElement(sidLftUpladBttn);
        sideLeftUploadButton.sendKeys("/Users/chicmic/git/Cuesz_AutomationTests/Uploadtonnage-Physiologicaldata/Physiological.png"); // Replace with the actual file path

        
        Thread.sleep(8000);
        WebElement Submitbutton = driver.findElement(submit);
        Submitbutton.click();
                 
        Thread.sleep(4500);
        }    
    }
  
    
        
       
	    
      
    
    
  

