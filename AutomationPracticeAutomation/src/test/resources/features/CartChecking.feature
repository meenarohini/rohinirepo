
@cartcheck
Feature: This feature is to check for addition of cart

  @cartAddition
  Scenario: Adding item to cart
   Given user open automation practice website
   And user finds out the no of items added to cart
    When user mouse hovers to "Women" menu
    And user clicks on "Evening Dresses"
    Then user should be navigated to Evening Dresses page
    When user adds the first item to cart
    Then user should get a message as "Product successfully added to your shopping cart"
    When user closes the modal box
    Then an item should be added to cart
