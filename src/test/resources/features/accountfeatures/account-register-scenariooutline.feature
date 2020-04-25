@acc @SmokeTest
Feature: To create a new account

  Scenario Outline: To test whether user registration is succesfull
    Given I am on user registration page
    When I enter "<uname>" in user name field
    And I enter "<password>" in password field
    And I enter "<gender>" in gender field
    And I enter <age> in age field
    And I click create account button
    Then Account creation should be successfull

    Examples: 
      | uname    | password  | gender | age |
      | praveena | password1 | female |  33 |
      | Ankitha  | password2 | female |  34 |
      | Siddu    | password3 | male   |  32 |
      | Ramya    | password4 | female |  33 |
