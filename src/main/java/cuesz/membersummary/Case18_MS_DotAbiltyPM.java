package cuesz.membersummary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz01schdulemaster.Step01_Login;

public class Case18_MS_DotAbiltyPM extends Step01_Login {

    @BeforeClass
    public void setUpChildClass() {
        setUp();
    }

    @Test(dependsOnMethods = "Login")
    public void Dotstatus_Abilityperform() throws InterruptedException {
        Thread.sleep(2000);

        // Click on the Member Summary button or link
        driver.findElement(By.xpath("//img[@alt='Member Summary']")).click();

        // Enter the name in the search field
        driver.findElement(By.xpath("//input[@placeholder='Search Members']"))
                .sendKeys("Kumar Devinder");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='member-items']")).click();
        
        WebElement statusDotsElement = driver.findElement(By.className("status_dots"));

        WebElement activeDot = statusDotsElement.findElement(By.cssSelector("li.dots"));
        String activeColor = activeDot.getCssValue("background");
        System.out.println("Active color: " + activeColor);
        Thread.sleep(3000);
        
        
        //Click on user icon to open ability to perform popup
        driver.findElement(By.xpath("//div[@class='user_action']")).click();
        
       
        // Click on label 
        driver.findElement(By.xpath("//span[@data-label='1']")).click();
        //Click on Add button
        driver.findElement(By.xpath("(//button)[14]")).click();
        
     // Locate the elements
        WebElement titleInput = driver.findElement(By.cssSelector("div.grey_wrap input[type='text']"));
        WebElement noteTextArea = driver.findElement(By.cssSelector("div.grey_wrap textarea"));
        WebElement dotsContainer = driver.findElement(By.cssSelector("div.status_dots_big"));
        
        // Add details for Title and Note
        titleInput.sendKeys("Sample Title");
        noteTextArea.sendKeys("Sample Note");
        
        // Interact with the dots
        WebElement dotThree = dotsContainer.findElement(By.xpath("//div[@class='col-md-4']//div[@data-label='3']"));
        WebElement dotTwo = dotsContainer.findElement(By.xpath("//div[@class='col-md-4']//div[@data-label='2']"));
        WebElement dotOne = dotsContainer.findElement(By.xpath("//div[@class='col-md-4']//div[@data-label='1']"));
        
        // Click the dots
        dotThree.click();
        dotTwo.click();
        dotOne.click();
        
        //Verify dots active
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='btn btn-md btn-primary']")).click();
        WebElement statusDotsElement1 = driver.findElement(By.className("status_dots"));
        WebElement activeDot1 = statusDotsElement1.findElement(By.cssSelector("li.dots"));
        String activeColor1 = activeDot1.getCssValue("background");
        System.out.println("Active color: " + activeColor1);
        
    }
	    
    }

