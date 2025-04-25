package feature.case11_logicpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import base.BasePage;
import utils.SeleniumUtils;
import web.resources.ElementActions;
import web.resources.weblocators;

public class Case34_MSL_MemberBasicinfo extends BasePage {
	SeleniumUtils utils = new SeleniumUtils(driver);
	private ElementActions elementActions;
	public Case34_MSL_MemberBasicinfo(WebDriver driver) {
		super(driver);
		this.elementActions = new ElementActions(driver); // Initialize elementActions
		
	}
	
	 @Test
	    public void Basicinfo() throws InterruptedException {
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
	     // Verify the title "Basic Information"
	        WebElement basicInfoTitle = driver.findElement(weblocators.bascInitle);
	        if (basicInfoTitle.isDisplayed()) {
	            System.out.println("Title 'Basic Information' is displayed.");
	        } else {
	            System.out.println("Title 'Basic Information' is not displayed.");
	        }

//	        // Extract the image path
//	        WebElement imageElement = driver.findElement(weblocators.imgelment);
//	        String imagePath = imageElement.getAttribute("src");
//
//	        // Check if the image path is valid (not a broken link)
//	        boolean isBrokenImage = false;
//	        try {
//	            URL url = new URL(imagePath);
//	            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
//	            httpURLConnection.setRequestMethod("HEAD");
//	            int statusCode = httpURLConnection.getResponseCode();
//	            if (statusCode != HttpURLConnection.HTTP_OK) {
//	                isBrokenImage = true;
//	                System.out.println("The image link is broken.");
//	            }
//	        } catch (IOException e) {
//	            isBrokenImage = true;
//	            System.out.println("The image link is broken.");
//	        }
//
//	        if (!isBrokenImage) {
//	            System.out.println("The image link is valid.");
//	        }
	        
	        // Find the element containing the member info
	        WebElement memberInfoElement = driver.findElement(weblocators.membrInfElmnt);
	        // Extract the member's name
	        String memberName = memberInfoElement.getText();
	        // Print the member's name
	        System.out.println("Member Name: " + memberName);

	        /***************************************************************************************************************************************************/
	        Thread.sleep(2000);
	        //Find Gym plus button
	        elementActions.clickElement(weblocators.gympls);
	       
	       try {
	            Thread.sleep(2000); // Wait for 2 seconds (you may need to adjust this time)
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Ensure the popup is open with the heading "Gym"
	        WebElement popupHeadingElement = driver.findElement(weblocators.popHeadngelment);
	        if (popupHeadingElement.isDisplayed()) {
	            System.out.println("Popup with heading 'Gym' is open.");
	        } else {	
	            System.out.println("Popup with heading 'Gym' is not open.");
	        }

//	        // Find the text area inside the popup
//	        WebElement textArea = driver.findElement(weblocators.txtara);
//	        // Check if the field already has a value
//	        String existingValue = textArea.getAttribute("value");
//	        if (!existingValue.isEmpty()) {
//	            // The field has a value, so you may choose to clear it
//	        	textArea.clear();
//	        }
//	        // Fill in new details for Gym
//	        String newDetails = webTestdata.notefield1;
//	        textArea.sendKeys(newDetails);

	        Thread.sleep(1000);
	        
	        //Find Save not button and click on it 
	        elementActions.clickElement(weblocators.Savnote);
	        
	        Thread.sleep(1500);
	        /***************************************************************************************************************************************************/
	        //Find Gym plus button
	        elementActions.clickElement(weblocators.partnrtcusz);
		       
		       try {
		            Thread.sleep(2000); // Wait for 2 seconds (you may need to adjust this time)
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }

		        // Ensure the popup is open with the heading "Gym"
		        WebElement popupHeadingElement1 = driver.findElement(weblocators.popheadngelmnt1);
		        if (popupHeadingElement1.isDisplayed()) {
		            System.out.println("Popup with heading 'Gym Partner' is open.");
		        } else {
		            System.out.println("Popup with heading 'Gym Partner' is not open.");
		        }

//		        // Find the text area inside the popup
//		        WebElement PartnertextArea = driver.findElement(weblocators.partnrtxtara);

//		        // Clear existing details
//		     //   PartnertextArea.clear();
//		        if (!PartnertextArea.getAttribute("value").isEmpty()) {
//					 // Clear existing details
//		        	PartnertextArea.clear();
//		        }
//
//		        // Fill in new details for Gym
//		        String newDetails1 = webTestdata.notefield2;
//		        PartnertextArea.sendKeys(newDetails1);

		        Thread.sleep(1000);
		        
		        //Find Save not button and click on it 
		        elementActions.clickElement(weblocators.Svaenot2);
		        Thread.sleep(1500);
		        
		    /***************************************************************************************************************************************************/
		        
	        
		        //Find Whyjoin plus button
		        elementActions.clickElement(weblocators.whjin); 
			       try {
			            Thread.sleep(2000); // Wait for 2 seconds (you may need to adjust this time)
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }

			        // Ensure the popup is open with the heading "Gym"
			        WebElement popupHeadingElement2 = driver.findElement(weblocators.popHeadngelment2);
			        if (popupHeadingElement2.isDisplayed()) {
			            System.out.println("Popup with heading 'Why join?' is open.");
			        } else {
			            System.out.println("Popup with heading 'Why join?' is not open.");
			        }

//			        // Find the text area inside the popup
//			        WebElement whyjointextArea = driver.findElement(weblocators.whyjintxtAra);
//			        if (!whyjointextArea.getAttribute("value").isEmpty()) {
//						 // Clear existing details
//			        	whyjointextArea.clear(); 
//			        	}
//			        // Fill in new details for Gym
//			        String newDetails2 = webTestdata.notefield3;
//			        whyjointextArea.sendKeys(newDetails2);

			        Thread.sleep(1000);
			        
			        //Find Save not button and click on it 
			        elementActions.clickElement(weblocators.SvaeNte3); 
			        Thread.sleep(1500);      
			  	 }
	 }
 