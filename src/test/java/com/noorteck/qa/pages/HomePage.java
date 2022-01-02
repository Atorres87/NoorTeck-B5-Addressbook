package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {

	@FindBy(xpath = "//*[@class='nav-item nav-link active']")
	WebElement HomeLink;

	@FindBy(xpath = "//*[@data-test='addresses']")
	WebElement AddressesLink;

	@FindBy(xpath = "//*[@data-test='sign-out']")
	WebElement signOutLink;

	@FindBy(xpath = "//*[text()='Welcome to Address Book']")
	WebElement WelcomeMessage;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void clickHome() {
		click(HomeLink);
	}

	public void clickAddresses() {
		click(AddressesLink);
	}

	public void clickSignOut() {
		click(signOutLink);
	}

	public String displayedTitle() {
		return getText(WelcomeMessage);
	}
}