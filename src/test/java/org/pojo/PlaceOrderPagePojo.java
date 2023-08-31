package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPagePojo extends BaseClass{
	
	//default constructor
	public PlaceOrderPagePojo() {
						
	PageFactory.initElements(driver, this);	
		
	}
	
	@FindBy(xpath="//a[@class='back-to-cart']")
	private WebElement backTocart;

	public WebElement getBackTocart() {
		return backTocart;
	}
	
	@FindBy(xpath="(//a[@class='section-header-note'])[2]")
	private WebElement editBillingaddress;
	
	public WebElement getEditBillingaddress() {
		return editBillingaddress;
	}
	
	@FindBy(xpath="(//a[@class='section-header-note'])[3]")
	private WebElement editPayment;

	public WebElement getEditPayment() {
		return editPayment;
	}

}
