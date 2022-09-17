#Author: your.vinith@your.domain.com
@mobile
Feature: Mobile purchase validation

  Background: 
    Given User launches flipkart application
    And User handles login

  Scenario: Mobile purchase validation
    When User search mobile
    And User select the mobile and click add to cart
    And User doing the payment
    Then User receive the confirmation message

    @list
  Scenario: Mobile purchase validation
    When User search mobile by using Oned list
    |SAMSUNG| iPhone|
    And User select the mobile and click add to cart
    And User doing the payment
    Then User receive the confirmation message
    
    
   @map 
  Scenario: Mobile purchase validation
    When User search mobile by using Oned map
    | name1 | iPhone |
    | name2 | SONY |
    And User select the mobile and click add to cart
    And User doing the payment
    Then User receive the confirmation message