Feature: Login with LeafTaps Application

#Background - common for all the Scenario and Scenario Outline
#Background:
#Given Launch the Browser and Load the url


# tags ->@name

@sanity @smoke 
Scenario: Test with Positive Data

When Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
And Click on LoginButton
Then Verify Login is Successful

@dilip @sanity
Scenario: Test Application with Negative Data

When Enter the username as 'Demo'
And Enter the password as 'crmsfa'
And Click on LoginButton
But Verify Login is not Successful