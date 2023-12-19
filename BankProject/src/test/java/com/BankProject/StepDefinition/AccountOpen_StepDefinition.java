//package com.BankProject.StepDefinition;
//
//import static org.testng.Assert.assertTrue;
//
//import com.BankProject.BaseClass.BaseClass;
//import com.BankProject.PojoClass.AccountOpen_PojoClass;
//import com.BankProject.PojoClass.Login_PojoClass;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class AccountOpen_StepDefinition extends BaseClass{
//
//	AccountOpen_PojoClass acc=new AccountOpen_PojoClass(driver);
//
//	Login_PojoClass log=new Login_PojoClass(driver);
//
//	@Given("user should login to para bank with valid credentials uname and pword as {string} & {string}")
//	public void user_should_login_to_para_bank_with_valid_credentials_uname_and_pword_as(String string, String string2) {
//		type(log.getUsername(),string);
//		type(log.getPassword(),string2);
//	}
//
//	@When("user click on register button")
//	public void user_click_on_register_button() {
//		btnClick(log.getLogin());
//	}
//
//	@Then("verify user should navigate to new account open page")
//	public void verify_user_should_navigate_to_new_account_open_page() {
//		boolean title=pageSource(driver,"Account Services" );
//		if(title==true) {
//			assertTrue(true);
//		}
//		else {
//			assertTrue(false);
//		}
//	}
//
//	@Then("user click new account open link")
//	public void user_click_new_account_open_link() {
//		btnClick(acc.getOpennewaccount());
//	}
//
//	@Then("verfiy that user should see the title of page as {string}")
//	public void verfiy_that_user_should_see_the_title_of_page_as(String string) {
//		if( pageSource(driver,string)) {
//			assertTrue(true);
//		}else {
//			assertTrue(false);
//		}
//	}
//
//	@Then("user select the dropdown of account type")
//	public void user_select_the_dropdown_of_account_type() {
//		visibleText(acc.getAccounttype(), "SAVINGS");
//	}
//
//	@Then("user finally click open account button")
//	public void user_finally_click_open_account_button() {
//		btnClick(acc.getBtnclick());
//	}
//
//}
