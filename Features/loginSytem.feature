@Log_in 
Feature: User Entering Valid Credentials To Log-in to the System 
	
	
	In order to log into the Dashboard 
	As an Admin
	I want to Enter the Username, Password and Click log in button 

Scenario: Positive 

	Given Log In Site URL
	 
	When Enters Valid Username
	 
	And Enter Password 
	
	And Clicks the Log-in Button 
	
	Then views the Dashboard. 
