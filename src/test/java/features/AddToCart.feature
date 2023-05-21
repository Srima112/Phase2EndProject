Feature: This feature will be used to test the login functionality of swaglab application

  Background:
    Given I have launched the swag labs Application
    When I enter username as "standard_user"
    And I enter password as "secret_sauce"
    And I click on Login button
    Then I should land on product page
    

  Scenario: Add the product to the cart
    When i click on the product name as "Sauce Labs Backpack"
    And I click on the add to cart Button
    And I click on shopping cart link
    Then I verify the item on cart page