@scrs
Feature: User performs a single sitting registration

  Scenario: User sees if they are eligible for company registration
    Given The user wants to set up a new limited company
    When The user chooses to start a new application
    Then The user chooses to continue after seeing the information on the Check Before You Start page
    When The user is navigated to the card or PayPal page selects yes and continues
    Then The user is directed to the Companies House Secure Register Form page and confirms they don't have any directors or 'persons with significant control' on the Secure Register
    When The user is notified that they have to create a Government Gateway user ID to set up their company
    Then The user is directed to theRegistrationEmail Government Gateway page to create their user ID


  Scenario: The user returns to their application and registers their company
    Given The user wants to set up a new limited company
    When The user logs in
    Then The user chooses to continue with application
    When The user chooses a pre-populated email address
    Then The user selects Company Director as their relationship to the company
    When The user returns from Company's House after entering the company's name
    Then The user selects their company's principal place of business address
    When The user accepts the pre-populated defaults and is navigated to the Replacing Another Business Page
    Then The user confirms their company is not taking over another business
    When The user is asked about when their company will start trading
    Then The user confirms that the company may pay interest on a non-bank loan, make royalty payments or receive interest
    When The user returns from Company's House and has entered a Corporate Shareholder
    Then The user says the new company will be in the same group for group relief
    When The user selects the name of the pre-popped Corporate Shareholder
    Then The user selects the pre-formatted address for the Owning Company
    When The user enters the Owning Company's UTR
    Then The user returns from Companies House after entering their Persons of Significant Control
    When The user checks the information they have entered on the HMRC summary page and confirms it is correct
    Then The user checks the information they have entered on the Companies House summary page
    When The user has viewed their payment information and accepted it
    Then The user is presented with an acknowledgement that their application has been successfully submitted
    And The user sees an overview of their application details on the SCRS Dashboard and chooses to register for PAYE


  Scenario: The user has passed the PAYE eligibility questions and now wants to register for PAYE
    Given The user has passed the PAYE eligibility questions
    When The user is on the page that asks if the company will pay anyone over the minimum PAYE thresholds and answers no
    Then The user is asked if the company is in the Construction Industry and answers yes
    When The user is asked if any sub-contractors will be hired in the current tax year and answers yes
    Then The user is asked what is their relationship to the company and selects director
    When The user is asked if the company will trade under a different name and changes the trading name to Different Ltd
    Then The user is asked to confirm the company's registered office address
    When The user is asked where the company's principle place of business is
    Then The user is asked for the company's contact details and accepts the pre-popped values
    When The user is asked to provide a description of what the company does
    Then The user is asked to provide the NINO of at least one director
    When The user enters their name but leaves everything else as pre-popped when providing contact details
    Then The user chooses for the post to be sent to the Register Office address
    When The user is asked to review all the answers they have entered and confirms all is correct
    Then The user is successful and finishes the PAYE registration process and return back to the SCRS dashboard

