Feature: Crm login feature
#  Scenario: CRM login test scenario
#    Given user is in login page
#    When title of the page is crm login page
#    Then user enter's "abc" and "****"
#    Then user clicks login button
#    Then users enter home page
#    Then users logout

#  #witrh Examples keyword _ Scenario Outline:
#  Scenario Outline: CRM login test scenario
#    Given user is in login page
#    When title of the page is crm login page
#    Then user enter's "<username>" and "<password>"
#    Then user clicks login button
#    Then "<userid>" enter home page
#    Then users logout
#
#    Examples:
#    | username | password | userid |
#    | abc | **** | 1235   |
#    |xyz    | **** | 4567|


    #witrh Table _ Scenario :
  Scenario: CRM login test scenario
    Given user is in login page
    When title of the page is crm login page
    Then user enter username and password
      |username| password|
      | abc | **** |
      |xyz    | **** |
    Then user clicks login button
    Then  user is in home page
      |userId|
      |  1235   |
      | 4567|
    Then users logout
