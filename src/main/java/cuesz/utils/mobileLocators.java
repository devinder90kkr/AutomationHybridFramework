package cuesz.utils;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumBy;

public class mobileLocators {


	/****Dated : 20-Dec perform cases locators*****/
	//Case02_Homescreen_sphereclick
	public static final By Homeclick 		= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	public static final By performlbale 	= AppiumBy.xpath("//XCUIElementTypeOther[starts-with(@name, 'Perform ')]");
	public static final By fuelable 		= AppiumBy.xpath("//XCUIElementTypeOther[starts-with(@name, 'Fuel ')]");
	public static final By mindulable 		= AppiumBy.xpath("//XCUIElementTypeOther[starts-with(@name, 'Mindful ')]");
	public static final By Restorlabel 		= AppiumBy.xpath("//XCUIElementTypeOther[starts-with(@name, 'Restore ')]");
	public static final By backbttnperform 	= AppiumBy.iOSNsPredicateString("name == 'SeparateSphereBackPress'");
	
	// Case03_Homescreen_sphere
	public static final By separtorclick 		= AppiumBy.iOSNsPredicateString("name == 'CombineSphere'");
	public static final By combinesphereclick  	= AppiumBy.iOSNsPredicateString("name == 'SeprateSphere'");
	
	//Case05_Homescreen_forward_backwardarrows
	public static final By backarrowbttn 		= AppiumBy.accessibilityId("HomeBackArrow");
	public static final By forwardarrowbttn 	= AppiumBy.accessibilityId("HomeForwardArrow");
	
	//Case06_Homescreen
	public static final By Performlabel 		= AppiumBy.iOSNsPredicateString("name == 'Perform'");
	public static final By Fuelable 			= AppiumBy.iOSNsPredicateString("name == 'Fuel'");
	public static final By Mindflable  			= AppiumBy.iOSNsPredicateString("name == 'Mindful'");
	public static final By Restorelabel 		= AppiumBy.iOSNsPredicateString("name == 'Restore'");	
	
	//Case07_Homescreen_scroller
	public static final By HomeScrollDown		= AppiumBy.accessibilityId("HomeScrollDown");	
	public static final By HomeScrollup			= AppiumBy.accessibilityId("HomeScrollUp");	
	
	//Case08_Homescreen_notification
	public static final By notificlick			= AppiumBy.accessibilityId("notificationIcon");
	
	//Case09_Homescreen_LPgretherthan15min
	public static final  By liveperfrmicon		= AppiumBy.accessibilityId("HomeScreenLPIcon");
	
	// 21-dec-2023 
	public static final By performclick				= AppiumBy.accessibilityId("PERFORM_SCREEN");
	public static final By walkinlabel				= AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"Walking\"]");
	public static final By walkingstart				= AppiumBy.accessibilityId("Walking Start");
	public static final By backpressbutton			= AppiumBy.accessibilityId("BackPress");
	public static final By Syncclick				= AppiumBy.accessibilityId("SyncDevice");
	public static final By Enabletick				= AppiumBy.accessibilityId("EnableBluetooth");
	public static final By deviation				= AppiumBy.accessibilityId("AddDeviation");
	public static final By Crossclick				= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"CrossClicked\"`][2]");
	public static final By lessthanprecribeclick	= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Less Than Prescribed\"`][3]");
	public static final By morethanprecribeclick	= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"More Than Prescribed\"`][3]");
	public static final By Injury					= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"ItemPressed\"])[4]");
	public static final By Noteclick				= AppiumBy.accessibilityId("Notes");
	public static final By tickclick				= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"Submit\"])[2]");
	public static final By Donetap					= AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"DONE\"`]");
