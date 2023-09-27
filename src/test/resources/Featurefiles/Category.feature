@Category
Feature: To validate the fields in the Category Browser Page

	Background: 
		Given User is in metallica home page
	
	Scenario: Validate the product tile in the category browser page
		When User navigate to Met Store
		And  User see the Product tile with product image and price
		And  User click the product image
		Then user see the product badge in single line
	
	Scenario: Verify by selecting the Filters in the left panel
		When User navigate to Met Store
		Then User apply the filters in the left panel
		
	Scenario: Validate the user can navigate through page number option
		When User navigate to Met Store
		And  User click the page numbers
		Then User navigated to that page
		
	Scenario: Validate all the products are displayed by clicking View all link
		When User navigate to Met Store
		And  User click the view all link
		Then User see all the products in a single page 