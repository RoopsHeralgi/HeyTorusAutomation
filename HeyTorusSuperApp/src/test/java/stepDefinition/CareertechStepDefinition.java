package stepDefinition;

import PageObject.CareerPageObj;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CareertechStepDefinition extends BaseClass {

	//CareerTechFlow
		@Given("User is on SuperApp Landing page")
		public void user_is_on_super_app_landing_page() throws InterruptedException {
			CareerObjPage=new CareerPageObj(driver);
			Thread.sleep(2000);
			CareerObjPage.WealthHeadingVisibility();
		}

		
		@When("user clicks on CareerTab on Footer")
		public void user_clicks_on_career_tab_on_footer() throws InterruptedException {
			Thread.sleep(10000);
			CareerObjPage.CareerFooterTab();
			//Thread.sleep(2000);
		}

		@Then("Education Wellness page should open")
		public void education_wellness_page_should_open() {
			CareerObjPage.EducationWellnessvisibility();
		}

		@When("click on Courses")
		public void click_on_courses() throws InterruptedException {
			Thread.sleep(2000);
			CareerObjPage.ClickCourses();
		}

		@Then("PortFolio Summary should be visible")
		public void port_folio_summary_should_be_visible() throws InterruptedException {
			CareerObjPage.portFoliovisibility();
		}

		@Then("Saved Courses should be visible")
		public void saved_courses_should_be_visible() throws InterruptedException {
			CareerObjPage.SavedCoursesvisibility();
		}

		@Then("Featured Courses should be visible")
		public void featured_courses_should_be_visible() throws InterruptedException {
			CareerObjPage.FeaturedCoursesvisibility();
		}

		@Then("click on Explore tab Footer")
		public void click_on_explore_tab_footer() throws InterruptedException {
			CareerObjPage.ClickExploreFooter();
		}

		@Then("Explore page should be visible")
		public void explore_page_should_be_visible() throws InterruptedException {
			CareerObjPage.ExplorePageVisibility();
		}

		@When("click on course card")
		public void click_on_course_card() throws InterruptedException {
			CareerObjPage.ClickCourseCard0();
		}

		@Then("redirect to Buy page")
		public void redirect_to_buy_page() throws InterruptedException {
			CareerObjPage.BuyPageVisibility();
		}

		@When("click on Buy")
		public void click_on_buy() throws InterruptedException {
			CareerObjPage.ClickBuybtn();
		}

		@Then("redirect to OrderBook page")
		public void redirect_to_order_book_page() throws InterruptedException {
			CareerObjPage.OrderBookPageVisibility();
		}
		@When("User clicks on Add to Cart")
		public void user_clicks_on_add_to_cart() throws InterruptedException {
			CareerObjPage.ClickAddToCart();
		}

		@Then("User should redirect to My Cart Page")
		public void user_should_redirect_to_my_cart_page() throws InterruptedException {
			CareerObjPage.AddToCartPageVisibility();
		}

		@When("User clicks on Proceed to Checkout")
		public void user_clicks_on_proceed_to_checkout() throws InterruptedException {
			CareerObjPage.ClickProceedToPay();
		}

		@When("User clicks on Place Order")
		public void user_clicks_on_place_order() throws InterruptedException {
			CareerObjPage.ClickPlaceOrder();
		}

		@Then("User should redirect to Checkout page")
		public void user_should_redirect_to_checkout_page() throws InterruptedException {
			CareerObjPage.CheckOutPageVisibility();
		}

		@When("User clicks on Proceed to payment")
		public void user_clicks_on_proceed_to_payment() throws InterruptedException {
			CareerObjPage.ClickProceedToPayment();
		}

		@Then("User should proceed to PaymentGateway Page")
		public void user_should_proceed_to_payment_gateway_page() throws InterruptedException {
			CareerObjPage.PaymentGatewayVisibility();
		}
		
		@Then("User clicks on PayNow")
		public void user_clicks_on_pay_now() throws InterruptedException {
			CareerObjPage.ClickPayNow();
		}

		@When("User clicks on close button")
		public void user_clicks_on_close_button() throws InterruptedException {
			CareerObjPage.ClickClose();
		}

		@When("User clicks on yes button")
		public void user_clicks_on_yes_button() throws InterruptedException {
			CareerObjPage.ClickYes();
		}
		
//PORTFOLIO
		
		@When("User click on Learn Footer tab")
		public void user_click_on_learn_footer_tab() throws InterruptedException 
		{
			Thread.sleep(2000);
			CareerObjPage.ClickLearnFooter();
		}

		@Then("Learn page should be visible")
		public void learn_page_should_be_visible() throws InterruptedException 
		{
			Thread.sleep(2000);
			CareerObjPage.LearnVisibility();
		}

		@Then("count the Number of Courses Enrolled")
		public void count_the_number_of_courses_enrolled() 
		{
			CareerObjPage.CourseCount();
		}



}
