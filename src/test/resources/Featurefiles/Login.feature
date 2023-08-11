 
Feature: To validate the functionality of Metallica application
  
  Background: 
  	Given User is in metallica home page
  
  @login 
	Scenario: To validate login & logout using valid userName and valid Password
		When User navigate to login page
		And User enter valid userName and valid Password
		And User click Login button
		Then User should be in a dashboard page
		And User click Logout
	
	@invalidLogin
	Scenario Outline: To validate login with invalid credentials
		When User navigate to login page
		And User have to enter "<username>" and "<password>"
		And User click login button
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
		And User click apply button without enter values in mandatory fields
		And User enter values in all the fields
		And User enter invalid values in the fields
		And User click apply button
		Then User is in registration page
	
	
	