package PageObject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StocksOnboardingObj {
	
	WebDriver gdriver;
	
	public StocksOnboardingObj(WebDriver hdriver)
	{
		gdriver = hdriver;
//		ChromeOptions options = new ChromeOptions();
		PageFactory.initElements(hdriver, this);
		
	}
	@FindBy(id="StockbackGround")
	WebElement StockCard;
	public void StockLandingClick() throws InterruptedException
	{
		Thread.sleep(20000);
		StockCard.click();
		Thread.sleep(2000);
	}
	
	@FindBy(xpath="//ion-grid//ion-row//ion-col//span[@class='custFontFamilyMuliBold muli-16pt custColorDark ng-star-inserted']")
	WebElement StockLandingPage;
	public void StocksTitle()
	{
		StockLandingPage.isDisplayed();
	}
	@FindBy(id="STclickKyc")
	WebElement KYCPending;
	public void KycPendingClick() throws InterruptedException
	{
		KYCPending.click();
		Thread.sleep(2000);
	}
//PAN ENTRY	
	@FindBy(xpath="//*[@id=\"main-content\"]/app-onboarding-bare-bone/ion-app/ion-content/ion-router-outlet/lib-pan-card/ion-content/div[1]/ion-grid/ion-row/ion-col/ion-card/ion-card-header")
	WebElement PAN;
	public void PANPage() throws InterruptedException
	{
		Thread.sleep(1000);
		String expected = "Enter your PAN";
		String actual = PAN.getText();
		Thread.sleep(2000);
		Assert.assertEquals(actual, expected);
//		PAN.isDisplayed();
	}
	@FindBy(id="STenterPan")
	WebElement PANEntry;
	public void PANData(String PAN) throws InterruptedException
	{
		PANEntry.click();
		Thread.sleep(1000);
		PANEntry.sendKeys(PAN);
		Thread.sleep(1000);
	}
	@FindBy(id="STsubmitPan")
	WebElement SubmitPAN;
	public void PANContinue() throws InterruptedException
	{
		SubmitPAN.click();
		Thread.sleep(1000);
	}
//DATE OF BIRTH	
	@FindBy(xpath="//*[@id=\"main-content\"]/app-onboarding-bare-bone/ion-app/ion-content/ion-router-outlet/app-kra/ion-content/ion-grid/form/ion-row[1]/ion-col/p[1]")
	WebElement PANDatePage;
	public void PANDate()
	{
		PANDatePage.isDisplayed();
	}
//	@FindBy(xpath= "//*[@id=\"main-content\"]/app-onboarding-bare-bone/ion-app/ion-content/ion-router-outlet/app-kra/ion-content/ion-grid/form/ion-row[1]/ion-col/mat-form-field/div[1]/div/div[3]/mat-datepicker-toggle/button/span[4]")
//	@FindBy(xpath="//*[@id=\"main-content\"]/app-onboarding-bare-bone/ion-app/ion-content/ion-router-outlet/app-kra/ion-content/ion-grid/form/ion-row[1]/ion-col/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button")
	@FindBy(id="STselectDate")
	WebElement CalendarIcon;
	public void CalendarClick() throws InterruptedException
	{
		Thread.sleep(2000);
		CalendarIcon.click();
	}
	
//	@FindBy(xpath= "//button[@class='mat-calendar-period-button mdc-button mat-mdc-button mat-unthemed mat-mdc-button-base']")
	@FindBy(xpath="//*[@id=\"mat-datepicker-0\"]/mat-calendar-header/div/div/button[1]")
	WebElement MonthYear;
	
	@FindBy(xpath="//table[@class=\"mat-calendar-table\"]//tr//td")
//	@FindBy(xpath="//*[@id=\"mat-datepicker-0\"]/div")
	List<WebElement> allYear;
	
	@FindBy(xpath= "//mat-calendar-header/div[1]/div[1]/button[2]")
	WebElement YearBackward;
	
	@FindBy(xpath= "//button[3]//span[@class='mat-mdc-focus-indicator']")
	WebElement YearForward;
	
	@FindBy(xpath= "//*[@id=\"mat-datepicker-0\"]/div/mat-year-view/table/tbody/tr/td")
	List<WebElement> allMonth;
	
	@FindBy(xpath= "//*[@id=\"mat-datepicker-0\"]/div/mat-month-view/table/tbody/tr/td")
	List<WebElement> alltDate;

	
	public void CalendarAction() throws InterruptedException
	{
		String Year = "2000";
		String Month = "FEB";
		String Date = "19";
		Thread.sleep(3000);
		MonthYear.click();
		Thread.sleep(5000);
		
		for(WebElement ele:allYear)
		{
			String TempYear = ele.getText();
			if(TempYear.equals(Year))
			{
				ele.click();
				break;
			}
			else
			{
//				YearBackward.click();
			}
		}
		for(WebElement ele1:allMonth)
		{
			String TempMonth =ele1.getText();
			if(TempMonth.equals(Month))
			{
				ele1.click();
				break;
			}
		}
		for(WebElement ele2:alltDate)
		{
			String TempDate = ele2.getText();
			if(TempDate.equals(Date))
			{
				ele2.click();
				break;
			}
		}
		System.out.println("Date of Birth selected");
	}
	
	@FindBy(id="STsubmitDob")
	WebElement SubmitDOB;
	public void ClickSubmitDOB() throws InterruptedException
	{
		Thread.sleep(2000);
		SubmitDOB.click();
	}
//PAN VERIFICATION	
	@FindBy(id="mat-input-6")
	WebElement AutoPAN;
	public void VerifyPAN() throws InterruptedException
	{
		Thread.sleep(2000);
		if(AutoPAN == PAN)
		{
			System.out.println("PAN Match");
		}
		else
		{
			System.out.println("PAN not Match");
		}
	}
	@FindBy(xpath="//*[@id=\"main-content\"]/app-onboarding-bare-bone/ion-app/ion-content/ion-router-outlet/app-confirm-pan-detail/ion-content/ion-grid/ion-row[1]/ion-col[2]/span/span")
	WebElement KYCPAN;
	public void KYCPANVerify() throws InterruptedException
	{
		Thread.sleep(2000);
		KYCPAN.isDisplayed();
		System.out.println("PAN is KYC Verified");
	}
	@FindBy(id="STconfirmPan")
	WebElement ConfirmContinue;
	public void ClickConfirmContinue() throws InterruptedException
	{
		Thread.sleep(2000);
		ConfirmContinue.click();
	}
//PERSONAL DETAILS	
	@FindBy(xpath="//*[@id=\"main-content\"]/app-onboarding-bare-bone/ion-app/ion-content/ion-router-outlet/app-name-address-details/ion-content/ion-grid/form/ion-row[1]")
	WebElement DetailsPg;
	public void DetailsEntry() throws InterruptedException
	{
		Thread.sleep(2000);
		DetailsPg.isDisplayed();
		System.out.println("Deails Required page is visible");
	}
	@FindBy(id="undefinedcheckFather")
	WebElement FatherRB;
	public void FatherRadioButton() throws InterruptedException
	{
		Thread.sleep(2000);
		FatherRB.click();
	}
	@FindBy(id = "mat-mdc-form-field-label-42")
//	@FindBy(id="STsalutation")
//	@FindBy(name="salutation")
	WebElement Salutation;
	@FindBy(id="STsalutation-panel")
	WebElement SalutationSelect;
	public void SelectSalutation() throws InterruptedException
	{
		Thread.sleep(4000);
		Salutation.click();
		Thread.sleep(3000);
//		SalutationSelect.click();
//		System.out.println("Salutation Size:"+SalutationSelect.size());
//		for(int i = 0; i<=SalutationSelect.size()-1; i++) 
//		{
//			if(SalutationSelect.get(i).getText().contains("Dear")) 
//			{
//				SalutationSelect.get(i).click();
//                break;
//			}
//		}
		SalutationSelect.sendKeys("Sir");
		SalutationSelect.click();
                 
   	}
            
	@FindBy(id="STenterFatherFirstName")
	WebElement Fathersname;
	public void FathersName(String SFname) throws InterruptedException
	{
		Thread.sleep(4000);
//		Fathersname.click();
		Fathersname.sendKeys(SFname);
	}
	@FindBy(id="STenterFatherMiddleName")
	WebElement FathersMname;
	public void FathersMName(String FMname) throws InterruptedException
	{
		Thread.sleep(2000);
//		FathersMname.click();
		FathersMname.sendKeys(FMname);
	}
	@FindBy(id="STenterFatherLastName")
	WebElement FathersLname;
	public void FathersLName(String FLname) throws InterruptedException
	{
		Thread.sleep(2000);
		FathersLname.click();
		FathersLname.sendKeys(FLname);
	}
	@FindBy(id="STcheckSpouse")
//	@FindBy(name = "relation")
//	@FindBy(xpath="//*[@id=\"main-content\"]/app-onboarding-bare-bone/ion-app/ion-content/app-name-address-details/ion-content/ion-grid/form/ion-row[2]/ion-col[2]/input")
	WebElement SpouseRB;
	public void SpouseRadioButton() throws InterruptedException
	{
		Thread.sleep(2000);
		SpouseRB.click();
	}
	@FindBy(id="STenterFatherFirstName")
	WebElement Spousename;
	public void SpouseName(String SFname) throws InterruptedException
	{
		Thread.sleep(4000);
	//	Spousename.click();
		Spousename.sendKeys(SFname);
	}
	@FindBy(id="STenterFatherMiddleName")
	WebElement SpouseMname;
	//*[@id=\"main-content\"]/app-onboarding-bare-bone/ion-app/ion-content/app-name-address-details/ion-content/ion-grid/form/ion-row[2]/ion-col[2]/input	WebElement SpouseMname;
	public void SpouseMName(String SMname) throws InterruptedException
	{
		Thread.sleep(2000);
	//	SpouseMname.click();
		SpouseMname.sendKeys(SMname);
	}
	@FindBy(id="STenterFatherLastName")
	WebElement SpouseLname;
	public void SpouseLName(String SLname) throws InterruptedException
	{
		Thread.sleep(2000);
	//	SpouseLname.click();
		SpouseLname.sendKeys(SLname);
	}
	@FindBy(id="STenterMotherFirstName")
	WebElement MothersName;
	public void MothersName(String MFname)
	{
		MothersName.sendKeys(MFname);
	}
	@FindBy(id="STenterMotherMiddleName")
	WebElement MothersMName;
	public void MothersMName(String MMname)
	{
		MothersMName.sendKeys(MMname);
	}
	@FindBy(id="STenterMotherLastName")
	WebElement MothersLName;
//	@FindBy(xpath="//*[@id=\"mat-select-value-9\"]")
	@FindBy(xpath="//*[@id=\"main-content\"]/app-onboarding-bare-bone/ion-app/ion-content/ion-router-outlet/app-name-address-details/ion-content/ion-grid/form/ion-row[6]")
	WebElement scroll;
	public void MothersLName(String MLname)
	{
		MothersLName.sendKeys(MLname);
		Actions actions = new Actions(gdriver);
		actions.moveToElement(scroll);
		actions.perform();
	}
	@FindBy(xpath="//*[@id=\"STselectDetailOption\"]/div/div[2]")
//	@FindBy(id="STselectDetailOption")
	WebElement Occupation;
	@FindBy(id="STselectDetailOption-panel")
	WebElement OccupationSelect;
	public void SelectOccupation() throws InterruptedException
	{
		Thread.sleep(4000);
		Occupation.click();
		Thread.sleep(2000);
//		System.out.println("Occupation Size:"+OccupationSelect.size());		
//		for(int i=0;i<=(OccupationSelect.size())-1; i++)
//		{
//			if(OccupationSelect.get(i).getText().contains("Private Sector Service"))
//			{
//				Thread.sleep(2000);
//				OccupationSelect.get(i).click();
//				break;
//			}
//		}
		OccupationSelect.sendKeys("Private Sector Service");
		OccupationSelect.click();
	}
	@FindBy(id="STenterDetailAddress1")
	WebElement Address1;
	public void EntryAddr1(String Addr1) throws InterruptedException
	{
		Thread.sleep(2000);
		//Actions actions = new Actions(gdriver);
//		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		//actions.move_to_element(element).perform();
		Address1.sendKeys(Addr1);
	}

	@FindBy(id="STenterDetailAddress2")
	WebElement Address2;
	public void EntryAddr2(String Addr2) throws InterruptedException
	{
		Thread.sleep(2000);
		Address2.sendKeys(Addr2);
	}
	@FindBy(id="STenterDetailPincode")
	WebElement Pincode;
	public void PinCode(String PIN) throws InterruptedException
	{
		Thread.sleep(2000);
		Actions actions = new Actions(gdriver);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Pincode.sendKeys(PIN);
	}
	@FindBy(id="STenterDetailCity")
	WebElement City;
	@FindBy(id="STenterDetailCity-panel")
//	@FindBy(xpath="//*[@id=\"mat-option-26\"]/span")
	WebElement CityList1;
	public void SelectCity() throws InterruptedException
	{
//		Thread.sleep(2000);
//		City.click();
		Thread.sleep(2000);
		CityList1.click();
	}
	@FindBy (id="STenterDetailState")
//	@FindBy(xpath="//*[@id=\"mat-mdc-form-field-label-66\"]")
	WebElement State;
	@FindBy(id="STenterDetailState-panel")
	WebElement StateSelect;
	public void SelectState() throws InterruptedException
	{
		State.click();
//		Thread.sleep(1000);
//		System.out.println("State Size:"+StateSelect.size());	
////		StateSelect.click();
//		for(int i=0;i<=(StateSelect.size())-1; i++)
//		{
//			if(StateSelect.get(i).getText().contains("MAHARASHTRA"))
//			{
//				Thread.sleep(2000);
//				StateSelect.get(i).click();
//				break;
//			}
//		}
		StateSelect.sendKeys("MAHARASHTRA");
		StateSelect.click();

	}
	
	@FindBy(id="STenterDetailCountry")
	WebElement Country;
	@FindBy(id="STenterDetailCountry-panel")
	WebElement country;
	public void SelectCountry() throws InterruptedException
	{
		Thread.sleep(2000);
		Country.click();
		Thread.sleep(2000);
		country.click();

	}
	@FindBy(id="STcontinueDetails")
	WebElement DetailContinue;
	public void DetailContinueClick() throws InterruptedException
	{
		Thread.sleep(6000);
		DetailContinue.click();
	}
//BANK DETAILS
	@FindBy(xpath="//*[@id=\"main-content\"]/app-onboarding-bare-bone/ion-app/ion-content/ion-router-outlet/lib-bank-details/ion-content/ion-grid/ion-row/ion-col[1]/span")
	WebElement AddBank;
	public void AddBankVisibility() throws InterruptedException
	{
		Thread.sleep(2000);
		AddBank.isDisplayed();
		System.out.println("Add Bank Details Page is visible");
	}
	@FindBy(id="accountNo")
//	@FindBy(xpath = "//*[@id=\"accountNo\"]")
	WebElement BankACNumber;
	public void EnterBankACNo(String ACNumber) throws InterruptedException
	{
		Thread.sleep(4000);
//		BankACNumber.click();
		BankACNumber.sendKeys(ACNumber);
	}
	@FindBy(id="undefinedenterBankIfsc")
	WebElement IFSCcode;
	public void EnterIFSC(String IFSC) throws InterruptedException
	{
		Thread.sleep(2000);
		IFSCcode.sendKeys(IFSC);
	}
	@FindBy(xpath="//*[@id=\"btnBankDetailsConfirm\"]/span")
//	@FindBy(id="btnBankDetailsConfirm")
	WebElement BankConfirmbtn;
	public void ClickConfirmBank() throws InterruptedException
	{
		Actions actions = new Actions(gdriver);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		BankConfirmbtn.click();
	}
//	@FindBy(xpath="//*[@id=\"main-content\"]/app-onboarding-bare-bone/ion-app/ion-content/ion-router-outlet/app-display-bank-details/ion-content/ion-grid/ion-row/ion-col[1]/span")
	@FindBy(id="btnBankDetailsConfirm")
	WebElement BankConfirmPage;
	public void BankConfirmVisibility() throws InterruptedException
	{
		Thread.sleep(2000);
		BankConfirmPage.isDisplayed();
	}
	@FindBy(id="btnBankDetailsConfirm")
	WebElement ConfirmBankButton;
	public void ClickConfirmBankButton() throws InterruptedException
	{
		Thread.sleep(3000);
		ConfirmBankButton.click();
	}
	
//FATCA PAGE
	@FindBy(id="PinCode")
	WebElement FPin;
	public void FatcaPin(String FatcaPin) throws InterruptedException
	{
		Thread.sleep(2000);
		FPin.sendKeys(FatcaPin);
	}
	@FindBy(id="enterCountryBirthFatca")
//	@FindBy(xpath="//*[@id=\"mat-select-10\"]")
	WebElement CountryField;
	@FindBy(id="enterCountryBirthFatca-panel")
//	@FindBy(xpath="//*[@id=\"mat-select-10-panel\"]")
	List<WebElement> CountryList;
	public void BirthCountrySelection(String BirthCountry) throws InterruptedException
	{
		Thread.sleep(4000);
		CountryField.click();
		System.out.println("Country size:"+CountryList.size());
        for(int i = 0; i<=CountryList.size()-1; i++) {
             
             
            if(CountryList.get(i).getText().contains(BirthCountry))
            {
            	CountryList.get(i).click();
            }
                break;
               }
	}
	@FindBy(id="enterCityFatca")
	WebElement CityField;
	@FindBy(id="enterCityFatca-panel")
	List<WebElement> CityList;
	public void BirthCitySelection(String BirthCity) throws InterruptedException 
	{
		Thread.sleep(4000);
		CityField.click();
		System.out.println("City size:"+CityList.size());
        for(int i = 0; i<=CityList.size()-1; i++) {
             
             
            if(CityList.get(i).getText().contains(BirthCity))
            {
            	CityList.get(i).click();
            }
                break;
               }
	}
	
	@FindBy(id="enterCountryFatca")
	WebElement NationalityField;
	@FindBy(id="enterCountryFatca-panel")
	List<WebElement> NationalityList;
	public void SelectNationality(String Nationality) throws InterruptedException
	{
		Thread.sleep(2000);
		NationalityField.click();
		Thread.sleep(1000);
		System.out.println("Nationality size:"+NationalityList.size());
        for(int i = 0; i<=NationalityList.size()-1; i++) {
             
             
            if(NationalityList.get(i).getText().contains(Nationality))
            {
            	NationalityList.get(i).click();
            }
                break;
               }
	}
	@FindBy(id="enterSourceOfWealthFatca")
//	@FindBy(xpath="//*[@id=\"mat-select-16\"]")
	WebElement SrcWealthField;
	@FindBy(id="enterSourceOfWealthFatca-panel")
//	@FindBy(xpath="//*[@id=\"mat-select-16-panel\"]")
	List<WebElement> SrcWealthList;
	public void SelectSrcWealth(String SrcWealth) throws InterruptedException
	{
		Thread.sleep(2000);
		SrcWealthField.click();
		System.out.println("Source of wealth List size:"+SrcWealthList.size());
        for(int i = 0; i<=SrcWealthList.size()-1; i++) {
             
             
            if(SrcWealthList.get(i).getText().contains(SrcWealth))
            {
            	SrcWealthList.get(i).click();
            }
                break;
               }
	}
	@FindBy(id="radioYesTaxFatca-input")
	WebElement TaxResYes;
	@FindBy(id="radioNoTaxFatca-input")
	WebElement TaxResNo;
	public void TaxRes(String TaxR) throws InterruptedException
	{
		Thread.sleep(2000);
		if(TaxResYes.isSelected())
		{
			System.out.println("You are Not eligible to do further process.");
		}
		else
		{
			TaxResNo.click();
		}
	}
	@FindBy(id="radioYesExposedFatca-input")
	WebElement PEPyes;
	@FindBy(id="radioNoExposedFatca-input")
	WebElement PEPno;
	public void PEP(String PEP) throws InterruptedException
	{
		Thread.sleep(2000);
		if(PEPyes.isSelected())
		{
			System.out.println("You are Not eligible to do fill further process.");
		}
		else
		{
			PEPno.click();
		}
	}
	@FindBy(id="radioYesPepFatca-input")
	WebElement RelPEPyes;
	@FindBy(id="radioNoPepFatca-input")
	WebElement RelPEPno;
	public void RelationPEP(String RelPEP) throws InterruptedException
	{
		Thread.sleep(1000);
		Actions actions = new Actions(gdriver);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		if(RelPEPyes.isSelected())
		{
			System.out.println("You are Not eligible to do fill further process.");
		}
		else
		{
			RelPEPno.click();
		}
	}
	@FindBy(id="chackTermsFatca")
	WebElement DeclareFATCA;
	public void ClickDeclareFATCA() throws InterruptedException
	{
		Thread.sleep(2000);
		DeclareFATCA.click();
	}
	@FindBy(id="undefinedsaveFatca")
	WebElement SaveFATCA;
	public void ClickSaveFATCA() throws InterruptedException
	{
		Thread.sleep(1000);
		SaveFATCA.click();
	}
	
//INCOMEPROOF
	@FindBy(id="STRDBMale-input")
	WebElement GMale;
	@FindBy(id="STRDBFemale-input")
	WebElement GFemale;
	@FindBy(id="STRDBTransgender-input")
	WebElement GTrans;
	public void ChooseGenderIncome(String gender) throws InterruptedException
	{
		Thread.sleep(2000);
		if(gender.contains("Male"))
		{
			GMale.click();
		}
		else {
			if(gender.contains("Female"))
			{
				GFemale.click();
			}
			else
			{
				GTrans.click();
			}
		}
	}
	@FindBy(id="STRDBSingle -input")
	WebElement Single;
	@FindBy(id="STRDBMarried-input")
	WebElement Married;
	public void ChooseMaritalStatus(String MStatus) throws InterruptedException
	{
		Thread.sleep(2000);
		if(MStatus.contains("Single"))
		{
			Single.click();
		}
		else
		{
			Thread.sleep(2000);
			Married.click();
		}
	}
	@FindBy(id="STRDB10-25L-input")
	WebElement income;
	public void IncomeRange(String IncomeR) throws InterruptedException
	{
		Thread.sleep(2000);
		income.click();
	}
	@FindBy(id="STcontinuePersonalDetails")
	WebElement ContinueIncome;
	public void ClickIncomeContinue() throws InterruptedException
	{
		Thread.sleep(2000);
		ContinueIncome.click();
	}
//EXCHANGE SELECTION	
	@FindBy(id="chkDerivatives")
	WebElement DerivativeRB;
	public void SelectDerivative() throws InterruptedException
	{
		Thread.sleep(3000);
		DerivativeRB.click();
		Thread.sleep(2000);
	}
	@FindBy(id="btnContinue")
	WebElement ExchangeContinue;
	public void ExchangeContinueBtn() throws InterruptedException
	{
		ExchangeContinue.click();
		Thread.sleep(2000);
	}
//NO NOMINEE	
	@FindBy(id="mat-checkbox-1")
	WebElement CheckNoNonominee;
	public void ClickOnNoNominee()
	{
		CheckNoNonominee.click();
	}
	@FindBy(id="STsubmitNominee")
	WebElement SubmitNoNominee;
	public void SubmitNoNominee() throws InterruptedException
	{
		Thread.sleep(3000);
		SubmitNoNominee.click();
	}
//ADD NOMINEE
	@FindBy(id="STnomineeData")
	WebElement NomineeFullName1;
	public void Nominee1FullNameEntry(String FullName) throws InterruptedException
	{
		Thread.sleep(2000);
		NomineeFullName1.sendKeys(FullName);
	}
	@FindBy(id="STnomineemale-input")
	WebElement GenderMale;
	@FindBy(id="STnomineefemale-input")
	WebElement GenderFemale;
	public void SelectGender(String Gender) throws InterruptedException
	{
		Thread.sleep(2000);
		if(Gender.contains("Male"))
		{
			GenderMale.click();
		}
		else
		{
			GenderFemale.click();
		}
	}
	@FindBy(xpath="//*[@id=\"STnominee_particular_relationship\"]/div/div[2]")
//	@FindBy(id="STnominee_particular_relationship")
	WebElement Relation;
	@FindBy(id="STnominee_particular_relationship-panel")
	List<WebElement> RelationList;
	public void SelectRelation(String relationship) throws InterruptedException
	{
		Thread.sleep(2000);
		Relation.click();
		System.out.println("Relation List size:"+RelationList.size());
        for(int i = 0; i<=RelationList.size()-1; i++) {
             
             
            if(RelationList.get(i).getText().contains(relationship))
            {
            	RelationList.get(i).click();
            }
                break;
               }
	}
	@FindBy(xpath="//*[@id=\"main-content\"]/app-onboarding-bare-bone/ion-app/ion-content/ion-router-outlet/app-nominee-details/ion-content/ion-grid/form/div/ion-row[5]/mat-form-field/div[1]/div/div[3]")
//	@FindBy(id="STnominee_select_Dob")
	WebElement DateIcon;
	@FindBy(xpath="//*[@id=\"mat-datepicker-1\"]/mat-calendar-header/div/div/button[1]")
	//@FindBy(xpath="//*[@id=\"mat-datepicker-1\"]/mat-calendar-header/div/div/button[1]/span[5]")
	WebElement MonthYearClick;
	@FindBy(xpath="//table[@class=\"mat-calendar-table\"]//tr//td")
	List<WebElement> ALLYEAR;
	@FindBy(xpath="//*[@id=\"mat-datepicker-1\"]/mat-calendar-header/div/div/button[2]")
	WebElement BckBtn;
	@FindBy(xpath="//*[@id=\"mat-datepicker-1\"]/div/mat-year-view/table/tbody/tr/td")
	List<WebElement> ALLMONTH;
	@FindBy(xpath="//*[@id=\"mat-datepicker-1\"]/div/mat-month-view/table/tbody/tr/td")
	List<WebElement> ALLDate;
	public void NomineeDOB() throws InterruptedException
	{
		DateIcon.click();
		Thread.sleep(3000);
		MonthYearClick.click();
		String Year = "2010";
		String Month = "MAY";
		String Date = "1";
		Thread.sleep(3000);
		
		for(WebElement ele:allYear)
		{
			String TempYear = ele.getText();
			if(TempYear.equals(Year))
			{
				ele.click();
				break;
			}
			else
			{
//				YearBackward.click();
			}
		}
		for(WebElement ele1:ALLMONTH)
		{
			Thread.sleep(2000);
			String TempMonth =ele1.getText();
			if(TempMonth.contains(Month))
			{
				ele1.click();
				break;
			}
		}
		for(WebElement ele2:ALLDate)
		{
			Thread.sleep(2000);
			String TempDate = ele2.getText();
			if(TempDate.equals(Date))
			{
				ele2.click();
				break;
			}
		}
		System.out.println("Date of Birth selected");
	}
	
	@FindBy(id="STnomineePercentage")
	WebElement Percentage;
	public void PercentageAllocation(String Percent) throws InterruptedException
	{
		Thread.sleep(2000);
		Actions actions = new Actions(gdriver);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Percentage.sendKeys(Percent);
	}
	@FindBy(id="STnomineepanOrAadharNumber")
	WebElement NomineeAadhar;
	public void NomineeAadharNo(String Aadhar) throws InterruptedException
	{
		Thread.sleep(3000);
		NomineeAadhar.sendKeys(Aadhar);
	}
	@FindBy(id="STnomineeguardianFullName")
	WebElement NomineeGuardian;
	public void NomineeGaurdianName(String name) throws InterruptedException
	{
		Thread.sleep(2000);
		NomineeGuardian.sendKeys(name);
	}
	@FindBy(xpath="//*[@id=\"STnomineepanrelationshipNomineeMinor\"]/div/div[2]")
//	@FindBy(id="STnomineepanrelationshipNomineeMinor")
	WebElement RelationshipMinor;
	@FindBy(xpath="//*[@id=\"STnomineepanrelationshipNomineeMinor-panel\"]")
//	@FindBy(id="STnomineepanrelationshipNomineeMinor-panel")
	List<WebElement> RelationshipwithMInorList;
	public void RelationshipWithMinor(String Relation) throws InterruptedException
	{
		Thread.sleep(2000);
		RelationshipMinor.click();
		System.out.println("Relation List size:"+RelationshipwithMInorList.size());
        for(int i = 0; i<=RelationshipwithMInorList.size()-1; i++) {
             
             
            if(RelationshipwithMInorList.get(i).getText().contains(Relation))
            {
            	RelationshipwithMInorList.get(i).click();
            }
                break;
               }
	}
	@FindBy(id="STnomineeguardianPanOrAadharNumber")
	WebElement NomineeGardianID;
	public void NomineeGuardianPANAadhar(String PanAadhar) throws InterruptedException
	{
		Thread.sleep(2000);
		Actions actions = new Actions(gdriver);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		NomineeGardianID.sendKeys(PanAadhar);
	}
	@FindBy(id="STnomineeguardianAddress")
	WebElement NomineeGuardianAddr;
	public void NomineeGuardianAddress(String Address) throws InterruptedException
	{
		Thread.sleep(2000);
		NomineeGuardianAddr.sendKeys(Address);
		Actions actions = new Actions(gdriver);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
	}
	@FindBy(id="STnomineepincode")
	WebElement GuardianPIN;
	public void NomineeGauardianPIN(String PIN) throws InterruptedException
	{
		Thread.sleep(2000);
		GuardianPIN.sendKeys(PIN);
	}
	@FindBy(id="STnominee_profilecity")
	WebElement GaurdianCity;
	@FindBy(id="STnominee_profilecity-panel")
	WebElement GaurdianCityList;
	public void NomineeGuardianCity(String city) throws InterruptedException
	{
		Thread.sleep(3000);
		GaurdianCity.click();
		Thread.sleep(2000);
		GaurdianCityList.click();
		Actions actions = new Actions(gdriver);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
//		GaurdianCity.click();
//		System.out.println("City size:"+GaurdianCityList.size());
//        for(int i = 0; i<=GaurdianCityList.size()-1; i++) {
//             
//             
//            if(GaurdianCityList.get(i).getText().contains(city))
//            {
//            	GaurdianCityList.get(i).click();
//            }
//                break;
//               }
	}
	@FindBy(id="state")
	WebElement GuardianState;
	@FindBy(id="state-panel")
	List<WebElement> GuardianStateList;
	public void GuardianStateEntry(String State) throws InterruptedException
	{
		Thread.sleep(3000);
		Actions actions = new Actions(gdriver);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		GuardianState.click();
		System.out.println("State size:"+GuardianStateList.size());
        for(int i = 0; i<=GuardianStateList.size()-1; i++) {
             
             
            if(GuardianStateList.get(i).getText().contains(State))
            {
            	GuardianStateList.get(i).click();
            }
                break;
               }
	}
	@FindBy(id="country")
	WebElement GuardianCountry;
	@FindBy(id="country-panel")
	WebElement GuardianCountryList;
	public void GuardianCountryEntry(String Country) throws InterruptedException
	{
		Thread.sleep(2000);
		GuardianCountry.click();
		GuardianCountryList.click();
//		System.out.println("Country size:"+GuardianCountryList.size());
//        for(int i = 0; i<=GuardianCountryList.size()-1; i++) {
//             
//             
//            if(GuardianCountryList.get(i).getText().contains(Country))
//            {
//            	GuardianCountryList.get(i).click();
//            }
//                break;
//               }
	}
	@FindBy(id="STaddNewNominee")
//	@FindBy(xpath="//*[@id=\"STaddNewNominee\"]")
	WebElement SaveAddNominee;
	public void ClickSaveAddNominee() throws InterruptedException
	{
		Thread.sleep(2000);
		SaveAddNominee.click();
		
	}
	
	@FindBy(id="STSubmitbtnNominee")
	WebElement SubmitNominee;
	public void ClickSubmitNominee() throws InterruptedException
	{
		Thread.sleep(3000);
		SubmitNominee.click();
		
	}
	
//SELFIE VARIFICATION
	@FindBy(xpath="//*[@id=\"main-content\"]/app-onboarding-bare-bone/ion-app/ion-content/ion-router-outlet/app-selfie-verification/ion-content/p[1]")
	WebElement TakePicturePage;
	public void TakePicture() throws InterruptedException
	{
		Thread.sleep(2000);
		TakePicturePage.isDisplayed();
		System.out.println("Take Pictre page is visible");
	}
	@FindBy(id="STtakePictureSelfie")
	WebElement TakePicBtn;
	public void ClickTakePic() throws InterruptedException
	{
		Thread.sleep(2000);
		TakePicBtn.click();
	}
	public static final String URL = "https://proto.heytorus.com/#/Onboarding/Selfie";
	public void CameraAccess() throws InterruptedException, MalformedURLException
	{
		Thread.sleep(2000);
		String url = "https://proto.heytorus.com/#/Onboarding/Selfie";
//		gdriver.get(url);
		//gdriver.getWindowHandle();
//		gdriver.switchTo().alert().accept();
//		gdriver.navigate().to("https://proto.heytorus.com/#/Onboarding/Selfie");
//		ChromeOptions op = new ChromeOptions();
//		options.addArguments("use-fake-ui-for-media-stream");
//		gdriver = new ChromeDriver(op);
//		gdriver.get(url);
//		Map<String, Object> prefs = new HashMap<String, Object>();
//		prefs.put("profile.default_0content_setting_values.media_stream_camera", 1);
//		op.setExperimentalOption("prefs", prefs);
//		https://proto.heytorus.com/#/Onboarding/Selfie	
		
//		public static final String URL = "https://proto.heytorus.com/#/Onboarding/Selfie";

//		  public static void main(String[] args) throws Exception {

		    // Configure ChromeOptions to pass a fake media stream
//			ChromeOptions options = new ChromeOptions();
//		    options.addArguments("use-fake-device-for-media-stream");
//		    options.addArguments("use-fake-ui-for-media-stream");
//
//		    DesiredCapabilities caps = new DesiredCapabilities();
//		    caps.setCapability("browserName", "Chrome");
//		    caps.setCapability("version", "latest");
//		    caps.setCapability("platform", "WIN10");
//		    caps.setCapability(ChromeOptions.CAPABILITY, options);
//		    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

//		    // WebCam Test
//		    driver.get("https://proto.heytorus.com/#/Onboarding/Selfie");
//		    Thread.sleep(5000);
//		    driver.findElement(By.id("webcam-launcher")).click();
//		    Thread.sleep(2000);

		    // Microphone Test
//		    driver.get("https://www.vidyard.com/mic-test/");
//		    Thread.sleep(2000);
//		    driver.findElement(By.xpath("(//a[@id='start-test']")).click();
//		    Thread.sleep(2000);

	}
	@FindBy(xpath="Take A Snapshot")
	WebElement TakeSnapShot;
	public void SnapShotClick() throws InterruptedException
	{
//		String url = "https://proto.heytorus.com/#/Onboarding/Selfie";
//		gdriver.get(url);
		Thread.sleep(2000);
		TakeSnapShot.click();
	}
	@FindBy(id="STskipSelfie")
	WebElement SkipSnapShot;
	public void SnapshotSkip() throws InterruptedException
	{
		Thread.sleep(2000);
		SkipSnapShot.click();
	}
	@FindBy(xpath="//*[@id=\"ion-overlay-20\"]/div[2]/div/div[1]/button")
	WebElement UseCamera;
	public void UseCameraClick() throws InterruptedException
	{
		Thread.sleep(2000);
		UseCamera.click();
	}
	
}
