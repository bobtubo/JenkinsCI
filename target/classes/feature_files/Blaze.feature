Feature: Purchase flight
#@Test
  Scenario Outline: Choosing departure and destination cities and finding flights
    Given I am on the Blaze demo landing page
    When I choose "<departure>" and "<destination>" from the dropdown list
    Then I should be able to see "<departure>" and "<destination>" on the Blaze demo reserve page
    Examples:
      | departure | destination  |
#      | Boston    | Rome         |
#      | Paris     | Buenos Aires |
      | San Diego | New York     |