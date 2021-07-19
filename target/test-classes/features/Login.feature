Feature:  Home page login

Scenario Outline: Home Page positive login
Given User is in home page
When User enters <username> and <password>
Then User should be logged in
And Home page should be displayed

Examples:
|username	|password	|
|un123		|pswd123	|
|un456		|pswd456	|