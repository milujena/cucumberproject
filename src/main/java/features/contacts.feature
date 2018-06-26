Feature: Free crm create contacts
Scenario Outline: free crm create a new contact scenario
Given user is already on loginpage
When title is already on loginpage
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on homepage
Then user move to new contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then close the browser
Examples:
      |username|password|firstname|lastname|position|
      |milu123 |milu123 |parth   |sarath |manager |
      |milu123 |milu123 |shant   |kuma   |director|
      |milu123 |milu123 |kartik  |padhi  |software ENG|