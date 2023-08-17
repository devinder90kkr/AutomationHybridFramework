package cuesz.membersummary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cuesz01schdulemaster.Step01_Login;

public class Case19_MS_Preferences extends Step01_Login {

    @BeforeClass
    public void setUpChildClass() {
        setUp();
    }

    @Test(dependsOnMethods = "Login")
    public void Preferences() throws InterruptedException {
        Thread.sleep(2000);

        // Click on the Member Summary button or link
        driver.findElement(By.xpath("//img[@alt='Member Summary']")).click();

        // Enter the name in the search field
        driver.findElement(By.xpath("//input[@placeholder='Search Members']"))
                .sendKeys("Kumar Devinder");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='member-items']")).click();
        
     // Find the plus icon and click on it
        WebElement plusIcon = driver.findElement(By.xpath("//div[@class='graph_icon active']/em/img"));
        plusIcon.click();

        // Find the preference input text field and fill in some information
        WebElement preferenceInput = driver.findElement(By.cssSelector("textarea.form-control"));
        preferenceInput.sendKeys("Some preference information");

        // Find the save button and click on it
        WebElement saveButton = driver.findElement(By.cssSelector("button.btn_edit"));
        saveButton.click();

        Thread.sleep(3000);
    
            // Text is available, click on the edit button
            WebElement editButton = driver.findElement(By.xpath("//button[@class='btn_edit btn-transparent']"));
            editButton.click();

            // Find the textarea and update the information
            WebElement preferenceTextArea = driver.findElement(By.cssSelector("textarea.form-control"));
            preferenceTextArea.clear();
            preferenceTextArea.sendKeys("Updated preference information");

            // Click on the delete icon to remove the preference
            WebElement deleteIcon = driver.findElement(By.cssSelector("img[alt='delete']"));
            deleteIcon.click();
           }
        
        
    		}
	    
    //}

