Feature: Search Language
  I am user
  I want to change language
  To see the page in my language

  Scenario: Change language
    Then Main Page is open
    When I search for "Albert Einstein" on the Main Page
    And I change the language to "SPANISH"
    And I click on the submit button
    Then Article Page is opened with "Albert Einstein" title
