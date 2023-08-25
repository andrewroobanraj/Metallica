package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPagePojo extends BaseClass{
	
	    //default constructor
		public MyAccountPagePojo() {
					
			PageFactory.initElements(driver, this);	
		}
		
		//To click the Personal Information
		@FindBy(xpath="//a[text()='Personal Information']")
		private WebElement personalInfo;
		
		public WebElement getPersonalInfo() {
			return personalInfo;
		}
		
		//back to My Account Page
		@FindBy(xpath="//a[text()='My Account']")
		private WebElement myAccount;
		
		public WebElement getMyAccount() {
			return myAccount;
		}
		
		//To click Addresses
		@FindBy(xpath="//a[text()='Addresses']")
		private WebElement addresses;
		
		public WebElement getAddresses() {
			return addresses;
		}
		
		//To click Order History
		@FindBy(xpath="//a[text()='Order History']")
		private WebElement orderHis;
		
		public WebElement getOrderHis() {
			return orderHis;
		}
		
		//To click Payment Settings
		@FindBy(xpath="//a[text()='Payment Settings']")
		private WebElement paySetting;
		
		public WebElement getPaySetting() {
			return paySetting;
		}
		
		//To click Presale Codes
		@FindBy(xpath="//a[text()='Presale Codes']")
		private WebElement presaleCodes;
		
		public WebElement getPresaleCodes() {
			return presaleCodes;
		}
		
		//To click Free Downloads
		@FindBy(xpath="//a[text()='Free Downloads']")
		private WebElement freeDownload;
		
		public WebElement getFreeDownload() {
			return freeDownload;
		}
		
		//To click Contests
		@FindBy(xpath="//a[text()='Contests']")
		private WebElement contests;
		
		public WebElement getContests() {
			return contests;
		}
		
		//To click Vinyl Club
		@FindBy(xpath="//a[text()='Vinyl Club']")
		private WebElement vinylClub;
		
		public WebElement getVinylClub() {
			return vinylClub;
		}		

}
