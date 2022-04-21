package com.app.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.app.utilities.CommonUtilies;

public class Login_page {

	private static Login_page loginInstance;

	private Login_page() {

	}

	public static Login_page getInstance() {   

		if (loginInstance==null) {   
			loginInstance = new Login_page();
		}	  

		return loginInstance;

	}


	@FindBy(xpath="//a[text()='Account']")
	private WebElement ACCOUNT_TAB;

	@FindBy(css ="input#username")
	private WebElement USERNAME;

	@FindBy(id="password")
	private WebElement PASSWORD;

	@FindBy(xpath="//button[@name='login']")
	private WebElement LOGIN_BUTTON;

	@FindBy(xpath="//strong[text()='abc']")
	private WebElement Page_Username;


	//Getters and setters method
	//	public WebElement getACCOUNT_TAB() {
	//		return ACCOUNT_TAB;
	//	}
	//
	//	public WebElement getUSERNAME() {
	//		return USERNAME;
	//	}
	//
	//	public WebElement getPASSWORD() {
	//		return PASSWORD;
	//	}
	//
	//	public WebElement getLOGIN_BUTTON() {
	//		return LOGIN_BUTTON;
	//	}
	//
	//	public WebElement getPage_Username() {
	//		return Page_Username;
	//	}


	public void  click_Account_tab() {
		CommonUtilies.getInstance().highlightElement(ACCOUNT_TAB);
		ACCOUNT_TAB.click();
	}

	public void enterUsername(String userName){
		CommonUtilies.getInstance().highlightElement(USERNAME);
		USERNAME.sendKeys(userName);

	}
	public void enterPassword(String password){
		CommonUtilies.getInstance().highlightElement(PASSWORD);
		PASSWORD.sendKeys(password);
	}

	public void click_Login_button(){
		CommonUtilies.getInstance().highlightElement(LOGIN_BUTTON);
		LOGIN_BUTTON.click();
	}


	public String Page_UserName(){
		return Page_Username.getText();
	}
}
