package cuesz.utils;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class mobileLocators {
	
	public static final By Homeclick 		= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Home\"`][2]");
	public static final By preicon			=		AppiumBy.iOSNsPredicateString("name == \"Pre PerformancePlueIcon\"");
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

	public static final By performanceeditsubmit 	=	AppiumBy.accessibilityId("Submit");

	
	public static final By meatplus			= 		AppiumBy.accessibilityId("MeatPlus");
	public static final By serchclick		= 		AppiumBy.accessibilityId("AdditionalFuelSearch");
	public static final By Beetroot			=		AppiumBy.iOSNsPredicateString("name == \"Beetroot\"");
	
	
	public static final By additionalsearch	= 		AppiumBy.accessibilityId("AdditionalFuelSearch");
	public static final By faggot			=		AppiumBy.iOSNsPredicateString("name == \"Faggot\"");
	public static final By fagoticon		= 		AppiumBy.accessibilityId("FaggotFuelItemInfo");
	public static final By backtap			= 		AppiumBy.accessibilityId("BackPress");
	public static final By fagotplus		= 		AppiumBy.accessibilityId("FaggotPlus");
	public static final By submitick		= 		AppiumBy.accessibilityId("ItemSubmit");	

	public static final By postplusicon	=		AppiumBy.accessibilityId("Post PerformancePlueIcon");
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
	public static final By selectactivityfield		=	AppiumBy.accessibilityId("SelectActivity");
	public static final By walkingclikc		=		AppiumBy.iOSNsPredicateString("label == \"Walking\"");
	public static final By Enteractivityname	=	AppiumBy.accessibilityId("EnterActivityName");
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
	
	
	
}
