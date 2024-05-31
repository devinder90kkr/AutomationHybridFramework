package cuesz.utils;

import org.openqa.selenium.By;

public class weblocators {
	
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
//	public static final By submitbttn 		=	(By.xpath("//button[normalize-space()='Submit']"));
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
//    public static final By confirmbttn 	=	(By.xpath("//button[@id='DecisionPopupRejection']"));
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
