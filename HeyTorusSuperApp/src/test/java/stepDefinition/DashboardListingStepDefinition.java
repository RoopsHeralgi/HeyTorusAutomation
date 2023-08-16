package stepDefinition;

import PageObject.HeyTorusLandingPageObj;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardListingStepDefinition extends BaseClass{
	
	//dashboardListing.feature
	
		@When("User is on Hey torus Landing page")
		public void user_is_on_hey_torus_landing_page() throws InterruptedException {
//			Thread.sleep(2000);
//			driver=new ChromeDriver(); 
	       HeyTorusLandingPage = new HeyTorusLandingPageObj(driver);
//	        driver.manage().window().maximize();
			Thread.sleep(7000);
	        HeyTorusLandingPage.HeadingWealth();
			System.out.println("Wealth Wellness Heading visible");
		
		}

		@Then("check for Money Makers")
		public void check_for_money_makers() throws InterruptedException {
			HeyTorusLandingPage.MoneyMakerHeading();
			System.out.println("Money Maker is visible");
		}

		@Then("check for Money Saver")
		public void check_for_money_saver() throws InterruptedException {
			HeyTorusLandingPage.MoneySaverHeading();
			System.out.println("Money Saver is visible");
		}

		@Then("check for Footer Icon Wealth")
		public void check_for_footer_icon_wealth() {
			HeyTorusLandingPage.FooterWealth();
			System.out.println("Footer Wealth Icon is Visible");
		}

		@Then("check for Footer Icon Health")
		public void check_for_footer_icon_health() {
			HeyTorusLandingPage.FooterHealth();
			System.out.println("Footer Health Icon is visible");
		    
		}

		@Then("Check for Footer Icon Career")
		public void check_for_footer_icon_career() {
			HeyTorusLandingPage.FooterCareer();
			System.out.println("Footer Career Icon is visible");
		}

		@Then("check for Footer Icon Lifestyle")
		public void check_for_footer_icon_lifestyle() {
			HeyTorusLandingPage.FooterLifestyle();
			System.out.println("Footer Lifestyle Icon is visible");
		}

		@When("User clicks on Explore of Stock")
		public void user_clicks_on_explore_of_stock() throws InterruptedException {
			HeyTorusLandingPage.Stocks();
			Thread.sleep(2000);
			System.out.println("User Clicks Stocks Explore Button");
		}

		@Then("User should redirect to Stock Landing page")
		public void user_should_redirect_to_stock_landing_page() {
			HeyTorusLandingPage.TitleOfStock();
			System.out.println("User is on Stocks Landing Page");
		}

//		@When("User clicks on Explore of Mutual Fund")
//		public void user_clicks_on_explore_of_mutual_fund() throws InterruptedException {
//			Thread.sleep(5000);
//			HeyTorusLandingPage.ClickOnHome();
//			Thread.sleep(5000);
//			HeyTorusLandingPage.MutualFund();
//			System.out.println("User Clicks Mutual Fund Explore Button");
//		}
	//
//		@Then("User should redirect to Mutual Fund Landing page")
//		public void user_should_redirect_to_mutual_fund_landing_page() throws InterruptedException {
//			HeyTorusLandingPage.TitleOfMF();
//			System.out.println("User is on MutualFund Landing Page");
//			Thread.sleep(2000);
//		}
	
		@When("User clicks on Explore of Gold\\/Silver")
		public void user_clicks_on_explore_of_gold_silver() throws InterruptedException {
		   Thread.sleep(2000);
		   HeyTorusLandingPage.ClickOnHome();
		   Thread.sleep(2000);
		   HeyTorusLandingPage.GoldSilver();
		   Thread.sleep(2000);
		   System.out.println("User Clicks Gold/Silver Explore Button");
		}

		@Then("User should redirect to Gold\\/Silver Landing page")
		public void user_should_redirect_to_gold_silver_landing_page() throws InterruptedException {
			Thread.sleep(3000);
		//	CareerObjPage.CareerFooterTab();
			Thread.sleep(2000);
		}

		@When("User clicks on Health Icon of Footer")
		public void user_clicks_on_health_icon_of_footer() {
		    
		}

		@Then("User should redirect to Landing page of Health Icon")
		public void user_should_redirect_to_landing_page_of_health_icon() {
		    
		}

		@When("User clicks on Career Icon of Footer")
		public void user_clicks_on_career_icon_of_footer() {
		   
		}

		@Then("User should redirect to Landing page of Career Icon")
		public void user_should_redirect_to_landing_page_of_career_icon() {
		   
		}

}
