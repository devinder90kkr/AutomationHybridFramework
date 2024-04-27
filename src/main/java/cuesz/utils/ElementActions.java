package cuesz.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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