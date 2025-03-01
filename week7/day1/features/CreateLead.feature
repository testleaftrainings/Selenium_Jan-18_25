Feature: Create Lead

Scenario: Test with Positive Data
Given Launch the Browser and Load the url
When Enter the username as 'DemoCsr' 
And Enter the password as 'crmsfa'
And Click on LoginButton
Then Verify Login is Successful
When Click on Crmsfa link
And Click on Leads button
And Click on CreateLead Button