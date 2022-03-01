Feature: Organge login Feature

  Scenario Outline: Title of login scenario outline
    Given I want to naviagte hrm application
    When I enter username <username> and <password>
    And I click on login page

    Examples: 
      | username | password |
      | Admin    | admin123 |
