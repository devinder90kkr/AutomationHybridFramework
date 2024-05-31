package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.pages.AppiummobileBase;
import cuesz.utils.AllureUtils;
import cuesz.utils.AppiumappUtils;
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
@Feature ("Verify Fuel detail functionlaity related to Custom fuel and add to breakfast list.")
public class Case28_Fuel_breakfast_customfoodsearch extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case28_Fuel_breakfast_customfoodsearch.class);
	
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
	private By serchclick		= 		AppiumBy.accessibilityId("AdditionalFuelSearch");
	private By commonfoodclick	=		AppiumBy.accessibilityId("Protein Powder");
	
	
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
		// Log console message to Allure
		LOGGER.info("Click on Homeicon");
		AllureUtils.logStep("Click on Homeicon");
		// Capture a screenshot and attach it to Allure
		AllureUtils.captureScreenshot(driver, "Case28_1");	
		Thread.sleep(3000);
		
		// Method to scroll to perform screen
		HashMap<String,Object>scrollObject =new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("Perform Fuel Mindful Restore", "Perform");
		driver.executeScript("mobile:scroll", scrollObject);
		Thread.sleep(2000);

        //Click on Fuel tab 
        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();
        // Log console message to Allure
        LOGGER.info("Click on fuel screen");
        AllureUtils.logStep("Click on fuel screen");
        AllureUtils.captureScreenshot(driver, "Case28_2");
        
        // Locate the element related to breakfast + icon 
        WebElement breakfastplus 	= driver.findElement(plusadd);
        breakfastplus.click();        
        // Log console message to Allure
        LOGGER.info("Click on breakfastplus");
        AllureUtils.logStep("Click on breakfastplus");
        AllureUtils.captureScreenshot(driver, "breakfastplus");
        
        //click on keypad Done button to hide keypad
        WebElement keypaddone	= driver.findElement(doneclick);
        keypaddone.click();
     // Log console message to Allure
        LOGGER.info("Click on Doneclick ");
        AllureUtils.logStep("Click on Doneclick"); 

        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Custom1");
        
        // Click on fuel search field 
        WebElement additionalfuel = driver.findElement(additionalsearch);
        additionalfuel.click();
        // Log console message to Allure
        LOGGER.info("Click on additionalfuel");
        AllureUtils.logStep("Click on additionalfuel");
        AllureUtils.captureScreenshot(driver, "additionalfuel");
        
        
        //enter additional values in field
        additionalfuel.sendKeys(mobileTestData.commonfood1);
        // Log console message to Allure
        LOGGER.info("Enter values in search field");
        AllureUtils.logStep("Enter value in Search field"); 
        
        WebElement Keypaddone	= driver.findElement(doneclick);
        Keypaddone.click();
        // Log console message to Allure
        LOGGER.info("Click on Doneclick ");
        AllureUtils.logStep("Click on Doneclick"); 
        Thread.sleep(3500);
        
        WebElement commonfoodselection	= driver.findElement(commonfoodclick);
        commonfoodselection.click();
        // Log console message to Allure
        LOGGER.info("Click on commonfoodselection");
        AllureUtils.logStep("Click on commonfoodselection");
        AllureUtils.captureScreenshot(driver, "commonfoodselection");
        
        Thread.sleep(3500);
        
        WebElement fuelsearch 	= driver.findElement(serchclick);
        fuelsearch.click();
        // Log console message to Allure
        LOGGER.info("Click on fuelsearch");
        AllureUtils.logStep("Click on fuelsearch");
        AllureUtils.captureScreenshot(driver, "fuelsearch");
        
        WebElement fuelsearch2 	= driver.findElement(serchclick);
        fuelsearch2.click();
        // Log console message to Allure
        LOGGER.info("Click on fuelsearch2");
        AllureUtils.logStep("Click on fuelsearch2");
        AllureUtils.captureScreenshot(driver, "fuelsearch2");
        
        //  String searchText = "Git";
        String searchText = mobileTestData.searchText;
        //        String searchText = "Gil";
        int count = 1;
        String modifiedSearchText = searchText + count + "test";
        
