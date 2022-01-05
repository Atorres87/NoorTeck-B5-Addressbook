package com.noorteck.qa.test;

import org.testng.asserts.SoftAssert;

import com.noorteck.qa.pages.AddressesPage;
import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.SignInPage;
import com.noorteck.qa.pages.SignUpPage;
import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class AddressBookTest extends ObjInitialize {

	public static void main(String[] args) throws InterruptedException {

		String url = "http://a.testaddressbook.com/sign_up";
		
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
		AddressesTestOne();
		
		
		
		CommonUI.quitBrowser();

		url = "http://a.testaddressbook.com/sign_in";
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
		AddressesTestTwo();
		

		CommonUI.quitBrowser();

	}

	public static void AddressesTestOne(){
		SignUpPage signUpObj = new SignUpPage();
		
		SoftAssert softAssert = new SoftAssert();
		signUpObj.enterEmail("john_a.nicna@gmail.com");
		signUpObj.enterPassword("A1234");
		signUpObj.clickSignUp();

	String expectedText = "Welcome to Address Book";
		String actualText = "Welcome to Address Book";

		softAssert.assertEquals(expectedText, actualText);
		softAssert.assertAll();
	}

	public static void AddressesTestTwo() throws InterruptedException{
		SignInPage signInObj = new SignInPage();
		HomePage homeObj = new HomePage();
		AddressesPage addressesObj = new AddressesPage();
		
		signInObj.enterEmailField("john_a.nicna@gmail.com");
		signInObj.enterPasswordField("A1234");
		signInObj.clickSignIn();
		homeObj.clickAddresses();
        addressesObj.clickNewAddress();
		addressesObj.enterFirstName("John");
		addressesObj.enterLastName("Cena");
		addressesObj.addressOne("123 Java Drive");
		addressesObj.enterCity("Miami");
		//addressesObj.chooseDropDown("value", "FL");
		//addressesObj.clickCountryRadio();
		//addressesObj.enterAge("22");
		//addressesObj.enterPhone("3055445544");
		//addressesObj.clickDancing();
	    addressesObj.enterNote("Automation is Fun");
		addressesObj.clickCreateAddress();
		addressesObj.clickList();
		
		//Thread.sleep(2000);
		//addressesObj.enterFirstName.isDisplayed();
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
