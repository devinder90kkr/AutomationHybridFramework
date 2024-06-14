package cuesz.logicpage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;
import cuesz.utils.web.ElementActions;
import cuesz.utils.web.weblocators;

public class Case35_MSL_MemberWilingnessLimitationScore extends BasePage {
	
	SeleniumUtils utils = new SeleniumUtils(driver);
	private ElementActions elementActions;
	 public Case35_MSL_MemberWilingnessLimitationScore(WebDriver driver) {
		super(driver);
		this.elementActions = new ElementActions(driver); // Initialize elementActions
		// TODO Auto-generated constructor stub
	}
	@Test
	    public void Basicinfo2() throws InterruptedException {
	        Thread.sleep(2000);
	        utils.clickMembersummary();
	        utils.waitForMilliseconds(2000);
	        utils.enterSearchText();
	        utils.clickMembername();

   		   /***************************************************************************************************************************************************/
	        Thread.sleep(2000);
	        elementActions.clickElement(weblocators.logicbttn);     
	       
	        Thread.sleep(2000);
	     // Locate the element that contains the heading "Logic Page"
	        WebElement logicHeadingElement = driver.findElement(weblocators.lgicHeadngElment);
	        // Check if the element is displayed or not
	        if (logicHeadingElement.isDisplayed()) {
	            System.out.println("Logic page heading is displayed.");
	        } else {
	            System.out.println("Logic page heading is not displayed.");
	        }
	        
	        Thread.sleep(2000);
	    
	        /***************************************************************************************************************************************************/
	        // Find the Willingness label element
	        WebElement labelElement = driver.findElement(weblocators.lablElment);

	        // Extract the name for the label
	        String labelName = labelElement.getText();

	        // Print the label name
	        System.out.println("Label Name: " + labelName);

	        // Find the image element inside the label
	        WebElement imageElement = labelElement.findElement(By.tagName("img"));

	        // Get the image source
	        String imageSrc = imageElement.getAttribute("src");

	        // Check if the image link is valid (not a broken link)
	        boolean isBrokenImage = false;
	        try {
	            URL url = new URL(imageSrc);
	            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
	            httpURLConnection.setRequestMethod("HEAD");
	            int statusCode = httpURLConnection.getResponseCode();
	            if (statusCode != HttpURLConnection.HTTP_OK) {
	                isBrokenImage = true;
	                System.out.println("The image link is broken.");
	            }
	        } catch (IOException e) {
	            isBrokenImage = true;
	            System.out.println("The image link is broken.");
	        }

	        if (!isBrokenImage) {
	            System.out.println("The image link is valid.");
	        }

	        
	    /*Dots need to click*/    
	        
	     // Find the container div for dots
	        WebElement dotsContainer = driver.findElement(weblocators.dotCntaner);

	        // Find all the dots within the container
	        java.util.List<WebElement> dots = dotsContainer.findElements(By.className("dots"));

	        // Loop through each dot and click on it
	        for (WebElement dot : dots) {
	            dot.click();

	            // Extract the color of the clicked dot
	            String color = dot.getAttribute("class");

	            // Print the color of the dot
	            System.out.println("Dot Color: " + color);
	        }
	        
	        Thread.sleep(500);
	     
	  /*Popup related things start*/
	        
	     // Find the button element
	        elementActions.clickElement(weblocators.bttn1); 

	        

	        // Verify if the popup is open
	        WebElement popupHeadingElement = driver.findElement(weblocators.popHedngelmnt);
	        if (popupHeadingElement.isDisplayed()) {
	            System.out.println("Popup is open.");
	        } else {
	            System.out.println("Popup is not open.");
	        }

	    
	        // Find the text area inside the popup
	        WebElement textArea = driver.findElement(weblocators.txtara);
	
	        // Clear existing text (if any)
	        textArea.clear();

	        // Input new text
	        String newText = "Hello we automate things by using selenium tools.";
	    
	        textArea.sendKeys(newText);
	        
	        // Find the "Save Note" button and click it
	        elementActions.clickElement(weblocators.saveBttn); 

	        // Wait for a short time to allow the save operation to complete (you may need to adjust the wait time)
	        try {
	            Thread.sleep(2000); // Wait for 2 seconds (you may need to adjust this time)
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        
	        Thread.sleep(500);
	        
	    /***************************************************************************************************************************************************/            

	        
	     // Find the Limitation label element
	        WebElement LimitationlabelElement = driver.findElement(weblocators.LimitlablElment);
	        // Extract the label text
	        String labelText = LimitationlabelElement.getText();
	        // Print the label text
	        System.out.println("Label Text: " + labelText);
	        // Find the image element inside the label
	        WebElement imageElement2 = LimitationlabelElement.findElement(weblocators.ttimag);
	        // Get the image source
	        String imageSrc2 = imageElement2.getAttribute("src");
	        // Check if the image link is valid (not a broken link)
	        boolean isBrokenImage2 = false;
	        try {
	            URL url = new URL(imageSrc2);
	            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
	            httpURLConnection.setRequestMethod("HEAD");
	            int statusCode = httpURLConnection.getResponseCode();
	            if (statusCode != HttpURLConnection.HTTP_OK) {
	                isBrokenImage2 = true;
	                System.out.println("The image link is broken.");
	            }
	        } catch (IOException e) {
	            isBrokenImage2 = true;
	            System.out.println("The image link is broken.");
	        }
	        if (!isBrokenImage2) {
	            System.out.println("The image link is valid.");
	        }

     /*Dots realted this start*/
	        
	     // Find all the dots within the container
	        java.util.List<WebElement> dots1 = driver.findElements(weblocators.stusdotbg);
	        // Loop through each dot and click on it
	        for (WebElement dot1 : dots1) {
	            dot1.click();

	            // Extract the color of the clicked dot
	            String color = dot1.getAttribute("class");
	            if (color.contains("green")) {
	                System.out.println("Dot color is green.");
	            } else if (color.contains("default")) {
	                System.out.println("Dot color is default.");
	            } else {
	                System.out.println("Unknown dot color.");
	            }
	        }
	  
	 /*Popup begining*/       
   
	     // Find the button element
	        elementActions.clickElement(weblocators.btton1); 
	        // Verify if the popup is open
	        WebElement popupHeadingElement1 = driver.findElement(weblocators.popHeadngElement1);
	        if (popupHeadingElement1.isDisplayed()) {
	            System.out.println("Popup is open.");
	        } else {
	            System.out.println("Popup is not open.");
	        }

	    
	        // Find the text area inside the popup
	        WebElement textArea1 = driver.findElement(weblocators.textAea1);
	        // Clear existing text (if any)
	        textArea1.clear();
	        // Input new text
	        String newText1 = "Hello we automate things by using selenium tools.";
	        textArea1.sendKeys(newText1);
	        
	        // Find the "Save Note" button and click it
	        elementActions.clickElement(weblocators.saveBttn1); 
	        // Wait for a short time to allow the save operation to complete (you may need to adjust the wait time)
	        try {
	            Thread.sleep(2000); // Wait for 2 seconds (you may need to adjust this time)
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        Thread.sleep(1000);	        
	 }
}
 

