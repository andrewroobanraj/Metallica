 
Feature: To validate the functionality of Metallica application
  
  Background: 
  	Given User is in metallica home page
  
  @login 
	Scenario: To validate login & logout using valid userName and valid Password
		When User navigate to login page
		And  User enter valid userName and valid Password
		And  User click Login button
		Then User should be in a dashboard page
		And  User click Logout
	
	@invalidLogin
	Scenario Outline: To validate login with invalid credentials
		When User navigate to login page
		And  User have to enter "<username>" and "<password>"
		And  User click login button
		Then User should be in a invalid credentials page
		
		Examples:
		 | username              | password     |
		 | Metallica12@gmail.com | metallica123 |
	   | 78678932428           | 123Metalica  |
	
	@homepagelinks
	Scenario: To validate all the links in the Home page
		When User click all the links in home page 
		Then User back to home page
	
	@registrationpage
	Scenario: To validate all the fields in the registration page
		When User navigate to registration page
		And  User click apply button without enter values in mandatory fields
		And  User enter values in all the fields
		And  User enter invalid values in the fields
		And  User click apply button
		Then User is in registration page
		
	@myaccountpage
	Scenario: To validate all the fields in My Account Page
		When User navigate to my account page
		And  User click all the links in my account page
		Then User back to My Account page
		
	@categorybrowserpage
	Scenario: To validate all the fields in the Category Browser Page
		When User navigate to Met Store
		And  User click the product image
		And  User apply the filters in the left panel
		And  User navigate to next page by clicking page numbers
		Then User click the view all link
		
	@productdetailpage
	Scenario: To validate all the fields in the Product Detail Page
		When User navigate to product detail page
		And  User choose the size variant
		And  User select the product quantity
		And  User add the product to cart
		And  User check the Einstein Product recommendations
		Then User add the pre-order product to cart
		
	@shoppingcartpage
	Scenario: To validate all the fields in the shopping cart page
		When User add some products to cart
		And  User change the product quantity
		And  User navigate to PDP by clicking product link
		And  User remove the product from cart
		Then User checkout as a guest
		And  User login in cart page and checkout
		And  User logout and login again to check the cart products
		
	@checkout-shippingpage
	
		
	
	
	