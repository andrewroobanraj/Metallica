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
	
	//To click the checkout button
	@FindBy(xpath="//a[@title='Checkout']")
	private WebElement checkOut;

	public WebElement getCheckOut() {
		return checkOut;
	}
	
	//To select the Product quantity
	@FindBy(xpath="(//div[@class='c-product-quantity__button js-quantity-quantity__button js-product-quantity__button--up c-product-quantity__button--up product-quantity-up'])[1]")
	private WebElement productQty;
			
	public WebElement getProductQty() {
	return productQty;
	}
	
	//To select the 2nd Product quantity
	@FindBy(xpath="(//div[@class='c-product-quantity__button js-quantity-quantity__button js-product-quantity__button--up c-product-quantity__button--up product-quantity-up'])[2]")
	private WebElement productQty2;
				
	public WebElement getProductQty2() {
	return productQty;
	} 
	
	//Navigate to PDP from cart page
	@FindBy(xpath="(//a[@title='Go to Product: M Logo 72 Seasons Tracks T-Shirts - Small'])[4]")
	private WebElement toPDP;
	
	public WebElement getToPDP() {
		return toPDP;
	}

	//To remove product from cart page
	@FindBy(xpath="(//button[@class='button-text'])[1]")
	private WebElement removeCart;

	public WebElement getRemoveCart() {
		return removeCart;
	}
	
	//To click guest user radio button
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement guestRadio;

	public WebElement getGuestRadio() {
		return guestRadio;
	}
	
	//To click guest checkout button
	@FindBy(xpath="(//button[@class='add-to-cart button button--cta checkout guest-checkout cart-button'])")
	private WebElement guestCheckout;

	public WebElement getGuestCheckout() {
		return guestCheckout;
	}
	
	//To enter guest email
	@FindBy(xpath="(//input[@class='input-text emailAddress required'])")
	private WebElement guestmail;

	public WebElement getGuestmail() {
		return guestmail;
	}
	
	//Back to cart form shipping page
	@FindBy(xpath="(//span[@class='label label--desktop'])")
	private WebElement backToCart;

	public WebElement getBackToCart() {
		return backToCart;
	}
	
	//To enter password in cart page
	@FindBy(xpath="(//input[@class='input-text  required'])")
	private WebElement cartPassword;

	public WebElement getCartPassword() {
		return cartPassword;
	}
	
	//To click user checkout button
	@FindBy(xpath="(//button[@class='add-to-cart button button--cta checkout login cart-button'])")
	private WebElement userCheckout;

	public WebElement getUserCheckout() {
		return userCheckout;
	}
	
	
}
