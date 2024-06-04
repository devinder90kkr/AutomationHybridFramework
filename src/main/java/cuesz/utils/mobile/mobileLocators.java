package cuesz.utils.mobile;

import org.openqa.selenium.By;
import io.appium.java_client.AppiumBy;

public class mobileLocators {
	
	
	//Tutrial screen locators
	public static final By tutorialbttn	 	=	AppiumBy.accessibilityId("Tutorial");
	public static final By motionsession 	=	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"Motion Explore Session\"`][2]");
	public static final By livesession		=	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"Live Perform Session\"`][2]");
    public static final By monthlybody		=	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"Monthly Body Composition\"`][2]");


	//Locators for bosy scan in profile 
	public static final By profilclick		=	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"My Profile\"`][2]");
	public static final By Posturedclick 	=	AppiumBy.accessibilityId("PostureClicked");
	public static final By totalbodyfat 	=	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"Total Body Fat\"`][1]");
	public static final By Visceralfat 		=	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"Total Body Fat\"`][2]");
	public static final By Waisttohip		=	AppiumBy.accessibilityId("Waist to Hip ratio");
	public static final By waistoheight		=	AppiumBy.accessibilityId("Waist to Height Ratio");
	public static final By wasitcircumference	=	AppiumBy.accessibilityId("Waist Circumference");
	public static final By Hipcircumference		=	AppiumBy.accessibilityId("Hip Circumference");
	public static final By bodyscanrisk		=	AppiumBy.accessibilityId(" Body Scan Risk Indicator");
	public static final By bodyscanumber	=	AppiumBy.accessibilityId(" Body Scan Number");
	public static final By comparebttn		=	AppiumBy.accessibilityId("CompareBodyScan");
	public static final By drop1			=	AppiumBy.accessibilityId("CompareArrowDownLeft");
	public static final By dropd2			=	AppiumBy.accessibilityId("CompareArrowDownRight");
	public static final By bodyscandrop		=	AppiumBy.accessibilityId("BodyScanArrowDown");
	public static final By scanspeher		=	AppiumBy.accessibilityId("BodyScanSphere");
	public static final By movetoresult		=	AppiumBy.accessibilityId("MoveToBodyScan");
	public static final By bodyscangrid 	=	AppiumBy.accessibilityId("BodyScanGrid");
	public static final By totalbodyfat1	=	AppiumBy.accessibilityId("Total Body Fat");
	public static final By visceralfat		=	AppiumBy.accessibilityId("Visceral Fat");
	public static final By waisthip			=	AppiumBy.accessibilityId("Waist To Hip Ratio");
	public static final By waistcirmference	=	AppiumBy.accessibilityId("Waist Circumference");
	public static final By hipcircumference	=	AppiumBy.accessibilityId("Hip Circumference");
	public static final By infobodyscan		=	AppiumBy.accessibilityId("BodyScanInfoScreen");
	public static final By rightarrow		=	AppiumBy.accessibilityId("BodyScanRight");
	public static final By leftarrow		=	AppiumBy.accessibilityId("BodyScanLeft");
	
	
	//Locators for mindful screen 
	public static final By mindulscreen		= AppiumBy.accessibilityId("MINDFUL_SCREEN");
	public static final By mindfulabel		= AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Mindful\"`]");
	public static final By mindfulstart		= AppiumBy.accessibilityId("Adaptive Biofeedback Start");
	public static final By guidedoption		= AppiumBy.accessibilityId("GuidedToogleButton");
	public static final By defaulguide		= AppiumBy.accessibilityId("Default");
	public static final By guidelabel		= AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Guided\"`]");
	public static final By vibrationlabel	= AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Vibration\"`]");
	public static final By vibrationToggel	= AppiumBy.accessibilityId("VibrationToogleButton");
	public static final By mindfulsounds	= AppiumBy.accessibilityId("soundDataToogleButton");
	public static final By displaylabel		= AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Display Physiological Data\"`]");
	public static final By displaydatatoggel	= AppiumBy.accessibilityId("Display Physiological DataToogleButton");
	public static final By adaptivereminderlabel	=	AppiumBy.accessibilityId("Adaptive Biofeedback Reminder");
	public static final By stressoption1	= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"2\"`][3]");
	public static final By stressoption2	= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"4\"`][3]");
	public static final By stressoption3	= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"1\"`][3]");
	public static final By energy1			= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"1\"`][6]");
	public static final By energy2			= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"5\"`][6]");
	public static final By energy3			= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"3\"`][6]");
	public static final By selectTimereminder 	= AppiumBy.accessibilityId("SelectTimeReminder");
	public static final By submittimer		= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"Submit\"`][2]");
	public static final By tracklabel		= AppiumBy.accessibilityId("To track your progress accurately during your Adaptive Biofeedback session, it is recommended that you keep the app active in the foreground.");
	public static final By rhytmverification	=	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"Rhythm 24 2759\"`][2]");
	public static final By syncdevice		=	AppiumBy.accessibilityId("SyncDevice");
	public static final By startmindful		= AppiumBy.accessibilityId("Start");
	public static final By submitmindful	= AppiumBy.accessibilityId("Submit");
	public static final By savebttn			= AppiumBy.accessibilityId("Save");
	
	
	
	//locators for chat screen
	public static final By ChatClick	=	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"Advocate\"`][2]");
	public static final By entermessage	=	AppiumBy.accessibilityId("EnterMessage");
	public static final By sendmessage	=	AppiumBy.accessibilityId("SendMessage");
	//public static final By medialinks	=	AppiumBy.accessibilityId("Media/Links");
	public static final By media		=	AppiumBy.accessibilityId("Media");
	public static final By documents	=	AppiumBy.accessibilityId("Documents");
	public static final By links		=	AppiumBy.accessibilityId("Links");
	public static final By search		=	AppiumBy.accessibilityId("Search");
	public static final By attach		=	AppiumBy.accessibilityId("Attach");
	public static final By galleryclick	=	AppiumBy.accessibilityId("GalleryClicked");
	public static final By image1		=	AppiumBy.xpath("//XCUIElementTypeImage[2]");
	public static final By image2		=	AppiumBy.xpath("//XCUIElementTypeImage[3]");
	public static final By chatplus		=	AppiumBy.accessibilityId("ShowMediaOptions");
	public static final By media1		=	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"Image0\"`][1]");
	public static final By media2		=	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"Image1\"`][1]");
	public static final By cross 		= 	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"✕\"`][3]");
	
	
	//Locators for morning scan
	public static final By Morningscanclick	= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"Morning Scan\"`][2]");
	public static final By manualinput	=	AppiumBy.accessibilityId("ManualDataMorningScan");
	public static final By HRVminus		=	AppiumBy.accessibilityId("HRV (rMMSD) Minus");
	public static final By HRVplus		=	AppiumBy.accessibilityId("HRV (rMMSD) Plus");
	public static final By RHRminus		=	AppiumBy.accessibilityId("RHR (BPM) Minus");
	public static final By RHRplus		=	AppiumBy.accessibilityId("RHR (BPM) Plus");
	public static final By Lminus		= 	AppiumBy.accessibilityId("L Minus");
	public static final By Lplus		= 	AppiumBy.accessibilityId("L Plus");
	public static final By Rminus		=	AppiumBy.accessibilityId("R Minus");
	public static final By Rplus		=	AppiumBy.accessibilityId("R Plus");
	public static final By Gripoption	= 	AppiumBy.accessibilityId("GripStrength");
	public static final By co2field		= 	AppiumBy.accessibilityId("CO2Test");
	public static final By Updatebutton	=	AppiumBy.accessibilityId("UpdateData");
