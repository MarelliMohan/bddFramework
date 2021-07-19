Feature: Home Page Login2
@Sanity
Scenario: Home Page positive login
Given User is in home page
When User enters username and password
Then User should be logged in
And Home page should be displayed

@Smoke
Scenario: Home Page negative login
Given User is not in home page
When User enters wrong username and password
Then User should not be logged in
And Home page should not be displayed