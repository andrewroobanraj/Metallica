package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPagePojo extends BaseClass{
	
	//default constructor
	public ShoppingCartPagePojo() {
				
	PageFactory.initElements(driver, this);	
	
	}
	
	//To close the mini cart 
	@FindBy(xpath="(//button[@class='mini-cart-close js-mini-cart-close primary-link'])[1]")
	private WebElement closeCart;

	public WebElement getCloseCart() {
		return closeCart;
	}
	
	//To select the product
	@FindBy(xpath="//a[@title='Go to Product: Band 72 Seasons Tracks T-Shirt']")
	private WebElement secondProduct;

	public WebElement getSecondProduct() {
		return secondProduct;
	}
	
	//To select the product size
	@FindBy(xpath="(//a[@class='swatchanchor'])[2]")
	private WebElement productSize;

	public WebElement getProductSize() {
		return productSize;
	}
	
	
	
	
	
}
