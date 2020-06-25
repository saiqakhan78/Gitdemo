Feature: Application Login

Scenario: home page default login
Given user is on login page
When user login into application username and password
Then home page is polutated 
And cards are displayed

