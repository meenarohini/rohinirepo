@registration
Feature: This is for registration of the automation practice

  @registration
  Scenario Outline: This is registration scenario
    Given user open automation practice website
    When user navigates to login page
    When user enters an email address as "abas.w@gmail.com" and clicks on create account button
    Then user is navigated to registration page
		When user enters title as "mr"
		And user enters first name as "Tom"
		And user enters last name as "Grady"
		And user enters mobile phone as "9876556789"
    Examples: 
      | name  | value | status  |
      #| name1 |     5 | success |
      | name2 |     7 | Fail    |
