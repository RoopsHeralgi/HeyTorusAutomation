Feature: Listing of Products on Dashboard of Hey Torus

  @dashboardListing
  Scenario Outline: To check all Product list on Dashboard of Hey Torus
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
    And User enters MPIN1 "<MPIN1>"
    And User ReEnter MPIN2 "<MPIN2>"
    Then User clicks on Submit
    And User enters MPIN "<MPIN>"
    Then User clicks on FSubmit


    When User is on Hey torus Landing page
    Then check for Money Makers
    Then check for Money Saver
    Then check for Footer Icon Wealth
    Then check for Footer Icon Health
    Then Check for Footer Icon Career
    Then check for Footer Icon Lifestyle
    When User clicks on Explore of Stock
    Then User should redirect to Stock Landing page
    #When User clicks on Explore of Mutual Fund
    #Then User should redirect to Mutual Fund Landing page
    When User clicks on Explore of Gold/Silver
    Then User should redirect to Gold/Silver Landing page
    When User clicks on Health Icon of Footer
    Then User should redirect to Landing page of Health Icon
    When User clicks on Career Icon of Footer
    Then User should redirect to Landing page of Career Icon
    
    Examples: 
      | MOB        | OTP    | fname   | mname | lname   | email                   | MPIN1 | MPIN2 | MPIN |
      | 9820538889 | 123456 | Roopa   | S     | Heralgi | roops.heralgi@gmail.com |  1234 |  1234 | 1234 |   
    
