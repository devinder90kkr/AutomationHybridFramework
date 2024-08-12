package cuesz.web.resources;

import org.openqa.selenium.By;

public class weblocators {
	
	// Action Steps 
	public static final By actionstepsbutton 	 = (By.id("self-add-edit-action-step"));
	public static final By editoractions		 = (By.xpath("//div[@class='jodit-wysiwyg']"));
	public static final By editactionsteps		 = (By.xpath("(//div[@class='jodit-wysiwyg'])[2]"));
	public static final By submitactionnotes	 = (By.xpath("(//div[@id='self-add-edit-action-step'])[2]"));
	public static final By searchnotes			 = (By.xpath("//input[@placeholder='Search Note']"));
	public static final By deletenotes			 = (By.xpath("//button[@id='self-delete-action-step-0']"));
	public static final By editiconaction		 = (By.xpath("//button[@id='self-edit-action-step-0']"));
	public static final By submitbttnaction		 = (By.xpath("(//button[normalize-space()='Submit'])[1]"));
	public static final By historyicon			 = (By.xpath("(//button[@id='self-history-action-step'])[1]"));
	public static final By historySection		 = (By.xpath("(//div[contains(@class,'logic_page_notes')])[4]"));
	public static final By importancesection	 = (By.xpath("(//button[@class='black-card '])[1]"));
	public static final By importancedatefield	 = (By.xpath("//input[@id='reminder-date']"));
	public static final By importancetimefield	 = (By.xpath("//input[@id='IP-time-picker']"));
	public static final By submtimportance		 = (By.xpath("//button[@id='submit-reminder']"));
	public static final By prioritydatefield	 = (By.xpath("(//button[contains(@class,'black-card')])[3]"));	
	public static final By completetab			 = (By.xpath("//button[@id='self-Completed-action-step']"));
	public static final By activetab			 = (By.xpath("//button[@id='self-Active-action-step']"));
	public static final By alltab				 = (By.xpath("//button[@id='self-All-action-step']"));
	public static final By Mynotes				 = (By.xpath("//div[contains(@class, 'react-select-dropdown-prefix__single-value') and text()='My Notes']"));
	public static final By removeimportant		 = (By.xpath("//span[normalize-space()='Remove Important']"));
	public static final By importancesection1	 = (By.xpath("(//button[@class='black-card active-card'])[1]"));
	public static final By editdattimepriority	 = (By.xpath("//span[normalize-space()='Edit Date/Time']"));
	public static final By important2			 = (By.xpath("(//button[contains(@class,'black-card')])[8]"));
	public static final By priority2			 = (By.xpath("(//button[contains(@class,'black-card')])[15]"));
	public static final By sharing1				 = (By.xpath("(//button[@class='black-card '])[3]"));
	public static final By checkbox2			 = (By.xpath("(//input[contains(@type,'checkbox')])[3]"));
	public static final By sharingbutton		 = (By.xpath("//button[normalize-space()='Share']"));
	public static final By stafflist1			 = (By.xpath("//label[contains(text(),'Devinder kumar')]"));
	public static final By stafflist2			 = (By.xpath("//label[contains(text(),'Coach Seakfreight')]"));
	public static final By sharebutton			 = (By.xpath("//button[contains(@class,'btn btn-primary btn-lg ms-3')]"));
	public static final By shareIcon			 = By.xpath("//div[@class='d-flex align-items-center rounded bg-dark px-1 gap-2']");


	
	
	//Case101_Workout_Templates
	public static final By templateicon			 = (By.xpath("//a[@href='/templates']//span"));
	public static final By workoutemplateheading = (By.xpath("//h2[normalize-space()='Workout Templates']"));
	public static final By templateplsicon		 = (By.xpath("//div[@class='btn_grey']//em"));
	public static final By addTemplateHeading	 = (By.xpath("//h2[normalize-space()='Add Template']"));
	public static final By templatname 			 = (By.xpath("//input[@id='autoWidth']"));
	public static final By addnewworkout 		 = (By.xpath("//span[contains(text(),'Add New Workout')]"));
	public static final By exerciseconatiner 	 = (By.xpath("//div[@class='rightArticle table-container']"));
	public static final By exerciseslection	 	 = (By.xpath("//div[@id='companyId']"));
	public static final By exercisedescription 	 = (By.xpath("(//div[@class='jodit-wysiwyg'])[1]"));
	
