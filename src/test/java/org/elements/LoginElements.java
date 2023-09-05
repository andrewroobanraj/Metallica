package org.elements;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginElements extends BaseClass{
	
	//default constructor
	
	public LoginElements() {
		
		PageFactory.initElements(driver, this);
		
	}
	//Click profile icon to navigate to login page
	@FindBy(className="user-element")
	public WebElement profileIcon;
	
	//Enter UserName
	@FindBy(xpath="(//input[@type='text'])[2]")
	public WebElement userName;
	
	//Enter Password
	@FindBy(xpath="//input[@type='password']")
	public WebElement password;
	
	//Click Login button
	@FindBy(name="dwfrm_login_login")
	public WebElement loginButton;
	
	//Click Logout Button
	@FindBy(xpath="//a[text() ='Logout']")
	public WebElement logoutButton;
	
	//To check user is in dashboard by header name
	@FindBy(xpath="//h1[@class='overview-header account-primary-heading']")
	public WebElement nameOfUser;
	
	//To check user is in Invalid Credential page
	@FindBy(xpath="//div[@class='error-form']")
	public WebElement invalidCredentials;

	
	
	
	
	
	
	
	
	

}
