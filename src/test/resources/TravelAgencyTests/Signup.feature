Feature: Sign up

  Scenario: Sign Up
    Given I am in Sign Up page
    When I enter valid user details in Register section
    And I click on "Sign Up"
    And My Account page is open
    And I click on "My Profile" tab
    Then My profile section is opened
    And Correct personal information is displayed
