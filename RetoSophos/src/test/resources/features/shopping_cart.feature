Feature: I as a user of linio
  I want to add a product to the shopping cart
  for place an order

  Scenario: Add a product to the shopping cart and validate that it is added correctly
    Given that Brayan is on the linio website
    When he add a product to the shopping cart
    Then he should see that the product was added successfully