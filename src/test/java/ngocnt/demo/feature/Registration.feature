Feature: MY ACCOUNT - REGISTRATION

  Scenario: 1.Registration  Signing
  Given Open the homepage
  And Click on My Account Menu
  And Enter registered ngocNguyen23@mbbank.com.vn in Email-Address textbox
  And Enter MBBank^^123 in password new textbox
  And Click on Register button
  And User will be registered successfully and will be navigated to the Home page

  Scenario: 2.Registration  with invalid EmailID
    Given Open the homepage
    And Click on My Account Menu
    And Enter n@s in Email-Address textbox
    And Enter MBBank^^123 in password textbox
    And Click on Register button
    Then Registration must fail with a warning messageError: Please provide a valid email address.


  Scenario: 3.Registration  with empty EmailID
    Given Open the homepage
    And Click on My Account Menu
    And  Enter  in Email-Address textbox
    And Enter MBBank^^123 in password textbox
    And Click on Register button
    Then Registration must fail with a warning messageError: Please provide a valid email address.
  Scenario: 4.Registration  with empty Password
    Given Open the homepage
    And Click on My Account Menu
    And  Enter ngocNguyen213@mbbank.com.vn in Email-Address textbox
    And Enter  in password textbox
    And Click on Register button
    Then Registration must fail with a warning messageError: Please enter an account password.
  Scenario: 5.Registration  with empty email and Password
    Given Open the homepage
    And Click on My Account Menu
    And  Enter  in Email-Address textbox
    And Enter  in password textbox
    And Click on Register button
    Then Registration must fail with a warning messageError: Please provide a valid email address.