//	public static final By tickbttn					= AppiumBy.accessibilityId("Submit");
	public static final By nobttn					= AppiumBy.accessibilityId("No");
	public static final By yesbttn					= AppiumBy.accessibilityId("Yes");
	public static final By crossicon				= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"CrossClicked\"`][4]");	
	public static final By Scro1					= AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"4\"`][1]");
	public static final By Scro2					= AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"6\"`][1]");
	public static final By Scro3					= AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"2\"`][1]");
	public static final By Scro4					= AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"8\"`][1]");
	public static final By sesson1					= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"2\"`][6]");
	public static final By sesson2					= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"3\"`][6]");
	public static final By sesson3					= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"5\"`][6]");
	public static final By noteclcik				= AppiumBy.accessibilityId("Notes");
	public static final By donebttn 				= AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"DONE\"`]");
	public static final By tick 					= AppiumBy.accessibilityId("Submit");
	public static final By graphclick				= AppiumBy.accessibilityId("WalkingGraphIcon");
	public static final By graphclse				= AppiumBy.accessibilityId("CrossClicked");
	public static final By importicon				= AppiumBy.accessibilityId("WalkingImportIcon");
	public static final By importlatericon			= AppiumBy.accessibilityId("Import later");
	public static final By deviationicon			= AppiumBy.accessibilityId("WalkingDeviationIcon");
	public static final By crossicondeviation		= AppiumBy.accessibilityId("CrossClicked");
	public static final By syncdevicebttn			= AppiumBy.iOSNsPredicateString("name == \"Sync my device\"");
	public static final By rhytmtextverification	= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Rhythm 24 1091\"`][2]");
	public static final By rhytmtextlabelsyncedverification	=	AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Rhythm 24 1091 Synced\"`]");
	public static final By startperform				= AppiumBy.accessibilityId("StartPerformActivity");
	public static final By synclaterbttn 			= AppiumBy.accessibilityId("Sync Later");			
	public static final By rhytmtextlabel			= AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Sync my device\"`]"); 
	public static final By crossiconrecording		= AppiumBy.accessibilityId("Start Recording CrossClicked");

	// Case13_Perform_additionalactivity
	public static final By submiticon				= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"Submit\"])[2]");
	public static final By hourstap					= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"00\"])[2]");
	public static final By minutestap				= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"03\"])[2]");
	
	// Case14_Perform_performalreadycompleted
	public static final By performcompleted			= AppiumBy.accessibilityId("Perform Activity Already Completed");
	public static final By activityfield			= AppiumBy.accessibilityId("Type Here");
	public static final By activityfield1			= AppiumBy.accessibilityId("EnterActivityName");
	public static final By letter1					= AppiumBy.accessibilityId("B");
	public static final By letter2					= AppiumBy.accessibilityId("o");
	public static final By letter3					= AppiumBy.accessibilityId("x");
	public static final By letter4					= AppiumBy.accessibilityId("i");
	public static final By letter5					= AppiumBy.accessibilityId("n");
	public static final By letter6 					= AppiumBy.accessibilityId("g");
	public static final By Selectoption				= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Boxing\"`][3]");
	public static final By starttme					= AppiumBy.accessibilityId("Start");
	public static final By Endtme					= AppiumBy.accessibilityId("End");
	public static final By Submitclick				= AppiumBy.accessibilityId("Submit");
	public static final By deleteboxing				= AppiumBy.accessibilityId("BoxingDeleteIcon");
	public static final By importicon1				= AppiumBy.accessibilityId("BoxingImportIcon");
	public static final By graphclick1				= AppiumBy.accessibilityId("BoxingGraphIcon");	
	
	
	public static final By perfomplus			= AppiumBy.accessibilityId("AddEvent");
	public static final By additionalperform	= AppiumBy.accessibilityId("Start My Perform Activity");
	public static final By cross_additionalpopup= AppiumBy.accessibilityId("CrossClicked");
	public static final By searcharea			= AppiumBy.accessibilityId("EnterActivityName");
	public static final By selectactivity		= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"Baseball \"])[3]");
	public static final By deletebaseball		= AppiumBy.accessibilityId("Baseball DeleteIcon");
	public static final By nodelete 			= AppiumBy.accessibilityId("No");
	public static final By yesdelete 			= AppiumBy.accessibilityId("Yes");
	public static final By backclick			= AppiumBy.accessibilityId("BackPress");
	
	// Case15_Perform_movetocurrent  Dated- 22 Dec
	public static final By movetoday1		= AppiumBy.accessibilityId("Move to Today");
	public static final By startclick 		= AppiumBy.iOSNsPredicateString("label == \"Start\"");
	
	// Case16_Perform_Vo2
	public static final By Vo2label 		= AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"VO2 Max Test\"`]");
	public static final By vo2tap			= AppiumBy.accessibilityId("VO2 Max Test Start");
	public static final By Ticktap			= AppiumBy.accessibilityId("Submit");
	public static final By okatap			= AppiumBy.accessibilityId("Allow");
	public static final By Vo2label1		= AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"VO2 Max Test\"]");
	public static final By count			= AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"06:00\"]");
	public static final By synclick			= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"SyncDevice\"])[2]");
	public static final By Startbutton		= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"Start\n"
			+ "VO2 Test\"])[2]");
	public static final By currentweighttap = AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`label == \"Current Weight\"`]");
	public static final By enterweight		= AppiumBy.accessibilityId("EnterWeight");
	public static final By deletetap		= AppiumBy.accessibilityId("Delete");
	public static final By num1 			= AppiumBy.accessibilityId("8");
	public static final By num2 			= AppiumBy.accessibilityId("6");
	public static final By num3 			= AppiumBy.accessibilityId(".");
	public static final By num4 			= AppiumBy.accessibilityId("0");
	public static final By num5 			= AppiumBy.accessibilityId("5");
    
	//Case17_Perform_LivePerformcurrent 
	public static final By liveperform		= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Start\n"
			+ "Live Perform\"`][2]");
	//Case18_Perform_nextweekactivity
	public static final By arrowclick		= 		AppiumBy.accessibilityId("HomeForwardArrow");

	public static final By Liveclick		= 		AppiumBy.iOSNsPredicateString("label == \"Live Perform Schedule\"");
	
	//14-Dec-2021 Fuel cases locators
	public static final By preicon			=		AppiumBy.iOSNsPredicateString("name == \"Pre PerformancePlueIcon\"");
	public static final By preicon1			=		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Basketball -PlueIcon\"`][1]");
	public static final By doneclick		= 		AppiumBy.accessibilityId("Done");
	public static final By recommendedclick	= 		AppiumBy.accessibilityId("AddRecommendedFuel");
	public static final By headingpre		=		AppiumBy.accessibilityId("Pre");
	public static final By tickaction		= 		AppiumBy.accessibilityId("RecommendedFuelSubmit");
	public static final By Time				= 		AppiumBy.accessibilityId("RecommendedFuelTime");
	public static final By pickerelement	= 		AppiumBy.xpath("//XCUIElementTypePickerWheel");
	public static final By Doneclick		= 		AppiumBy.accessibilityId("AlcohalTime");
	public static final By brekdone			= 		AppiumBy.accessibilityId("Done");
	public static final By duringicon		=		AppiumBy.iOSNsPredicateString("name == \"During PerformancePlueIcon\"");
	public static final By during1heading	=		AppiumBy.accessibilityId("During");
	public static final By posticon			=		AppiumBy.iOSNsPredicateString("name == \"Post PerformancePlueIcon\"");
	public static final By postheading		=		AppiumBy.accessibilityId("Post");
	public static final By uploadicon1		=		AppiumBy.accessibilityId("During PerformanceUploadIcon");
	public static final By meat1			=		AppiumBy.iOSNsPredicateString("name == \"Meat\"");
	public static final By meatfuelselect	=		AppiumBy.accessibilityId("Meat");	
	public static final By performanceeditsubmit =	AppiumBy.accessibilityId("Submit");

	public static final By meatplus			= 		AppiumBy.accessibilityId("MeatPlus");
	public static final By serchclick		= 		AppiumBy.accessibilityId("AdditionalFuelSearch");
	public static final By Beetroot			=		AppiumBy.iOSNsPredicateString("name == \"Beetroot\"");
	
	
	public static final By additionalsearch	= 		AppiumBy.accessibilityId("AdditionalFuelSearch");
	public static final By faggot			=		AppiumBy.iOSNsPredicateString("name == \"Faggot\"");
	public static final By fagoticon		= 		AppiumBy.accessibilityId("FaggotFuelItemInfo");
	public static final By backtap			= 		AppiumBy.accessibilityId("BackPress");
	public static final By fagotplus		= 		AppiumBy.accessibilityId("FaggotPlus");
	public static final By submitick		= 		AppiumBy.accessibilityId("ItemSubmit");	

	public static final By postplusicon		=		AppiumBy.accessibilityId("Post PerformancePlueIcon");
	public static final By SanXian			= 		AppiumBy.iOSNsPredicateString("name == \"Di San Xian\"");
	public static final By fernfuel			= 		AppiumBy.accessibilityId("Fern");
	public static final By submitclick		=		AppiumBy.accessibilityId("ItemSubmit");
	public static final By infoclick		=		AppiumBy.accessibilityId("Post PerformanceInfoIcon");	
	public static final By backbttn			=		AppiumBy.accessibilityId("BackPress");
	public static final By showclikc		=		AppiumBy.accessibilityId("Show More");
	public static final By vodkafuel		=		AppiumBy.accessibilityId("Vodka");
	public static final By additionalsearch1=		AppiumBy.iOSNsPredicateString("label == \"Search Fuel to log\" AND name == \"AdditionalFuelSearch\"");
	public static final By Uploadimage		=		AppiumBy.accessibilityId("Post PerformanceUploadIcon");
	public static final By gallery			=		AppiumBy.accessibilityId("GalleryClicked");
	public static final By submittap		= 		AppiumBy.accessibilityId("SubmitImage");
	
	public static final By duringplusicon	=		AppiumBy.accessibilityId("During PerformancePlueIcon");
	public static final By jimmie			= 		AppiumBy.iOSNsPredicateString("name == \"Jimmies\"");
	public static final By Showclick		= 		AppiumBy.iOSNsPredicateString("name == \"Show More\"");
	public static final By cognpate			= 		AppiumBy.accessibilityId("Cognac Pate");
		
	public static final By addeventlabel	= 		AppiumBy.iOSNsPredicateString("label == \"Add An Event\"");
	public static final By eventbttn		=		AppiumBy.accessibilityId("AddEvent");
	public static final By eventcross		=		AppiumBy.accessibilityId("CrossClicked");
	public static final By selectactivityfield	=	AppiumBy.accessibilityId("SelectActivity");
	public static final By walkingclikc		=		AppiumBy.iOSNsPredicateString("label == \"Walking\"");
	public static final By Enteractivityname=		AppiumBy.accessibilityId("EnterActivityName");
	public static final By startTime		=		AppiumBy.accessibilityId("FuelPerformStartTime");
	public static final By endtime			=		AppiumBy.accessibilityId("FuelPerformEndTime");
	public static final By hydration		= 		AppiumBy.accessibilityId("FuelDrinkPlusIcon");
	public static final By electro1			= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"ElectrolyteDeviation\"`][2]");
	public static final By electro2			= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"ElectrolyteDeviation\"`][3]");
	public static final By notesevent		= 		AppiumBy.accessibilityId("EventNotes");
	public static final By tickbttn			= 		AppiumBy.iOSNsPredicateString("name == \"EventSubmit\"");
	public static final By Skipclick		= 		AppiumBy.accessibilityId("Skip");
	public static final By hydration1click	=		AppiumBy.accessibilityId("Walking-Hydration");
	public static final By hydrationplus	=		AppiumBy.accessibilityId("PlusHydrationGlass");
	public static final By submithydration	=		AppiumBy.accessibilityId("Submit");
	public static final By preplusicon		=		AppiumBy.accessibilityId("Pre PerformancePlueIcon");
	public static final By fish				= 		AppiumBy.iOSNsPredicateString("name == \"Fish\"");
	public static final By fishRemove		=		AppiumBy.accessibilityId("FishFuelItemDelete");
	public static final By Cheesegoat		= 		AppiumBy.accessibilityId("Goat Cheese");
	public static final By performancetime	=		AppiumBy.accessibilityId("Pre PerformanceTimeEdit");
	public static final By deleticon		=		AppiumBy.accessibilityId("Walking-Delete");
	public static final By yesdeleticon		=		AppiumBy.accessibilityId("Yes");
	
	
	public static final By plusadd			= 		AppiumBy.accessibilityId("BreakfastAddIcon");	
	public static final By meat				=		AppiumBy.iOSNsPredicateString("name == \"Meat\"");
	public static final By backpress		= 		AppiumBy.accessibilityId("FuelBackPress");
	
	
	// Case20_Fuel_optimalfuel 
	public static final By fuellabel 		= AppiumBy.iOSNsPredicateString("name == 'Fuel'");
	public static final By Fuelmacroheading = AppiumBy.iOSNsPredicateString("name == 'FUEL MACROS BREAKDOWN'");
	public static final By arrowclick1 		= AppiumBy.accessibilityId("FuelCaloriesArrowLeft");
	public static final By arrowclick2		= AppiumBy.accessibilityId("FuelCaloriesArrowRight");

	public static final By dayseven		= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"7 days\"])[2]");
	public static final By dayfourteen	= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"14 days\"])[2]");
