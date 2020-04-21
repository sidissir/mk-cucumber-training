Feature: This feature is to test search functionlaity on e-comerce site
  As a customer, i should be able to search for a prodcut and add it to the cart

  Background: 
    Given I have opened a browser
    And I navigate to home page

  Scenario: Search from search box without selecting a ctegory
    When I enter "shoes" in search box
    And I click search button
    Then All shoe products should be displayed

  Scenario: Search from search box  with selecting category
    And I select "Shoes and Bags" category
    When I enter "shoes" in search box
    And I click search button
    Then All shoe products should be displayed
