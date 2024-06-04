package cuesz.utils.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ElementActions {

    private WebDriver driver;

    public ElementActions(WebDriver driver) {
        this.driver = driver;
    }

    // Click on a WebElement
    public void clickElement(By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }

    // Enter text into a WebElement
    public void sendKeysToElement(By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.clear();
        element.sendKeys(text);
    }
    
    // Get text from popup
    public String getTextFromPopup(By headingLocator, By contentLocator) {
        StringBuilder popupText = new StringBuilder();

        String headingText = driver.findElement(headingLocator).getText();
        popupText.append("Heading: ").append(headingText).append("\n");

        String contentText = driver.findElement(contentLocator).getText();
        popupText.append("Content: ").append(contentText);

        return popupText.toString();
    }
   // Get text from popup with heading locator only
    public String getTextFromPopup(By headingLocator) {
        StringBuilder popupText = new StringBuilder();

        String headingText = driver.findElement(headingLocator).getText();
        popupText.append("Heading: ").append(headingText);

        return popupText.toString();
    }

    public void selectValueFromPicker(By timePickerLocator, String time) throws InterruptedException {
        WebElement timePicker = driver.findElement(timePickerLocator);
        Actions builder = new Actions(driver);
        // Click on the time picker to activate it
        builder.moveToElement(timePicker).click().perform();
        Thread.sleep(1000); // Add a short delay to ensure the time picker is fully activated

        // Enter the time
        builder.sendKeys(time).perform();
        Thread.sleep(1000); // Add a short delay to ensure the time is entered

        // Press the down arrow to select the first suggestion (if applicable)
        builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
    }

        
    // Check if an element is displayed
    public boolean isElementDisplayed(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            return element.isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
}