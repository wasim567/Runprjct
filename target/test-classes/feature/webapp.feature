Feature: Rahulsheety academy Webapp validation



Scenario: User is able to successfully submit the practice page form
Given user is on homepage "https://www.rahulshettyacademy.com/#/index"
When user clicks on practice page link
Then user is navigated to pracice page
When user enters the name "waseem" and emailId "kwas123@gmail.com"
And selects the checkbox
And clicks on submit 
Then user is successfully unlocked the practice apps

Scenario Outline: User is able to successflly login with the credentials
Given user is on homepage "https://www.rahulshettyacademy.com/#/index"
When user clicks on Login tab
Then user is navigated to signup page
When user enters username<Username> and password<Password>
And clicks on Login
Then user is able to login to the app

Examples:
|Username|Password|
|was@gmail|12345|
|abd123@gmail|12345|
|rah.k@gmail|12345|
