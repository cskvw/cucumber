package stepDefinations;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.app.constants.Constants;
import com.app.page_objects.Login_page;
import com.app.webdriver_manager.DriverManager;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login_app_test {


	private static final Logger LOGGER =LogManager.getLogger(Login_app_test.class);


	@Given("the Username")
	public void the_username() {

		DriverManager.getDriver().get(Constants.APP_URL);

		try {


			Login_page.getInstance().click_Account_tab();

			LOGGER.info("user is clicked account tab");
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}

		try {
			Login_page.getInstance().enterUsername(Constants.UserName);
			LOGGER.info("user enterted username");
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}

	}

	@And("the Password")
	public void the_password() {

		try {
			Login_page.getInstance().enterPassword(Constants.Password);
			LOGGER.info("user enterted passowrd");

		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}

	}

	@When("the login button is clicked")
	public void the_login_button_is_clicked() {

		try {
			Login_page.getInstance().click_Login_button();
			LOGGER.info("user clicked Loggin button");
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}

	}


	@And("username is verfied")
	public void username_is_verfied() {


		try {

			String expName ="abc";
			String name = Login_page.getInstance().Page_UserName();
			Assert.assertEquals(name, expName);
			System.out.println("test verfied");
			LOGGER.info("Username is verfied");
		} catch (Exception e) {
			LOGGER.error(e);
			Assert.fail(e.getMessage());
		}

		//Assert.assertTrue(name.contains("xyz"), "Text not found!");

	}

}
