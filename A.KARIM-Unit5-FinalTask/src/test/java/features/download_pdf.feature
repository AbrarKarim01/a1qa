Feature: Download PDF
  I am user
  I want to download a file
  To be able to use it offline

    Scenario: Download
      Then Main Page is open
      When I search for "Albert Einstein" on the Main Page
      And I click on the submit button
      And I click on Tool menu and Download as PDF button on the Article Page
      And I click on Download button
      Then I should see the file downloaded
