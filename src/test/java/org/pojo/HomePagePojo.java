package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePojo extends BaseClass{
	
	    //default constructor
		public HomePagePojo() {
			
			PageFactory.initElements(driver, this);	
		}
		
		//Click Cart Icon
		@FindBy(className="svg-icon-bag-dims")
		private WebElement cartIcon;
		
		public WebElement getCartIcon() {
			return cartIcon;
		}
		
		//Back To Home Page
		@FindBy(id="Layer_1")
		private WebElement homePage;
		
		public WebElement getHomePage() {
			return homePage;
		}
		
		//Click Search Menu
		@FindBy(className="svg-menu-search-dims")
		private WebElement searchMenu;
		
		public WebElement getSearchMenu() {
			return searchMenu;
		}
		
		//Close the Search Menu
		@FindBy(xpath="(//span[text() ='Close'])[1]")
		private WebElement closeSearch;
		
		public WebElement getCloseSearch() {
			return closeSearch;
		}
		
		//Click Met Store
		@FindBy(xpath="(//a[@class='has-sub-menu dropdown-toggle header-nav-link header-nav-link--l1 js-nav-link'])[7]")
		private WebElement metStore;
		
		public WebElement getMetStore() {
			return metStore;
		}
		
		//Click Help link
		@FindBy(xpath="//a[text()='Help']")
		private WebElement helplink;
		
		public WebElement getHelplink() {
			return helplink;
		}
		
		//Click Credits link
		@FindBy(xpath="//a[text()='Credits']")
		private WebElement creditsLink;
		
		public WebElement getCreditsLink() {
			return creditsLink;
		}
		
		//Click Terms of Use link
		@FindBy(xpath="//a[text()='Terms of Use']")
		private WebElement termsOfuseLink;
		
		public WebElement getTermsOfuseLink() {
			return termsOfuseLink;
		}
		
		//Click Privacy Policy link
		@FindBy(xpath="//a[text()='Privacy Policy']")
		private WebElement privacyPolicylink;
		
		public WebElement getPrivacyPolicylink() {
			return privacyPolicylink;
		}
		
		//Click AWMH
		@FindBy(xpath="(//span[text()='All Within My Hands Foundation'])[2]")
		private WebElement AWMH;
		
		public WebElement getAWMH() {
			return AWMH;
		}
		
		//Click Fifth Member Fans Club
		@FindBy(xpath="//img[@alt='Fifth Member Fan Club']")
		private WebElement fifthMember;
		
		public WebElement getFifthMember() {
			return fifthMember;
		}
		
		//Click View all Tour Dates
		@FindBy(xpath="//span[text()='View All Tour Dates']")
		private WebElement tourDates;
		
		public WebElement getTourDates() {
			return tourDates;
		}
		
		//Click Photos Section
		@FindBy(xpath="//a[text()='Photo']")
		private WebElement photos;
		
		public WebElement getPhotos() {
			return photos;
		}
		
		//Click Videos Section
		@FindBy(xpath="//a[text()='Video']")
		private WebElement videos;
		
		public WebElement getVideos() {
			return videos;
		}
		
		//Click Instagram Icon
		@FindBy(xpath="(//img[@alt ='Instagram'])[2]")
		private WebElement instagram;
		
		public WebElement getInstagram() {
			return instagram;
		}
		
		//Click Product 
		@FindBy(xpath="//a[@title = 'Go to Product: 72 Seasons T-Shirt (Charcoal)']")
		private WebElement product;

		public WebElement getProduct() {
			return product;
		}
		
		
		
		
		

}
