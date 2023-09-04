 /*https://chat.openai.com/share/fb99a8d3-9b88-4b49-8555-3f5eab0b24e5 */
package cuesz.membersummary;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;

public class Case25_MS_Mindfulsetting extends BasePage {
	
	SeleniumUtils utils = new SeleniumUtils(driver);
	private By prfrmHeadng = (By.xpath("//h2[contains(text(), 'Mindful')]"));
	private By setingmindfu	= (By.xpath("//div[@id='MindFulData']//div[@class='d-flex justify-content-between align-item-center']//em"));
	private By modlpup	= (By.xpath("//div[@class='modal-content']"));
	private By vibratTsogle	= (By.name("Vibration"));
	private By guidTogle	= (By.name("Sound"));
	private By guidAudioTogle	= (By.name("Breathe Sounds"));
	private By durton	= (By.xpath("//div[@id='modal']/div/div/div/div/div/div/div[4]/div/div/div/div"));
	private By timinput	=	(By.xpath("//div[@class='react-datepicker__input-container']//input"));
	private By radobttncontir	= (By.xpath("//div[@class='ratio_btns']"));
	private By heding	= (By.xpath("//h2[@class='mb-4']"));
	private By inptFild	= (By.className("mindful_select"));
	private By endtme1	= (By.xpath("//input[contains(@placeholder,'DD-MM-YYYY')]"));
	private By submbttn	=	(By.xpath("//span[normalize-space()='Submit']"));


    public Case25_MS_Mindfulsetting(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

    @Test
    public void mindfulactivity() throws InterruptedException {
        Thread.sleep(2000);
        
        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();
        
        // Scroll to the "Team Leader Coach Notes" heading
       
        Thread.sleep(5000);
        String headingText = "Mindful";
        String xpathExpression = "//h2[contains(text(), '" + headingText + "')]";
        By headingLocator = By.xpath(xpathExpression);
        // Scroll to the heading using JavaScriptExecutor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(headingLocator));        
        
        Thread.sleep(2500);
     // Find the element for the perform heading
        WebElement performHeading = driver.findElement(prfrmHeadng);

        // Validate the heading for perform
        if (performHeading.isDisplayed()) {
            System.out.println("Heading for Mindful is verified.");
        } else {
            System.out.println("Heading for Mindful is not found.");
        }

        Thread.sleep(2500);
        WebElement settingmindful = driver.findElement(setingmindfu);
        settingmindful.click();
        
        Thread.sleep(1000);
        
     // Wait for the modal popup to be present in the DOM and visible
        WebElement modalElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(modlpup));

        // Verification: If the modal popup is present and visible, it's considered open
        if (modalElement.isDisplayed()) {
            System.out.println("Modal Popup is open.");
        } else {
            System.out.println("Modal Popup is not open.");
        }
        
        Thread.sleep(2500);
     // Find and enable the "Vibrations" toggle
        WebElement vibrationsToggle =   driver.findElement(vibratTsogle);
        vibrationsToggle.click();

        Thread.sleep(2500);
     // Find the "Guided" toggle
     WebElement guidedToggle = driver.findElement(guidTogle);

     // Check if the "Guided" toggle is enabled
     if (guidedToggle.isSelected()) {
         // Find and enable the "Guided Audio" toggle
         WebElement guidedAudioToggle = driver.findElement(guidAudioTogle);
         guidedAudioToggle.click();
         Thread.sleep(2500);
     } else {
         System.out.println("Cannot enable Guided Audio toggle as Guided toggle is not active.");
     }

     	Thread.sleep(2500);
      WebElement Duration = driver.findElement(durton);
      Actions builder = new Actions(driver);
      builder.moveToElement(Duration).click().sendKeys("8 Minutes").perform();
      Thread.sleep(2000);
      builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
      
      Thread.sleep(2500);
      // Locate the input field by its XPath
      WebElement timeInput = driver.findElement(timinput);
      // Clear the existing value (optional, if needed)
      timeInput.clear();
      // Set the desired time value using sendKeys()
      timeInput.sendKeys("05:25 AM");
      Thread.sleep(2000);
      
   // Locate the parent element that contains all the radio buttons by its XPath
      WebElement radioButtonsContainer = driver.findElement(radobttncontir);
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
      	List<WebElement> headings = driver.findElements(heding);
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
      	WebElement inputField = driver.findElement(inptFild);
      	// Get the value attribute of the input field
      	String value = inputField.getAttribute("value");
      	// Print the value of the input field
      	System.out.println("Input field value: " + value);
     
      
	    Thread.sleep(2000);
	    WebElement endTime1 =driver.findElement(endtme1);
	    Actions builder1 = new Actions(driver);
	    builder1.moveToElement(endTime1).click().sendKeys("10-08-2023").sendKeys(Keys.ENTER).perform();;


	    WebElement submitbutton = driver.findElement(submbttn);
	    submitbutton.click();
	   
      
    }
}           
    
  