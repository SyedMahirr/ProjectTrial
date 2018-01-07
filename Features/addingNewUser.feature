@Add_New_User 
Feature: Admin Adding New User to the System 

	In order to Add New User to the System 

	As an site Admin

	I want to click on the left side Admin, click on the User Management, 
		click on the Users, click on the Right side Green Plus sign, Enters Employee Name, 
		Enters Username, Enters ESS Role, Selects Supervisor Role, Selects Admin Role, Selects Status
		Enters Password, Enters Re-types the Password to confirm and Clicks on Save	

Scenario: Positive 

	Given Access to the Dash-Board 
	When Click on the Admin 
	And Click on User Management 
	And Click on Users 
	And Click on the Green Plus sign 
	And Enters Employee Name, 
	And Enters Username, 
	And Enters ESS Role, 
	And Selects Supervisor Role, 
	And Selects Admin Role, 
	And Selects Status 
	And Enters Password, 
	And Enters Re-types the Password 
	And Clicks on Save 
	Then Admin sucessfully adds a  New Site User. 