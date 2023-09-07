/*https://chat.openai.com/share/bd098b7d-b6cb-4908-a005-2363eb87139c*/

package cuesz.membersummary;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.AllureUtils;
import cuesz.utils.SeleniumUtils;

public class Case21_MS_4speheresdrpdwn extends BasePage {
	SeleniumUtils utils = new SeleniumUtils(driver);
	
	private By sphreHding	=  (By.cssSelector(".title_h4 h4"));
	private By todyprgrss	=  (By.cssSelector(".title_h4:nth-child(2) h4"));
	private By ovrallprgress 	= (By.cssSelector(".title_h4:nth-child(3) h4"));
	private By drpdwn	=	(By.cssSelector(".react-select-dropdown-prefix__control"));
	private By drpdwn2	=	(By.cssSelector(".react-select-dropdown-prefix__control"));
	private By drpdwn3	=   (By.cssSelector(".react-select-dropdown-prefix__control"));
	private By drpdwn4	= 	(By.cssSelector(".react-select-dropdown-prefix__control"));

	public Case21_MS_4speheresdrpdwn(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

    @Test
    public void speheres() throws InterruptedException {
    	
    	
    	utils.clickMembersummary();
        utils.waitForMilliseconds(2000);
        utils.enterSearchText();
        utils.clickMembername();
      
        // Find the heading elements for the four spheres
        WebElement sphereHeading = driver.findElement(sphreHding);
        
        // Scroll to the "4 Spheres" feature
        Actions actions = new Actions(driver);
        actions.moveToElement(sphereHeading);
        actions.perform();

        // Alternatively, you can use JavaScript Executor to scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", sphereHeading);
           
        // Verify the heading for 4 Spheres
        String headingText = sphereHeading.getText();
        if (headingText.equals("4 Spheres")) {
            System.out.println("Heading verification successful!");
        } else {
            System.out.println("Heading verification failed!");
        }
     // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
        
        
        // Find the Today's Progress element
        WebElement todayProgress = driver.findElement(todyprgrss);

        // Verify the Today's Progress value
        String todayProgressText = todayProgress.getText();
        if (todayProgressText.contains("Today's Progress : 0%")) {
            System.out.println("Today's Progress verification successful!");
        } else {
            System.out.println("Today's Progress verification failed!");
        }

        // Find the Overall Progress element
        WebElement overallProgress = driver.findElement(ovrallprgress);

        // Verify the Overall Progress value
        String overallProgressText = overallProgress.getText();
        if (overallProgressText.contains("OverAll Progress : 59%")) {
            System.out.println("Overall Progress verification successful!");
        } else {
            System.out.println("Overall Progress verification failed!");
        }
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot"); 
        
        Thread.sleep(3000);
     // Find the dropdown element
        WebElement dropdown = driver.findElement(drpdwn);
	    Actions builder = new Actions(driver);
	    builder.moveToElement(dropdown).click().sendKeys("This Week").perform();
	    Thread.sleep(2000);
	    builder.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	   
	    // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
	    
	    Thread.sleep(3000);
	     // Find the dropdown element
	        WebElement dropdown1 = driver.findElement(drpdwn2);
		    Actions builder1 = new Actions(driver);
		    builder1.moveToElement(dropdown1).click().sendKeys("Last Week").perform();
		    Thread.sleep(2000);
		    builder1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		    
		    // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
	    
		    Thread.sleep(3000);
		     // Find the dropdown element
		        WebElement dropdown11 = driver.findElement(drpdwn3);
			    Actions builder11 = new Actions(driver);
			    builder11.moveToElement(dropdown11).click().sendKeys("14 Days").perform();
			    Thread.sleep(2000);
			    builder11.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
			    
			    // Capture a screenshot and attach it to Allure
		        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
			    
			    Thread.sleep(3000);
			     // Find the dropdown element
			        WebElement dropdown111 = driver.findElement(drpdwn4);
				    Actions builder111 = new Actions(driver);
				    builder111.moveToElement(dropdown111).click().sendKeys("30 Days").perform();
				    Thread.sleep(2000);
				    builder111.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();               
				    // Capture a screenshot and attach it to Allure
			        AllureUtils.captureScreenshot(driver, "fuel_report_screenshot");
			 Thread.sleep(2500);       
			        
    }
    
    }  