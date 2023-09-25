@Shipping
Feature: To validate the fields in Shipping page 

	Background:
		Given User is in metallica home page
	
	Scenario: Validate the error message appears for the required fields
		When User Add an item to cart
		And  User Checkout from cart
		Then User Skips the mandatory fields and submit
	
	Scenario: Validate the shipping addresss fields are valid
		When User Add an item to cart
		And  User Checkout from cart
		Then User click continue to billing button with valid shipping address
		
	Scenario: Validate the error message throws for invalid address
		When User Add an item to cart
		And  User Checkout from cart
		And  User enter invalid values in zipcode,country and state fields
		Then User see the error message for invalid address
		
	Scenario: Validate the saved address shows in the dropdown for the registered users
		When User Add an item to cart
		And  User Checkout from cart
		Then User see the saved address in dropdown
		
	Scenario: Validate by selecting Use this address for billing checkbox
		When User Add an item to cart
		And  User Checkout from cart
		Then User click the Use this address for billing checkbox
		
	Scenario: Validate on clicking Is this a Gift checkbox the message box appears 
		When User Add an item to cart
		And  User Checkout from cart
		Then User click the Is this a Gift checkbox

	Scenario: Validate the Shipping method table
		When User Add an item to cart
		And  User Checkout from cart
		Then User enter the shipping address
		
	Scenario: Validate the shipping methods are displayed as ship now for instock product
		When User Add an item to cart
		And  User Checkout from cart
		Then User check the ship method for in stock product
	
	Scenario: Validate the shipping methods are displayed as ship later for Pre order product
		When User add Pre order product to cart
		And  User Checkout from cart
		Then User check the ship method pre order product	
			
	Scenario: Valdiate the same shipping method reflected in the order summary section
		When User Add an item to cart
		And  User Checkout from cart
		And  User select the shipping method
		Then User check the selected shipping method is reflected in order summary section
		And  User check the Order total amount includes the shipping method rate
	
	Scenario: Validate by clicking the Continue to billing button
		When User Add an item to cart
		And  User Checkout from cart
		Then User Click the Continue to billing button