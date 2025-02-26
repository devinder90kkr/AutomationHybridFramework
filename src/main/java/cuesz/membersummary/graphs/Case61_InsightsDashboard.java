package cuesz.membersummary.graphs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.pages.BasePage;
import cuesz.utils.SeleniumUtils;

public class Case61_InsightsDashboard extends BasePage{
	
	SeleniumUtils utils = new SeleniumUtils(driver);
	private By grahpicon = (By.id("MemberSummary-/insights"));
	private By fatigeu = (By.id("InsightsDashboard-Fatigue"));
	private By morninghrv = (By.id("InsightsDashboard-MorningHRV"));
	private By morninghr = (By.id("InsightsDashboard-MorningHR"));
	private By fitness = (By.id("InsightsDashboard-Fitness"));	
	private By mentalEnergy = (By.id("InsightsDashboard-MentalEnergy"));
	private By physicalcondtions = (By.id("InsightsDashboard-PhysicalCondition"));
	private By sleptime = (By.id("InsightsDashboard-SleepTime"));
	private By musclesorness = (By.id("InsightsDashboard-MuscleSoreness"));
	private By stres = (By.id("InsightsDashboard-Stress"));
	private By sleppquality = (By.id("InsightsDashboard-SleepQuality"));
	private By vomxa = (By.id("InsightsDashboard-VO2Max"));
	
	public Case61_InsightsDashboard(WebDriver driver) {
		super(driver);
	}
	
	 @Test
	    public void InsightsDashboard()throws InterruptedException {
		 
		 Thread.sleep(2000);

	        utils.clickMembersummary();
	        utils.waitForMilliseconds(2000);
	        utils.enterSearchText();
	        utils.clickMembername();

		 WebElement Graphicon = driver.findElement(grahpicon);
		 Graphicon.click();
		 
		// Find the heading element and extract the text
	        WebElement headingElement = driver.findElement(By.cssSelector("div.title_h2 h3"));
	        String headingText = headingElement.getText();

	        // Verify if the heading is "Insights Dashboard"
	        if (headingText.equals("Insights Dashboard")) {
	            System.out.println("Heading is 'Insights Dashboard'.");
	        } else {
	            System.out.println("Heading is not 'Insights Dashboard'.");
	        }

	        // Find the member name element and extract the text
	        WebElement memberNameElement = driver.findElement(By.xpath("//h1[normalize-space()='Kumar Devinder']"));
	        String memberName = memberNameElement.getText();

	        // Print the member name
	        System.out.println("Member Name: " + memberName);
	        Thread.sleep(2500);
	        
	        WebElement fatigue = driver.findElement(fatigeu); 
	        fatigue.click();
	 
	        WebElement moringHrv = driver.findElement(morninghrv);
	        moringHrv.click();
	        
	        WebElement moringHr = driver.findElement(morninghr);
	        moringHr.click();	        
	 
	        WebElement fitnes = driver.findElement(fitness);
	        fitnes.click();
	        
	        WebElement mentalenergy = driver.findElement(mentalEnergy);
	        mentalenergy.click();
	        
	        WebElement phycondtions = driver.findElement(physicalcondtions);
	        phycondtions.click();
	        
	        WebElement Sleeptime = driver.findElement(sleptime);
	        Sleeptime.click();
	        
	        WebElement Musclesorness = driver.findElement(musclesorness);
	        Musclesorness.click();
	        
	        WebElement stress = driver.findElement(stres);
	        stress.click();

	        WebElement sleepquality = driver.findElement(sleppquality);
	        sleepquality.click();
	        
	        WebElement vo2max = driver.findElement(vomxa);
	        vo2max.click();

	        
	     // Locate the graph container element
	        WebElement graphContainer = driver.findElement(By.xpath("//div[contains(@style, 'max-width: 800px; margin: auto; min-height: 550px; text-align: center; padding: 30px;')]"));

	     // Scroll to the graph container using JavaScript
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", graphContainer);
	        
	        
	        // Locate the canvas element within the graph container
	        WebElement canvasElement = graphContainer.findElement(By.tagName("canvas"));

	        // Get the height and width attributes of the canvas element
			int canvasHeight = Integer.parseInt(canvasElement.getDomProperty("height"));
			int canvasWidth = Integer.parseInt(canvasElement.getDomProperty("width"));

	        // Check if the canvas has a valid size (height and width > 0)
	        if (canvasHeight > 0 && canvasWidth > 0) {
	            System.out.println("The graph container contains graph values.");
	        } else {
	            System.out.println("The graph container does not contain graph values.");
	        }
	        
	        Thread.sleep(1000); 
	        
	 
	        
	 }

}
