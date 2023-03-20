Feature: Users should be able to sign up with valid input

  Background: user is on the login page
    Given user is on the login page
    Then user clicks the sign up here button

@wip
  Scenario Template: User sign up scenario with valid input
    When user enters the username "<username>"
    And user enters the lastname "<lastname>"
    And user enters the email "<email>"
    And user enters password "<password>"
    And user clicks sign up button

    Examples: Valid input for signing #The password should be at least 10 characters long and include one number
    |username|lastname|email|password|
    |Opply   |Piyade  |opplypiyade@test.com|Opplypiyade1|
    |Haci    |Yatmaz  |haciyatmaz@gmail.com|Haciyatmaz123.|


  Scenario Template: User can not sign up with invalid input #there is no assertion criteria, so that we are not able to assert it!
    When user enters the username "<username>"
    And user enters the lastname "<lastname>"
    And user enters the email "<email>"
    And user enters password "<password>"
    And user clicks sign up button

    Examples: Invalid input for signing #The password should be at least 10 characters long and include one number
      |username|lastname|email|password|
      |Busra   |Piyade  |opplypiyade@test.com|Busra|
      |Serap    |Yatmaz  |haciyatmaz|Haciyatmaz1|
      |         |vhfejv  |cd@gmail.com|Qwertyfcw1|
      |Eda      |        |eda@hotmail.com|hfje vbfljsR134|
      |Nur      |hayde   |               |brhiwbvK45     |
      |1234     |vbfjks  |vbfjskv@123.com|               |