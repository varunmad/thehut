package com.Pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPagePojo extends BaseClass {
public LoginPagePojo() {
	PageFactory.initElements(driver,this);
	}

	@FindBy(id="username")
	private WebElement textUserName;
	@FindBy(id="password")
	private WebElement textpassword;
	@FindBy(id="login")
	private WebElement btnlogin;


	public WebElement getBtnlogin() {
		return btnlogin;
	}
	public WebElement getTextUserName() {
		return textUserName;
	}
	public WebElement getTextpassword() {
		return textpassword;
	}
}

