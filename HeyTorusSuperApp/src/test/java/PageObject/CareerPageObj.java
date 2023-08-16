package PageObject;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareerPageObj {
	 WebDriver pdriver;
	
	public CareerPageObj(WebDriver qdriver)
	{
		pdriver = qdriver;
		PageFactory.initElements(qdriver, this);
	}
	@FindBy(xpath="//*[@id=\"main-content\"]/app-landing/ion-content/app-heading/ion-row/ion-row/span")
	WebElement WealthHeading;
	public void WealthHeadingVisibility() throws InterruptedException
	{
		Thread.sleep(5000);
//		WealthHeading.isDisplayed();
		String actual= WealthHeading.getText();
		String expected = "Wealth Wellness";
		Assert.assertEquals(actual, expected);
		System.out.println("User is on SuperApp Landing Page");
	}
	
	@FindBy(id="Engagement2")
	WebElement CareerTab;
	public void CareerFooterTab() throws InterruptedException
	{
		Thread.sleep(7000);
		CareerTab.click();
		//Thread.sleep(5000);
	}
	@FindBy(xpath="//*[@id=\"main-content\"]/app-landing/ion-content/app-heading/ion-row/ion-row")
	WebElement EducationWellText;
	public void EducationWellnessvisibility()
	{
//		EducationWellText.isDisplayed();
		String actual = EducationWellText.getText();
		String expected = "Education Wellness";
		Assert.assertEquals(actual, expected);
		System.out.println("User is on Education Landing page");
	}
	@FindBy(id="CoursesbackGround")
	WebElement Courses;
	public void ClickCourses() throws InterruptedException
	{
		Thread.sleep(2000);
		Courses.click();
	}
	@FindBy(xpath="//*[@id=\"main-content\"]/app-landing/ion-content/app-body/app-carousel/ion-grid/ion-slides/div[1]/ion-slide/app-commoncharts/ion-row/ion-col/span")
	WebElement portFolioText;
	public void portFoliovisibility() throws InterruptedException
	{
		Thread.sleep(2000);
//		portFolioText.isDisplayed();
		String actual = portFolioText.getText();
		String expected = "PortFolio Summary";
		Assert.assertEquals(actual, expected);
		System.out.println("PortFolio Summary is visible");
	}
	@FindBy(xpath="//*[@id=\"main-content\"]/app-landing/ion-content/app-body/div/app-snapshot/div[1]/span")
	WebElement SavedCoursesText;
	public void SavedCoursesvisibility() throws InterruptedException
	{
		Thread.sleep(2000);
//		SavedCoursesText.isDisplayed();
		String actual = SavedCoursesText.getText();
		String expected = "Saved Courses";
		Assert.assertEquals(actual, expected);
		System.out.println("Saved Courses are visible");
	}
	@FindBy(xpath="//*[@id=\"main-content\"]/app-landing/ion-content/app-body/div/app-snapshot/div[2]/span")
	WebElement FeaturedCoursesText;
	public void FeaturedCoursesvisibility() throws InterruptedException
	{
		Thread.sleep(2000);
		Actions actions = new Actions(pdriver);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		FeaturedCoursesText.isDisplayed();
		String actual = FeaturedCoursesText.getText();
		String expected = "Featured Courses";
		Assert.assertEquals(actual, expected);
		System.out.println("Featured Courses are visible");
	}
	@FindBy(id="Shopping/listing2")
	WebElement ExploreFooter;
	public void ClickExploreFooter() throws InterruptedException
	{
		Thread.sleep(2000);
		ExploreFooter.click();
		Thread.sleep(2000);
	}
	@FindBy(xpath="//*[@id=\"main-content\"]/app-listing/ion-content/app-heading/ion-row/ion-row/span")
	WebElement ExplorePage;
	public void ExplorePageVisibility() throws InterruptedException
	{
		Thread.sleep(2000);
//		ExplorePage.isDisplayed();
		String actual = ExplorePage.getText();
		String expected = "Explore";
		Assert.assertEquals(actual, expected);
		System.out.println("User is on Explore Page");
	}
//	@FindBy(id="CourseslistingCard0")
	@FindBy(xpath="//*[@id=\"Life InsurancelistingCard\"]")
	WebElement CourseCard0;
	public void ClickCourseCard0() throws InterruptedException
	{
		Thread.sleep(2000);
		CourseCard0.click();
		Thread.sleep(2000);
		System.out.println("Life Insurance Course");
	}
	@FindBy(xpath="//*[@id=\"main-content\"]/app-detail/ion-app/cap-header/ion-header/ion-toolbar/ion-grid/ion-row/ion-col[2]/span")
	WebElement BuyPage;
	public void BuyPageVisibility() throws InterruptedException 
	{
		Thread.sleep(2000);
//		BuyPage.isDisplayed();
		String actual =  BuyPage.getText();
		String expected = "Education";
		Assert.assertEquals(actual, expected);
		System.out.println("User is in Buy page");
	}
	@FindBy(id="CoursesBUY")
//	@FindBy(xpath="//*[@id=\"CoursesBUY\"]")
	WebElement BuyButton;
	public void ClickBuybtn() throws InterruptedException
	{
		Thread.sleep(8000);
		BuyButton.click();
	}
	@FindBy(xpath="//*[@id=\"main-content\"]/app-order-book/cap-header/ion-header/ion-toolbar/ion-grid/ion-row/ion-col[2]/span")
	WebElement OrderBookPage;
	public void OrderBookPageVisibility() throws InterruptedException
	{
		Thread.sleep(8000);
//		OrderBookPage.isDisplayed();
		String actual = OrderBookPage.getText();
		String expected = "Order Book";
		Assert.assertEquals(actual, expected);
		System.out.println("User is on Order Book Page");
	}
	@FindBy(id="CoursesAddToCart")
	WebElement AddCart;
	public void ClickAddToCart() throws InterruptedException
	{
		Thread.sleep(15000);
		AddCart.click();
	}
	@FindBy(xpath="//*[@id=\"main-content\"]/app-global-cart/cap-header/ion-header/ion-toolbar/ion-grid/ion-row/ion-col[2]/span//*[@id=\"main-content\"]/app-global-cart/cap-header/ion-header/ion-toolbar/ion-grid/ion-row/ion-col[2]/span//*[@id=\"main-content\"]/app-global-cart/cap-header/ion-header/ion-toolbar/ion-grid/ion-row/ion-col[2]/span")
	WebElement AddCartPage;
	public void AddToCartPageVisibility() throws InterruptedException
	{
		Thread.sleep(5000);
//		AddCartPage.isDisplayed();
		String actual = AddCartPage.getText();
		String expected = "My Cart(1 items)";
		Assert.assertEquals(actual, expected);
		System.out.println("User is on My Cart Page");
	}
	@FindBy(id="Proceed to Checkout")
	WebElement ProceedPay;
	public void ClickProceedToPay() throws InterruptedException
	{
		Thread.sleep(5000);
		ProceedPay.click();
	}
	@FindBy(id="cartPlace Order")
	WebElement PlaceOrder;
	public void ClickPlaceOrder() throws InterruptedException
	{
		Thread.sleep(5000);
		PlaceOrder.click();
	}
	@FindBy(xpath="//*[@id=\"main-content\"]/app-edu-checkout/ion-app/ion-header/ion-toolbar/ion-grid/ion-row/ion-col[2]/span")
	WebElement CheckOutPage;
	public void CheckOutPageVisibility() throws InterruptedException
	{
		Thread.sleep(3000);
//		CheckOutPage.isDisplayed();
		String expected = "Checkout";
		String actual = CheckOutPage.getText();
		Thread.sleep(2000);
		Assert.assertEquals(actual, expected);
		System.out.println("User is on CheckOut Page");
	}
	@FindBy(id="Proceed To Payment")
	WebElement ProceedToPay;
	public void ClickProceedToPayment() throws InterruptedException
	{
		Thread.sleep(5000);
		ProceedToPay.click();
	}
	@FindBy(xpath="//*[@id=\"header-wrapper\"]/div/div[1]/div/div[2]/p")
	WebElement TorusPG;
	public void PaymentGatewayVisibility() throws InterruptedException
	{
		Thread.sleep(3000);
		String expected = "Torus";
		String actual = TorusPG.getText();
		Thread.sleep(2000);
		Assert.assertEquals(actual, expected);
		System.out.println("User is on Payment Gateway page");
	}
	@FindBy(xpath = "//*[@id=\"form-common\"]/div[1]/div[1]/div/div/div[2]/div/button[3]")
	WebElement NetBanking;
	@FindBy(xpath = "//*[@id=\"bank-item-UTIB\"]")
	WebElement Axis;
	@FindBy(id = "redesign-v15-cta")
	WebElement PayNowBtn;
	@FindBy(xpath = "/html/body/form/button[1]")
	WebElement Success;
	public void ClickPayNow() throws InterruptedException 
	{
		Thread.sleep(9000);
		// It will return the parent window name as a String
		String parent=pdriver.getWindowHandle();

		Set<String>s=pdriver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		pdriver.switchTo().window(child_window); 

		System.out.println(pdriver.switchTo().window(child_window).getTitle());

		pdriver.close();
		}

		}
		//switch to the parent window
		pdriver.switchTo().window(parent);

		}
		
		
