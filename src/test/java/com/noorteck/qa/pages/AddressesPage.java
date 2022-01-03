package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class AddressesPage extends CommonUI {

	@FindBy(xpath = "//*[text()='New Address']")
	WebElement clickNewAddress;

	@FindBy(xpath = "//*[@name='address[first_name]']")
	WebElement enterFirstName;

	@FindBy(xpath = "//*[@name='address[last_name]']")
	WebElement enterLastName;

	@FindBy(xpath = "//*[@name='address[address1]']")
	WebElement enterAddress1;

	@FindBy(xpath = "//*[@name='address[address2]'")
	WebElement enterAddress2;

	@FindBy(xpath = "//*[@name='address[city]']")
	WebElement enterCity;

	@FindBy(xpath = "//*[@name='address[state]']")
	WebElement selectState;

	@FindBy(id = "//*[@id = 'address_zip_code']")
	WebElement enterZipCode;

	@FindBy(id = "//*[@id = 'address_country_us']")
	WebElement clickCountry;

	@FindBy(id = "//*[@id = 'address_age']")
	WebElement enterAge;

	@FindBy(id = "//*[@id = 'address_website']")
	WebElement eneterWebsite;

	@FindBy(id = "//*[@id = 'address_phone']")
	WebElement enterPhone;

	@FindBy(id = "//*[@id = 'address_interest_dance']")
	WebElement selectDancing;

	@FindBy(id = "//*[@id = 'address_note']")
	WebElement Note;

	@FindBy(xpath = "//input[@name='commit']")
	WebElement CreateAddress;

	@FindBy(xpath = "//div[@class ='alert alert-notice']")
	WebElement Addresswassuccessfullycreated;

	@FindBy(xpath = "//a[text() = 'Edit']")
	WebElement Edit;

	@FindBy(xpath = "//a[text() = 'List']")
	WebElement List;

	public AddressesPage() {
		PageFactory.initElements(driver, this);

	}

	public void clickNewAddress() {
		click(clickNewAddress);
	}

	public void enterFirstName(String fname) {
		enter(enterFirstName, fname);
	}

	public void enterLastName(String lName) {
		enter(enterLastName, lName);
	}

	public void addressOne(String addressOne) {
		enter(enterAddress1, addressOne);
	}

	public void addressTwo(String addressTwo) {
		enter(enterAddress2, addressTwo);
	}

	public void enterCity(String city) {
		enter(enterCity, city);
	}

	public void selectStateDropD(String selectState) {
		selectStateDropD(selectState);
	}

	public void clickCountryRadio() {
		click(clickCountry);
	}

	public void enterAge(String age) {
		enter(enterAge, age);
	}

	public void enterWebPage(String webPage) {
		enter(eneterWebsite, webPage);
	}

	public void enterPhone(String addressphone) {
		enter(enterPhone, addressphone);
	}

	public void clickDancing() {
		click(selectDancing);
	}

	public void enterNote(String addressnote) {
		enter(Note, addressnote);
	}

	public void clickCreateAddress() {
		click(CreateAddress);
	}

	public void clickList() {
		click(List);

	}

	public void enterAddresswassuccessfullycreated(String alertnotice) {
		enter(Addresswassuccessfullycreated, alertnotice);
	}

	public void enterEdit(String edit) {
		enter(Edit, edit);
	}

}
