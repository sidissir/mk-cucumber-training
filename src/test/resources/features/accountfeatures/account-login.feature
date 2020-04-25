@acc @Login
Feature: To test login

  Scenario: Search from search box without selecting a ctegory
    Given I am on home page
    When click on login link
    And I enter valid username in username field
    And I enter valid password in password field
    And I click login button
    Then I should be taken to my home page
    And I should see a logout link
    And I should see My Account link
    But I should not see Login link
