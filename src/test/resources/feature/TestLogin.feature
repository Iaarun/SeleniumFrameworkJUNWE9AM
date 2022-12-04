Feature: Test login functionality of ecommerce app

Scenario Outline: user should be login with valid data
Given user is at the login page
When user provide <username> and <password>
And click on Login button
#Then user should be navigated to Account page
 #|selenium user|

Examples:
|username         |password  |
|"cbatest7@gmail.com"|"cba@test"|

