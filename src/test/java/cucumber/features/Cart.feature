Feature: Manage Cart
  As a user, I want to manage my cart so that I am buying the right things

  Scenario: Increase Quantity
     Given: product Sauce Labs Backpack is in the cart
     Then its price should be $29.99
     And its total should be 29.99
