package cuesz.membercommunication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import cuesz.pages.BasePage;

public class Case47_Membersearchcommunication extends BasePage {
    private By memberCommunicationLink = By.id("Dashboard-MemberCommunication");

    public Case47_Membersearchcommunication(WebDriver driver) {
        super(driver);
    }

    @Test
    public void Membercommunicate() throws InterruptedException {
    	// Click on the Member Communication link
        WebElement chatClick = driver.findElement(memberCommunicationLink);
        chatClick.click();

     // Define the ID of the search input element
        String searchInputId = "MemberCommunication-SearchMembers";
        
        // Define the list of member IDs you want to search for
        String[] memberIds = {
            "jagdeepsingh",
            "KumarDevinder",
            "davinder",
            // Add more member IDs as needed
        };
        
        // Loop through the member IDs and perform the search
        for (String memberId : memberIds) {
            // Find the search input element by ID
            WebElement searchInput = driver.findElement(By.id(searchInputId));
            
            // Clear any previous text in the search input
            searchInput.clear();
            
            // Enter the member ID into the search input
            searchInput.sendKeys(memberId);
            
            // You can add some code here to wait for the search results to appear (if needed)
            
            // Perform any actions with the search results (e.g., click on a result)
            // For example, you can click on a member's name to open a chat
            WebElement memberResult = driver.findElement(By.id(memberId));
            memberResult.click();
            
            // You can perform any further actions with the chat here
            
            // Clear the search input to prepare for the next search
            searchInput.clear();
        }
        
        // Close the WebDriver
        driver.quit();
    }
}