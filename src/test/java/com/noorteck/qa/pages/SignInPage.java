package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignInPage extends CommonUI {

	@FindBy(xpath = "//*[@type='submit']")
	WebElement emailField;

	@FindBy(xpath = "//*[@type='password']")
	WebElement passswordField;

	@FindBy(xpath = "//*[@type='submit']")
	WebElement signInButton;

	public SignInPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterEmail(String email) {
		enter(emailField, email);
	}

	public void enterPassword(String password) {
		enter(passswordField, password);
	}

	public void clickSignIn() {
		click(signInButton);
	}

}
