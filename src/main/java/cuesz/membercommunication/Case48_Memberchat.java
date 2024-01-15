//package cuesz.membercommunication;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
//
//import cuesz.pages.BasePage;
//import cuesz.utils.AllureUtils;
//
//public class Case48_Memberchat extends BasePage {
//	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1000)); 	
//	private By membercomunicate = (By.id("Dashboard-MemberCommunication"));
//	private By serchInput =	(By.id("MemberCommunication-SearchMembers"));
//	private By	membclck = (By.id("MemberCommunication-KumarDevinder"));
//	private By serhbox = (By.id("message"));
//	private By stafElment = (By.id("MemberCommunication-StaffList"));
//	private By senbttn = (By.id("MemberCommunication-SendMessage"));
//	private By emozi = (By.id("MemberCommunication-ChatEmoji"));
//
//	
//	public Case48_Memberchat(WebDriver driver) {
//		super(driver);
//	}
//	
//	 @Test
//	    public void Membercommunicate() throws InterruptedException {
//	       
//		 WebElement Chatclick = driver.findElement(membercomunicate);
//	        Chatclick.click();
//	        
//	        Thread.sleep(2500);
//	        // Locate the search input field by its locator
//	        WebElement searchInput = driver.findElement(serchInput);
//	       
//	        Thread.sleep(2500);
//	        String[] membersToSearch = {"Kumar Devinder"};
//
//	        for (String member : membersToSearch) {
//	        	
//	        	// Print the member's name to the console
//	            System.out.println("Searching for member: " + member);
//	            
//	            WebElement searchInput1 = driver.findElement(serchInput);
//	            searchInput1.click(); // Click on the search input field
//	            searchInput1.sendKeys(member);
//	
//	            // Capture a screenshot and attach it to Allure
//	            AllureUtils.captureScreenshot(driver, "membersearch_screenshot"); 
//	            
//	            // Perform the search action, for example, click a search button (if applicable)
//	            Thread.sleep(2500);
//	            // Wait for search results to load (you may need to adjust the wait time)
//	            try {
//	                Thread.sleep(2000); // Wait for 2 seconds; adjust as needed
//	            } catch (InterruptedException e) {
//	                e.printStackTrace();
//	            }
//	            Thread.sleep(2500);
//	            
//	            WebElement memberclick = driver.findElement(membclck);
//	            memberclick.click();
//	            Thread.sleep(2500);
//	            WebElement searchbox = driver.findElement(serhbox);
//	            searchbox.sendKeys("Hello this is just for testing purpse");
//	            Thread.sleep(2500);
//	            
//	            // Capture a screenshot and attach it to Allure
//	            AllureUtils.captureScreenshot(driver, "text1"); 
//	            
//	            WebElement staffElement = driver.findElement(stafElment);
//		         // Create an instance of the Actions class
//		            Actions actions = new Actions(driver);
//		           // Move to the staff element to open the dropdown
//		            actions.moveToElement(staffElement).click().perform();
//		            Thread.sleep(2500);	   
//		         // Press Enter to confirm the new time
//		            actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();       
//	            
//	            WebElement sendbutton = driver.findElement(senbttn);
//	            sendbutton.click();
//	            Thread.sleep(2500);	
//	            WebElement searchbox1 = driver.findElement(serhbox);
//	            searchbox1.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. ");
//	            Thread.sleep(2500);
//	            WebElement sendbutton1 = driver.findElement(senbttn);
//	            sendbutton1.click();
//	            Thread.sleep(2500);
//	            
//	         // Capture a screenshot and attach it to Allure
//	            AllureUtils.captureScreenshot(driver, "text2"); 
//	                      
//	            // Locate the staff element by its ID
//	            WebElement staffElement1 = driver.findElement(stafElment);
//	         // Create an instance of the Actions class
//	            Actions actions1 = new Actions(driver);
//	           // Move to the staff element to open the dropdown
//	            actions1.moveToElement(staffElement1).click().perform();
//	            Thread.sleep(2500);	   
//	         // Press Enter to confirm the new time
//	            actions1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
//	            
//	                
//	            WebElement searchbox2 = driver.findElement(serhbox);
//	            searchbox2.sendKeys("You may need to adjust the XPath locator or use explicit waits to ensure the chat list is fully loaded before attempting to click on the chat element.");
//	            Thread.sleep(2500);
//	            WebElement sendbutton2 = driver.findElement(senbttn);
//	            sendbutton2.click();
//	            Thread.sleep(2500);
//	            
//	            WebElement emoji = driver.findElement(emozi);
//	            Thread.sleep(2500);
//	            // Create an instance of the Actions class
//	            Actions actions2 = new Actions(driver);
//	           // Move to the staff element to open the dropdown
//	            actions2.moveToElement(emoji).click().perform();
//	            Thread.sleep(2500);	   
//	         // Press Enter to confirm the new time
//	            actions2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
//	            Thread.sleep(2000);
//	            WebElement sendbutton3 = driver.findElement(senbttn);
//	            sendbutton3.click();
//	            Thread.sleep(2500);
         
