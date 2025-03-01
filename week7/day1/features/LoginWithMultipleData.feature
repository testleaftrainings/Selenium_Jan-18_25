Feature: Login with Mutiple data for LeafTaps Application

Scenario Outline: Test with Positive Data
Given Launch the Browser and Load the url
When Enter the username as <username>
And Enter the password as <passWd>
And Click on LoginButton
Then Verify Login is Successful

Examples:
|username|passWd|
|'DemoCsr2'|'crmsfa'|
|'DemoCsr'|'crmsfa'|
