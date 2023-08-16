package stepDefinition;

import org.openqa.selenium.WebDriver;

import PageObject.CareerPageObj;
import PageObject.GoldSilverOnboardingObj;
import PageObject.HeyTorusLandingPageObj;
import PageObject.StocksOnboardingObj;
import PageObject.loginPage;

public class BaseClass {
	public static WebDriver driver = null;
	public static loginPage SignUppage= null;
	public static HeyTorusLandingPageObj HeyTorusLandingPage=null;
	public static GoldSilverOnboardingObj GoldSilverOnboarding =null;
	public static StocksOnboardingObj StocksOnboarding=null;
	public static CareerPageObj CareerObjPage = null;
	//public static loginPage LP = null;
}
