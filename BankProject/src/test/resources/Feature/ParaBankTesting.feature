@ParaBankTesting
Feature: Para Bank Functional Testing Feature File

@RegisterTag
Scenario Outline: Verifying Para Bank With Giving Valid Register Details
Given verify that user is on para bank customer login page
When user click on register link
Then user can see the signup register form
When user enter a valid firstname as "<fname>"
When user enter a valid lastname as "<lname>"
When user enter a valid address as "<address>"
When user enter a valid city as "<city>"
When user enter a valid state as "<state>"
When user enter a valid pincode as "<pinno>"
When user enter a valid phoneno as "<phone>"
When user enter a valid ssnno as "<ssn>"
Then user enter a valid username as "<uname>"
Then user enter a valid password as "<pword>"
Then user enter a valid confirmpass as "<cpass>"
And user finally click on register button
And user see the successfully registered message
Examples:
|fname|lname|address|city|state|pinno|phone|ssn|uname|pword|cpass|
|baby|girls|chennai|chennai|tamilnadu|600000|1234567890|12345|babygirls|12345|12345|
#|c|d|chennai|chennai|tamilnadu|600000|1234567890|12345|cd|1234567890|1234567890|
#|car|car|chennai|chennai|tamilnadu|600000|1234567890|12345|carcar|1234567890|1234567890|
#|bike|bike|chennai|chennai|tamilnadu|600000|1234567890|12345|bikebike|1234567890|1234567890|
#|last|last|chennai|chennai|tamilnadu|600000|1234567890|12345|lastlast|1234567890|1234567890|
#|z|z|chennai|chennai|tamilnadu|600000|1234567890|12345|zz|1234567890|1234567890|
#|super|boy|chennai|chennai|tamilnadu|600000|1234567890|123|superboy|12345|12345|
  
@LoginTag
Scenario Outline: Verifying Para Bank With Giving Valid Login Details
Given verify that user is on customer login page
When user enter a valid username "<username>"
When user enter a valid password "<password>"
And user finally click on login button
And verify that user can see the account balance page 
Examples:
|username|password|
|babygirls|12345|
#|cd|1234567890|
#|carcar|1234567890|
#|bikebike|1234567890|
#|lastlast|1234567890|
#|superboy|12345|

@ForgotLoginTag
Scenario Outline: Verify Para Bank With Checking and Finding Correct Login Info UserName & PassWord
Given user is on customer login page 
When user click on forgot login link
Then verify that user should see the customer details page
Then user validate giving firstname as "<firstname>"
Then user validate giving lastname as "<lastname>"
Then user validate giving address as "<address>"
Then user validate giving city as "<city>"
Then user validate giving state as "<state>"
Then user validate giving pinno as "<pinno>"
Then user validate giving ssnno as "<ssnno>"
And user click on find my login info button
Then verify that user should see the customer login details page "<title of page>"
Then user retriving the username and password for login to para bank
Examples:
|firstname|lastname|address|city|state|pinno|ssnno|title of page|
|baby|girls|chennai|chennai|tamilnadu|600000|123|Customer Lookup|

@AccountOpenTag
Scenario Outline: Verify Para Bank With Giving Valid NewAccount Creating Details
Given user should login to para bank with valid credentials uname and pword as "<uname>" & "<pword>"
When user click on register button
Then verify user should navigate to new account open page
Then user click new account open link
Then verfiy that user should see the title of page as "<title of page>"
And user select the dropdown of account type
And user finally click open account button
And user see the successfully account open message
Examples:
|uname|pword|title of page|
|babygirls|12345|Open New Account|
#|cd|1234567890|Open New Account|
#|carcar|1234567890|Open New Account|
#|bikebike|1234567890|Open New Account|
#|lastlast|1234567890|Open New Account|
#|superboy|12345|Open New Account|
