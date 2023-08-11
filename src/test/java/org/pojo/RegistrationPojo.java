package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPojo extends BaseClass{
	
	//default constructor
	public RegistrationPojo() {
				
		PageFactory.initElements(driver, this);	
	}
	
	//Click the Profile icon
	@FindBy(className="user-element")
	private WebElement profileIcon;
	
	public WebElement getProfileIcon() {
		return profileIcon;
	}
	
	//Click Create New Account Button
	@FindBy(xpath="(//button[@type='submit'])[3]")
	private WebElement createAccount;
	
	public WebElement getCreateAccount() {
		return createAccount;
	}
	
	//Click Apply Button
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement applyButton;
	
	public WebElement getApplyButton() {
		return applyButton;
	}
	
	//To enter First Name
	@FindBy(id="dwfrm_profile_customer_firstname")
	private WebElement firstName;
	
	public WebElement getFirstName() {
		return firstName;
	}
	
	//To enter Last Name
	@FindBy(id="dwfrm_profile_customer_lastname")
	private WebElement lastName;
	
	public WebElement getLastName() {
		return lastName;
	}
	
	//To enter User Name
	@FindBy(id="dwfrm_profile_customer_username")
	private WebElement userName;
	
	public WebElement getUserName() {
		return userName;
	}
	
	//To enter Email
	@FindBy(id="dwfrm_profile_customer_email")
	private WebElement email;
	
	public WebElement getEmail() {
		return email;
	}
	
	//To enter Confirm Email
	@FindBy(id="dwfrm_profile_customer_emailconfirm")
	private WebElement confirmEmail;

	public WebElement getConfirmEmail() {
		return confirmEmail;
	}
	
	//To enter Password
	@FindBy(xpath="(//input[@type='password'])[1]")
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}
	
	//To enter Confirm Password
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement confirmPassword;
	
	public WebElement getConfirmPassword() {
		return confirmPassword;
	}
	
	//To enter Date of Birth
	@FindBy(id="dwfrm_profile_customer_birthday")
	private WebElement dateOfbirth;
	
	public WebElement getDateOfbirth() {
		return dateOfbirth;
	}
	
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
	private WebElement zipcode;

	public WebElement getZipcode() {
		return zipcode;
	}	

	//To select the CheckBox
	@FindBy(id="dwfrm_profile_customer_addtoemaillist")
	private WebElement checkbox;
	
	public WebElement getCheckbox() {
		return checkbox;
	}

	public void scrollDown() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, 600)");
	}
	
	
	
	
		

}
