package cuesz.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage extends BasePage {
	
	private By emailInput = By.name("email");
    private By passwordInput = By.name("password");
    private By loginButton = By.xpath("//button[normalize-space()='Login']");

    public Loginpage(WebDriver driver) {
        super(driver);
    }

    public void login(String email, String password) {
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).click();
    
        // Wait for the notification to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        By staffrole = By.xpath("//span[@class='text-mute']");
        WebElement verifyrole = wait.until(ExpectedConditions.presenceOfElementLocated(staffrole));

        // Capture the text of the notification
        String staffText = verifyrole.getText();
        System.out.println("Staff role is: " + staffText);
    
    
    }
}
	

