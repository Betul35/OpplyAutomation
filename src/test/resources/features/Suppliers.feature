
Feature: Supplier functionality

  # EXPLAIN API SWAGGER MANUAL TESTING >ISSUE :TIME LIMIT
  Scenario: User is able to see available suppliers
    Given user is logged in
    Then user is able to see listed suppliers


#Also did API POSTMAN automation testing on this scenario
Scenario: User is able to see details of a specific supplier
  Given user is logged in
  When user clicks on a supplier
  Then user can see details of supplier


