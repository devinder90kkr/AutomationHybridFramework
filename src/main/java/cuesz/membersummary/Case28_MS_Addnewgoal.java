 /*https://chat.openai.com/share/fb99a8d3-9b88-4b49-8555-3f5eab0b24e5 */
package cuesz.membersummary;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;

public class Case28_MS_Addnewgoal extends BasePage {
	
	SeleniumUtils utils = new SeleniumUtils(driver);
	private By teamLeadrNotsHadng = (By.xpath("//h2[normalize-space()='Team Leader Coach Notes']"));
	private By addNwBttn = (By.xpath("//button[normalize-space()='Add New']"));
	private By shrtTrmGalsTxtaea = (By.xpath("//div[@class='col-md-6']//textarea[@id='editor']"));
	private By lngTrmGalsTxtaea = (By.xpath("//div[@class='col-md-6']//label[text()='Long Term Goal']/following-sibling::div//textarea"));
	private By procsThikiTextara1 = (By.xpath("//div[@class='col-md-6']//label[text()='Process Thinking'][1]/following-sibling::div//textarea"));
	private By prosTikiTextara2 = (By.xpath("(//textarea[contains(@placeholder,'Write here...')])[4]"));
	private By submtbttn	=	(By.xpath("//button[normalize-space()='Submit']"));

	
    public Case28_MS_Addnewgoal(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

    @Test
    public void Addnwgoal() throws InterruptedException {  
        Thread.sleep(2000);
        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();
        
        // Scroll to the "Team Leader Coach Notes" heading
        Thread.sleep(3000);
        WebElement teamLeaderNotesHeading = driver.findElement(teamLeadrNotsHadng);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", teamLeaderNotesHeading);

        Thread.sleep(5000);
        // Verify the title of the heading
        String expectedTitle = "Team Leader Coach Notes";
        String actualTitle = teamLeaderNotesHeading.getText();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification passed!");
        } else {
            System.out.println("Title verification failed!");
        }
        Thread.sleep(3000);
        // Click on the "Add New" button
        WebElement addNewButton = driver.findElement(addNwBttn);
        addNewButton.click();
        
        Thread.sleep(3000);
     // Find the textarea for Short Term Goals - 3 Months
        WebElement shortTermGoalsTextarea = driver.findElement(shrtTrmGalsTxtaea);
        // Clear the textarea (optional, if you want to replace any existing value)
        shortTermGoalsTextarea.clear();
        // Input your desired value in the textarea
        String shortTermGoals = "This is my short term goal for the next 3 months";
        shortTermGoalsTextarea.sendKeys(shortTermGoals);

     // Find the textarea for Long Term Goal
        WebElement longTermGoalTextarea = driver.findElement(lngTrmGalsTxtaea);
        // Clear the textarea (optional, if you want to replace any existing value)
        longTermGoalTextarea.clear();
        // Input your desired value in the textarea
        String longTermGoal = "This is my long term goal";
        longTermGoalTextarea.sendKeys(longTermGoal);

        // Find the textarea for the first Process Thinking
        WebElement processThinkingTextarea1 = driver.findElement(procsThikiTextara1);
        // Clear the textarea (optional, if you want to replace any existing value)
        processThinkingTextarea1.clear();
        // Input your desired value in the textarea
        String processThinking1 = "This is my process thinking 1";
        processThinkingTextarea1.sendKeys(processThinking1);

        // Find the textarea for the second Process Thinking
        WebElement processThinkingTextarea2 = driver.findElement(prosTikiTextara2);
        // Clear the textarea (optional, if you want to replace any existing value)
        processThinkingTextarea2.clear();
        // Input your desired value in the textarea
        String processThinking2 = "This is my process thinking 2";
        processThinkingTextarea2.sendKeys(processThinking2);

        // Find the Submit button & click
        WebElement submitbutton =  driver.findElement(submtbttn);
        submitbutton.click();
        
        Thread.sleep(3000);
                 
        }    
    }
  
    
        
       
	    
      
    
    
  

