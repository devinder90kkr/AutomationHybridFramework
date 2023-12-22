package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AppiumappUtils;
import cuesz.utils.mobileLocators;
import cuesz.utils.mobileTestData;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic ("Fuel custom screen detail ")
@Feature ("Verify Fuel detail functionlaity related to Custom fuel.")
public class Case26_Fuel_breakfast_customfood extends AppiummobileBase {

	
	mobileLocators locators = new mobileLocators();	


	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
	@Description("Custom Fuel screen detail verification")
    @Story("Scroll to Fuel card and verify custom food breakfast.")
	public void Homescreen() throws InterruptedException
	{	
		// Create an instance of AppiumUtils and pass the driver
		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
        // Launch the app using the utility method
        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
		
		WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
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
        WebElement breakfastplus 	= driver.findElement(mobileLocators.plusadd);
        breakfastplus.click();
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone	= driver.findElement(mobileLocators.doneclick);
        keypaddone.click();
        

      //  String searchText = "Git";
        String searchText = mobileTestData.searchText;
//        String searchText = "Gil";
        int count = 1;
        String modifiedSearchText = searchText + count + "test";

        // Loop until additempopup is visible
        while (true) {
            // Click on additional search list and fill searchText there
            WebElement additionalfuel = driver.findElement(mobileLocators.additionalsearch);
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
        WebElement Foodname = driver.findElement(mobileLocators.foodname);
        Foodname.sendKeys(modifiedSearchText);

       
       // Locate the Serving size  element 
       WebElement Servingsize	= driver.findElement(mobileLocators.servingsize);
       Servingsize.click();
       Servingsize.sendKeys(mobileTestData.Servingsize);
       //click on keypad Done button to hide keypad
       WebElement keypaddone2	= driver.findElement(mobileLocators.doneclick);       
       keypaddone2.click();
 
       // Locate the Serving unit  element 
       WebElement Servingunit	= driver.findElement(mobileLocators.servingunit);
       Servingunit.click();
       Servingunit.sendKeys(mobileTestData.Servingunit);
     //click on keypad Done button to hide keypad
       WebElement keypaddone3	= driver.findElement(mobileLocators.doneclick);       
       keypaddone3.click();
       
       
       // Locate the calories element  
       WebElement Calories	= driver.findElement(mobileLocators.calories);
       Calories.click();
       Calories.sendKeys(mobileTestData.Calories);
       WebElement keypaddone4	= driver.findElement(mobileLocators.doneclick);       
       keypaddone4.click();
       
       // Locate the Proteins element  
       WebElement Proteins	= driver.findElement(mobileLocators.proteins);
       Proteins.click();
       Proteins.sendKeys(mobileTestData.Proteins);
       WebElement keypaddone5	= driver.findElement(mobileLocators.doneclick);       
       keypaddone5.click();

       // Locate the Carbohydrates element  
       WebElement Carbohydrates	= driver.findElement(mobileLocators.carbohydrates);
       Carbohydrates.click();
       Carbohydrates.sendKeys(mobileTestData.Carbohydrates);
       WebElement keypaddone6	= driver.findElement(mobileLocators.doneclick);       
       keypaddone6.click();
       
       // Locate the Sugar element  
       WebElement Sugar	= driver.findElement(mobileLocators.sugar);
       Sugar.click();
       Sugar.sendKeys(mobileTestData.Sugar);
       WebElement keypaddone7	= driver.findElement(mobileLocators.doneclick);       
       keypaddone7.click();
       
       // Locate the Fat element  
       WebElement Fat	= driver.findElement(mobileLocators.fat);
       Fat.click();
       Fat.sendKeys(mobileTestData.Fat);
       WebElement keypaddone8	= driver.findElement(mobileLocators.doneclick);       
       keypaddone8.click();
       
       // Locate the Saturated Fat element  
       WebElement SaturatedFat	= driver.findElement(mobileLocators.saturatedfat);
       SaturatedFat.click();
       SaturatedFat.sendKeys(mobileTestData.SaturatedFat);
       WebElement keypaddone9	= driver.findElement(mobileLocators.doneclick);       
       keypaddone9.click();
       
       // Locate the Dietary Fiber element  
       WebElement DietaryFiber	= driver.findElement(mobileLocators.dietaryfiber);
       DietaryFiber.click();
       DietaryFiber.sendKeys(mobileTestData.DietaryFiber);
       WebElement keypaddone10	= driver.findElement(mobileLocators.doneclick);       
       keypaddone10.click();
             
       // Locate the Cholesterol Fiber element  
       WebElement Cholesterol	= driver.findElement(mobileLocators.cholesterol);
       Cholesterol.click();
       Cholesterol.sendKeys(mobileTestData.Cholesterol);
       WebElement keypaddone11	= driver.findElement(mobileLocators.doneclick);        
       keypaddone11.click();

       // Locate the Sodium Fiber element  
       WebElement Sodium	= driver.findElement(mobileLocators.sodium);
       Sodium.click();
       Sodium.sendKeys(mobileTestData.Sodium);
       WebElement keypaddone12	= driver.findElement(mobileLocators.doneclick);        
       keypaddone12.click();
       
       // Locate the Iron Fiber element  
       WebElement Iron	= driver.findElement(mobileLocators.iron);
       Iron.click();
       Iron.sendKeys(mobileTestData.Iron);
       WebElement keypaddone13	= driver.findElement(mobileLocators.doneclick);        
       keypaddone13.click();
       
       // Locate the Calcium Fiber element  
       WebElement Calcium	= driver.findElement(mobileLocators.calcium);
       Calcium.click();
       Calcium.sendKeys(mobileTestData.Calcium);
       WebElement keypaddone14	= driver.findElement(mobileLocators.doneclick);        
       keypaddone14.click();
       
       // Locate the Potassium Fiber element  
       WebElement Potassium	= driver.findElement(mobileLocators.potassium);
       Potassium.click();
       Potassium.sendKeys(mobileTestData.Potassium);
       WebElement keypaddone15	= driver.findElement(mobileLocators.doneclick);        
       keypaddone15.click();
       
       // Locate the Vitamin-A Fiber element  
       WebElement VitaminA	= driver.findElement(mobileLocators.vitaminA);
       VitaminA.click();
       VitaminA.sendKeys(mobileTestData.VitaminA);
       WebElement keypaddone16	= driver.findElement(mobileLocators.doneclick);        
       keypaddone16.click();
       
       // Locate the Vitamin-C Fiber element  
       WebElement VitaminB	= driver.findElement(mobileLocators.vitaminB);
       VitaminB.click();
       VitaminB.sendKeys(mobileTestData.VitaminB);
       WebElement keypaddone17	= driver.findElement(mobileLocators.doneclick);        
       keypaddone17.click();
       
       // Locate and click on Foodimage 
       WebElement Customfoodimage	= driver.findElement(mobileLocators.customfoodimage);
       Customfoodimage.click();
     
       WebElement galleryclick	= driver.findElement(mobileLocators.gallery);
       galleryclick.click();
       
       WebElement firstPhoto = driver.findElement(AppiumBy.xpath("//XCUIElementTypeImage[2]"));
       firstPhoto.click();
       
       Thread.sleep(3500);
       WebElement Submittap = driver.findElement(mobileLocators.submittap);
       Submittap.click();
       Thread.sleep(3500);
       
        WebElement Customfoodtick	= driver.findElement(mobileLocators.Customtick);
        Customfoodtick.click();
		
        Thread.sleep(3500);
       Thread.sleep(4500);
       driver.terminateApp("com.cuesz.mobile");
	}
}
	

