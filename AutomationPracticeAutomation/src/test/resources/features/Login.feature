@login
Feature: Login Feature

  @login @correct-login
  Scenario: Correct login
    Given user open automation practice website
    When user navigates to login page
    And enter username as "testautomation@auto.com" and password as "Test@2017" and click on login
    Then user should be able to login

  @login @incorrect-login
  Scenario: InCorrect login
    Given user open automation practice website
    When user navigates to login page
    And enter username as "testautomation@auto.com" and password as "Test@2023" and click on login
    Then user should not be able to login

	@login @login-outline
  Scenario Outline: Login Check using Scenario Outline
    Given user open automation practice website
    When user navigates to login page
    And enter username as "<userName>" and password as "<password>" and click on login
    Then user login status should "<status>"

    Examples: 
      | userName                | password   | status |
      | testautomation@auto.com | Test@2017  | Pass   |
      | testautomation@auto.com | Test@20523 | Fail   |
      | tgautomation@auto.com   | Test@223   | Pass   |
