#Feature: Para Bank
#
#
#Scenario Outline: Verify Para Bank With Valid NewAccount Create
#Given user should login to para bank with valid credentials uname and pword as "<uname>" & "<pword>"
#When user click on register button
#Then verify user should navigate to new account open page
#Then user click new account open link
#Then verfiy that user should see the title of page as "<title of page>"
#And user select the dropdown of account type
#And user finally click open account button
#
#Examples:
#|uname|pword|title of page|
#|firstlast|1234567890|Open New Account|
