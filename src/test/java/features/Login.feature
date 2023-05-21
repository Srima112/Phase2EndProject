Feature: This feature will be used to test the login functionality of swaglab application

  
  Background: 
    Given I have launched the swag labs Application

  @sanity
  Scenario: Login success scenario using parameters
    When I enter username as "standard_user"
    And I enter password as "secret_sauce"
    And I click on Login button
    Then I should land on product page

  @regression
  Scenario Outline: Login Failure scenario using Scenario outline
    When I enter username as "<UserName>"
    And I enter password as "<Password>"
    And I click on Login button
    Then I should get the error message as "<Error>"

    Examples: 
      | UserName        | Password     | Error                                                                     |
      | standard_user   | xyz@12345    | Epic sadface: Username and password do not match any user in this service |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out.                       |