//	public static final By Yestrday		= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"Yesterday\"])[2]");
	public static final By backfuel		= AppiumBy.accessibilityId("FuelCalorieBackPress");
	public static final By Protcard		= AppiumBy.accessibilityId("Protein");
	public static final By crossicon1	= AppiumBy.accessibilityId("FuelMacroNutrientCross");
	public static final By carbcard		= AppiumBy.accessibilityId("Carbs");
	public static final By fatcard		= AppiumBy.accessibilityId("Fat");
//	public static final By popup1		= AppiumBy.accessibilityId("FuelDrinkInfo");
	public static final By glas1		= AppiumBy.accessibilityId("WaterGlass1");
	public static final By glas2		= AppiumBy.accessibilityId("WaterGlass2");	
	public static final By glas3		= AppiumBy.accessibilityId("WaterGlass3");	
	public static final By glas4		= AppiumBy.accessibilityId("WaterGlass4");	
	public static final By caffeine		= AppiumBy.accessibilityId("CaffeineDeviation");
	public static final By cof1			= AppiumBy.accessibilityId("Coffee1");
	public static final By cof2			= AppiumBy.accessibilityId("Coffee2");	
	public static final By cof3			= AppiumBy.accessibilityId("Coffee3");	
	public static final By cof4			= AppiumBy.accessibilityId("Coffee4");	
	public static final By tea1			= AppiumBy.accessibilityId("Tea1");
	public static final By tea2			= AppiumBy.accessibilityId("Tea2");
	public static final By grentea1		= AppiumBy.accessibilityId("Green tea1");
	public static final By grentea2		= AppiumBy.accessibilityId("Green tea2");
	public static final By grentea3		= AppiumBy.accessibilityId("Green tea3");
	public static final By grentea4		= AppiumBy.accessibilityId("Green tea4");
	public static final By grentea5		= AppiumBy.accessibilityId("Green tea5");
	public static final By sugarbtn		= AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"CaffineRadioButton\"])[2]");
	public static final By notesection	= AppiumBy.accessibilityId("CaffineDeviationNotes");
	public static final By Caffientick		=		AppiumBy.accessibilityId("CaffineSubmit");
	public static final By alcholotap		= 		AppiumBy.accessibilityId("alcohalDeviation");
	public static final By Tequglass1		= 		AppiumBy.accessibilityId("Tequila1");
	public static final By Tequglass2		= 		AppiumBy.accessibilityId("Tequila2");
	public static final By Tequglass3		= 		AppiumBy.accessibilityId("Tequila3");
	public static final By Tequglass4		= 		AppiumBy.accessibilityId("Tequila4");
	public static final By moji1			= 		AppiumBy.accessibilityId("Mojito1");
	public static final By moji2			= 		AppiumBy.accessibilityId("Mojito2");
	public static final By lager1			= 		AppiumBy.accessibilityId("Lager1");
	public static final By lager2			= 		AppiumBy.accessibilityId("Lager2");
	public static final By lager3			= 		AppiumBy.accessibilityId("Lager3");
	public static final By lager4			= 		AppiumBy.accessibilityId("Lager4");
	public static final By lager5			= 		AppiumBy.accessibilityId("Lager5");
	public static final By Adalchol			= 		AppiumBy.accessibilityId("Add Alcohol Deviation");
	public static final By deviationnotes	= 		AppiumBy.accessibilityId("AlcohalDeviationNotes");
	public static final By sugarmixer		= 		AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"Sugar Mixer\"])[2]");
	public static final By Alcohaltick		= 		AppiumBy.accessibilityId("AlcohalSubmit");
	public static final By Electrolyte		= 		AppiumBy.accessibilityId("ElectrolyteDeviation");
	public static final By electro1optimal	= 		AppiumBy.accessibilityId("ElectrolyteDeviation1");
	public static final By electro2optimal	= 		AppiumBy.accessibilityId("ElectrolyteDeviation2");
	public static final By noteselectro		= 		AppiumBy.accessibilityId("ElectrolyteNotes");
	public static final By Submitelctro		= 		AppiumBy.accessibilityId("ElectrolyteSubmit");
	public static final By Time1	=		AppiumBy.accessibilityId("SelectCaffineTime");
	
	//Case26_Fuel_breakfast_customfood
	public static final By foodname			= 		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Food Name\"]");
	public static final By servingsize		= 		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Serving Size*\"]");
	public static final By servingunit		= 		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Serving Unit*\"]");
	public static final By calories			=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Calories(Kcal)*\"]");
	public static final By proteins			= 		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Protein(g)\"]");
	public static final By carbohydrates	=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Carbohydrates(g)\"]");
	public static final By sugar			=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Sugar(g)\"]");
	public static final By fat				=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Fat(g)\"]");
	public static final By saturatedfat		= 		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Saturated Fat\"]");
	public static final By dietaryfiber		=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Dietary Fiber(g)\"]");
	public static final By cholesterol		=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Cholesterol(mg)\"]");
	public static final By sodium			=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Sodium(mg)\"]");
	public static final By iron				=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Iron(g)\"]");
	public static final By calcium			=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Calcium(g)\"]");
	public static final By potassium		=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Potassium(mg)\"]");
	public static final By vitaminA			=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Vitamin-A(%dv)\"]");
	public static final By vitaminB			=		AppiumBy.xpath("//XCUIElementTypeTextField[@name=\"Vitamin-C(%dv)\"]");
	public static final By customfoodimage	=		AppiumBy.accessibilityId("CustomFoodImage");
//	public static final By gallery			=		AppiumBy.accessibilityId("GalleryClicked");
//	public static final By submittap		= 		AppiumBy.accessibilityId("SubmitImage");
	public static final By Customtick		=		AppiumBy.accessibilityId("CustomFoodSubmit");
	
	
	
}
