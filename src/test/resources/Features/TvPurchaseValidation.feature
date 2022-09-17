#Author: your.email@your.domain.com
Feature: Tv purchase validation

  Background: 
    Given User launches flipkart application
    And User handles login
  @list
  Scenario: Tv purchase validation
    When User search Tv by using Oned list
      |SAMSUNG|SONY|
    And User select the Tv and click add to cart
    And User doing the payment
    Then User receive the confirmation message
@map
  Scenario: Tv purchase validation
    When User search Tv by using Oned map
      | name1 |LG|
      | name2 |SONY|
    And User select the Tv and click add to cart
    And User doing the payment
    Then User receive the confirmation message
