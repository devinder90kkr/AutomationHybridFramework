package cuesz.utils;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;

public class RetryUtils {
    public static void retryingFindClick(AppiumDriver driver, By by, int attempts) {
        int currentAttempt = 0;
        while (currentAttempt < attempts) {
            try {
                WebElement element = driver.findElement(by);
                element.click();
                break;
            } catch (StaleElementReferenceException e) {
                currentAttempt++;
                if (currentAttempt == attempts) {
                    throw e;
                }
            }
        }
    }

    public static void retryingSendKeys(AppiumDriver driver, By by, String text, int attempts) {
        int currentAttempt = 0;
        while (currentAttempt < attempts) {
            try {
                WebElement element = driver.findElement(by);
                element.sendKeys(text);
                break;
            } catch (StaleElementReferenceException e) {
                currentAttempt++;
                if (currentAttempt == attempts) {
                    throw e;
                }
            }
        }
    }
}
