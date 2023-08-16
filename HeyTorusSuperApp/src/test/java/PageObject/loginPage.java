package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver rdriver;
	//Create constructor
	public loginPage(WebDriver pdriver) throws InterruptedException
	{
		rdriver=pdriver;
		PageFactory.initElements(pdriver,this);
		Thread.sleep(5000);
		
	}
	
	@FindBy(xpath ="//Img[@class='custImg']")
	WebElement TorusImg;
	public void HeyTorusImg() throws InterruptedException
	{
		Thread.sleep(2000);
		TorusImg.isDisplayed();
	}
	
	@FindBy(id="mobileButton")
	WebElement sign;
	//Action method
		public void ClickOnSignUp() throws InterruptedException
		{
			Thread.sleep(5000);
			sign.click();
		}
	
	@FindBy(id="mobileNumber")
	WebElement mobile;
	//Action method for enter mobile number
	public void EnterMobile(String MOB) throws InterruptedException
	{
		Thread.sleep(2000);
		mobile.sendKeys(MOB);
	}
	
	@FindBy(id="loginContinew")
	WebElement BtnContinue;
	//Action method
	public void ClickContinue() throws InterruptedException
	{
		Thread.sleep(2000);
		BtnContinue.click();
	}
	
//	@FindBy(xpath="//button[1][@type='button']/span")
	@FindBy(id="Referralskipbtn")
	WebElement Skip;
	//Action method
	public void ClickSkip() throws InterruptedException
	{   Thread.sleep(2000);
		Skip.click();
	}
	
	@FindBy(name="ion-input-0")
//	@FindBy(id="otp1")
	WebElement otp;
	//Action method
	public void EnterOTP(String OTP) throws InterruptedException
	{
		Thread.sleep(2000);
		otp.click();
		Thread.sleep(2000);
		otp.sendKeys(OTP);
		Thread.sleep(2000);
	}
	
	@FindBy(id="submitOTP")
	WebElement Submit;
	//Action method
	public void SubmitOTP() throws InterruptedException
	{
		Submit.click();
		Thread.sleep(20000);
	}
	

	@FindBy(id="firstName")
	WebElement Fname;
	public void FirstName(String fname) throws InterruptedException
	{
		Thread.sleep(4000);
		//Fname.clear();
		Fname.sendKeys(fname);
	}
	
	@FindBy(id="middleName")
	WebElement Mname;
	public void MiddleName(String mname)
	{
		Mname.sendKeys(mname);
	}
	
	@FindBy(id="lastName")
	WebElement Lname;
	public void LastName(String lname)
	{
		Lname.sendKeys(lname);
	}
	
	@FindBy(id="emailId")
	WebElement Email;
	public void EmailID(String email)
	{
		Email.clear();
		Email.sendKeys(email);
	}
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnContinue;
	public void ContinueClick() {
		
		btnContinue.click();
	}
	
	//@FindBy(xpath="//ion-grid//ion-row[3]//ion-col[1][@class='md hydrated']")
	@FindBy(id="setMpin1")
	WebElement mpin1;
	public void MPIN1(String MPIN1) throws InterruptedException
	{
		Thread.sleep(5000);
		mpin1.click();
		Thread.sleep(1000);
		mpin1.sendKeys(MPIN1);
	}
	
	@FindBy(id="setMpin5")
	WebElement mpin2;
	public void MPIN2(String MPIN2) throws InterruptedException
	{
		Thread.sleep(3000);
		mpin2.click();
		mpin2.sendKeys(MPIN2);
	}
	
	@FindBy(id="setMpin")
	
	WebElement submit;
	public void submit() throws InterruptedException
	{
		Thread.sleep(2000);
		submit.click();
	}
	
	@FindBy(id="mpin1")
//	@FindBy(id="setMpin5")
	WebElement mpin;
	public void MPIN(String MPIN) throws InterruptedException
	{
		Thread.sleep(2000);
		mpin.click();
		Thread.sleep(5000);
		mpin.sendKeys(MPIN);
		Thread.sleep(5000);
	}
	
	@FindBy(id="setMpin")
	WebElement fsubmit;
	public void FSubmit() throws InterruptedException
	{
		Thread.sleep(2000);
		fsubmit.click();
	}
	
	
}

