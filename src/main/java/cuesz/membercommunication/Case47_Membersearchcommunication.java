package cuesz.membercommunication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

        // Create an Actions object
        Actions actions = new Actions(driver);

        // List of keywords to search
        String[] keywords = {"Jagdeep", "Shelja", "Kamal", "Richard", "Kumar Devinder"};

        // Locate the search input field
        WebElement searchInput = driver.findElement(By.id("MemberCommunication-SearchMembers"));

        // Initialize WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));

        // Iterate through keywords
        for (String keyword : keywords) {
            // Clear the search input field by selecting all text and deleting
            actions.moveToElement(searchInput).click().keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).build().perform();

            // Enter the keyword
            searchInput.sendKeys(keyword);

            // Submit the form (if needed, you can use 'Keys.ENTER' instead)
            searchInput.submit();

            // Wait for the search result to load
            WebElement searchResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("MemberCommunication-" + keyword)));

            // Click on the search result
            searchResult.click();

            // Add additional logic to interact with the clicked element as needed

            // Wait for some time before moving to the next keyword (you can adjust this)
            Thread.sleep(2000);
        }
    }
}
