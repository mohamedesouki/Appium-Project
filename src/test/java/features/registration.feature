Feature: smoke


  Scenario: user register successfully
    Given user opens app
    When user deny permission and navigate from splash
    And user navigates to registration screen
    And user creates new account

    Scenario: user login successfully
      Given user opens app
      When user deny permission and navigate from splash
      And user enters valid credentials
      And user login successfully

      Scenario: user search and select from result
        Given user opens app
        When user deny permission and navigate from splash
        And user click search bar and search for donate

        Scenario: user logout
          Given user opens app
          When user deny permission and navigate from splash
          And user navigate settings screen
          And user click logout


