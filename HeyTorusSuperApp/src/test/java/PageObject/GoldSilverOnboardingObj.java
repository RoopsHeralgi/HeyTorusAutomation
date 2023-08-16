package PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldSilverOnboardingObj {
	WebDriver edriver;
	
	public GoldSilverOnboardingObj(WebDriver fdriver)
	{
		edriver = fdriver;
		PageFactory.initElements(fdriver, this);
	}
	@FindBy(xpath = "//*[@id=\"main-content\"]/app-landing/ion-content/app-heading/ion-row/ion-row/span")
	WebElement WealthText;
	public void WealthVisibility()
	{
//		String ExpectedText =  WealthText.getText();
//		if(ExpectedText.equals(" Wealth Wellness "))
//		{
//			System.out.println("Wealth Heading is visible");
//			break;
//		}
//		else
//		{
//			System.out.println("Not visible");
//		}
	}
	@FindBy(id="Gold/SilverlandingCard")
	WebElement GoldSilverCard;
	public void GoldSilverCardClick() throws InterruptedException
	{
		Thread.sleep(7000);
		Actions actions = new Actions(edriver);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		GoldSilverCard.click();
		Thread.sleep(2000);
	}
	
//	@FindBy(xpath="")
}
