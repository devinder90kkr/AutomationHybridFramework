package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AllureUtils;
import cuesz.utils.AppiumappUtils;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Fuel custom screen detail ")
@Feature ("Verify Fuel detail functionlaity related to Custom fuel and add to breakfast list.")
public class Case27_Fuel_breakfast_customfoodaddtobrekfast extends AppiummobileBase {
	
	private By Homeclick 		= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By plusadd			= 		AppiumBy.accessibilityId("BreakfastAddIcon");
	private By doneclick		= 		AppiumBy.accessibilityId("Done");
	private By additionalsearch	= 		AppiumBy.accessibilityId("AdditionalFuelSearch");
	private By foodname			= 		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Food Name\"]");
	private By servingsize		= 		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Serving Size*\"]");
	private By servingunit		= 		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Serving Unit*\"]");
	private By calories			=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Calories(Kcal)*\"]");
	private By proteins			= 		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Protein(g)\"]");
	private By carbohydrates	=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Carbohydrates(g)\"]");
	private By sugar			=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Sugar(g)\"]");
	private By fat				=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Fat(g)\"]");
	private By saturatedfat		= 		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Saturated Fat\"]");
	private By dietaryfiber		=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Dietary Fiber(g)\"]");
	private By cholesterol		=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Cholesterol(mg)\"]");
	private By sodium			=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Sodium(mg)\"]");
	private By iron				=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Iron(g)\"]");
	private By calcium			=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Calcium(g)\"]");
	private By potassium		=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Potassium(mg)\"]");
	private By vitaminA			=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Vitamin-A(%dv)\"]");
	private By vitaminB			=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Vitamin-C(%dv)\"]");
	private By customfoodimage	=		AppiumBy.accessibilityId("CustomFoodImage");
	private By gallery			=		AppiumBy.accessibilityId("GalleryClicked");
	private By submittap		= 		AppiumBy.accessibilityId("SubmitImage");
	private By Customtick		=		AppiumBy.accessibilityId("CustomFoodSubmit");
	private By submitick		= 		AppiumBy.accessibilityId("ItemSubmit");
	private By Time				= 		AppiumBy.accessibilityId("AdditionalItemTime");
	private By pickerelement	= 		AppiumBy.xpath("//XCUIElementTypePickerWheel");
	private By Doneclick		= 		AppiumBy.accessibilityId("AlcohalTime");

	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
    @Description("Custom Fuel screen detail verification")
    @Story("Scroll to Fuel card and verify custom food to  breakfast.")	
	public void Homescreen() throws InterruptedException
	{	
		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
		
		WebElement Homeicon = driver.findElement(Homeclick);
		Homeicon.click();
		
		Thread.sleep(3000);
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject =new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("Perform Fuel Mindful Restore", "Perform");
		driver.executeScript("mobile:scroll", scrollObject);
		Thread.sleep(2000);

        //Click on Fuel tab 
        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();
        
        
        // Locate the element related to breakfast + icon 
        WebElement breakfastplus 	= driver.findElement(plusadd);
        breakfastplus.click();
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone	= driver.findElement(doneclick);
        keypaddone.click();
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Custom1");
        
        String searchText = "Git";
//        String searchText = "Gis";
        int count = 1;
        String modifiedSearchText = searchText + count + "test";

        // Loop until additempopup is visible
        while (true) {
            // Click on additional search list and fill searchText there
            WebElement additionalfuel = driver.findElement(additionalsearch);
            additionalfuel.clear();
            additionalfuel.sendKeys(modifiedSearchText);

            // Check if the element has the desired text
            if (additionalfuel.getAttribute("value").equals(modifiedSearchText)) {
                // Click on hybridselect
                WebElement hybridselect = driver.findElement(AppiumBy.accessibilityId(modifiedSearchText));
                hybridselect.click();

                try {
                    // Check if additempopup is visible
                    WebElement additempopup = driver.findElement(AppiumBy.accessibilityId("Add Item"));
                    additempopup.click();
                    // Break the loop as additempopup is visible now
                    break;
                } catch (org.openqa.selenium.NoSuchElementException e) {
                    // Handle the absence of additempopup, navigate back to additionalfuel and continue the loop
                    System.out.println("Add Item popup not found. Navigating back to Additional Fuel.");
                    WebElement backbutton = driver.findElement(AppiumBy.accessibilityId("SelectedFuelBackPress"));
                    backbutton.click();
                    // Increment count for the next iteration
                    count++;
                    modifiedSearchText = searchText + count + "test"; // Update modifiedSearchText for the next iteration
                }
            }
        }

        // Now you can use modifiedSearchText outside the loop as well, for example:
        WebElement Foodname = driver.findElement(foodname);
        Foodname.sendKeys(modifiedSearchText);

        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Custom2");
       
       // Locate the Serving size  element 
       WebElement Servingsize	= driver.findElement(servingsize);
       Servingsize.click();
       Servingsize.sendKeys("45");
       //click on keypad Done button to hide keypad
       WebElement keypaddone2	= driver.findElement(doneclick);       
       keypaddone2.click();
 
       // Locate the Serving unit  element 
       WebElement Servingunit	= driver.findElement(servingunit);
       Servingunit.click();
       Servingunit.sendKeys("cup");
     //click on keypad Done button to hide keypad
       WebElement keypaddone3	= driver.findElement(doneclick);       
       keypaddone3.click();
       
       
       // Locate the calories element  
       WebElement Calories	= driver.findElement(calories);
       Calories.click();
       Calories.sendKeys("176");
       WebElement keypaddone4	= driver.findElement(doneclick);       
       keypaddone4.click();
       
       // Locate the Proteins element  
       WebElement Proteins	= driver.findElement(proteins);
       Proteins.click();
       Proteins.sendKeys("4.5");
       WebElement keypaddone5	= driver.findElement(doneclick);       
       keypaddone5.click();

       // Locate the Carbohydrates element  
       WebElement Carbohydrates	= driver.findElement(carbohydrates);
       Carbohydrates.click();
       Carbohydrates.sendKeys("37");
       WebElement keypaddone6	= driver.findElement(doneclick);       
       keypaddone6.click();
       
       // Locate the Sugar element  
       WebElement Sugar	= driver.findElement(sugar);
       Sugar.click();
       Sugar.sendKeys("22");
       WebElement keypaddone7	= driver.findElement(doneclick);       
       keypaddone7.click();
       
       // Locate the Fat element  
       WebElement Fat	= driver.findElement(fat);
       Fat.click();
       Fat.sendKeys("2.2");
       WebElement keypaddone8	= driver.findElement(doneclick);       
       keypaddone8.click();
       
       // Locate the Saturated Fat element  
       WebElement SaturatedFat	= driver.findElement(saturatedfat);
       SaturatedFat.click();
       SaturatedFat.sendKeys("1.3");
       WebElement keypaddone9	= driver.findElement(doneclick);       
       keypaddone9.click();
       
       // Capture a screenshot and attach it to Allure
       AllureUtils.captureScreenshot(driver, "Custom3");
       
       // Locate the Dietary Fiber element  
       WebElement DietaryFiber	= driver.findElement(dietaryfiber);
       DietaryFiber.click();
       DietaryFiber.sendKeys("2.5");
       WebElement keypaddone10	= driver.findElement(doneclick);       
       keypaddone10.click();
       
       
       // Locate the Cholesterol Fiber element  
       WebElement Cholesterol	= driver.findElement(cholesterol);
       Cholesterol.click();
       Cholesterol.sendKeys("7.8");
       WebElement keypaddone11	= driver.findElement(doneclick);       
       keypaddone11.click();

       // Locate the Sodium Fiber element  
       WebElement Sodium	= driver.findElement(sodium);
       Sodium.click();
       Sodium.sendKeys("55");
       WebElement keypaddone12	= driver.findElement(doneclick);       
       keypaddone12.click();
       
       // Locate the Iron Fiber element  
       WebElement Iron	= driver.findElement(iron);
       Iron.click();
       Iron.sendKeys("0.4");
       WebElement keypaddone13	= driver.findElement(doneclick);       
       keypaddone13.click();
       
       // Locate the Calcium Fiber element  
       WebElement Calcium	= driver.findElement(calcium);
       Calcium.click();
       Calcium.sendKeys("139");
       WebElement keypaddone14	= driver.findElement(doneclick);       
       keypaddone14.click();
       
       // Locate the Potassium Fiber element  
       WebElement Potassium	= driver.findElement(potassium);
       Potassium.click();
       Potassium.sendKeys("511.4");
       WebElement keypaddone15	= driver.findElement(doneclick);       
       keypaddone15.click();
       
       // Locate the Vitamin-A Fiber element  
       WebElement VitaminA	= driver.findElement(vitaminA);
       VitaminA.click();
       VitaminA.sendKeys("2.36");
       WebElement keypaddone16	= driver.findElement(doneclick);       
       keypaddone16.click();
       
       // Locate the Vitamin-C Fiber element  
       WebElement VitaminB	= driver.findElement(vitaminB);
       VitaminB.click();
       VitaminB.sendKeys("0.36");
       WebElement keypaddone17	= driver.findElement(doneclick);       
       keypaddone17.click();
       
       // Locate and click on Foodimage 
       WebElement Customfoodimage	= driver.findElement(customfoodimage);
       Customfoodimage.click();
       
       // Capture a screenshot and attach it to Allure
       AllureUtils.captureScreenshot(driver, "Custom4");
     
       WebElement galleryclick	= driver.findElement(gallery);
       galleryclick.click();
       
       WebElement firstPhoto = driver.findElement(AppiumBy.xpath("//XCUIElementTypeImage[2]"));
       firstPhoto.click();
       
       
       // Capture a screenshot and attach it to Allure
       AllureUtils.captureScreenshot(driver, "Custom5");
       WebElement Submittap = driver.findElement(submittap);
       Submittap.click();
        Thread.sleep(2000);
       
        WebElement Customfoodtick	= driver.findElement(Customtick);
        Customfoodtick.click();
		
		Thread.sleep(3500);
		
		
	     // Click on timer 
        WebElement Timerclick 	= driver.findElement(Time);
        Timerclick.click();
        List<WebElement>values = driver.findElements(pickerelement);
		for (int i=0; i<values.size();i++)
		{		
		System.out.println(values.get(i).getText());
		}
		values.get(0).sendKeys("8");
		values.get(0).sendKeys(Keys.TAB);
		Thread.sleep(3500);
		values.get(1).sendKeys("08");
		values.get(1).sendKeys(Keys.TAB);
		Thread.sleep(3500);
		values.get(2).sendKeys("AM");
		driver.findElement(Doneclick).click();
        
		WebElement submit = driver.findElement(submitick);
		submit.click();
        
        
		Thread.sleep(8500);
 
       Thread.sleep(4500);
       driver.terminateApp("com.cuesz.mobile");
	}
}
	

