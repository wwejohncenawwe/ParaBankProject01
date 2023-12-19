package com.BankProject.StepDefinition;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import com.BankProject.BaseClass.BaseClass;
import com.BankProject.PojoClass.PojoManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParaBankTesting_StepDefinition extends BaseClass {

	PojoManager pojo=new PojoManager();

	@Given("verify that user is on para bank customer login page")
	public void verify_that_user_is_on_para_bank_customer_login_page() {
		//		if(text(pojo.getreg().getCustomerlogin(),"Customer Login")) {
		if(webelementDisplayed(pojo.getreg().getCustomerlogin())) {
			logger.info("user is on customer login page");
			assertTrue(true);
		}else {
			logger.info("user not in para bank portal");
			assertTrue(false);
		}
	}
	@When("user click on register link")
	public void user_click_on_register_link() {
		btnClick(pojo.getreg().getRegister());
		logger.info("user clicked register link for regiration process");
		webdriverClickWait(driver, pojo.getreg().getFirstname());
	}
	@Then("user can see the signup register form")
	public void user_can_see_the_signup_register_form() {
		//		if(pageSource(driver,"Signing up is easy!")) {
		if(webelementDisplayed(pojo.getreg().getSignupform())) {
			logger.info("user is on register form page");
			assertTrue(true);
		}else {
			logger.info("user unable to enter register page");
			assertTrue(false);
		}		  
	}
	@When("user enter a valid firstname as {string}")
	public void user_enter_a_valid_firstname_as(String string) {
		type(pojo.getreg().getFirstname(), string);
		logger.info("user entered a valid firstname in register form");
	}
	@When("user enter a valid lastname as {string}")
	public void user_enter_a_valid_lastname_as(String string) {
		type(pojo.getreg().getLastname(), string);
		logger.info("user entered a valid lastname in register form");
	}
	@When("user enter a valid address as {string}")
	public void user_enter_a_valid_address_as(String string) {
		type(pojo.getreg().getAddress(), string);
		logger.info("user entered a valid address in register form");
	}
	@When("user enter a valid city as {string}")
	public void user_enter_a_valid_city_as(String string) {
		type(pojo.getreg().getCity(), string);
		logger.info("user entered a valid city in register form");
	}
	@When("user enter a valid state as {string}")
	public void user_enter_a_valid_state_as(String string) {
		type(pojo.getreg().getState(), string);
		logger.info("user entered a valid state in register form");
	}
	@When("user enter a valid pincode as {string}")
	public void user_enter_a_valid_pincode_as(String string) {
		type(pojo.getreg().getPincode(), string);
		logger.info("user entered a valid pincode in register form");
	}
	@When("user enter a valid phoneno as {string}")
	public void user_enter_a_valid_phoneno_as(String string) {
		type(pojo.getreg().getPhoneno(), string);
		logger.info("user entered a valid phoneno in register form");
	}
	@When("user enter a valid ssnno as {string}")
	public void user_enter_a_valid_ssnno_as(String string) {
		type(pojo.getreg().getSsnno(), string);
		logger.info("user entered a valid ssnnoin register form");
	}
	@Then("user enter a valid username as {string}")
	public void user_enter_a_valid_username_as(String string) {
		type(pojo.getreg().getUsername(), string);
		logger.info("user entered a valid username in register form");
	}
	@Then("user enter a valid password as {string}")
	public void user_enter_a_valid_password_as(String string) {
		type(pojo.getreg().getPassword(), string);
		logger.info("user entered a valid password in register form");
	}
	@Then("user enter a valid confirmpass as {string}")
	public void user_enter_a_valid_confirmpass_as(String string) {
		type(pojo.getreg().getConfirmpass(), string);
		logger.info("user entered a valid confirmpassword in register form");
	}
	@Then("user finally click on register button")
	public void user_finally_click_on_register_button() {
		btnClick(pojo.getreg().getRegisterbtn());
		logger.info("user clicked a register button on register form");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	@Then("user see the successfully registered message")
	public void user_see_the_successfully_registered_message() {
		//		if(pageSource(driver,"Welcome")) {
		if(webelementDisplayed(pojo.getreg().getVerifyregister())) {
			Assert.assertTrue(true);
			logger.info("user successfully registered");
		}else {
			logger.info("user not registered");
			captureScreenshot2(driver, "register failed");
			Assert.assertTrue(false);
		}
	}
	@Given("verify that user is on customer login page")
	public void verify_that_user_is_on_customer_login_page() {
		if(pageSource(driver,"Customer Login")) {
			logger.info("user is on login page");
			assertTrue(true);
		}else {
			logger.info("user not in para bank portal");
			assertTrue(false);
		}
	}
	@When("user enter a valid username {string}")
	public void user_enter_a_valid_username(String string) {
		type(pojo.getlog().getUsername(), string);
		logger.info("user entered valid username for login to bank");
		//		webdriverClickWait(driver,pojo.getlog().getPassword());
	}
	@When("user enter a valid password {string}")
	public void user_enter_a_valid_password(String string) {
		type(pojo.getlog().getPassword(), string);
		logger.info("user entered valid password for login to bank");
		//		webdriverClickWait(driver, pojo.getlog().getLogin());
	}
	@When("user finally click on login button")
	public void user_finally_click_on_login_button() {
		btnClick(pojo.getlog().getLogin());
		logger.info("user clicked login button to enter into bank");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@When("verify that user can see the account balance page")
	public void verify_that_user_can_see_the_account_balance_page() {
		if(pageSource(driver,"Accounts Overview")) {
			logger.info("user is on account balance page");
		}else {
			logger.info("user not login to bank");
			captureScreenshot2(driver,"signin failed");
		}
	}

	@Given("user is on customer login page")
	public void user_is_on_customer_login_page() {
		if(pageSource(driver,"Customer Login")) {
			logger.info("user is on login page");
			assertTrue(true);
		}else {
			logger.info("user not in para bank portal");
			assertTrue(false);
		}
	}

	@When("user click on forgot login link")
	public void user_click_on_forgot_login_link() {
		btnClick(pojo.getforg().getForgotloginlink());
		logger.info("user clicked forgot login link");
	}

	@Then("verify that user should see the customer details page")
	public void verify_that_user_should_see_the_customer_details_page() {
		if( webelementDisplayed(pojo.getforg().getValidatedetails())){
			Assert.assertTrue(true);
			logger.info("user is on customer details validate page");
		}else {
			logger.info("user unable to view the customer validate page");
		}
	}

	@Then("user validate giving firstname as {string}")
	public void user_validate_giving_firstname_as(String string) {
		type(pojo.getforg().getFirstname(), string);
		logger.info("user entered the first name");
	}

	@Then("user validate giving lastname as {string}")
	public void user_validate_giving_lastname_as(String string) {
		type(pojo.getforg().getLastname(), string);
		logger.info("user entered the last name");
	}

	@Then("user validate giving address as {string}")
	public void user_validate_giving_address_as(String string) {
		type(pojo.getforg().getAddress(), string);
		logger.info("user entered the address");
	}

	@Then("user validate giving city as {string}")
	public void user_validate_giving_city_as(String string) {
		type(pojo.getforg().getCity(), string);
		logger.info("user entered the city");
	}

	@Then("user validate giving state as {string}")
	public void user_validate_giving_state_as(String string) {
		type(pojo.getforg().getState(), string);
		logger.info("user entered the state");
	}

	@Then("user validate giving pinno as {string}")
	public void user_validate_giving_pinno_as(String string) {
		type(pojo.getforg().getPinno(), string);
		logger.info("user entered the pinno");
	}

	@Then("user validate giving ssnno as {string}")
	public void user_validate_giving_ssnno_as(String string) {
		type(pojo.getforg().getSsnno(), string);
		logger.info("user entered the ssnno");
	}

	@Then("user click on find my login info button")
	public void user_click_on_find_my_login_info_button() {
		btnClick(pojo.getforg().getFindmylogin());
		logger.info("user clicked find my login");
	}

	@Then("verify that user should see the customer login details page {string}")
	public void verify_that_user_should_see_the_customer_login_details_page(String string) {
		if(pageSource(driver, string)) {
			Assert.assertTrue(true);
			logger.info("user can see the customer lookup page");
		}else {
			assertTrue(false);
			logger.info("user unable to fetch the customer details");
			captureScreenshot1(driver,"find my login failed");
		}
	}

	@Then("user retriving the username and password for login to para bank")
	public void user_retriving_the_username_and_password_for_login_to_para_bank() {
		logger.info("retrived data username and password");
	}

	@Given("user should login to para bank with valid credentials uname and pword as {string} & {string}")
	public void user_should_login_to_para_bank_with_valid_credentials_uname_and_pword_as(String string, String string2) {
		type(pojo.getlog().getUsername(),string);
		logger.info("user entered valid username for login to bank");
		type(pojo.getlog().getPassword(),string2);
		logger.info("user entered valid password for login to bank");
		//		webdriverClickWait(driver,pojo.getlog().getLogin());
	}
	@When("user click on register button")
	public void user_click_on_register_button() {
		btnClick(pojo.getlog().getLogin());
		logger.info("user click on login button to enter to bank");
	}
	@Then("verify user should navigate to new account open page")
	public void verify_user_should_navigate_to_new_account_open_page() {
		boolean title=pageSource(driver,"Account Services" );
		if(title==true) {
			logger.info("user is on bank portal and user can see the account open page");
			assertTrue(true);
		}
		else {
			logger.info("user not login to bank");
			assertTrue(false);
			captureScreenshot1(driver,"login failed");
		}
	}
	@Then("user click new account open link")
	public void user_click_new_account_open_link() {
		btnClick(pojo.getacc().getOpennewaccount());
		logger.info("user clicked on new account open link");
	}
	@Then("verfiy that user should see the title of page as {string}")
	public void verfiy_that_user_should_see_the_title_of_page_as(String string) {
		if( pageSource(driver,string)) {
			logger.info("user can see the new account open front page details");
			assertTrue(true);
		}else {
			logger.info("user not in new account open page");
			assertTrue(false);
		}
	}
	@Then("user select the dropdown of account type")
	public void user_select_the_dropdown_of_account_type() {
		visibleText(pojo.getacc().getAccounttype(), "SAVINGS");
		logger.info("user selected the account type");
		webdriverClickWait(driver,pojo.getacc().getBtnclick());
	}
	@Then("user finally click open account button")
	public void user_finally_click_open_account_button() {
		btnClick(pojo.getacc().getBtnclick());
		logger.info("user clicked open new account");
	}
	@Then("user see the successfully account open message")
	public void user_see_the_successfully_account_open_message() {
		if(text(pojo.getacc().getAccountopened(),"Account Opened!")) {
			logger.info("user see the successfully new account opened message");
		}else {
			logger.info("user unable create new account");
		}

	}
}
