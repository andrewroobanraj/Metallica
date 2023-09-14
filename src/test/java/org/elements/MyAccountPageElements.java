package org.elements;

import java.io.File;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyAccountPageElements extends BaseClass {

	// default constructor
	public MyAccountPageElements() {

		PageFactory.initElements(driver, this);
	}

	// To click the Personal Information
	@FindBy(xpath = "//a[text()='Personal Information']")
	public WebElement personalInfo;

	// back to My Account Page
	@FindBy(xpath = "//a[text()='My Account']")
	public WebElement myAccount;

	// To click Addresses
	@FindBy(xpath = "//a[text()='Addresses']")
	public WebElement addresses;

	// To click Order History
	@FindBy(xpath = "//a[text()='Order History']")
	public WebElement orderHis;

	// To click Payment Settings
	@FindBy(xpath = "//a[text()='Payment Settings']")
	public WebElement paySetting;

	// To click Presale Codes
	@FindBy(xpath = "//a[text()='Presale Codes']")
	public WebElement presaleCodes;

	// To click Free Downloads
	@FindBy(xpath = "//a[text()='Free Downloads']")
	public WebElement freeDownload;

	// To click Contests
	@FindBy(xpath = "//a[text()='Contests']")
	public WebElement contests;

	// To click Vinyl Club
	@FindBy(xpath = "//a[text()='Vinyl Club']")
	public WebElement vinylClub;

	// To click download my data button
	@FindBy(xpath = "//a[@class='profile-data-download button']")
	public WebElement downloadMyData;

	// To add new address
	@FindBy(xpath = "//a[@class='section-header-note address-create button']")
	public WebElement addNewAddress;

	// To enter addressName
	@FindBy(xpath = "//input[@id='dwfrm_profile_address_addressid']")
	public WebElement addressName;

	// To enter first name
	@FindBy(xpath = "//input[@id='dwfrm_profile_address_firstname']")
	public WebElement firstName;

	// To enter last name
	@FindBy(xpath = "//input[@id='dwfrm_profile_address_lastname']")
	public WebElement lastName;

	// To enter address1
	@FindBy(xpath = "//input[@id='dwfrm_profile_address_address1']")
	public WebElement address1;

	// To enter city
	@FindBy(xpath = "//input[@id='dwfrm_profile_address_city']")
	public WebElement city;

	// To enter zipcode
	@FindBy(xpath = "//input[@id='dwfrm_profile_address_postal']")
	public WebElement zipcode;

	// To enter state
	@FindBy(xpath = "//input[@id='dwfrm_profile_address_otherstates']")
	public WebElement state;

	// To enter phone
	@FindBy(xpath = "//input[@id='dwfrm_profile_address_phone']")
	public WebElement phone;
	
	//To click apply button in address form
	@FindBy(xpath="//button[@class='account-dialog-btn account-dialog-btn--apply apply-button button--secondary']")
	public WebElement applyButton;
	
	//To delete the address
	@FindBy(xpath="//a[@href='/on/demandware.store/Sites-Metallica-Site/default/Address-Delete?AddressID=Palayamkottai']")
	public WebElement deleteAddress;

	// To select country
	public void country() {

		WebElement country = driver.findElement(By.xpath("//select[@id='dwfrm_profile_address_country']"));

		Select c = new Select(country);
		c.selectByVisibleText("India");

	}
	
	

	// To check MyAccountData is downloaded or not
	public void downloadResult() {

		String filePath = "C:\\Users\\UTIS LAPTOP 35\\Downloads\\Metallica_Andrew_Rooban Raj.json";
		File file = new File(filePath);

		if (file.exists()) {
			System.out.println("Data File downloaded successfully.");
		} else {
			System.out.println("Data File download failed.");
		}

	}

}
