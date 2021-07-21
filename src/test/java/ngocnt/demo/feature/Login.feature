Feature: MY ACCOUNT - LOGIN
 as a customer
  i want to buy some books
  so that i need to login

#  Scenario: 1.Login with valid username and password
#   Given Open the homepage
#   And Click on My Account Menu
#   And Enter registered chungnd@paraline.com.vn in username textbox
#   And Enter ParalineAuto123@ in password textbox
#   And Click on login button
#   Then User must successfully login to the web page
#
#  Scenario: 2.Login with incorect username and password
#    Given Open the homepage
#    And Click on My Account Menu
#    And Enter registered ngocnt2@paraline.com.vn in username textbox
#    And Enter 123456 in password textbox
#    And Click on login button
#    Then Proper error must be displayedError: A user could not be found with this email address.
#
#  Scenario: 3.Login with corect username and empty password
#    Given Open the homepage
#    And Click on My Account Menu
#    And Enter registered chungnd@paraline.com.vn in username textbox
#    And Enter  in password textbox
#    And Click on login button
#    Then Proper error must be displayedError: Password is required.
#
#  Scenario: 4.Login with empty username and valid password
#    Given Open the homepage
#    And Click on My Account Menu
#    And Enter registered  in username textbox
#    And Enter ParalineAuto123@ in password textbox
#    And Click on login button
#    Then Proper error must be displayedError: Username is required.
#
#  Scenario: 5.Login with empty username and empty password
#    Given Open the homepage
#    And Click on My Account Menu
#    And Enter registered  in username textbox
#    And Enter  in password textbox
#    And Click on login button
#    Then Proper error must be displayedError: Username is required.
#
#  Scenario: 6.Login with password should be masked
#    Given Open the homepage
#    And Click on My Account Menu
#    And Enter registered chungnd@paraline.com.vn in username textbox
#    And Enter the ParalineAuto123@ field with some characters.
#    Then The password field should display the characters in asterisks
#
#  Scenario: 7.Login Hanldes case sensitive
#    Given Open the homepage
#    And Click on My Account Menu
#    And Enter the case changed chungnd@paraline.com.vn in username textbox
#    And Enter the case changed 123333 in the password tetxbox
#    And Click on login button
#    And Login must fail saying ERROR: The password you entered for the username chungnd@paraline.com.vn is incorrect. Lost your password?

  Scenario: 8.Login Authentication
    Given Open the homepage
    And Click on My Account Menu
    And Enter the case changed chungnd@paraline.com.vn in username textbox
    And Enter the case changed ParalineAuto123@ in the password tetxbox
    And Click on login button
    And Once your are logged in, sign out of the site, press back button
    Then User shouldn’t be signed in to his account rather a general webpage must be visible
