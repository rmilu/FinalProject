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
    Then It goes to Frequently Asked Questions

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

  Scenario: Positive #11
    Given I am on the main page
    When Click on "What You'll Learn"
    Then I am sent to Learn the Fundamentals

  Scenario: Negative #12
    Given I am on the enrollment page
    When I write the First Name of "asda"
    And I write the Last Name of "bla"
    And I write username of "werueroq"
    And I write password of "qwqedsa"
    And I write confirm password of "ewrw"
    And Click on next button
    Then Because wrong credentials were inserted, I will remain on Personal Information page.

  Scenario: Positive #13
    Given I am on the enrollment page
    When I write the First Name of "Johnny"
    And I write the Last Name of "Bravo"
    And I write username of "jbravo"
    And I write password of "JohnBonJovi"
    And I write confirm password of "JohnBonJovi"
    And Click on next button
    Then Contact Information page is opening

    Scenario: Positive #14
      Given I am on the main page
      When  Click twitter icon at Jane Doe profile
      Then  Twitter its opening

  Scenario: Positive #15
    Given I am on the main page
    When  Click linkedin icon at Steve Smith profile
    Then  Linkedin its opening

  Scenario: Positive #16
    Given I am on the main page
    When  Click instagram icon at Sara Smith profile
    Then  Instagram its opening

  Scenario: Positive #17
    Given I am on the main page
    When Click "Instructors" on the header
    Then It goes to Our Instructors

  Scenario: Positive #18
    Given I am on the main page
    When Click "Questions" on the header
    And It goes to Frequently Asked Questions
    And Click on first question
    And Click on second question
    And Click on third question
    And Click on forth question
    And Click on fifth question
    Then Each of the questions colapse and reveal the answer

  Scenario: Positive #18
    Given I am on the main page
    When Click "Read more" on Hybrid
    Then New page opens with Hybrid header

  Scenario: Positive #19
    Given I am on the main page
    When Click "Read more" on In Person
    Then New page opens with In Person header

  Scenario: Negative #20
    Given I am on the enrollment page
    When I write the First Name of "Johnny"
    And I write the Last Name of "Bravo"
    And I write username of "jbravo"
    And I write password of "JohnBonJovi"
    And I write confirm password of "JohnBonJovi"
    And Click on next button
    And I write the Email of "jbravo@gmail.com"
    And I write the Phone of "0040894829028"
    And I write the Country of "Romania"
    And I write the City of "Brasov"
    And I write the Post Code of "500152"
    And Click on next button bellow
    And I Click on next button
    And I write the Card holder name "Johnny Bravo"
    And I write the Card number "4123-2020-2020-1292"
    And I write the CVC "737"
    And I click on the next button
    Then A new page opens with information that the registration was successful