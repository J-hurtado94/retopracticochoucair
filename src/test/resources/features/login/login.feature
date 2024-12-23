Feature: Login


  Scenario: Login successful
    Given user is on the login page
    When user use valid credentials
      | user       | password       |
      | <username> | <userpassword> |
    Then should see a "Products" message

