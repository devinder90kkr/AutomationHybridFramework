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

public class Case34_MSL_MemberBasicinfo extends BasePage {
	SeleniumUtils utils = new SeleniumUtils(driver);
	private By logicbttn =  (By.xpath("//span[normalize-space()='Logic Page']"));
	private By lgicHeadngElment = (By.xpath("//h3[text()='Logic Page']"));
	private By bascInitle = (By.xpath("//h6[text()='Basic Information']"));
	private By imgelment	=	(By.xpath("//img[@src]"));
	private By membrInfElmnt = (By.xpath("//div[@class='user_inf']/h6"));
	private By gympls = (By.xpath("//label[normalize-space()='Gym']"));
	private By popHeadngelment = (By.xpath("//label[text()='Gym']"));
	private By txtara = (By.xpath("//div[@class='input-fields']//textarea[@class='form-control'][contains(.,'Hello')]"));
	private By Savnote = (By.xpath("//button[normalize-space()='Save Note']"));
	private By partnrtcusz =(By.xpath("//label[normalize-space()='Partner at Cuesz']"));
	private By popheadngelmnt1 = (By.xpath("//label[text()='Gym Partner']"));
	private By partnrtxtara = (By.xpath("//textarea[contains(.,'New test this')]"));
	private By Svaenot2 = (By.xpath("//button[normalize-space()='Save Note']"));
	private By whjin = (By.xpath("//label[normalize-space()='Why did they join cuesz?']"));
	private By popHeadngelment2 = (By.xpath("//label[text()='Why join?']"));
	private By whyjintxtAra = (By.xpath("//textarea[normalize-space()='Lorem Are you test with automation tool']"));
	private By SvaeNte3 = (By.xpath("//button[normalize-space()='Save Note']"));
	
	
	public Case34_MSL_MemberBasicinfo(WebDriver driver) {
		super(driver);
	}
	
	 @Test
	    public void Basicinfo() throws InterruptedException {
	        Thread.sleep(2000);

	        utils.clickMembersummary();
//	        driver.navigate().refresh();
//	        utils.clickMembersummary();
	        
	        utils.waitForMilliseconds(2000);
	        utils.enterSearchText();
	        utils.clickMembername();

   		   /***************************************************************************************************************************************************/
	        Thread.sleep(2000);
	        WebElement Logicbutton =   driver.findElement(logicbttn);
	        Logicbutton.click();
	        
	        Thread.sleep(2000);
	     // Locate the element that contains the heading "Logic Page"
	        WebElement logicHeadingElement = driver.findElement(lgicHeadngElment);

	        // Check if the element is displayed or not
	        if (logicHeadingElement.isDisplayed()) {
	            System.out.println("Logic page heading is displayed.");
	        } else {
	            System.out.println("Logic page heading is not displayed.");
	        }
	        
	        Thread.sleep(2000);
	     // Verify the title "Basic Information"
	        WebElement basicInfoTitle = driver.findElement(bascInitle);
	        if (basicInfoTitle.isDisplayed()) {
	            System.out.println("Title 'Basic Information' is displayed.");
	        } else {
	            System.out.println("Title 'Basic Information' is not displayed.");
	        }

	        // Extract the image path
	        WebElement imageElement = driver.findElement(imgelment);
	        String imagePath = imageElement.getAttribute("src");

	        // Check if the image path is valid (not a broken link)
	        boolean isBrokenImage = false;
	        try {
	            URL url = new URL(imagePath);
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
	        
	     // Find the element containing the member info
	        WebElement memberInfoElement = driver.findElement(membrInfElmnt);

	        // Extract the member's name
	        String memberName = memberInfoElement.getText();

	        // Print the member's name
	        System.out.println("Member Name: " + memberName);

	        /***************************************************************************************************************************************************/
	     Thread.sleep(2000);
	        //Find Gym plus button
	       WebElement Gymplus = driver.findElement(gympls);
	       Gymplus.click();
	       
	       try {
	            Thread.sleep(2000); // Wait for 2 seconds (you may need to adjust this time)
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Ensure the popup is open with the heading "Gym"
	        WebElement popupHeadingElement = driver.findElement(popHeadngelment);
	        if (popupHeadingElement.isDisplayed()) {
	            System.out.println("Popup with heading 'Gym' is open.");
	        } else {
	            System.out.println("Popup with heading 'Gym' is not open.");
	        }

	        // Find the text area inside the popup
	        WebElement textArea = driver.findElement(txtara);

	        // Clear existing details
	        textArea.clear();

	        // Fill in new details for Gym
	        String newDetails = "Hello A modern day gymnasium (as gym used to be called way back in Ancient Greece) is a place for indoor physical workout where various equipment and machines are typically used. For some people, a typical gym is a place where you focus on weight lifting and similar activities.";
	        textArea.sendKeys(newDetails);

	        Thread.sleep(1000);
	        
	        //Find Save not button and click on it 
	        WebElement SaveNote = driver.findElement(Savnote);
	        SaveNote.click();
	        
	        Thread.sleep(1500);
	        /***************************************************************************************************************************************************/
	      //Find Gym plus button
		       WebElement Partneratcuesz = driver.findElement(partnrtcusz);
		       Partneratcuesz.click();
		       
		       try {
		            Thread.sleep(2000); // Wait for 2 seconds (you may need to adjust this time)
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }

		        // Ensure the popup is open with the heading "Gym"
		        WebElement popupHeadingElement1 = driver.findElement(popheadngelmnt1);
		        if (popupHeadingElement1.isDisplayed()) {
		            System.out.println("Popup with heading 'Gym Partner' is open.");
		        } else {
		            System.out.println("Popup with heading 'Gym Partner' is not open.");
		        }

		        // Find the text area inside the popup
		        WebElement PartnertextArea = driver.findElement(partnrtxtara);

		        // Clear existing details
		        PartnertextArea.clear();

		        // Fill in new details for Gym
		        String newDetails1 = "New test this A modern day gymnasium (as gym used to be called way back in Ancient Greece) is a place for indoor physical workout where various equipment and machines are typically used. For some people, a typical gym is a place where you focus on weight lifting and similar activities.";
		        PartnertextArea.sendKeys(newDetails1);

		        Thread.sleep(1000);
		        
		        //Find Save not button and click on it 
		        WebElement SaveNote2 = driver.findElement(Svaenot2);
		        SaveNote2.click();
		        Thread.sleep(1500);
		        
		    /***************************************************************************************************************************************************/
		        
	        
		        //Find Whyjoin plus button
			       WebElement whyjoin = driver.findElement(whjin);
			       whyjoin.click();
			       
			       try {
			            Thread.sleep(2000); // Wait for 2 seconds (you may need to adjust this time)
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }

			        // Ensure the popup is open with the heading "Gym"
			        WebElement popupHeadingElement2 = driver.findElement(popHeadngelment2);
			        if (popupHeadingElement2.isDisplayed()) {
			            System.out.println("Popup with heading 'Why join?' is open.");
			        } else {
			            System.out.println("Popup with heading 'Why join?' is not open.");
			        }

			        // Find the text area inside the popup
			        WebElement whyjointextArea = driver.findElement(whyjintxtAra);

			        // Clear existing details
			        whyjointextArea.clear();

			        // Fill in new details for Gym
			        String newDetails2 = "Lorem Are you test with automation tool";
			        whyjointextArea.sendKeys(newDetails2);

			        Thread.sleep(1000);
			        
			        //Find Save not button and click on it 
			        WebElement SaveNote3 = driver.findElement(SvaeNte3);
			        SaveNote3.click();
			        Thread.sleep(1500);
	        	        
			        

	 }
}
 

