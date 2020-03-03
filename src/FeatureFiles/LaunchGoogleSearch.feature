Feature: Google search

  Scenario Outline: Google search
    Given User open the browser
    When User open Google website
    Then User verify text <Text> of search button

    Examples: 
      | Text          |
      | Google Search |
