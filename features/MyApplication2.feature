Feature: Test login to Facebook2

  Background: 
    Given Open firefox and start application

  @tag1
  Scenario Outline: Test login successfull2
    When I enter valid "<username>" and valid "<password>"
    Then user should be able to login successfully
    Then application should close

    Examples: 
      | username       | password  |
      | dan1@gmail | password1 |
      | dan2@gmail | password2 |
