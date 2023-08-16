package stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import Utility.ExcelReader;
import io.cucumber.java.en.*;

public class LoginWithDataSteps extends BaseClass{
	
	
	String ExcelFile = "D:/HeyTorusSuperAppDataTable/LoginData.xlsx";
	ExcelReader reader = new ExcelReader();
//	List<Map<String,String>> testData = 
//			reader.getData(ExcelFile, SheetName);

	@When("User enters Mobile as {string} and {int}")
	public void user_enters_mobile_as_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
		
//			String ExcelFile = "C:/Users/33000046/Desktop/LoginData.xlsx";
//			ExcelReader reader = new ExcelReader();
			List<Map<String,String>> testData = 
				reader.getData(ExcelFile, SheetName);
			String mobile = testData.get(RowNumber).get("MOBILE NO");
			SignUppage.EnterMobile(mobile);
	}

	@When("User enter Otp as {string} and {int}")
	public void user_enter_otp_as_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
		List<Map<String,String>> testData = 
				reader.getData(ExcelFile, SheetName);
		String otp = testData.get(RowNumber).get("OTP");
		SignUppage.EnterOTP(otp);
	}

	@When("User enters First Name {string} and {int}")
	public void user_enters_first_name_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
		List<Map<String,String>> testData = 
				reader.getData(ExcelFile, SheetName);
		String Fname = testData.get(RowNumber).get("FirstName");
		SignUppage.FirstName(Fname);
	}

	@When("User enters Middle Name {string} and {int}")
	public void user_enters_middle_name_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException {
		List<Map<String,String>> testData = 
				reader.getData(ExcelFile, SheetName);
		String Mname = testData.get(RowNumber).get("MiddleName");
		SignUppage.MiddleName(Mname);
	}

	@When("User enters Last Name {string} and {int}")
	public void user_enters_last_name_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException {
		List<Map<String,String>> testData = 
				reader.getData(ExcelFile, SheetName);
		String Lname = testData.get(RowNumber).get("LastName");
		SignUppage.LastName(Lname);
	}

	@When("User enters E-mail {string} and {int}")
	public void user_enters_e_mail_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException {
		List<Map<String,String>> testData = 
				reader.getData(ExcelFile, SheetName);
		String email = testData.get(RowNumber).get("Email");
		SignUppage.EmailID(email);
	}

	@Then("User enters MPIN {string} and {int}")
	public void user_enters_mpin_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException, InterruptedException {
		List<Map<String,String>> testData = 
				reader.getData(ExcelFile, SheetName);
		String Mpin = testData.get(RowNumber).get("MPIN");
		SignUppage.MPIN(Mpin);
  	}



}
