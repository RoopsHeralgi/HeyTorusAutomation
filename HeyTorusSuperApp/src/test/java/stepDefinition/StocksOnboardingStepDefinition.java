package stepDefinition;

import java.net.MalformedURLException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StocksOnboardingStepDefinition extends BaseClass {
	
	//StocksOnboarding
		@When("User clicks on Stocks Card")
		public void user_clicks_on_stocks_card() throws InterruptedException {
			StocksOnboarding.StockLandingClick();
			Thread.sleep(2000);
			System.out.println("Clicks on Stocks card");
		}

		@Then("User should redirect to Stocks Landing page")
		public void user_should_redirect_to_stocks_landing_page() throws InterruptedException {
			Thread.sleep(9000);
			StocksOnboarding.StocksTitle();
			System.out.println("User is on Stocks Landing Page");
		    
		}

		@When("User clicks on KYC Pending")
		public void user_clicks_on_kyc_pending() throws InterruptedException {
			StocksOnboarding.KycPendingClick();
		}

		//PAN
		@Then("User should redirect to PAN entry page")
		public void user_should_redirect_to_pan_entry_page() throws InterruptedException {
			StocksOnboarding.PANPage();
			System.out.println("User is on PAN entry page");
			
		}
		@Then("User Enters PAN Number {string}")
		public void user_enters_pan_number(String PAN) throws InterruptedException {
			StocksOnboarding.PANData(PAN);
		}
		@When("User clicks on ContinueButton")
		public void user_clicks_on_continue_button() throws InterruptedException {
			StocksOnboarding.PANContinue();
		}

		@Then("User should redirect to DateEntry page")
		public void user_should_redirect_to_date_entry_page() {
			StocksOnboarding.PANDate();
		}
		@When("User click on Calendar Icon")
		public void user_click_on_calendar_icon() throws InterruptedException {
			Thread.sleep(2000);
			StocksOnboarding.CalendarClick();
			
		}
		@Then("User select DOB")
		public void user_select_dob() throws InterruptedException {
			Thread.sleep(2000);
			StocksOnboarding.CalendarAction();
		}
		@Then("User click on ContinueOfDOB")
		public void user_click_on_continue_of_dob() throws InterruptedException {
			StocksOnboarding.ClickSubmitDOB();
		    
		}
		@Then("Verify PAN Number")
		public void verify_pan_number() throws InterruptedException {
			Thread.sleep(2000);
			StocksOnboarding.VerifyPAN();
		}
		
		@Then("Verify PANKYC verification")
		public void verify_pankyc_verification() throws InterruptedException {
			StocksOnboarding.KYCPANVerify();
		}
		@When("User Clicks on ConfirmContinue")
		public void user_clicks_on_confirm_continue() throws InterruptedException {
			StocksOnboarding.ClickConfirmContinue();
			System.out.println("PAN Entry and Varification Completed");
		}
		
	//CORRESPONDANCE DETAILS OR PERSONAL DETAILS	
		@Then("User redirected to DeatilsEntry Page")
		public void user_redirected_to_deatils_entry_page() throws InterruptedException {
			StocksOnboarding.DetailsEntry(); 
		}

		@When("User Selects Father")
		public void user_selects_father() throws InterruptedException {
			StocksOnboarding.FatherRadioButton(); 
		}

		@Then("User Selects FatherSalutation")
		public void user_selects_father_salutation() throws InterruptedException {
			StocksOnboarding.SelectSalutation();
		}

		@Then("User Enter Fathers Firstname {string}")
		public void user_enter_fathers_firstname(String FFname) throws InterruptedException {
			StocksOnboarding.FathersName(FFname);
		}

		@Then("User Enter Fathers Middlename {string}")
		public void user_enter_fathers_middlename(String FMname) throws InterruptedException {
			StocksOnboarding.FathersMName(FMname);
		}

		@Then("User Enters Fathers Lastname  {string}")
		public void user_enters_fathers_lastname(String FLname) throws InterruptedException {
			StocksOnboarding.FathersLName(FLname);
		}
		@When("User Selects Spouse")
		public void user_selects_spouse() throws InterruptedException {
			StocksOnboarding.SpouseRadioButton();
		}

		@Then("User Selects SpouseSalutation")
		public void user_selects_spouse_salutation() throws InterruptedException {
			StocksOnboarding.SelectSalutation();
		}

		@Then("User Enter Spouse Firstname {string}")
		public void user_enter_spouse_firstname(String SFname) throws InterruptedException {
			StocksOnboarding.SpouseName(SFname);
		}

		@Then("User Enter Spouse Middlename {string}")
		public void user_enter_spouse_middlename(String SMname) throws InterruptedException {
			StocksOnboarding.SpouseMName(SMname);
		}

		@Then("User Enters Spouse Lastname  {string}")
		public void user_enters_spouse_lastname(String SLname) throws InterruptedException {
			StocksOnboarding.SpouseLName(SLname);
		}
		@When("User Enter Mothers Firstname {string}")
		public void user_enter_mothers_firstname(String MFname) throws InterruptedException {
			Thread.sleep(2000);
			StocksOnboarding.MothersName(MFname);
		}

		@When("User Enter Mothers Middlename {string}")
		public void user_enter_mothers_middlename(String MMname) throws InterruptedException {
			Thread.sleep(2000);
			StocksOnboarding.MothersMName(MMname);
		}

		@When("User Enters Mothers Lastname  {string}")
		public void user_enters_mothers_lastname(String MLname) throws InterruptedException {
			Thread.sleep(2000);
			StocksOnboarding.MothersLName(MLname);
		}
		@Then("User Selects Occupation")
		public void user_selects_occupation() throws InterruptedException {
			StocksOnboarding.SelectOccupation();
		}
		@Then("User Enters Address Line1 {string}")
		public void user_enters_address_line1(String Addr1) throws InterruptedException {
			StocksOnboarding.EntryAddr1(Addr1);
		}

		@Then("User Enters Address Line2 {string}")
		public void user_enters_address_line2(String Addr2) throws InterruptedException {
			StocksOnboarding.EntryAddr2(Addr2);
		}

		@Then("User Enters Pincode {string}")
		public void user_enters_pincode(String PIN) throws InterruptedException {
			StocksOnboarding.PinCode(PIN);
		}
		@Then("User Enters City")
		public void user_enters_city() throws InterruptedException {
			StocksOnboarding.SelectCity();
		}

		@Then("User Enters State")
		public void user_enters_state() throws InterruptedException {
			StocksOnboarding.SelectState();
		}

		@Then("User Enters Country")
		public void user_enters_country() throws InterruptedException {
			StocksOnboarding.SelectCountry();
		}
		@Then("User clicks on ContinueOfDetailEntry page")
		public void user_clicks_on_continue_of_detail_entry_page() throws InterruptedException {
			StocksOnboarding.DetailContinueClick();
			System.out.println("Correspondance Details or Personal Details Completed");
		}
		
	//EXCHANGE SELECTION	
		@Then("User Selects DerivativesRadioButton")
		public void user_selects_derivatives_radio_button() throws InterruptedException {
			StocksOnboarding.SelectDerivative();
		}

		@Then("User Clicks on ContinueOfExchangeSelection")
		public void user_clicks_on_continue_of_exchange_selection() throws InterruptedException {
			StocksOnboarding.ExchangeContinueBtn();
			System.out.println("Exchange Selection Completed");
		}
		
	//BANK DETAILS
		@Then("User should redirect to Add bank details page")
		public void user_should_redirect_to_add_bank_details_page() throws InterruptedException {
			StocksOnboarding.AddBankVisibility(); 
		}

		@Then("User enters Bank Account Number {string}")
		public void user_enters_bank_account_number(String ACNumber) throws InterruptedException {
			StocksOnboarding.EnterBankACNo(ACNumber);
		}

		@Then("User enters IFSC code {string}")
		public void user_enters_ifsc_code(String IFSC) throws InterruptedException {
			StocksOnboarding.EnterIFSC(IFSC);
		}

		@When("User clicks on Confirm&Continue Button of Bank")
		public void user_clicks_on_confirm_continue_button_of_bank() throws InterruptedException {
			StocksOnboarding.ClickConfirmBank();
		}
		@Then("User redirect to Bank Confirm page")
		public void user_redirect_to_bank_confirm_page() throws InterruptedException {
			StocksOnboarding.BankConfirmVisibility();
		}

		@Then("User clicks on ContinueOfBankConfirm")
		public void user_clicks_on_continue_of_bank_confirm() throws InterruptedException {
			StocksOnboarding.ClickConfirmBankButton();
			System.out.println("Bank Details Completed");
		}

	//FATCA
		@Then("User enters Pincode for FATCA {string}")
		public void user_enters_pincode_for_fatca(String Fpin) throws InterruptedException {
			StocksOnboarding.FatcaPin(Fpin);  
		}

		@Then("User selects Country of Birth {string}")
		public void user_selects_country_of_birth(String BirthCountry) throws InterruptedException {
			StocksOnboarding.BirthCountrySelection(BirthCountry);
		}

		@Then("User selects City of Birth {string}")
		public void user_selects_city_of_birth(String BirthCity) throws InterruptedException {
			StocksOnboarding.BirthCitySelection(BirthCity);
		}
		@Then("User selects Nationality {string}")
		public void user_selects_nationality(String nationality) throws InterruptedException {
			StocksOnboarding.SelectNationality(nationality);
		}

		@Then("User selects Source of Wealth {string}")
		public void user_selects_source_of_wealth(String srcWealth) throws InterruptedException {
			StocksOnboarding.SelectSrcWealth(srcWealth);
		}

		@Then("User chooses TaxResidency Other than India RadioButon {string}")
		public void user_chooses_tax_residency_other_than_india_radio_buton(String tax) throws InterruptedException {
			StocksOnboarding.TaxRes(tax); 
		}

		@Then("User chooses Politically Exposed Person RadioButton {string}")
		public void user_chooses_politically_exposed_person_radio_button(String pep) throws InterruptedException {
			StocksOnboarding.PEP(pep);
		}

		@Then("User chooses Relation with PEP RadioButton {string}")
		public void user_chooses_relation_with_pep_radio_button(String Relpep) throws InterruptedException {
			StocksOnboarding.RelationPEP(Relpep);
		}

		@Then("User clicks on Declaration of FATCA")
		public void user_clicks_on_declaration_of_fatca() throws InterruptedException {
			StocksOnboarding.ClickDeclareFATCA();
		}

		@Then("User clicks on SaveButton")
		public void user_clicks_on_save_button() throws InterruptedException {
			StocksOnboarding.ClickSaveFATCA();  
			System.out.println("FATCA Completed");
		}
	//INCOME PROOF
		@Then("User chooses Gender RadioButton {string}")
		public void user_chooses_gender_radio_button(String gender) throws InterruptedException {
			Thread.sleep(3000);
			StocksOnboarding.ChooseGenderIncome(gender);
		}

		@Then("User chooses Marital Status {string}")
		public void user_chooses_marital_status(String Mstatus) throws InterruptedException {
			StocksOnboarding.ChooseMaritalStatus(Mstatus);
		}

		@Then("User chooses Income Group {string}")
		public void user_chooses_income_group(String income) throws InterruptedException {
			StocksOnboarding.IncomeRange(income);
		}

		@Then("User clicks on Continue of Income")
		public void user_clicks_on_continue_of_income() throws InterruptedException {
			StocksOnboarding.ClickIncomeContinue();
			System.out.println("Incomeproof Completed");
		}

	//NO NOMINEE	
		@When("User Clicks on NoNominee Checkbox")
		public void user_clicks_on_no_nominee_checkbox() {
			StocksOnboarding.ClickOnNoNominee();
		}

		@Then("User clicks on SubmitOfNoNominee")
		public void user_clicks_on_submit_of_no_nominee() throws InterruptedException {
			StocksOnboarding.SubmitNoNominee();
			System.out.println("Proceede with No Nominee");
		}
	//ADD NOMINEE
		@Then("User Enters Nominee1 FullName {string}")
		public void user_enters_nominee1_full_name(String FullName) throws InterruptedException {
			StocksOnboarding.Nominee1FullNameEntry(FullName);
		}

		@Then("Selects Gender RadioButton {string}")
		public void selects_gender_radio_button(String gender) throws InterruptedException {
			StocksOnboarding.SelectGender(gender);
		}

		@Then("Selects Relationship With Nominee {string}")
		public void selects_relationship_with_nominee(String Relation) throws InterruptedException {
			StocksOnboarding.SelectRelation(Relation);
		}

		@Then("User enters Nominee DOB")
		public void user_enters_nominee_dob() throws InterruptedException {
			StocksOnboarding.NomineeDOB();
		}

		@Then("User enters Percentage Allocation {string}")
		public void user_enters_percentage_allocation(String percent) throws InterruptedException {
			StocksOnboarding.PercentageAllocation(percent);
		}

		@Then("User enters NomineePAN\\/AadharNo {string}")
		public void user_enters_nominee_pan_aadhar_no(String aadhar) throws InterruptedException {
			StocksOnboarding.NomineeAadharNo(aadhar);
		}

		@Then("User enters Guardidan Name {string}")
		public void user_enters_guardidan_name(String name) throws InterruptedException {
			StocksOnboarding.NomineeGaurdianName(name);
		}

		@Then("Selects Relationship With ChildNominee {string}")
		public void selects_relationship_with_child_nominee(String relation) throws InterruptedException {
			StocksOnboarding.RelationshipWithMinor(relation);
		}

		@Then("User enters Guardian PAN\\/AadharNo {string}")
		public void user_enters_guardian_pan_aadhar_no(String PANAadhar) throws InterruptedException {
			StocksOnboarding.NomineeGuardianPANAadhar(PANAadhar);
		}

		@Then("User enters GuardianAddress {string}")
		public void user_enters_guardian_address(String address) throws InterruptedException {
			StocksOnboarding.NomineeGuardianAddress(address); 
		}

		@Then("User enters PINcode {string}")
		public void user_enters_pi_ncode(String pin) throws InterruptedException {
			StocksOnboarding.NomineeGauardianPIN(pin);
		}

		@Then("User enters City {string}")
		public void user_enters_city(String City) throws InterruptedException {
			Thread.sleep(2000);
			StocksOnboarding.NomineeGuardianCity(City);
		}

		@Then("User enters State {string}")
		public void user_enters_state(String state) throws InterruptedException {
			Thread.sleep(2000);
			StocksOnboarding.GuardianStateEntry(state);
		}

		@Then("User enters Country {string}")
		public void user_enters_country(String country) throws InterruptedException {
			Thread.sleep(2000);
			StocksOnboarding.GuardianCountryEntry(country);
		}
		@Then("User clicks on Save&Add New Nominee")
		public void user_clicks_on_save_add_new_nominee() throws InterruptedException {
			StocksOnboarding.ClickSaveAddNominee();
		}  
		
		@Then("User clicks on SubmitOfNominee")
		public void user_clicks_on_submit_of_nominee() throws InterruptedException {
			StocksOnboarding.ClickSubmitNominee();
			System.out.println("Nominee page Completed");
		}

	//SELFIE VARIFICARTION
		@Then("User is redirected to Sefie varification page")
		public void user_is_redirected_to_sefie_varification_page() throws InterruptedException {
			StocksOnboarding.TakePicture();
		}

		@Then("clicks on Take Picture")
		public void clicks_on_take_picture() throws InterruptedException {
			StocksOnboarding.ClickTakePic();  
		}
		@Then("User allow permission for camera")
		public void user_allow_permission_for_camera() throws InterruptedException, MalformedURLException {
			Thread.sleep(2000);
			StocksOnboarding.CameraAccess(); 
		}
		@Then("User clicks on Take SnapshotButton")
		public void user_clicks_on_take_snapshot_button() throws InterruptedException {
			StocksOnboarding.SnapShotClick();
		}
		@Then("User clicks on SkipOfSnapshot")
		public void user_clicks_on_skip_of_snapshot() throws InterruptedException {
			Thread.sleep(2000);
			StocksOnboarding.SnapShotClick();
		}
		@Then("User clicks on UseCamera")
		public void user_clicks_on_use_camera() throws InterruptedException {
			StocksOnboarding.UseCameraClick();
		}



}
