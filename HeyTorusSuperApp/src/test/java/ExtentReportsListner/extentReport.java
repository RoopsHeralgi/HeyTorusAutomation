package ExtentReportsListner;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class extentReport {
	
	public WebDriver driver;
	public ExtentReports extent;
	public ExtentTest extentTest;

	
	
	@BeforeTest
	public void setExtent(){
		extent = new ExtentReports(System.getProperty("user.dir")+"/ExtentReport.html/", true);
		extent.addSystemInfo("Host Name", "Roopa");
		extent.addSystemInfo("User Name", "Roopa Heralgi");
		extent.addSystemInfo("Environment", "QA");
		
	}
	
	@AfterTest
	public void endReport(){
		extent.flush();
		extent.close();
	}
	
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException{
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots"
		// under src folder
		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + screenshotName + dateName
				+ ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}
	
	
	
	
	@BeforeMethod
	public void setup(){
		
		WebDriverManager.chromedriver().setup();
		   ChromeOptions options= new ChromeOptions();
	       options.addArguments("--remote-allow-origins=*");
	       driver= new ChromeDriver(options);
	       System.setProperty("webdriver.http.factory", "jdk-http-client");
		
	       driver.get("https://proto.heytorus.com");
		
	}
	
	
	
	@Test
	public void HeyTorusTitleTest(){
		extentTest = extent.startTest("HeyTorusTitleTest");
		String expectedTitle = "HeyTorus";
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,expectedTitle);
		System.out.println("Title matched");
	}
	
	@Test
	public void HeyTorusLogoTest(){
		extentTest = extent.startTest("HeyTorusLogoTest");
		boolean b = driver.findElement(By.xpath("//Img[@class='custImg']")).isDisplayed();
		Assert.assertTrue(b);
	}
	
	@Test
	public void MobileNo(){
		extentTest = extent.startTest("LoginWithMobile");
		driver.findElement(By.id("mobileButton")).sendKeys("9820538889");
		
	}
	
	
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException{
		
		if(result.getStatus()==ITestResult.FAILURE){
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
			
			String screenshotPath = extentReport.getScreenshot(driver, result.getName());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath)); //to add screenshot in extent report
			//extentTest.log(LogStatus.FAIL, extentTest.addScreencast(screenshotPath)); //to add screencast/video in extent report
		}
		else if(result.getStatus()==ITestResult.SKIP){
			extentTest.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS){
			extentTest.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());

		}
		
		
		extent.endTest(extentTest); //ending test and ends the current test and prepare to create html report
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	



}
