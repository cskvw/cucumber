package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.LoginPage;


public class T001_VerfiyLoginPage extends BaseClass {
	
	
	@BeforeTest
	public void setValue() throws IOException {
		
		excelFileName = "logindata";
	}

	@Test(dataProvider = "provideData")		
	
	public void runVerfiyLogin(String Username,String Password) throws IOException {

		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(Username).enterPassword(Password).clickSubmit().verfiyHomepage().buttonClick();



	}

}