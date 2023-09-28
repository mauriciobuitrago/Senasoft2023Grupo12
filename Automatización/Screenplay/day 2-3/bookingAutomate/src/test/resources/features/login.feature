@tag
Feature: Login on Booking.com

  As a Web User
  I want to login into booking.com web page
  To see the logged user homepage

  @login
  Scenario: Login on Booking.com
    Given that user wants to sign in on Booking.com
    When user clicks on Login button
    And he enters the username and password
      | username                  | password   |
      | christopherpaez@gmail.com | Dino123456 |
    Then user should see the captcha message