@tag
Feature: Register on Booking.com

  As a Web User
  I want to register into booking.com web page
  To see logged user homepage

  @register
  Scenario: Register on Booking.com
    Given that user wants to create an account on Booking.com
    When user clicks on Hazte una cuenta button
    And  user types his e-mail and creates a password
      | username          | password     |
      | newUser@devco.com | 1111111devcO |
    Then user should see the new user captcha message