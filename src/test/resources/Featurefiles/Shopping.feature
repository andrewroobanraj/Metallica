@Shopping
Feature: To validate the fields in Shopping cart page 

	Background:
		Given User is in metallica home page
	
	Scenario: Validate all items and their totals is displayed in the cart
		When User add few items to cart
		And  User navigate to cart page
		Then User see all items and their totals
	
	Scenario: Validate by changing the product quantity  in the cart
		When User add an item to cart
		And  User navigate to cart page
		Then User change the product quantity
	
	Scenario: Validate by selecting remove link below the  item in the cart page
		When User add an item to cart
		And  User navigate to cart page
		Then User click on remove link below product name
		
	Scenario: Validate the product link is clickable and navigates the user to the PDP
		When User add an item to cart
		And  User navigate to cart page
		Then User click the product link
	
	Scenario: Validate the User is allowed to checkout as a guest user
		When User add an item to cart
		And  User navigate to cart page
		And  User select the Checkout as Guest radio button
		Then User click the Checkout button
		
	Scenario: Validate the User is able to Login from Cart page
		When User add an item to cart
		And  User navigate to cart page
		And  User enter the Registered email address and password
		Then User Login from Cart page
		
	Scenario: Validate the items in the shopping cart remains the same, during logout the site and login later
		When User add an item to cart
		And  User navigate to cart page
		And  User enter the Registered email address and password
		And  User logout the account and again login
		Then User see the items remains same in the cart page