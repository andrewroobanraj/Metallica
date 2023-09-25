@ProductDetail
Feature: To validate the fields in Product Detail page

	Background:
		Given User is in metallica home page
		
	Scenario: Validate the product Image and description are displayed
		When User navigate to Met store
		Then User select any Product
		
	Scenario: Validate the product can be added to the shopping cart from PDP
		When User navigate to Met store
		And  User select any Product in Met Store
		Then User click the Add to Cart button
	
	Scenario: Validate the quantity can be added as per user requirements from the PDP
		When User navigate to Met store
		And  User select any Product in Met Store
		Then User click the Add Quantity button in PDP
	
	Scenario: Validate user can choose the size variant given for the product
		When User navigate to Met store
		And  User select any Product in Met Store
		Then User click the Size variant
		
	Scenario: Validate the Pre-order functionality for pre-order products
		When User Add a Pre-order product  to cart
		And  User Click the Pre-order CTA
		Then User select the Pre-order product policy checkbox
		And  User Add the product to cart
		
	Scenario: Validate  the Einstein Product recommendations below the product
		When User navigate to Met store
		And  User select any Product in Met Store
		Then User see the Einstein Product recommendations below the product
		