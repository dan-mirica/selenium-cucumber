Feature: Test login to Facebook

  @tag1
  Scenario Outline: Test login successfull
    Given Open firefox and start application
    When I enter valid "<username>" and valid "<password>"
    Then user should be able to login successfully
    Then application should close

    Examples: 
      | username         | password  |
      | dan111@gmail | password1 |
      | dan222@gmail | password2 |
