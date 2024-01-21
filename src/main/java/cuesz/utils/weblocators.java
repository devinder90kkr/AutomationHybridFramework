package cuesz.utils;

import org.openqa.selenium.By;

public class weblocators {
	
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
