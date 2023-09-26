package cuesz.Iosapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import io.appium.java_client.AppiumBy;

public class Case04_Homescreen_weekdays_past extends AppiummobileBase {

	
	@Test
	public void Homescreen_weekdays() throws InterruptedException
	{	

		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");
		
		
		WebElement Homeicon = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]"));
		Homeicon.click();
		
		
		// Get the current day of the week (0 for Sunday, 1 for Monday, ..., 6 for Saturday)
        int currentDayIndex = java.time.LocalDate.now().getDayOfWeek().getValue() % 7;

        // Define the day labels in an array (assuming Sunday is 0, Saturday is 6)
        String[] dayLabels = {"Sun", "Sat", "Fri", "Thu", "Wed", "Tue", "Mon"};

        // Loop through the days from Tuesday to Sunday
        for (int i = currentDayIndex - 2; i >= 0; i--) {
            // Construct the XPath expression dynamically based on the current day
            String dayLabel = dayLabels[i];
            String xpathExpression = String.format("**/XCUIElementTypeOther[`label == \"%s\"`][2]", dayLabel);

            // Print debugging information
            System.out.println("XPath Expression: " + xpathExpression);

            // Find the element
            WebElement dayElement = driver.findElement(AppiumBy.iOSClassChain(xpathExpression));
            
            // Print the label of the found element for debugging
            System.out.println("Found Element Label: " + dayElement.getText());

            // Click the element
            dayElement.click();
            
            Thread.sleep(2500);
        
        
	
	}
	
}
	}

