package cuesz.pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
	
	protected WebDriver driver;

	public BasePage(WebDriver driver) {
    this.driver = driver;
}

// Common methods that can be used across different page classes
public void navigateTo(String url) {
    driver.navigate().to(url);
    
}

// Add more common methods here...
}