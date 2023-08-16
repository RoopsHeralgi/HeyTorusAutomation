Feature: CareerTech Testing

  #@Login
  #Scenario Outline: To check all Product list on Dashboard of Hey Torus
    #Given User Launch Chrome browser
    #When User opens URL "https://proto.heytorus.com"
    #Then Page should contain Torus Image
    #When User Click on SignUp Using Mobile
    #And User enters Mobile as "<MOB>"
    #And Click on Continue button
    #And Click on Skip button
    #And User enter Otp as "<OTP>"
    #And User clicks on ContinueOTP
    #When User enters First Name "<fname>"
    #And User enters Middle Name "<mname>"
    #And User enters Last Name "<lname>"
    #And User enters E-mail "<email>"
    #Then User clicks on Continue
    #    And User enters MPIN1 "<MPIN1>"
    #    And User ReEnter MPIN2 "<MPIN2>"
    #    Then User clicks on Submit
    #And User enters MPIN "<MPIN>"
    #Then User clicks on FSubmit

    #Examples: 
      #| MOB        | OTP    | fname | mname | lname   | email                   | MPIN1 | MPIN2 | MPIN |
      #| 9820538889 | 123456 | Roopa | S     | Heralgi | roops.heralgi@gmail.com |  1234 |  1234 | 1234 |

  @Career
  Scenario: To check CareerTech Functionality
    Given User is on SuperApp Landing page
    When user clicks on CareerTab on Footer
    #Then Education Wellness page should open
    When click on Courses
    #Then PortFolio Summary should be visible
    #Then Saved Courses should be visible
    #Then Featured Courses should be visible
   
#COURSES       
    And click on Explore tab Footer
    #Then Explore page should be visible
    
#BUY    
    When click on course card
    #Then redirect to Buy page
    When click on Buy
    #Then redirect to OrderBook page
    When User clicks on Add to Cart
    #Then User should redirect to My Cart Page
    When User clicks on Proceed to Checkout
    When User clicks on Place Order
    #Then User should redirect to Checkout page
    When User clicks on Proceed to payment
    #Then User should proceed to PaymentGateway Page
    And User clicks on PayNow
    
    #And User clicks on close button
    #And User clicks on yes button
 
 #PORTFOLIO
 
 	And User click on Learn Footer tab
 	Then Learn page should be visible
 	Then count the Number of Courses Enrolled
 	 
    
