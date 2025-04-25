/*https://chat.openai.com/share/c262f25b-bab9-4b0a-ae68-6065478296aa*/
package feature.case05_memberspecs_avtar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BasePage;
import utils.SeleniumUtils;

public class Case33_MS_Uploadposture extends BasePage {
	
	SeleniumUtils utils = new SeleniumUtils(driver);
	private By uplodBttn = (By.xpath("//span[text()='Upload Posture']"));
	private By FrntHedng	=	(By.xpath("//label[normalize-space()='Front']"));
	private By popTitle = (By.xpath("//div[@class='title_h4']//h4"));
	private By bodFat = (By.xpath("//div[@class='bmi_block']//div[@class='bmi_col'][1]//h4"));
	private By viscalFat = (By.xpath("//div[@class='bmi_block']//div[@class='bmi_col'][2]//h4"));
	private By frntUploadBttn = (By.xpath("//div[@class='file_up_col'][1]//input[@type='file']"));
	private By sidLftUpladBttn = (By.xpath("(//div[@role='button'])[2]//input[@type='file']"));
	private By sidrightUpldBttn = (By.xpath("(//div[@role='button'])[3]//input[@type='file']"));
	private By backUloadBttn = (By.xpath("(//div[@role='button'])[4]//input[@type='file']"));
	private By Sumitbttn = (By.xpath("//button[normalize-space()='Submit']"));
  

    public Case33_MS_Uploadposture(WebDriver driver) {
		super(driver);
		
	}

	@Test
    public void uploadposture() throws InterruptedException {
        Thread.sleep(2000);

        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();
       
     // Find and click on the "Upload Posture" button
        WebElement uploadButton = driver.findElement(uplodBttn);
        uploadButton.click();

        // Find the heading elements for the four spheres
        WebElement FrontHeading = driver.findElement(FrntHedng);
        
        // Scroll to the "4 Spheres" feature
        Actions actions = new Actions(driver);
        actions.moveToElement(FrontHeading);
        actions.perform();
        // Alternatively, you can use JavaScript Executor to scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", FrontHeading);
        
        Thread.sleep(3000);
        // Wait for the popup to appear and get the data from it
        WebElement popupTitle = driver.findElement(popTitle);
        WebElement bodyFat = driver.findElement(bodFat);
        WebElement visceralFat = driver.findElement(viscalFat);
        // Add more elements here to retrieve the desired data from the popup

        Thread.sleep(2000);
        // Print the retrieved data
        System.out.println("Popup Title: " + popupTitle.getText());
        System.out.println("Body Fat: " + bodyFat.getText());
        System.out.println("Visceral Fat: " + visceralFat.getText());
        // Print more data as needed

        Thread.sleep(3000);
        // Find and upload the front posture
        WebElement frontUploadButton = driver.findElement(frntUploadBttn);
        frontUploadButton.sendKeys("/Users/chicmic/git/Cuesz_AutomationTests/Uploadposture/Front.jpeg"); // Replace with the actual file path

     // Upload the side left posture
        WebElement sideLeftUploadButton = driver.findElement(sidLftUpladBttn);
        sideLeftUploadButton.sendKeys("/Users/chicmic/git/Cuesz_AutomationTests/Uploadposture/left.jpeg"); // Replace with the actual file path

        // Upload the side right posture
        WebElement sideRightUploadButton = driver.findElement(sidrightUpldBttn);
        sideRightUploadButton.sendKeys("/Users/chicmic/git/Cuesz_AutomationTests/Uploadposture/Right.jpeg"); // Replace with the actual file path

        // Upload the back posture
        WebElement backUploadButton = driver.findElement(backUloadBttn);
        backUploadButton.sendKeys("/Users/chicmic/git/Cuesz_AutomationTests/Uploadposture/back.jpeg"); // Replace with the actual file path

     
        
        //Thread.sleep(15000);
     // Wait for the submit button's color to change
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100)); // Adjust the timeout as needed
        wait.until(ExpectedConditions.attributeContains(Sumitbttn, "style", "#ff620a"));

        // Execute JavaScript to click the button
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(Sumitbttn));
    }
}
    
        
       
	    
      
    
    
  

