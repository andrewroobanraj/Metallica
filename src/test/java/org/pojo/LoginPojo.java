package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{
	
	//default constructor
	
	public LoginPojo() {
		
		PageFactory.initElements(driver, this);
		
	}
	//Click profile icon to navigate to login page
	@FindBy(className="user-element")
	private WebElement profileIcon;

	public WebElement getProfileIcon() {
		return profileIcon;
	}
	
	//Enter UserName
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement userName;

	public WebElement getUserName() {
		return userName;
	}
	
	//Enter Password
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	//Click Login button
	@FindBy(name="dwfrm_login_login")
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//Click Logout Button
	@FindBy(xpath="//a[text() ='Logout']")
	private WebElement logoutButton;

	public WebElement getLogoutButton() {
		return logoutButton;
	}
	
	
	
	
	
	
	
	
	

}
