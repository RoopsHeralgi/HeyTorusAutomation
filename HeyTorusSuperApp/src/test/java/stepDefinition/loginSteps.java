package stepDefinition;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageObject.CareerPageObj;
import PageObject.GoldSilverOnboardingObj;
import PageObject.HeyTorusLandingPageObj;
import PageObject.StocksOnboardingObj;
import PageObject.loginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginSteps extends BaseClass{

	//public WebDriver driver;
	//public loginPage SignUppage;
	public HeyTorusLandingPageObj HeyTorusLandingPage;
	private String browserName;
	//public CareerPageObj CareerObjPage;
	//public GoldSilverOnboardingObj GoldSilverOnboarding;
	//public StocksOnboardingObj StocksOnboarding;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	   ChromeOptions options= new ChromeOptions();
       options.addArguments("--remote-allow-origins=*");
       driver= new ChromeDriver(options);
       System.setProperty("webdriver.http.factory", "jdk-http-client");
       
        
        SignUppage=new loginPage(driver);
        HeyTorusLandingPage = new HeyTorusLandingPageObj(driver);
        CareerObjPage=new CareerPageObj(driver);
        GoldSilverOnboarding = new GoldSilverOnboardingObj(driver); 
        StocksOnboarding =new StocksOnboardingObj(driver);
//        driver.manage().window().maximize();
	}

	@When("^User opens URL \"([^\"]*)\"$")
	public void user_opens_url(String url) throws InterruptedException {
		
		Thread.sleep(2000);
	    driver.get(url);
	}

	@Then("Page should contain Torus Image")
	public void Page_should_contain_Torus_Image() throws InterruptedException
	{
		Thread.sleep(2000);
		//SignUppage.HeyTorusImg();
		System.out.println("Hey Torus Image is Displayed");
	}
	
	
	@When("User Click on SignUp Using Mobile")
	public void user_click_on_sign_up_Using_Mobile() throws InterruptedException {
		Thread.sleep(2000);
		SignUppage.ClickOnSignUp();
	}

	@And("^User enters Mobile as \"([^\"]*)\"$")
	public void user_enters_mobile_as(String MOB) throws InterruptedException {
		Thread.sleep(2000);
	    SignUppage.EnterMobile(MOB);
	}

	@And("Click on Continue button")
	public void click_on_continue_button() throws InterruptedException {
		Thread.sleep(2000);
		SignUppage.ClickContinue();
	}

	@And("Click on Skip button")
	public void click_on_skip_button() throws InterruptedException {
		Thread.sleep(2000);
		SignUppage.ClickSkip();
	}

	@And("User enter Otp as {string}")
	public void user_enter_otp_as(String OTP) throws InterruptedException {
	    Thread.sleep(5000);
	    SignUppage.EnterOTP(OTP);
	}
	@And("User clicks on ContinueOTP")
	public void user_clicks_on_continue_otp() throws InterruptedException {
	    Thread.sleep(2000);
	    SignUppage.SubmitOTP();
	}

	
	@When("^User enters First Name \"([^\"]*)\"$")
	public void user_enters_first_name(String fname) throws InterruptedException {
		Thread.sleep(7000);
		SignUppage.FirstName(fname);
	}

	@And("^User enters Middle Name \"([^\"]*)\"$")
	public void user_enters_middle_name(String mname) throws InterruptedException {
		Thread.sleep(2000);
		SignUppage.MiddleName(mname);
	}

	@And("^User enters Last Name \"([^\"]*)\"$")
	public void user_enters_last_name(String lname) throws InterruptedException {
		Thread.sleep(2000);
		SignUppage.LastName(lname);
	}

	@And("^User enters E-mail \"([^\"]*)\"$")
	public void user_enters_e_mail(String email) throws InterruptedException {
		Thread.sleep(2000);
		SignUppage.EmailID(email);
	}
	
	@When("User enters First Name \"([^\"]*)\"$ Middle Name \"([^\"]*)\"$ Last Name \"([^\"]*)\"$ and Email \"([^\"]*)\"$")
	public void user_enters_first_name_middle_name_last_name_and_email(String fname, String mname, String lname, String email) throws InterruptedException {
		SignUppage.FirstName(fname);
		SignUppage.MiddleName(mname);
		SignUppage.LastName(lname);
		SignUppage.EmailID(email);
	}

	@Then("User clicks on Continue")
	public void user_clicks_on_continue() throws InterruptedException {
		Thread.sleep(2000);
		SignUppage.ContinueClick();
	}

	@And("^User enters MPIN1 \"([^\"]*)\"$")
	public void user_enters_mpin1(String MPIN1) throws InterruptedException {
	    Thread.sleep(10000);
	    SignUppage.MPIN1(MPIN1);
	}
	@And("^User ReEnter MPIN2 \"([^\"]*)\"$")
	public void user_re_enter_mpin2(String MPIN2) throws InterruptedException {
	    Thread.sleep(2000);
	    SignUppage.MPIN2(MPIN2);
	}

	@Then("User clicks on Submit")
	public void user_clicks_on_submit() throws InterruptedException {
		SignUppage.submit();
	}
	
	@And("^User enters MPIN \"([^\"]*)\"$")
	public void user_enters_mpin(String MPIN) throws InterruptedException {
	   Thread.sleep(5000);
	   SignUppage.MPIN(MPIN);
	}

	@Then("User clicks on FSubmit")
	public void user_clicks_on_f_submit() throws InterruptedException {
	    Thread.sleep(3000);
	    SignUppage.FSubmit();
	}

}
