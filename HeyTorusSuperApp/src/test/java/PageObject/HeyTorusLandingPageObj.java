package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeyTorusLandingPageObj {
	WebDriver sdriver;
	
	public HeyTorusLandingPageObj(WebDriver tdriver) {
//		sdriver=tdriver;
//		PageFactory.initElements(tdriver, this);
		 this.sdriver = tdriver;
	        //This initElements method will create all WebElements
	        PageFactory.initElements(tdriver, this);
	}
	
	@FindBy(xpath="//app-heading//ion-row[@class='m-2 ng-star-inserted md hydrated']")
	WebElement wealthHeading;
	public void HeadingWealth() throws InterruptedException
	{
		Thread.sleep(5000);
		wealthHeading.isDisplayed();
	}
	
	@FindBy(xpath="//app-gridtype/ion-grid/div[1][@class='ng-star-inserted']")
	WebElement MoneyMaker;
	public void MoneyMakerHeading() throws InterruptedException
	{
		Thread.sleep(1000);
		MoneyMaker.isDisplayed();
	}
	
	@FindBy(xpath="//app-gridtype//ion-grid[1]//div[@class='ng-star-inserted'][2]")
	WebElement MoneySaver;
	public void MoneySaverHeading() throws InterruptedException
	{
		Thread.sleep(1000);
		MoneySaver.isDisplayed();
	}
	
	@FindBy(id="Engagement0")
	WebElement WealthFooter;
	public void FooterWealth()
	{
		WealthFooter.isDisplayed();
	}
	
	@FindBy(id="Engagement1")
	WebElement HealthFooter;
	public void FooterHealth()
	{
		HealthFooter.isDisplayed();
	}
	
	@FindBy(id="Engagement2")
	WebElement CareerFooter;
	public void FooterCareer()
	{
		CareerFooter.isDisplayed();
	}
	
	@FindBy(id="Engagement3")
	WebElement LifestyleFooter;
	public void FooterLifestyle()
	{
		LifestyleFooter.isDisplayed();
	}
	
	@FindBy(id="StocklandingCard")
	WebElement StockExplore;
	public void Stocks()
	{
		StockExplore.click();
	}
	@FindBy(xpath="//cap-header[@ng-reflect-other-text-name='Stock']")
	WebElement StockTitle;
	public void TitleOfStock()
	{
		StockTitle.isDisplayed();
	}
	
	@FindBy(id="Engagement0")
	WebElement HomeIcon;
	public void ClickOnHome() throws InterruptedException
	{
		Thread.sleep(2000);
		HomeIcon.click();
		Thread.sleep(2000);
	}
	@FindBy(id="Mutual FundlandingCard")
	WebElement MFExplore;
	public void MutualFund() throws InterruptedException
	{
		Thread.sleep(5000);
		MFExplore.click();
		Thread.sleep(5000);
	}
	@FindBy(xpath="//ion-header//ion-grid//ion-row//ion-col[@class='mt-2 pt-3 ng-star-inserted md hydrated']")
	WebElement MFTitle;
	public void TitleOfMF() throws InterruptedException
	{
		Thread.sleep(2000);
		MFTitle.isDisplayed();
	}
	
	@FindBy(id="Gold/SilverlandingCard")
	WebElement GoldSilverExplore;
	public void GoldSilver() throws InterruptedException
	{
		GoldSilverExplore.click();
		Thread.sleep(2000);
	}
	
}