//		NetBanking.click();
//		Thread.sleep(4000);
//		Axis.click();
//		Thread.sleep(4000);
//		PayNowBtn.click();
//		Thread.sleep(6000);
//		Success.click();
//	}
	
	@FindBy(xpath="//*[@id=\"header-wrapper\"]/div/div[2]/button")
	WebElement closebtn;
	public void ClickClose() throws InterruptedException
	{
		Thread.sleep(2000);
		closebtn.click();
	}
	@FindBy(id="positiveBtn")
	WebElement yesbtn;
	public void ClickYes() throws InterruptedException
	{
		Thread.sleep(2000);
		yesbtn.click();
	}
	
//PORTFOLIO
	@FindBy(id="Operation/Learn3")
	WebElement LearnFooter;
	public void ClickLearnFooter() throws InterruptedException
	{
		Thread.sleep(5000);
		LearnFooter.click();
		Thread.sleep(2000);
	}
	@FindBy(xpath="//*[@id=\"main-content\"]/app-vault/ion-content/app-heading/ion-row/ion-row/span")
	WebElement LearnHeading;
	public void LearnVisibility() throws InterruptedException
	{
		Thread.sleep(3000);
		String expected = "Learn";
		String actual = LearnHeading.getText();
		Thread.sleep(2000);
		Assert.assertEquals(actual, expected);
		System.out.println("User is on Learn Page");
	}
	@FindBy(id="Coursesundefined")
	List<WebElement> CourseList;
	public void CourseCount()
	{
//		int count;
		for(int count=0;count<=(CourseList.size())-1;count++)
		{
			System.out.println(count);        // 100
		}
        
	}
	
	
	
}
