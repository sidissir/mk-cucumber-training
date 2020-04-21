Feature: This feature is to test search functionlaity on e-comerce site
  As a customer, i should be able to search for a prodcut and add it to the cart

  Scenario: Search from search box without selecting a ctegory
    Given I have opened a browser
    And I navigate to home page
    When I enter "shoes" in search box
    And I click search button
    Then All shoe products should be displayed

  Scenario: Search from search box  with selecting category
    Given I have opened a browser
    And I navigate to home page
    And I select "Shoes and Bags" category
    When I enter "Sports Shoes" in search box
    And I want size 10 shoes
    And I click search button
    Then All shoe products should be displayed
