 /*https://chat.openai.com/share/fb99a8d3-9b88-4b49-8555-3f5eab0b24e5 */
package cuesz.membersummary;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz01schdulemaster.Step01_Login;

public class Case25_MS_Mindfulsetting extends Step01_Login {

    @BeforeClass
    public void setUpChildClass() {
        setUp();
    }

    @Test(dependsOnMethods = "Login")
    public void mindfulactivity() throws InterruptedException {
        Thread.sleep(2000);

        // Click on the Member Summary button or link
        driver.findElement(By.xpath("//img[@alt='Member Summary']")).click();

        // Enter the name in the search field
        driver.findElement(By.xpath("//input[@placeholder='Search Members']"))
                .sendKeys("Kumar Devinder");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='member-items']")).click();
        // Scroll to the "Team Leader Coach Notes" heading
       
        Thread.sleep(5000);
        String headingText = "Mindful";
        String xpathExpression = "//h2[contains(text(), '" + headingText + "')]";
        By headingLocator = By.xpath(xpathExpression);
        // Scroll to the heading using JavaScriptExecutor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(headingLocator));        
        
        Thread.sleep(2500);
     // Find the element for the perform heading
        WebElement performHeading = driver.findElement(By.xpath("//h2[contains(text(), 'Mindful')]"));

        // Validate the heading for perform
        if (performHeading.isDisplayed()) {
            System.out.println("Heading for Mindful is verified.");
        } else {
            System.out.println("Heading for Mindful is not found.");
        }

        Thread.sleep(2500);
        WebElement settingmindful = driver.findElement(By.xpath("//div[@id='MindFulData']//div[@class='d-flex justify-content-between align-item-center']//em"));
        settingmindful.click();
        
        Thread.sleep(1000);
        
     // Wait for the modal popup to be present in the DOM and visible
        WebElement modalElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-content']")));

        // Verification: If the modal popup is present and visible, it's considered open
        if (modalElement.isDisplayed()) {
            System.out.println("Modal Popup is open.");
        } else {
            System.out.println("Modal Popup is not open.");
        }
        
        Thread.sleep(2500);
     // Find and enable the "Vibrations" toggle
        WebElement vibrationsToggle =   driver.findElement(By.name("Vibration"));
        vibrationsToggle.click();

        Thread.sleep(2500);
     // Find the "Guided" toggle
     WebElement guidedToggle = driver.findElement(By.name("Sound"));

     // Check if the "Guided" toggle is enabled
     if (guidedToggle.isSelected()) {
         // Find and enable the "Guided Audio" toggle
         WebElement guidedAudioToggle = driver.findElement(By.name("Breathe Sounds"));
         guidedAudioToggle.click();
         Thread.sleep(2500);
     } else {
         System.out.println("Cannot enable Guided Audio toggle as Guided toggle is not active.");
     }

     	Thread.sleep(2500);
      WebElement Duration = driver.findElement(By.xpath("//div[@id='modal']/div/div/div/div/div/div/div[4]/div/div/div/div"));
      Actions builder = new Actions(driver);
      builder.moveToElement(Duration).click().sendKeys("8 Minutes").perform();
      Thread.sleep(2000);
      builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
      
      Thread.sleep(2500);
      // Locate the input field by its XPath
      WebElement timeInput = driver.findElement(By.xpath("//div[@class='react-datepicker__input-container']//input"));
      // Clear the existing value (optional, if needed)
      timeInput.clear();
      // Set the desired time value using sendKeys()
      timeInput.sendKeys("05:25 AM");
      Thread.sleep(2000);
      
   // Locate the parent element that contains all the radio buttons by its XPath
      WebElement radioButtonsContainer = driver.findElement(By.xpath("//div[@class='ratio_btns']"));
      // Find all the radio buttons within the parent element
      List<WebElement> radioButtons = radioButtonsContainer.findElements(By.tagName("button"));
      // Loop through each radio button and click on it
      for (WebElement radioButton : radioButtons) {
          radioButton.click();
          // Get the text of the clicked button
          String buttonText = radioButton.getText();
          // If the button text matches "40:60", select it and break the loop
          if (buttonText.trim().equals("40:60")) {
              System.out.println("Selected: " + buttonText);
              break;
          }
      }

      // Locate the headings by their XPath
      	List<WebElement> headings = driver.findElements(By.xpath("//h2[@class='mb-4']"));
      	// Get the text of each heading and verify it
      	for (WebElement heading : headings) {
          String headingText1 = heading.getText();
          if (headingText1.equals("Breathing Frequency Next Scan Date")) {
              System.out.println("Heading Verified: " + headingText1);
          } else {
              System.out.println("Heading Not Verified: " + headingText1);
          }
      }
            
      	// Locate the input field by its class name
      	WebElement inputField = driver.findElement(By.className("mindful_select"));
      	// Get the value attribute of the input field
      	String value = inputField.getAttribute("value");
      	// Print the value of the input field
      	System.out.println("Input field value: " + value);
     
      
	    Thread.sleep(2000);
	    WebElement endTime1 =driver.findElement(By.xpath("//input[contains(@placeholder,'DD-MM-YYYY')]"));
	    Actions builder1 = new Actions(driver);
	    builder1.moveToElement(endTime1).click().sendKeys("10-08-2023").sendKeys(Keys.ENTER).perform();;


	    WebElement submitbutton = driver.findElement(By.xpath("//span[normalize-space()='Submit']"));
	    submitbutton.click();
	   
      
    }
}           
    
  