package constant;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    

    // click element by using OR method
    public void clickElementUsingOr(By... locators) {
        if (locators.length == 0) {
            throw new IllegalArgumentException("At least one locator must be provided.");
        }

        // Construct the combined XPath using OR condition
        StringBuilder combinedXpath = new StringBuilder();
        for (By locator : locators) {
            String xpath = locator.toString().replaceFirst("By.xpath: ", "");
            if (combinedXpath.length() > 0) {
                combinedXpath.append(" | ");
            }
            combinedXpath.append(xpath);
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            // Wait for the element to be visible and then click it
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(combinedXpath.toString())));
            element.click();
        } catch (Exception e) {
            throw new RuntimeException("None of the provided locators found the element.");
        }
    }

    
//    // Enter text into a WebElement
//    public void sendKeysToElement(By locator, String text) {
//        WebElement element = driver.findElement(locator);
//        element.clear();
//        element.sendKeys(text);
//    }
    

 // Modified method to handle both String and String[] inputs
    public void sendKeysToElement(By locator, Object text) {
        WebElement element = driver.findElement(locator);
        element.clear();

        if (text instanceof String) {
            element.sendKeys((String) text);
        } else if (text instanceof String[]) {
            for (String t : (String[]) text) {
                element.clear();
                element.sendKeys(t);
                // Optional: Add a small pause to simulate user typing
                try {
                    Thread.sleep(500); // 500ms pause
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            throw new IllegalArgumentException("Unsupported data type. Only String and String[] are supported.");
        }
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
    
    // Generate a unique template name
    public String generateUniqueTemplateName(String baseName) {
        return baseName + "_" + UUID.randomUUID().toString();
    }
    
    // Generate a unique template name
    public String generateUniqueTemplateName1(String baseName) {
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        int randomNumber = new Random().nextInt(1000); // Generate a random number between 0 and 999
        return baseName + "_" + timestamp + "_" + randomNumber;
    }
    
    
 // General method to move to an element, click, send keys, and press enter
    public void performActionsOnElement(By locator, String text) throws InterruptedException {
        WebElement element = driver.findElement(locator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().sendKeys(text).sendKeys(Keys.ENTER).perform();
        Thread.sleep(2500);
    }
    
    public void setRichTextEditorValue(By locator, String value) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].innerHTML = arguments[1];", element, value);
    }

 // In ElementActions class
    public void assertHeadingText(By locator, String expectedText) {
        WebElement element = driver.findElement(locator);
        String actualText = element.getText();
        if (!actualText.equals(expectedText)) {
            throw new AssertionError("Expected heading: " + expectedText + " but found: " + actualText);
        }
    }
    
    
}