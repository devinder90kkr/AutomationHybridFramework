package cuesz.membersummary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;

public class Case18_MS_DotAbiltyPM extends BasePage {

	SeleniumUtils utils = new SeleniumUtils(driver);
	
	private By dotstats = (By.className("status_dots"));
	private By actvcolr	= (By.cssSelector("li.dots"));
	private By usricn	= (By.xpath("//div[@class='user_action']"));
	private By label	= (By.xpath("//span[@data-label='1']"));
	private By Addbttn	= (By.xpath("(//button)[14]"));
	private By tileInpt	= (By.cssSelector("div.grey_wrap input[type='text']"));
	private By noteTxtAra	= (By.cssSelector("div.grey_wrap textarea"));
	private By dotsCntiner	= (By.cssSelector("div.status_dots_big"));
	private By dotThre		=(By.xpath("//div[@class='col-md-4']//div[@data-label='3']"));
	private By dotwo	= (By.xpath("//div[@class='col-md-4']//div[@data-label='2']"));
	private By dotne	= (By.xpath("//div[@class='col-md-4']//div[@data-label='1']"));
	private By actvelemnt	= (By.xpath("//button[@class='btn btn-md btn-primary']"));
	private By staDotsElem 	=	(By.className("status_dots"));
	private By actiDo1	= (By.cssSelector("li.dots"));
	
	public Case18_MS_DotAbiltyPM(WebDriver driver) {
		super(driver);
	}

	@Test
    public void Dotstatus_Abilityperform() throws InterruptedException {
    	Thread.sleep(2000);

        utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();
        
        WebElement statusDotsElement = driver.findElement(dotstats);

        WebElement activeDot = statusDotsElement.findElement(actvcolr);
        String activeColor = activeDot.getCssValue("background");
        System.out.println("Active color: " + activeColor);
        Thread.sleep(3000);
        
        //Click on user icon to open ability to perform popup
        driver.findElement(usricn).click();
        
        // Click on label 
        driver.findElement(label).click();
        //Click on Add button
        driver.findElement(Addbttn).click();
        
     // Locate the elements
        WebElement titleInput = driver.findElement(tileInpt);
        WebElement noteTextArea = driver.findElement(noteTxtAra);
        WebElement dotsContainer = driver.findElement(dotsCntiner);
        
        // Add details for Title and Note
        titleInput.sendKeys("new update notes for advocate side ");
        noteTextArea.sendKeys("be chill mode on this side");
        
        // Interact with the dots
        WebElement dotThree = dotsContainer.findElement(dotThre);
        WebElement dotTwo = dotsContainer.findElement(dotwo);
        WebElement dotOne = dotsContainer.findElement(dotne);
        
        // Click the dots
        dotThree.click();
        dotTwo.click();
        dotOne.click();
        
        //Verify dots active
        Thread.sleep(3000);
        driver.findElement(actvelemnt).click();
        WebElement statusDotsElement1 = driver.findElement(staDotsElem);
        WebElement activeDot1 = statusDotsElement1.findElement(actiDo1);
        String activeColor1 = activeDot1.getCssValue("background");
        System.out.println("Active color: " + activeColor1);
        
    }
	    
    }

