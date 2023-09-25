@PlaceOrder
Feature: To validate the fields in Place Order page 

	Background:
		Given User is in metallica home page	
	
	Scenario: Validate the shipping address is copied in the billing address page when the user clicks Use this address for billing checkbox in the shipping page
		When User Add an product to cart page
		And  User checkout from cart
		And  User check the Use this address for billing checkbox is selected
		And  User navigate to Place Order page
		Then User check the shipping and billing address in the Place Order page
		
	Scenario:  Validate on clicking the "Edit cart" button from the palce order page
		When User Add an product to cart page
		And  User checkout from cart
		And  User navigate to Place Order page
		Then User click the edit cart link
		
	Scenario: Validate the order total is calculated correctly in the place order page
		When User Add an product to cart page
		And  User checkout from cart
		And  User navigate to Place Order page
		Then User check the Order Total
		
	Scenario: Validate the International Shipping policy message is displayed for International addresses
		When User Add an product to cart page
		And  User checkout from cart
		And  User select the International Shipping Address
		And  User navigate to Place Order page
		Then User see the International Shipping policy message in Place Order page
	
	Scenario: Validate the Customer is not allowed to place the order without selecting the checkbox
		When User Add an product to cart page
		And  User checkout from cart
		And  User select the International Shipping Address
		And  User navigate to Place Order page
		Then User is not allowed to place the order without selecting the checkbox
		
		
	
	
