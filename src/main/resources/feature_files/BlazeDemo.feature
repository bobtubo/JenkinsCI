@RunallTest
Feature: BlazeDemo purchase flight

#  @Testtorun
  Scenario Outline:  Choosing Departure and destination Cities and finding flights
    Given I am on the Welcome to Simple Travel Agency landing page
    When I choose the "<departureCity>" and "<destinationCity>" from the drop down
    Then I should be able to see "<departureCity>" and "<destinationCity>" on the BlazeDemo reserve page
    Examples:
      | departureCity | destinationCity |
      | Boston        | Rome            |
      | Boston        | London          |
      | Portland      | New York        |
