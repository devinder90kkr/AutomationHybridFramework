package cuesz.mobile.resources;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.appium.java_client.AppiumBy;
import cuesz.allure.reporting.AllureUtils;

public class CustomFoodScreenUtils {
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomFoodScreenUtils.class);

    private WebDriver driver;
    public CustomFoodScreenUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void addCustomFood(String searchText) throws InterruptedException {
    //  String searchText = "Git";
//        String searchText1 = mobileTestData.searchText;
    	 // Generate a unique name
        String searchText1 = generateUniqueName();
        //        String searchText = "Gil";
        int count = 1;
        String modifiedSearchText = searchText1 + count + "test";

        // Loop until additempopup is visible
        while (true) {
            // Click on additional search list and fill searchText there
            WebElement additionalfuel = driver.findElement(mobileLocators.additionalsearch);
            additionalfuel.clear();
            additionalfuel.sendKeys(modifiedSearchText);
           
            AllureUtils.logStep("Enter additonals fuel values");
            
            Thread.sleep(2000);
            // Check if the element has the desired text
            if (additionalfuel.getAttribute("value").equals(modifiedSearchText)) {
                // Click on hybridselect
                WebElement hybridselect = driver.findElement(AppiumBy.accessibilityId(modifiedSearchText));
                hybridselect.click();
//            	Thread.sleep(2000);
//            	WebElement hybridselect = driver.findElement(AppiumBy.xpath("//XCUIElementTypeOther[@name='" + modifiedSearchText + "']"));
//            	hybridselect.click();
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
                    modifiedSearchText = searchText1 + count + "test"; // Update modifiedSearchText for the next iteration
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

        //Locate urgent radio for view all fields
        WebElement urgentoption	= driver.findElement(mobileLocators.urgenticon);
        urgentoption.click();
        urgentoption.click();
     // Log console message to Allure
        LOGGER.info("Click on urgentoption for custom food" );
        AllureUtils.logStep("Click on urgentoption for custom food");
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
 
       
//       Thread.sleep(2000);
//       // Locate the Serving unit  element 
//       WebElement Servingunit	= driver.findElement(mobileLocators.servingunit);
//       Servingunit.click();
//       // Log console message to Allure
//       LOGGER.info("enter value for Servingunit ");
//       AllureUtils.logStep("enter value for Servingunit");    
//       // Capture a screenshot and attach it to Allure
//       AllureUtils.captureScreenshot(driver, "Case266");
//       Thread.sleep(2000);
//       Servingunit.sendKeys(mobileTestData.Servingunit);
//       //click on keypad Done button to hide keypad
//       WebElement keypaddone3	= driver.findElement(mobileLocators.doneclick);       
//       keypaddone3.click();
//       // Log console message to Allure
//       LOGGER.info("Click on done icon");
//       AllureUtils.logStep("Click on done icon");
//       AllureUtils.captureScreenshot(driver, "Case26_6");
//       Thread.sleep(2000);
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
//       // Locate and click on Foodimage 
//       WebElement Customfoodimage	= driver.findElement(mobileLocators.customfoodimage);
//       Customfoodimage.click();
//       // Log console message to Allure
//       LOGGER.info("Click on Customfoodimage");
//       AllureUtils.logStep("Click on Customfoodimage");
//       AllureUtils.captureScreenshot(driver, "Case26_21");
//       Thread.sleep(2000);
//       WebElement galleryclick	= driver.findElement(mobileLocators.gallery);
//       galleryclick.click();
//       // Log console message to Allure
//       LOGGER.info("Click on galleryclick");
//       AllureUtils.logStep("Click on galleryclick");
//       AllureUtils.captureScreenshot(driver, "Case26_22");
//       Thread.sleep(2000);
//       WebElement firstPhoto = driver.findElement(AppiumBy.xpath("//XCUIElementTypeImage[2]"));
//       firstPhoto.click();
//       Thread.sleep(2000);
//       Thread.sleep(3500);
//       WebElement Submittap = driver.findElement(mobileLocators.submittap);
//       Submittap.click();
//       // Log console message to Allure
//       LOGGER.info("Click on Submittap");
//       AllureUtils.logStep("Click on Submittap");
//       AllureUtils.captureScreenshot(driver, "Case26_23");
//       Thread.sleep(3500);
       Thread.sleep(2000);
       
        WebElement Customfoodtick	= driver.findElement(mobileLocators.Customtick);
        Customfoodtick.click();
        Thread.sleep(2000);
        // Log console message to Allure
        LOGGER.info("Click on Customfoodtick");
        AllureUtils.logStep("Click on Customfoodtick");
        AllureUtils.captureScreenshot(driver, "Case26_24");
    }
    


private String generateUniqueName() {
    // Generate a unique name using timestamp and random number
    String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
    int randomNum = new Random().nextInt(1000);
    return "Food_" + timestamp + "_" + randomNum;
}}