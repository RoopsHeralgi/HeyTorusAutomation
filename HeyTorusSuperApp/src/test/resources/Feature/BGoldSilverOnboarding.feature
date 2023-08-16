Feature: Gold Silver Onboarding Process

@GoldSilverOnboarding
Scenario Outline: To check GoldSilver Onboarding Process

Given User Launch Chrome browser
    When User opens URL "https://proto.heytorus.com"
    Then Page should contain Torus Image
    When User Click on SignUp Using Mobile
    And User enters Mobile as "<MOB>"
    And Click on Continue button
    And Click on Skip button
    And User enter Otp as "<OTP>"
    And User clicks on ContinueOTP
    When User enters First Name "<fname>"
    And User enters Middle Name "<mname>"
    And User enters Last Name "<lname>"
    And User enters E-mail "<email>"
    Then User clicks on Continue
    #And User enters MPIN1 "<MPIN1>"
    #And User ReEnter MPIN2 "<MPIN2>"
    #Then User clicks on Submit
    And User enters MPIN "<MPIN>"
    Then User clicks on FSubmit
    
    
    When User clicks on GoldSiver card
    Then User should redirect to GoldSilver Landing page
    
    Examples: 
      | MOB        | OTP    | fname   | mname | lname   | email                   | MPIN1 | MPIN2 | MPIN |
      | 9820538889 | 123456 | Roopa   | S     | Heralgi | roops.heralgi@gmail.com |  1234 |  1234 | 1234 |
      
    #Given User is on SuperApp Landing page Wealth
    #When User clicks on GoldSiver card
    #Then User should redirect to GoldSilver Landing page   