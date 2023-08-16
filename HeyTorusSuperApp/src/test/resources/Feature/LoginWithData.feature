Feature: HeyTorus Login

  @Login
  Scenario Outline: Successful Login with valid Mobile Number
    Given User Launch Chrome browser
    When User opens URL "https://proto.heytorus.com"
    Then Page should contain Torus Image
    When User Click on SignUp Using Mobile
    And User enters Mobile as "<SheetName>" and <RowNumber>
    And Click on Continue button
    And Click on Skip button
    And User enter Otp as "<SheetName>" and <RowNumber>
    And User clicks on ContinueOTP
    
    #And User enters MPIN1 "<MPIN1>"
    #And User ReEnter MPIN2 "<MPIN2>"
    #Then User clicks on Submit
    And User enters MPIN "<SheetName>" and <RowNumber>
    Then User clicks on FSubmit
    #When User enters First Name "<SheetName>" and <RowNumber>
    #And User enters Middle Name "<SheetName>" and <RowNumber>
    #And User enters Last Name "<SheetName>" and <RowNumber>
    #And User enters E-mail "<SheetName>" and <RowNumber>
    #Then User clicks on Continue
    #And User enters MPIN "<SheetName>" and <RowNumber>

    Examples:
    |SheetName		|RowNumber	|
    |LoginJourney	|0			|
 