@Login
Feature: To validate the Login functionality of Metallica application

 Background:
		Given User is in metallica home page
		  
 Scenario: Validate using valid credential in the login page
  	When User navigate to login page
  	Then User Enter valid email id and valid password in the login page
  	
 Scenario Outline: Validate using Invalid credential in the login page
  	When User navigate to login page
  	Then Enter invalid credentials "<username>" and "<password>"
  	
  	Examples:
		 | username              				| password     |
		 | Metallica1@gmail.com 				| metallica123 |
	   | andrewroobanraaj@gmail.com   | Metallica@23 |
	   | metallicaabc@gmail.com				| Metallica@2	 |
 
 Scenario: Validate user is not able to create new account using already registered email address in the login page
	  When User navigate to login page
	  Then Click Create Account button
	  And  User enter already existing email address in create account form and submit
	  

 		
