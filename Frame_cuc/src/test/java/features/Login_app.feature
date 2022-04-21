Feature: Login page of the application

  @logintest
  Scenario: Loggin into account via account tab
    Given the Username
    And the Password
    When the login button is clicked
    And username is verfied
