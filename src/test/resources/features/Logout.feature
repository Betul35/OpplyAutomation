@wip
Feature: User should be able to logout

  Background: user is on the login page
    Given user is logged in


    Scenario: User is logged out and ends up in login page
      When user clicks logout button
      Then user sees the login page



