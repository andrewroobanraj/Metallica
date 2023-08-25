package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryBrowserPagePojo extends BaseClass{
	
		//default constructor
		public CategoryBrowserPagePojo() {
						
			PageFactory.initElements(driver, this);	
		}

		//Navigate to Met Store
		@FindBy(xpath="//img[@alt='SHOP ALL']")
		private WebElement shopAll;

		public WebElement getShopAll() {
			return shopAll;
		}
		
		//To click the product image
		@FindBy(xpath="//a[@title='Go to Product: 72 Seasons Silver Ring']")
		private WebElement product;
		
		public WebElement getProduct() {
			return product;
		}
		
		//Back to category page
		@FindBy(xpath="//a[@title='Go to Shop']")
		private WebElement shop;

		public WebElement getShop() {
			return shop;
		}
		
		//To select the price filter
		@FindBy(xpath="(//i[@class='fa fa-square-o fa-lg'])[1]")
		private WebElement priceFilter;
		
		public WebElement getPriceFilter() {
			return priceFilter;
		}
		
		//To clear the applied filter
		@FindBy(xpath="//a[@class='js-clear-filters breadcrumb-refinement-value breadcrumb-refinement-value--clear button--secondary']")
		private WebElement clearFilter;
		
		public WebElement getClearFilter() {
			return clearFilter;
		}
		
		//To select the department filter
		@FindBy(xpath="(//i[@class='fa fa-square-o fa-lg'])[7]")
		private WebElement deptFilter;
		
		public WebElement getDeptFilter() {
			return deptFilter;
		}
		
		//To select the size filter
		@FindBy(xpath="(//i[@class='fa fa-square-o fa-lg'])[11]")
		private WebElement sizeFilter;
		
		public WebElement getSizeFilter() {
			return sizeFilter;
		}
		
		//To select the feature filter
		@FindBy(xpath="(//i[@class='fa fa-square-o fa-lg'])[19]")
		private WebElement featureFilter;
		
		public WebElement getFeatureFilter() {
			return featureFilter;
		}
		
		//To select the album filter
		@FindBy(xpath="(//i[@class='fa fa-square-o fa-lg'])[22]")
		private WebElement albumFilter;
		
		public WebElement getAlbumFilter() {
			return albumFilter;
		}
		
		//To select the artist filter
		@FindBy(xpath="(//i[@class='fa fa-square-o fa-lg'])[39]")
		private WebElement artistFilter;

		public WebElement getArtistFilter() {
			return artistFilter;
		}
		
		//To navigate page 2
		@FindBy(xpath="//a[@class='page-2']")
		private WebElement pageNo2;
		
		public WebElement getPageNo2() {
			return pageNo2;
		}
		
		//To navigate page 3
		@FindBy(xpath="//a[@class='page-3']")
		private WebElement pageNo3;
		
		public WebElement getPageNo3() {
			return pageNo3;
		}
		
		//To click view all link
		@FindBy(xpath="//a[@class='view-all']")
		private WebElement viewAll;

		public WebElement getViewAll() {
			return viewAll;
		}
				
}
