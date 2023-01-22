

Feature: Verify the amazon website funtinalities

  @tag1
  Scenario: scenario one
    Given I open amazon web site
    Then  I verify amazon logo is displayed
    When I select the category as "BookCategory"
    And  I serach in serach bar as "Automation"
    And  I scroll the page
    And  I click on four stars and up
    And  I select language as "Language"
    And  I get the name of second item
    And  I click on second item
    And  I verify header as "SecondItemTitle"
    And  I verify price of product as "productPrice"
    And  I scrool the page
    And  I set quantity as "Quantiry"
    And  I click on add to cart
    And  I click on go to cart
    And  I verify product name as "CartProductTitle"
    And  I verify the quantity as "Quantiry"
    And  I verify the price as "productPrice"
    And  I verify the cart
    And  I verify price is zero as "emptyCart"


 