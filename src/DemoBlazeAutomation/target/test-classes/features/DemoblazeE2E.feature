Feature: Demoblaze E2E Purchase Flow

  Scenario: User completes full purchase journey and logs out
    Given User opens the Demoblaze application
    When User registers a new account
    And User logs in with the registered credentials
    And User selects a product and adds it to the cart
    And User proceeds to cart and completes the purchase order
    Then User logs out successfully