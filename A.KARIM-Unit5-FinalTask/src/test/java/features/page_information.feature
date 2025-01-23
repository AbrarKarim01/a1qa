Feature: Page Information
  I am user
  I want to see the page information
  To know what the page is about

    Scenario: Page Information
      Then Main Page is open
      When I search for "Albert Einstein" on the Main Page
      And I click on the submit button
      And I click on Tool menu and Page Information button on the Article Page
      Then Information page for "Albert Einstein" article is displayed
