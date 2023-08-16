Feature: Stocks Onboarding Process

  @StocksOnboarding
  Scenario Outline: To Check Stocks Onboarding Functionality
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
#    And User enters MPIN1 "<MPIN1>"
#    And User ReEnter MPIN2 "<MPIN2>"
#   Then User clicks on Submit
    And User enters MPIN "<MPIN>"
   #Then User clicks on FSubmit
    
    When User clicks on Stocks Card
    Then User should redirect to Stocks Landing page
    When User clicks on KYC Pending
    
#PAN PAGE    
    Then User should redirect to PAN entry page
    Then User Enters PAN Number "<PAN>"
    When User clicks on ContinueButton
    
#DOB PAGE    
 #   Then User should redirect to DateEntry page
    When User click on Calendar Icon
    Then User select DOB
    Then User click on ContinueOfDOB
    
#PAN VERIFY PAGE    
    Then Verify PAN Number
    Then Verify PANKYC verification
    When User Clicks on ConfirmContinue
    
#PERSONAL DETAILS PAGE    
    Then User redirected to DeatilsEntry Page
    #When User Selects Father 
    #Then User Selects FatherSalutation
    #And User Enter Fathers Firstname "<FFname>"
    #And User Enter Fathers Middlename "<FMname>"
    #And User Enters Fathers Lastname  "<FLname>"
    When User Selects Spouse 
    Then User Selects SpouseSalutation
    And User Enter Spouse Firstname "<SFname>"
    And User Enter Spouse Middlename "<SMname>"
    And User Enters Spouse Lastname  "<SLname>"
    And User Enter Mothers Firstname "<MFname>"
    And User Enter Mothers Middlename "<MMname>"
    And User Enters Mothers Lastname  "<MLname>"
    Then User Selects Occupation
    And User Enters Address Line1 "<Addr1>"
    And User Enters Address Line2 "<Addr2>"
    And User Enters Pincode "<PIN>"
    #Then User Enters City 
    #Then User Enters State
    #Then User Enters Country
    And User clicks on ContinueOfDetailEntry page
    
#BANK DETAILS
#		 Then User should redirect to Add bank details page
		 And User enters Bank Account Number "<BankACNo>"
		 And User enters IFSC code "<IFSCcode>"
		 When User clicks on Confirm&Continue Button of Bank
		 Then User redirect to Bank Confirm page
		 And User clicks on ContinueOfBankConfirm
    
#EXCHANGE SELECTION PAGE    
    Then User Selects DerivativesRadioButton
    And User Clicks on ContinueOfExchangeSelection
    
#FATCA PAGE
		Then User enters Pincode for FATCA "<FATCApin>"
		Then User selects Country of Birth "<BirthCountry>"
		Then User selects City of Birth "<BirthCity>"
		Then User selects Nationality "<Nationality>" 
		Then User selects Source of Wealth "<SourceWealth>"
		Then User chooses TaxResidency Other than India RadioButon "<TaxResidency>"
		Then User chooses Politically Exposed Person RadioButton "<PEP>"
		Then User chooses Relation with PEP RadioButton "<RelPEP>"
#		Then User clicks on Declaration of FATCA
		And User clicks on SaveButton

#INCOME PROOF
		Then User chooses Gender RadioButton "<GENDER>"
		Then User chooses Marital Status "<MStatus>"
		Then User chooses Income Group "<Income>"
		And User clicks on Continue of Income		   
    
#NOMINEE    
    #When User Clicks on NoNominee Checkbox
    #Then User clicks on SubmitOfNoNominee
    
#ADD NOMINEE PAGE 
    And User Enters Nominee1 FullName "<Nominee1Name>"
    Then Selects Gender RadioButton "<Gender>"
    Then Selects Relationship With Nominee "<Relationship>"
    Then User enters Nominee DOB 
    Then User enters Percentage Allocation "<Percentage1>"
    Then User enters NomineePAN/AadharNo "<NomineePANAadhar1>"
#NOMINEE IS MINOR
		Then User enters Guardidan Name "<GuardianName1>"
		Then Selects Relationship With ChildNominee "<RelationshipGuardian>"  
		Then User enters Guardian PAN/AadharNo "<GuardianPANAadhar>"

#GUARDIAN ADDRESS DETAILS
		  Then User enters GuardianAddress "<GAddr>"
		  Then User enters PINcode "<PinCode>"
		  Then User enters City "<GCity>"
		  Then User enters State "<Gstate>" 
		  Then User enters Country "<GCountry>"
		  And User clicks on Save&Add New Nominee 
		  And User clicks on SubmitOfNominee
		  
#SELFIE VARIFICATION
			Then User is redirected to Sefie varification page
			And clicks on Take Picture 
#			Then User allow permission for camera
#			And User clicks on Take SnapshotButton
#			And User clicks on SkipOfSnapshot
			And User clicks on UseCamera 

    Examples: 
      | MOB        | OTP    | fname | mname | lname   | email                   | MPIN1 | MPIN2 | MPIN |PAN					|SFname		|SMname		|SLname		|MFname		|MMname		|MLname			|Addr1				|Addr2				|PIN		|BankACNo				|IFSCcode		|FATCApin	|BirthCountry		|BirthCity	|Nationality	|SourceWealth		|TaxResidency|PEP	|RelPEP	|GENDER	|MStatus	|Income	|Nominee1Name	|Gender|Relationship|Percentage1|NomineePANAadhar1|GuardianName1|RelationshipGuardian|GuardianPANAadhar|GAddr							|PinCode|GCity								 |Gstate			|GCountry|
      | 9820538889 | 111111 | Roopa | S     | Heralgi | roops.heralgi@gmail.com |  1234 |  1234 | 1234 |AJYPH1189C	|	Shailesh|Shankar	|Heralgi	|Kamala		|Shankar	|Dhanashetti|14/2 Jay Apt	|Vishnu Nagar	|421202	|987653423142435|HDFC0000060|421202		|India					|Mumbai			|India				|Rental Income	|NO					 |No	|No			|Male	|Married	|10-25L	|Akshara			  |Male	|Child				|100				|211234567895			|Shailesh			|Father							 |987456321589		 |JayApt VishnuNagar|421202	|Mumbai   Sakinaka S.O |MAHARASHTRA	|India	 |
