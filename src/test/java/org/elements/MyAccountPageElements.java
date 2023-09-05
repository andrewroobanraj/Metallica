package org.elements;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPageElements extends BaseClass{
	
	    //default constructor
		public MyAccountPageElements() {
					
			PageFactory.initElements(driver, this);	
		}
		
		//To click the Personal Information
		@FindBy(xpath="//a[text()='Personal Information']")
		public WebElement personalInfo;
		
		//back to My Account Page
		@FindBy(xpath="//a[text()='My Account']")
		public WebElement myAccount;
		
		//To click Addresses
		@FindBy(xpath="//a[text()='Addresses']")
		public WebElement addresses;
		
		//To click Order History
		@FindBy(xpath="//a[text()='Order History']")
		public WebElement orderHis;
		
		//To click Payment Settings
		@FindBy(xpath="//a[text()='Payment Settings']")
		public WebElement paySetting;
		
		//To click Presale Codes
		@FindBy(xpath="//a[text()='Presale Codes']")
		public WebElement presaleCodes;
		
		//To click Free Downloads
		@FindBy(xpath="//a[text()='Free Downloads']")
		public WebElement freeDownload;
		
		//To click Contests
		@FindBy(xpath="//a[text()='Contests']")
		public WebElement contests;
		
		//To click Vinyl Club
		@FindBy(xpath="//a[text()='Vinyl Club']")
		public WebElement vinylClub;
				

}
