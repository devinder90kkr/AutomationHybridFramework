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
	
	public static final By additionalsearch	= 		AppiumBy.accessibilityId("AdditionalFuelSearch");
//	public static final By faggot			= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Faggot 90 kcal\"`][3]");
	public static final By faggot			=		AppiumBy.iOSNsPredicateString("name == \"Faggot\"");
	public static final By fagoticon		= 		AppiumBy.accessibilityId("FaggotFuelItemInfo");
	public static final By backtap			= 		AppiumBy.accessibilityId("BackPress");
//	public static final By downarrow		= 		AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"ArrowDown\"`][4]");
	public static final By fagotplus		= 		AppiumBy.accessibilityId("FaggotPlus");
	public static final By submitick		= 		AppiumBy.accessibilityId("ItemSubmit");	

}
