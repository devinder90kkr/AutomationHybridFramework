package cuesz01.Iosapp_member_homeScreen;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AllureUtils;
import cuesz.utils.AppiumappUtils;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Home screen detail ")
@Feature ("Verify homescreens weekdays and its details.")

public class Case04_Homescreen_weekdays_past extends AppiummobileBase {

    private By Homeclick = AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
    
    private ByteArrayOutputStream consoleOutput; // To capture console output
	   
	@BeforeClass
	 public void setUp() {
	      
	 // Redirect console output to capture it
	 consoleOutput = new ByteArrayOutputStream();
	 PrintStream printStream = new PrintStream(consoleOutput);
	 System.setOut(printStream);
	        
	  }


	@Test

	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Verify home screen details with previous week days data.")
    @Story("Click on weeks days and verify its related data for activity.")	
    public void Homescreen_weekdays() throws InterruptedException {
        // Create an instance of AppiumUtils and pass the driver
        AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");

        // Click on home menu from the bottom
        WebElement Homeicon = driver.findElement(Homeclick);
        Homeicon.click();

        
//        // Define the day labels in an array (assuming Sunday is 0, Saturday is 6)
//        String[] dayLabels = {"Wed", "Thu", "Fri", "Sat", "Sun", "Mon", "Tue"};
        
        // Define the day labels in an array (assuming Sunday is 0, Saturday is 6)
        String[] dayLabels = { "Thu", "Fri"};

        // Loop through the elements and click the ones with the correct label
        for (String dayLabel : dayLabels) {
            try {               	
                // Construct the XPath expression for the specific day
                String xpathExpression = String.format("(//XCUIElementTypeOther[@name=\"%s\"])[2]", dayLabel);              
                // Find the element
                WebElement dayElement = driver.findElement(By.xpath(xpathExpression));

                if (dayElement != null) {
                    // Click the element
                    dayElement.click();
                
             
                    scrollDown();
             	
                      
                } else {
                    System.out.println("Day element not found: " + dayLabel);
                }
                
                
            
                scrollUp();
        		
            } catch (Exception e) {
                // Handle any exceptions
                System.out.println("Error: " + e.getMessage());
            
            
            
                Thread.sleep(2500);
                // Capture a screenshot and attach it to Allure
                   AllureUtils.captureScreenshot(driver, "Case04_Homescreen_weekdays_past");
   
            
            }
        }
    }
    
    
    
 // Function to scroll down using the provided scroll method
    private void scrollDown() {
    	// Method to scroll to perform screen
 		HashMap<String,Object>scrollObject =new HashMap<>();
 		scrollObject.put("direction", "down");
 		scrollObject.put("Fri", "Fri");
 		driver.executeScript("mobile:scroll", scrollObject);
    }
    

//Function to scroll down using the provided scroll method
private void scrollUp() {
	// Method to scroll to perform screen
		HashMap<String,Object>scrollObject =new HashMap<>();
		scrollObject.put("direction", "up");
		scrollObject.put("Fri", "Fri");
		driver.executeScript("mobile:scroll", scrollObject);
}
}

