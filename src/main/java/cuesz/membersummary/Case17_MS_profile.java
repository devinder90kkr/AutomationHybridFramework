package cuesz.membersummary;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;

public class Case17_MS_profile extends BasePage {
	
	SeleniumUtils utils = new SeleniumUtils(driver);
	private By usrname	= (By.xpath("//div[@class='user_inf']/h4"));
	private By age		= (By.xpath("//div[@class='member_info_items'][1]/p"));
	private By editbttn	= (By.xpath("//button[@class='btn_icon btn-transparent']//img[@alt='edit']"));
	private By Wilingnes = (By.xpath("//div[@class='member_info_items']//div[@class='react-select__control css-yk16xz-control']"));
	private By Gol		= (By.xpath("(//textarea[@placeholder='Enter here'])[1]"));
	private By PrevMilestone		= (By.xpath("(//input[@placeholder='Enter here'])[1]"));
	private By Limitions	= (By.xpath("(//textarea[@placeholder='Enter here'])[2]"));
	private By Tendncy = (By.xpath("(//input[@placeholder='Enter here'])[2]"));
	private By likse		= (By.xpath("(//textarea[@placeholder='Enter here'])[3]"));
	private By Dislikse		= (By.xpath("(//textarea[@placeholder='Enter here'])[4]"));
	private By selment	= (By.xpath("//img[@alt='save']"));
	private By Savebttn	= (By.xpath("//img[@alt='save']"));
	

    public Case17_MS_profile(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    @Test
    public void MemberProfile() throws InterruptedException {
        Thread.sleep(2000);

        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText("Kumar Devinder");
        utils.clickMembername();
        
 
     // Find the name element
        WebElement nameElement = driver.findElement(usrname);

        // Get the current name value
        String currentName = nameElement.getText();
        // Verify the current name value
        if (currentName.equals("Kumar Devinder")) {
            System.out.println("Name verification passed.");
        } else {
            System.out.println("Name verification failed.");
        }

        // Find the age element
        WebElement ageElement = driver.findElement(age);
        // Get the current age value
        String currentAge = ageElement.getText();

        // Verify the current age value
        if (currentAge.equals("33")) {
            System.out.println("Age verification passed.");
        } else {
            System.out.println("Age verification failed.");
        }

        // Find the edit button
        WebElement editButton = driver.findElement(editbttn);
        // Click on the edit button to edit the profile
        editButton.click();
        
        Thread.sleep(3000);
        WebElement Willingness = driver.findElement(Wilingnes);
        Actions builder = new Actions(driver);
	    builder.moveToElement(Willingness).click().sendKeys("Not Willing").perform();
	    Thread.sleep(2000);
	    builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

	    WebElement Goal = driver.findElement(Gol);
	    Goal.sendKeys("Make your goal clear and detailed. For example, instead of saying \"I want to eat healthier\", say \"I want to eat five servings of fruits and vegetables every day\".");
	    
	    WebElement PreviousMilestone = driver.findElement(PrevMilestone);
	    PreviousMilestone.sendKeys(" think about why you want to eat more fruits and vegetables. Is it because you want to lower your risk of chronic diseases, boost your immune system");
	    
	    WebElement Limitations = driver.findElement(Limitions);
	    Limitations.sendKeys(" will meditate for 10 minutes every morning for the next four weeks to reduce my stress levels and improve my mental clarity.");
	    
	    WebElement Tendancy = driver.findElement(Tendncy);
	    Tendancy.sendKeys("tendancy need to update as per automation field");

	    WebElement Likes = driver.findElement(likse);
	    Likes.sendKeys("Travelling, internetsurfring like include in this field");
	    
	    WebElement Dislikes = driver.findElement(Dislikse);
	    Dislikes.sendKeys("reading, Smoking dislike in this field");
	   
	    WebElement selement = driver.findElement(selment);
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView();",selement);

	    Thread.sleep(2000);
	    WebElement Save= driver.findElement(Savebttn);
	    Actions builder25 = new Actions(driver);
	    builder25.moveToElement(Save).click().perform();;

	    
    }
}
