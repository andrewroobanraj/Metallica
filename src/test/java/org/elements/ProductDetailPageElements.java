package org.elements;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPageElements extends BaseClass {
	
		//default constructor
		public ProductDetailPageElements() {
							
		PageFactory.initElements(driver, this);	
	}

		//To select the Product
		@FindBy(xpath="//a[@title='Go to Product: M Logo 72 Seasons Tracks T-Shirts']")
		public WebElement product;
		
		//To select the Product size
		@FindBy(xpath="(//a[@class='swatchanchor'])[2]")
		public WebElement productSize;
		
		//To select the Product quantity
		@FindBy(xpath="(//div[@class='c-product-quantity__button js-quantity-quantity__button js-product-quantity__button--up c-product-quantity__button--up product-quantity-up'])")
		public WebElement productQty;
		
		//To add the product to cart
		@FindBy(xpath="//button[@id='add-to-cart']")
		public WebElement addTocart;
		
		//To remove the product from cart
		@FindBy(xpath="(//button[@type='button'])[1]")
		public WebElement remove;

		//To move next slide in Einstein Product recommendations
		@FindBy(xpath="//button[@id='slick-slide-control17']")
		public WebElement nextSlide;
		
		//To move previous slide in Einstein Product recommendations
		@FindBy(xpath="//button[@id='slick-slide-control10']")
		public WebElement previousSlide;

		//To click the search field
		@FindBy(xpath="//button[@class='search-toggle']")
		public WebElement search;

		//To enter product name in search field
		@FindBy(xpath="//input[@type='text']")
		public WebElement enterText;
		
		//To select pre-order check box
		@FindBy(xpath="//input[@id=\"preorder-acknowledgement\"]")
		public WebElement checkBox;

		//To add pre-order product to cart
		@FindBy(xpath="//button[@class='preorder-add-to-cart button button--cta']")
		public WebElement preOrdercart;		
		
		//To check the product is added to the cart
		@FindBy(xpath="//span[@class='h3 js-minicart-quantity']")
		public WebElement cartQuantity;
		
}
