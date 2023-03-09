package com.pom.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPageClass {

	WebDriver driver;

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(name = "pwd")
	private WebElement password;

	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginBtn;

	@FindBy(id = "toPasswordRecoveryPageLink")
	private WebElement forgotpass;

	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement checkBox;

	public LoginPageClass(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	public void EnterLoginBTn() {

		loginBtn.click();

	}

	public void EnterUserName(String user) {

		username.sendKeys(user);

	}

	public void EnterPasword(String pass) {

		password.sendKeys(pass);

	}

	public void enterCred(String user, String pass) {

		username.sendKeys(user);
		password.sendKeys(pass);

	}

	public void clickOnForgotpasslinK() {

		forgotpass.click();

	}

	public void checkBoxClick() {

		checkBox.click();

	}

}
