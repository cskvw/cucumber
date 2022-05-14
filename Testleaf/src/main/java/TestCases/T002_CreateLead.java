package TestCases;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseClass;

import Pages.LoginPage;

public class T002_CreateLead extends BaseClass {


	@BeforeTest
	public void setValue() {
		excelFileName = "sampledata";
	}

	@Test(dataProvider = "provideData")	
	public void runVerfiyLogin(String Username,String Password,String Company,String FirstName,String LastName) throws InterruptedException{

		LoginPage lp = new LoginPage(driver);

		lp.enterUsername(Username).enterPassword(Password).clickSubmit().buttonClick().
		clickLd().createLeadClick().leadFormCompany(Company).leadFormFirstName(FirstName).leadFormLastName(LastName).
		leadFormButton();
	}

}
