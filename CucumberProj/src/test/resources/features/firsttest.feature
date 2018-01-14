@abc
Feature: This is my first feature file

  @tag1
  Scenario: My first scenario
    Given I am in the website
    When I click on some button
    And I enter a "computer" in a box and "laptop" as well
    And I click on submit
    Then I should get another text

  @tag2 @mobile
  Scenario: My second scenario
    Given I am in the website
    When I click on some button
    And I enter a text in a box
    Then I should get another text
    And page should be navigated
    And I am in the website
    When I enter a integral data as 345
    And I enter a decimal data as 45.67
    And I enter a decimal data as string "45.67"
    And the following data should be received
      | Name   | Roll No | Class |
      | Raju   |      45 |     7 |
      | Sai    |      56 |    10 |
      | Suresh |      42 |     9 |

  @mouse @mobile
  Scenario Outline: This is my third scenario outline
    Given I am in the website
    When I click on some button
    And I enter a text in a box
    And I enter comodity as "<Comodity>" with count <No of Items>
    And color as "<Color>" and price as <Price>
    And the following data should be received
      | Name   | Roll No | Class |
      | Raju   |      45 |     7 |
      | Sai    |      56 |    10 |
      | Suresh |      42 |     9 |

    Examples: 
      | Comodity | No of Items | Color  | Price |
      | Thread   |           5 | Blue   |    20 |
      | Bedsheet |           6 | Maroon |   430 |
      | Table    |           2 | Yellow |   560 |
