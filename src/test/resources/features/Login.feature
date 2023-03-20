@wip
Feature: Users should be able to login with valid input

  Background: user is on the login page
    Given user is on the login page

  Scenario Template: User logs in with the valid credentials
    When user enters the username "<username>" on login page
    And user enters password "<password>" on login page
    And user clicks login button
    Then user is on the dashboard

    Examples: Valid credentials
      |username            |password|
      |opplypiyade@test.com|Opplypiyade1|
      |haciyatmaz@gmail.com|Haciyatmaz123.|

  Scenario Template: User is not able to log in with invalid credentials
    When user enters the username "<username>" on login page
    And user enters password "<password>" on login page
    And user clicks login button

    Examples: Invalid credentials
      |username|password|
      ||Hadicanim1.|
      |happyholiday@holiday.com||

