Feature: Get Started

  @SMOKE
  Scenario Outline: Validate 'Enter the 6 digit code' screen

    Given User clicks on 'Get started' button
    And 'Enter your phone number' screen is displayed
    * Select "<country>" in the list of numerical characteristics
    * Enter a valid cell phone number for the selected country "<cellPhoneNumber>"
    When User click on the 'Continue' button
    Then 'Enter the 6 digit code' screen is displayed

  Examples:
  | country | cellPhoneNumber |
  | Uruguay | 99100016        |

  #################################################################################

  @SMOKE
  Scenario: Validate 'Privacy Notice' redirect page

    Given User clicks on 'Get started' button
    And 'Enter your phone number' screen is displayed
    * 'Privacy Notice' link is displayed
    When User click on the 'Privacy Notice' link
    Then 'Privacy Notice' screen is displayed

  #################################################################################

  @SMOKE
  Scenario: Validate 'Terms of Service' redirect page

    Given User clicks on 'Get started' button
    And 'Enter your phone number' screen is displayed
    * 'Terms of Service' link is displayed
    When User click on the 'Terms of Service' link
    Then 'Terms of Service' screen is displayed

  #################################################################################

  @SMOKE
  Scenario Outline: Validate 'Back' functionality from 'Enter the 6 digit code' screen

    Given User clicks on 'Get started' button
    And 'Enter your phone number' screen is displayed
    * Select "<country>" in the list of numerical characteristics
    * Enter a valid cell phone number for the selected country "<cellPhoneNumber>"
    * User click on the 'Continue' button
    * 'Enter the 6 digit code' screen is displayed
    When User performs a 'Back' from the application
    Then 'Enter your phone number' screen is displayed

    Examples:
      | country | cellPhoneNumber |
      | Uruguay | 99000000        |

  #################################################################################