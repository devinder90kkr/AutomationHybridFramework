package cuesz.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
    }
}
	