	public static final By repsfield 		 	 = (By.xpath("(//input[@type='text'])[4]"));
	public static final By recoveryfield 		 = (By.xpath("(//input[@type='text'])[5]"));
	public static final By setsplus				 = (By.xpath("//button[normalize-space()='+']"));
	public static final By submitbuttn 			 = (By.xpath("//button[normalize-space()='Submit']"));
	public static final By savebutton			 = (By.xpath("//button[@id='exercise_save_button_template']"));
	public static final By optional1			 = (By.xpath("(//div[contains(text(),'Optional')])[1]"));
	public static final By Optionaltextfield 	 = (By.xpath("(//input[contains(@type,'text')])[6]"));
	public static final By optional2			 = (By.xpath("(//div[contains(text(),'Optional')])[2]"));
	public static final By optionaltextfield2	 = (By.xpath("(//input[contains(@type,'text')])[7]"));
	public static final By chain1				 = (By.xpath("(//img[contains(@alt,'l')])[2]"));
	
	
	
			
	//Step12_03_SE_create_staffevent
	public static final By endtime		 = 	(By.id("eventEndTime"));
	public static final By eventSelectn		 = (By.id("eventTopics"));
	public static final By scdedulemastr = (By.xpath("//a[@href='/schedule-master']//span//img[@alt='icon']"));
	public static final By monthvew		 = (By.xpath("//span[normalize-space()='Month']"));
	public static final By usrlabel		 = (By.xpath("//div[@class='user_title']//label"));
	
	
	//	Step12_01_SE_createvent_withouttime	
	public static final By Schdulemaste = 	(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div[2]/div/div[1]/div/div[2]"));
	public static final By Addnewbuttn  = 	(By.xpath("//div[@id='root']/div/div/div/div/div[2]/div/div/button"));
	public static final By labeltxt		=	(By.id("eventTopics"));
	
	//Step09_MC_viewevent
	public static final By membrcall 	=  (By.xpath("//a[@href='/member-calls']//span"));	
	 public static final By usrtitle 	 	= (By.xpath("//div[@class='user_title']//label"));
	 public static final By editiconmc 		= (By.id("editEventButton"));
	 public static final By edittim1 		= (By.id("event_date"));
	 public static final By editicon2 		= (By.xpath("//div[@id='eventStartTime']/following-sibling::button[contains(@class, 'btn-secondary')]"));
	 public static final By starttime		= (By.xpath("//input[@id='startTime']"));
	 public static final By updateeventbtn	= (By.xpath("//button[normalize-space()='Update Event']"));
	 public static final By Membercalenda = (By.xpath("//a[@href='/member-calls']//span"));
		public static final By usrlabl		 = (By.xpath("//div[@class='user_title']//label"));
		public static final By deletbttn	 = (By.xpath("//button[@class='btn btn-sm del_btn']//em"));
		public static final By confirmbttn2	 = (By.xpath("//span[normalize-space()='Confirm']"));	
		
	//	Step06_SE_withouttime
	public static final By Addnewevent 		=  (By.xpath("//button[normalize-space()='Add New Event']"));	
	public static final By membercalicon 	=  (By.xpath("//a[@href='/member-calls']//span"));
	public static final By usertitle=  (By.xpath("//div[@class='user_title']//label"));
			
	//Case43_1_MSL_Fuelperform
	public static final By Activityselect	= (By.id("FuelPerform-SelectActivity-Monday"));
	public static final By notesfield		= (By.id("editorFuelPerform-Note-Monday"));
	public static final By Durationfield	= (By.id("FuelPerform-Mins-Monday"));
	public static final By inptFild 	= 	(By.xpath("//div[@id='FuelPerformSelectedOptionsPrePerform-Perform-prePerform-Primary-Monday']//input"));
	public static final By inptFild1 = (By.xpath("//div[@id='FuelPerformSelectedOptionsPrePerform-Perform-prePerform-Secondary-Monday']//input"));
	public static final By inptFild2 = (By.xpath("//div[@id='FuelPerformSelectedOptionsDuringPerform-Perform-duringPerform-Primary-Monday']//input"));	
	public static final By inptFild3	= (By.xpath("//div[@id='FuelPerformSelectedOptionsPostPerform-Perform-postPerform-Secondary-Monday']//input"));

	//Case01_createvent
	public static final By Date 		 = (By.id("event_date"));	
	public static final By StartTime 	 =	(By.id("eventStartTime"));	
	public static final By EndTime		 = 	(By.id("eventEndTime"));
	public static final By Topic		 = (By.id("eventTopics"));
	public static final By Member 		= (By.id("eventMemberlist"));
	public static final By Staff 		= (By.id("Helsenki"));	
	public static final By Notes		 =  (By.name("note"));
	public static final By Submitbutton  =	 (By.xpath("//button[normalize-space()='Create Event']"));
	//	Case02_viewevent
	public static final By scheduleIcon 	= (By.xpath("//a[@href='/schedule-master']//span//img[@alt='icon']"));
	public static final By monthview 		= (By.xpath("//span[normalize-space()='Month']"));
	public static final By userlabel 	 	= (By.xpath("//div[@class='user_title']//label"));
	//	Case03_editevent
	 public static final By editBttn 		= (By.id("editEventButton"));
	 public static final By edittime 		= (By.id("event_date"));
	 public static final By editIconstarttime 		= (By.xpath("//div[@id='eventStartTime']/following-sibling::button[contains(@class, 'btn-secondary')]"));
	 public static final By startime		= (By.xpath("//input[@id='startTime']"));
	 public static final By updatebutton	= (By.xpath("//button[normalize-space()='Update Event']"));
	 public static final By editEndTime		= 	  (By.xpath("//input[@id='endTime']"));
	 //Case04_deletevent
	 public static final By deletebutton	= (By.xpath("//button[@class='btn btn-sm del_btn']//em"));
	 public static final By confirmbutton 	= (By.xpath("//span[normalize-space()='Confirm']"));
	 //Step05_SM_daymonthweek
	 public static final By dayview			= (By.xpath("//span[normalize-space()='Day']"));
	 public static final By weekview			= (By.xpath("//span[normalize-space()='Week']"));
	
	
	
	//Case45_MSL_restore
	public static final By rstrhading = (By.xpath("(//div[normalize-space()='Restore'])[1]"));
	public static final By rsornotepls = (By.xpath("(//button[@data-bs-target='#Restore'])[1]"));
//	public static final By slctbttn = (By.xpath("//div[@id='RestoreCard']//div[@class='d-flex justify-content-end calender_drop']//button[1]"));
	public static final By hadnglement = (By.xpath("(//h6[contains(text(),'Before Sleep Time')])[1]"));
	public static final By rstropton1 =	(By.xpath("(//input[@placeholder='Enter Cue'])[1]"));
	public static final By rstropton2 =(By.xpath("(//input[@placeholder='Enter Cue'])[2]"));
	public static final By rstropton3 =(By.xpath("(//input[@placeholder='Enter Cue'])[3]"));
	public static final By SlephadngElement = (By.xpath("(//h6[contains(text(),'Sleep Time')])[2]"));
	public static final By Slepeopton =(By.xpath("(//input[@placeholder='Enter Cue'])[5]"));
	public static final By Slepeopton2 =(By.xpath("(//input[@placeholder='Enter Cue'])[5]"));
	public static final By rstropton4 =	(By.xpath("(//input[@placeholder='Enter Cue'])[9]"));
	public static final By rstropton5 =	(By.xpath("(//input[@placeholder='Enter Cue'])[10]"));
	public static final By Slepeopton3 =	(By.xpath("(//input[@placeholder='Enter Cue'])[13]"));
	public static final By outside1 = (By.tagName("body"));
	public static final By slctbttn2 = (By.xpath("//div[@id='RestoreCard']//div[@class='d-flex justify-content-end calender_drop']//button[1]"));
	public static final By slctbttn3 = (By.xpath("//button[@id='SelectWeekRestoreCard']"));
	public static final By Copybttn = (By.xpath("(//button[@class='btn btn-sm btn-primary m-1'])[12]"));
	public static final By savebttn = (By.xpath("(//button[normalize-space()='Yes'])[1]"));	
	public static final By Nxtwek34 = (By.xpath("//button[contains(.,'Next Week')]"));
	public static final By nxtWekBttn = (By.xpath("//button[contains(.,'Next Week')]"));
	public static final By rstrheadin = (By.xpath("(//div[normalize-space()='Restore'])[1]"));
	public static final By slctbttn4 = (By.xpath("//div[@id='RestoreCard']//div[@class='d-flex justify-content-end calender_drop']//button[1]"));
	
	
	//Case44_MSL_Mindful
	public static final By Logicbttn =   (By.xpath("//span[normalize-space()='Logic Page']"));
	public static final By heainelment = (By.xpath("(//h6[contains(text(),'Biofeedback')])[1]"));
	public static final By selectLPInput =	(By.id("MindfulDay-Monday"));
	public static final By slecttmin =	(By.id("MindfulMins-Monday"));
	public static final By outsBlcok1 = (By.tagName("body"));
    public static final By selectLPinpt1  =(By.id("MindfulDay-Tuesday"));
    public static final By Selectmininpt2 =(By.id("MindfulMins-Tuesday"));
    public static final By slctbtt11 = (By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[12]/div[1]/div[1]/h2[1]/div[2]/button[1]"));
    public static final By slctBttn = (By.xpath("//button[@id='SelectWeekMindfull']"));
    public static final By Coybttn = (By.xpath("(//button[@class='btn btn-sm btn-primary m-1'])[10]"));
    public static final By Savesbttn = (By.xpath("(//button[normalize-space()='Yes'])[1]"));
	
	//Case44_01_MSL_Mindful_currentday
	public static final By mindfulhdng = (By.id("Mindfull"));
	public static final By mindflnopls = (By.xpath("//div[normalize-space()='Mindful']//button[@type='button']"));
	public static final By slctbttn = (By.xpath("//div[@id='Mindfull']//div[@class='d-flex justify-content-end calender_drop']//button[1]"));
    public static final By outsideBlck2 = (By.tagName("body"));
	
	//Case43_MSL_Fuel
	public static final By fuelcrad = 		(By.id("FuelCard"));
	public static final By Fulplus= 		(By.xpath("//button[@data-bs-target='#FuelToTrain']"));
	public static final By selectbton = 	(By.xpath("//div[@id='FuelCard']//div[@class='d-flex justify-content-end calender_drop']//button[1]"));
	public static final By fatfild =	(By.id("FuelRecFat-Monday"));
	public static final By carbfild	= 	(By.id("FuelRecCarbs-Monday"));
	public static final By Prteinfeld	= (By.id("FuelRecProtein-Monday"));
	public static final By inputFeld = (By.xpath("//div[@class='FuelOptionFirst_1-Monday react-select__input']/input"));
	public static final By inputFeld2 = (By.xpath("//div[@class='FuelOptionFirst_2-Monday react-select__input']/input"));
	public static final By inputFeld3 = (By.xpath("//div[@class='FuelOptionFirst_3-Monday react-select__input']/input"));
	public static final By inputFeld4 = (By.xpath("//div[@class='FuelOptionSecond_3-Monday react-select__input']/input"));
	public static final By inputFeld5 = (By.xpath("//div[@class='FuelOptionFirst_4-Monday react-select__input']/input"));
	public static final By hydTarget	= (By.id("hydration_fuel-Monday"));
	public static final By 	electrTarget	= (By.id("Electrolyte_fuel-Monday"));

		
	//Case43_02_MSL_fuel_currentday
	public static final By Fuelheading = (By.id("FuelCard"));
	public static final By Fuelheadingplus = (By.xpath("//button[@data-bs-target='#FuelToTrain']"));

	//Case42_MSL_Perform
	public static final By selctLP = (By.xpath("//*[@id='LivePerform']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"));
	public static final By sarchacivity =(By.xpath("//*[@id='LivePerform']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
	public static final By minutes =	(By.xpath("(//input[@placeholder='Min'])[1]"));
	public static final By sarchIntsity =	(By.xpath("//*[@id='LivePerform']/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
	public static final By HR1value =(By.xpath("//*[@id='LivePerform']/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"));
	public static final By cueinpt = (By.xpath("//*[@id='LivePerform']/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]"));
    public static final By slctBttn4 = (By.xpath("//div[@id='LivePerfromCard']//div[@class='d-flex justify-content-end calender_drop']//button[1]"));
    public static final By sveysbttn = (By.xpath("(//button[normalize-space()='Yes'])[1]"));
    
    //Case42_01_MSL_Perform_currentday
	public static final By Prfrmhading = (By.id("LivePerfromCard"));
	public static final By Prfrmhadingplsu = (By.xpath("//button[@data-bs-target='#LivePerform']"));
	public static final By selctbttn = (By.xpath("//div[@id='LivePerfromCard']//div[@class='d-flex justify-content-end calender_drop']//button[1]"));
	public static final By outsieBlcok1 = (By.tagName("body"));
	
	//	Case37_MSL_Habbitsnotes
	public static final By Logibttn =   (By.xpath("//span[normalize-space()='Logic Page']"));
	public static final By habitNtslement =(By.xpath("//div[contains(text(), 'Habit Notes')]"));
	public static final By habitNtslementplus = (By.xpath("(//button[@data-bs-target='#HabitNotes'])[1]"));
	public static final By habitstesNots = (By.xpath("(//h6[@class='g_title'][normalize-space()='Team Notes'])[2]"));
	public static final By mondayDaelment = (By.xpath("//h6[contains(text(), 'Monday')]"));
	public static final By notsfild = (By.xpath("(//textarea[@placeholder='Notes'])[8]"));
	public static final By outsdeBlck1 = (By.tagName("body"));
	public static final By notfild1 = (By.xpath("(//textarea[@placeholder='Notes'])[9]"));
	public static final By outdeBlck2 = (By.tagName("body"));
	public static final By Cpybttn = (By.xpath("//button[@class='btn btn-sm btn-primary']"));
	public static final By nxtbttn1 = (By.xpath("//span[normalize-space()='Next Week']"));
	public static final By mndayBlcklement1 = (By.xpath("//h6[contains(text(), 'Monday')]"));
	public static final By habttxtara1 = (By.xpath("//h6[contains(text(), 'Monday')]/following-sibling::div[@class='logic_block_body']//textarea[@name='habitNotes']"));
	public static final By tudayBlcklement1 = (By.xpath("//h6[contains(text(), 'Tuesday')]"));
	public static final By habttxtarea11 = (By.xpath("//h6[contains(text(), 'Tuesday')]/following-sibling::div[@class='logic_block_body']//textarea[@name='habitNotes']"));

	//Case36_MSL_Staffnotes
	public static final By logibttn = (By.xpath("//span[normalize-space()='Logic Page']"));
	public static final By logicElement = (By.xpath("//h3[text()='Logic Page']"));
	public static final By staNtsElement =	(By.xpath("//div[contains(text(), 'Staff Notes')]"));
	public static final By Stafplus = (By.xpath("(//button[@data-bs-target='#StaffNotes'])[1]"));
	public static final By mondayDate = (By.xpath("//h6[contains(text(), 'Monday')]"));
	public static final By compliance = (By.name("Compliance"));
	public static final By travlFild = (By.name("Travel"));
	public static final By memberFeedback = (By.name("Memberfeedback"));
	public static final By noteFild =(By.name("Notes"));
	public static final By outsdeBlok = (By.tagName("body"));
	public static final By tuesdayBlck = (By.xpath("//h6[contains(text(), 'Tuesday')]"));
	public static final By complancfeld = (By.xpath("(//textarea[@placeholder='Compliance'])[2]"));
	public static final By traelFeld1 = (By.xpath("(//textarea[@placeholder='Travel'])[2]"));
	public static final By memberfedbck = (By.xpath("(//textarea[@placeholder='Member feedback'])[2]"));
	public static final By noteFid1 = (By.xpath("(//textarea[@placeholder='Notes'])[2]"));

	public static final By wedBlock = (By.xpath("//h6[contains(text(), 'Wednesday')]"));
	public static final By compField11 = (By.xpath("(//textarea[@placeholder='Compliance'])[3]"));
	public static final By travFid11 = (By.xpath("(//textarea[@placeholder='Travel'])[3]"));
	public static final By memberFeedField11 = (By.xpath("(//textarea[@placeholder='Member feedback'])[3]"));
	public static final By notesFd11 = (By.xpath("(//textarea[@placeholder='Notes'])[3]"));
    public static final By Copybton = (By.xpath("//button[@class='btn btn-sm btn-primary']"));
    
    
    public static final By poplement = (By.cssSelector(".file_upload_modal"));
	public static final By dtaFrmlement = (By.cssSelector(".date_field"));
	public static final By dtaTolement =	(By.cssSelector(".data_copy_list li span"));
	public static final By ysBttn = (By.cssSelector("button.btn-primary"));
    public static final By copybutton1	= (By.xpath("//button[@id='SelectWeekStaffNotesCard']"));
	
	
	
	//Case92_MS_actiontaken
	public static final By actiontakenheading	= (By.xpath("//h2[normalize-space()='Action Taken']"));
	public static final By actionplusicon		= (By.id("add-action-taken")); 
	public static final By actiontextarea		= (By.id("action-taken-input-field"));
	public static final By actiondatefield		= (By.id("action-taken-date"));
	public static final By submitaction			= (By.id("submit-action-taken"));
	public static final By showmoreaction		= (By.id("show-more"));
	public static final By actionedit 			= (By.id("edit-action-taken-0"));
	public static final By deleteaction			= (By.id("delete-action-taken-0"));
	public static final By deleteactionnotemainheading	= (By.xpath("//h2[normalize-space()='Delete Action Note']"));
	public static final By deletecontent		=	(By.xpath("//div[@class='MuiDialogContent-root']"));
	public static final By crossicon1			=	(By.xpath("//button[@id='close-btn']"));
	
	//Case91_MS_Reminderfeature
	public static final By reminderheading 	= (By.xpath("//h2[normalize-space()='Reminders']"));
	public static final By reminderarrow 	= (By.xpath("//span[contains(@class,'arrow')]"));
//	public static final By reminderaddbttn 	= (By.xpath("(//div[@class='add_btn'])[2]"));
	public static final By reminderaddbttn	=	(By.id("add-reminder"));
	public static final By reminderpop 		= (By.xpath("//h4[normalize-space()='Add Reminder']"));
//	public static final By dateField		= (By.xpath("(//input[@placeholder='DD-MM-YYYY'])[3]"));
	public static final By dateField		= (By.id("reminder-date"));
//	public static final By remindernotesfield 	= (By.xpath("//textarea[@placeholder='Enter Notes']"));
	public static final By remindernotesfield	= (By.id("reminder-note"));
//	public static final By emailtick		= (By.xpath("(//input[contains(@type,'checkbox')])[24]"));
	public static final By emailtick		=	(By.id("reminder-email-check"));
	public static final By emailclick 		= (By.xpath("//input[@class='rc-time-picker-input']"));
//	public static final By emailclick		=	(By.id("rc-time-picker time-pick"));
//	public static final By recurring 		= (By.xpath("(//input[contains(@type,'checkbox')])[28]"));
	public static final By recurring 		= (By.id("reminder-recurring-check"));
	public static final By outsideclick		=	(By.id("reminder-modal"));
	public static final By TimeInput		= (By.xpath("//input[@class='rc-time-picker-panel-input']"));
	//select time values 
	public static final By time1			=	(By.xpath("(//div[@class='rc-time-picker-panel-select'])[1]//li[text()='08']"));
	public static final By time2 			=	(By.xpath("(//div[@class='rc-time-picker-panel-select'])[2]//li[text()='18']"));
	public static final By time3 			=	(By.xpath("(//div[@class='rc-time-picker-panel-select'])[3]//li[text()='pm']"));
//	public static final By recuuring1		= 	(By.xpath("//div[contains(text(),'Select')]"));
	public static final By recuuring1		=  	(By.id("reminder-recurring-options"));

	public static final By submitbttn		=	(By.id("submit-reminder"));
//	public static final By editreminder 	=	(By.xpath("//div[@class='reminder-container']//button[1]"));
	public static final By editreminder 	=	(By.id("edit-reminder-0"));
	public static final By editreminderheading	= (By.xpath("//h2[normalize-space()='Edit Reminder']"));
	public static final By headingreminder	= (By.xpath("//p[@id='alert-dialog-description']"));
	public static final By remindedelte 	= (By.xpath("(//img[@alt='delete'])[11]"));
	public static final By deletheading		= (By.xpath("//h2[normalize-space()='Delete Reminder']"));
	//Case92_MS_Reminderfeature_dailynextday 
	public static final By calendarnextbttn	= (By.xpath("//button[contains(text(),'›')]"));

	//Case90_MS_Actionsteps locaators
	public static final By actionheading = (By.xpath("//h2[contains(text(), 'Action Steps')]"));
//    public static final By addbttn = (By.xpath("//div[@class='add_btn']"));
    public static final By addbttn = (By.id("add-edit-action-step"));
    //public static final By actioninputfield =(By.xpath("//textarea[@placeholder='Add Note']"));
    public static final By actioninputfield = (By.id("add-action-step-input-field"));
    public static final By seeMoreButton = (By.xpath("//span[@class='show_more']"));
//    public static final By seemoreclose = (By.xpath("//button[@class='close_btn']//span"));    
    public static final By seemoreclose =  (By.id("close-btn"));
//    public static final By editicon	= (By.xpath("(//button)[3]"));
    public static final By editicon	= (By.id("edit-action-step-0"));    
//    public static final By edittextarea = (By.xpath("//textarea[@placeholder='Enter Here']"));    
    public static final By edittextarea = (By.id("edit-action-step-input-field"));   
//    public static final By submitbutton = (By.xpath("//button[normalize-space()='Submit']"));
    public static final By submitbutton = (By.id("submit-action-step-edit-form"));
//    public static final By deleteicon = (By.xpath("(//button)[4]"));
    public static final By deleteicon = (By.id("delete-action-step-0"));
    public static final By deletePopupHeading = (By.xpath("//h2[normalize-space()='Delete Action Step']"));
    public static final By deletePopupContent = (By.xpath("//div[@class='MuiDialogContent-root']"));
//    public static final By cancelbuttn 	=	(By.xpath("//button[@id='DecisionPopupConfirmation']"));
    public static final By cancelbuttn		= 	(By.id("DecisionPopupConfirmation"));
//    public static final By confirmbttn1 	=	(By.xpath("//button[@id='DecisionPopupRejection']"));
    public static final By confirmbttn 		=	(By.id("DecisionPopupRejection"));

	//Case35_MSL_MemberWilingnessLimitationScore
	public static final By lablElment =(By.xpath("//label[text()='Willingness']"));
	public static final By dotCntaner = (By.className("status_dots_big"));
	public static final By bttn1 = (By.xpath("//button[contains(@class, 'btn-secondary') and contains(@class, 'note_btn')]"));
	public static final By popHedngelmnt = (By.xpath("//label[text()='Willingness']"));
	public static final By txtara1 =(By.xpath("//textarea[normalize-space()='Hello we automate things by using selenium tools.']"));
	public static final By saveBttn =(By.xpath("//button[text()='Save Note']"));
	public static final By LimitlablElment = (By.xpath("//label[contains(text(), 'Limitation')]"));
	public static final By ttimag	=	(By.tagName("img"));
	public static final By stusdotbg	=	(By.cssSelector(".status_dots_big .dots"));
	public static final By btton1 =(By.cssSelector("button.btn.btn-secondary.note_btn"));
	public static final By popHeadngElement1 = (By.xpath("//label[text()='Limitation']"));
	public static final By textAea1 = (By.xpath("//textarea[normalize-space()='Hello we automate things by using selenium tools.']"));
	public static final By saveBttn1 =(By.xpath("//button[text()='Save Note']"));
	
	
	//Case34_MSL_MemberBasicinfo
	public static final By logicbttn =  (By.xpath("//span[normalize-space()='Logic Page']"));
	public static final By lgicHeadngElment = (By.xpath("//h3[text()='Logic Page']"));
	public static final By bascInitle = (By.xpath("//h6[text()='Basic Information']"));
	public static final By imgelment	=	(By.xpath("//img[@src]"));
	public static final By membrInfElmnt = (By.xpath("//div[@class='user_inf']/h6"));
	public static final By gympls = (By.xpath("//label[normalize-space()='Gym']"));
	public static final By popHeadngelment = (By.xpath("//label[text()='Gym']"));
	public static final By txtara = (By.xpath("//div[@class='form-group']//textarea[@class='form-control']"));
	public static final By Savnote = (By.xpath("//button[normalize-space()='Save Note']"));
	public static final By partnrtcusz =(By.xpath("//label[normalize-space()='Partner at Cuesz']"));
	public static final By popheadngelmnt1 = (By.xpath("//label[text()='Gym Partner']"));
	public static final By partnrtxtara = (By.xpath("//div[@class='form-group']//textarea[@class='form-control']"));
	public static final By Svaenot2 = (By.xpath("//button[normalize-space()='Save Note']"));
	public static final By whjin = (By.xpath("//label[normalize-space()='Why did they join cuesz?']"));
	public static final By popHeadngelment2 = (By.xpath("//label[text()='Why join?']"));
	public static final By whyjintxtAra = (By.xpath("//div[@class='form-group']//textarea[@class='form-control']"));
	public static final By SvaeNte3 = (By.xpath("//button[normalize-space()='Save Note']"));

	
	// Step12_DB_navlink locators
	public static final  By schdulemastr = (By.id("Dashboard-ScheduleMaster"));
	public static final  By elemnt = (By.id("dashboard"));
	public static final  By Membrcommunicate	 =	(By.id("Dashboard-MemberCommunication"));
	public static final  By stafcommuniction	=	(By.id("Dashboard-StaffCommunication"));
	public static final  By knwledge	= (By.id("Dashboard-Knowledge"));
	public static final  By membersummary	=	(By.id("member-summary"));
	
	// Case15_MS_Memberhoverdetail	
	public static final By homeicon		= (By.cssSelector("img[src*='/static/media/home_green']"));
	public static final By morningscn 	=  (By.xpath("//div[@id=\"MemberSummary-MemberDetails-MorningScan\"]//img"));
	public static final By biofeedbck	= (By.xpath("//div[@id=\"MemberSummary-MemberDetails-AdaptiveBiofeedbackTest\"]//img"));
	public static final By fuel			= (By.xpath("//div[@id=\"MemberSummary-MemberDetails-FuelDetails\"]//img"));
	public static final By perform		= (By.xpath("//div[@id=\"MemberSummary-MemberDetails-PerformDetails\"]//img"));
	public static final By restore		= (By.xpath("//div[@id=\"MemberSummary-MemberDetails-RestoreDetails\"]//img"));
	public static final By version		= (By.id("MemberSummary-MemberDetails-Version"));
	public static final By memberflag	= (By.id("MemberSummary-MemberDetails-Flag"));
	public static final By flagbox		= (By.xpath("//div[@class='flag_modal']//div[1]//div[1]//div[1]//div[1]//input[1]"));
	public static final By closebutton	= (By.xpath("//button[@class='close_btn']//span"));
	
	
	
}
