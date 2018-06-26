#with out examples keyword
#Feature: free crm login feature
#Scenario: free crm login test scenario
#Given user is already on loginpage
#When title is already on loginpage
#Then user enters "milu123" and "milu123"
#Then user clicks on login button
#Then user is on homepage
#Then close the browser
#
#with examples keyword
Feature: free crm login feature
Scenario Outline: free crm login test scenario
Given user is already on loginpage
When title is already on loginpage
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on homepage
Then close the browser
Examples:
    |username| password |
    |milu123 | milu123  |
    |milu    | milu     |
 
 