//	            
//	    }
//	
//	       
//	 }
//
//}


package cuesz.membercommunication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.AllureUtils;

public class Case48_Memberchat extends BasePage {
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1000)); 	
	private By membercomunicate = (By.id("Dashboard-MemberCommunication"));
	private By serchInput =	(By.id("MemberCommunication-SearchMembers"));
	private By	membclck = (By.id("MemberCommunication-KumarDevinder"));
	private By serhbox = (By.id("message"));
	private By stafElment = (By.id("MemberCommunication-StaffList"));
	private By senbttn = (By.id("MemberCommunication-SendMessage"));
	private By emozi = (By.id("MemberCommunication-ChatEmoji"));

	
	public Case48_Memberchat(WebDriver driver) {
		super(driver);
	}
	
//	 @Test
//	    public void Membercommunicate() throws InterruptedException {
//	       
//		 WebElement Chatclick = driver.findElement(membercomunicate);
//	        Chatclick.click();
//	        
////	        Thread.sleep(2500);
//	        // Locate the search input field by its locator
////	        WebElement searchInput = driver.findElement(serchInput);
//	       
//	        Thread.sleep(2500);
//	        String[] membersToSearch = {"Sanjit QA"};
//
//	        for (String member : membersToSearch) {
//	        	
//	        	// Print the member's name to the console
//	            System.out.println("Searching for member: " + member);
//	            
//	            WebElement searchInput1 = driver.findElement(serchInput);
//	            searchInput1.click(); // Click on the search input field
//	            searchInput1.sendKeys(member);
//	
//	            // Capture a screenshot and attach it to Allure
//	            AllureUtils.captureScreenshot(driver, "membersearch_screenshot"); 
//	            
//	            // Perform the search action, for example, click a search button (if applicable)
//	            Thread.sleep(2500);
//	            // Wait for search results to load (you may need to adjust the wait time)
//	            try {
//	                Thread.sleep(2000); // Wait for 2 seconds; adjust as needed
//	            } catch (InterruptedException e) {
//	                e.printStackTrace();
//	            }
//	            Thread.sleep(2500);
//	            
//	            WebElement memberclick = driver.findElement(membclck);
//	            memberclick.click();
//	            Thread.sleep(2500);
////	            WebElement searchbox = driver.findElement(serhbox);
////	            searchbox.sendKeys("Hello this is just for testing purpse");
//	            Thread.sleep(2500);
////	            /**********************Stress testing for notification and chat purpose****************************/
//	            for (int i = 0; i < 25; i++) { 
////		            Thread.sleep(2500);
//		            WebElement searchbox = driver.findElement(serhbox);
//		         // Send the keys alternatively
//		            if (i % 2 == 0) {
//		                searchbox.sendKeys("Times Square is known for its bright lights, massive electronic billboards, and bustling atmosphere. It's a popular destination for New Year's Eve celebrations, with the famous ball drop marking the start of the new year.");
//		            } else {
//		                searchbox.sendKeys("NYC is one of the most ethnically diverse cities in the world. People from all over the globe have settled in the city, contributing to its rich tapestry of cultures, languages, and cuisines.");
//		            }
//		            WebElement sendbutton2 = driver.findElement(senbttn);
//	                sendbutton2.click();
//	                Thread.sleep(1000);
//		            }
//	        }
//	 }
//}
	 
	 @Test
	    public void Membercommunicate() throws InterruptedException {

	        WebElement Chatclick = driver.findElement(membercomunicate);
	        Chatclick.click();

	        Thread.sleep(2500);

	        // Define an array of messages to send
	        String[] messagesToSend = {
	                "NYC boasts an array of world-class museums, including The Metropolitan Museum of Art, the Museum of Modern Art (MoMA), and the American Museum of Natural History, among many others.",
	                "Pi (π) is an irrational number representing the ratio of a circle's circumference to its diameter. Its decimal representation starts with 3.14159 and continues indefinitely.",
	                "NYC is renowned for its delicious pizza. The city's pizzerias serve a wide variety of pizza styles, including the classic New York-style thin crust pizza that's foldable and often eaten on the go",
	                "Central Park, located in the heart of Manhattan, is one of the most famous urban parks in the world. It covers 843 acres (about 341 hectares) and offers a wide range of recreational activities, including walking, biking, boating, and even ice skating in the winter.",
	                "The Arch of Titus, located in Rome, was built in AD 81 to commemorate the capture of Jerusalem and the victory of the Roman Emperor Titus in the Jewish War. The arch is famous for its reliefs depicting the spoils from the Second Temple in Jerusalem, including the menorah, which is considered one of the earliest depictions of this Jewish symbol."
	                
	                // Add more messages as needed
	        };

	        String memberToSearch = "Kumar Devinder"; // You can keep this outside the loop if it's the same for all messages
	        int numberOfIterations = 5; // Define the number of times you want to send the messages

	        for (int iteration = 0; iteration < numberOfIterations; iteration++) {
	            for (String message : messagesToSend) {
	                System.out.println("Searching for member: " + memberToSearch);

	                WebElement searchInput1 = driver.findElement(serchInput);
	                searchInput1.click();
	                searchInput1.sendKeys(memberToSearch);

	                AllureUtils.captureScreenshot(driver, "membersearch_screenshot");

	                Thread.sleep(2500);

	                // Wait for search results to load (you may need to adjust the wait time)
	                try {
	                    Thread.sleep(2000); // Wait for 2 seconds; adjust as needed
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }

	                Thread.sleep(2500);

	                WebElement memberclick = driver.findElement(membclck);
	                memberclick.click();
	                Thread.sleep(2500);

	                WebElement searchbox = driver.findElement(serhbox);
	                searchbox.sendKeys(message);

	                WebElement sendbutton2 = driver.findElement(senbttn);
	                sendbutton2.click();

	                Thread.sleep(1000);
	            }
	        }
	    }
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
//	            
//	            // Capture a screenshot and attach it to Allure
//	            AllureUtils.captureScreenshot(driver, "text1"); 
//	            
//	            WebElement staffElement = driver.findElement(stafElment);
//		         // Create an instance of the Actions class
//		            Actions actions = new Actions(driver);
//		           // Move to the staff element to open the dropdown
//		            actions.moveToElement(staffElement).click().perform();
//		            Thread.sleep(2500);	   
//		         // Press Enter to confirm the new time
//		            actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();       
//	            
//	            WebElement sendbutton = driver.findElement(senbttn);
//	            sendbutton.click();
//	            Thread.sleep(2500);	
//	            WebElement searchbox1 = driver.findElement(serhbox);
//	            searchbox1.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. ");
//	            Thread.sleep(2500);
//	            WebElement sendbutton1 = driver.findElement(senbttn);
//	            sendbutton1.click();
//	            Thread.sleep(2500);
//	            
//	         // Capture a screenshot and attach it to Allure
//	            AllureUtils.captureScreenshot(driver, "text2"); 
//	                      
//	            // Locate the staff element by its ID
//	            WebElement staffElement1 = driver.findElement(stafElment);
//	         // Create an instance of the Actions class
//	            Actions actions1 = new Actions(driver);
//	           // Move to the staff element to open the dropdown
//	            actions1.moveToElement(staffElement1).click().perform();
//	            Thread.sleep(2500);	   
//	         // Press Enter to confirm the new time
//	            actions1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
//	            
//	                
//	            WebElement searchbox2 = driver.findElement(serhbox);
//	            searchbox2.sendKeys("You may need to adjust the XPath locator or use explicit waits to ensure the chat list is fully loaded before attempting to click on the chat element.");
//	            Thread.sleep(2500);
//	            WebElement sendbutton2 = driver.findElement(senbttn);
//	            sendbutton2.click();
//	            Thread.sleep(2500);
//	            
//	            WebElement emoji = driver.findElement(emozi);
//	            Thread.sleep(2500);
//	            // Create an instance of the Actions class
//	            Actions actions2 = new Actions(driver);
//	           // Move to the staff element to open the dropdown
//	            actions2.moveToElement(emoji).click().perform();
//	            Thread.sleep(2500);	   
//	         // Press Enter to confirm the new time
//	            actions2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
//	            Thread.sleep(2000);
//	            WebElement sendbutton3 = driver.findElement(senbttn);
//	            sendbutton3.click();
//	            Thread.sleep(2500);
//	            
//	       	            
//	            
//	            
//                 
//	            
//	    }
//	
//	       
//	 }
//
//}
