Feature: Crm login feature
#  Scenario: CRM login test scenario
#    Given user is in login page
#    When title of the page is crm login page
#    Then user enter's "anju.shah.12" and "Il0ve@nju"
#    Then user clicks login button
#    Then users enter home page
#    Then users logout

  #witrh Examples keyword _ Scenario Outline:
  Scenario Outline: CRM login test scenario
    Given user is in login page
    When title of the page is crm login page
    Then user enter's "<username>" and "<password>"
    Then user clicks login button
    Then "<userid>" enter home page
    Then users logout

    Examples:
    | username | password | userid |
    | anju.shah.12 | Il0ve@nju | Anzu Sa    |
    | rakushah     | Il0ve@nju | Raj Kumar Shah |