//      String searchText = "Git";
//      //      String searchText = "Gis";
//        int count = 1;
//        String modifiedSearchText = searchText + count + "test";

        // Loop until additempopup is visible
        while (true) {
            // Click on additional search list and fill searchText there
            WebElement additionalfuel1 = driver.findElement(additionalsearch);
            additionalfuel1.clear();
            additionalfuel1.sendKeys(modifiedSearchText);

            // Check if the element has the desired text
            if (additionalfuel1.getAttribute("value").equals(modifiedSearchText)) {
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
     // Log console message to Allure
        LOGGER.info("Enter value for search,Click on Done");
        AllureUtils.logStep("Enter Foodname value");       
		// Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Foodname value");
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "Custom2");
       
       // Locate the Serving size  element 
       WebElement Servingsize	= driver.findElement(servingsize);
       Servingsize.click();
       // Log console message to Allure
       LOGGER.info("enter value for serving size element ");
       AllureUtils.logStep("enter value for serving size element");    
       // Capture a screenshot and attach it to Allure
       AllureUtils.captureScreenshot(driver, "Case28_3");
       
       Servingsize.sendKeys("45");
       //click on keypad Done button to hide keypad
       WebElement keypaddone2	= driver.findElement(doneclick);       
       keypaddone2.click();
       // Log console message to Allure
       LOGGER.info("Click on Doneclick ");
       AllureUtils.logStep("Click on Doneclick"); 
            
 
       // Locate the Serving unit  element 
       WebElement Servingunit	= driver.findElement(servingunit);
       Servingunit.click();
       // Log console message to Allure
       LOGGER.info("enter value for Servingunit ");
       AllureUtils.logStep("enter value for Servingunit");    
       // Capture a screenshot and attach it to Allure
       AllureUtils.captureScreenshot(driver, "Case28_4");
       
       Servingunit.sendKeys("cup");
     //click on keypad Done button to hide keypad
       WebElement keypaddone3	= driver.findElement(doneclick);       
       keypaddone3.click();
       // Log console message to Allure
       LOGGER.info("Click on Doneclick ");
       AllureUtils.logStep("Click on Doneclick"); 
       
       // Locate the calories element  
       WebElement Calories	= driver.findElement(calories);
       Calories.click();
       // Log console message to Allure
       LOGGER.info("Click on Calories");
       AllureUtils.logStep("Click on Calories");
       AllureUtils.captureScreenshot(driver, "Case28_5");
       
       Calories.sendKeys("176");
       WebElement keypaddone4	= driver.findElement(doneclick);       
       keypaddone4.click();
       // Log console message to Allure
       LOGGER.info("Click on Doneclick ");
       AllureUtils.logStep("Click on Doneclick"); 
       
       // Locate the Proteins element  
       WebElement Proteins	= driver.findElement(proteins);
       Proteins.click();
       // Log console message to Allure
       LOGGER.info("Click on Proteins");
       AllureUtils.logStep("Click on Proteins");
       AllureUtils.captureScreenshot(driver, "Case28_6");
       
       Proteins.sendKeys("4.5");
       WebElement keypaddone5	= driver.findElement(doneclick);       
       keypaddone5.click();
       // Log console message to Allure
       LOGGER.info("Click on Doneclick ");
       AllureUtils.logStep("Click on Doneclick"); 

       // Locate the Carbohydrates element  
       WebElement Carbohydrates	= driver.findElement(carbohydrates);
       Carbohydrates.click();
       // Log console message to Allure
       LOGGER.info("Click on Carbohydrates");
       AllureUtils.logStep("Click on Carbohydrates");
       AllureUtils.captureScreenshot(driver, "Case28_7");
       
       Carbohydrates.sendKeys("37");
       WebElement keypaddone6	= driver.findElement(doneclick);       
       keypaddone6.click();
       // Log console message to Allure
       LOGGER.info("Click on Doneclick ");
       AllureUtils.logStep("Click on Doneclick"); 
       
       // Locate the Sugar element  
       WebElement Sugar	= driver.findElement(sugar);
       Sugar.click();
       // Log console message to Allure
       LOGGER.info("Click on Sugar");
       AllureUtils.logStep("Click on Sugar");
       AllureUtils.captureScreenshot(driver, "Case28_8");
       
       Sugar.sendKeys("22");
       WebElement keypaddone7	= driver.findElement(doneclick);       
       keypaddone7.click();
       // Log console message to Allure
       LOGGER.info("Click on Doneclick ");
       AllureUtils.logStep("Click on Doneclick"); 
       
       // Locate the Fat element  
       WebElement Fat	= driver.findElement(fat);
       Fat.click();
       // Log console message to Allure
       LOGGER.info("Click on Fat");
       AllureUtils.logStep("Click on Fat");
       AllureUtils.captureScreenshot(driver, "Fat");
       Fat.sendKeys("2.2");
       WebElement keypaddone8	= driver.findElement(doneclick);       
       keypaddone8.click();
       // Log console message to Allure
       LOGGER.info("Click on Doneclick ");
       AllureUtils.logStep("Click on Doneclick"); 
       
       // Locate the Saturated Fat element  
       WebElement SaturatedFat	= driver.findElement(saturatedfat);
       SaturatedFat.click();
       // Log console message to Allure
       LOGGER.info("Click on SaturatedFat");
       AllureUtils.logStep("Click on SaturatedFat");
       AllureUtils.captureScreenshot(driver, "Case28_9");
       
       SaturatedFat.sendKeys("1.3");
       WebElement keypaddone9	= driver.findElement(doneclick);       
       keypaddone9.click();
       // Log console message to Allure
       LOGGER.info("Click on Doneclick ");
       AllureUtils.logStep("Click on Doneclick"); 
       
       // Capture a screenshot and attach it to Allure
       AllureUtils.captureScreenshot(driver, "Custom3");
       
       // Locate the Dietary Fiber element  
       WebElement DietaryFiber	= driver.findElement(dietaryfiber);
       DietaryFiber.click();
       // Log console message to Allure
       LOGGER.info("Click on DietaryFiber");
       AllureUtils.logStep("Click on DietaryFiber");
       AllureUtils.captureScreenshot(driver, "Case28_10");
       
       DietaryFiber.sendKeys("2.5");
       WebElement keypaddone10	= driver.findElement(doneclick);       
       keypaddone10.click();
       // Log console message to Allure
       LOGGER.info("Click on Doneclick ");
       AllureUtils.logStep("Click on Doneclick"); 
       
       // Locate the Cholesterol Fiber element  
       WebElement Cholesterol	= driver.findElement(cholesterol);
       Cholesterol.click();
       // Log console message to Allure
       LOGGER.info("Click on Cholesterol");
       AllureUtils.logStep("Click on Cholesterol");
       AllureUtils.captureScreenshot(driver, "Case28_11");
       
       Cholesterol.sendKeys("7.8");
       WebElement keypaddone11	= driver.findElement(doneclick);       
       keypaddone11.click();
       // Log console message to Allure
       LOGGER.info("Click on Doneclick ");
       AllureUtils.logStep("Click on Doneclick"); 

       // Locate the Sodium Fiber element  
       WebElement Sodium	= driver.findElement(sodium);
       Sodium.click();
       // Log console message to Allure
       LOGGER.info("Click on Sodium");
       AllureUtils.logStep("Click on Sodium");
       AllureUtils.captureScreenshot(driver, "Case28_12");
       
       Sodium.sendKeys("55");
       WebElement keypaddone12	= driver.findElement(doneclick);       
       keypaddone12.click();
       // Log console message to Allure
       LOGGER.info("Click on Doneclick ");
       AllureUtils.logStep("Click on Doneclick"); 
       
       // Locate the Iron Fiber element  
       WebElement Iron	= driver.findElement(iron);
       Iron.click();
       // Log console message to Allure
       LOGGER.info("Click on Iron");
       AllureUtils.logStep("Click on Iron");
       AllureUtils.captureScreenshot(driver, "Case28_13");
       
       Iron.sendKeys("0.4");
       WebElement keypaddone13	= driver.findElement(doneclick);       
       keypaddone13.click();
       // Log console message to Allure
       LOGGER.info("Click on Doneclick ");
       AllureUtils.logStep("Click on Doneclick"); 
       
       // Locate the Calcium Fiber element  
       WebElement Calcium	= driver.findElement(calcium);
       Calcium.click();
       // Log console message to Allure
       LOGGER.info("Click on Calcium");
       AllureUtils.logStep("Click on Calcium");
       AllureUtils.captureScreenshot(driver, "Case28_14");
       
       Calcium.sendKeys("139");
       WebElement keypaddone14	= driver.findElement(doneclick);       
       keypaddone14.click();
       
       // Locate the Potassium Fiber element  
       WebElement Potassium	= driver.findElement(potassium);
       Potassium.click();
   	   // Log console message to Allure
       LOGGER.info("Click on Potassium");
       AllureUtils.logStep("Click on Potassium");
       AllureUtils.captureScreenshot(driver, "Case28_15");
       
       Potassium.sendKeys("511.4");
       WebElement keypaddone15	= driver.findElement(doneclick);       
       keypaddone15.click();
       // Log console message to Allure
       LOGGER.info("Click on Doneclick ");
       AllureUtils.logStep("Click on Doneclick"); 
       
       // Locate the Vitamin-A Fiber element  
       WebElement VitaminA	= driver.findElement(vitaminA);
       VitaminA.click();
       // Log console message to Allure
       LOGGER.info("Click on VitaminA");
       AllureUtils.logStep("Click on VitaminA");
       AllureUtils.captureScreenshot(driver, "Case28_16");
       
       VitaminA.sendKeys("2.36");
       WebElement keypaddone16	= driver.findElement(doneclick);       
       keypaddone16.click();
       // Log console message to Allure
       LOGGER.info("Click on Doneclick ");
       AllureUtils.logStep("Click on Doneclick"); 
       
       // Locate the Vitamin-C Fiber element  
       WebElement VitaminB	= driver.findElement(vitaminB);
       VitaminB.click();
       // Log console message to Allure
       LOGGER.info("Click on VitaminB");
       AllureUtils.logStep("Click on VitaminB");
       AllureUtils.captureScreenshot(driver, "Case28_17");
       
       VitaminB.sendKeys("0.36");
       WebElement keypaddone17	= driver.findElement(doneclick);   
       // Log console message to Allure
       LOGGER.info("Click on Doneclick ");
       AllureUtils.logStep("Click on Doneclick"); 
       
       keypaddone17.click();
       // Log console message to Allure
       LOGGER.info("Click on keypaddone17");
       AllureUtils.logStep("Click on keypaddone17");
       AllureUtils.captureScreenshot(driver, "Case28_18");
       
       // Locate and click on Foodimage 
       WebElement Customfoodimage	= driver.findElement(customfoodimage);
       Customfoodimage.click();
       
       // Capture a screenshot and attach it to Allure
       AllureUtils.captureScreenshot(driver, "Custom4");
     
       WebElement galleryclick	= driver.findElement(gallery);
       galleryclick.click();
       // Log console message to Allure
       LOGGER.info("Click on galleryclick");
       AllureUtils.logStep("Click on galleryclick");
       AllureUtils.captureScreenshot(driver, "Case28_19");
       
       WebElement firstPhoto = driver.findElement(AppiumBy.xpath("//XCUIElementTypeImage[2]"));
       firstPhoto.click();
       
       
       // Capture a screenshot and attach it to Allure
       AllureUtils.captureScreenshot(driver, "Custom5");
       WebElement Submittap = driver.findElement(submittap);
       Submittap.click();
       // Log console message to Allure
       LOGGER.info("Click on Submittap");
       AllureUtils.logStep("Click on Submittap");
       AllureUtils.captureScreenshot(driver, "Case28_20");
       
        Thread.sleep(2000);
       
        WebElement Customfoodtick	= driver.findElement(Customtick);
        Customfoodtick.click();
        // Log console message to Allure
        LOGGER.info("Click on keypaddone17");
        AllureUtils.logStep("Click on keypaddone17");
        AllureUtils.captureScreenshot(driver, "Case28_21");
        
		Thread.sleep(2500);
		
		
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
		// Log console message to Allure
        LOGGER.info("Click on submit");
        AllureUtils.logStep("Click on submit");
        AllureUtils.captureScreenshot(driver, "Case28_22");
        
		Thread.sleep(8500);
 
		
		// Method to scroll to perform screen
				HashMap<String,Object>scrollObject1 =new HashMap<>();
				scrollObject1.put("direction", "down");
				scrollObject1.put("Protein Powder", "Protein Powder");
				driver.executeScript("mobile:scroll", scrollObject1);
				Thread.sleep(2000);
		
		
		
       Thread.sleep(4500);
       driver.terminateApp("com.cuesz.mobile");
	}
}
	
