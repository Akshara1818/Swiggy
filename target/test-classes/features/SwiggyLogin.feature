Feature: Login into swiggy website

  @Sanity
  Scenario Outline: Positive scenario to test Login functinonality
    Given User has opened swiggy website on Chrome Browser
    When User enters correct "<phoneno>"
    Then User should be able to Login successfully

    Examples: 
      | phoneno |
      | 9000000000 |
