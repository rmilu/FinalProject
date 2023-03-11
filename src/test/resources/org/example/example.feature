Feature: An example

  Scenario: The example
    Given I am on the main page
    When I write the email address of "test@tester.com"
    And I click the submit button
    Then The confirmation pop-up appears

  Scenario: Negative #1
    Given I am on the main page
    When I write the email address of "test@tester.ro"
    And I click the submit button
    Then The confirmation pop-up appears

  Scenario: Negative #2
    Given I am on the main page
    When I write the email address of "testsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestssss"
    And I click the submit button
    Then The confirmation pop-up appears

  Scenario: Positive #3
    Given I am on the main page
    When Click "Read more" on Virtual
    Then New page opens with Virtual header

  Scenario: Positive #4
    Given I am on the main page
    When Click "Read more" on Learn to Fundamentals
    Then New page opens with Fundamentals header appears

  Scenario: Positive #5
    Given I am on the main page
    When Click "Questions" on the header
    Given It goes to Frequently Asked Questions

  Scenario: Positive #6
    Given I am on the main page
    When I write the email address of "testsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestsssstestssss"
    And I click the submit button
    Then The field is coloured red

  Scenario: Negative #7
    Given I am on the main page
    When Click "Read more" on Learn Selenium tab
    Then New page opens with Selenium header

  Scenario: Positive #8
    Given I am on the main page
    When  Click facebook icon at John Doe profile
    Then  Facebook its opening

  Scenario: Positive #9
    Given I am on the main page
    When Click "Start the Enrollment" button
    Then Enrollment page opens

  Scenario: Positive #10
    Given I am on the main page
    When Go in the end of the page
    And Click on the "up" icon
    Then I am sent at the beginning of the page