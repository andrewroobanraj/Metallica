package org.elements;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPageElements extends BaseClass{
	
	//default constructor
	public PlaceOrderPageElements() {
						
	PageFactory.initElements(driver, this);	
		
	}
	
	@FindBy(xpath="//a[@class='back-to-cart']")
	public WebElement backTocart;

	@FindBy(xpath="(//a[@class='section-header-note'])[2]")
	public WebElement editBillingaddress;
	
	@FindBy(xpath="(//a[@class='section-header-note'])[3]")
	public WebElement editPayment;

}
