Feature: Booking Hotels

  Background: Sign Up
    Given I have account created
    And I am in Home page

  Scenario: Book first listed hotel
    When I set up destination as "Liepaja"
    And I select dates 20-01-20 - 25-01-20
    And I select 2 adults and 1 children
    And I click on "Search"
    And I click on "Details" for first hotel in the list
    And Details page is open for selected hotel
    And I click on "Book Now" for first available room
    Then Checkout page is displayed
    And I enter valid booking information
    And I click on "Complete Booking"
    And Purchase hotel booking page is displayed

  Scenario: Book cheapest hotel in city
    When I set up destination as "Riga"
    And I select dates 20-01-20 - 25-01-20
    And I select 2 adults and 0 children
    And I click on "Search"
    And I click on Details for the cheapest hotel in the list with a rating above 3 stars
    And Details page is open for selected hotel
    And I click on "Book Now" for first available room
    Then Checkout page is displayed
    And I enter valid booking information
    And I click on "Complete Booking"
    And Purchase hotel booking page is displayed
