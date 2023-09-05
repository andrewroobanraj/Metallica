package org.elements;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationElements extends BaseClass{
	
	//default constructor
	public RegistrationElements() {
				
		PageFactory.initElements(driver, this);	
	}
	
	//Click the Profile icon
	@FindBy(className="user-element")
	public WebElement profileIcon;
	
	//Click Create New Account Button
	@FindBy(xpath="(//button[@type='submit'])[3]")
	public WebElement createAccount;
	
	//Click Apply Button
	@FindBy(xpath="(//button[@type='submit'])[2]")
	public WebElement applyButton;
	
	//To enter First Name
	@FindBy(id="dwfrm_profile_customer_firstname")
	public WebElement firstName;
	
	//To enter Last Name
	@FindBy(id="dwfrm_profile_customer_lastname")
	public WebElement lastName;
	
	//To enter User Name
	@FindBy(id="dwfrm_profile_customer_username")
	public WebElement userName;
	
	//To enter Email
	@FindBy(id="dwfrm_profile_customer_email")
	public WebElement email;
	
	//To enter Confirm Email
	@FindBy(id="dwfrm_profile_customer_emailconfirm")
	public WebElement confirmEmail;

	//To enter Password
	@FindBy(xpath="(//input[@type='password'])[1]")
	public WebElement password;
	
	//To enter Confirm Password
	@FindBy(xpath="(//input[@type='password'])[2]")
	public WebElement confirmPassword;
	
	//To enter Date of Birth
	@FindBy(id="dwfrm_profile_customer_birthday")
	public WebElement dateOfbirth;
	
	//To select the Gender	
	public void genderDropdown() {
	
	WebElement gender = driver.findElement(By.id("dwfrm_profile_customer_gender"));
    
    Select s=new Select(gender);
    s.selectByVisibleText("Male");
	}
	
	//To select the Country
	public void countryDropdown() {
		
	WebElement country = driver.findElement(By.id("dwfrm_profile_customer_country"));

    Select c=new Select(country);
    c.selectByVisibleText("India");
	}
	
	//To enter the ZipCode
	@FindBy(id="dwfrm_profile_customer_postal")
	public WebElement zipcode;

	//To select the CheckBox
	@FindBy(id="dwfrm_profile_customer_addtoemaillist")
	public WebElement checkbox;
	
	public void scrollDown() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, 600)");
	}
	
	//To check user is in Registratioin Page
	@FindBy(xpath="//a[@title='Register']")
	public WebElement register;
	
}
