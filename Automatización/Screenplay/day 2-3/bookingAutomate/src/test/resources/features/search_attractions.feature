@tag
Feature: Search attractions or activities on Booking.com

  As a Web User
  I want to attractions or activities on Booking.com web page
  To have some fun

  @searchAttractions
  Scenario: Search attractions or activities
    Given that user wants to Search attractions or activities
    When user gets on the touristic attractions page
    And searches for attractions on the desired place
      |place   |
      |Chicago |
    And selects the desired category
      |category  |
      |Museos    |
    And selects the first option
    And scroll down to activity details
    Then user should see the name and description of the selected activity