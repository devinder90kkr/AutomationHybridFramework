
/*https://chat.openai.com/share/c262f25b-bab9-4b0a-ae68-6065478296aa*/
package cuesz.membersummary;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz01schdulemaster.Step01_Login;

public class Case33_MS_Uploadposture extends Step01_Login {

    @BeforeClass
    public void setUpChildClass() {
        setUp();
    }

    @Test(dependsOnMethods = "Login")
    public void uploadposture() throws InterruptedException {
        Thread.sleep(2000);

        // Click on the Member Summary button or link
        driver.findElement(By.xpath("//img[@alt='Member Summary']")).click();

        // Enter the name in the search field
        driver.findElement(By.xpath("//input[@placeholder='Search Members']"))
                .sendKeys("Kumar Devinder");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='member-items']")).click();
       
     // Find and click on the "Upload Posture" button
        WebElement uploadButton = driver.findElement(By.xpath("//span[text()='Upload Posture']"));
        uploadButton.click();

        // Find the heading elements for the four spheres
        WebElement FrontHeading = driver.findElement(By.xpath("//label[normalize-space()='Front']"));
        
        // Scroll to the "4 Spheres" feature
        Actions actions = new Actions(driver);
        actions.moveToElement(FrontHeading);
        actions.perform();
        // Alternatively, you can use JavaScript Executor to scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", FrontHeading);
        
        Thread.sleep(3000);
        // Wait for the popup to appear and get the data from it
        WebElement popupTitle = driver.findElement(By.xpath("//div[@class='title_h4']//h4"));
        WebElement bodyFat = driver.findElement(By.xpath("//div[@class='bmi_block']//div[@class='bmi_col'][1]//h4"));
        WebElement visceralFat = driver.findElement(By.xpath("//div[@class='bmi_block']//div[@class='bmi_col'][2]//h4"));
        // Add more elements here to retrieve the desired data from the popup

        Thread.sleep(2000);
        // Print the retrieved data
        System.out.println("Popup Title: " + popupTitle.getText());
        System.out.println("Body Fat: " + bodyFat.getText());
        System.out.println("Visceral Fat: " + visceralFat.getText());
        // Print more data as needed

        Thread.sleep(3000);
        // Find and upload the front posture
        WebElement frontUploadButton = driver.findElement(By.xpath("//div[@class='file_up_col'][1]//input[@type='file']"));
        frontUploadButton.sendKeys("/Users/Quality/Desktop/Devinderposture/Front.jpg"); // Replace with the actual file path

     // Upload the side left posture
        WebElement sideLeftUploadButton = driver.findElement(By.xpath("(//div[@role='button'])[2]//input[@type='file']"));
        sideLeftUploadButton.sendKeys("/Users/Quality/Desktop/Devinderposture/Left.jpg"); // Replace with the actual file path

        // Upload the side right posture
        WebElement sideRightUploadButton = driver.findElement(By.xpath("(//div[@role='button'])[3]//input[@type='file']"));
        sideRightUploadButton.sendKeys("/Users/Quality/Desktop/Devinderposture/Right.jpg"); // Replace with the actual file path

        // Upload the back posture
        WebElement backUploadButton = driver.findElement(By.xpath("(//div[@role='button'])[4]//input[@type='file']"));
        backUploadButton.sendKeys("/Users/Quality/Desktop/Devinderposture/Back.jpg"); // Replace with the actual file path

        Thread.sleep(5000);
        WebElement Submitbutton = driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
        Submitbutton.click();
                 
        }    
    }
  
    
        
       
	    
      
    
    
  

