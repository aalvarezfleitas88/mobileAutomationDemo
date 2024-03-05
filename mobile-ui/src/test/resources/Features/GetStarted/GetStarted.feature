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