//	public static final By wenttobed	=	AppiumBy.xpath("//XCUIElementTypeOther[@name=\"Went to bed\"]");
	public static final By sleep1		=	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"5\"`][3]");
	public static final By sleep2		= 	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"2\"`][3]");
	public static final By mental1		=	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"5\"`][6]");
	public static final By mental2		=	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"1\"`][6]");
	public static final By physical1	=	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"2\"`][9]");
	public static final By physical2	=	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"4\"`][9]");
	public static final By musucle1		=	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"2\"`][12]");
	public static final By musucle2		=	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"5\"`][12]");
	public static final By strees1		= 	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"1\"`][15]");
	public static final By morningscanlabel	=	 AppiumBy.accessibilityId("Please ensure that you keep the app active in the foreground while completing your Morning Scan session so that your progress can be tracked.");
	public static final By morninglabel	=	AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"MORNING SCAN\"`]");
	public static final By cancel		=	AppiumBy.accessibilityId("Cancel");
	public static final By redo			=	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"Scanning Cancel\"`]/XCUIElementTypeOther[2]");
	public static final By scanningtext	=	AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Scanning\"`]");
	public static final By nextbutton	=	AppiumBy.accessibilityId("Next");
	public static final By wentobed 	=	AppiumBy.accessibilityId("WentTobedTimmer");
	public static final By Wokeupbed	=	AppiumBy.accessibilityId("WokeUpTimmer");
	
	
	
	//Locators for Restore card 
	public static final By restoreclick	= 	AppiumBy.accessibilityId("RESTORE_SCREEN");
	public static final By restorelabel	=	AppiumBy.accessibilityId("Before Sleep Time");	
	public static final By restoresublabel	=	AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"one hour before sleep\"`]");
	public static final By restor1		=	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"Before Sleep Time 0\"`][3]");
	public static final By restor2		=	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"Before Sleep Time 1\"`][3]");
	public static final By Beforesleeptick	=	AppiumBy.accessibilityId("Before Sleep Time Tick");
	public static final By sleeptimelabel	=	AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Sleep Time\"`]");
	public static final By sleeptick	=	AppiumBy.accessibilityId("Sleep Time Tick");
	public static final By restoreplus	=	AppiumBy.accessibilityId("AddEvent");
	public static final By addcomemnt	=	AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Add comments\"`]");
	public static final By restoraddcomment1	= AppiumBy.accessibilityId("Couldn't sleep");
	public static final By restoraddcomment2	= AppiumBy.accessibilityId("Different bed");
	public static final By restoraddcomment3	= AppiumBy.accessibilityId("Stress");
	public static final By restoraddcomment4	= AppiumBy.accessibilityId("Smoke");
	public static final By restoraddcomment5	= AppiumBy.accessibilityId("Cold Plunge");
	public static final By restoraddcomment6	= AppiumBy.accessibilityId("Jet Lag");
	public static final By returnbtn	=	AppiumBy.accessibilityId("Return");
	public static final By commentarea	=	AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Restore Comment\"`]");
	
	
	public static final By movetoday	= AppiumBy.accessibilityId("I'll do it Today");
	
	// Dated 15 Jan this is for tell us more about your fuel
	public static final By notesclick	= 	AppiumBy.accessibilityId("FuelNotes");
	public static final By option1		= 	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Did Not Eat Enough\"`][3]");
	public static final By option2		=	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Fasted Full Day (24 hours)\"`][3]");
	public static final By option3 		= 	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Ate Too Much\"`][3]");
	public static final By Notesclick	= 	AppiumBy.accessibilityId("Notes");	
	public static final By doneclick1	=	AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"DONE\"`]");
	
	//Dated 9-Jan upload images for all category
	public static final By uploadclickall	= AppiumBy.accessibilityId("FuelUploadImage");
	public static final By breakfastuploadoption	=	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"BreakfastPhotoUpload\"`][1]");
	public static final By galleryimage1	= AppiumBy.xpath("//XCUIElementTypeImage[2]");
	public static final By addoption 		= AppiumBy.accessibilityId("Add");
	public static final By Timepicker		= AppiumBy.accessibilityId("SelectTime");
	public static final By earlysnacksuploadoption	=	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"Early SnacksPhotoUpload\"`][2]");
	public static final By galleryimage2	= AppiumBy.xpath("//XCUIElementTypeImage[3]");
	public static final By lunchuploadoption	= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"LunchPhotoUpload\"`][2]");
	public static final By galleryimage3	= AppiumBy.xpath("//XCUIElementTypeImage[4]");
	public static final By latesnacksuploadoption	=	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"Late SnacksPhotoUpload\"`][2]");
	public static final By galleryimage4	= AppiumBy.xpath("//XCUIElementTypeImage[5]");
	public static final By dinneruploadoption	=	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"DinnerPhotoUpload\"`][2]");
	public static final By galleryimage5	= AppiumBy.xpath("//XCUIElementTypeImage[6]");
	public static final By photouplod		= AppiumBy.accessibilityId("PhotoUpload");
	
	
	//Dated 4-jan additional fuelcase 
	public static final By Fuelhomeclick	= AppiumBy.accessibilityId("FUEL_SCREEN"); 
	public static final By addtionafuelbttn	= AppiumBy.accessibilityId("FuelAddDeviation");
	public static final By timepicker		= AppiumBy.accessibilityId("AdditionalItemTime");
	public static final By grapefuel		= AppiumBy.accessibilityId("Grapeseed");
	public static final By eventcategory	= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Early Snacks\"`][2]");
	public static final By resfuel			= AppiumBy.accessibilityId("Charter Reserve Golden Roast Turkey");
	public static final By lunchcategory 	= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Lunch\"`][2]");
	public static final By fiofuel			= AppiumBy.accessibilityId("Panino");
	public static final By latesnackscategory	= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Late Snacks\"`][2]");
	public static final By humfuel			=	AppiumBy.accessibilityId("Hummus");	
	public static final By dinnercategory	=	AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`label == \"Dinner\"`][2]");
	
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
	public static final By deviatioicon1			=	AppiumBy.accessibilityId("YogaDeviationIcon");
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
	public static final By graphclick2				= AppiumBy.accessibilityId("YogaGraphIcon");
	public static final By sessionfeedback1			= AppiumBy.accessibilityId("YogaFeedbackIcon");
	
	
	public static final By perfomplus			= AppiumBy.accessibilityId("AddEvent");
	public static final By additionalperform	= AppiumBy.accessibilityId("Start My Perform Activity");
	public static final By cross_additionalpopup= AppiumBy.accessibilityId("CrossClicked");
	public static final By searcharea			= AppiumBy.accessibilityId("EnterActivityName");
	public static final By selectactivity1		=	AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"Baseball \"])[3]");
	public static final By selectdeleteactivity			= AppiumBy.accessibilityId("Baseball DeleteIcon");
	
	public static final By selectactivity		= AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"Yoga\"`][3]");
	public static final By deletebaseball		= AppiumBy.accessibilityId("Yoga DeleteIcon");
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
			+ "Live Perform\"`][3]");
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
