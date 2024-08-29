package cuesz03.Iosapp_member_home_Fuelscreen;

import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import cuesz.allure.reporting.AllureUtils;
import cuesz.mobile.resources.mobileLocators;
import cuesz.mobile.resources.mobileTestData;
import cuesz.pages.AppiummobileBase;
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
@Feature ("Verify Fuel detail functionlaity related to Custom fuel for Lunch.")
public class Case36_Fuel_Lunch_customfood extends AppiummobileBase {
	private static final Logger LOGGER = LoggerFactory.getLogger(Case36_Fuel_Lunch_customfood .class);
	
	private By Homeclick 		= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	private By plusadd			= 		AppiumBy.accessibilityId("BreakfastAddIcon");
	private By doneclick		= 		AppiumBy.accessibilityId("Done");
	private By additionalsearch	= 		AppiumBy.accessibilityId("AdditionalFuelSearch");
	private By foodname			= 		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Food Name\"]");
	private By servingsize		= 		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Serving Size*\"]");
	private By servingunit		= 		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Serving Unit*\"]");
	private By calories			=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Calories(Kcal)*\"]");
//	private By proteins			= 		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Protein(g)\"]");
//	private By carbohydrates	=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Carbohydrates(g)\"]");
//	private By sugar			=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Sugar(g)\"]");
//	private By fat				=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Fat(g)\"]");
//	private By saturatedfat		= 		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Saturated Fat\"]");
//	private By dietaryfiber		=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Dietary Fiber(g)\"]");
//	private By cholesterol		=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Cholesterol(mg)\"]");
//	private By sodium			=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Sodium(mg)\"]");
//	private By iron				=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Iron(g)\"]");
//	private By calcium			=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Calcium(g)\"]");
//	private By potassium		=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Potassium(mg)\"]");
//	private By vitaminA			=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Vitamin-A(%dv)\"]");
//	private By vitaminB			=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Vitamin-C(%dv)\"]");
//	private By customfoodimage	=		AppiumBy.accessibilityId("CustomFoodImage");
//	private By gallery			=		AppiumBy.accessibilityId("GalleryClicked");
//	private By submittap		= 		AppiumBy.accessibilityId("SubmitImage");
	private By Customtick		=		AppiumBy.accessibilityId("CustomFoodSubmit");
	private By radioclick		= 		AppiumBy.accessibilityId("Urgent");
	private By submittick		=		AppiumBy.accessibilityId("ItemSubmit");
	private By lunchclick		=		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"Lunch\"`][2]");

	@Test
	@Owner("QA") // Add the @Owner annotation to specify the executor
    @Severity(SeverityLevel.NORMAL)      
	@Description("Custom Fuel screen detail verification")
    @Story("Scroll to Fuel card and verify custom food Lunch.")
	public void Fuel_Lunch_customfood() throws InterruptedException{
		try {
//		// Create an instance of AppiumUtils and pass the driver
//		AppiumappUtils appiumUtils = new AppiumappUtils(driver);
//        // Launch the app using the utility method
//        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
//		
//		WebElement Homeicon = driver.findElement(Homeclick);
//		Homeicon.click();
//		// Log console message to Allure
// 		LOGGER.info("Click on Homeicon");
// 		AllureUtils.logStep("Click on Homeicon");
// 		// Capture a screenshot and attach it to Allure
// 		AllureUtils.captureScreenshot(driver, "Case36_1");
//		 		
//		Thread.sleep(3000);
//		// Method to scroll to perform screen
//		HashMap<String,Object>scrollObject =new HashMap<>();
//		scrollObject.put("direction", "down");
//		scrollObject.put("Perform Fuel Mindful Restore", "Perform");
//		driver.executeScript("mobile:scroll", scrollObject);
//		Thread.sleep(2000);
//
//        //Click on Fuel tab 
//        driver.findElement(AppiumBy.accessibilityId("FUEL_SCREEN")).click();
//        // Log console message to Allure
//        LOGGER.info("Click on fuel screen");
//        AllureUtils.logStep("Click on fuel screen");
//        AllureUtils.captureScreenshot(driver, "Case36_2");
//        
//        scroll("down", "Lunch");
// 		Thread.sleep(2000);
// 		
//        // Locate the element related to breakfast + icon 
//        WebElement breakfastplus 	= driver.findElement(plusadd);
//        breakfastplus.click();
//        // Log console message to Allure
//        LOGGER.info("Click on breakfastplus");
//        AllureUtils.logStep("Click on breakfastplus");
//        AllureUtils.captureScreenshot(driver, "Case36_3");
//        
//        //click on keypad Done button to hide keypad
//        WebElement keypaddone	= driver.findElement(doneclick);
//        keypaddone.click();
//        // Log console message to Allure
//        LOGGER.info("Click on keypaddone");
//        AllureUtils.logStep("Click on keypaddone");
//        AllureUtils.captureScreenshot(driver, "Case36_4");
//        
//        // Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "lunchadd10");
//
//////        String searchText = "Git";
////        String searchText = "Rost";
////        int count = 1;
////        String modifiedSearchText = searchText + count + "test";
//        //  String searchText = "Git";
//        String searchText = mobileTestData.searchText;
//        //        String searchText = "Gil";
//        int count = 1;
//        String modifiedSearchText = searchText + count + "test";
//        // Loop until additempopup is visible
//        while (true) {
//            // Click on additional search list and fill searchText there
//            WebElement additionalfuel = driver.findElement(additionalsearch);
//            additionalfuel.clear();
//            additionalfuel.sendKeys(modifiedSearchText);
//
//            // Check if the element has the desired text
//            if (additionalfuel.getAttribute("value").equals(modifiedSearchText)) {
//                // Click on hybridselect
//                WebElement hybridselect = driver.findElement(AppiumBy.accessibilityId(modifiedSearchText));
//                hybridselect.click();
//             // Log console message to Allure
//                LOGGER.info("Click on hybridselect");
//                AllureUtils.logStep("Click on hybridselect");
//                AllureUtils.captureScreenshot(driver, "Case36_5");
//
//                try {
//                    // Check if additempopup is visible
//                    WebElement additempopup = driver.findElement(AppiumBy.accessibilityId("Add Item"));
//                    additempopup.click();
//                    // Break the loop as additempopup is visible now
//                    break;
//                } catch (org.openqa.selenium.NoSuchElementException e) {
//                    // Handle the absence of additempopup, navigate back to additionalfuel and continue the loop
//                    System.out.println("Add Item popup not found. Navigating back to Additional Fuel.");
//                    WebElement backbutton = driver.findElement(AppiumBy.accessibilityId("SelectedFuelBackPress"));
//                    backbutton.click();
//                    // Increment count for the next iteration
//                    count++;
//                    modifiedSearchText = searchText + count + "test"; // Update modifiedSearchText for the next iteration
//                }
//            }
//        }
//
//     // Capture a screenshot and attach it to Allure
//        AllureUtils.captureScreenshot(driver, "lunchadd11");
//        
//       // Now you can use modifiedSearchText outside the loop as well, for example:
//       WebElement Foodname = driver.findElement(foodname);
//       Foodname.sendKeys(modifiedSearchText);
//       
//       // Log console message to Allure
//       LOGGER.info("Enter valid Foodname");
//       AllureUtils.logStep("Enter valid Foodname");
//       
//       //  Locate radio button for custoom food 
//       WebElement radiocheck	= driver.findElement(radioclick);
//       radiocheck.click();
//       // Log console message to Allure
//       LOGGER.info("Click on radiocheck");
//       AllureUtils.logStep("Click on radiocheck");
//       AllureUtils.captureScreenshot(driver, "Case36_6");
//        
//        
//       // Locate the Serving size  element 
//       WebElement Servingsize	= driver.findElement(servingsize);
//       Servingsize.click();
//       // Log console message to Allure
//       LOGGER.info("Click on Servingsize");
//       AllureUtils.logStep("Click on Servingsize");
//       AllureUtils.captureScreenshot(driver, "Case36_7");
//       
//       Servingsize.sendKeys("45");
//       //click on keypad Done button to hide keypad
//       WebElement keypaddone2	= driver.findElement(doneclick);       
//       keypaddone2.click();
//       // Log console message to Allure
//       LOGGER.info("Click on keypaddone2");
//       AllureUtils.logStep("Click on keypaddone2");
//       AllureUtils.captureScreenshot(driver, "Case36_8");
// 
//       // Locate the Serving unit  element 
//       WebElement Servingunit	= driver.findElement(servingunit);
//       Servingunit.click();
//       // Log console message to Allure
//       LOGGER.info("enter value for Servingunit ");
//       AllureUtils.logStep("enter value for Servingunit");    
//       // Capture a screenshot and attach it to Allure
//       AllureUtils.captureScreenshot(driver, "Case36_9");
//       
//       Servingunit.sendKeys("cup");
//       //click on keypad Done button to hide keypad
//       WebElement keypaddone3	= driver.findElement(doneclick);       
//       keypaddone3.click();
//       // Log console message to Allure
//       LOGGER.info("Click on keypaddone3");
//       AllureUtils.logStep("Click on keypaddone3");
//       AllureUtils.captureScreenshot(driver, "Case36_10");
//       
//       // Locate the calories element  
//       WebElement Calories	= driver.findElement(calories);
//       Calories.click();
//    // Log console message to Allure
//       LOGGER.info("Click on Calories");
//       AllureUtils.logStep("Click on Calories");
//       AllureUtils.captureScreenshot(driver, "Case36_11");
//       
//       Calories.sendKeys("176");
//       WebElement keypaddone4	= driver.findElement(doneclick);       
//       keypaddone4.click();
//       // Log console message to Allure
//       LOGGER.info("Click on keypaddone4");
//       AllureUtils.logStep("Click on keypaddone4");
//       AllureUtils.captureScreenshot(driver, "Case36_12");
//       
//       // Capture a screenshot and attach it to Allure
//       AllureUtils.captureScreenshot(driver, "lunchadd12");
//
////       
////       // Locate the Proteins element  
////       WebElement Proteins	= driver.findElement(proteins);
////       Proteins.click();
////       Proteins.sendKeys("4.5");
////       WebElement keypaddone5	= driver.findElement(doneclick);       
////       keypaddone5.click();
////
////       // Locate the Carbohydrates element  
////       WebElement Carbohydrates	= driver.findElement(carbohydrates);
////       Carbohydrates.click();
////       Carbohydrates.sendKeys("37");
////       WebElement keypaddone6	= driver.findElement(doneclick);       
////       keypaddone6.click();
////       
////       // Locate the Sugar element  
////       WebElement Sugar	= driver.findElement(sugar);
////       Sugar.click();
////       Sugar.sendKeys("22");
////       WebElement keypaddone7	= driver.findElement(doneclick);       
////       keypaddone7.click();
////       
////       // Locate the Fat element  
////       WebElement Fat	= driver.findElement(fat);
////       Fat.click();
////       Fat.sendKeys("2.2");
////       WebElement keypaddone8	= driver.findElement(doneclick);       
////       keypaddone8.click();
////       
////       // Locate the Saturated Fat element  
////       WebElement SaturatedFat	= driver.findElement(saturatedfat);
////       SaturatedFat.click();
////       SaturatedFat.sendKeys("1.3");
////       WebElement keypaddone9	= driver.findElement(doneclick);       
////       keypaddone9.click();
////       
////       // Locate the Dietary Fiber element  
////       WebElement DietaryFiber	= driver.findElement(dietaryfiber);
////       DietaryFiber.click();
////       DietaryFiber.sendKeys("2.5");
////       WebElement keypaddone10	= driver.findElement(doneclick);       
////       keypaddone10.click();
////       
////       
////       // Locate the Cholesterol Fiber element  
////       WebElement Cholesterol	= driver.findElement(cholesterol);
////       Cholesterol.click();
////       Cholesterol.sendKeys("7.8");
////       WebElement keypaddone11	= driver.findElement(doneclick);       
////       keypaddone11.click();
////
////       // Locate the Sodium Fiber element  
////       WebElement Sodium	= driver.findElement(sodium);
////       Sodium.click();
////       Sodium.sendKeys("55");
////       WebElement keypaddone12	= driver.findElement(doneclick);       
////       keypaddone12.click();
////       
////       // Locate the Iron Fiber element  
////       WebElement Iron	= driver.findElement(iron);
////       Iron.click();
////       Iron.sendKeys("0.4");
////       WebElement keypaddone13	= driver.findElement(doneclick);       
////       keypaddone13.click();
////       
////       // Locate the Calcium Fiber element  
////       WebElement Calcium	= driver.findElement(calcium);
////       Calcium.click();
////       Calcium.sendKeys("139");
////       WebElement keypaddone14	= driver.findElement(doneclick);       
////       keypaddone14.click();
////       
////       // Locate the Potassium Fiber element  
////       WebElement Potassium	= driver.findElement(potassium);
////       Potassium.click();
////       Potassium.sendKeys("511.4");
////       WebElement keypaddone15	= driver.findElement(doneclick);       
////       keypaddone15.click();
////       
////       // Locate the Vitamin-A Fiber element  
////       WebElement VitaminA	= driver.findElement(vitaminA);
////       VitaminA.click();
////       VitaminA.sendKeys("2.36");
////       WebElement keypaddone16	= driver.findElement(doneclick);       
////       keypaddone16.click();
////       
////       // Locate the Vitamin-C Fiber element  
////       WebElement VitaminB	= driver.findElement(vitaminB);
////       VitaminB.click();
////       VitaminB.sendKeys("0.36");
////       WebElement keypaddone17	= driver.findElement(doneclick);       
////       keypaddone17.click();
////       
////       // Locate and click on Foodimage 
////       WebElement Customfoodimage	= driver.findElement(customfoodimage);
////       Customfoodimage.click();
////     
////       WebElement galleryclick	= driver.findElement(gallery);
////       galleryclick.click();
////       
////       WebElement firstPhoto = driver.findElement(AppiumBy.xpath("//XCUIElementTypeImage[2]"));
////       firstPhoto.click();
////       
////       Thread.sleep(3500);
////       WebElement Submittap = driver.findElement(submittap);
////       Submittap.click();
////       Thread.sleep(3500);
//       
//        WebElement Customfoodtick	= driver.findElement(Customtick);
//        Customfoodtick.click();
//        // Log console message to Allure
//        LOGGER.info("Click on Customfoodtick");
//        AllureUtils.logStep("Click on Customfoodtick");
//        AllureUtils.captureScreenshot(driver, "Case36_13");
//		
//        Thread.sleep(3500);
        

			// Create an instance of AppiumUtils and pass the driver
			AppiumappUtils appiumUtils = new AppiumappUtils(driver);
	        // Launch the app using the utility method
	        appiumUtils.launchAppWithPackageId("com.cuesz.mobile");	
			
			WebElement Homeicon = driver.findElement(mobileLocators.Homeclick);
			Homeicon.click();
			// Log console message to Allure
			LOGGER.info("Click on home menu from bottom");
			AllureUtils.logStep("Click on home menu from bottom");
			// Capture a screenshot and attach it to Allure
			AllureUtils.captureScreenshot(driver, "Case26_1");
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
	        AllureUtils.captureScreenshot(driver, "Case26_2");
	        
	        
	        // Locate the element related to breakfast + icon 
	        WebElement breakfastplus 	= driver.findElement(mobileLocators.plusadd);
	        breakfastplus.click();
	        // Log console message to Allure
	        LOGGER.info("Click on breakfastplus icon");
	        AllureUtils.logStep("Click on breakfastplus icon");
	        AllureUtils.captureScreenshot(driver, "Case26_3");
	        
	        
	        //click on keypad Done button to hide keypad
	        WebElement keypaddone	= driver.findElement(mobileLocators.doneclick);
	        keypaddone.click();
	        // Log console message to Allure
	        LOGGER.info("Click on keypaddone icon");
	        AllureUtils.logStep("Click on keypaddone icon");
	        AllureUtils.captureScreenshot(driver, "Case26_4");
	        

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
	            // Log console message to Allure
	            LOGGER.info("Enter additonals fuel values" );
	            AllureUtils.logStep("Enter additonals fuel values");
	            
	            Thread.sleep(2000);
	            // Check if the element has the desired text
	            if (additionalfuel.getAttribute("value").equals(modifiedSearchText)) {
	                // Click on hybridselect
	                WebElement hybridselect = driver.findElement(AppiumBy.accessibilityId(modifiedSearchText));
	                hybridselect.click();
//	            	Thread.sleep(2000);
//	            	WebElement hybridselect = driver.findElement(AppiumBy.xpath("//XCUIElementTypeOther[@name='" + modifiedSearchText + "']"));
//	            	hybridselect.click();
	                // Log console message to Allure
	                LOGGER.info("Click on hybrid select" );
	                AllureUtils.logStep("Click on hybrid select	");

	                try {
	                    // Check if additempopup is visible
	                    WebElement additempopup = driver.findElement(AppiumBy.accessibilityId("Add Item"));
	                    Thread.sleep(2000);
	                    additempopup.click();
	                    // Log console message to Allure
	                    LOGGER.info("Click on additempopup" );
	                    AllureUtils.logStep("Click on additempopup	");
	                    
	                    // Break the loop as additempopup is visible now
	                    break;
	                } catch (org.openqa.selenium.NoSuchElementException e) {
	                    // Handle the absence of additempopup, navigate back to additionalfuel and continue the loop
	                    System.out.println("Add Item popup not found. Navigating back to Additional Fuel.");
	                    WebElement backbutton = driver.findElement(AppiumBy.accessibilityId("SelectedFuelBackPress"));
	                    Thread.sleep(2000);
	                    backbutton.click();
	                    
	                    // Log console message to Allure
	                    LOGGER.info("Click on backbutton" );
	                    AllureUtils.logStep("Click on backbutton");
	                    // Increment count for the next iteration
	                    count++;
	                    modifiedSearchText = searchText + count + "test"; // Update modifiedSearchText for the next iteration
	                }
	            }
	        }
	        Thread.sleep(2000);
	        // Now you can use modifiedSearchText outside the loop as well, for example:
	        WebElement Foodname = driver.findElement(mobileLocators.foodname);
	        Foodname.sendKeys(modifiedSearchText);
	        // Log console message to Allure
	        LOGGER.info("Enter values for Food name" );
	        AllureUtils.logStep("Enter values for Food name");
	        Thread.sleep(2000);
	       // Locate the Serving size  element 
	       WebElement Servingsize	= driver.findElement(mobileLocators.servingsize);
	       Servingsize.click();
	       // Log console message to Allure
	       LOGGER.info("enter value for serving size  ");
	       AllureUtils.logStep("enter value for serving size ");    
	       // Capture a screenshot and attach it to Allure
	       AllureUtils.captureScreenshot(driver, "Case265");
	       Thread.sleep(2000);
	       Servingsize.sendKeys(mobileTestData.Servingsize);
	       
	       Thread.sleep(2000);
	       //click on keypad Done button to hide keypad
	       WebElement keypaddone2	= driver.findElement(mobileLocators.doneclick);       
	       keypaddone2.click();
	       // Log console message to Allure
	       LOGGER.info("Click on keypaddone2 icon");
	       AllureUtils.logStep("Click on keypaddone2 icon");
	       AllureUtils.captureScreenshot(driver, "Case26_5");
	 
	       
	       Thread.sleep(2000);
	       // Locate the Serving unit  element 
	       WebElement Servingunit	= driver.findElement(mobileLocators.servingunit);
	       Servingunit.click();
	       // Log console message to Allure
	       LOGGER.info("enter value for Servingunit ");
	       AllureUtils.logStep("enter value for Servingunit");    
	       // Capture a screenshot and attach it to Allure
	       AllureUtils.captureScreenshot(driver, "Case266");
	       Thread.sleep(2000);
	       Servingunit.sendKeys(mobileTestData.Servingunit);
	       //click on keypad Done button to hide keypad
	       WebElement keypaddone3	= driver.findElement(mobileLocators.doneclick);       
	       keypaddone3.click();
	       // Log console message to Allure
	       LOGGER.info("Click on done icon");
	       AllureUtils.logStep("Click on done icon");
	       AllureUtils.captureScreenshot(driver, "Case26_6");
	       Thread.sleep(2000);
	       // Locate the calories element  
	       WebElement Calories	= driver.findElement(mobileLocators.calories);
	       Calories.click();
	       Thread.sleep(2000);
	       Calories.sendKeys(mobileTestData.Calories);
	       WebElement keypaddone4	= driver.findElement(mobileLocators.doneclick);       
	       keypaddone4.click();
	       // Log console message to Allure
	       LOGGER.info("Click on done icon");
	       AllureUtils.logStep("Click on done icon");
	       AllureUtils.captureScreenshot(driver, "Case26_7");
	       
	       // Locate the Proteins element  
	       WebElement Proteins	= driver.findElement(mobileLocators.proteins);
	       Proteins.click();
	       // Log console message to Allure
	       LOGGER.info("Click on Proteins");
	       AllureUtils.logStep("Click on Proteins");
	       AllureUtils.captureScreenshot(driver, "Case26_8");
	       Thread.sleep(2000);
	       Proteins.sendKeys(mobileTestData.Proteins);
	       Thread.sleep(2000);
	       WebElement keypaddone5	= driver.findElement(mobileLocators.doneclick);       
	       keypaddone5.click();
	       // Log console message to Allure
	       LOGGER.info("Click on done icon");
	       AllureUtils.logStep("Click on done icon");
	       AllureUtils.captureScreenshot(driver, "Case26_9");
	       Thread.sleep(2000);
	       // Locate the Carbohydrates element  
	       WebElement Carbohydrates	= driver.findElement(mobileLocators.carbohydrates);
	       Carbohydrates.click();
	       // Log console message to Allure
	       LOGGER.info("Click on Carbohydrates");
	       AllureUtils.logStep("Click on Carbohydrates");
	       AllureUtils.captureScreenshot(driver, "Case26_10");
	       Thread.sleep(2000);
	       Carbohydrates.sendKeys(mobileTestData.Carbohydrates);
	       WebElement keypaddone6	= driver.findElement(mobileLocators.doneclick);       
	       keypaddone6.click();
	       // Log console message to Allure
	       LOGGER.info("Click on done icon");
	       AllureUtils.logStep("Click on done icon");
	       AllureUtils.captureScreenshot(driver, "Case26_11");
	       Thread.sleep(2000);
	       // Locate the Sugar element  
	       WebElement Sugar	= driver.findElement(mobileLocators.sugar);
	       Sugar.click();
	       Sugar.sendKeys(mobileTestData.Sugar);
	       WebElement keypaddone7	= driver.findElement(mobileLocators.doneclick);       
	       Thread.sleep(2000);
	       keypaddone7.click();
	       // Log console message to Allure
	       LOGGER.info("Click on done icon");
	       AllureUtils.logStep("Click on done icon");
	       AllureUtils.captureScreenshot(driver, "Case26_12");
	       Thread.sleep(2000);
	       // Locate the Fat element  
	       WebElement Fat	= driver.findElement(mobileLocators.fat);
	       Fat.click();
	       Thread.sleep(2000);
	       Fat.sendKeys(mobileTestData.Fat);
	       WebElement keypaddone8	= driver.findElement(mobileLocators.doneclick);       
	       keypaddone8.click();
	       // Log console message to Allure
	       LOGGER.info("Click on done icon");
	       AllureUtils.logStep("Click on done icon");
	       AllureUtils.captureScreenshot(driver, "Case26_13");
	       Thread.sleep(2000);
	       // Locate the Saturated Fat element  
	       WebElement SaturatedFat	= driver.findElement(mobileLocators.saturatedfat);
	       SaturatedFat.click();
	       Thread.sleep(2000);
	       // Log console message to Allure
	       LOGGER.info("Click on SaturatedFat");
	       AllureUtils.logStep("Click on SaturatedFat");
	       AllureUtils.captureScreenshot(driver, "Case26_12");
	       SaturatedFat.sendKeys(mobileTestData.SaturatedFat);
	       WebElement keypaddone9	= driver.findElement(mobileLocators.doneclick);       
	       keypaddone9.click();
	       // Log console message to Allure
	       LOGGER.info("Click on done icon");
	       AllureUtils.logStep("Click on done icon");
	       Thread.sleep(2000);
	       // Locate the Dietary Fiber element  
	       WebElement DietaryFiber	= driver.findElement(mobileLocators.dietaryfiber);
	       DietaryFiber.click();
	       Thread.sleep(2000);
	       // Log console message to Allure
	       LOGGER.info("Click on SaturatedFat");
	       AllureUtils.logStep("Click on SaturatedFat");
	       AllureUtils.captureScreenshot(driver, "Case26_13");
	       DietaryFiber.sendKeys(mobileTestData.DietaryFiber);
	       WebElement keypaddone10	= driver.findElement(mobileLocators.doneclick);       
	       keypaddone10.click();
	       Thread.sleep(2000);             
	       // Locate the Cholesterol Fiber element  
	       WebElement Cholesterol	= driver.findElement(mobileLocators.cholesterol);
	       Cholesterol.click();
	       // Log console message to Allure
	       LOGGER.info("Click on Cholesterol");
	       AllureUtils.logStep("Click on Cholesterol");
	       AllureUtils.captureScreenshot(driver, "Case26_14");
	       Cholesterol.sendKeys(mobileTestData.Cholesterol);
	       Thread.sleep(2000);
	       WebElement keypaddone11	= driver.findElement(mobileLocators.doneclick);        
	       keypaddone11.click();
	       // Log console message to Allure
	       LOGGER.info("Click on done icon");
	       AllureUtils.logStep("Click on done icon");
	       Thread.sleep(2000);
	       // Locate the Sodium Fiber element  
	       WebElement Sodium	= driver.findElement(mobileLocators.sodium);
	       Sodium.click();
	       // Log console message to Allure
	       LOGGER.info("Click on Sodium");
	       AllureUtils.logStep("Click on Sodium");
	       AllureUtils.captureScreenshot(driver, "Case26_15");
	       Thread.sleep(2000);
	       Sodium.sendKeys(mobileTestData.Sodium);
	       WebElement keypaddone12	= driver.findElement(mobileLocators.doneclick);        
	       keypaddone12.click();
	       // Log console message to Allure
	       LOGGER.info("Click on done icon");
	       AllureUtils.logStep("Click on done icon");
	       Thread.sleep(2000);
	       // Locate the Iron Fiber element  
	       WebElement Iron	= driver.findElement(mobileLocators.iron);
	       Iron.click();
	       Thread.sleep(2000);
	       Iron.sendKeys(mobileTestData.Iron);
	       WebElement keypaddone13	= driver.findElement(mobileLocators.doneclick);        
	       keypaddone13.click();
	       // Log console message to Allure
	       LOGGER.info("Click on done icon");
	       AllureUtils.logStep("Click on done icon");
	       Thread.sleep(2000);
	       // Locate the Calcium Fiber element  
	       WebElement Calcium	= driver.findElement(mobileLocators.calcium);
	       Calcium.click();
	       // Log console message to Allure
	       LOGGER.info("Click on Calcium");
	       AllureUtils.logStep("Click on Calcium");
	       AllureUtils.captureScreenshot(driver, "Case26_17");
	       Calcium.sendKeys(mobileTestData.Calcium);
	       Thread.sleep(2000);
	       WebElement keypaddone14	= driver.findElement(mobileLocators.doneclick);        
	       keypaddone14.click();
	       // Log console message to Allure
	       LOGGER.info("Click on done icon");
	       AllureUtils.logStep("Click on done icon");
	       Thread.sleep(2000);
	       // Locate the Potassium Fiber element  
	       WebElement Potassium	= driver.findElement(mobileLocators.potassium);
	       Thread.sleep(2000);
	       Potassium.click();
	       // Log console message to Allure
	       LOGGER.info("Click on Potassium");
	       AllureUtils.logStep("Click on Potassium");
	       AllureUtils.captureScreenshot(driver, "Case26_18");
	       Potassium.sendKeys(mobileTestData.Potassium);
	       WebElement keypaddone15	= driver.findElement(mobileLocators.doneclick);        
	       keypaddone15.click();
	       // Log console message to Allure
	       LOGGER.info("Click on done icon");
	       AllureUtils.logStep("Click on done icon");
	       Thread.sleep(2000);
	       // Locate the Vitamin-A Fiber element  
	       WebElement VitaminA	= driver.findElement(mobileLocators.vitaminA);
	       VitaminA.click();
	       // Log console message to Allure
	       LOGGER.info("Click on VitaminA");
	       AllureUtils.logStep("Click on VitaminA");
	       AllureUtils.captureScreenshot(driver, "Case26_19");
	       Thread.sleep(2000);
	       VitaminA.sendKeys(mobileTestData.VitaminA);
	       WebElement keypaddone16	= driver.findElement(mobileLocators.doneclick);        
	       keypaddone16.click();
	       // Log console message to Allure
	       LOGGER.info("Click on done icon");
	       AllureUtils.logStep("Click on done icon");
	       Thread.sleep(2000);
	       // Locate the Vitamin-C Fiber element  
	       WebElement VitaminB	= driver.findElement(mobileLocators.vitaminB);
	       VitaminB.click();
	       // Log console message to Allure
	       LOGGER.info("Click on VitaminB");
	       AllureUtils.logStep("Click on VitaminB");
	       AllureUtils.captureScreenshot(driver, "Case26_20");
	       VitaminB.sendKeys(mobileTestData.VitaminB);
	       WebElement keypaddone17	= driver.findElement(mobileLocators.doneclick);        
	       keypaddone17.click();
	       // Log console message to Allure
	       LOGGER.info("Click on done icon");
	       AllureUtils.logStep("Click on done icon");
	       Thread.sleep(2000);
	       // Locate and click on Foodimage 
//	       WebElement Customfoodimage	= driver.findElement(mobileLocators.customfoodimage);
//	       Customfoodimage.click();
//	       // Log console message to Allure
//	       LOGGER.info("Click on Customfoodimage");
//	       AllureUtils.logStep("Click on Customfoodimage");
//	       AllureUtils.captureScreenshot(driver, "Case26_21");
//	       Thread.sleep(2000);
//	       WebElement galleryclick	= driver.findElement(mobileLocators.gallery);
//	       galleryclick.click();
//	       // Log console message to Allure
//	       LOGGER.info("Click on galleryclick");
//	       AllureUtils.logStep("Click on galleryclick");
//	       AllureUtils.captureScreenshot(driver, "Case26_22");
//	       Thread.sleep(2000);
//	       WebElement firstPhoto = driver.findElement(AppiumBy.xpath("//XCUIElementTypeImage[2]"));
//	       firstPhoto.click();
//	       Thread.sleep(2000);
//	       Thread.sleep(3500);
//	       WebElement Submittap = driver.findElement(mobileLocators.submittap);
//	       Submittap.click();
//	       // Log console message to Allure
//	       LOGGER.info("Click on Submittap");
//	       AllureUtils.logStep("Click on Submittap");
//	       AllureUtils.captureScreenshot(driver, "Case26_23");
//	       Thread.sleep(3500);
//	       Thread.sleep(2000);
	       
	        WebElement Customfoodtick	= driver.findElement(mobileLocators.Customtick);
	        Customfoodtick.click();
	        Thread.sleep(2000);
	        // Log console message to Allure
	        LOGGER.info("Click on Customfoodtick");
	        AllureUtils.logStep("Click on Customfoodtick");
	        AllureUtils.captureScreenshot(driver, "Case26_24");
			
	        Thread.sleep(3500);
	        
        
        WebElement Lunchclick	= driver.findElement(lunchclick);
        Lunchclick.click();
        
        // Capture a screenshot and attach it to Allure
        AllureUtils.captureScreenshot(driver, "lunchadd13");
        
        WebElement editsubmit 	= driver.findElement(submittick);
		editsubmit.click();
		// Log console message to Allure
	   LOGGER.info("Click on editsubmit");
	   AllureUtils.logStep("Click on editsubmit");
	   AllureUtils.captureScreenshot(driver, "Case36_14");
		
	   Thread.sleep(2500);
		 scroll("down", "Lunch");

		 Thread.sleep(2500);
	 		
	 		 // Capture a screenshot and attach it to Allure
	        AllureUtils.captureScreenshot(driver, "lunchadd14");
        
	        Thread.sleep(3500);
		 } catch (Exception e) {
	            LOGGER.error("An error occurred during the cases ", e);
	            AllureUtils.logStep("An error occurred: " + e.getMessage());
	        } finally {
	            // Terminate the app whether the test passed or failed
	            try {
	                Thread.sleep(8500);
	            } catch (InterruptedException e) {
	                LOGGER.error("Thread interrupted during final sleep", e);
	                Thread.currentThread().interrupt();
	            }
	            driver.terminateApp("com.cuesz.mobile");
	        }
	    }

	 private void scroll(String direction, String elementName) {
	        HashMap<String, Object> scrollObject = new HashMap<>();
	        scrollObject.put("direction", direction);
	        scrollObject.put(elementName, elementName);
	        driver.executeScript("mobile:scroll", scrollObject);
	    }

}
	