package com.noorteck.qa.test;



import org.openqa.selenium.WebElement;

import com.noorteck.qa.pages.AddressesPage;
import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.SignInPage;
import com.noorteck.qa.pages.SignUpPage;
import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class AddressBookTest extends ObjInitialize {

	public static void main(String[] args) {

		String url = "http://a.testaddressbook.com/sign_up";

		CommonUI commonUIObj = new CommonUI();
		ObjInitialize obj = new ObjInitialize();
		AddressBookTest TestPageObj = new AddressBookTest();
		 SignUpPage signUpObj = new SignUpPage();
		HomePage homeObj = new HomePage();
		AddressesPage addressesPageObj = new AddressesPage();

		
		  commonUIObj.openBrowser("chrome"); 
		  commonUIObj.navigate(url);
		  obj.initializeClassObj();
		  
		  
		//  TestPageObj.AddressesTestOne();
		 

		commonUIObj.quitBrowser();

		url = "http://a.testaddressbook.com/sign_in";
		commonUIObj.openBrowser("chrome");
		commonUIObj.navigate(url);
		obj.initializeClassObj();
		TestPageObj.AddressesTestTwo();

		commonUIObj.quitBrowser();

	}

	public void AddressesTestOne() {

		signUpObj.enterEmail("johncena123@gmail.com");
		signUpObj.enterPassword("A1234");
		signUpObj.clickSignUp();

		String expectedText = "Welcome to Address Book";
		String actualText = "Welcome to Address Book";
		if (actualText.contains(expectedText)) {
			System.out.println("Text verified");
		} else {
			System.out.println("wrong Test");

		}

	}

	public void AddressesTestTwo() {
		SignInPage signInObj = new SignInPage();

		signInObj.enterEmail("johncena123@gmail.com");
		signInObj.enterPassword("A1234");
		signInObj.clickSignIn();

		HomePage homeObj = new HomePage();

		homeObj.clickAddresses();

		AddressesPage addressesPageObj = new AddressesPage();

		addressesPageObj.clickNewAddress();
		addressesPageObj.enterFirstName("John");
		addressesPageObj.enterLastName("Doe");
		addressesPageObj.addressOne("5050 nw 50 st");
		addressesPageObj.enterCity("Miami");
		addressesPageObj.selectStateDropD("Florida");
		addressesPageObj.clickCountryRadio();
		addressesPageObj.enterAge("22");
		addressesPageObj.enterPhone("3055445544");
		addressesPageObj.clickDancing();
		addressesPageObj.enterNote("Automation is Fun");
		addressesPageObj.clickCreateAddress();
		addressesPageObj.clickList();
		
		

		
		}
	public boolean isDisplayed(WebElement enterFirstName) {
		return enterFirstName.isDisplayed();
	}

}

/**
 * -------------------------------------- INSTRUCTIONS
 * --------------------------------------------
 * 
 * ---> Create JAVA CLASS for each page of the application ---> Inspect the
 * elements and store the values ---> Create the class constructor ---> Create
 * the methods
 * 
 * ---> DONT FORGET ***** EACH PAGE CLASS SHOULD INHERIT CommonUI Class
 * ******************* ---> DONT FORGET ***** DECLARE PAGE CLASS OBJECT in
 * CONSTANTS CLASS ******************* ---> DONT FOGET ***** INITIALIZE PAGE
 * CLASS OBJECTS IN ObjInitialize JAVA ClASS ******************* ---> DONT FOGET
 * ***** CHANGE JAVA VERSION TO 1.8 *******************
 * 
 * 
 * 
 * ---> For each test case create a method then call those methods from main
 * method. ---> DONT FORGET ***** Refer to the INSTRUCTION PDF file for the test
 * cases to automate **************
 * 
 * ---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
 * ---> Once pushed add US to the project then send picture in MENTORS GROUP
 * CHAT Crystal: --> Koritzerc23@gmail.com Helen: --> Hnbehining@gmail.com
 * Ahmad: --> a.stanikzai77@gmail.com Fahim: --> NTKBatch5
 * 
 * 
 */
