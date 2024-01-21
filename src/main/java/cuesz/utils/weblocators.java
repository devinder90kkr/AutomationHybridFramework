package cuesz.utils;

import org.openqa.selenium.By;

public class weblocators {
	
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
