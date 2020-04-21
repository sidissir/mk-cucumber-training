Feature: Requirement is to check whether multiple products can be added to the cart

 # Scenario: To verify more than one product can be added to the cart
 #   Given I am on grocery site
 #   When I add "Tomatoes" of quantity 2 kilo
 #   And I add "Mirchi" of quantity 1 kilo
 #   And I add "Chicken" of quantity 2 kilo
 #   And I checkout
 #   And I complete payment
 #   Then Payment should be successfull

  Scenario: To verify more than one product can be added to the cart
    Given I am on grocery site
    When I add following items of given quantity
      | grocery_item | quantity |
      | tomatoes     |        2 |
      | Mirchi       |        1 |
      | Chicken      |        2 |
      | Mutton       |        2 |
      | Atta         |        2 |
    And I checkout
    And I complete payment
    Then Payment should be successfull
